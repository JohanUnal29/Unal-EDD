package arreglo;

public class ArregloEncapsuladoApp {

	public static void main(String[] args) {
		
		// 1. Creamos arreglo con un tama�o de 30 elementos.
		int tamañoArreglo = 10;						// tama�o arreglo
		Arreglo arr;								// referencia arreglo
		arr = new Arreglo(tamañoArreglo);			// crea instancia de clase Arreglo. El constructor 
													// acepta como argumento el tama�o del arreglo
		
		// 2. Insertamos 10 elementos en arreglo
		arr.insertar(77);
		arr.insertar(99);
		arr.insertar(44);
		arr.insertar(55);
		arr.insertar(22);
		arr.insertar(88);
		arr.insertar(11);
		arr.insertar(0);
		arr.insertar(66);
		arr.insertar(33);
		
		// 3. Imprimimos los valores del arreglo en pantalla
		arr.mostrarElementos();
		
		// 4. Buscamos elemento en arreglo
		int valorBuscar = 35;						// valor a buscar
		if(arr.buscar(valorBuscar)) {
			System.out.println("Se encontro el valor " + valorBuscar);
		} else {
			System.out.println("No se encontro el valor " + valorBuscar);
		}
		
		// 5. Borramos 3 elementos del arreglo
		arr.eliminar(0);
		arr.eliminar(55);
		arr.eliminar(99);
		
		arr.insertar(0);
		arr.insertar(78);
		arr.insertar(44);
		
		// 6. Imprimimos valores del arreglo nuevamente
		arr.mostrarElementos();
	
	}

}
