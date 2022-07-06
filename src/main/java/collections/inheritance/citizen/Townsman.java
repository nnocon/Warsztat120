package collections.inheritance.citizen;

public class Townsman extends Citizen{
    @Override
    public boolean canVote() {
        return true;
    }
}
