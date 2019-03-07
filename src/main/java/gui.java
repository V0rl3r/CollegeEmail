import java.util.ArrayList;

class GUI {
    /*
    You generally seem to have this in hand, but I'll add some methods for communicating with the logic
    */

    Logic l;

    public GUI(Logic l){
        this.l = l;
    }

    //Get emails from the logic for display
    public void getEmails(){

    }

    //Pass the currently displayed list of emails to the logic
    public void passEmails(){

    }

    //Mark the list of emails
    public void markEmails(ArrayList<String> emailAddresses){
        l.markEmails(emailAddresses);
    }
}