package a1;

public class Circulo extends FormaBidimensional {
    private double raio;

    public Circulo(String cor, double x, double y, double raio) {
        super(cor, x, y);
        this.raio = raio;
    }

    public double getRaio() { return raio; }

    public boolean intercepta(Circulo outro) {
        double dist = Math.sqrt(Math.pow(this.getX() - outro.getX(), 2) + 
                                Math.pow(this.getY() - outro.getY(), 2));
        return dist <= (this.raio + outro.getRaio());
    }

    @Override 
    public double obterArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public String exibirDescricao() {
        return super.exibirDescricao() + "Circulo" +
               "\n Raio: " + raio + 
               "\n Area: " + String.format("%.2f", obterArea()) + 
               "\n Cor: " + getCor() + 
               "\n Centro (X,Y): (" + getX() + ", " + getY() + ")";
    }
}
