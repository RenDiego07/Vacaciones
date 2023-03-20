/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.hilos;

import java.util.List;
import java.util.Objects;
import java.util.*;
/**
 *
 * @author diego
 */
public class Ejercicio implements Comparable<Ejercicio>{
    private String nombre;
    private int repeticiones;
    private ArrayList<String> imagenes;
    
    public Ejercicio(String nombre, int repeticiones, ArrayList<String> imagenes){
        this.nombre = nombre;
        this.repeticiones = repeticiones;
        this.imagenes = imagenes;
    }

    public String getNombre() {
        return nombre;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public ArrayList<String> getImagenes() {
        return imagenes;
    }
    //ordenamiento por nombre, si son iguales por repeticiones
    @Override
    public int compareTo(Ejercicio o) {
        int c = nombre.compareToIgnoreCase(o.nombre);
        if (c==0){
            c = repeticiones - o.repeticiones;
        }
        return c;
    }

    @Override
    public String toString() {
        return "Ejercicio{" + "nombre=" + nombre + ", repeticiones=" + repeticiones + ", imagenes=" + imagenes + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.nombre);
        return hash;
    }
    //dos ejercicios son iguales si tienen el mismo nombre
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ejercicio other = (Ejercicio) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    public static ArrayList<Ejercicio> generarEjercicio(){
        ArrayList<Ejercicio> lEjercicios = new ArrayList<>();
        ArrayList<String> im1= new ArrayList<>();
        im1.add("crisscross1.png");
        im1.add("crisscross2.png");
        lEjercicios.add(new Ejercicio("crisscross",10,im1));
        ArrayList<String> im2= new ArrayList<>();
        im2.add("rollouts1.png");
        im2.add("rollouts2.png");
        lEjercicios.add(new Ejercicio("rollouts",15,im2));
        ArrayList<String> im3= new ArrayList<>();
        im3.add("paseeTwist1.png");
        im3.add("paseeTwist2.png");
        lEjercicios.add(new Ejercicio("paseeTwist",10,im3));
        return lEjercicios;
        
    }


    
}
