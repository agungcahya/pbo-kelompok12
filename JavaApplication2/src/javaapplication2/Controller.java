/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

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
            char jk;
            if("L".equals(view.getJenis_kel_dr())){
                jk='L';
            }else {
                jk='P';
            }
            String idp = view.getId_pasien_in();
            String nama = view.getNama_p();
            int umur = view.getUmur_p();
            String keluhan = view.getKeluhan();
            String alamat = view.getAlamat_p();
            String diagnosa = view.getDiagnosa();
            String id_D = view.getCmb_dokter();
            String id_R = view.getCmb_ruangan();
            model.menuSatu(nama, jk, umur, idp, keluhan, alamat, id_R, id_D, diagnosa);
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
                String id=model.getDaftarDokter().get(i).getId();
                String nama=model.getDaftarDokter().get(i).getNama();
                char jk=model.getDaftarDokter().get(i).getJenisKelamin();
                String sp=model.getDaftarDokter().get(i).getSpesialis();
                view.setDaftarDokter(id, nama, jk, sp, i);
            }  
        }
        
        //menu4
        if (source.equals(view.getShow_p())){
            for(int i=0; i<model.getDaftarpasien().size(); i++){
                String id=model.getDaftarpasien().get(i).getId();
                String nama=model.getDaftarpasien().get(i).getNama();
                String diag=model.getDaftarpasien().get(i).getPenyakit();
                String kmr=null;
                for(int j=0;j<model.getDaftarRuangan().size();j++){
                    if(model.getDaftarRuangan().get(j).getPasienInapId(id)!=null){
                        kmr=model.getDaftarRuangan().get(j).getId();
                        
                    }
                }
                view.setDaftarPasien(id, nama, diag, kmr, i);
            }
        }

        //menu5
        if (source.equals(view.getShow_r())){
            for(int i=0; i<model.getDaftarRuangan().size(); i++){
                String id=model.getDaftarRuangan().get(i).getId();
                String tipe=model.getDaftarRuangan().get(i).getType();
                int kp=model.getDaftarRuangan().get(i).getKapasitas();
                int av=(model.getDaftarRuangan().get(i).getKapasitas()-model.getDaftarRuangan().get(i).i);
                Object[] o= {id,tipe,kp,av};
               
                
                view.setTab_r(id,tipe,kp,av,i);
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
            view.setCmb_dokter(view.getId_dr());
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
            view.setCmb_ruangan(id);
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
