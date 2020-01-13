package fr.gouv.impots;

public class AutoEntreprise {
    private String siret;
    private String my_auto_company;
    private String denomination;
    private int chiffreAffaires;

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public String getSiret() {
        return siret;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setChiffreAffaires(int chiffreAffaires) {
        this.chiffreAffaires = chiffreAffaires;
    }

    public int getChiffreAffaires() {
        return chiffreAffaires;
    }
}

