package tentamen20151028;

public class Square extends Shape {
    private int side;

    public Square(int x, int y, int side) {
        super(x, y);
        this.side = side;
        // TODO Auto-generated constructor stub
    }

    @Override
    public void paint(Graphics g) {
        g.drawRectangle(x, y, side, side);
    }

}
