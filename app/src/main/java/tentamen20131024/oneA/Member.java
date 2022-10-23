package tentamen20131024.oneA;

public abstract class Member {
    protected String name;

    public abstract int amount();

    public String payment() {
        return name + "den avgift du ska betala är " + amount();
    }

}
