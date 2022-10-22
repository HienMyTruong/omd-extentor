package tentamen20131024.oneB;

public class Member1 {

    private TypeOfMember member;

    public Member1(TypeOfMember member) {
        this.member = member;

    }

    public void changeMembership(TypeOfMember changedMember) {
        member = changedMember;

    }

    public String toString() {
        return member.toString();
    }

}
