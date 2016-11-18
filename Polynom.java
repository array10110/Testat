
public class Polynom implements Function {

	private double [] factors = {1, 4, -2};
	/*Koeffizienten von rechts nach links, da i-Schleife
	 *Exponent hochzählt!  f(x)=-2x^2+4x+1 
	 */
	
	public Polynom(double [] newFactors){
		factors = newFactors;
		
	}
	
	@Override
	public double calculateValue(double x) { //y-Wert für f(x)
		
		double value = 0;
		for(int i = 0; i < factors.length; i++){
			value = value + Math.pow(x, i+1)*factors[i];
		}
		
		return value;
	}

	@Override
	public double calculateDerivativeAtPoint(double x) { //y-Wert für f`(x)
		
		double value = 0;
		for(int i = 0; i < factors.length; i++){
			
			while(i < factors.length-1)
				value = value + Math.pow(x,i-1)*(factors[i]*i);
		}
		
		return value;
	}
	
	
	public String toString(){
		return "Polynom: "+factors[2]+" * x^2"+factors[1]+" * x"+factors[0];
		
	}

	
}
