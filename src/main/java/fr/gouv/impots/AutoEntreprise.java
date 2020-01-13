package fr.gouv.impots;

public class AutoEntreprise extends Entreprise {

    public AutoEntreprise(String siret, String denomination, int chiffreAffaire) {
        super(siret, denomination, chiffreAffaire);
    }

    @Override
    protected int accept(PourcentageImpotsVisitor pourcentageImpotsVisitor) {
        return pourcentageImpotsVisitor.getMontantImpotForAutoEntreprise(this);
    }
}

