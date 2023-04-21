
public class EquipoDeComputacion
{
      private int numeroDeEquipo;
    private boolean disponible;

    public EquipoDeComputacion(int numeroDeEquipo) {
        this.numeroDeEquipo = numeroDeEquipo;
        disponible = true;
    }

    public int getNumeroDeEquipo() {
        return numeroDeEquipo;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
