package application;

import javafx.scene.control.TextField;

public class Functionality extends Main {

	
	public static void setOnAction ()
	{
//College selection
	     collegeComboBox.setOnAction(e -> {
       	 switch (collegeComboBox.getValue()){
       	 case "Klaipedos valstybine kolegija":
       		 facultyComboBox.setDisable(false);
       		 break;
       	 }
        });
	     
//faculty selection
	     facultyComboBox.setOnAction(e -> {
       	 switch (facultyComboBox.getValue()){
       	 case "Technologiju fakultetas":
       		 studiesAreaGroupComboBox.setDisable(false);
       		 break;
       	 }
        });
	     
	     
//studies area group selection
	     studiesAreaGroupComboBox.setOnAction(e -> {
       	 switch (studiesAreaGroupComboBox.getValue()){
       	 case "Inžinerijos mokslai": 
       		 studyProgramComboBox.getItems().clear();
       		 studyProgramComboBox.setValue("--Pasirinkti--");
       		 studyProgramComboBox.setDisable(false);
		    	 studyProgramComboBox.getItems().addAll("--Pasirinkti--", "Elektros ir automatikos inžinerija", "Geodezija", "Mechanikos inžinerija", "Statyba", "Automobiliu transporto inžinerija", "Transporto logistikos inžinerija");
       		 break;
       	 case  "Informatikos mokslai":
       		 studyProgramComboBox.getItems().clear();
       		 studyProgramComboBox.setValue("--Pasirinkti--");
       		 studyProgramComboBox.setDisable(false);
		    	 studyProgramComboBox.getItems().addAll("--Pasirinkti--", "Informatika", "Informatikos inžinerija");
		    	 break;
       	 case  "Technologiju mokslai":
       		 studyProgramComboBox.getItems().clear();
       		 studyProgramComboBox.setValue("--Pasirinkti--");
       		 studyProgramComboBox.setDisable(false);
		    	 studyProgramComboBox.getItems().addAll("--Pasirinkti--", "Maisto technologijos");
       		 break;
       	 }
        });
	     		     
//studies program selection	     
	     studyProgramComboBox.setOnAction(e -> {
       	 switch (studyProgramComboBox.getValue()){
       	 
       	 case "Elektros ir automatikos inžinerija":				    
       		String[] lessons6 = {"Fizika"};
       		setLessons (lessons6);
       		 break;
       		  
       	 case "Geodezija":
       		 String[] lessons = {"Fizika", "Chemija"};
       		setLessons (lessons);
       		 break;
       		 
       	 case "Mechanikos inžinerija":
       		String[] lessons2 = {"Fizika"};
       		setLessons (lessons2);
       		 break;
       		 
       	 case "Statyba":				    
       		String[] lessons3 = {"Fizika"};
       		setLessons (lessons3);
       		 break;
       		 
       	 case "Automobiliu transporto inžinerija":				    
       		String[] lessons4 = {"Fizika"};
       		setLessons (lessons4);
       		 break;
       		 
       	 case "Transporto logistikos inžinerija":				    
       		String[] lessons5 = {"Fizika"};
       		setLessons (lessons5);
       		 break;
       		 
       		 //IT science
       	 case "Informatika":
       		String[] lessons7 = {"Fizika", "Informacines tech."};
       		setLessons(lessons7);
       		 break;
       		       		 
       	 case "Informatikos inžinerija":
       		 String[] lessons8 = {"Fizika", "Informacines tech."};
       		setLessons(lessons8);
       		 break;
       		      		 
       	 case "Maisto technologijos":
       		String[] lessons9 = {"Chemija"};
       		setLessons (lessons9);
       		 break;
       	 }
        });
	     
//graduation school
	     graduationComboBox.setOnAction(e -> {
	       	 switch (graduationComboBox.getValue()){
	       	 case "Vidurinio ugdymo mokykloje":
	       		 if ((VfCheckBox.isSelected()==true)||VnfCheckBox.isSelected()==true)
	       		 {
	       			 errorLabel.setText("");
		       		firstTxtField.setDisable(false);
					firstScoreLabel.setDisable(false);
			   	 
					secondScoreComboBox.setDisable(false);
					secondTxtField.setDisable(false);
			   	 
					thirdScoreComboBox.setDisable(false);
					thirdTxtField.setDisable(false);
					 
					fourthTxtField.setDisable(false);
					fourthScoreLabel.setDisable(false);
								 
					languegeHBox.setDisable(false);
	       		 } else {
	       			 errorLabel.setText("Pasirinkite studiju finansavimo buda");
	       		 }
	       		 break;
	       	case "Profesineje/specialiojoje vidurineje/aukštesniojoje":
	       		 if ((VfCheckBox.isSelected()==true)||VnfCheckBox.isSelected()==true)
	       		 {
	       			 errorLabel.setText("");
		       		firstTxtField.setDisable(false);
					firstScoreLabel.setDisable(false);
			   	 
					secondScoreComboBox.setDisable(false);
					secondTxtField.setDisable(false);
			   	 
					thirdScoreComboBox.setDisable(false);
					thirdTxtField.setDisable(false);
					 
					fourthTxtField.setDisable(false);
					fourthScoreLabel.setDisable(false);
								 
					languegeHBox.setDisable(false);
	       		 } else {
	       			 errorLabel.setText("Klaida! \n Pasirinkite studiju finansavimo buda.");
	       		 }
	       		 break;
	       	 }
	        });

//fill a list of freely chosen lesson
	     secondScoreComboBox.setOnAction(e -> {
	       	 switch (secondScoreComboBox.getValue()){
	       	 case "Fizika":
	       		String[] lessons = {"--*LPD--", "Gimtoji kalba(baltarusiu, lenku, rusu, vokieciu)", "Užsienio kalba(anglu)", "Užsienio kalba(prancuzu)", "Užsienio kalba(rusu)", "Užsienio kalba(vokieciu)", "Kita užsienio kalba", "Informacines tech.", "Istorija", "Biologija", "Chemija", "Muzika", "Menai", "Geografija", "Technologijos", "Kuno kultura"};
				
		   		 thirdScoreComboBox.getItems().clear();
		   		 thirdScoreComboBox.setValue("--*LPD--");
		   		 thirdScoreComboBox.getItems().addAll(lessons);
	       		 break;
	       	case "Chemija":
	       		String[] lessons2 = {"--*LPD--", "Gimtoji kalba(baltarusiu, lenku, rusu, vokieciu)", "Užsienio kalba(anglu)", "Užsienio kalba(prancuzu)", "Užsienio kalba(rusu)", "Užsienio kalba(vokieciu)", "Kita užsienio kalba", "Informacines tech.", "Fizika", "Istorija", "Biologija", "Muzika", "Menai", "Geografija", "Technologijos", "Kuno kultura"};
		   		thirdScoreComboBox.getItems().clear();
			   	thirdScoreComboBox.setValue("--*LPD--");
			   	thirdScoreComboBox.getItems().addAll(lessons2);
	       		 break;
	       	case "Informacines tech.":
	       		String[] lessons3 = {"--*LPD--", "Gimtoji kalba(baltarusiu, lenku, rusu, vokieciu)", "Užsienio kalba(anglu)", "Užsienio kalba(prancuzu)", "Užsienio kalba(rusu)", "Užsienio kalba(vokieciu)", "Kita užsienio kalba", "Fizika", "Istorija", "Biologija", "Chemija", "Muzika", "Menai", "Geografija", "Technologijos", "Kuno kultura"};
		   		thirdScoreComboBox.getItems().clear();
			   	thirdScoreComboBox.setValue("--*LPD--");
			   	thirdScoreComboBox.getItems().addAll(lessons3);
	       		 break;
	       	 }
	        });
	}
	
//fill secondScoreComboBox with lessons
	public static void setLessons (String[] lesson){
	
		graduationComboBox.setDisable(false);
		check_HBox.setDisable(false);
		
		secondScoreComboBox.getItems().clear();
		firstScoreLabel.setText("Matematika:");
		secondScoreComboBox.getItems().addAll(lesson);
		secondScoreComboBox.setValue("Pasirinkti");	 
	}	
	
	public static void getValues (){
			
			calculateBtn.setOnAction(e -> calculations
					(firstTxtField, firstTxtField.getText(),
					 secondTxtField, secondTxtField.getText(),
					 thirdTxtField, thirdTxtField.getText(),
					 fourthTxtField, secondTxtField.getText()
					));
		}
 
	
	public static boolean calculations (TextField input, String message, TextField input2, String message2, TextField input3, String message3, TextField input4, String message4){
		
		try{
			int firstScore = Integer.parseInt(input.getText());
			int secondScore = Integer.parseInt(input2.getText());
			int thirdScore = Integer.parseInt(input3.getText());
			int fourthScore = Integer.parseInt(input4.getText());
			
			String secondScoreCBox = secondScoreComboBox.getValue().toString();
			String thirdScoreCBox = thirdScoreComboBox.getValue().toString();
			String graduationCBox = graduationComboBox.getValue().toString();
			
			int firstFieldValue = Integer.parseInt(firstTxtField.getText());
			int secondFieldValue = Integer.parseInt(secondTxtField.getText()); 
			int thirdFieldValue = Integer.parseInt(thirdTxtField.getText()); 
			int fourthFieldValue = Integer.parseInt(fourthTxtField.getText()); 

			if (!secondScoreCBox.equals("Pasirinkti"))
			{
					if (!thirdScoreCBox.equals("--*LPD--"))
					{
							if(VRadioBtn.isSelected()==true || MRadioBtn.isSelected()==true)
							{
									if(VRadioBtn.isSelected()==true)
									{
										if((firstFieldValue <= 100)&&(secondFieldValue <= 100)&&(thirdFieldValue <= 100)&&(fourthFieldValue <= 100))
										{
												if ((graduationCBox.equals("Profesineje/specialiojoje vidurineje/aukštesniojoje"))&&(VnfCheckBox.isSelected()==true))
												{
													
													double finalResult = ((firstScore * 0.4)+(secondScore * 0.2)+(thirdScore * 0.2)+(fourthScore * 0.2))/10 ;
													finalResult = Math.round(finalResult*100.0)/100.0;
													if (finalResult <= 10)
													{
														if(finalResult <= 9)
														{
															double finalResult2 = finalResult + 1;
															resultLabel.setText("Balas: " + finalResult2);
															errorLabel.setText("");	
														}
														else{resultLabel.setText("Balas: " + finalResult); errorLabel.setText("");}
													} 
													else {resultLabel.setText("Klaida!"); errorLabel.setText("Neteisingi iverinimo balai.");}
												} 
												else
												{

													double finalResult = ((firstScore * 0.4)+(secondScore * 0.2)+(thirdScore * 0.2)+(fourthScore * 0.2))/10;
													finalResult = Math.round(finalResult*100.0)/100.0;
													if (finalResult <= 10)
													{
														resultLabel.setText("Balas: " + finalResult);
														errorLabel.setText("");
													} 
													else {resultLabel.setText("Klaida!"); errorLabel.setText("Neteisingi iverinimo balai.");}
												}
										}else{errorLabel.setText("Ivertinimo balai negali \n buti didesni nei 100."); resultLabel.setText("Klaida");}
									}
									else 
									{
										if((firstFieldValue <= 100)&&(secondFieldValue <= 100)&&(thirdFieldValue <= 100))
										{
											
											if(fourthScore <= 10)
											{
												if ((graduationCBox.equals("Profesineje/specialiojoje vidurineje/aukštesniojoje"))&&(VnfCheckBox.isSelected()==true))
												{
													
													double finalResult = ((firstScore * 0.4)+(secondScore * 0.2)+(thirdScore * 0.2)) / 10 +(fourthScore * 0.2) ;
													finalResult = Math.round(finalResult*100.0)/100.0;
													
													if (finalResult <= 10)
													{
														if(finalResult <= 9)
														{
															double finalResult2 = finalResult + 1;
															resultLabel.setText("Balas: " + finalResult2);
															errorLabel.setText("");	
														}
														else{resultLabel.setText("Balas: " + finalResult); errorLabel.setText("");}
													} 
													else {resultLabel.setText("Klaida!"); errorLabel.setText("Neteisingi iverinimo balai.");}
												} 
												else
												{
													double finalResult = ((firstScore * 0.4)+(secondScore * 0.2)+(thirdScore * 0.2)) / 10 +(fourthScore * 0.2) ;				
													finalResult = Math.round(finalResult*100.0)/100.0;
													if (finalResult <= 10)
													{
														resultLabel.setText("Balas: " + finalResult);
														errorLabel.setText("");
													} 
													else {resultLabel.setText("Klaida!"); errorLabel.setText("Neteisingi iverinimo balai.");}
												}
											}else{errorLabel.setText("Lietuviu kalbos egzaminas \n vertinamas pažymiu iki 10."); resultLabel.setText("Klaida!");}	
										}else {errorLabel.setText("Ivertinimo balai negali \n buti didesni nei 100."); resultLabel.setText("Klaida");}
									}	
							}
							else{resultLabel.setText("Klaida!"); errorLabel.setText("Pasirinkite Lietuviu kalbos \n egzamino tipa.");}	
					}
					else { resultLabel.setText("Klaida!"); errorLabel.setText("Nepasirinktas LPD.");}	
			}
			else {resultLabel.setText("Klaida!"); errorLabel.setText("Nepasirinktas antras dalykas.");}
							
			
			return true;
		}catch(NumberFormatException e){
			resultLabel.setText("Klaida!");
			errorLabel.setText("Ivertinima prašome ivesti skaiciais \n ir pasirinkti vertinamus dalykus.");
			return false;
		}
	}
	
}
