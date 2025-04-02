package TestApp;

import MainApp.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VeiculoTest {
    @Test
    void deveRetornarCarroComGasolina() {
        Veiculo carro = new Carro(new Gasolina());
        assertEquals("Carro", carro.getTipoVeiculo());
        assertEquals("Gasolina", carro.getTipoCombustivel());
    }

    @Test
    void deveRetornarCarroEletrico() {
        Veiculo carro = new Carro(new Eletrico());
        assertEquals("Carro", carro.getTipoVeiculo());
        assertEquals("Elétrico", carro.getTipoCombustivel());
    }

    @Test
    void deveRetornarCarroEtanol() {
        Veiculo carro = new Carro(new Etanol());
        assertEquals("Carro", carro.getTipoVeiculo());
        assertEquals("Etanol", carro.getTipoCombustivel());
    }
    @Test
    void deveRetornarCaminhaoComDiesel(){
        Veiculo caminhao = new Caminhao(new Diesel());
        assertEquals("Caminhão", caminhao.getTipoVeiculo());
        assertEquals("Diesel", caminhao.getTipoCombustivel());
    }
    @Test
    void deveRetornarCaminhaoComGasolina(){
        Veiculo caminhao = new Caminhao(new Gasolina());
        assertEquals("Caminhão", caminhao.getTipoVeiculo());
        assertEquals("Gasolina", caminhao.getTipoCombustivel());
    }
    @Test
    void deveRetornarCaminhaoEletrico(){
        Veiculo caminhao = new Caminhao(new Eletrico());
        assertEquals("Caminhão", caminhao.getTipoVeiculo());
        assertEquals("Elétrico", caminhao.getTipoCombustivel());
    }
    @Test
    void deveRetornarCarroCorridaEtanol(){
        Veiculo carrocorrida = new CarroCorrida(new Etanol());
        assertEquals("CarroCorrida", carrocorrida.getTipoVeiculo());
        assertEquals("Etanol", carrocorrida.getTipoCombustivel());
    }
    @Test
    void deveRetornarMotoGasolina(){
        Veiculo moto = new Moto(new Gasolina());
        assertEquals("Moto", moto.getTipoVeiculo());
        assertEquals("Gasolina", moto.getTipoCombustivel());
    }
    @Test
    void deveRetornarMotoEtanol(){
        Veiculo moto = new Moto(new Etanol());
        assertEquals("Moto", moto.getTipoVeiculo());
        assertEquals("Etanol", moto.getTipoCombustivel());
    }
}