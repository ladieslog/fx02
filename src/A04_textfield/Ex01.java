package A04_textfield;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox =new HBox();
		TextField tf=new TextField();
		tf.setText("test");
		
		hbox.setPadding(new Insets(20));
		PasswordField pf=new PasswordField();
		pf.setText("abcd1234");
		
		ComboBox<String> cb=new ComboBox<String>();
		cb.getItems().addAll("공부","놀기","멍타기");
		cb.setValue("공부");
		
		TextArea ta=new TextArea();
		ta.setPrefSize(100, 50);
		
		DatePicker dp=new DatePicker();
		
		hbox.getChildren().addAll(tf,pf,cb,ta,dp);
		hbox.setPrefSize(800, 200);
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
	}
}
