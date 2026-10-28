package a1;

public class Cubo extends FormaTridimensional {
    private double lado; 

    public Cubo(String cor, double x, double y, double z, double lado) {
        super(cor, x, y, z);
        this.lado = lado;
    }

    @Override 
    public double obterVolume() {
        return Math.pow(lado, 3);
    }

    @Override
    public String exibirDescricao() {
        return super.exibirDescricao() + "Cubo" +
               "\n Lado: " + lado + 
               "\n Volume: " + String.format("%.2f", obterVolume()) + 
               "\n Cor: " + getCor() + 
               "\n Centro (X,Y,Z): (" + getX() + ", " + getY() + ", " + getZ() + ")";
    }
}
