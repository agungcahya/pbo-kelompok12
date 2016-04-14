/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author wewew
 */
public class Controller implements ActionListener{
    private final Aplikasi model;
    private final View view;
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        //menu1
        if (source.equals(view.getBtn_cancel_in())){
            view.resetCheckIn();
        }
        if (source.equals(view.getBtn_checkin())){
            String idp = view.getId_pasien_in();
            String nama = view.getNama_p();

            int umur = view.getUmur_p();
            String keluhan = view.getKeluhan();
            String alamat = view.getAlamat_p();
            //model.menuSatu(nama, jk, umur, idp, keluhan, alamat, id_R, id_D, diagnosa);
            view.resetCheckIn();
        }
        
        //menu2
        if (source.equals(view.getBtn_cancel_out())){
            view.resetCheckOut();
        }
        if (source.equals(view.getBtn_checkout())){
            String idOut = view.getId_pasien_out();
            model.deletePasien(idOut);
            model.removePasienInapId(idOut);
            view.resetCheckOut();
        }
        
        //menu3
        if (source.equals(view.getBtn_show_dr())){
            for(int i=0; i<model.getDaftarDokter().size(); i++){
                String s=model.getDaftarDokter().get(i).getId();
                view.setDaftarDokter(s);
            }  
        }       

        //menu5
        if (source.equals(view.getShow_r())){
            for(int i=0; i<model.getDaftarRuangan().size(); i++){
                String s=model.getDaftarRuangan().get(i).getId();
                view.setDaftarRuangan(s);
            }  
        }
        
        //menu6
        if (source.equals(view.getBtn_cancel_dr())){
            view.resetAdd_dokter();
        }
        if (source.equals(view.getBtn_submit_dr())){
            char jk;
            if("L".equals(view.getJenis_kel_dr())){
                jk='L';
            }else {
                jk='P';
            }
            model.menuEnam(view.getNama_dr(), jk, view.getUmur_dr(), view.getId_dr(), view.getSpes_dr());
            view.resetAdd_dokter();
        }
        
        //menu7
        if (source.equals(view.getBtn_cancel_r())){
            view.resetAdd_ruangan();
        }
        if (source.equals(view.getBtn_submit_r())){
            String id = view.getId_ruangan();
            String tipe = view.getTipe_cb();
            model.addRuangan(id, tipe);
            view.resetAdd_ruangan();
        }
        
    }
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        
    
    
    public Controller(Aplikasi model){
        this.model=model;
        this.view=new View();
        
        view.addListener(this);
        view.setVisible(true);
    }
    
}
