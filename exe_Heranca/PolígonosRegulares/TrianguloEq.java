package exe1;

public class TrianguloEq extends PolReg {
	
	public TrianguloEq() {	
	}
	
	public double calcArea(int numLados, double tamLado){
		double area = (Math.pow(getTamLado(), 2)*Math.sqrt(3))/4;
		return area;
	}
}
