import java.util.HashMap;
import java.util.Map;

public class WordsChecker {
    private String text;

    private Map<String, Integer> words = new HashMap<>();

    public <text> WordsChecker(String text) {
        this.text = text;
        String[] arrWords = text.split("\\P{IsAlphabetic}+");
        for (int i = 0; i < arrWords.length; i++) {
            words.put(arrWords[i].toLowerCase(), i);
        }
    }

    public void setText(String text) {

        this.text = text;
    }

    public String getText() {

        return text;
    }

    public boolean hasWord(String word) {
        if (words.get(word.toLowerCase()) != null) {
            return true;
        } else {
            return false;
        }

    }
}
