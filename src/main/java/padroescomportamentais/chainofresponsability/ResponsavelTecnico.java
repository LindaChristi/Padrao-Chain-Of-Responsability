package padroescomportamentais.chainofresponsability;

public class ResponsavelTecnico extends ResponsavelChamado {

    public ResponsavelTecnico(ResponsavelChamado responsavelSuperior) {
        listaTiposChamado.add(TipoChamadoSoftware.getTipoChamadoSoftware());
        setResponsavelSuperior(responsavelSuperior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Técnico de TI";
    }
}
