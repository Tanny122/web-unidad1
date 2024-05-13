/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

public class SueldoServicio extends Empleado {
     public SueldoServicio(int ide, String nomb, String ape, String fl, float si, int pi, int pr){
        super(ide, nomb, ape, fl, si, pi, pr);
    }

     @Override
    public void mostrardatos() {
       System.out.println("Su numero de identificacion es: " + super.identificacion);
       System.out.println("Su nombre es: " + super.nombre);
       System.out.println("Su apellido es: " + super.apellido);
       System.out.println("Su fecha de ingreso es: " + super.fecha);
       System.out.println("Su sueldo es: " + super.sueldo);
       System.out.println("Su porcentaje de cumplimiento es: " + super.porcentaje);
       System.out.println("Su numero de proyectos asignados es : " + super.proyectos);
       
    }

     @Override
    public void calcularbonificacion() {
        if (super.porcentaje > 90){
            float total =  (float) (super.sueldo*0.02)*(super.proyectos);
            total=total +super.sueldo;
            System.out.println("Su sueldo total es: " + total);
        }else{
            System.out.println("Su sueldo total es: " + super.sueldo + " Ya que no cumplio la meta de cumplimiento");
        }
    }
}
