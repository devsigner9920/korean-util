package io.dvsgn.util;

import org.junit.jupiter.api.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;

public class EncodingTest {
    @Test
    void 인코딩_확인() {
        Charset charset = Charset.defaultCharset();

        assertThat(charset).isEqualTo(StandardCharsets.UTF_8);
    }
}
