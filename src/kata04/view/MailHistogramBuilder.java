package kata04.view;

import kata04.model.Mail;
import kata04.model.Histogram;
import java.util.List;

public class MailHistogramBuilder {

    public static Histogram<String> build(List<Mail> list) {
        Histogram<String> histogram = new Histogram<>();
        for (Mail mail : list) {
            histogram.increment(mail.getDomain());
        }
        return histogram;
    }
}
