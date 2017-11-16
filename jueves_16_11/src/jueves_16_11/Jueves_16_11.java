
package jueves_16_11;

import java.util.ArrayList;

public class Jueves_16_11 {

    
   public static void main(String[] args) {
   
  Circulo forma1 = new Circulo(12);
  forma1.CalcularPerimetro();
  Rectangulo forma2 = new Rectangulo(5,12);
  forma2.CalcularPerimetro();
  Triangulo forma3 = new Triangulo(2,5,3);
  forma3.CalcularPerimetro();
  ArrayList lista =new ArrayList();
  lista.add(forma1);
  lista.add(forma2);
  lista.add(forma3);
  for(Object i : lista){
      System.out.println(i.toString());

  }
  
    }
    
}
