package Principal;

import ClasesPersonas.Persona;

public class principal {
    public static void main(String[] args) {
        Persona mujer1 = new Persona("Katherine");
        mujer1.setNombre("Katherine");
        mujer1.setDescripcion("Humana que está aprendiendo programación 😊");

        System.out.println(mujer1.getNombre());
        System.out.println(mujer1.getDescripcion());

        System.out.println(mujer1);
    }
}
