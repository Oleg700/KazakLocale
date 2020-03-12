package locale;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public enum MonthKazak {

    Қаңтар, Ақпан, Наурыз, Сәуір, Мамыр,
    Маусым, Шілде, Тамыз, Қыркүйек, Қазан, Қараша, Желтоқсан;

    private static final int START_LONG_STREAM = 1;

    public static String[] getCurrentKazakDate() {
        return Arrays.stream(MonthKazak.values())
                .map(Enum::name)
                .toArray(String[]::new);
    }
}


