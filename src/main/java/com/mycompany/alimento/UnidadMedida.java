/*as
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alimento;

/**
 *
 * @author th3tici
 */
public class UnidadMedida {
    
    private int codigoU; 
    private int gramos; 
    private float litros; 
    private float centimetros; 
    private float tazas; 
    private float kilos; 

    public UnidadMedida() {
        this.codigoU = 0;
        this.gramos = 0;
        this.litros = 0;
        this.centimetros = 0;
        this.tazas = 0;
        this.kilos = 0;
    }

    public UnidadMedida(int codigoU, int gramos, float litros, float centimetros, float tazas, float kilos) {
        this.codigoU = codigoU;
        this.gramos = gramos;
        this.litros = litros;
        this.centimetros = centimetros;
        this.tazas = tazas;
        this.kilos = kilos;
    }

    public int getCodigoU() {
        return codigoU;
    }

    public void setCodigoU(int codigoU) {
        this.codigoU = codigoU;
    }

    public int getGramos() {
        return gramos;
    }

    public void setGramos(int gramos) {
        this.gramos = gramos;
    }

    public float getLitros() {
        return litros;
    }

    public void setLitros(float litros) {
        this.litros = litros;
    }

    public float getCentimetros() {
        return centimetros;
    }

    public void setCentimetros(float centimetros) {
        this.centimetros = centimetros;
    }

    public float getTazas() {
        return tazas;
    }

    public void setTazas(float tazas) {
        this.tazas = tazas;
    }

    public float getKilos() {
        return kilos;
    }

    public void setKilos(float kilos) {
        this.kilos = kilos;
    }
    
    public String toString(){
        return "Codigo: " + this.codigoU + 
               "\nGramos: " + this.gramos + 
               "\nLitros: " + this.litros + 
               "\nCentrimetros: " + this.centimetros + 
               "\nTazas: " + this.tazas + 
               "\nKilos: " + this.kilos; 
    }
}
