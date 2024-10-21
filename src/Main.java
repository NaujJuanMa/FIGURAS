import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// JUAN MANUEL MEZA
// 802993

public class Main {
    public static void main(String[] args) {

        List<Object> Figuras = new ArrayList<>();
        int oc;

        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("FIGURAS");
            System.out.println("1. Rectangulo ");
            System.out.println("2. Triangulo ");
            System.out.println("3. Circulo ");
            System.out.println("4. Salir ");
            oc = teclado.nextInt();


            switch (oc) {
                case 1:
                    Rectangulo rectangulo = new Rectangulo();
                    System.out.println("Ingrese la Base : ");
                    rectangulo.setBase(teclado.nextDouble());
                    System.out.println("Ingrese la altura : ");
                    rectangulo.setAltura(teclado.nextDouble());

                    Figuras.add(rectangulo);
                    rectangulo.mostrarinfo();


                    break;
                case 2:

                    Triangulo triangulo = new Triangulo();
                    System.out.println("Ingrese la Base : ");
                    triangulo.setBase(teclado.nextDouble());
                    System.out.println("Ingrese lado 1");
                    triangulo.setL1(teclado.nextDouble());
                    System.out.println("Ingrese lado 2");
                    triangulo.setL2(teclado.nextDouble());
                    System.out.println("Ingrese lado 3");
                    triangulo.setL3(teclado.nextDouble());

                    Figuras.add(triangulo);
                    triangulo.mostrarinfo();


                    break;
                case 3:

                    Circulo circulo = new Circulo();
                    System.out.println("Ingrese el radio : ");
                    circulo.setRadio(teclado.nextDouble());

                    Figuras.add(circulo);
                    circulo.mostrarinfo();


                    break;

            }




        }while (oc != 4);
        teclado.close();
    }
}