package Electronicos;
import java.util.ArrayList;
import java.util.Random;

import Electronicos.Interfaces.Showable;

public abstract class Electronico implements Showable{
    private String nombre;
    private String descripcion;
    private String modelo;
    private double precio;
    private String ID_electronico;






    public Electronico(){};






    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public String getID_electronico() {
        return ID_electronico;
    }


    public void setID_electronico(String iD_electronico) {
        ID_electronico = iD_electronico;
    }


    public int indexRandom(int length){
        Random random = new Random();
        int index = random.nextInt(length);

        return index;
    }

    public static Electronico buscarELectronico(ArrayList<Electronico> electronicos, String code){
       
            for(Electronico electronico: electronicos){
                if(code.equals(electronico.getID_electronico())){
                    return electronico;
                }
            }
        

        return null;
    }

      //Interface inizialitaion methods
      public double obtenerPrecio(){
        return this.getPrecio();
    }

    public void mostrarInformacionArticulo(){
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("ID: " + this.getID_electronico());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Descripcion: " + this.getDescripcion());
        System.out.println("Precio: " + this.obtenerPrecio());
    }

}
