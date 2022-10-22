package tentamen20151028;

import java.util.ArrayList;
import java.util.List;

public class Figure implements IShape {
    private List<IShape> shapes = new ArrayList();

    @Override
    public void paint(Graphics g) {
        for (IShape shape : shapes) {
            shape.paint(g);
        }

    }

    @Override
    public void move(int dx, int dy) {
        for (IShape shape : shapes) {
            shape.move(dx, dy);
        }

    }

    public void add(IShape shape) {
        shapes.add(shape);
    }

}
