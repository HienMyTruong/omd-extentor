package tentamen20111021.two;

public class Departure extends Event {

    @Override
    public String kind() {
        return "DEPARTURE";
    }

    @Override
    public void execute(Context context) {
        context.departure(time);

    }

}