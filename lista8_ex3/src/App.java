import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe o tamanho da base: ");
        double base = ler.nextDouble();
        System.out.println("");

        System.out.print("Informe o tamanho da altura: ");
        double altura = ler.nextDouble();
        System.out.println("");

        ler.close();

        Retangulo retangulo = new Retangulo();
        retangulo.mudarBase(base);
        retangulo.mostraBase();
        retangulo.mudarAltura(altura);
        retangulo.mostraAltura();
        retangulo.calcularArea();
        retangulo.calcularPerimetro();

        
        

        

    }
}