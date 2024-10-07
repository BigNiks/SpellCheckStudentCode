import java.util.HashMap;

public class Trie extends SpellCheck {
    private TrieNode root;

    public Trie(TrieNode root) {
        this.root = root;
    }

    public Trie () {}

    void insert(String word) {
        HashMap<Character, TrieNode> children = root.getChildren();
        TrieNode[] childs = new TrieNode[253];
        TrieNode current = new TrieNode(childs, false);
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            current = new TrieNode(childs, current.isWord());
            if (children.containsKey(character)) {
                current = children.get(character);
            } else {
                current = new TrieNode(character);
                children.put(character, current);
            }
            children = current.getChildren();
        }
        current.setWord(true);
    }

    boolean lookup(String word) {
        HashMap<Character, TrieNode> children = root.getChildren();
        TrieNode[] childs = new TrieNode[253];
        TrieNode current = new TrieNode(childs, false);
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (children.containsKey(currentChar)) {
                current = children.get(currentChar);
                children = current.getChildren();
            }
            else {
                current = null;
                break;
            }
        }
        if (current != null && current.isWord()) {
            return true;
        }
        else {
            return false;
        }
    }
}
