public class Triangulo extends Figure{
    private float base;
    private float altura;

    public Triangulo(float base, float altura) {

        this.base = base;
        this.altura = altura;


    }
@Override
public double calculararea() {
    return (base * altura) / 2;
}
}
