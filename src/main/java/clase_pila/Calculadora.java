/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_pila;

import java.util.Stack;

/**
 *
 * @author SO-LAB1-PC12
 */
public class Calculadora {
 

    public Calculadora() {
        
    }

    
    

 public void rehacer(Integer suma){
        pilarehacer.push(contenido);
        contenido += suma;
        pilaresultado.clear();
        System.out.println("Contenido actual: " + contenido);
    }

  public void suma(){
  
  }
    
}




    public EditorTexto() {
        this.pilaDeshacer = new Stack<>();
        this.pilaRehacer = new Stack<>();
        this.contenido = "";
    }
    
    public void escribir(String texto){
        pilaDeshacer.push(contenido);
        contenido += texto;
        pilaRehacer.clear();
        System.out.println("Contenido actual: " + contenido);
    }
    
    public void deshacer(){
        if (!pilaDeshacer.isEmpty()){
            pilaRehacer.push(contenido);
            contenido = pilaDeshacer.pop();
            System.out.println("Deshacer: " + contenido);
        } else {
            System.out.println("No hay acciones para deshacer");
        }
    }
    
    
    }