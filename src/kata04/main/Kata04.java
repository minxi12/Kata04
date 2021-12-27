package kata04.main;

import kata04.view.MailListReader;
import kata04.view.HistogramDisplay;
import kata04.view.MailHistogramBuilder;
import java.io.IOException;
import kata04.model.Histogram;

public class Kata04 {

    public static void main(String[] args) throws IOException {
        String nameFile = "C:/Users/Lou Minxi/Documents/NetBeansProjects/Kata04_44/email.txt";
        MailListReader leer = new MailListReader();

        MailHistogramBuilder mostrar = new MailHistogramBuilder();

        HistogramDisplay histo = new HistogramDisplay(mostrar.build(leer.read(nameFile)));
        histo.execute();
    }
}
