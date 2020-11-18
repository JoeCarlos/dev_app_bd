/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemafaculdade;

/**
 *
 * @author joseo
 */
public class Aluno_disciplina {

    private String matricula;
    private Integer cod_disciplina;
    
     public Aluno_disciplina() {
     }
    
    public Aluno_disciplina(String matricula, Integer cod_disciplina) {
        this.matricula = matricula;
        this.cod_disciplina = cod_disciplina;
    }
    
          public String getMatricula(){
        return matricula;
    }
     
     public void setMatricula(Integer cod_curso){
        this.matricula = matricula;
    }
    
    
         public Integer getCod_disciplina(){
        return cod_disciplina;
    }
     
     public void setCod_disciplina(Integer cod_disciplina){
        this.cod_disciplina = cod_disciplina;
    }
     
             @Override
    public String toString() {
        return  "Matricula do aluno: " + matricula + "\n"
                + "Codigo da Disciplina: " + cod_disciplina + "\n\n";
    }
    
}
