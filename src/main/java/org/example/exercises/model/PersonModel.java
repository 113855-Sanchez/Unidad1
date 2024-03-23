package org.example.exercises.model;

public class PersonModel {
    private String Name;

    private Double Height;

    private Double Salary;
    public void setName(String name){
        this.Name = name;
    }


    public String getName(){
        return this.Name;
    }
    public void setAltura(Double height){
        this.Height = height;
    }
    public Double getAltura(){
        return this.Height;
    }
    public void setSalary(Double salary){
        this.Salary= salary;
    }
    public Double getSalary(){
        return this.Salary;
    }





    public Double calculateSalary(Double hours){
        Double total = (double) 0;
        Double excess = (double) 0;
        if(hours>180){
            excess = hours - 180;
            total = 180 * this.Salary;
            total = total+ excess * (this.Salary*150/100);
        } else{
            total =this.Salary * hours;
        }
        return total;

    }
}
