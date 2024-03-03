import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String welcomeMessage = "Welcome to the Party Picker.\n\n" +
                "Enter person's name and the type of food they're likely to bring,\n" +
                "then indicate whether they are actually invited to the party or not.";
        ArrayList<Friend> friends = new ArrayList<Friend>();
        String dialogTitle = "Party Picker";
        String firstName;
        String lastName;
        String food;
        boolean isInvited;
        String[] invitedButtons = { "Invited", "Not Invited" };
        String[] repeat = { "Yes", "No" };

        JOptionPane.showMessageDialog(null, welcomeMessage);

        while(true)
        {
            firstName = JOptionPane.showInputDialog(null, "Enter first name", dialogTitle, JOptionPane.QUESTION_MESSAGE);
            lastName = JOptionPane.showInputDialog(null,"Enter last name", dialogTitle, JOptionPane.QUESTION_MESSAGE);
            food = JOptionPane.showInputDialog(null, "Enter the food they usually bring", dialogTitle, JOptionPane.QUESTION_MESSAGE);

            if(JOptionPane.showOptionDialog(null, "Choose if this guested is Invited or Not", dialogTitle,
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, invitedButtons, invitedButtons[0]) == 0)
            { isInvited = true; }
            else
            { isInvited = false; }

            friends.add(new Friend(firstName, lastName, isInvited, food));

            if(JOptionPane.showOptionDialog(null, "Enter another guest", dialogTitle,
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, repeat, repeat[0]) == 1)
            {break;}
        }

        String output = "";
        for(Friend friend:friends){
            output = output + friend.toString() + "\n";
        }

        JOptionPane.showMessageDialog(null,output);
    }
}