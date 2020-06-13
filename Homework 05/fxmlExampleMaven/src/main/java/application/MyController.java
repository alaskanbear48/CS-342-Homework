package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class MyController implements Initializable {
	
	
    @FXML
    private TextField textMessage; //For displaying information about order
    
    @FXML
    private ListView<String> coffeOrder; //For displaying order
    
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	}
    
	//The Client makes an order of basic coffee 
	public void newB(ActionEvent e) throws IOException {
		
		System.out.println("New Order Button Pressed");
		coffeOrder.getItems().clear();
		textMessage.clear();
		
		textMessage.setText("You ordered a basic Black Coffee!");
		
		coffeOrder.getItems().add("Black Coffee: $3.99");
		
	}
	
	//The Client adds sugar to their coffee
	public void sugarB(ActionEvent e) throws IOException {
		
		System.out.println("Sugar Button Pressed");
		textMessage.setText("You added Sugar!");
		coffeOrder.getItems().add("+ sugar: $0.50");
		
	}
	
	//The Client adds cream to their coffee
	public void creamB(ActionEvent e) throws IOException {
		
		System.out.println("Cream Button Pressed");
		textMessage.setText("You added Cream!");
		coffeOrder.getItems().add("+ sugar: $0.50");
		
	}

	//The Client gets what their total is going to be for their order 
	public void totalB(ActionEvent e) throws IOException {
	
		System.out.println("Total Button Pressed");
		textMessage.setText("This is your total cost for your order!");
		coffeOrder.getItems().add("Total: ($) -.-");
		
	}

	//The Client adds an extra shot to their coffee
	public void extraShotB(ActionEvent e) throws IOException {
	
		System.out.println("Extra Shot Button Pressed");
		textMessage.setText("You added an Extra Shot!");
		coffeOrder.getItems().add("+ extra shot: $1.20");
		
	}

	//The client adds vanilla to their coffee
	public void vanillaB(ActionEvent e) throws IOException {
	
		System.out.println("Vanilla Button Pressed");
		textMessage.setText("You added Vanilla!");
		coffeOrder.getItems().add("+ vanilla: $0.70");
		
	}

	//The Client adds caramel to their coffee
	public void caramelB(ActionEvent e) throws IOException {
	
		System.out.println("Caramel Button Pressed");
		textMessage.setText("You added Caramel!");
		coffeOrder.getItems().add("+ caramel: $0.75");
	}

	//The Client deletes their order
	public void deleteB(ActionEvent e) throws IOException {
	
		System.out.println("Delete Button Pressed");
		textMessage.setText("You deleted your order. Make a new one?");
		coffeOrder.getItems().clear();
	}

	

}
