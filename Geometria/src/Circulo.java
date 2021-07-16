
public class Circulo extends FigurasGeometricas{
	float pi = (float) 3.1416;
	@Override
	public float area(){
			
			return pi*(this.parametro*this.parametro);
		}
}
