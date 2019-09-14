package com.bridgelabz.DependencyInjectionAutowiringByNameHumanBody;

public class Human 
{
	private Heart heart;

	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Setter Method Called");
	}

	public void startPumping()
	{
		if(heart != null)
		{
			heart.pump();
		}
		else
		{
			System.out.println("Dead");
		}
	}
}

