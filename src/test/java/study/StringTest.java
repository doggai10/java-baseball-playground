package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("split two value")
    void split2Value(){
        String inputs = "1,2";
        String[] input = inputs.split(",");
        assertThat(input).contains("1","2");
    }

    @Test
    @DisplayName("split one value")
    void split1Value(){
        String inputs = "1,";
        String[] input = inputs.split(",");
        assertThat(input).containsExactly("1");
    }

    @Test
    @DisplayName("string charAt")
    void stringCharAt(){
        String input="abc";
        assertThat(input.charAt(2)).isEqualTo('c');
    }

    @Test
    @DisplayName("string out of index")
    void stringIndexOut(){
        assertThatThrownBy(()->{
            String input="abc";
            throw new Exception(String.valueOf(input.charAt(3)));
        }).isInstanceOf(IndexOutOfBoundsException.class).hasMessageContaining("String index out of range: 3");
    }

}
