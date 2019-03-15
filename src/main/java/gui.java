import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

class GUI extends Application{
    /*
    You generally seem to have this in hand, but I'll add some methods for communicating with the logic
    */

    Logic l;
	public int i;
	private ArrayList<TextField> fieldList;

    public GUI(Logic l){
		this.l = l;
		i = 2; 
		fieldList = new ArrayList<TextField>();
	}

    @Override
    public void start(Stage primaryStage) throws Exception {
    	// this will use a standard exception handler

    	GridPane pane = new GridPane();
    	 pane.setAlignment(Pos.CENTER);
    	 pane.setHgap(5);
    	 pane.setVgap(5);
    	 pane.setPadding(new Insets(25,25,25,25)); // set top, right, bottom, left
    	 // this allows input fields to be placed in the window

    	 TextField tf1 = new TextField("Enter your filter here!");
    	 // these are the individual fields for input, you can set the default text
    	 fieldList.add(tf1); 
    	 tf1.setPrefColumnCount(30);
    	 // this sets the number of spaces in the text fields
    	 // call on the labels and text fields to be placed into the window
    	 // must be done individually so that location and order can be set by column/row

    	 BorderPane borderPane = new BorderPane();
    	 borderPane.setCenter(pane);
    	 
    	 Button addbutton = new Button("Add Email Address");
    	 pane.add(addbutton, 1, 0);
    	 // make a button and put it in the Gridpane
    	 
    	 Button removebutton = new Button("Remove Email Adress"); 
    	 pane.add(removebutton, 1, 1);

    	 Scene scene = new Scene(borderPane, 500, 500);
    	 primaryStage.setTitle("Email Creator");
    	 primaryStage.setScene(scene);
    	 primaryStage.show();

    	 addbutton.setOnAction(e -> {
    		 Label l = new Label(Integer.toString(fieldList.size())); 
    		 TextField addfield = new TextField("Enter address here!"); 
    		 fieldList.add(addfield); 
    		 pane.add(addfield, 1 , i);
    		 pane.add(l, 0, i);
    		 i++; 
    	 });
    	
    	 removebutton.setOnAction(e -> {
    		 pane.getChildren().remove(fieldList.size()); 
    	 });

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