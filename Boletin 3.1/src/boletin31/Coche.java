/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin31;

/**
 *
 * @author tperezrodriguez
 */
public class Coche {
private int velocidade ;

public Coche(){
velocidade =0 ; 
}

public int getVelocidade() {
return velocidade;   
}

public void acelerar (int valor) {
velocidade = velocidade + valor;
}
public void frenar (int menos){
velocidade = velocidade - menos;   
}


        
}

