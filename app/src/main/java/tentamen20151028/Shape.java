package tentamen20151028;

public abstract class Shape implements IShape {
    protected int x;
    protected int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public abstract void paint(Graphics g);
}
