package com.company;

import java.sql.Timestamp;

public class Mail {

    Uzytkownik wlasciciel = new Uzytkownik();
    AdresEmail nadawca = new AdresEmail();
    AdresEmail odbiorca = new AdresEmail();
    String temat;
    String tresc;

    Zalacznik zalacznik = new Zalacznik();
    public void setZalacznik(Zalacznik zalacznik) {
        this.zalacznik = zalacznik;
    }

    Timestamp godzina;
    Folder folder = new Folder();

}
