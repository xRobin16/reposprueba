
package egg_6_1;

import java.util.Scanner;


public class Libro {
    
    //atributos
    String ISBN;
    String titulo;
    String autor;
    String numPag;
    
    //private String datos[];
    
    //constructores

    public Libro() {
    }

    public Libro(String ISBN, String titulo, String autor, String numPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }
    
    
    //metodos

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNumPag() {
        return numPag;
    }

    public void setNumPag(String numPag) {
        this.numPag = numPag;
    }

    //metodos personalizados
    
    public String[] pedirDatos() {
        String[] datos = new String[4];
        
        System.out.println("Introduzca el numero de ISBN: ");
        
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        String id = entradaEscaner.nextLine ();
        
        System.out.println("Introduzca el titulo del libro: ");
        String titu = entradaEscaner.nextLine ();
       
        System.out.println("Introduzca el nombre del autor: ");
        String auto = entradaEscaner.nextLine ();
        
        System.out.println("Introduzca la cantidad de paginas del libro: ");
        String pag = entradaEscaner.nextLine ();
        
        datos[0]= id;
        datos[1]= titu;
        datos[2]= auto;
        datos[3]= pag;
        
        return datos;
    }
    
    public void pedirDatitos(Libro lib) {
        
        System.out.println("Introduzca el numero de ISBN: ");
        
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        String id = entradaEscaner.nextLine ();
        lib.setISBN(id);
        
        System.out.println("Introduzca el titulo del libro: ");
        String titu = entradaEscaner.nextLine ();
        lib.setTitulo(titu);
       
        System.out.println("Introduzca el nombre del autor: ");
        String auto = entradaEscaner.nextLine ();
        lib.setAutor(auto);
        
        System.out.println("Introduzca la cantidad de paginas del libro: ");
        String pag = entradaEscaner.nextLine ();
        lib.setNumPag(pag);
    }
    
    
    
    public void mostrarDatos(String[] datos) {
        System.out.println("Numero de ISBN:" + datos[0] + " Titulo: " + datos[1] + " Autor: " + datos[2] + "Numero de paginas: " + datos[3]);
    }
    
    public void mostrarDatitos(Libro lib) {
        System.out.println("Numero de ISBN:" + lib.getISBN() + " Titulo: " + lib.getTitulo() + " Autor: " + lib.getAutor() + " Numero de paginas: " + lib.getNumPag());
    }
    
}
