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
public class Disciplina {
    private Integer cod_disciplina;
     private String nome;
     
     public Disciplina(){
         
     }
     
     public Disciplina (Integer cod_disciplina, String nome){
         this.cod_disciplina = cod_disciplina;
         this.nome = nome;
     }
     
     public Integer getCod_disciplina(){
        return cod_disciplina;
    }
     
     public void setCod_disciplina(Integer cod_disciplina){
        this.cod_disciplina = cod_disciplina;
    }
     
     public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
        @Override
    public String toString() {
        return  "Codigo da Disciplina: " + cod_disciplina + "\n"
                + "Nome: " + nome + "\n\n";
    }
}
