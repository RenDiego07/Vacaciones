/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.hilos;

import java.util.List;
import java.util.*;
/**
 *
 * @author diego
 */
public class Rutina {
    private String nombre;
    private ArrayList<Ejercicio> ejercicios;
    
    public Rutina(String nombre, ArrayList<Ejercicio> ejercicios){
        this.nombre = nombre;
        this.ejercicios = ejercicios;
    }
    public String toString(){
        return this.nombre;
    }
    public ArrayList<Ejercicio> getEjercicios() {
        return ejercicios;
    }
    
}
