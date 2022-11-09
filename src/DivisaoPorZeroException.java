public class DivisaoPorZeroException extends ArithmeticException{
    private int numerador;
    private int denominador;

    public DivisaoPorZeroException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
