public class Node {
    private char letter;
    private Word[] words;
    protected Node left;
    protected Node right;
    public Node(Word word) {
        this.letter = word.getWord().charAt(0);
        this.words = new Word[1];
        this.words[0] = word;
        this.left = null;
        this.right = null;
    }
    public void insertWord(Word add){
        Word[] added = new Word[words.length+1];
        for (int i = 0; i < words.length; i++) {
            added[i] = words[i];
        }
        added[words.length] = add;
        this.words = added;
    }

    public void printWords() {
        for (Word word : words) {
            System.out.print(word.getWord() + ", ");
        }
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public Word[] getWords() {
        return words;
    }

    public void setWords(Word[] words) {
        this.words = words;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
