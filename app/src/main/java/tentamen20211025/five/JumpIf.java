package tentamen20211025.five;

public abstract class JumpIf implements Instruction {
    protected int target;
    protected Operand left, right;

    public JumpIf(int target, Operand left, Operand right) {
        this.target = target;
        this.left = left;
        this.right = right;
    }

    public abstract boolean condition(Word left, Word right);

    public final void execute(Memory memory, PC pc) {
        if (condition(left.getWord(), right.getWord())) {
            pc.jumpTo(target);
        } else {
            pc.step();
        }

    }

}
