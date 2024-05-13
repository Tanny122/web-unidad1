/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

public abstract class Empleado {
    public int identificacion;
    public String nombre;
    public String apellido;
    public String  fecha;
    public float sueldo;
    public int porcentaje;
    public int proyectos;

    public Empleado(int id, String nomb, String ape, String fl, float si, int pi, int pr){
        identificacion=id;
        nombre=nomb;
        apellido=ape;
        fecha=fl;
        sueldo=si;
        porcentaje=pi;
        proyectos= pr;
    }
    
    public abstract void mostrardatos();
    public abstract void calcularbonificacion();
}

