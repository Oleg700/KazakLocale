package locale;

import org.junit.jupiter.api.Test;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


class KazakDateFormatSymbolsTest {

    private static final String PATTERN_DATE = "dd MMMM";
    private static final String KAZAK_LANGUAGE = "KZ";

    @Test
    public void whenGetKazakCurrentDateReturnKazakCurrentDate(){

        //given
        final String CURRENT_DATE = "13 Желтоқсан";

        //when
        DateFormatSymbols dateFormatSymbols = DateFormatSymbols
                .getInstance(new Locale(KAZAK_LANGUAGE));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
                PATTERN_DATE, dateFormatSymbols);
        //then
        String currentDateResult = simpleDateFormat.format(new Date());
        assertThat(CURRENT_DATE, equalTo(currentDateResult));
    }
}