package com.inheritance;

interface Action
{
	public void shoot(int load);
	
}

interface ReverseAction
{
	public void loadoff(int load);
}

class Command implements Action, ReverseAction{

	@Override
	public void loadoff(int load) {
		// TODO Auto-generated method stub
		System.out.println(load + " kg of Canon ball is Loaded Off");
	}

	@Override
	public void shoot(int load) {
		// TODO Auto-generated method stub
		System.out.println(load + " kg of Canon ball is Loaded and Fired");
	
	}
	
}

// Multiple Inheritance 

public class Multiple {
	
	public static void main(String[] args) {
		Command cmd = new Command();
		
		cmd.shoot(100);
		cmd.loadoff(50);
	}
}
