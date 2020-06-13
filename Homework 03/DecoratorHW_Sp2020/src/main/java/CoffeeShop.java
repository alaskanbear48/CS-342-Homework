import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CoffeeShop extends Application {
	
	 //Coffee Order 
	 private CoffeeMaker customerOrder;
	
	  //Buttons
	  Button sugarB;
	  Button creamB;
	  Button extraShotB;
	  Button vanillaB;
	  Button caramelB;
	  Button totalB;
	  Button newB;
	  Button deleteB;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Who want's coffee!!!");
		
		//List View to view the order being placed 
		ListView<String> displayQueueItems = new ListView<String>();
		displayQueueItems.setStyle("-fx-font-size: 25;"+"-fx-border-size: 20;"+ 
				"-fx-border-color: purple;" + "-fx-opacity: 0.60;");
		displayQueueItems.setMaxSize(500, 500);

		
		BorderPane border = new BorderPane();
		
		  //Setting Buttons 
		  sugarB = new Button("Sugar");
		  sugarB.setMaxSize(100, 100);
		  
		  creamB = new Button("Cream");
		  creamB.setMaxSize(100, 100);
		  
		  extraShotB = new Button("Extra Shot");
		  extraShotB.setMaxSize(100, 100);
		  
		  vanillaB = new Button("Vanilla");
		  vanillaB.setMaxSize(100, 100);
		  
		  caramelB = new Button("Caramel");
		  caramelB.setMaxSize(100, 100);
		  
		  totalB = new Button("Total");
		  totalB.setMaxSize(100, 100);
		  
		  newB = new Button("New Order");
		  deleteB = new Button("Delete Order");
		  
		  //Every Button but "New Order" will be disabled at the beginning 
		  deleteB.setDisable(true);
		  totalB.setDisable(true);
		  disableEnable(true);
		  
		  //Two V-Boxes to hold buttons 
		  VBox vButtons1 = new VBox(5, newB, sugarB, creamB, totalB); //<-----
		  VBox vButtons2 = new VBox(5, extraShotB, vanillaB, caramelB, deleteB); //<----
		
		  //One H-Box to hold both V-Boxes
		  HBox hButtons = new HBox(10, vButtons1, vButtons2); //<-------
		  hButtons.setAlignment(Pos.CENTER);//<------
		  hButtons.setPadding(new Insets(0, 100, 75, 100));//<><><>
		  
		  border.setBottom(hButtons); //<------ 
		 
		   //A text field at the top of the list view will display messages to the user
		   //It cannot be editable 
		   TextField text = new TextField("Welcome to Dale Reed's Coffee Shop!");
		   text.setMaxWidth(500);
		   text.setEditable(false);
		   text.setStyle("-fx-font-size: 15;");
		   
		   //One V-Box to hold list view and text field 
		   VBox vCosts = new VBox(5, text, displayQueueItems); //<---------
		   vCosts.setPadding(new Insets(100, 0, 0, 0));//<><><>	 
		   
		   vCosts.setAlignment(Pos.CENTER);
		   border.setTop(vCosts); //<---------
			
		 //When a new order is placed all buttons are enabled and "New Order" is disabled  
		 newB.setOnAction(new EventHandler<ActionEvent> (){
			public void handle(ActionEvent action){
				
				displayQueueItems.getItems().clear();
				text.clear();
				
				//Display the basic cost of a black coffee in the list view 
				text.setText("You ordered a basic Black Coffee!");
				displayQueueItems.getItems().add("Black Coffee: $3.99");
				
				//Create a new Coffee Order 
				customerOrder = new CoffeeMaker();
				
				newB.setDisable(true);
				deleteB.setDisable(false);
				totalB.setDisable(false);
				disableEnable(false);
				}
				
			});
		
		 //When the total cost of the order is asked for every button is disabled and "New Order" is enabled 
		 totalB.setOnAction(new EventHandler<ActionEvent> (){
				public void handle(ActionEvent action){
					
					  //Display the total cost of the order in the list view 
					  displayQueueItems.getItems().add("Total: $" + customerOrder.getCost());
					  text.setText("This is your total cost for your order!");
					  
					  newB.setDisable(false);
					  deleteB.setDisable(true);
					  totalB.setDisable(true);
					  disableEnable(true);
					}
				
				});
		 
		 //When the current order is deleted every button is disabled and "New Order" is enabled
		 deleteB.setOnAction(new EventHandler<ActionEvent> (){
				public void handle(ActionEvent action)
				{
					//Clear all items in the list view 
					displayQueueItems.getItems().clear();
					text.setText("You deleted your order. Make a new one?");
					
					newB.setDisable(false);
					deleteB.setDisable(true);
					totalB.setDisable(true);
					disableEnable(true);
				}
					
				});
		 
		
		     //Coffee Condiments
		 	 //When something is added to the coffee a constructor is called to add that to the customer order. It is also shown in the list view what the customer has added to the coffee
			 sugarB.setOnAction(e->{displayQueueItems.getItems().add("+ sugar: $0.50"); customerOrder.putSugar(); text.setText("You added Sugar!");});
			 
			 creamB.setOnAction(e->{displayQueueItems.getItems().add("+ sugar: $0.50"); customerOrder.putCream(); text.setText("You added Cream!");});
			 
			 extraShotB.setOnAction(e->{displayQueueItems.getItems().add("+ extra shot: $1.20"); customerOrder.putExtraShot(); text.setText("You added an Extra Shot!");});
			 
			 vanillaB.setOnAction(e->{displayQueueItems.getItems().add("+ vanilla: $0.70"); customerOrder.putVanilla(); text.setText("You added Vanilla!");});
			 
			 caramelB.setOnAction(e->{displayQueueItems.getItems().add("+ caramel: $0.75"); customerOrder.putCaramel(); text.setText("You added Caramel!");});
			 
			 //Create an object for the background image    
			 Image reedCoffee = new Image("daleReedCoffee2.jpg");
				
			    //Set background size 
				BackgroundSize bSize = new BackgroundSize(1.0, 1.0, true, true, false, false);
				border.setBackground(new Background(new BackgroundImage(reedCoffee,
			            BackgroundRepeat.NO_REPEAT,
			            BackgroundRepeat.NO_REPEAT,
			            BackgroundPosition.CENTER,
			            bSize )));
						 
		//Create scene and set as primary scene 	 
		Scene scene = new Scene(border,850,750); //<-------
		
		primaryStage.setScene(scene);
		primaryStage.show();		
	}

	//Disable/Enable condiment buttons 
	public void disableEnable(Boolean status){
		
		  caramelB.setDisable(status);
		  vanillaB.setDisable(status);
		  extraShotB.setDisable(status);
		  creamB.setDisable(status);
		  sugarB.setDisable(status);
	}
}
