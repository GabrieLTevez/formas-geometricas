package a1;

public class Quadrado extends FormaBidimensional {
    private double lado;

    public Quadrado(String cor, double x, double y, double lado) {
        super(cor, x, y);
        this.lado = lado;
    }

    @Override 
    public double obterArea() {
        return lado * lado;
    }

    @Override
    public String exibirDescricao() {
        return super.exibirDescricao() + "Quadrado" +
               "\n Lado: " + lado + 
               "\n Area: " + String.format("%.2f", obterArea()) + 
               "\n Cor: " + getCor() + 
               "\n Centro (X,Y): (" + getX() + ", " + getY() + ")";
    }
}
