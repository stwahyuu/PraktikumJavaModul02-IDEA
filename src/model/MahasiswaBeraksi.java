package model;

import javax.xml.transform.Source;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException {

        String polaTanggal = "dd-MM_yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa =new Mahasiswa();
        mahasiswa.npm = "19630125";
        mahasiswa.nama = "Septian Tri Wahyudin";
        mahasiswa.tanggalLahir = simpleDateFormat.parse("27-09-2001");

        System.out.println("Nama \t\t\t : " + mahasiswa.nama);
        System.out.println("Npm \t\t\t : " + mahasiswa.npm);
        System.out.println("Tanggal Lahir \t : " + mahasiswa.tanggalLahir);

        Mahasiswa mahasiswa2 =new Mahasiswa();
        mahasiswa2.npm = "19630125";
        mahasiswa2.nama = "Aman Rohman";
        mahasiswa2.tanggalLahir = simpleDateFormat.parse("26-09-2001");

        System.out.println("Nama \t\t\t : " + mahasiswa2.nama);
        System.out.println("Npm \t\t\t : " + mahasiswa2.npm);
        System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(mahasiswa2.tanggalLahir));
    }
}
