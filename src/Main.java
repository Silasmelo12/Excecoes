import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

//        UncheckedExceptions uncheckedExceptions = new UncheckedExceptions();
//        uncheckedExceptions.dividir();
//        CheckedExceptions checkedExceptions = new CheckedExceptions();
//        try {
//            checkedExceptions.arquivo();
//        } catch (FileNotFoundException e) {
////            throw new RuntimeException(e);
//            JOptionPane.showMessageDialog(null,"Arquivo não encontrado");
//        } catch (IOException e){
//            JOptionPane.showMessageDialog(null,"Erro inesperado. Entre em contato com o suporte.");
//        }
        ExceptionCustomizada exceptionCustomizada = new ExceptionCustomizada();
        exceptionCustomizada.imprimir();
    }
}