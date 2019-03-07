import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;

class Logic {

    /*
    HOW TO USE
    To run this project, enter terminal and type gradle -q run. If you're on windows, best of luck on figuring out how to run this. gq is the quickstart class, which will handle marking emails as read. The setup method in GmailQuickstart MUST be called before attempting anything else, otherwise you will most likely get errors
    */

    /*
    YOURE GOALS
    If you're working on logic, in this class I put some example methods. Fill them out and add more as necessary
    If you're working on view, go to the view class, and then the same as above applies
    */

    GmailQuickstart gq;
    GUI gui;

    public static void main(String[] args) throws IOException, GeneralSecurityException {
        
        Logic l = new Logic();

    }

    public Logic() throws IOException, GeneralSecurityException {
        gq = new GmailQuickstart();
        gq.setup();
        gui = new GUI(this);
    }

    //Read in email addresses saved to a file, return an array list of them
    private ArrayList<String> readInEmailAddress() {
        return null;
    }

    //Calls gq
    public boolean markEmails(ArrayList<String> emailAddresses) {
        return gq.markAsRead(emailAddresses);
    }

    //Saves the emails to the file/database that is being used. Should probably overwrite the emails there, since you want to be able to delete emails
    public void saveEmails(ArrayList<String> emailAddresses){

    }

    //Reads the list of emails from the file/database
    public void readEmails(ArrayList<String> emailAddresses){

    }

}