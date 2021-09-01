package A05_Label;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex02 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox =new HBox();
		hbox.setPadding(new Insets(10));
		Label lbl =new Label("",new ImageView("/img/search.png"));
		
		Label lbl2=new Label();
		lbl2.setText("search");
		lbl2.setTextFill(Color.web("#0076a3"));
		lbl2.setGraphic(new ImageView("/img/search.png"));
		
		
		hbox.getChildren().add(lbl);
		hbox.setPrefSize(300, 200);
		
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
	}
}
