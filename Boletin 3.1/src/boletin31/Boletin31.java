
package boletin31;


public class Boletin31 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
    Coche coche1 = new Coche();
    
    System.out.println(coche1.getVelocidade());
    
    coche1.acelerar(100);
    System.out.println(coche1.getVelocidade());
     
    coche1.frenar(50);
    System.out.println(coche1.getVelocidade());
    
    }
    
   
    
}
