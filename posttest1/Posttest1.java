/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;
import com.mycompany.posttest1.AmericanMuscleCar;
import java.util.ArrayList;
/**
 *
 * @author mhddi
 */
public class Posttest1 {

    public static void main(String[] args) {
        
        ArrayList<AmericanMuscleCar> muscleCars = new ArrayList<>();

        // Menambahkan data mobil ke dalam ArrayList
        muscleCars.add(new AmericanMuscleCar("Ford", "Mustang GT", "V8 5000CC", "Bensin", 2022));
        muscleCars.add(new AmericanMuscleCar("Chevrolet", "Camaro", "V6 3600CC", "Bensin", 2021));
        muscleCars.add(new AmericanMuscleCar("Dodge", "Challenger SRT", "V8 6200CC", "Bensin", 2023));
        muscleCars.add(new AmericanMuscleCar("Plymouth", "Barracuda", "V8 7000CC", "Bensin", 1970));
        muscleCars.add(new AmericanMuscleCar("Pontiac", "Firebird", "V8 5000CC", "Bensin", 1975));

        // Menampilkan informasi mobil-mobil American Muscle pada ArrayList
        for (AmericanMuscleCar car : muscleCars) {
            String merk = "Mobil " + car.merk + " " + car.model;
            String konfigurasiMesin = "Konfigurasi Mesin: " + car.konfigurasiMesin;
            String bahanBakar = "Bahan Bakar: " + car.bahanBakar;
            String tahunProduksi = "Tahun Produksi: " + car.tahunProduksi;
            
            // Menggabungkan semua string dengan concat
            String output = merk.concat(" | ").concat(konfigurasiMesin).concat(" | ").concat(bahanBakar).concat(" | ").concat(tahunProduksi);
            
            System.out.println(output);
            System.out.println();
        }
    }
}
