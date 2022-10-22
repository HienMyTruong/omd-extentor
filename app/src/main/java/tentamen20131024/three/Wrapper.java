package tentamen20131024.three;

public class Wrapper implements CommunicationChannel {
    CommunicationChannel originalCC;
    DB db;

    public Wrapper(CommunicationChannel originalCC, DB db) {
        this.originalCC = originalCC;
        this.db = db;

    }

    public CommunicationChannel getOriginal() {
        return originalCC;
    }

    @Override
    public void send(String text) {
        // TODO Auto-generated method stub

    }

    @Override
    public String receive() {
        // TODO Auto-generated method stub
        return null;
    }

}
