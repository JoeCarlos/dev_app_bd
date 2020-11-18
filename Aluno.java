/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemafaculdade;

import java.util.Date;

/**
 *
 * @author joseo
 */
public class Aluno {

    private String matricula;
    private String nome;
    private String telefone;
    private Date dataNascimento;
    private String email;
    private Integer cod_curso;
    
    public Aluno() {
        
    }
    
    public Aluno (String matricula,String nome,String telefone, Date dataNascimento, String email, Integer cod_curso){
       this.matricula = matricula;
       this.nome = nome;
       this.telefone = telefone;
       this.dataNascimento = dataNascimento;
       this.email = email;
       this.cod_curso = cod_curso;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
        public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
        public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
        
    public Date getDataNascimento(){
        return dataNascimento;
    }
    
    public void setDataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    
        public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
        public Integer getCod_curso(){
        return cod_curso;
    }
    
      public void setCod_curso(Integer cod_curso){
        this.cod_curso = cod_curso;
    }
    @Override
    public String toString() {
        return "Matricula: " + matricula + "\n"
                + "Nome: " + nome + "\n"
                + "Telefone: " + telefone + " - dataNascimento: " + dataNascimento + "\n"
                + "Email: " + email + "\n"
                + "Codigo do Curso: " + cod_curso + "\n\n";
    }

    
}

