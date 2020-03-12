package locale;

import java.text.DateFormatSymbols;
import java.text.spi.DateFormatSymbolsProvider;
import java.util.Locale;

public class KazakDateFormatSymbolsProvider
        extends DateFormatSymbolsProvider {

    private static final Locale KAZAK_LOCALE = new Locale("KZ");

    @Override
    public DateFormatSymbols getInstance(Locale locale) {

        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
        dateFormatSymbols.setMonths(MonthKazak.getCurrentKazakDate());
        return dateFormatSymbols;
    }

    @Override
    public Locale[] getAvailableLocales() {
        return new Locale[]{KAZAK_LOCALE};
    }
}
