package tentamen20151028.three;

public class Circle extends Shape {
    int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
        // TODO Auto-generated constructor stub
    }

    @Override
    public void paint(Graphics g) {
        g.drawCircle(x, y, radius);
        // TODO Auto-generated method stub

    }

}
