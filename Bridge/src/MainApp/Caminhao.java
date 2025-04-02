package MainApp;

public class Caminhao extends Veiculo {

    public Caminhao(Combustivel combustivel) {
        super(combustivel);
    }

    public String getTipoVeiculo(){
        return "Caminhão";
    }
}
