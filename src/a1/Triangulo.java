package a1;

public class Triangulo extends FormaBidimensional {
    private double base; 
    private double altura;

    public Triangulo(String cor, double x, double y, double base, double altura) {
        super(cor, x, y);
        this.base = base;
        this.altura = altura;
    }

    @Override 
    public double obterArea() {
        return (base * altura) / 2.0;
    }

    @Override
    public String exibirDescricao() {
        return super.exibirDescricao() + "Triangulo" +
               "\n Base: " + base + 
               "\n Altura: " + altura +  
               "\n Area: " + String.format("%.2f", obterArea()) + 
               "\n Cor: " + getCor() + 
               "\n Centro (X,Y): (" + getX() + ", " + getY() + ")";
    }
}
