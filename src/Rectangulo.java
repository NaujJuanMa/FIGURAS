public class  Rectangulo extends Figura {

    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
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




    @Override
    double calcArea() {
        double area = base*altura;
        return 0;
    }

    @Override
    double calcPerimetro() {
        double perimetro = 2* base+ altura;
        return 0;
    }

    @Override
    public void mostrarinfo() {
        System.out.println("Area Total "+ calcArea() + "perimetro total" + calcPerimetro());

    }
}
