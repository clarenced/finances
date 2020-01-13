package fr.gouv.impots;

public class PourcentageImpotsVisitorImpl implements PourcentageImpotsVisitor {

    @Override
    public int getMontantImpotForAutoEntreprise(AutoEntreprise autoEntreprise){
        return (autoEntreprise.getChiffreAffaire() * 25 ) / 100;
    }

    @Override
     public int getMontantImpotForSocietesActionSimplifies(SocieteActionSimplifies societeActionSimplifies){
        return (societeActionSimplifies.getChiffreAffaire() * 33) / 100;
    }
}
