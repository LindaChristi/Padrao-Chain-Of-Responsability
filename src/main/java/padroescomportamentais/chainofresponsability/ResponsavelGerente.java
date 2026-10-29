package padroescomportamentais.chainofresponsability;

public class ResponsavelGerente extends ResponsavelChamado {

    public ResponsavelGerente(ResponsavelChamado responsavelSuperior) {
        listaTiposChamado.add(TipoChamadoServidor.getTipoChamadoServidor());
        setResponsavelSuperior(responsavelSuperior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Gerente de TI";
    }
}
