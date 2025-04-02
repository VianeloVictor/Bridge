package MainApp;

public class Moto extends Veiculo {
    public Moto(Combustivel combustivel) {
        super(combustivel);
    }

    public String getTipoVeiculo(){
        return "Moto";
    }

}