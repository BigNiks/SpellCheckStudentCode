import java.util.HashMap;

public class TrieNode extends Trie {
    TrieNode[] childs;
    boolean word;
    HashMap<Character, TrieNode> children = new HashMap<>();
    char character;

    public TrieNode(TrieNode[] childs, boolean word) {
        this.childs = childs;
        this.word = word;
    }


    public TrieNode(char c) {
        character = c;
    }

    public HashMap<Character, TrieNode> getChildren() {
        return children;
    }

    public void setChildren(HashMap<Character, TrieNode> children) {
        this.children = children;
    }

    public boolean isWord() {
        return word;
    }

    public void setWord(boolean word) {
        this.word = word;
    }

}
