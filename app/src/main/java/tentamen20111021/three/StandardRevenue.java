package tentamen20111021.three;

public class StandardRevenue implements Revenue {
    public final float interest = (float) 4.0;

    @Override
    public float revenue(float balance, int days) {
        return balance * days * interest / 365;
    }

}
