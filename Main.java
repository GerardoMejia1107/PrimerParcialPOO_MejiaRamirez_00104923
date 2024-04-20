import java.util.Scanner;


import Electronicos.Electronico;
import Electronicos.Laptop;
import Electronicos.Telefono;

import java.util.ArrayList;
//import java.util.InputMismatchException;
import java.util.InputMismatchException;


public class Main {
public static Scanner scan = new Scanner(System.in);
public static ArrayList<Electronico> inventario = new ArrayList<>();
public static int option;
public static String IDElectronicWanted; 

public static Electronico electric;



public static void main(String[] args) {
Menu();
    
}

public static void OptionsForUSer(){
    System.out.println("1. Crear aparato electronico");
    System.out.println("2. Modificar datos aparato electronico");
    System.out.println("3. Consultar articulos de la lista de inventario");
    System.out.println("4. Salir");

}

public static void OptionsCreation(){
    System.out.println("----------Tipo Electronico----------");
    System.out.println("1. Crear Telefono");
    System.out.println("2. Crear Laptop");
    

}



public static void Menu(){
    boolean quit = false;
    

    while (!quit) {
        System.out.println("----------Electronics SV----------");
        OptionsForUSer();
    try {
        option = scan.nextInt();
        scan.nextLine();

      
        switch (option) {
            case 1:
                OptionsCreation();
               try {
                option= scan.nextInt();
                scan.nextLine();

                switch (option) {
                    case 1:
                    
                    Telefono telefono = new Telefono("TELEFONO");
                    
                    System.out.println("----------Creando Telefono---------");
                    System.out.println("Nombre (Marca): ");
                    telefono.setNombre(scan.nextLine());
                    System.out.println("Modelo: ");
                    telefono.setModelo(scan.nextLine());
                    System.out.println("Descripcion: ");
                    telefono.setDescripcion(scan.nextLine());
                    System.out.println("Precio: ");
                    telefono.setPrecio(scan.nextDouble());
                    telefono.setID_electronico(telefono.generateID());

                    inventario.add(telefono);

                    System.out.println("SE AGREGO CORRECTAMENTE");
                    System.out.println("--------------------");
                    System.out.println("");
                        break;

                    case 2:
                    Laptop laptop = new Laptop("LAPTOP");

                    System.out.println("----------Creando Laptop---------");
                     
                    System.out.println("Nombre (Marca): ");
                    laptop.setNombre(scan.nextLine());
                    System.out.println("Modelo: ");
                    laptop.setModelo(scan.nextLine());
                    System.out.println("Descripcion: ");
                    laptop.setDescripcion(scan.nextLine());
                    System.out.println("Precio: ");
                    laptop.setPrecio(scan.nextDouble());
                    laptop.setID_electronico(laptop.generateID());
                    

                    inventario.add(laptop);

                    System.out.println("SE AGREGO CORRECTAMENTE");
                    System.out.println("--------------------");
                    System.out.println("");
                
                    default:
                        break;
                }
               } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("DEBE DE INGRESAR UN ENTERO");
               }
                
       System.out.println("--------------------");         break;

                case 2:
                
                System.out.println("----------Modificando Elemento---------");
                if(!inventario.isEmpty()){
                    System.out.println("Ingrese el codigo del aparato: ");
                    IDElectronicWanted = scan.nextLine();
                    electric = Electronico.buscarELectronico(inventario, IDElectronicWanted);
                    if(electric!= null){
                        System.out.println("Nuevo precio: ");
                        electric.setPrecio(scan.nextDouble());
                        System.out.println("SE MODIFICO CORRECTAMENTE");
                    }
                    

                    
                }

                break;

                case 3:
                System.out.println("----------Mostrar Inventario---------");
                for(Electronico electric : inventario){
                    electric.mostrarInformacionArticulo();
                             
                System.out.println("--------------------");   
                System.out.println("");
                }

                break;

                case 4:
                quit = true;
                break;
        
            default:
            System.out.println("La opcion " + option + " no esta registrada en el menu \n Intentelo de nuevo");
                break;
        }
    } catch (InputMismatchException e) {
        scan.nextLine();
        System.out.println("DEBE DE DIGITAR UN ENTERO");
    }
      
    }
    
}


    
}