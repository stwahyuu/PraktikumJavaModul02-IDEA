package model;

import javax.xml.transform.Source;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException {



        Mahasiswa mahasiswa =new Mahasiswa();
        mahasiswa.npm = "19630125";
        mahasiswa.nama = "Septian Tri Wahyudin";


        mahasiswa.tampilkanAtribut();

        System.out.println("Usia : " + mahasiswa.hitungUsia());
    }
}
