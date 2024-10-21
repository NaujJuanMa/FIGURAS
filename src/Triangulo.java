public class Triangulo extends Figura {

    double base;
    double altura;
    double l1, l2, l3;

    public Triangulo() {
    }

    public Triangulo(double base, double altura, double l1, double l2, double l3) {
        this.base = base;
        this.altura = altura;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double getL3() {
        return l3;
    }

    public void setL3(double l3) {
        this.l3 = l3;
    }

    @Override
    double calcArea() {
        double area= (base* altura)/2;
        return 0;
    }

    @Override
    double calcPerimetro() {
        double perimetro= l1+l2+l3;
        return 0;
    }

    @Override
    public void mostrarinfo() {
        System.out.println("Area Total "+ calcArea() + "perimetro total" + calcPerimetro());

    }
}
