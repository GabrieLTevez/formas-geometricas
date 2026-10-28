package a1;

public abstract class Forma {
    private String cor; 
    private double x; 
    private double y;

    public Forma(String cor, double x, double y) {
        this.cor = cor;
        this.x = x;
        this.y = y;
    }

    public String exibirDescricao() {
        return "Descricao: ";
    }

    public String getCor() { return cor; }
    public double getX() { return x; }
    public double getY() { return y; }
}
