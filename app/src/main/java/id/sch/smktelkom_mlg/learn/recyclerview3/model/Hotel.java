package id.sch.smktelkom_mlg.learn.recyclerview3.model;

import java.io.Serializable;

/**
 * Created by SATELLITE on 03/11/2016.
 */

public class Hotel implements Serializable{
    public String judul;
    public String deskrpsi;
    public String detail;
    public String lokasi;
    public String foto;

    public Hotel(String judul, String deskrpsi, String detail, String lokasi,
                 String foto)
    {
        this.judul = judul;
        this.deskrpsi = deskrpsi;
        this.detail = detail;
        this.lokasi = lokasi;
        this.foto = foto;
    }
}
