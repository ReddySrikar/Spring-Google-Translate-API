package main.java.Resources;

/**
 * Created by snu on 2018-02-14.
 */
// Contains supported languages

public enum Language
{
    PORTUGUESE("pt"),
    FRENCH("fr"),
    ITALIAN("it"),
    SPANISH("es"),
    SWEDISH("sv"),
    GERMAN("gr"),
    BULGARIAN("bg");

    String value;

    private Language(String value) {
        this.value = value;
    }

    public String value(){
        return this.value;
    }
}
