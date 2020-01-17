package fr.gouv.impots;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AutoEntrepriseTest {

    private static final String SIRET_NUMBER = "Siret number";
    public static final String AUTO_ENTREPRISE_NAME = "name 1";

    @Test
    public void two_auto_entreprises_with_same_siret_should_be_equal() {
        Entreprise autoEntreprise1 = new AutoEntreprise(SIRET_NUMBER, AUTO_ENTREPRISE_NAME, 10);
        Entreprise autoEntreprise2 = new AutoEntreprise(SIRET_NUMBER, "name 2", 20);

        assertEquals(autoEntreprise1, autoEntreprise2);
    }

    @Test
    public void create_an_auto_entreprise_with_null_siret_is_forbidden() {
        assertThrows(IllegalArgumentException.class, () ->
                new AutoEntreprise(null, AUTO_ENTREPRISE_NAME, 10)
        );
    }

}
