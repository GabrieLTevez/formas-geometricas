package a1;

public abstract class FormaTridimensional extends Forma {
    private double z;

    public FormaTridimensional(String cor, double x, double y, double z) {
        super(cor, x, y);
        this.z = z;
    }

    public double getZ() { return z; }

    public abstract double obterVolume();

    public String exibirVolume() {
        return "Volume: " + String.format("%.2f", obterVolume());
    }
}
