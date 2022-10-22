package tentamen20131024.one;

public class Senior extends Member {
    private int amount = 3000;

    protected String name = "SENIOR";

    @Override
    public int amount() {
        return amount;
    }

}
