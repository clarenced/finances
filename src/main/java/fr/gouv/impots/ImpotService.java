package fr.gouv.impots;

public class ImpotService {

    private final PourcentageImpotsVisitor pourcentageImpotsVisitor;

    public ImpotService(PourcentageImpotsVisitor pourcentageImpotsVisitor) {
        this.pourcentageImpotsVisitor = pourcentageImpotsVisitor;
    }

    public int calculImpots(Entreprise entreprise) {
        return entreprise.accept(pourcentageImpotsVisitor);
    }
}
