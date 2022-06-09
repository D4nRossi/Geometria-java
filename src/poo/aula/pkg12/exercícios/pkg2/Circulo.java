package poo.aula.pkg12.exercícios.pkg2;

public class Circulo extends FormaDuasDimensoes {
    
    private double raio;
    
    public Circulo(String nome, double raio) {
        
        super(nome);
        this.raio = raio;
        
    }
    @Override
    public double calcularArea() {
        
        return Math.PI * Math.pow(raio, 2);
        
    }
    
}
