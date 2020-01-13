package fr.gouv.impots;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImpotServiceTest {

    @Test
    public void impots_doit_etre_25_pourent_pour_auto_entreprise(){
        ImpotService impotService = new ImpotService();
        AutoEntreprise autoEntreprise = new AutoEntreprise();
        autoEntreprise.setSiret("123455");
        autoEntreprise.setDenomination("My auto company");
        autoEntreprise.setChiffreAffaires(1_000_000);

        int montantImpots = impotService.calculImpots(autoEntreprise);
        Assertions.assertEquals(montantImpots, 250_000);
    }
}
