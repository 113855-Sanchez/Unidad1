package org.example.exercises;

import org.example.exercises.model.CarModel;
import org.example.exercises.model.PersonModel;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciseClassOne {
    Scanner scanner = new Scanner(System.in);

    public void exerciseOne(){
        Integer value1;
        while (true){
            if(scanner.hasNextInt()){
                value1 = scanner.nextInt();
                break;
            } else{
                System.out.println("Debe ingresar un numero entero");
                scanner.next();

            }
        }

        Integer value2;
        while (true){
            if(scanner.hasNextInt()){
                value2 = scanner.nextInt();
                break;
            } else{
                System.out.println("Debe ingresar un numero entero");
                scanner.next();
            }
        }
        try{
        Integer suma = value1 + value2 ;
        Integer diferencia =  value1 - value2;
        Float cociente = Float.parseFloat(value1.toString())/Float.parseFloat(value2.toString());
        Integer producto =value1 * value2;
        System.out.println("Respuesta: suma: " + suma + " diferencia: " + diferencia + " cociente: " + cociente + " producto: " + producto);


    }
    catch(Exception e) {
        System.out.println(e.toString());
        }


    }


    public void exerciseTwo(){
        Double price = validDouble();

        try{
            Double priceWithIVA = price *1.21;
            System.out.println("El precion con IVA es: "+ priceWithIVA);
        }catch (Exception e) {
            System.out.println(e.toString());

        }
    }

    public void exerciseThree(){
       List<Double> listaTotalPrice= new ArrayList<>();
        Integer count=1;
        
        while (count<4){
            String name;
            Integer cant;
            Double price;
            //name
            System.out.println("Ingrese el nombre del producto" + count);
            name = scanner.next();
            System.out.println("Ingrese el precio");
            price = validDouble();
            System.out.println("Ingrese la cantidad");
            cant=validInt();
            listaTotalPrice.add(price*cant);
            count++;
        }
        Double response= (double) 0;
        for(Double value:listaTotalPrice){
            response = response+value;
        }

        System.out.println("El valor total de la factura es: " + response);
    }

    public void exerciseFour (){
        PersonModel person = new PersonModel();
        PersonModel person2= new PersonModel();

        System.out.println("Ingrese el nombre de la primer persona");
        person.setName(scanner.next());
        System.out.println("Ingrese la altura de "+person.getName());
        person.setAltura(validDouble());

        System.out.println("Ingrese el nombre de la segunda persona");
        person2.setName(scanner.next());
        System.out.println("Ingrese la altura de "+person2.getName());
        person2.setAltura(validDouble());

        if(person2.getAltura()>person.getAltura()) {
            System.out.println(person2.getName() + " es mas alto que " +person.getName() );
        } else if(person.getAltura()>person2.getAltura()){
            System.out.println(person.getName() + " es mas alto que " +person2.getName() );
        } else{
            System.out.println(person.getName() + " y " +person2.getName() + " miden lo mismo" );

        }

    }

    public void exerciseFive(){
        PersonModel person = new PersonModel();
        System.out.println("Ingrese el nombre de la primer persona");
        person.setName(scanner.next());
        System.out.println("Ingrese el salario de  "+person.getName());
        person.setSalary(validDouble());

        System.out.println("ingrese la cantidad de  horas trabajdas de  "+person.getName());

        System.out.println("El empleado " + person.getName() + " este mes tiene un sueldo de " + person.calculateSalary(validDouble()));

    }

    public void exerciseSix(){
        Integer year = validInt();
        Double rest4 =(double) year % 4;
        Double rest400 =(double) year %400;
        Double rest100 = (double) year%100;
        if(rest4==(0)){
            if (rest100 == 0 && rest400 != 0 ){
                System.out.println("Este año no es viciesto");
            } else{
                System.out.println("Este año es viciesto");

            }
        } else{
            System.out.println("Este año no es viciesto");
        }
    }

    public void exerciseSeven(){
        System.out.println("Ingrese cantidad de km");
        Double cost =300.0;
        Integer km = validInt();
        Integer excess = 0;
        if(km<201){
            System.out.println("se le debe cobrar " + cost);
        } else if(km>200 &&km<1001){
            excess = km-200;
            cost = cost + excess *5;
            System.out.println("se le debe cobrar " + cost);

        } else{
            excess = km-200;
            cost = cost + excess *10;
            System.out.println("se le debe cobrar " + cost);
        }
    }

    public void exerciseEight(){
        List<Double> list = new ArrayList<>();
        while (list.size()<11){
            System.out.println("Ingrese un numero, orden: "+list.size());
        list.add(validDouble());
        }
        Double total = (double) 0;
        for(Double value:list){
            total = total+value;
        }
        total = total/list.size();
        System.out.println("El promedio es de " + total);
    }

    public void exerciseNine(){
        Integer cant = 0;
        Integer count = 0;
        System.out.println("Ingrese la cantidad de numeros que quiera ingresar");
        cant = validInt();

        for (int i = 0; i < cant; i++){
            System.out.println("vuelta numero: " + i+1);
            Integer value = validInt();
            if (value>5){
                count ++;
            }
        }
        System.out.println("La cantidad de numeros mayores a 5 es " + count);
    }

    public void exerciseTen(){
        while (true){
            System.out.println("ingrese un numero");
            Integer number= validInt();
            if(number>0){
                break;
            }
        }
    }
    public void exerciseEleven(){
        Double Winner = (double) 0;
        Integer count=1;
        System.out.println("Ingrese el tiempo del ganador");
        Winner = validDouble();

        for (int i = 0; i<9;i++){
            System.out.println("Ingrese el tiempo del proximo corredor");
            Double runner = (double) 0;
            while (true){
                 runner = validDouble();
                if(runner> Winner){
                    if (runner>Winner*1.15){
                       break;
                    }
                    count++;
                    break;
                }
                System.out.println("El tiempo no puede ser menor al del ganador.");
            }
        }
        System.out.println("Corren la final " +  count  + " corredores");

    }

    public void exerciseTwelve(){
        List<CarModel> listCar = new ArrayList<>();
        while (true){
            CarModel car = new CarModel();
            System.out.println("Ingrese un auto");
            car.setMarca(scanner.next());
            System.out.println("Ingrese el modelo");
            car.setModelo(validInt());
            listCar.add(car);
            System.out.println("Si desea terminar ingrese 0, de lo contrario ingrese 1");
            if(scanner.nextInt()==0){
                break;
            }
        }
        Integer countTotal=0;
        Integer countPocoUso=0;
        Integer countNuevos = 1;
        Integer totalAntiguedad=0;
    for(CarModel car:listCar){
        System.out.println("El Auto " + car.getMarca() + ": " + car.uso());
        if(car.uso().equals("POCO USO") ){
            countPocoUso++;
        }
        if (car.uso().equals("NUEVO")){
            totalAntiguedad = totalAntiguedad +car.antiguedad();
            countNuevos++;
        }
        countTotal++;
    }
    System.out.println("La cantidad total de autos es: " + countTotal);
    System.out.println("La cantidad total de autos con POCO USO es: " + countPocoUso);
    System.out.println("El promedio de antiguedad de autos nuevos es de: " + totalAntiguedad/countNuevos );
    }



    //private method

    private Double validDouble(){
        Double value;
        while (true){
            if(scanner.hasNextDouble()){
                Double dubleTest = scanner.nextDouble();
                if(dubleTest>0){
                    value = dubleTest;
                    break;
                }
                else {
                    System.out.println("El numero debe ser mayor a 0");
                    scanner.next();
                }
            }else{
                System.out.println("Debe ingresar un numero");
                scanner.next();
            }
        }
        return value;
    }




    private Integer validInt(){
        Integer value=0;
        while (true){
            if(scanner.hasNextInt()){
                Integer valueTest = scanner.nextInt();
                if(valueTest>0){
                    value = valueTest;
                    break;
                }
                else {
                    System.out.println("El numero debe ser mayor a 0");
                    scanner.next();
                }
            }else{
                System.out.println("Debe ingresar un numero");
                scanner.next();
            }
        }

        return value;
    }

}
