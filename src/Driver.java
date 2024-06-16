public class Driver {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.insert("adequate", "satisfactory or acceptable in quality or quantity.");
        dictionary.insert("ample", "enough or more than enough");
        dictionary.insert("apple", "the round fruit of a tree of the rose family, which typically has thin green or red skin and crisp flesh");
        dictionary.insert("baby", "a very young child.");
        dictionary.insert("zebra", "an African wild horse with black-and-white stripes and an erect mane.");
        dictionary.inOrder();
    }
}
