package com.example.cv.restController;

import com.example.cv.entity.*;
import com.example.cv.service.CvServis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
public class CvRController {
    @Autowired
    private CvServis cvServis;

    @RequestMapping(method = RequestMethod.PUT, value = "/profil/{profil_id}")
    public ResponseEntity<Integer> updateProfil(@RequestBody Profil profil, @PathVariable("profil_id") int id) {
        System.out.println("controlerasres"+profil.getAdres());
        cvServis.updateProfil(id, profil);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

    // Post Profil
    @RequestMapping(method = RequestMethod.POST, value = "/profil")
    public ResponseEntity<Integer> postProfil(@RequestBody Profil profil) {
        int id = cvServis.EkleProfil(profil);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
    // Post Deneyim

    @RequestMapping(method = RequestMethod.POST, value = "/profil/{id}/deneyim")
    public ResponseEntity<HttpStatus> postDeneyim(@RequestBody Deneyim deneyim, @PathVariable("id") int id) {
        Profil profil = cvServis.getProfil(id);
        deneyim.setProfil(profil);
        cvServis.EkleDeneyim(deneyim);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // Post Egitim
    @RequestMapping(method = RequestMethod.POST, value = "/profil/{id}/egitim")
    public ResponseEntity<HttpStatus> postEgitim(@RequestBody Egitim egitim, @PathVariable("id") int id) {
        Profil profil = cvServis.getProfil(id);
        egitim.setProfil(profil);
        cvServis.EkleEgitim(egitim);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // Post ilgi
    @RequestMapping(method = RequestMethod.POST, value = "/profil/{id}/ilgi")
    public ResponseEntity<HttpStatus> postIlgiler(@RequestBody Ilgiler ilgiler, @PathVariable("id") int id) {
        Profil profil = cvServis.getProfil(id);
        ilgiler.setProfil(profil);
        cvServis.EkleIlgiler(ilgiler);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // Post Referans
    @RequestMapping(method = RequestMethod.POST, value = "/profil/{id}/referans")
    public ResponseEntity<HttpStatus> postReferanslar(@RequestBody Referanslar referanslar, @PathVariable("id") int id) {
        Profil profil = cvServis.getProfil(id);
        referanslar.setProfil(profil);
        cvServis.EkleReferans(referanslar);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // Post Beceri
    @RequestMapping(method = RequestMethod.POST, value = "/profil/{id}/beceri")
    public ResponseEntity<HttpStatus> postBeceri(@RequestBody Beceri beceri, @PathVariable("id") int id) {
        Profil profil = cvServis.getProfil(id);
        beceri.setProfil(profil);
        cvServis.EkleBeceri(beceri);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // Diller
    @RequestMapping(method = RequestMethod.POST, value = "/profil/{id}/dil")
    public ResponseEntity<HttpStatus> postDiller(@RequestBody Diller diller, @PathVariable("id") int id) {
        Profil profil = cvServis.getProfil(id);
        diller.setProfil(profil);
        cvServis.EkleDil(diller);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // Başarılar
    @RequestMapping(method = RequestMethod.POST, value = "/profil/{id}/basari")
    public ResponseEntity<HttpStatus> postBasari(@RequestBody Basarilar basarilar, @PathVariable("id") int id) {
        Profil profil = cvServis.getProfil(id);
        basarilar.setProfil(profil);
        cvServis.EkleBasari(basarilar);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // Post Kurslar
    @RequestMapping(method = RequestMethod.POST, value = "/profil/{id}/kurs")
    public ResponseEntity<HttpStatus> postKurslar(@RequestBody Kurslar kurslar, @PathVariable("id") int id) {
        Profil profil = cvServis.getProfil(id);
        kurslar.setProfil(profil);
        cvServis.EkleKurslar(kurslar);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // Post Yayinlar
    @RequestMapping(method = RequestMethod.POST, value = "/profil/{id}/yayin")
    public ResponseEntity<HttpStatus> postYayınlar(@RequestBody Yayinlar yayinlar, @PathVariable("id") int id) {
        Profil profil = cvServis.getProfil(id);
        yayinlar.setProfil(profil);
        cvServis.EkleYayınlar(yayinlar);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // Post Ozel
    @RequestMapping(method = RequestMethod.POST, value = "/profil/{id}/ozel")
    public ResponseEntity<HttpStatus> postOzel(@RequestBody Ozel ozel, @PathVariable("id") int id) {
        Profil profil = cvServis.getProfil(id);
        ozel.setProfil(profil);
        cvServis.EkleOzel(ozel);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // GET Profil
    @RequestMapping(method = RequestMethod.GET, value = "/profil")
    public ResponseEntity<List<Profil>> getAllProfil() {
        return new ResponseEntity<>(cvServis.getAllProfil(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/profil/{profil_id}")
    public ResponseEntity<Profil> getProfil(@PathVariable("profil_id") int id) {
        return new ResponseEntity<>(cvServis.getProfil(id), HttpStatus.OK);
    }

    //     Get Deneyim
    @RequestMapping(method = RequestMethod.GET, value = "/profil/deneyim")
    public ResponseEntity<List<Deneyim>> getAllDeneyim() {
        return new ResponseEntity<>(cvServis.getAllDeneyim(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/profil/{profil_id}/deneyim")
    public ResponseEntity<List<Deneyim>> getAllDeneyimOnProfilId(@PathVariable("profil_id") int id) {
        return new ResponseEntity<>(cvServis.getAllDeneyimOnProfilId(id), HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.GET, value = "/profil/deneyim/{deneyim_id}")
    public ResponseEntity<Deneyim> getDeneyim(@PathVariable("deneyim_id") int id) {
        return new ResponseEntity<>(cvServis.getDeneyim(id), HttpStatus.OK);
    }

    // Get Egitim
    @RequestMapping(method = RequestMethod.GET, value = "/profil/egitim")
    public ResponseEntity<List<Egitim>> getAllEgitim() {
        return new ResponseEntity<>(cvServis.getAllEgitim(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/profil/{profil_id}/egitim")
    public ResponseEntity<List<Egitim>> getAllEgitimOnProfilId(@PathVariable("profil_id") int id) {
        return new ResponseEntity<>(cvServis.getAllEgitimOnProfilId(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/profil/egitim/{egitim_id}")
    public ResponseEntity<Egitim> getEgitim(@PathVariable("egitim_id") int id) {
        return new ResponseEntity<>(cvServis.getEgitim(id), HttpStatus.OK);
    }

    // Get Ilgiler
    @RequestMapping(method = RequestMethod.GET, value = "/profil/ilgi")
    public ResponseEntity<List<Ilgiler>> getAllIlgiler() {
        return new ResponseEntity<>(cvServis.getAllIlgiler(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/profil/{profil_id}/ilgi")
    public ResponseEntity<List<Ilgiler>> getAllIlgilerOnProfilId(@PathVariable("profil_id") int id) {
        return new ResponseEntity<>(cvServis.getAllIlgilerOnProfilId(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/profil/ilgi/{ilgi_id}")
    public ResponseEntity<Ilgiler> getIlgi(@PathVariable("ilgi_id") int id) {
        return new ResponseEntity<>(cvServis.getIlgi(id), HttpStatus.OK);
    }

    // Get Referanslar
    @RequestMapping(method = RequestMethod.GET, value = "/profil/referans")
    public ResponseEntity<List<Referanslar>> getAllIReferanslar() {
        return new ResponseEntity<>(cvServis.getAllReferanslar(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/profil/{profil_id}/referans")
    public ResponseEntity<List<Referanslar>> getAllIReferanslarOnProfilId(@PathVariable("profil_id") int id) {
        return new ResponseEntity<>(cvServis.getAllReferanslarOnProfilId(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/profil/referans/{referans_id}")
    public ResponseEntity<Referanslar> getReferans(@PathVariable("referans_id") int id) {
        return new ResponseEntity<>(cvServis.getReferans(id), HttpStatus.OK);
    }

    // Get Beceri
    @RequestMapping(method = RequestMethod.GET, value = "/profil/beceri")
    public ResponseEntity<List<Beceri>> getAllIBeceri() {
        return new ResponseEntity<>(cvServis.getAllBeceri(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/profil/{profil_id}/beceri")
    public ResponseEntity<List<Beceri>> getAllIBeceriOnProfilId(@PathVariable("profil_id") int id) {
        return new ResponseEntity<>(cvServis.getAllBeceriOnProfilId(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/profil/beceri/{beceri_id}")
    public ResponseEntity<Beceri> getBeceri(@PathVariable("beceri_id") int id) {
        return new ResponseEntity<>(cvServis.getBeceri(id), HttpStatus.OK);
    }

    // Get Diller
    @RequestMapping(method = RequestMethod.GET, value = "/profil/dil")
    public ResponseEntity<List<Diller>> getAllIDil() {
        return new ResponseEntity<>(cvServis.getAllDil(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/profil/{profil_id}/dil")
    public ResponseEntity<List<Diller>> getAllIDilOnProfilId(@PathVariable("profil_id") int id) {
        return new ResponseEntity<>(cvServis.getAllDilOnProfilId(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/profil/dil/{dil_id}")
    public ResponseEntity<Diller> getDil(@PathVariable("dil_id") int id) {
        return new ResponseEntity<>(cvServis.getDil(id), HttpStatus.OK);
    }

    // Get Başarılar
    @RequestMapping(method = RequestMethod.GET, value = "/profil/basari")
    public ResponseEntity<List<Basarilar>> getAllIBasari() {
        return new ResponseEntity<>(cvServis.getAllBasari(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/profil/{profil_id}/basari")
    public ResponseEntity<List<Basarilar>> getAllIBasariOnProfilId(@PathVariable("profil_id") int id) {
        return new ResponseEntity<>(cvServis.getAllBasariOnProfilId(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/profil/basari/{basari_id}")
    public ResponseEntity<Basarilar> getBasari(@PathVariable("basari_id") int id) {
        return new ResponseEntity<>(cvServis.getBasari(id), HttpStatus.OK);
    }

    // Get Kurslar
    @RequestMapping(method = RequestMethod.GET, value = "/profil/kurs")
    public ResponseEntity<List<Kurslar>> getAllIKurs() {
        return new ResponseEntity<>(cvServis.getAllKurs(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/profil/{profil_id}/kurs")
    public ResponseEntity<List<Kurslar>> getAllIKursOnProfilId(@PathVariable("profil_id") int id) {
        return new ResponseEntity<>(cvServis.getAllKursOnProfilId(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/profil/kurs/{kurs_id}")
    public ResponseEntity<Kurslar> getKurs(@PathVariable("kurs_id") int id) {
        return new ResponseEntity<>(cvServis.getKurs(id), HttpStatus.OK);
    }

    // Get Yayinlar
    @RequestMapping(method = RequestMethod.GET, value = "/profil/yayin")
    public ResponseEntity<List<Yayinlar>> getAllIYayin() {
        return new ResponseEntity<>(cvServis.getAllYayin(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/profil/{profil_id}/yayin")
    public ResponseEntity<List<Yayinlar>> getAllIYayinOnProfilId(@PathVariable("profil_id") int id) {
        return new ResponseEntity<>(cvServis.getAllYayinOnProfilId(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/profil/yayin/{yayin_id}")
    public ResponseEntity<Yayinlar> getYayin(@PathVariable("yayin_id") int id) {
        return new ResponseEntity<>(cvServis.getYayin(id), HttpStatus.OK);
    }

    // Get Ozel
    @RequestMapping(method = RequestMethod.GET, value = "/profil/ozel")
    public ResponseEntity<List<Ozel>> getAllIOzel() {
        return new ResponseEntity<>(cvServis.getAllOzel(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/profil/{profil_id}/ozel")
    public ResponseEntity<List<Ozel>> getAllIOzelOnProfilId(@PathVariable("profil_id") int id) {
        return new ResponseEntity<>(cvServis.getAllOzelOnProfilId(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/profil/ozel/{ozel_id}")
    public ResponseEntity<Ozel> getOzel(@PathVariable("ozel_id") int id) {
        return new ResponseEntity<>(cvServis.getOzel(id), HttpStatus.OK);
    }

    // Delete Deneyim
    @RequestMapping(method = RequestMethod.DELETE, value = "/profil/deneyim/{id}")
    public ResponseEntity<HttpStatus> deleteDeneyim(@PathVariable("id") int id) {
        cvServis.deleteDeneyim(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    // Delete Basarı
    @RequestMapping(method = RequestMethod.DELETE, value = "/profil/basari/{id}")
    public ResponseEntity<HttpStatus> deleteBasari(@PathVariable("id") int id) {
        cvServis.deleteBasari(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    // Delete Beceri
    @RequestMapping(method = RequestMethod.DELETE, value = "/profil/beceri/{id}")
    public ResponseEntity<HttpStatus> deleteBeceri(@PathVariable("id") int id) {
        cvServis.deleteBeceri(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    // Delete Dil
    @RequestMapping(method = RequestMethod.DELETE, value = "/profil/dil/{id}")
    public ResponseEntity<HttpStatus> deleteDil(@PathVariable("id") int id) {
        cvServis.deleteDil(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    // Delete Egitim
    @RequestMapping(method = RequestMethod.DELETE, value = "/profil/egitim/{id}")
    public ResponseEntity<HttpStatus> deleteEgitim(@PathVariable("id") int id) {
        cvServis.deleteEgitim(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    // Delete İlgiler
    @RequestMapping(method = RequestMethod.DELETE, value = "/profil/ilgi/{id}")
    public ResponseEntity<HttpStatus> deleteIlgi(@PathVariable("id") int id) {
        cvServis.deleteIlgi(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    // Delete Ozel
    @RequestMapping(method = RequestMethod.DELETE, value = "/profil/ozel/{id}")
    public ResponseEntity<HttpStatus> deleteOzel(@PathVariable("id") int id) {
        cvServis.deleteOzel(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    // Delete Referans
    @RequestMapping(method = RequestMethod.DELETE, value = "/profil/referans/{id}")
    public ResponseEntity<HttpStatus> deleteReferans(@PathVariable("id") int id) {
        cvServis.deleteReferanslar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    // Delete Yayın
    @RequestMapping(method = RequestMethod.DELETE, value = "/profil/yayin/{id}")
    public ResponseEntity<HttpStatus> deleteYayin(@PathVariable("id") int id) {
        cvServis.deleteYayınlar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
