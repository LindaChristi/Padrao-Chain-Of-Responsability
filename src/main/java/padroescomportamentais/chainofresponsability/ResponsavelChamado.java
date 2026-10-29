package padroescomportamentais.chainofresponsability;

import java.util.ArrayList;

public abstract class ResponsavelChamado {

    protected ArrayList listaTiposChamado = new ArrayList();
    private ResponsavelChamado responsavelSuperior;

    public ResponsavelChamado getResponsavelSuperior() {
        return responsavelSuperior;
    }

    public void setResponsavelSuperior(ResponsavelChamado responsavelSuperior) {
        this.responsavelSuperior = responsavelSuperior;
    }

    public abstract String getDescricaoCargo();

    public String resolverChamado(Chamado chamado) {
        if (listaTiposChamado.contains(chamado.getTipoChamado())) {
            return getDescricaoCargo();
        } else {
            if (responsavelSuperior != null) {
                return responsavelSuperior.resolverChamado(chamado);
            } else {
                return "Chamado não resolvido";
            }
        }
    }
}
