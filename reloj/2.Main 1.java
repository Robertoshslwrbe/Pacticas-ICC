// Clase Main que prueba el comportamiento del reloj (requisito 4)
public class Main {
    public static void main(String[] args) {
        // Se inicia el reloj en 23:58 para ver el efecto de reseteo
        Reloj reloj = new Reloj(23, 58);
        
        System.out.println("Simulación con ciclo FOR:");
        // Uso del ciclo FOR para simular 5 incrementos
        for (int i = 0; i < 5; i++) {
            System.out.println(reloj.toString());
            reloj.incrementar();
        }
        
        // Reiniciamos el reloj a 23:58 para la siguiente simulación
        reloj = new Reloj(23, 58);
        System.out.println("\nSimulación con ciclo WHILE:");
        int contador = 0;
        // Uso del ciclo WHILE para simular 5 incrementos
        while (contador < 5) {
            System.out.println(reloj.toString());
            reloj.incrementar();
            contador++;
        }
        
        // Reiniciamos nuevamente el reloj a 23:58 para la última simulación
        reloj = new Reloj(23, 58);
        System.out.println("\nSimulación con ciclo DO-WHILE:");
        contador = 0;
        // Uso del ciclo DO-WHILE para simular 5 incrementos
        do {
            System.out.println(reloj.toString());
            reloj.incrementar();
            contador++;
        } while (contador < 5);
    }
}
