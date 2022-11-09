import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada {

    public void imprimir() {
        String nomeArquivo = "Musicas.txt";

        try {
            BufferedReader br = lerArquivo(nomeArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();
        } catch (ImpossivelAberturaDeArquivoException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        } catch (IOException exception) {
            JOptionPane.showMessageDialog(null,"Erro inesperado. Entre em contato com o suporte.");
        }

    }

    private BufferedReader lerArquivo(String nomeArquivo) throws ImpossivelAberturaDeArquivoException {
        File file = new File(nomeArquivo);
        try {
            return new BufferedReader(new FileReader(nomeArquivo));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath());
        }
    }
}
