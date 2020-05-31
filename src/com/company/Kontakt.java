package com.company;

public class Kontakt {

    String imie;
    String nazwisko;
    AdresEmail alternatywny_email = new AdresEmail();
    int telefonGSM;
    int telefonDOM;
    int telefonPraca;
    String opis;

    Kontakt() {

    }

    Kontakt(String aImie,
            String aNazwisko,
            AdresEmail aAlternatywnyMail,
            int aTelefonGSM,
            int aTelefonDOM,
            int aTelefonPraca,
            String aOpis) {

        imie = aImie;
        nazwisko = aNazwisko;
        alternatywny_email = aAlternatywnyMail;
        telefonGSM = aTelefonGSM;
        telefonDOM = aTelefonDOM;
        telefonPraca = aTelefonPraca;
        opis = aOpis;
    }
}
