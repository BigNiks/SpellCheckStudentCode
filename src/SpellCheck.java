import java.util.ArrayList;

/**
 * Spell Check
 * A puzzle written by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: NIKO MADRIZ
 * */

public class SpellCheck {


    /**
     * checkWords finds all words in text that are not present in dictionary
     *
     * @param text The list of all words in the text.
     * @param dictionary The list of all accepted words.
     * @return String[] of all mispelled words in the order they appear in text. No duplicates.
     */
    public String[] checkWords(String[] text, String[] dictionary) {
        TrieNode[] childs = new TrieNode[253];
        boolean words = false;
        TrieNode root = new TrieNode(childs, words);
        Trie dict = new Trie(root);
        Trie misspelled = new Trie(root);
        ArrayList<String> misspell = new ArrayList<>();
        int i = 0;
        for (String word : dictionary) {
            dict.insert(word);
        }
        for (String word : text) {
            if (!dict.lookup(word) && !misspelled.lookup(word)) {
                misspelled.insert(word);
                misspell.add(word);
                i++;
            }
        }
        String[] miss = misspell.toArray(new String[0]);
        return miss;
    }
}
