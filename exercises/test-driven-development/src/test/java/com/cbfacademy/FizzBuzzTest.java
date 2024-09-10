package com.cbfacademy;

import net.bytebuddy.matcher.ElementMatcher;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "The Fizz Buzz should")
public class FizzBuzzTest {

    @Test
    @DisplayName("return 1 when input is 1")
    public void return1WhenInputIs1(){
        final String actual = FizzBuzz.of(1);
        assertThat(actual, is("1"));
    }
    private void assertThat(String actual, ElementMatcher.Junction<Object> objectJunction) {
    }

    @Test
    @DisplayName("return Fizz when the input is 3")
    public void returnFizzWhenInputIs3() {
        final String actual = FizzBuzz.of(3);
        assertThat();
    }
}
