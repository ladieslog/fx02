package A03_toglebutton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex02 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox=new HBox();
		ToggleButton tb1 =new ToggleButton("111");
		ToggleButton tb2 =new ToggleButton("222");
		ToggleButton tb3 =new ToggleButton("333");
		
		tb2.setSelected(true);
		
		hbox.getChildren().addAll(tb1,tb2,tb3);
		hbox.setPrefSize(300, 200);
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
	}
}
