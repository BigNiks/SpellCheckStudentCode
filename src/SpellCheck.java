/**
 * Spell Check
 * A puzzle written by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: [YOUR NAME HERE]
 * */

public class SpellCheck {


    /**
     * checkWords finds all words in text that are not present in dictionary
     *
     * @param text The list of all words in the text.
     * @param dictionary The list of all accepted words.
     * @return String[] of all mispelled words in the order they appear in text. No duplicates.
     */
    private static int dictionary;
    private static String text[];
    public String[] checkWords(String[] text, String[] dictionary) {
        this.text = text;
        return null;
    }

    public boolean binarySearch(String word, String[] DICTIONARY) {
        int low = 0;
        int high = DICTIONARY.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (word.equals(DICTIONARY[mid])) {
                return true;
            } else if (word.compareTo(DICTIONARY[mid]) < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    public void checkWords() {
        for(int i = 0; i < text.length; i++){
            if(!binarySearch(text.[i])){

                i--;
            }
        }
    }
}
