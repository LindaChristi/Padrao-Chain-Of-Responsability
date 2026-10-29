package padroescomportamentais.chainofresponsability;

public class ResponsavelAtendente extends ResponsavelChamado {

    public ResponsavelAtendente(ResponsavelChamado responsavelSuperior) {
        listaTiposChamado.add(TipoChamadoAcesso.getTipoChamadoAcesso());
        setResponsavelSuperior(responsavelSuperior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Atendente de Suporte";
    }
}