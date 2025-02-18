public class Circulo extends Figure {
    private float radio;

    public Circulo(float radio) {

        this.radio = radio;

    }
    @Override
    public double calculararea() {
        return (Math.PI* radio * radio) ;
    }
}

