package fr.gouv.impots;

public class ImpotService {


    public int calculImpots(AutoEntreprise autoEntreprise) {
        return (autoEntreprise.getChiffreAffaires() * 25) / 100;
    }
}
