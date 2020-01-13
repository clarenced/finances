package fr.gouv.impots;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ImpotServiceTest {

    private ImpotService impotService;

    @BeforeEach
    public void beforeEachTest(){
        PourcentageImpotsVisitor pourcentageImpotsVisitor = new PourcentageImpotsVisitorImpl();
        impotService = new ImpotService(pourcentageImpotsVisitor);
    }

    @Test
    public void montant_impots_doit_etre_25_pourent_pour_auto_entreprise(){
        Entreprise autoEntreprise = new AutoEntreprise("12345", "My auto company", 1_000_000);
        int montantImpots = impotService.calculImpots(autoEntreprise);
        Assertions.assertEquals(montantImpots, 250_000);
    }


    @Test
    public void montant_impots_33_pourcent_pour_SAS_entreprise(){
        Entreprise societes = new SocieteActionSimplifies("12345", "My company",
                1_000_000, "rue dupont Paris");
        int montantImpots = impotService.calculImpots(societes);
        Assertions.assertEquals(montantImpots, 330_000);
    }

}
