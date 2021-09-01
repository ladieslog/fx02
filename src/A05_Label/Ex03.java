package A05_Label;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex03 extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	static int i=0;
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox =new HBox();
		hbox.setPadding(new Insets(10));
		Label lbl =new Label("A label that needs to be wrapped");
		
		FlowPane fp=new FlowPane();
		fp.getChildren().add(lbl);
		fp.setPrefSize(100, 100);
		
		hbox.getChildren().addAll(fp);
		hbox.setPrefSize(200, 300);
		
		lbl.setWrapText(true);
		lbl.setFont(new Font(30));
		lbl.setRotate(45);
		lbl.setTranslateY(100);
		
		
		
		lbl.setOnMouseClicked(e->{
			
			if(i==0) {
				lbl.setRotate(0);
				lbl.setTranslateY(10);
				i =1;
			}else if(i==1){
				lbl.setRotate(20);
				lbl.setTranslateY(80);
				i=2;
			}else if(i==2) {
				lbl.setRotate(300);
				lbl.setTranslateY(150);
				i=0;
			}else {
				lbl.setRotate(170);
				lbl.setTranslateY(100);
				i=0;
			}
			
		});
		/*
		lbl.setOnMouseClicked(e->{
			lbl.setRotate(20);
			lbl.setTranslateY(40);
		});*/
		
		
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
	}
}
