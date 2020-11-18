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
public class Curso {
    private Integer cod_curso;
     private String nome;
     
     public Curso(){
         
     }
     
     public Curso (Integer cod_curso, String nome){
         this.cod_curso = cod_curso;
         this.nome = nome;
     }
     
     public Integer getCod_curso(){
        return cod_curso;
    }
     
     public void setCod_curso(Integer cod_curso){
        this.cod_curso = cod_curso;
    }
     
     public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
        @Override
    public String toString() {
        return  "Codigo do Curso: " + cod_curso + "\n"
                + "Nome: " + nome + "\n\n";
    }
}
