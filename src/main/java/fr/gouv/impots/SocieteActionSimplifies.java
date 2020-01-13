package fr.gouv.impots;

public class SocieteActionSimplifies extends Entreprise {

    private final String siegeSocial;

    public SocieteActionSimplifies(String siret, String denomination, int chiffreAffaire) {
        super(siret, denomination, chiffreAffaire);
        this.siegeSocial = "";
    }

    public SocieteActionSimplifies(String siret, String denomination, int chiffreAffaire, String siegeSocial) {
        super(siret, denomination, chiffreAffaire);
        this.siegeSocial = siegeSocial;
    }

    @Override
    protected int accept(PourcentageImpotsVisitor pourcentageImpotsVisitor) {
        return pourcentageImpotsVisitor.getMontantImpotForSocietesActionSimplifies(this);
    }

    public String getSiegeSocial() {
        return siegeSocial;
    }
}
