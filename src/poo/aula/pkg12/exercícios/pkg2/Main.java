package poo.aula.pkg12.exercícios.pkg2;

public class Main {

    public static void main(String[] args) {
        
        Circulo c = new Circulo("Circulo", 4);
        Esfera e = new Esfera("Esfera", 4);
        Triangulo t = new Triangulo("Triângulo", 20, 20);
        Cubo cb = new Cubo("Cubo", 5);
        Tetraedro tt = new Tetraedro("Tetraedro", 4);
        
        if(e instanceof FormaTresDimensoes) {
            
            System.out.println("A esfera tem três dimensões!");
            
        }
        if(c instanceof FormaDuasDimensoes) {
            
            System.out.println("O circulo tem duas dimensões!");
            
        }
        if(t instanceof FormaDuasDimensoes) {
            
            System.out.println("O Triângulo tem duas dimensões!");
            
        }
        if(cb instanceof FormaTresDimensoes) {
            
            System.out.println("O Cubo tem três dimensões!");
            
        }
        if(tt instanceof FormaTresDimensoes) {
            
            System.out.println("O Tetraedro tem três dimensões!");
            
        }
        
    }
    
}
