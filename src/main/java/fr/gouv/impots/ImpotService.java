package fr.gouv.impots;

public class ImpotService {


    public int calculImpots(Entreprise autoEntreprise) {
        if(autoEntreprise instanceof AutoEntreprise){
            return (autoEntreprise.getChiffreAffaire() * 25) / 100;
        } else if( autoEntreprise instanceof SocieteActionSimplifies){
            return (autoEntreprise.getChiffreAffaire() * 33) / 100;
        }
        throw new RuntimeException("Type d'entreprise inconnue");
    }
}
