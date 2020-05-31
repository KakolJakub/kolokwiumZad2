package com.company;

public class Folder {

    String nazwa;
    Uzytkownik wlasciciel = new Uzytkownik();

    Folder(){

    }

    Folder(String aNazwa, Uzytkownik aWlasciciel){

        nazwa=aNazwa;
        wlasciciel=aWlasciciel;
    }
}
