package a1;

public class Tetraedro extends FormaTridimensional {
    private double base; 
    private double baseAltura; 
    private double altura; 

    public Tetraedro(String cor, double x, double y, double z, double base, double baseAltura, double altura) {
        super(cor, x, y, z);
        this.base = base;
        this.baseAltura = baseAltura;
        this.altura = altura;
    }

    @Override 
    public double obterVolume() {
        double areaBase = (base * baseAltura) / 2.0;
        return (1.0 / 3.0) * areaBase * altura;
    }

    @Override
    public String exibirDescricao() {
        return super.exibirDescricao() + "Tetraedro" +
               "\n Base: " + base + 
               "\n Altura da base: " + baseAltura + 
               "\n Altura: " + altura + 
               "\n Volume: " + String.format("%.2f", obterVolume()) + 
               "\n Cor: " + getCor() + 
               "\n Centro (X,Y,Z): (" + getX() + ", " + getY() + ", " + getZ() + ")";
    }
}
