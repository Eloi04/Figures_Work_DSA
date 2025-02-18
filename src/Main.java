import org.w3c.dom.css.Rect;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(3,5);
        System.out.println("El area del triangulo es:"+ triangulo.calculararea());


        Rectangulo r = new Rectangulo();
        r.Rectangulo(4,3);
        System.out.println("El area del rectangulo es: " + r.calculararea());

        Quadrado q = new Quadrado();
        q.Quadrado(5);
        System.out.println("El area del rectangulo es " + q.calculararea());

        Circulo c = new Circulo(5);
        System.out.println("El area del circulo es " + c.calculararea());

        }

}

