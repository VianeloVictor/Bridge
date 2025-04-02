package MainApp;

public abstract class Veiculo {

    protected Combustivel combustivel;

    public Veiculo(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public String getTipoCombustivel(){
        return combustivel.getTipo();
    }

    public abstract String getTipoVeiculo();
}
