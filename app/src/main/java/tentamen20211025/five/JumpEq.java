package tentamen20211025.five;

public class JumpEq extends JumpIf {

    public JumpEq(int target, Operand left, Operand right) {
        super(target, left, right);
    }

    @Override
    public boolean condition(Word left, Word right) {
        if (left.equals(right)) {
            return true;
        }
        return false;
    }

}
