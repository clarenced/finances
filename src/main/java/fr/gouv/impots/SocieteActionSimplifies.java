package fr.gouv.impots;

public class SocieteActionSimplifies extends Entreprise {

    private String siegeSocial;

    public SocieteActionSimplifies(String siret, String denomination, int chiffreAffaire) {
        super(siret, denomination, chiffreAffaire);
    }

    public SocieteActionSimplifies(String siret, String denomination, int chiffreAffaire, String siegeSocial) {
        super(siret, denomination, chiffreAffaire);
        this.siegeSocial = siegeSocial;
    }
}
