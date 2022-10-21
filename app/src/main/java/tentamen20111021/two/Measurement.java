package tentamen20111021.two;

public class Measurement extends Event {

    @Override
    public String kind() {
        return "MEASUREMENT";
    }

    @Override
    public void execute(Context context) {
        context.measurement(time);
    }
}