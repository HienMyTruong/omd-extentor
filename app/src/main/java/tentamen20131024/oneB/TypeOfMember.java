package tentamen20131024.oneB;

public abstract class TypeOfMember {
    public abstract String name();

    public abstract int amount();

    public String toString() {
        return name() + " den avgift du ska betala är " + amount();
    }
}
