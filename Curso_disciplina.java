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
public class Curso_disciplina {
    
        private Integer cod_disciplina;
        private Integer cod_curso;
    
    
    public Curso_disciplina(Integer cod_curso, Integer cod_disciplina) {
         this.cod_curso = cod_curso;
         this.cod_disciplina = cod_disciplina;
    }
         public Integer getCod_curso(){
        return cod_curso;
    }
     
     public void setCod_curso(Integer cod_curso){
        this.cod_curso = cod_curso;
    }
    
    
         public Integer getCod_disciplina(){
        return cod_disciplina;
    }
     
     public void setCod_disciplina(Integer cod_disciplina){
        this.cod_disciplina = cod_disciplina;
    }
     
             @Override
    public String toString() {
        return  "Codigo do Curso: " + cod_curso + "\n"
                + "Codigo da Disciplina: " + cod_disciplina + "\n\n";
    }
    
}
