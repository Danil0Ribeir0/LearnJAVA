package exe1;

public class PolReg {
	private int numLados;
	private double tamLado;
	
	public PolReg(){
	}
	
	public int getNumLados() {
		return numLados;
	}
	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}
	public double getTamLado() {
		return tamLado;
	}
	public void setTamLado(double tamLado) {
		this.tamLado = tamLado;
	}
	
	
	public double calcPer(int numLados, double tamLado){
		return numLados * tamLado;
	}
	public double calcAngInt(int numLados) {
		return (numLados - 2)*180;
	}
	public double calcArea(int numLados, double tamLado){
		return 0;
	}
}
