package MainApp;

public class Carro extends Veiculo {

    public Carro(Combustivel combustivel) {
        super(combustivel);
    }

    public String getTipoVeiculo(){
        return "Carro";
    }

}
