package fr.gouv.impots;

public class Entreprise {

    private final String siret;
    private final String denomination;
    private final int chiffreAffaire;

    public Entreprise(String siret, String denomination, int chiffreAffaire) {
        this.siret = siret;
        this.denomination = denomination;
        this.chiffreAffaire = chiffreAffaire;
    }

    public String getSiret() {
        return siret;
    }

    public String getDenomination() {
        return denomination;
    }

    public int getChiffreAffaire() {
        return chiffreAffaire;
    }
}


