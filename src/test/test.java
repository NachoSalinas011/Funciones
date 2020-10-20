package test;

import java.time.LocalDate;

import modelo.Funciones;

public class test {

	public static void main(String[] args) {
		System.out.println("Es dia habil?: "+Funciones.esDiaHabil(LocalDate.of(2020, 10, 18)));
	}
}
