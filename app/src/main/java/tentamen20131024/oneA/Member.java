package tentamen20131024.one;

public abstract class Member {
    protected String name;

    public abstract int amount();

    public String payment() {
        return name + "den avgift du ska betala är " + amount();
    }

}
