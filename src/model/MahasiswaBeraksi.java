package model;

import javax.xml.transform.Source;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException {



        Mahasiswa mahasiswa =new Mahasiswa();
        mahasiswa.setNama("19630125");
        mahasiswa.setNama("Septian Tri Wahyudin");

        System.out.println(mahasiswa.getNama());

        mahasiswa.tampilkanAtribut();
        System.out.println("Usia : " + mahasiswa.hitungUsia());

        Mahasiswa m = new Mahasiswa("19630125", "Wahyu", new Date());
        m.tampilkanAtribut();
    }
}
