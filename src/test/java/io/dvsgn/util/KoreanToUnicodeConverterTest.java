package io.dvsgn.util;

import org.junit.jupiter.api.Test;

public class KoreanToUnicodeConverterTest {
    @Test
    void 한글_유니코드_변환() {
        String korean = "가";

        System.out.println("korean.charAt(0) = " + (int) korean.charAt(0));

        int test = '낙';
        int STARTING_CHAR = '가';
        boolean hasFinal = ((test - STARTING_CHAR) % (21 * 28)) % 28 == 0;
        System.out.println("korean = " + hasFinal);
    }
}
