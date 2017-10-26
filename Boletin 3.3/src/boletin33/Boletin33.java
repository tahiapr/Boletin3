
package boletin33;


public class Boletin33 {


    public static void main(String[] args) {
        // TODO code application logic here
    
        
    Circulo circulo1 = new Circulo();
    circulo1.setRadio(10);
    System.out.println(circulo1.getRadio());
    
    Circulo circulo2 = new Circulo(245);
    System.out.println(circulo2.getRadio());
    
    
    System.out.println(circulo2.calcularArea());
    System.out.println(circulo2.calcularLonxitude());
    }
}
