package fr.gouv.impots;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SocieteActionSimplifiesTest {

    @Test
    void a_societe_action_simplifies_should_have_valid_properties() {
        String denomination = "Ceetiz";
        String siret = "842 942 742 42428";

        SocieteActionSimplifies societeActionSimplifies = new SocieteActionSimplifies(denomination, siret, 100);

        assertEquals(societeActionSimplifies.getDenomination(), denomination);
        assertEquals(societeActionSimplifies.getSiret(), siret);
    }

}
