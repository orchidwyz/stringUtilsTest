package me.orchidwyz.util;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringUtilsTest {
    private StringUtils stringUtils;
    private String testStr;

    @Before
    public void setUp() {
        stringUtils = new StringUtils("");
    }

    @Test
    public void should_is_empty_when_str_is_null() {
        //given
        testStr = null;
        //when
        boolean isEmpty = stringUtils.isEmpty(testStr);
        //then
        assertThat(isEmpty).isTrue();
    }

    @Test
    public void should_is_empty_when_str_is_blank() {
        //given
        testStr = "";
        //when
        boolean isEmpty = stringUtils.isEmpty(testStr);
        //then
        assertThat(isEmpty).isTrue();
    }

    @Test
    public void should_is_not_empty_when_str_has_letter() {
        //given
        testStr = "abc";
        //when
        boolean isEmpty = stringUtils.isEmpty(testStr);
        //then
        assertThat(isEmpty).isFalse();
    }

    @Test
    public void should_is_blank_when_str_is_null() {
        //given
        testStr = null;
        //when
        boolean isBlank = stringUtils.isBlank(testStr);
        //then
        assertThat(isBlank).isTrue();
    }

    @Test
    public void should_is_blank_when_str_is_blank() {
        //given
        testStr = "";
        //when
        boolean isBlank = stringUtils.isBlank(testStr);
        //then
        assertThat(isBlank).isTrue();
    }

    @Test
    public void should_is_blank_when_str_is_space() {
        //given
        testStr = "    ";
        //when
        boolean isEmpty = stringUtils.isBlank(testStr);
        //then
        assertThat(isEmpty).isTrue();
    }

    @Test
    public void should_is_not_blank_when_str_has_letter() {
        //given
        testStr = "abc";
        //when
        boolean isBlank = stringUtils.isBlank(testStr);
        //then
        assertThat(isBlank).isFalse();
    }

    @Test
    public void should_is_not_alpha_when_str_is_null() {
        //given
        testStr = null;
        //when
        boolean isEmpty = stringUtils.isAlpha(testStr);
        //then
        assertThat(isEmpty).isFalse();
    }

    @Test
    public void should_is_not_alpha_when_str_is_blank() {
        //given
        testStr = "";
        //when
        boolean isEmpty = stringUtils.isAlpha(testStr);
        //then
        assertThat(isEmpty).isFalse();
    }

    @Test
    public void should_is_alpha_when_str_only_has_letter() {
        //given
        testStr = "abc";
        //when
        boolean isAlpha = stringUtils.isAlpha(testStr);
        //then
        assertThat(isAlpha).isTrue();
    }

    @Test
    public void should_is_not_alpha_when_str_has_number() {
        //given
        testStr = "ab3c";
        //when
        boolean isAlpha = stringUtils.isAlpha(testStr);
        //then
        assertThat(isAlpha).isFalse();
    }
}