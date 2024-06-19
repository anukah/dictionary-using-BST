public class Dictionary {
    Node root;
    public Dictionary() {
        this.root = null;
    }

    public void insert(String word, String definition) {
        Word add = new Word(word, definition);
        root = insertRec(root, add);
    }

    private Node insertRec(Node root, Word word) {
        if (root == null) {
            return new Node(word);
        }

        if (word.getWord().charAt(0) < root.getLetter()) {
            root.left = insertRec(root.left, word);
        } else if (word.getWord().charAt(0) > root.getLetter()) {
            root.right = insertRec(root.right, word);
        } else {
            root.insertWord(word);
        }

        return root;
    }

    public Node searchNode(Word word) {
        return searchRec(root, word);
    }

    private Node searchRec(Node root, Word word) {
        if (root == null || root.getLetter() == word.getWord().charAt(0)) {
            return root;
        }

        if (word.getWord().charAt(0) < root.getLetter()) {
            return searchRec(root.left, word);
        } else {
            return searchRec(root.right, word);
        }
    }

    public void inOrder(){
        inOrderRec(root);
    }

    private void inOrderRec(Node root){
        if (root!=null){
            inOrderRec(root.getLeft());
            System.out.print(root.getLetter() + ", ");
            inOrderRec(root.getRight());
        }
    }
}
