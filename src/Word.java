public class Word {
    private String word;
    private String definition;

    public Word(String word, String definition) {
        this.word = (word != null) ? word : "";
        this.definition = (definition != null) ? definition : "";
    }

    public void printWord(){
        System.out.println("Word : " + word);
        System.out.println("Definition : " + definition);
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}
