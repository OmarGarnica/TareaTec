package tarea;

public class Vendedor {

	private String nombre;
	private float ventaLunes;
	private float ventaMartes;
	private float ventaMiercoles;
	private float ventaJueves;
	private float ventaViernes;
	private float ventaSabado;
	private float ventaDomingo;
	private boolean rebasaPromedio = false;
	
	public Vendedor( String nombre, 
			float vLun, float vMar, float vMie, float vJue, float vVie, float vSab, float vDom ) {
		
		this.nombre = nombre;
		
		this.ventaLunes = vLun;
		this.ventaMartes = vMar;
		this.ventaMiercoles = vMie;
		this.ventaJueves = vJue;
		this.ventaViernes = vVie;
		this.ventaSabado = vSab;
		this.ventaDomingo = vDom;
		
	}
	
	public double getTotalSemana() {
		
		return 
			(this.ventaLunes + this.ventaMartes + this.ventaMiercoles + this.ventaJueves + this.ventaViernes + 
					this.ventaSabado + this.ventaDomingo );
	}
	
	public String getNombreVendedor() {
		
		return this.nombre;
	}
	
	public double getPromedioSemana() {
		
		return this.getTotalSemana() / 7;
	}
	
	public static void main( String[] args ) {
		
		String[] nombresVendedores = { 
				"pancrasio", "maclovio", "masiosare", "estroncio", "escalimetro", 
				"chilaquil", "romeritos", "doroteo", "argumento", "bipolar" };
		
		Vendedor[] vendedores = new Vendedor[ 10 ];
		
			
		vendedores[ 0 ] = new Vendedor( "pancrasio", 100, 100, 200, 0, 0, 500, 2000 );
		vendedores[ 1 ] = new Vendedor( "maclovio", 0, 100, 100, 0, 0, 500, 2000 );
		vendedores[ 2 ] = new Vendedor( "masiosare", 0, 100, 2000, 0, 0, 500, 2000 );
		vendedores[ 3 ] = new Vendedor( "estroncio", 0, 100, 2000, 0, 0, 500, 2800 );
		vendedores[ 4 ] = new Vendedor( "escalimetro", 0, 100, 3000, 0, 0, 500, 2000 );
		vendedores[ 5 ] = new Vendedor( "chilaquil", 0, 100, 200, 30, 0, 500, 2000 );
		vendedores[ 6 ] = new Vendedor( "romeritos", 0, 100, 200, 0, 50, 500, 2000 );
		vendedores[ 7 ] = new Vendedor( "doroteo", 0, 100, 200, 0, 0, 5500, 2000 );
		vendedores[ 8 ] = new Vendedor( "argumento", 0, 100, 200, 0, 0, 1500, 2000 );
		vendedores[ 9 ] = new Vendedor( "psicodelico", 10, 900, 200, 0, 0, 1500, 2000 );
		
		double promedio = 0;
		
		double maximoSemana = 0;
		
		int indiceEstrella = 0;
		
		for( int i=0; i<vendedores.length; i++ ) {
			
			Vendedor x = vendedores[ i ];
			
			promedio += x.getPromedioSemana();
			
			System.out.println( " el vendedor " + x.getNombreVendedor() + " vendió en una semana: " + x.getTotalSemana() );
			System.out.println( " su promedio de la semana fué de : " + x.getPromedioSemana() );
			
			if( maximoSemana < x.getTotalSemana() ) {
				
				maximoSemana = x.getTotalSemana();
				indiceEstrella = i;
			}			
			
		}
		
		promedio = promedio / 10;
		

		System.out.println( " el vendedor estrella de la semana es " + vendedores[ indiceEstrella ].getNombreVendedor() );
		System.out.println( "ya que fué quien mas vendió: " + vendedores[ indiceEstrella ].getTotalSemana() );
		
		
	}
	
}
