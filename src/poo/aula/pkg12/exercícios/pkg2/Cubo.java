package poo.aula.pkg12.exercícios.pkg2;

public class Cubo extends FormaTresDimensoes {
    
    private double aresta;
    
    public Cubo(String nome, double aresta) {
        
        super(nome);
        this.aresta = aresta;
        
    }
    @Override
    public double calcularVolume() {
        
        return Math.pow(aresta, 3);
        
    }
    
}
