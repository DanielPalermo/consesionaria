package ar.edu.unju.fi.model;

public class TestGenerico {
	public static void main(String[] args) {
		GenericoDosAtributos<Integer, Integer> telefono = 
				new GenericoDosAtributos<Integer, Integer> (388, 1111);
		
		GenericoDosAtributos<String, String> documentoIdentidad = 
				new GenericoDosAtributos<String, String>("DNI", "M222");
		
		System.out.println(telefono.getNumero());
		
		System.out.println(documentoIdentidad.getCodigo());
	}
}
