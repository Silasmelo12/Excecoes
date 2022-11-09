import org.omg.CORBA.portable.IDLEntity;

import javax.swing.*;

public class ExceptionCustomizada2 {

    int[] numerador = {2, 5, 8, 10};
    int[] denominador = {2, 5, 0, 2, 8};

    public void divisaoExceptions() {
        for (int i = 0; i < denominador.length; i++) {
            try {
                if (numerador[i] % 2 != 0) //impar
                    throw new DivisaoNaoExataException("Divisão não exata.", numerador[i], denominador[i]);
                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (DivisaoNaoExataException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Denominador não pode ser zero.");
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Indice inexistente.");
            }
        }
        System.out.println("O programa continua...");
    }

}
