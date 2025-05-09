
public class Rombo  implements FiguraGeometrica{
	private String nombre;
	private double lado;
	private double DiagonalMenor;
	private double DiagonalMayor;
	
	public Rombo(String nombre, double lado, double d, double D) {
		super();
		this.nombre = nombre;
		this.lado = lado;
		DiagonalMenor = d;
		DiagonalMayor = D;
	}//constructor
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	public double getDiagonalMenor() {
		return DiagonalMenor;
	}


	public void setDiagonalMenor(double d) {
		DiagonalMenor = d;
	}


	public double getDiagonalMayor() {
		return DiagonalMayor;
	}


	public void setDiagonalMayor(double D) {
		DiagonalMayor = D;
	}



	@Override
	public String toString() {
		return "Rombo [nombre=" + nombre + ", lado=" + lado + ", DiagonalMenor=" + DiagonalMenor + ", DiagonalMayor="
				+ DiagonalMayor + "]";
	}


	public double calcularArea() {
		return ((DiagonalMayor*DiagonalMenor)/2);
	}

	public double calcularPerimetro() {
		return lado * 4;
	}




}
