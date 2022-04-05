import java.util.HashMap;


public class Cor
{
    public int r;
    public int g;
    public int b;
    
    private static HashMap<Integer, Cor> cores = new HashMap<Integer, Cor>();
    

    private Cor(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
    

    public static Cor rgb(double r, double g, double b) {
        return Cor.rgb((int)(r*255), (int)(g*255), (int)(b*255));
    }
    
    public static Cor rgb(int r, int g, int b) {
        int indice = (r << 16) | (g << 8) | b;
        if(!cores.containsKey(indice)) {
            cores.put(indice, new Cor(r, g, b));
        }
        return cores.get(indice);
    }
    
    public static Cor BRANCO = Cor.rgb(1.0, 1.0, 1.0);
    public static Cor AZUL = Cor.rgb(0.0, 0.0, 1.0);
    public static Cor VERMELHO = Cor.rgb(1.0, 0.0, 0.0);
    public static Cor VERDE = Cor.rgb(0.0, 1.0, 0.0);
}
