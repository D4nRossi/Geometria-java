package poo.aula.pkg12.exercícios.pkg2;

public class Tetraedro extends FormaTresDimensoes {
    
    private double aresta;
    
    public Tetraedro(String nome, double aresta) {
        
        super(nome);
        this.aresta = aresta;
        
    }
    @Override
    public double calcularVolume() {
        
        return (Math.pow(aresta, 3) * Math.sqrt(2)) / 12;
        
    }
    
}
