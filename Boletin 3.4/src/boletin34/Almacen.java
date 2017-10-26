
package boletin34;


public class Almacen {

private int cantidadPulpo;
private int cantidadPatatas;
private int clientes;
    
public Almacen (){  
}

public Almacen (int cPulpo, int cPatatas){
cantidadPulpo = cPulpo;
cantidadPatatas = cPatatas;
}

public void setcantidadPulpo (int cantidad){
cantidadPulpo= cantidad;   
}
   
public int getcantidadPulpo (){
return cantidadPulpo;
}

public void setcantidadPatatas (int cantidad){
cantidadPatatas = cantidad;    
}

public int getcantidadPatatas () {
return cantidadPatatas;    
}

 public void engadirPolbo(int nuevaCantidad){ // Engade x kg de polbo a os xa existentes
cantidadPulpo= cantidadPulpo + nuevaCantidad;
// formula reducida de lo de arriba cantidadPulpo +=nuevaCantidad;
 }
         
public void engadirPatacas ( int nuevaCantidad){  //Engade x kg de patacas  ''       ''   
cantidadPatatas += nuevaCantidad;
}
        
public void amosarPolbo( ) { //Amosa por pantalla os kg de polbo que ten no almacen
System.out.println("En el almacén hay "+cantidadPulpo+" kg de pulpo.");        
}
public void amosarPatacas ( ){ //  ''        ''       ''              ''   ''    patacas   ''     ''       ''                  
System.out.println("En el almacén hay "+cantidadPatatas+" kg de patatas.");
}

public int calcularPersonas (){ //Tendo en conta que por cada 3 persoas , o restaurante utiliza 2 kg de polbo e 1 de patacas. 
    return 0;
    
}

}
