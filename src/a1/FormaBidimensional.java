package a1;

public abstract class FormaBidimensional extends Forma {
    public FormaBidimensional(String cor, double x, double y) {
        super(cor, x, y);
    }

    public abstract double obterArea();

    public String exibirArea() {
        return "Area: " + String.format("%.2f", obterArea());
    }
}
