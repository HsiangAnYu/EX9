import java.lang.runtime.SwitchBootstraps;

public class Friend extends Person {
    private String foodToBring;

    public Friend(String firstName, String lastName, boolean isInvited, String foodToBring) {
        super(firstName, lastName, isInvited);
        this.foodToBring = foodToBring;
    }

    @Override
    public String toString() {
        String invited = "invited";

        if(!super.isInvited())
        { invited = "NOT invited"; }



        return super.getFullName() + " is bringing " + this.foodToBring + ". They are " + invited + " to the party.";
    }
}
