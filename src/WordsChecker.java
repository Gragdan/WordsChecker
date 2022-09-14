import java.util.HashSet;

public class WordsChecker {
    private String text;

    private HashSet<String> words = new HashSet<String>();

    public <text> WordsChecker(String text) {
        this.text = text;
        String[] arrWords = text.split("\\P{IsAlphabetic}+");
        for (String w : arrWords) {
            words.add(w.toLowerCase());
        }
    }

    public void setText(String text) {

        this.text = text;
    }

    public String getText() {

        return text;
    }

    public boolean hasWord(String word) {
        if (words.contains(word.toLowerCase())) {
            return true;
        } else {
            return false;
        }

    }
}
