package id.sch.smktelkom_mlg.learn.recyclerview3.model;

import android.graphics.drawable.Drawable;

/**
 * Created by SATELLITE on 03/11/2016.
 */

public class Hotel {
    public String judul;
    public String deskrpsi;
    public Drawable foto;

    public Hotel(String judul, String deskrpsi, Drawable foto)
    {
        this.judul = judul;
        this.deskrpsi = deskrpsi;
        this.foto = foto;
    }
}
