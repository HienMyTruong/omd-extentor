package tentamen20111021.two;

public class Arrival extends Event {

    @Override
    public String kind() {

        return "ARRIVAL";
    }

    @Override
    public void execute(Context context) {
        context.arrival(time);
    }

}
