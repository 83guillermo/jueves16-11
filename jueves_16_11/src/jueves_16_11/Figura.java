
package jueves_16_11;

 abstract public class Figura implements Igeometria {

    @Override
    public String toString() {
        return "Figura{" + "lado=" + lado + ", lado2=" + lado2 + ", lado3=" + lado3 + ", radio=" + radio + ", angulo=" + angulo + '}';
    }
    
    private float lado;
    private float lado2;
    private float lado3;

    public float getLado3() {
        return lado3;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }
    private float radio;
    private float angulo;
   
    abstract public void CalcularPerimetro();
    
    public float getLado2() {
        return lado2;
    }

    // getters y setters de la clase
    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getAngulo() {
        return angulo;
    }

    public void setAngulo(float angulo) {
        this.angulo = angulo;
    }
    
    
    
}
