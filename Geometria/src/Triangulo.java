
public class Triangulo extends FigurasGeometricas{
	float base = 0;
	//parametro es = altura
	
	@Override
	public float area(){
		
		return (this.parametro*base)/2;
	}

}
