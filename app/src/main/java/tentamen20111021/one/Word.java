package tentamen20111021;

public class Word {
    private int value;

    public Word(int value) {
        this.value = value;
    }

    public void add(Word lw, Word rw) {
        value = lw.value + rw.value;
    }

    public String toString() {
        return String.valueOf(value);
    }
}
