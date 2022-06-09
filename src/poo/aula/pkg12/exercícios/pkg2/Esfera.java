package poo.aula.pkg12.exercícios.pkg2;

public class Esfera extends FormaTresDimensoes {
    
    private double raio;
    
    public Esfera(String nome, double raio) {
        
        super(nome);
        this.raio = raio;
        
    }
    @Override
    public double calcularVolume() {
        
        return 4 * Math.PI * Math.pow(raio, 3);
        
    }
    
}
