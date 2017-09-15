package com.upto.application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class LoginController {
	@FXML
	private BorderPane page;

	private int chiffre;
		
	private Label messageerreur;
	
	
	Toto monToto;
	
	public LoginController(){
		
	}
	

	
	void nommerMonToto(){
		//Maniere de nommer une fonction
		
	
		monToto = new Toto();
		//Autre maniere de nommer une fonction
		
		System.out.println("Mon Toto est initialisé");
			
	}
}
