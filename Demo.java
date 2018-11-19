import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;

import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class Demo extends Application {

    public static void main(String[] args) {
	     launch(args);
     }
	 
	 @Override
	 public void start(Stage s) throws Exception {
	    TabPane layout = new TabPane();
	    
		Tab tab1 = new Tab("Write");
		
		TextArea ta = new TextArea();
		tab1.setContent(ta);
		
		layout.getTabs().add(tab1);
	    
		
		Tab tab2 = new Tab("Read");
		
		Label lab = new Label();
		lab.textProperty().bind(ta.textProperty());
		tab2.setContent(lab);
		
	    layout.getTabs().add(tab2);
		
		Scene scene = new Scene(layout);
		s.setScene(scene);
		s.show();
		}
}