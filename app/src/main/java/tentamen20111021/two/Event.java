package tentamen20111021.two;

public abstract class Event {
    public abstract String kind(); // Templete method

    protected int time;

    public abstract void execute(Context context);

    public String toString() {
        return kind() + " " + time;
    }
}
