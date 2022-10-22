package tentamen20131024.two;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class AccountManager extends Observable {
    int saldo;
    // Set<Alarm> alarms;

    public void deposit(int amount) {
        saldo += amount;
        setChanged();
        notifyObservers();
    }

    public void withDraw(int amount) {
        saldo -= amount;
        setChanged();
        notifyObservers();

    }

    public int getSaldo() {
        return saldo;
    }
}
