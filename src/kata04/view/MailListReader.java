package kata04.view;

import kata04.model.Mail;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.BufferedReader;

public class MailListReader {

    private static List<Mail> listaEmail = new ArrayList<>();

    public static List<Mail> read(String fileName) throws IOException {
        String nombre = fileName;
        BufferedReader buffer = new BufferedReader(new FileReader(nombre));

        String text = buffer.readLine();

        while (text != null) {
            if (text.contains("@") == true) {
                Mail email = new Mail(text);
                listaEmail.add(email);
            }
            text = buffer.readLine();
        }
        return listaEmail;
    }
}
