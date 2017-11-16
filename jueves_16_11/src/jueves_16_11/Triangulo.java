
package jueves_16_11;


public class Triangulo extends Figura {
    
    public Triangulo(float lado,float lado2,float lado3){
        this.setLado(lado);
        this.setLado2(lado2);
        this.setLado3(lado3);
    }

    @Override
    public void CalcularPerimetro() {
        float perimetro =getLado()+getLado2()+getLado3();
        System.out.println("este es el perimetro de tu trinagulo"+perimetro);
    
    }

    @Override
    public void CalcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
