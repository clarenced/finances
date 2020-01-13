package fr.gouv.impots;

public class Impots {

    public static void main(String[] args) {
        PourcentageImpotsVisitor pourcentageImpotsVisitor = new PourcentageImpotsVisitorImpl();
        ImpotService impotService = new ImpotService(pourcentageImpotsVisitor);

        Entreprise entreprise = new AutoEntreprise("12345", "Ceetiz", 1_000_000);
        System.out.println(impotService.calculImpots(entreprise));

        Entreprise societes = new SocieteActionSimplifies("54321", "My company", 2_000_000, "rue DuPond Paris");
        System.out.println(impotService.calculImpots(societes));
    }
}
