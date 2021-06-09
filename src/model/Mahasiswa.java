package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mahasiswa {
    String npm;
    String nama;
    Date tanggalLahir;

    void tampilkanAtribut() {
        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);
        try {
            tanggalLahir = simpleDateFormat.parse("27-09-2001");

            System.out.println("Nama \t\t\t : " + nama);
            System.out.println("Npm \t\t\t : " + npm);
            System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(tanggalLahir));
        } catch (ParseException e) {
            System.err.println("Format Tanggal Salah");
        }
    }

    int hitungUsia() {
        Calendar tanggalLahir = Calendar.getInstance();
        tanggalLahir.setTime(this.tanggalLahir);
        Calendar hariIni = Calendar.getInstance();

        int selisihTahun = hariIni.get(Calendar.YEAR) - tanggalLahir.get(Calendar.YEAR);

        if (hariIni.get(Calendar.MONTH) < tanggalLahir.get(Calendar.MONTH)) {
            selisihTahun--;
        } else {
            if (hariIni.get(Calendar.MONTH) == tanggalLahir.get(Calendar.MONTH)
                    &&
                    hariIni.get(Calendar.DAY_OF_MONTH) < tanggalLahir.get(Calendar.DAY_OF_MONTH)) {
                selisihTahun--;
            }
        }
        return selisihTahun;
    }
}
