/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import java.util.ArrayList;
import DAODataBuku.dataBukuDAO;
import DAOImplement.dataBukuImplement;
import model.*;
import view.MainView;
/**
 *
 * @author vince
 */
public class dataBukuController {
    MainView frame:
    dataBukuImplement impldatabuku
    List<dataBuku> db;
    
    public dataBukuController (MainView frame) {
        this.frame = frame;
        impldatabuku new dataBukuDAO();
        db impldatabuku.getAll();
    }
    
    public void isitabel () {
        do impldatabuku.getAll();
        modeltabeldatabuku mp new modeltabeldatabuku (db); frame.getTabelDatabuku().setModel (mp);
    }
    
    public void insert() {
        dataBuku db new dataBuku();
        db.setJudul (frame.getJTxtjudul().getText());
        db.setGenre(frame.getJtxtgenre().getText());
        db.setPenulis(frame.getJtxtpenulis().getText()); 
        db.setPenerbit (frame.getJtxtpenerbit().getText());
        db.setLokasi(frame.getJtxtlokasi().getText()); 
        db.setStock(frame.getJtxtstock().getText());
        impldatabuku.insert(db);
    }
    
    public void update(){
        dataBuku db new dataBuku();
        db.setJudul (frame.getJTxtjudul().getText());
        db.setGenre(frame.getJtxtgenre().getText());
        db.setPenulis(frame.getJtxtpenulis().getText()); 
        db.setPenerbit (frame.getJtxtpenerbit().getText());
        db.setLokasi(frame.getJtxtlokasi().getText()); 
        db.setStock(frame.getJtxtstock().getText());
        impldatabuku.update(db);
    }
    
    public void delete () {
        int id = Integer.parseInt(frame.getJTxtid().getText()); impldatabuku.delete (id);
    }
    public void cari (String keyword, String category) (
        List<databuku> datasearch = new ArrayList<>();
        List<databuku> allData = impldatabuku.getAll();
        for (databuku buku allData) (
        if (category.equalsIgnoreCase("Judul")) {
        if (buku.getJudul().toLowerCase().contains(keyword.toLowerCase())) {
        datasearch.add(buku);
        }
        ) else if (category.equalsIgnoreCase ("Genre")) {
        if (buku.getGenre().toLowerCase().contains (keyword.toLowerCase())) {
            datasearch.add(buku);
        }
    
}
