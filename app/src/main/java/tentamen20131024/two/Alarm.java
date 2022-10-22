package tentamen20131024.two;

public class Alarm implements Observer {
    protected int limit;
    AccountManager am;

    public Alarm(AccountManager am, int limit) {
        this.limit = limit;
        this.am = am;

        am.addObserver((java.util.Observer) this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (am.getSaldo() < limit) {
            alert();
        }
    }

    public void alert() {
        System.out.println("You tried to withdraw too much money");
    }

}
