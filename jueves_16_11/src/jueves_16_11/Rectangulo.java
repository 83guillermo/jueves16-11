
package jueves_16_11;


public class Rectangulo extends Figura {
  
    public Rectangulo(float lado,float lado2){
       this.setLado(lado);
       this.setLado2(lado2);
      
   }

    @Override
    public void CalcularPerimetro() {
      float perimetro=getLado2()*2+getLado()*2;
        System.out.println("este es el perimetro de tu rectangulo"+perimetro);
   
    }

    @Override
    public void CalcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
