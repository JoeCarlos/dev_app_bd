/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemafaculdade;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SistemaFaculdade {

    private static final String INSTANCE = "sistemaFaculdade";
    private static final String URL = "jdbc:mysql://localhost:3306/" + INSTANCE;
    private static final String USER = "root";
    private static final String PASSWORD = "Relatorio42";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static Connection con = null;
    
 public static Connection getConexao() {
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Classe JDBC para conexão com o Banco de Dados não encontrado: \n" + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados: \n" + ex.getMessage());
        }
        return con;
    }
 
 public static void insert(Aluno a) {
        con = getConexao();
        String query = "INSERT INTO aluno(matricula, nome, dataNascimento, telefone, email, cod_curso) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, a.getMatricula());
            ps.setString(2, a.getNome());
            ps.setDate(3, (Date) a.getDataNascimento());
            ps.setString(4, a.getTelefone());
            ps.setString(5, a.getEmail());
            ps.setInt(6, a.getCod_curso());
            if (ps.executeUpdate() == 1) {
                ResultSet rs = ps.getGeneratedKeys();
                rs.first();
                JOptionPane.showMessageDialog(null, a.getNome() + " inserido com sucesso!\n"
                        + "Matricula aluno: " + rs.getInt(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir o Aluno: \n" + ex.getMessage());
        }
    }
 public static List<Aluno> getAllAlunos() {
        List<Aluno> alunos = new ArrayList<>();
        con = getConexao();
        String query = "SELECT * FROM aluno";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                alunos.add(new Aluno(rs.getString("matricula"), rs.getString("nome"),
                        rs.getString("telefone"), rs.getDate("dataNascimento"), rs.getString("email"),
                        rs.getInt("cod_curso")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar os alunos: \n" + ex.getMessage());
        }

        return alunos;
    }
 
 
         public static List<Curso> getAllCursos() {
        List<Curso> cursos = new ArrayList<>();
        con = getConexao();
        String query = "SELECT * FROM curso";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                cursos.add(new Curso(rs.getInt("cod_curso") , rs.getString("nome")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar os cursos: \n" + ex.getMessage());
        }

        return cursos;
    }
 
        public static List<Disciplina> getAllDisciplinas() {
        List<Disciplina> disciplinas = new ArrayList<>();
        con = getConexao();
        String query = "SELECT * FROM disciplina";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                disciplinas.add(new Disciplina(rs.getInt("cod_disciplina") , rs.getString("nome")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar os disciplinas: \n" + ex.getMessage());
        }

        return disciplinas;
    }
        public static List<Curso_disciplina> getAllCurso_disciplinas() {
        List<Curso_disciplina> curso_disciplinas = new ArrayList<>();
        con = getConexao();
        String query = "SELECT * FROM curso_disciplina";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                curso_disciplinas.add(new Curso_disciplina(rs.getInt("cod_curso") , rs.getInt("cod_disciplina")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar os curso e disciplinas: \n" + ex.getMessage());
        }

        return curso_disciplinas;
    }
  
          public static List<Aluno_disciplina> getAllAluno_disciplina() {
        List<Aluno_disciplina> aluno_disciplinas = new ArrayList<>();
        con = getConexao();
        String query = "SELECT * FROM aluno_disciplina";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                aluno_disciplinas.add(new Aluno_disciplina(rs.getString("matricula") , rs.getInt("cod_disciplina")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar os alunos e disciplinas: \n" + ex.getMessage());
        }

        return aluno_disciplinas;
    }
     
          
        public static void main(String a[]) {

            System.out.println("**************************Lista de Alunos**************************\n");
        getAllAlunos().forEach(aluno -> {
            System.out.println(aluno + "-----------------------------------");
        });
       
        
        System.out.println("\n\n**************************Lista de Cursos**************************");
         getAllCursos().forEach(curso -> {
            System.out.println(curso + "-----------------------------------");
        });
         
         
         System.out.println("\n\n**************************Lista de Cursos**************************");
  getAllDisciplinas().forEach(disciplina -> {
            System.out.println(disciplina + "-----------------------------------");
         });
    
  
           System.out.println("\n\n**************************Lista de Cursos e disciplinas**************************");
  getAllCurso_disciplinas().forEach(curso_disciplinas -> {
            System.out.println(curso_disciplinas + "-----------------------------------");
        });

             System.out.println("\n\n**************************Lista de Alunos e Disciplinas**************************");
     getAllAluno_disciplina().forEach(aluno_disciplinas -> {
            System.out.println(aluno_disciplinas + "-----------------------------------");
        });
    }
        
}