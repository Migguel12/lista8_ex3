public class Retangulo {
    private double base;
    private double altura;

    public void mudarBase(double novaBase){
        base = novaBase;  
    }
    public void mudarAltura(double novaAltura){
        altura = novaAltura;
    }

    public double mostraBase(){
        return base;
    }
    public double mostraAltura(){
        return altura;
    }

    public void calcularArea(){
        double area = base * altura;
        System.out.println(area);
    }
    public void calcularPerimetro(){
        double perimetro = base + base + altura + altura;
        System.out.println(perimetro);
    }
}
