/*
 * @author NeuenMartinez
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con 
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la 
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la 
altura. Se deberán además definir los métodos getters, setters y constructores 
correspondientes.
 */
package POOej04;

import Entidades04.Rectangulo;
import Servicios04.RectanguloService;


public class POOej04 {

    public static void main(String[] args) {
        RectanguloService rs = new RectanguloService();
        Rectangulo r1 = rs.crearRectangulo();
        System.out.println("=================================");
        rs.grafico(r1);
        rs.perimetro(r1);
        rs.superficie(r1);
        
    }

}