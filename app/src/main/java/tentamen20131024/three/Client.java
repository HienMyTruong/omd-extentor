package tentamen20131024.three;

public class Client {
    protected CommunicationChannel myCC = new FastCommunicationChannel();

    public void startLog(DB db) {
        myCC = new Wrapper(myCC, db);

    }

    public void stopLog() {
        if (myCC instanceof Wrapper) {
            myCC = ((Wrapper) myCC).getOriginal();
        }

    }

}
