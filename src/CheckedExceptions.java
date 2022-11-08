import javax.swing.*;
import java.io.*;

public class CheckedExceptions {

    public void arquivo() throws IOException {
        File file = new File("Musicas.txt");

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        }while (line != null);

        bw.flush();
        br.close();
    }
}
