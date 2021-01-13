package com.ironhack.main;

import com.ironhack.classes.Employee;
import com.ironhack.classes.Intern;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        // tester para las clases y subclases
        Employee employee1 = new Employee("Pedro", 26, 34000);
        employee1.Description();
        Intern intern1 = new Intern("Juan", 33, 1800);
        System.out.println(intern1.Description());
        intern1.setSalary(3000);
        System.out.println(intern1.Description());
        intern1.setSalary(30000);
        System.out.println(intern1.Description());

        // para escribir en un nuevo archivo
        FileWriter writer = new FileWriter("employees.txt", true);

        // lista de nombres, edades y salarios
        String[] namesList = {"Ana", "Javier", "Marta", "Fran", "Pedro", "Manuel", "Álvaro", "Sara", "Mercedes", "Iván"};
        int[] agesList = {34,52,23,56,19,44,28,38,60,42};
        int[] salaryList = {18000,14000,35000,10000,22000,30000,12000,31000,27000,40000};

        // bucle para generar los objetos aleatorios y escribirlos en el archivo. Cinco de cada.
        for (int i=0; i<5; i++) {
            Employee employee = new Employee(getRandomString(namesList), getRandomInt(agesList), getRandomInt(salaryList));
            String info=employee.Description();
            writer.write(info + "\n");
        }
        for (int i=0; i<5; i++) {
            Intern intern = new Intern(getRandomString(namesList), getRandomInt(agesList), getRandomInt(salaryList));
            String info=intern.Description();
            writer.write(info + "\n");
        }


        writer.close();
    }

    // metodo para escoger un elemento aleatorio de un array de int
    public static int getRandomInt(int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    // metodo para escoger un elemento aleatorio de un array de String
    public static String getRandomString(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

}
