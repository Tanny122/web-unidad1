/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.util.Scanner;

public class Polimorfismo {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Por favor Ingrese los datos del empleado:");
      System.out.println("Ingrese la cedula:");
      int cedula = sc.nextInt();
      System.out.println("Ingrese el nombre:");
      String nombre = sc.next();
      System.out.println("Ingrese el apellido:");
      String apellido = sc.next();
      System.out.println("ingrese la fecha de ingreso:");
      String fecha = sc.next();
      System.out.println("Ingrese el sueldo basico:");
      float sueldo = sc.nextFloat();
      System.out.println("Ingrese el porcentaje de cumplimiento:");
      int porcentaje = sc.nextInt();
      System.out.println("Ingrese el numero de proyectos que tiene a cargo:");
      int proyectos = sc.nextInt();
      System.out.println("Para calcular el bono y el sueldo total, seleccione una opcion:");
      System.out.println("1 - El empleado tiene un contrato indefinido:");
      System.out.println("2 - El empleado tiene un contrato fijo:");
      System.out.println("3 - El empleado tiene un contrato por prestacion de servicios:");
      Empleado empleado;
      int r = sc.nextInt();
      switch(r){
                    case 1:
              empleado = new SueldoIndefinido(cedula, nombre, apellido , fecha, sueldo, porcentaje, proyectos);
              empleado.mostrardatos();
              empleado.calcularbonificacion();
              break;
          case 2:
              empleado = new SueldoFijo(cedula, nombre, apellido , fecha, sueldo , porcentaje, proyectos);
              empleado.mostrardatos();
              empleado.calcularbonificacion();
          case 3:
              empleado = new SueldoServicio(cedula, nombre, apellido , fecha, sueldo , porcentaje, proyectos);
              empleado.mostrardatos();
              empleado.calcularbonificacion();
          default:
              System.out.println("Saliendo del sistema");
           
      }
      
      
    }
    
}







      
                   

      
          
                    

    
