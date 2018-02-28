package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class SceneView extends Main {
	public static GridPane createGridPane (){
		
		 grid = new GridPane();
	     {
	    	 grid.setPadding(new Insets(20, 20, 20, 20));
	    	 grid.setAlignment(Pos.CENTER);
	         grid.setVgap(7);
	         grid.setHgap(50);
	         
	         //=========================ComboBoxes=======================//
	         
   //comboBox for college selection
	         collegeComboBox = new ComboBox<>();
	         {
	        	 collegeLabel = new Label("Aukštoji mokykla:");
	             grid.add(collegeLabel, 0, 1);
	             //comboBox
	        	 collegeComboBox.getItems().addAll("--pasirinkti--", "Klaipedos valstybine kolegija");
	             collegeComboBox.setValue("--pasirinkti--");
	             collegeComboBox.setMaxWidth(200);
	             grid.add(collegeComboBox, 0, 2);
	         }
	     
	//comboBox for faculty
		     facultyComboBox = new ComboBox<>();
		     {
		    	 facultyLabel = new Label("Fakultetas:" );
		         grid.add(facultyLabel, 0,3);
		         //comboBox
		    	 facultyComboBox.getItems().addAll("--pasirinkti--", "Technologiju fakultetas");
		         facultyComboBox.setValue("--pasirinkti--");
		         facultyComboBox.setMaxWidth(200);
		         facultyComboBox.setDisable(true);
		         grid.add(facultyComboBox, 0, 4); 
		     }
	     
	//comboBox for group of study fields
		     studiesAreaGroupComboBox = new ComboBox<>();
		     {
		    	 studiesAreaGroupLabel = new Label("Studiju krypciu grupe:");
		         grid.add(studiesAreaGroupLabel, 0, 5);
		         //comboBox
		    	 studiesAreaGroupComboBox.getItems().addAll("--pasirinkti--", "Inžinerijos mokslai", "Informatikos mokslai", "Technologiju mokslai");
		         studiesAreaGroupComboBox.setValue("--pasirinkti--");
		         studiesAreaGroupComboBox.setMaxWidth(200);
		         studiesAreaGroupComboBox.setDisable(false);
		         studiesAreaGroupComboBox.setDisable(true);
		         grid.add(studiesAreaGroupComboBox, 0, 6);
		     }
		     
	//comboBox for graduation school    
		     graduationComboBox = new ComboBox <>(); 
		     {
		    	 graduationLabel = new Label("Vidurini išsilavinima igijau:");
		         grid.add(graduationLabel, 0, 11);
		         //comboBox
		         graduationComboBox.getItems().addAll("--Pasirinkti--", "Vidurinio ugdymo mokykloje", "Profesineje/specialiojoje vidurineje/aukštesniojoje");
		         graduationComboBox.setValue("--Pasirinkti--");
		         graduationComboBox.setMaxWidth(200);
		         graduationComboBox.setDisable(true);
		    	 grid.add(graduationComboBox, 0, 12);
		     }
		     		     	     
	//comboBox for name of the study program    
		     studyProgramComboBox = new ComboBox <>(); 
		     {
		    	 Label studyProgramLabel = new Label("Studiju programos pavadinimas:");
		         grid.add(studyProgramLabel, 0, 7);
		         //comboBox
		    	 studyProgramComboBox.setMaxWidth(200);
		    	 studyProgramComboBox.setDisable(true);
		    	 grid.add(studyProgramComboBox, 0, 8);
		     }
		         
	//VF / VNF
		     VfCheckBox = new CheckBox("*VF");
		     VnfCheckBox = new CheckBox("*VNF");		    
		     		     
	//HBox for checkBoxes
		     check_HBox = new HBox(10);
		     {
		    	 check_HBox.setAlignment(Pos.BOTTOM_LEFT);
		    	 check_HBox.getChildren().addAll(VfCheckBox, VnfCheckBox);
		    	 check_HBox.setDisable(true);
		    	 grid.add(check_HBox, 0, 9);
		     }
		     
	//second score ComboBox
	    	 secondScoreComboBox = new ComboBox <>();
	    	 {	 
	    		 secondScoreComboBox.setDisable(true);
	    		 secondScoreComboBox.setMaxWidth(100);
	    		 grid.add(secondScoreComboBox, 1, 2);	    		 
	    	 }
		    	    	 
	 //third score ComboBox 		for freely chosen thing    
		     thirdScoreComboBox = new ComboBox <>(); 
		     {
		    	 thirdScoreComboBox.setDisable(true);
		    	 thirdScoreComboBox.setValue("--*LPD--");
		         thirdScoreComboBox.setMaxWidth(100);
		    	 grid.add(thirdScoreComboBox, 1, 3); 
		     }
		     
		     	//=============================Labels==========================//
		     
	//first score Label
		    	 firstScoreLabel = new Label();
		    	 firstScoreLabel.setDisable(true);
		    	 grid.add(firstScoreLabel, 1, 1);
		    	 
	//fourth score Label
			     fourthScoreLabel = new Label("Lietuviu kalba: ");
			     fourthScoreLabel.setDisable(true);
		    	 grid.add(fourthScoreLabel, 1, 4);
		    	 
		    	 //==========================TextFields====================//
		    	 
	//text field 1
		    	 firstTxtField = new TextField();
		    	 firstTxtField.setDisable(true);
		    	 firstTxtField.setMaxWidth(40);
		    	 grid.add(firstTxtField, 2, 1);
		     
	//text field 2
	    		 secondTxtField = new TextField();
	    		 secondTxtField.setDisable(true);
	    		 secondTxtField.setMaxWidth(40);
	    		 grid.add(secondTxtField, 2, 2);
	    		 
	//text field 3
		    	 thirdTxtField = new TextField();
	    		 thirdTxtField.setDisable(true);
		    	 thirdTxtField.setMaxWidth(40);
		    	 grid.add(thirdTxtField, 2, 3);
		    	 
	//text field 4
		    	 fourthTxtField = new TextField();
		    	 fourthTxtField.setDisable(true);
		    	 fourthTxtField.setMaxWidth(40);
		    	 grid.add(fourthTxtField, 2, 4);
		    	 
		    	 //==================================HBox=====================//
		    	 
	//fourth score HBox (RadioButton)
			    languegeHBox = new HBox(10);
			     {	    	 
			    	 languegeHBox.setDisable(true);
			    	 languageTglBtn = new ToggleGroup();
			    	 {		    	 
			    		 MRadioBtn = new RadioButton("M");
			    		 MRadioBtn.setToggleGroup(languageTglBtn);
			    		 
				    	 VRadioBtn = new RadioButton("V");
				    	 VRadioBtn.setToggleGroup(languageTglBtn);
				    	 
				    	 languegeHBox.getChildren().addAll(MRadioBtn, VRadioBtn);
			    	 } 	
			    	 grid.add(languegeHBox, 2, 5);
			     }
			     
	//HBox for submit button and score
			     submitHBox = new HBox(20);
			     {
			    	 calculateBtn = new Button("Skaiciuoti");
			    	 resultLabel = new Label();
				     resultLabel.setFont(new Font(20));
				     
				     submitHBox.getChildren().addAll(calculateBtn, resultLabel);
				     grid.add(submitHBox, 1, 7, 2, 7);
			     }
		    		     		     
	//Separator
			     grid.add(new Separator(), 0, 14, 3, 1);
			     grid.add(new Separator(), 1, 5, 2, 3);
			     
	//VBox for errors messages
			     errorVBox = new VBox();
			     {
			    	 errorLabel = new Label();
			    	 errorVBox.getChildren().add(errorLabel);
			    	 grid.add(errorVBox, 1, 9, 2, 10);
			     }
			     		     
	//explanation of words
			     Label vf = new Label("*VF - pretenduojama i valstybes finansuojama vieta");
			     grid.add(vf, 0, 13, 3, 13);
			     Label vnf = new Label("*VNF - pretenduojama i valstybes nefinansuojama vieta");
			     grid.add(vnf, 0, 14, 3, 14);
			     Label lpd = new Label("*LPD - lengvai pasirenkamas dalykas (kuris nesutampa su pirmu ir antru dalyku)");
			     grid.add(lpd, 0, 15, 3, 15);
			     Label mV = new Label("*M - laikyto lietuviu kalbos egzamino tipas - mokyklinis");
			     grid.add(mV, 0, 16, 3, 16);
			     Label vV = new Label("*V - laikyto lietuviu kalbos egzamino tipas - valstybinis");
			     grid.add(vV, 0, 17, 3, 17);
	     }	     		
	     
		return grid;
	}
	
	
	 public static ScrollPane createScrollPane() 
	 {
	    	ScrollPane scrollPane = new ScrollPane();
	    	{
	    		scrollPane.setFitToWidth(true);
	    		scrollPane.setContent(createGridPane());
	    	}
	    	return scrollPane;
	 }
}
