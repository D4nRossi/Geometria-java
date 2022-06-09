package poo.aula.pkg12.exercícios.pkg2;

public class Triangulo extends FormaDuasDimensoes {
    
    private double base;
    private double altura;
    
    public Triangulo(String nome, double base, double altura) {
        
        super(nome);
        this.base = base;
        this.altura = altura;
        
    }
    @Override
    public double calcularArea() {
        
        return base * altura;

        
    }
    
}
