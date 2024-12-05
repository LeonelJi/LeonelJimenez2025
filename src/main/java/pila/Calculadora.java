/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

import java.util.Stack;

/**
 *
 * @author SO-LAB1-PC12
 */
public class Calculadora {
private Stack<String> pilarehacer;
private Stack<String> pilaresultado;
private String contenido;
public int dato1;
public int dato2;
public int suma;

    public Calculadora(int dato1, int dato2, int suma) {
        this.dato1 = dato1;
        this.dato2 = dato2;
        this.suma = suma;
    }

    public int getDato1() {
        return dato1;
    }

    public void setDato1(int dato1) {
        this.dato1 = dato1;
    }

    public int getDato2() {
        return dato2;
    }

    public void setDato2(int dato2) {
        this.dato2 = dato2;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }



    public Calculadora() {
        this.pilarehacer = new Stack<>();
        this.pilaresultado = new Stack<>();
        this.contenido = "";
    }
     public void te(String dato){
        pilarehacer.push(contenido);
        contenido += dato;
        pilaresultado.clear();
        System.out.println("Contenido actual: " + contenido);
    }

public void mostrar(){
    System.out.println(suma=dato1+dato2);
}


  public void pilaresultado(){
        if (!pilaresultado.isEmpty()){
            pilarehacer.push(contenido);
            contenido = pilaresultado.pop();
            System.out.println("Deshacer: " + contenido);
        } else {
            System.out.println("No hay acciones para deshacer");
        }
    }
    
   public void rehacer(){
        if (!pilarehacer.isEmpty()){
            pilaresultado.push(contenido);
            contenido = pilarehacer.pop();
            System.out.println("Rehacer: " + contenido);
        } else {
            System.out.println("No hay acciones para rehacer");
        }


   }
}
