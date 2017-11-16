
package jueves_16_11;

public class Circulo extends Figura {

    
    public Circulo(float radio){
        this.setRadio(radio);
    }

    
    @Override
    public void CalcularPerimetro() {
     double pi=3.14;
     double perimetro =pi*getRadio()*2;
        System.out.println("el perimetro de tu circulo es "+perimetro);
     
    }

    @Override
    public void CalcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

 
    }

   

    
    

