package padroescomportamentais.chainofresponsability;

public class ResponsavelCoordenador extends ResponsavelChamado {

    public ResponsavelCoordenador(ResponsavelChamado responsavelSuperior) {
        listaTiposChamado.add(TipoChamadoRede.getTipoChamadoRede());
        setResponsavelSuperior(responsavelSuperior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Coordenador de TI";
    }
}
