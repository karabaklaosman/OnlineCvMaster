package com.example.cv.service;

import com.example.cv.dao.*;
import com.example.cv.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CvServis {

    @Autowired
    private ProfilDao profilDao;
    @Autowired
    private DeneyimDao deneyimDao;
    @Autowired
    private EgitimDao egitimDao;
    @Autowired
    private IlgilerDao ilgilerDao;
    @Autowired
    private ReferanslarDao referanslarDao;
    @Autowired
    private BeceriDao beceriDao;
    @Autowired
    private DillerDao dillerDao;
    @Autowired
    private BasarilarDao basarilarDao;
    @Autowired
    private KurslarDao kurslarDao;
    @Autowired
    private YayınlarDao yayınlarDao;
    @Autowired
    private OzelDao ozelDao;
    //Post Profil
    public int EkleProfil(Profil profil){

         return profilDao.save(profil).getId();
    }
    //Post Deneyim
    public void EkleDeneyim(Deneyim deneyim){
         deneyimDao.save(deneyim);
    }
    //Post Egitim
    public void EkleEgitim(Egitim egitim){
        egitimDao.save(egitim);
    }
    //Post Ilgiler
    public void EkleIlgiler(Ilgiler ilgiler){
        ilgilerDao.save(ilgiler);
    }
    //Post Referanslar
    public void EkleReferans(Referanslar referanslar){
        referanslarDao.save(referanslar);
    }
    //Post Beceriler
    public void EkleBeceri(Beceri beceri){
        beceriDao.save(beceri);
    }
    //Post Diller
    public void EkleDil(Diller diller){dillerDao.save(diller);}
    //Post Başarılar
    public void EkleBasari(Basarilar basarilar){
        basarilarDao.save(basarilar);
    }
    // Post Kurslar
    public void EkleKurslar(Kurslar kurslar){
        kurslarDao.save(kurslar);
    }
    // Post Yayınlar
    public void EkleYayınlar(Yayinlar yayinlar){
        yayınlarDao.save(yayinlar);
    }
    // Post Ozel
    public void EkleOzel(Ozel ozel){
        ozelDao.save(ozel);
    }

    //Get Profil
    public List<Profil> getAllProfil(){return  profilDao.findAll();}
    public Profil getProfil(int id){return  profilDao.findById(id).get();}

    //Get Deneyim
    public List<Deneyim> getAllDeneyim(){return  deneyimDao.findAll();}
    public List<Deneyim> getAllDeneyimOnProfilId(int id){return  deneyimDao.findAllByProfil_Id(id);}
    public Deneyim getDeneyim (int id){return  deneyimDao.findById(id).get();}

    //Get Egitim
    public List<Egitim> getAllEgitim(){return  egitimDao.findAll();}
    public List<Egitim> getAllEgitimOnProfilId(int id){return  egitimDao.findAllByProfil_Id(id);}
    public Egitim getEgitim (int id){return  egitimDao.findById(id).get();}

    //Get Ilgiler
    public List<Ilgiler> getAllIlgiler(){return  ilgilerDao.findAll();}
    public List<Ilgiler> getAllIlgilerOnProfilId(int id){return  ilgilerDao.findAllByProfil_Id(id);}
    public Ilgiler getIlgi (int id){return  ilgilerDao.findById(id).get();}

    //Get Referanslar
    public List<Referanslar> getAllReferanslar(){  return  referanslarDao.findAll();}
    public List<Referanslar> getAllReferanslarOnProfilId(int id){return  referanslarDao.findAllByProfil_Id(id);}
    public Referanslar getReferans (int id){return  referanslarDao.findById(id).get();}

    //Get Beceriler
    public List<Beceri> getAllBeceri(){return  beceriDao.findAll();}
    public List<Beceri> getAllBeceriOnProfilId(int id){return  beceriDao.findAllByProfil_Id(id);}
    public Beceri getBeceri (int id){return  beceriDao.findById(id).get();}

    //Get Diller
    public List<Diller> getAllDil(){return  dillerDao.findAll();}
    public List<Diller> getAllDilOnProfilId(int id){return  dillerDao.findAllByProfil_Id(id);}
    public Diller getDil (int id){return  dillerDao.findById(id).get();}

    //Get Başarılar
    public List<Basarilar> getAllBasari(){return  basarilarDao.findAll();}
    public List<Basarilar> getAllBasariOnProfilId(int id){return  basarilarDao.findAllByProfil_Id(id);}
    public Basarilar getBasari (int id){return  basarilarDao.findById(id).get();}

    //Get Kurslat
    public List<Kurslar> getAllKurs(){return  kurslarDao.findAll();}
    public List<Kurslar> getAllKursOnProfilId(int id){return  kurslarDao.findAllByProfil_Id(id);}
    public Kurslar getKurs (int id){return  kurslarDao.findById(id).get();}

    //Get Yayınlar
    public List<Yayinlar> getAllYayin(){return  yayınlarDao.findAll();}
    public List<Yayinlar> getAllYayinOnProfilId(int id){return  yayınlarDao.findAllByProfil_Id(id);}
    public Yayinlar getYayin (int id){return  yayınlarDao.findById(id).get();}

    //Get Ozal
    public List<Ozel> getAllOzel(){return  ozelDao.findAll();}
    public List<Ozel> getAllOzelOnProfilId(int id){return  ozelDao.findAllByProfil_Id(id);}
    public Ozel getOzel (int id){return  ozelDao.findById(id).get();}

    //Update Profil
    public int updateProfil(int id, Profil profil){
        Profil oldProfil = profilDao.getOne(id);
        oldProfil.setAdres(profil.getAdres());
        oldProfil.setAskerlik_durumu(profil.getAskerlik_durumu());
        oldProfil.setCinsiyet(profil.getCinsiyet());
        oldProfil.setDogum_tarihi(profil.getDogum_tarihi());
        oldProfil.setEhliyet(profil.getEhliyet());
        oldProfil.setEmail(profil.getEmail());
        oldProfil.setSehir(profil.getSehir());
        oldProfil.setIsim(profil.getIsim());
        oldProfil.setInternet_adresi(profil.getInternet_adresi());
        oldProfil.setLinkedln(profil.getLinkedln());
        oldProfil.setPosta_kodu(profil.getPosta_kodu());
        oldProfil.setSoy_isim(profil.getSoy_isim());
        oldProfil.setProfilePicture(profil.getProfilePicture());
        oldProfil.setUyruk(profil.getUyruk());
        oldProfil.setTel(profil.getTel());
        oldProfil.setMedeni_hali(profil.getMedeni_hali());
        oldProfil.setDogum_yeri(profil.getDogum_yeri());
        return profilDao.save(oldProfil).getId();
    }

    // Delete Deneyim
    public void deleteDeneyim (int id){  deneyimDao.deleteById(id);}
    // Delete Basari
    public void deleteBasari (int id){  basarilarDao.deleteById(id);}
    // Delete Beceri
    public void deleteBeceri (int id){  beceriDao.deleteById(id);}
    // Delete Dil
    public void deleteDil (int id){  dillerDao.deleteById(id);}
    // Delete Egitim
    public void deleteEgitim (int id){  egitimDao.deleteById(id);}
    // Delete İlgi
    public void deleteIlgi (int id){  ilgilerDao.deleteById(id);}
    // Delete Kurslar
    public void deleteKurslar (int id){  kurslarDao.deleteById(id);}
    // Delete Ozel
    public void deleteOzel (int id){  ozelDao.deleteById(id);}
    // Delete Referanslar
    public void deleteReferanslar (int id){  referanslarDao.deleteById(id);}
    // Delete Yayınlar
    public void deleteYayınlar (int id){  yayınlarDao.deleteById(id);}

}
