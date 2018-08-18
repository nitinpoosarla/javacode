package com.AJDG.DemoJunit;

public class Claculator 
{
	CalculatorService  serv;
	public Claculator(CalculatorService s)
{
  this.serv =s;		
}

	public long perform(int x, int y) {
		// TODO Auto-generated method stub
		int a = x,b = y;
		//return a+b;
       return serv.add(a,b)*a;
	}

}
