
package boletin33;

/**
 *
 * @author tperezrodriguez
 */
public class Circulo {

private double radio; 
private final double pi = 3.14;

public Circulo (){
}

public Circulo (double radio){
this.radio = radio;
}

public void setRadio (double radio){
this.radio = radio;   
}

public double getRadio (){
return radio;
}

public double getPi (double pi){
return pi;
}

public double calcularArea (){
return Math.pow(radio, 2)*pi; //esto es una operación matemática para hacer radio al cuadrado por pi
}

public double calcularLonxitude (){
return 2*pi*radio;   
}


}
