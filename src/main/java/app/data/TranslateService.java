package main.java.app.data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import main.java.Processors.Word;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import com.darkprograms.speech.translator.GoogleTranslate;

/**
 * Created by snu on 2018-02-15.
 */
@Service
public class TranslateService {
    // private final String translatedString;

    private final List<Word> sampleWords = new ArrayList<>();




    @PostConstruct
    public void init() {
        sampleWords.add(new Word("Πώς είσαι", "gr"));
        sampleWords.add(new Word("Вкусът е добър!", "bg"));
        sampleWords.add(new Word("Precis! en mobiltelefon. Det har jag. Tack!", "sv"));
        sampleWords.add(new Word("Smak är bra", "sv"));
    }

    public Word getByLangCode(String langCode) {
        return sampleWords.stream().
                filter((word) -> word.getLangCode().equals(langCode)).findAny().get();
    }

    public List<Word> getAllWords() {
        return sampleWords;
    }

    public String getTranslation(String translateTo, String word) {
        try {
            return GoogleTranslate.translate(translateTo, word);

        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
