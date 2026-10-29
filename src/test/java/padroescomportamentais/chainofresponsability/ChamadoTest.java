package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChamadoTest {

    ResponsavelGerente gerente;
    ResponsavelCoordenador coordenador;
    ResponsavelTecnico tecnico;
    ResponsavelAtendente atendente;

    @BeforeEach
    void setUp() {
        gerente = new ResponsavelGerente(null);
        coordenador = new ResponsavelCoordenador(gerente);
        tecnico = new ResponsavelTecnico(coordenador);
        atendente = new ResponsavelAtendente(tecnico);
    }

    @Test
    void deveRetornarAtendenteParaChamadoAcesso() {
        assertEquals("Atendente de Suporte", atendente.resolverChamado(new Chamado(TipoChamadoAcesso.getTipoChamadoAcesso())));
    }

    @Test
    void deveRetornarTecnicoParaChamadoSoftware() {
        assertEquals("Técnico de TI", atendente.resolverChamado(new Chamado(TipoChamadoSoftware.getTipoChamadoSoftware())));
    }

    @Test
    void deveRetornarCoordenadorParaChamadoRede() {
        assertEquals("Coordenador de TI", atendente.resolverChamado(new Chamado(TipoChamadoRede.getTipoChamadoRede())));
    }

    @Test
    void deveRetornarGerenteParaChamadoServidor() {
        assertEquals("Gerente de TI", atendente.resolverChamado(new Chamado(TipoChamadoServidor.getTipoChamadoServidor())));
    }

    @Test
    void deveRetornarChamadoNaoResolvido() {
        assertEquals("Chamado não resolvido", atendente.resolverChamado(new Chamado(TipoChamadoImpressora.getTipoChamadoImpressora())));
    }
}