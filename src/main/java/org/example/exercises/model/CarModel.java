package org.example.exercises.model;

import java.util.Calendar;

public class CarModel {
    private String Marca;

    private Integer Modelo;

    public String getMarca(){
        return this.Marca;
    }
    public void setMarca(String marca){
        this.Marca = marca;

    }
    public Integer getModelo(){
        return this.Modelo;
    }
    public void setModelo(Integer modelo){
        this.Modelo= modelo;
    }


    public String uso (){
        Calendar calendar = Calendar.getInstance();
        Integer year = calendar.get(Calendar.YEAR);
        if (year-this.Modelo >20){
            return "MUY ANTIGUO";
        } else if (year - this.Modelo>10) {
            return "MUCHO USO";
        } else if(year - this.Modelo>5){
            return "POCO USO";
        } else{
            return "NUEVO";
        }
    }

    public Integer antiguedad (){
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR) - this.Modelo;
    }
}
