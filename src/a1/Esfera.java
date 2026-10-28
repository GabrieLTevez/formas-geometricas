package a1;

public class Esfera extends FormaTridimensional {
    private double raio; 

    public Esfera(String cor, double x, double y, double z, double raio) {
        super(cor, x, y, z);
        this.raio = raio;
    }

    public double getRaio() { return raio; }

    public boolean intercepta(Esfera outra) {
        double dist = Math.sqrt(Math.pow(this.getX() - outra.getX(), 2) + 
                                Math.pow(this.getY() - outra.getY(), 2) + 
                                Math.pow(this.getZ() - outra.getZ(), 2));
        return dist <= (this.raio + outra.getRaio());
    }

    @Override 
    public double obterVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

    @Override
    public String exibirDescricao() {
        return super.exibirDescricao() + "Esfera" +
               "\n Raio: " + raio + 
               "\n Volume: " + String.format("%.2f", obterVolume()) + 
               "\n Cor: " + getCor() + 
               "\n Centro (X,Y,Z): (" + getX() + ", " + getY() + ", " + getZ() + ")";
    }
}
