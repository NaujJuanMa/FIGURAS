public class Circulo extends Figura{

    double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    double calcArea() {
        double area= 3.1416* (radio * radio);
        return 0;
    }

    @Override
    double calcPerimetro() {
        double perimetro = 2 * 3.1416 * radio;
        return 0;
    }

    @Override
    public void mostrarinfo() {
        System.out.println("Area Total "+ calcArea() + "perimetro total" + calcPerimetro());

    }
}
