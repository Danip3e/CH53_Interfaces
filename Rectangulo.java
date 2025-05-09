
public class Rectangulo implements FiguraGeometrica{
		private double altura;
		private String nombre;
		private double base;
		
		public Rectangulo(String nombre, double base, double altura) {
			super();
			this.base = base;
			this.altura = altura;
			this.nombre = nombre;
		}//constructor
		
		public double getBase() {
			return base;
		}//getBase

		public void setBase(double base) {
			this.base = base;
		}//setBase

		public double getAltura() {
			return altura;
		}//getAltura

		public void setAltura(double altura) {
			this.altura = altura;
		}//setAltura
		public String getNombre() {
			return nombre;
		}//getNombre

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}//setNombre


		public double calcularArea() {
			return base * altura;
		}//calcularArea

		public double calcularPerimetro() {
			return base * 2 + altura * 2;
		}//calcularPerimetro


		public String toString() {
			return "Rectangulo [base=" + base + ", altura=" + altura + ", nombre=" + nombre + "]";
		}//toString

	}//publicClassRectangulo

