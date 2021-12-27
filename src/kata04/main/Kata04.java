package kata04.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import kata04.model.Histogram;
import kata04.model.Mail;
import kata04.view.*;

public class Kata04 {

    public static void main(String[] args) throws IOException {
        String nameFile = "C:/Users/Lou Minxi/Documents/NetBeansProjects/Kata04_44/email.txt";
        input(nameFile);
    }

    public static void execute() {
        MailHistogramBuilder mostrar = new MailHistogramBuilder();
        MailListReader leer = new MailListReader();
    }

    public static void input(String nameFile) throws FileNotFoundException, IOException {
        process(MailListReader.read(nameFile));
    }

    public static void process(List<Mail> mailList) {
        output(MailHistogramBuilder.build(mailList));
    }

    public static void output(Histogram<String> histogram) {
        new HistogramDisplay(histogram).execute();
    }

}
