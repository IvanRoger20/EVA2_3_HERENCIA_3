/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_herencia_3;

/**
 *
 * @author IvanTron
 */
public class EVA2_3_HERENCIA_3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Animal();
        animal.mover();
        Vertebrado verte = new Vertebrado();
        verte.tenerEsqueleto();
        Mamifero mamifero = new Mamifero();
        mamifero.tenerPelo();
        Primate primate = new Primate();
        primate.agarraObjetos();
        Humano humano = new Humano();
        humano.Pensar();
    }
    
}

class Humano extends Primate {
    public Humano() {
        System.out.println("Humano");
    }
    
    public void Pensar() {
        System.out.println("Pensar");
    }
}

class Primate extends Mamifero {
    public Primate () {
        System.out.println("Primates");
    }
    
    public void agarraObjetos() {
        System.out.println("Sujetar objetos");
    }
}

class Mamifero extends Vertebrado{
    public Mamifero() {
        System.out.println("Mamifero");
    }
    
    public void tenerPelo() {
        
    }
} 

class Vertebrado extends Animal {
    public Vertebrado(){
        super();
        System.out.println("Vertebrado");
    }
    
    public void tenerEsqueleto() {
        System.out.println("Vertebrado: tiene esqueleto");
    }
}

class Animal {
    public Animal() {
        System.out.println("Animal");
    }
    
    public void mover(){
        System.out.println("Animal: movimiento");
    }
}