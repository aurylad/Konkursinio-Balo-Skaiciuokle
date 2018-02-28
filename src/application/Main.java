package application;
	

import java.io.IOException;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.control.ComboBox;


public class Main extends Application {
	
	Stage stage;
	
	static GridPane grid;
	
	static ComboBox<String> collegeComboBox;
	static ComboBox<String> studiesAreaGroupComboBox;
	static ComboBox<String> facultyComboBox;
	static ComboBox<String> studyProgramComboBox;
	static ComboBox<String> graduationComboBox;
	static ComboBox<String> secondScoreComboBox;
	static ComboBox<String> thirdScoreComboBox;
	
	static Label collegeLabel;
	static Label facultyLabel;
	static Label studiesAreaGroupLabel;
	static Label graduationLabel;
	static Label firstScoreLabel;
	static Label fourthScoreLabel;
	static Label resultLabel;
	static Label errorLabel;
	
	static TextField firstTxtField;
	static TextField secondTxtField;
	static TextField thirdTxtField;
	static TextField fourthTxtField;
	
	static CheckBox VfCheckBox;
    static CheckBox VnfCheckBox;
	
    static HBox check_HBox;
    static HBox languegeHBox;
    static HBox submitHBox;
    
    static VBox errorVBox;
    
    static ToggleGroup languageTglBtn;
    
    static RadioButton MRadioBtn;
    static RadioButton VRadioBtn;
    
    static Button calculateBtn;
    
    
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage stage)throws IOException {
     stage.setTitle("Konkursinio balo skaiciuokle");
     Scene scene = new Scene(SceneView.createScrollPane(), Region.USE_PREF_SIZE, Region.USE_PREF_SIZE);
     Functionality.setOnAction ();
     Functionality.getValues ();
     stage.setScene(scene);
     stage.show();
	}
		
}
