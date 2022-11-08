import javax.swing.*;

public class UncheckedExceptions {

    public void dividir(){
        do {
            String x = JOptionPane.showInputDialog("Numerador: ");
            String y = JOptionPane.showInputDialog("Denominador: ");

            try{
                int resultado = Integer.parseInt(x)/Integer.parseInt(y);
                JOptionPane.showMessageDialog(null,"Resultado "+resultado);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Entrada inválida. Por favor, tente novamente.");
            } catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null,"Divisão por zero é impossível. Por favor, tente novamente.");
            }
        }while (true);

    }
}
