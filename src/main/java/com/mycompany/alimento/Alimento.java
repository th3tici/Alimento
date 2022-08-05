/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.alimento;

/**
 *
 * @author th3tici
 */
public class Alimento {

    private int codigo;
    private String nombre;
    private int cantCalorias; 
    private UnidadMedida unidadMedida; 
    private float cantMedida; 

    public Alimento() {
        this.codigo = 0;
        this.nombre = "";
        this.cantCalorias = 0;
        this.unidadMedida = new UnidadMedida();
        this.cantMedida = 0;
    }

    public Alimento(int codigo, String nombre, int cantCalorias, String unidadMedida, float cantMedida, int codigoU, int gramos, float litros, float centrimetros, float tazas, float kilos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantCalorias = cantCalorias;
        this.unidadMedida = new UnidadMedida(codigoU, gramos, litros, centrimetros, tazas, kilos);
        this.cantMedida = cantMedida;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantCalorias() {
        return cantCalorias;
    }

    public void setCantCalorias(int cantCalorias) {
        this.cantCalorias = cantCalorias;
    }

    public float getUnidadMedida() {
        return unidadMedida.getCentimetros();
    }

    public void setUnidadMedida(float unidadMedida) {
        this.unidadMedida.setCentimetros(unidadMedida);
    }

    public float getCantMedida() {
        return cantMedida;
    }

    public void setCantMedida(float cantMedida) {
        this.cantMedida = cantMedida;
    }
    
    public String toString(){
        return "Codigo: " + this.codigo + 
               "\nNombre: " + this.nombre + 
               "\nCantidad de Calorias: " + this.cantCalorias + 
               "\nUnidad de Medida: " + this.unidadMedida + 
               "\nCantidad Medida: " + this.cantMedida;
    }
}