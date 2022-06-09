package poo.aula.pkg12.exercícios.pkg2;

public class Quadrado extends FormaDuasDimensoes{
    
    private double lado;
    
    public Quadrado (String nome, double lado) {
        
        super(nome);
        this.lado = lado;
        
    }
    @Override
    public double calcularArea() {
        
        return lado * lado;
        
    }
    
}
