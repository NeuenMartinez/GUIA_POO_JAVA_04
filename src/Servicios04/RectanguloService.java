package Servicios04;

import Entidades04.Rectangulo;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author NeuenMartinez
 */
public class RectanguloService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    DecimalFormat df = new DecimalFormat("#.00");
    
    public Rectangulo crearRectangulo(){
        System.out.println("Ingresar la medida de la base:");
        int base = leer.nextInt();
        System.out.println("Ingresar la altura:");
        int altura = leer.nextInt();
        return new Rectangulo(base,altura);
    }
    public void superficie(Rectangulo r1){
        System.out.println("La superficie del recatangulo es de: " + r1.getBase() * r1.getAltura() + "cm2");
    }
    public void perimetro(Rectangulo r1){
        System.out.println("El perimetro del recatangulo es de: " + ((r1.getBase() + r1.getAltura()) * 2) + "cm2");
    }
    public void grafico(Rectangulo r1){
        for (int i = 1; i <= r1.getAltura(); i++) {
            for (int j = 1; j <= r1.getBase(); j++) {
                if (i > 1 && i < r1.getAltura() && j > 1 && j < r1.getBase()) {
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println("");
        }
    }
    
}
