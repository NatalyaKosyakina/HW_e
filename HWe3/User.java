package org.example.HWe3;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    String fullName;
    private String birthdate;
    private String tel;
    private String sex;

     private boolean completed = false;

    public String getBirthdate() {
        return birthdate;
    }

    public String getTel() {
        return tel;
    }
 // throws ParseException, NumberFormatException
    public void define(String data) {
        if (data.equalsIgnoreCase("m") || data.equalsIgnoreCase("m")) {
            this.sex = data;
        } else if (data.contains(".")) {
            DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            try {
                Date bd = format.parse(data);
                this.birthdate = bd.toString();
            } catch (ParseException e) {
               // throw new ParseException();
            }
        } else {
            try {
                Double.parseDouble(data);
                tel = data;
            } catch (NumberFormatException e) {
               // throw new NumberFormatException();
                if (fullName == null) {
                    fullName = data;
                } else {
                    fullName = fullName + " " + data;
                }
            }
        }
    }

    public boolean checkComplete(){
        if (fullName != null && birthdate != null && tel != null && sex != null) {
            completed = true;
        } else {
            completed = false;
        }
        return completed;
    }

    public boolean save() {
        try (FileWriter fw = new FileWriter(fullName, true)) {
            fw.write(toString() + "\n");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void whatToAdd(){
        if (fullName == null){
            System.out.println("Укажите ФИО");
        }
        if (birthdate == null){
            System.out.println("Укажите дату рождения");
        }
        if (tel == null) {
            System.out.println("Укажите номер телефона");
        }
        if (sex == null) {
            System.out.println("Укажите пол");
        }
    }

    @Override
    public String toString() {
        return "<" +fullName + ">< " + birthdate + "><" + tel + "><" + sex + ">";
    }
}
