package fr.gouv.impots;

public interface PourcentageImpotsVisitor {

    int getMontantImpotForAutoEntreprise(AutoEntreprise autoEntreprise);

     int getMontantImpotForSocietesActionSimplifies(SocieteActionSimplifies societeActionSimplifies);
}
