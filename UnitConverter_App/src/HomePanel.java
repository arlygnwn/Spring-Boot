
import java.util.regex.Pattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ranit
 */
public class HomePanel extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(HomePanel.class.getName());
    public Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
    
    public String ukuran,hasil,hasil_perhitungan,panjang_dari,panjang_untuk,berat_dari,berat_untuk,suhu_dari,suhu_untuk;
    double konversi,panjang,berat,suhu,
            kilometer,meter,sentimeter,milimeter,mikrometer,nanometer,mile,yard,kaki,inci,
            ton,kilogram,gram,miligram,mikrogram,imp_ton,us_ton,stone,pound,ounce,
            celcius,fahrenheit,kelvin;
    public String unit;

    /**
     * Creates new form HomePanel
     */
    public HomePanel() {
        initComponents();
    }
    
    public boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false; 
        }
        return pattern.matcher(strNum).matches();
    }
    
    public double kePanjang(String dari,String ke,String val){
        switch (dari){
            case "Kilometer":
                konversi = dariKilometer(ke,val);
                break;
            case "Meter":
                konversi = dariMeter(ke,val);
                break;
            case "Sentimeter":
                konversi = dariSentimeter(ke,val);
                break;
            case "Milimeter":
                konversi = dariMilimeter(ke,val);
                break;
            case "Mikrometer":
                konversi = dariMikrometer(ke,val);
                break;
            case "Nanometer":
                konversi = dariNanometer(ke,val);
                break;
            case "Mil":
                konversi = dariMil(ke,val);
                break;
            case "Yard":
                konversi = dariYard(ke,val);
                break;
            case "Kaki":
                konversi = dariKaki(ke,val);
                break;
            case "Inci":
                konversi = dariInci(ke,val);
                break;   
        }
        return konversi;
    }
    
    public double dariKilometer (String ke,String val) {
        switch (ke){
            case "Kilometer":
                kilometer = Double.parseDouble(val)*1;
                unit = "km";
                break;
            case "Meter":
                kilometer = Double.parseDouble(val)*1000;
                unit = "m";
                break;
            case "Sentimeter":
                kilometer = Double.parseDouble(val)*100000;
                unit = "cm";
                break;
            case "Milimeter":
                kilometer = Double.parseDouble(val)*1000000;
                unit = "mm";
                break;
            case "Mikrometer":
                kilometer = Double.parseDouble(val)*1000000000;
                unit = "µm";
                break;
            case "Nanometer":
                kilometer = Double.parseDouble(val)*1000000000;
                kilometer = kilometer*1000;
                unit = "nm";
                break;
            case "Mil":
                kilometer = Double.parseDouble(val)/1.609;
                unit = "mi";
                break;
            case "Yard":
                kilometer = Double.parseDouble(val)*1093.61;
                unit = "yd";
                break;
            case "Kaki":
                kilometer = Double.parseDouble(val)*3280.84;
                unit = "ft";
                break;
            case "Inci":
                kilometer = Double.parseDouble(val)*39370.1;
                unit = "in";
                break;   
        }
        return kilometer;
    }
    
    public double dariMeter (String ke,String val) {
        switch (ke){
            case "Kilometer":
                meter = Double.parseDouble(val)/1000;
                unit = "km";
                break;
            case "Meter":
                meter = Double.parseDouble(val)*1;
                unit = "m";
                break;
            case "Sentimeter":
                meter = Double.parseDouble(val)*100;
                unit = "cm";
                break;
            case "Milimeter":
                meter = Double.parseDouble(val)*1000;
                unit = "mm";
                break;
            case "Mikrometer":
                meter = Double.parseDouble(val)*1000000;
                unit = "µm";
                break;
            case "Nanometer":
                meter = Double.parseDouble(val)*1000000000;
                unit = "nm";
                break;
            case "Mil":
                meter = (float) Double.parseDouble(val)/1609;
                unit = "mi";
                break;
            case "Yard":
                meter = Double.parseDouble(val)*1.09361;
                unit = "yd";
                break;
            case "Kaki":
                meter = Double.parseDouble(val)*3.28084;
                unit = "ft";
                break;
            case "Inci":
                meter = Double.parseDouble(val)*39.37;
                unit = "in";
                break;   
        }
        return meter;
    }
    
    public double dariSentimeter (String ke,String val) {
        switch (ke){
            case "Kilometer":
                sentimeter = Double.parseDouble(val)/100000;
                unit = "km";
                break;
            case "Meter":
                sentimeter = Double.parseDouble(val)/100;
                unit = "m";
                break;
            case "Sentimeter":
                sentimeter = Double.parseDouble(val)*1;
                unit = "cm";
                break;
            case "Milimeter":
                sentimeter = Double.parseDouble(val)*10;
                unit = "mm";
                break;
            case "Mikrometer":
                sentimeter = Double.parseDouble(val)*10000;
                unit = "µm";
                break;
            case "Nanometer":
                sentimeter = Double.parseDouble(val)*10000000;
                unit = "nm";
                break;
            case "Mil":
                sentimeter = (float) Double.parseDouble(val)/160900;
                unit = "mi";
                break;
            case "Yard":
                sentimeter = (float) Double.parseDouble(val)/91.44;
                unit = "yd";
                break;
            case "Kaki":
                sentimeter = (float) Double.parseDouble(val)/30.48;
                unit = "ft";
                break;
            case "Inci":
                sentimeter = (float) Double.parseDouble(val)/2.54;
                unit = "in";
                break;   
        }
        return sentimeter;
    }
    
    public double dariMilimeter (String ke,String val) {
        switch (ke){
            case "Kilometer":
                milimeter = Double.parseDouble(val)/1000000;
                unit = "km";
                break;
            case "Meter":
                milimeter = Double.parseDouble(val)/1000;
                unit = "m";
                break;
            case "Sentimeter":
                milimeter = Double.parseDouble(val)/10;
                unit = "cm";
                break;
            case "Milimeter":
                sentimeter = Double.parseDouble(val)*1;
                unit = "mm";
                break;
            case "Mikrometer":
                milimeter = Double.parseDouble(val)*1000;
                unit = "µm";
                break;
            case "Nanometer":
                milimeter = Double.parseDouble(val)*1000000;
                unit = "nm";
                break;
            case "Mil":
                milimeter = (float) Double.parseDouble(val)/1609000;
                unit = "mi";
                break;
            case "Yard":
                milimeter = (float) Double.parseDouble(val)/914.4;
                unit = "yd";
                break;
            case "Kaki":
                milimeter = (float) Double.parseDouble(val)/304.8;
                unit = "ft";
                break;
            case "Inci":
                milimeter = (float) Double.parseDouble(val)/25.4;
                unit = "in";
                break;   
        }
        return milimeter;
    }
    
    public double dariMikrometer (String ke,String val) {
        switch (ke){
            case "Kilometer":
                mikrometer = Double.parseDouble(val)/1000000000;
                unit = "km";
                break;
            case "Meter":
                mikrometer = Double.parseDouble(val)/1000000;
                unit = "m";
                break;
            case "Sentimeter":
                mikrometer = Double.parseDouble(val)/10000;
                unit = "cm";
                break;
            case "Milimeter":
                mikrometer = Double.parseDouble(val)/1000;
                unit = "mm";
                break;
            case "Mikrometer":
                mikrometer = Double.parseDouble(val)*1;
                unit = "µm";
                break;
            case "Nanometer":
                mikrometer = Double.parseDouble(val)*1000;
                unit = "nm";
                break;
            case "Mil":
                mikrometer = (float) Double.parseDouble(val)/1609000000;
                unit = "mi";
                break;
            case "Yard":
                mikrometer = (float) Double.parseDouble(val)/914400;
                unit = "yd";
                break;
            case "Kaki":
                mikrometer = (float) Double.parseDouble(val)/304800;
                unit = "ft";
                break;
            case "Inci":
                mikrometer = (float) Double.parseDouble(val)/25400;
                unit = "in";
                break;   
        }
        return mikrometer;
    }
    
    public double dariNanometer (String ke,String val) {
        switch (ke){
            case "Kilometer":
                nanometer = Double.parseDouble(val)/1000000000;
                nanometer = nanometer*1000;
                unit = "km";
                break;
            case "Meter":
                nanometer = Double.parseDouble(val)/1000000000;
                unit = "m";
                break;
            case "Sentimeter":
                nanometer = Double.parseDouble(val)/10000000;
                unit = "cm";
                break;
            case "Milimeter":
                nanometer = Double.parseDouble(val)/1000000;
                unit = "mm";
                break;
            case "Mikrometer":
                nanometer = Double.parseDouble(val)*1000;
                unit = "µm";
                break;
            case "Nanometer":
                nanometer = Double.parseDouble(val)*1;
                unit = "nm";
                break;
            case "Mil":
                nanometer = (float) Double.parseDouble(val)/1609000000;
                nanometer = nanometer*1000;
                unit = "mi";
                break;
            case "Yard":
                nanometer = (float) Double.parseDouble(val)/914400000;
                unit = "yd";
                break;
            case "Kaki":
                nanometer = (float) Double.parseDouble(val)/304800000;
                unit = "ft";
                break;
            case "Inci":
                nanometer = (float) Double.parseDouble(val)/25400000;
                unit = "in";
                break;   
        }
        return nanometer;
    }
    
    public double dariMil (String ke,String val) {
        switch (ke){
            case "Kilometer":
                mile = Double.parseDouble(val)*1.609;
                unit = "km";
                break;
            case "Meter":
                mile = Double.parseDouble(val)*1609;
                unit = "m";
                break;
            case "Sentimeter":
                mile = Double.parseDouble(val)*160900;
                unit = "cm";
                break;
            case "Milimeter":
                mile = Double.parseDouble(val)*1609000;
                unit = "mm";
                break;
            case "Mikrometer":
                mile = Double.parseDouble(val)*1609000000;
                unit = "µm";
                break;
            case "Nanometer":
                mile = Double.parseDouble(val)*1609000000;
                mile = mile*1000;
                unit = "nm";
                break;
            case "Mil":
                mile = (float) Double.parseDouble(val)*1;
                unit = "mi";
                break;
            case "Yard":
                mile = (float) Double.parseDouble(val)*1760;
                unit = "yd";
                break;
            case "Kaki":
                mile = (float) Double.parseDouble(val)*5280;
                unit = "ft";
                break;
            case "Inci":
                mile = (float) Double.parseDouble(val)*63360;
                unit = "in";
                break;   
        }
        return mile;
    }
    
    public double dariYard (String ke,String val) {
        switch (ke){
            case "Kilometer":
                yard = Double.parseDouble(val)/1094;
                unit = "km";
                break;
            case "Meter":
                yard = Double.parseDouble(val)/1.094;
                unit = "m";
                break;
            case "Sentimeter":
                yard = Double.parseDouble(val)*91.44;
                unit = "cm";
                break;
            case "Milimeter":
                yard = Double.parseDouble(val)*914.4;
                unit = "mm";
                break;
            case "Mikrometer":
                yard = Double.parseDouble(val)*914400;
                unit = "µm";
                break;
            case "Nanometer":
                yard = Double.parseDouble(val)*914400000;
                unit = "nm";
                break;
            case "Mil":
                yard = Double.parseDouble(val)/1760;
                unit = "mi";
                break;
            case "Yard":
                yard = (float) Double.parseDouble(val)*1;
                unit = "yd";
                break;
            case "Kaki":
                yard = (float) Double.parseDouble(val)*3;
                unit = "ft";
                break;
            case "Inci":
                yard = (float) Double.parseDouble(val)*36;
                unit = "in";
                break;   
        }
        return yard;
    }
    
    public double dariKaki (String ke,String val) {
        switch (ke){
            case "Kilometer":
                kaki = Double.parseDouble(val)/3281;
                unit = "km";
                break;
            case "Meter":
                kaki = Double.parseDouble(val)/3.281;
                unit = "m";
                break;
            case "Sentimeter":
                kaki = Double.parseDouble(val)*30.48;
                unit = "cm";
                break;
            case "Milimeter":
                kaki = Double.parseDouble(val)*304.8;
                unit = "mm";
                break;
            case "Mikrometer":
                kaki = Double.parseDouble(val)*304800;
                unit = "µm";
                break;
            case "Nanometer":
                kaki = Double.parseDouble(val)*304800000;
                unit = "nm";
                break;
            case "Mil":
                kaki = Double.parseDouble(val)/5289;
                unit = "mi";
                break;
            case "Yard":
                kaki = (float) Double.parseDouble(val)*3;
                unit = "yd";
                break;
            case "Kaki":
                kaki = (float) Double.parseDouble(val)*1;
                unit = "ft";
                break;
            case "Inci":
                kaki = (float) Double.parseDouble(val)*12;
                unit = "in";
                break;   
        }
        return kaki;
    }
    
    public double dariInci (String ke,String val) {
        switch (ke){
            case "Kilometer":
                inci = Double.parseDouble(val)/39370;
                unit = "km";
                break;
            case "Meter":
                inci = Double.parseDouble(val)/39.37;
                unit = "m";
                break;
            case "Sentimeter":
                inci = Double.parseDouble(val)*2.54;
                unit = "cm";
                break;
            case "Milimeter":
                inci = Double.parseDouble(val)*25.4;
                unit = "mm";
                break;
            case "Mikrometer":
                inci = Double.parseDouble(val)*25400;
                unit = "µm";
                break;
            case "Nanometer":
                inci = Double.parseDouble(val)*25400000;
                unit = "nm";
                break;
            case "Mil":
                inci = Double.parseDouble(val)/63360;
                unit = "mi";
                break;
            case "Yard":
                inci = (float) Double.parseDouble(val)/36;
                unit = "yd";
                break;
            case "Kaki":
                inci = (float) Double.parseDouble(val)*12;
                unit = "ft";
                break;
            case "Inci":
                inci = (float) Double.parseDouble(val)*1;
                unit = "in";
                break;   
        }
        return inci;
    }
    
    public double keBerat(String dari,String ke,String val){
        switch (dari){
            case "Ton":
                konversi = dariTon(ke,val);
                break;
            case "Kilogram":
                konversi = dariKilogram(ke,val);
                break;
            case "Gram":
                konversi = dariGram(ke,val);
                break;
            case "Miligram":
                konversi = dariMilimeter(ke,val);
                break;
            case "Mikrogram":
                konversi = dariMikrogram(ke,val);
                break;
            case "Imperial Ton":
                konversi = dariImpton(ke,val);
                break;
            case "US Ton":
                konversi = dariUston(ke,val);
                break;
            case "Stone":
                konversi = dariStone(ke,val);
                break;
            case "Pound":
                konversi = dariPound(ke,val);
                break;
            case "Ounce":
                konversi = dariOunce(ke,val);
                break;   
        }
        return konversi;
    }
    
    public double dariTon (String ke,String val) {
        switch (ke){
            case "Ton":
                ton = Double.parseDouble(val)*1;
                unit = "t";
                break;
            case "Kilogram":
                ton = Double.parseDouble(val)*1000;
                unit = "kg";
                break;
            case "Gram":
                ton = Double.parseDouble(val)*1000000;
                unit = "g";
                break;
            case "Miligram":
                ton = Double.parseDouble(val)*1000000000;
                unit = "mg";
                break;
            case "Mikrogram":
                ton = Double.parseDouble(val)*1000000000;
                ton = ton*1000;
                unit = "µg";
                break;
            case "Imperial Ton":
                ton = Double.parseDouble(val)/1.016;
                unit = "ton";
                break;
            case "US Ton":
                ton = Double.parseDouble(val)*1.102;
                unit = "tn";
                break;
            case "Stone":
                ton = Double.parseDouble(val)*157.5;
                unit = "st";
                break;
            case "Pound":
                ton = Double.parseDouble(val)*2205;
                unit = "lbs";
                break;
            case "Ounce":
                ton = Double.parseDouble(val)*35270;
                unit = "oz";
                break;   
        }
        return ton;
    }
    
    public double dariKilogram (String ke,String val) {
        switch (ke){
            case "Ton":
                kilogram = Double.parseDouble(val)/1000;
                unit = "t";
                break;
            case "Kilogram":
                kilogram = Double.parseDouble(val)*1;
                unit = "kg";
                break;
            case "Gram":
                kilogram = Double.parseDouble(val)*1000;
                unit = "g";
                break;
            case "Miligram":
                kilogram = Double.parseDouble(val)*1000000;
                unit = "mg";
                break;
            case "Mikrogram":
                kilogram = Double.parseDouble(val)*1000000000;
                unit = "µg";
                break;
            case "Imperial Ton":
                kilogram = (float) Double.parseDouble(val)/1016;
                unit = "ton";
                break;
            case "US Ton":
                kilogram = Double.parseDouble(val)/907.2;
                unit = "tn";
                break;
            case "Stone":
                kilogram = Double.parseDouble(val)/6.35;
                unit = "st";
                break;
            case "Pound":
                kilogram = Double.parseDouble(val)*2.205;
                unit = "lbs";
                break;
            case "Ounce":
                kilogram = Double.parseDouble(val)*35.274;
                unit = "oz";
                break;   
        }
        return kilogram;
    }
    
    public double dariGram (String ke,String val) {
        switch (ke){
            case "Ton":
                gram = Double.parseDouble(val)/1000000;
                unit = "t";
                break;
            case "Kilogram":
                gram = Double.parseDouble(val)/1000;
                unit = "kg";
                break;
            case "Gram":
                gram = Double.parseDouble(val)*1;
                unit = "g";
                break;
            case "Miligram":
                gram = Double.parseDouble(val)*1000;
                unit = "mg";
                break;
            case "Mikrogram":
                gram = Double.parseDouble(val)*1000000;
                unit = "µg";
                break;
            case "Imperial Ton":
                gram = (float) Double.parseDouble(val)/1016000;
                unit = "ton";
                break;
            case "US Ton":
                gram = Double.parseDouble(val)/907200;
                unit = "tn";
                break;
            case "Stone":
                gram = Double.parseDouble(val)/6350;
                unit = "st";
                break;
            case "Pound":
                gram = Double.parseDouble(val)/453.6;
                unit = "lbs";
                break;
            case "Ounce":
                gram = Double.parseDouble(val)/28.35;
                unit = "oz";
                break;   
        }
        return gram;
    }
    
    public double dariMiligram (String ke,String val) {
        switch (ke){
            case "Ton":
                miligram = Double.parseDouble(val)/1000000000;
                unit = "t";
                break;
            case "Kilogram":
                miligram = Double.parseDouble(val)/1000000;
                unit = "kg";
                break;
            case "Gram":
                miligram = Double.parseDouble(val)/1000;
                unit = "g";
                break;
            case "Miligram":
                miligram = Double.parseDouble(val)*1;
                unit = "mg";
                break;
            case "Mikrogram":
                miligram = Double.parseDouble(val)*1000;
                unit = "µg";
                break;
            case "Imperial Ton":
                miligram = (float) Double.parseDouble(val)/1016000000;
                unit = "ton";
                break;
            case "US Ton":
                miligram = Double.parseDouble(val)/907200000;
                unit = "tn";
                break;
            case "Stone":
                miligram = Double.parseDouble(val)/6350000;
                unit = "st";
                break;
            case "Pound":
                miligram = Double.parseDouble(val)/453600;
                unit = "lbs";
                break;
            case "Ounce":
                miligram = Double.parseDouble(val)/28350;
                unit = "oz";
                break;   
        }
        return miligram;
    }
    
    public double dariMikrogram (String ke,String val) {
        switch (ke){
            case "Ton":
                mikrogram = Double.parseDouble(val)/1000000000;
                unit = "t";
                break;
            case "Kilogram":
                mikrogram = Double.parseDouble(val)/1000000;
                unit = "kg";
                break;
            case "Gram":
                mikrogram = Double.parseDouble(val)/1000;
                unit = "g";
                break;
            case "Miligram":
                mikrogram = Double.parseDouble(val)*1;
                unit = "mg";
                break;
            case "Mikrogram":
                mikrogram = Double.parseDouble(val)*1000;
                unit = "µg";
                break;
            case "Imperial Ton":
                mikrogram = (float) Double.parseDouble(val)/1016000000;
                unit = "ton";
                break;
            case "US Ton":
                mikrogram = Double.parseDouble(val)/907200000;
                unit = "tn";
                break;
            case "Stone":
                mikrogram = Double.parseDouble(val)/6350000;
                unit = "st";
                break;
            case "Pound":
                mikrogram = Double.parseDouble(val)/453600;
                unit = "lbs";
                break;
            case "Ounce":
                mikrogram = Double.parseDouble(val)/28350;
                unit = "oz";
                break;   
        }
        return mikrogram;
    }
    
    public double dariImpton (String ke,String val) {
        switch (ke){
            case "Ton":
                imp_ton = Double.parseDouble(val)*1.016;
                unit = "t";
                break;
            case "Kilogram":
                imp_ton = Double.parseDouble(val)*1016;
                unit = "kg";
                break;
            case "Gram":
                imp_ton = Double.parseDouble(val)*1016000;
                unit = "g";
                break;
            case "Miligram":
                imp_ton = Double.parseDouble(val)*1016000000;
                unit = "mg";
                break;
            case "Mikrogram":
                imp_ton = Double.parseDouble(val)*1016000000;
                imp_ton = imp_ton*1000;
                unit = "µg";
                break;
            case "Imperial Ton":
                imp_ton = (float) Double.parseDouble(val)*1;
                unit = "ton";
                break;
            case "US Ton":
                imp_ton = Double.parseDouble(val)*1.12;
                unit = "tn";
                break;
            case "Stone":
                imp_ton = Double.parseDouble(val)*160;
                unit = "st";
                break;
            case "Pound":
                imp_ton = Double.parseDouble(val)*2240;
                unit = "lbs";
                break;
            case "Ounce":
                imp_ton = Double.parseDouble(val)*35840;
                unit = "oz";
                break;   
        }
        return imp_ton;
    }
    
    public double dariUston (String ke,String val) {
        switch (ke){
            case "Ton":
                us_ton = Double.parseDouble(val)*1.102;
                unit = "t";
                break;
            case "Kilogram":
                us_ton = Double.parseDouble(val)*907.2;
                unit = "kg";
                break;
            case "Gram":
                us_ton = Double.parseDouble(val)*907200;
                unit = "g";
                break;
            case "Miligram":
                us_ton = Double.parseDouble(val)*907200000;
                unit = "mg";
                break;
            case "Mikrogram":
                us_ton = Double.parseDouble(val)*907200000;
                us_ton = us_ton*1000;
                unit = "µg";
                break;
            case "Imperial Ton":
                us_ton = (float) Double.parseDouble(val)/1.12;
                unit = "ton";
                break;
            case "US Ton":
                us_ton = Double.parseDouble(val)*1;
                unit = "tn";
                break;
            case "Stone":
                us_ton = Double.parseDouble(val)*142.9;
                unit = "st";
                break;
            case "Pound":
                us_ton = Double.parseDouble(val)*2000;
                unit = "lbs";
                break;
            case "Ounce":
                us_ton = Double.parseDouble(val)*32000;
                unit = "oz";
                break;   
        }
        return us_ton;
    }
    
    public double dariStone (String ke,String val) {
        switch (ke){
            case "Ton":
                stone = Double.parseDouble(val)/157.5;
                unit = "t";
                break;
            case "Kilogram":
                stone = Double.parseDouble(val)*6.35;
                unit = "kg";
                break;
            case "Gram":
                stone = Double.parseDouble(val)*6350;
                unit = "g";
                break;
            case "Miligram":
                stone = Double.parseDouble(val)*6350000;
                unit = "mg";
                break;
            case "Mikrogram":
                stone = Double.parseDouble(val)*6350000;
                stone = stone*1000;
                unit = "µg";
                break;
            case "Imperial Ton":
                stone = (float) Double.parseDouble(val)/160;
                unit = "ton";
                break;
            case "US Ton":
                stone = Double.parseDouble(val)/142.9;
                unit = "tn";
                break;
            case "Stone":
                stone = Double.parseDouble(val)*1;
                unit = "st";
                break;
            case "Pound":
                stone = Double.parseDouble(val)*14;
                unit = "lbs";
                break;
            case "Ounce":
                stone = Double.parseDouble(val)*224;
                unit = "oz";
                break;   
        }
        return stone;
    }
    
    public double dariPound (String ke,String val) {
        switch (ke){
            case "Ton":
                pound = Double.parseDouble(val)/2205;
                unit = "t";
                break;
            case "Kilogram":
                pound = Double.parseDouble(val)/2.205;
                unit = "kg";
                break;
            case "Gram":
                pound = Double.parseDouble(val)*453.6;
                unit = "g";
                break;
            case "Miligram":
                pound = Double.parseDouble(val)*453600;
                unit = "mg";
                break;
            case "Mikrogram":
                pound = Double.parseDouble(val)*453600000;
                unit = "µg";
                break;
            case "Imperial Ton":
                pound = (float) Double.parseDouble(val)/2240;
                unit = "ton";
                break;
            case "US Ton":
                pound = Double.parseDouble(val)/2000;
                unit = "tn";
                break;
            case "Stone":
                pound = Double.parseDouble(val)/14;
                unit = "st";
                break;
            case "Pound":
                pound = Double.parseDouble(val)*1;
                unit = "lbs";
                break;
            case "Ounce":
                pound = Double.parseDouble(val)*16;
                unit = "oz";
                break;   
        }
        return pound;
    }
    
    public double dariOunce (String ke,String val) {
        switch (ke){
            case "Ton":
                ounce = Double.parseDouble(val)/35270;
                unit = "t";
                break;
            case "Kilogram":
                ounce = Double.parseDouble(val)/35.274;
                unit = "kg";
                break;
            case "Gram":
                ounce = Double.parseDouble(val)*28.35;
                unit = "g";
                break;
            case "Miligram":
                ounce = Double.parseDouble(val)*28350;
                unit = "mg";
                break;
            case "Mikrogram":
                ounce = Double.parseDouble(val)*28350000;
                unit = "µg";
                break;
            case "Imperial Ton":
                ounce = (float) Double.parseDouble(val)/35840;
                unit = "ton";
                break;
            case "US Ton":
                ounce = Double.parseDouble(val)/32000;
                unit = "tn";
                break;
            case "Stone":
                ounce = Double.parseDouble(val)/224;
                unit = "st";
                break;
            case "Pound":
                ounce = Double.parseDouble(val)/16;
                unit = "lbs";
                break;
            case "Ounce":
                ounce = Double.parseDouble(val)*1;
                unit = "oz";
                break;   
        }
        return ounce;
    }
    
    public double keSuhu(String dari,String ke,String val){
        switch (dari){
            case "Celcius":
                konversi = dariCelcius(ke,val);
                break;
            case "Fahrenheit":
                konversi = dariFahrenheit(ke,val);
                break;
            case "Kelvin":
                konversi = dariKelvin(ke,val);
                break;   
        }
        return konversi;
    }
     
    public double dariCelcius (String ke,String val) {
        switch (ke){
            case "Celcius":
                celcius = Double.parseDouble(val)*1;
                unit = "C";
                break;
            case "Fahrenheit":
                celcius = (float) (Double.parseDouble(val)*9/5)+32;
                unit = "F";
                break;
            case "Kelvin":
                celcius =(float) Double.parseDouble(val)+273.15;
                unit = "K";
                break;
        }
        return celcius;
    }
    
    public double dariFahrenheit (String ke,String val) {
        switch (ke){
            case "Celcius":
                fahrenheit = (float) ((Double.parseDouble(val)-32)*5/9);
                unit = "C";
                break;
            case "Fahrenheit":
                fahrenheit = Double.parseDouble(val)*1;
                unit = "F";
                break;
            case "Kelvin":
                fahrenheit = (float) ((Double.parseDouble(val)-32)*5/9)+273.15;
                unit = "K";
                break;
        }
        return fahrenheit;
    }
    
    public double dariKelvin (String ke,String val) {
        switch (ke){
            case "Celcius":
                kelvin = Double.parseDouble(val)-273.15;
                unit = "C";
                break;
            case "Fahrenheit":
                kelvin = ((Double.parseDouble(val)-273.15)*9/5)+32;
                unit = "F";
                break;
            case "Kelvin":
                kelvin = Double.parseDouble(val)*1;
                unit = "K";
                break;
        }
        return kelvin;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 480));

        jTextField1.setText("0");
        jTextField1.setMaximumSize(new java.awt.Dimension(256, 32));
        jTextField1.setMinimumSize(new java.awt.Dimension(256, 32));
        jTextField1.setPreferredSize(new java.awt.Dimension(256, 32));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Masukan angka untuk Konversi");

        jLabel3.setText("Unit untuk Konversi dari");

        jLabel4.setText("Unit untuk Konversi untuk");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometer", "Meter", "Sentimeter", "Milimeter", "Mikrometer", "Nanometer", "Mil", "Yard", "Kaki", "Inci" }));
        jComboBox1.setMaximumSize(new java.awt.Dimension(256, 32));
        jComboBox1.setMinimumSize(new java.awt.Dimension(256, 32));
        jComboBox1.setPreferredSize(new java.awt.Dimension(256, 32));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometer", "Meter", "Sentimeter", "Milimeter", "Mikrometer", "Nanometer", "Mil", "Yard", "Kaki", "Inci" }));
        jComboBox2.setMaximumSize(new java.awt.Dimension(256, 32));
        jComboBox2.setMinimumSize(new java.awt.Dimension(256, 32));
        jComboBox2.setPreferredSize(new java.awt.Dimension(256, 32));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton1.setText("Konversi");
        jButton1.setMaximumSize(new java.awt.Dimension(256, 32));
        jButton1.setMinimumSize(new java.awt.Dimension(256, 32));
        jButton1.setPreferredSize(new java.awt.Dimension(256, 32));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setText(" ");

        jLabel15.setText("Hasil Konversi :");

        jButton6.setText("Reset");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(0, 193, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Panjang", jPanel4);

        jTextField2.setText("0");
        jTextField2.setToolTipText("");
        jTextField2.setMaximumSize(new java.awt.Dimension(256, 32));
        jTextField2.setMinimumSize(new java.awt.Dimension(256, 32));
        jTextField2.setPreferredSize(new java.awt.Dimension(256, 32));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Masukan angka untuk Konversi");

        jLabel6.setText("Unit untuk Konversi dari");

        jLabel7.setText("Unit untuk Konversi untuk");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ton", "Kilogram", "Gram", "Miligram", "Mikrogram", "Imperial Ton", "US Ton", "Stone", "Pound", "Ounce" }));
        jComboBox3.setMaximumSize(new java.awt.Dimension(256, 32));
        jComboBox3.setMinimumSize(new java.awt.Dimension(256, 32));
        jComboBox3.setPreferredSize(new java.awt.Dimension(256, 32));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ton", "Kilogram", "Gram", "Miligram", "Mikrogram", "Imperial Ton", "US Ton", "Stone", "Pound", "Ounce" }));
        jComboBox4.setMaximumSize(new java.awt.Dimension(256, 32));
        jComboBox4.setMinimumSize(new java.awt.Dimension(256, 32));
        jComboBox4.setPreferredSize(new java.awt.Dimension(256, 32));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jButton2.setText("Konversi");
        jButton2.setMaximumSize(new java.awt.Dimension(256, 32));
        jButton2.setMinimumSize(new java.awt.Dimension(256, 32));
        jButton2.setPreferredSize(new java.awt.Dimension(256, 32));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel13.setText(" ");

        jLabel16.setText("Hasil Konversi :");

        jButton5.setText("Reset");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5))
                        .addGap(134, 134, 134)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                        .addContainerGap(146, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(12, 12, 12)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Berat", jPanel2);

        jTextField3.setText("0");
        jTextField3.setMinimumSize(new java.awt.Dimension(256, 32));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel8.setText("Masukan angka untuk Konversi");

        jLabel9.setText("Unit untuk Konversi dari");

        jLabel10.setText("Unit untuk Konversi untuk");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Fahrenheit", "Kelvin" }));
        jComboBox5.setMinimumSize(new java.awt.Dimension(256, 32));
        jComboBox5.setPreferredSize(new java.awt.Dimension(256, 32));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Fahrenheit", "Kelvin" }));
        jComboBox6.setMinimumSize(new java.awt.Dimension(256, 32));
        jComboBox6.setPreferredSize(new java.awt.Dimension(256, 32));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });

        jButton3.setText("Konversi");
        jButton3.setMaximumSize(new java.awt.Dimension(256, 32));
        jButton3.setMinimumSize(new java.awt.Dimension(256, 32));
        jButton3.setPreferredSize(new java.awt.Dimension(256, 32));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel14.setText(" ");

        jLabel17.setText("Hasil Konversi :");

        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(134, 134, 134)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))))
                        .addContainerGap(146, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Suhu", jPanel3);

        jLabel1.setText("Unit Konverter");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        boolean num = isNumeric(jTextField3.getText());
        if (num){
            System.out.println("True");
            ukuran = jTextField3.getText();
            hasil = jTextField3.getText();
            suhu_dari = String.valueOf(jComboBox5.getSelectedItem());
            suhu_untuk = String.valueOf(jComboBox6.getSelectedItem());
            suhu = keSuhu(suhu_dari,suhu_untuk,ukuran);
            System.out.println(String.valueOf(suhu));
        } else {
            System.out.println("False");
            ukuran = "0";
            hasil = "";
        }
            jLabel14.setText(String.valueOf(suhu) + " " + unit);
            jTextField3.setText(hasil);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       boolean num = isNumeric(jTextField2.getText());
        if (num){
            System.out.println("True");
            ukuran = jTextField2.getText();
            hasil = jTextField2.getText();
            berat_dari = String.valueOf(jComboBox3.getSelectedItem());
            berat_untuk = String.valueOf(jComboBox4.getSelectedItem());
            berat = keBerat(berat_dari,berat_untuk,ukuran);
            System.out.println(String.valueOf(berat));
        } else {
            System.out.println("False");
            ukuran = "0";
            hasil = "";
        }
            jLabel13.setText(String.valueOf(berat) + " " + unit);
            jTextField2.setText(hasil);
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        /* ResultPanel rp = new ResultPanel();
        rp.setVisible(true);
        
        this.setVisible(false); */
        boolean num = isNumeric(jTextField1.getText());
        if (num){
            System.out.println("True");
            ukuran = jTextField1.getText();
            hasil = jTextField1.getText();
            panjang_dari = String.valueOf(jComboBox1.getSelectedItem());
            panjang_untuk = String.valueOf(jComboBox2.getSelectedItem());
            panjang = kePanjang(panjang_dari,panjang_untuk,ukuran);
            System.out.println(String.valueOf(panjang));
        } else {
            System.out.println("False");
            ukuran = "0";
            hasil = "";
        }
            jLabel11.setText(String.valueOf(panjang) + " " + unit);
            jTextField1.setText(hasil);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here: 
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new HomePanel().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    
}
