package com.example.odev15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.io.Serializable;

public class Bilgiler implements Serializable{
     private String adiSoyadi;
     private String telefonNo;
     private String eMail;
    public Bilgiler(String adiSoyadi,String telefonNo,String eMail){
       this.adiSoyadi = adiSoyadi;
       this.telefonNo = telefonNo;
       this.eMail = eMail;
    }
    public String getAdiSoyadi(){
        return adiSoyadi;
    }
    public String getTelefonNo(){
        return telefonNo;
    }
    public String geteMail(){
        return eMail;
    }
}