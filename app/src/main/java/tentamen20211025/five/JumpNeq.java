package tentamen20211025.five;

public class JumpNeq extends JumpIf {

    public JumpNeq(int target, Operand left, Operand right) {
        super(target, left, right);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean condition(Word left, Word right) {
        if (!left.equals(right)) {
            return true;
        }
        return false;
    }

}
