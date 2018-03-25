package com.dance;

import java.util.ArrayList;

public class Dance {
	//interaction
		private ArrayList<String> steps;
		private int currentStep; //index
		private boolean finishedSong;
		private boolean atBeginning ;
	
	public Dance(ArrayList<String> steps) {
		this.steps = steps;
		currentStep = 0;
		finishedSong = false;
		atBeginning = true;
	}
	
	public void goToNextStep() {
		setCurrentStep(currentStep+1);
	}
	
	public void goToPrevStep() {
		setCurrentStep(currentStep-1);
	}
	
	public void startOver() {
		setCurrentStep(0);
	}
	
	public boolean getFinishedSong() {
		return finishedSong;
	}
	
	public boolean getAtBeginning() {
		return atBeginning;
	}
	
	public void setCurrentStep(int step) {
		finishedSong = false;
		atBeginning = true;
		
		if(step >= 0 && step <= (steps.size()-1)) //out of bounds
		{
			currentStep = step;
		}
		
		if(step == (steps.size()-1)) //special case last one
		{
			finishedSong = true;
		}
		
		if(step == 0) //special case first one
		{
			atBeginning = true;
		}
	}
	
	public ArrayList<String> review(int startAt, int endAt) {
		if(endAt == (steps.size()-1))
		{
			return (ArrayList<String>) steps.subList(startAt, endAt);
		}
		else
		{
			return (ArrayList<String>) steps.subList(startAt, endAt+1);
		}
	}
}
