
public class Main {

	public static void main(String[] args) {
	Triangulo t1 = new  Triangulo("Bermudas", 20, 10, 15);
  Cuadrado square = new Cuadrado("sq", 18);
	Rectangulo rect = new Rectangulo ("rect", 60, 40);
	Rombo romb = new Rombo ("Romb", 30, 15, 30);

	System.out.println(t1);
	Main.imprimirCalculos(t1);
	Main.imprimirCalculos(square);
	Main.imprimirCalculos(rect);
	Main.imprimirCalculos(romb);
	
	}
public static void imprimirCalculos(FiguraGeometrica t){
	System.out.println(t);
	System.out.println("+-------------------------+");
	System.out.println("| El área de [" + t.getNombre()
	+ "]");
	System.out.println("| es" + t.calcularArea());
	System.out.println("| El perímetro de ["+ t.getNombre()
	+ "]");
	System.out.println("| es " + t.calcularPerimetro());
	System.out.println("+--------------------------------+");
	}//imprimirCalculos
}
