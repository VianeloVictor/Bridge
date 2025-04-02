package MainApp;

public class CarroCorrida extends Veiculo {
    public CarroCorrida(Combustivel combustivel) {
        super(combustivel);
    }

    public String getTipoVeiculo(){
        return "CarroCorrida";
    }

}
