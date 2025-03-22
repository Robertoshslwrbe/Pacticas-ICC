// Clase que modela el reloj
public class Reloj {
    private int hora;
    private int minuto;
    
    // Constructor que establece la hora y los minutos iniciales
    public Reloj(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }
    
    // Método para incrementar el minuto y, si es necesario, la hora
    public void incrementar() {
        this.minuto++;
        if (this.minuto >= 60) {
            this.minuto = 0;
            this.hora++;
            if (this.hora >= 24) {
                this.hora = 0; // Reinicia la hora al llegar a 24
            }
        }
    }
    
    // Método que retorna la cadena con el formato "HH:MM"
    @Override
    public String toString() {
        return String.format("%02d:%02d", this.hora, this.minuto);
    }
}
