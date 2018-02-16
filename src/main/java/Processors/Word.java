package main.java.Processors;

/**
 * Created by snu on 2018-02-14.
 */
public class Word {
    // Value of the word
    private String value;
    // ISO639-2 code compliant
    private String langCode;

    public Word(String value, String langCode) {
        super();
        this.value = value;
        this.langCode = langCode;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String word) {
        this.value = value;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }
}
