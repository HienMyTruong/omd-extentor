package tentamen20111021.three;

public class Account {
    private float balance;

    public Account(float balance) {
        this.balance = balance;
    }

    public float revenue(Revenue rev, int days) {
        return rev.revenue(balance, days); // strategy (composition)
    }

}
