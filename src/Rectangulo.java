public class Rectangulo extends Figure{

protected float base;
protected float altura;

public  void Rectangulo (float base, float altura) {

    this.base = base;
    this.altura = altura;


}
@Override
public double calculararea() {
    return (base * altura) ;
}
}
