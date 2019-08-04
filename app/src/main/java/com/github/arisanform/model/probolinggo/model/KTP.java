package com.github.arisanform.model.probolinggo.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class KTP extends RealmObject{
    @PrimaryKey
    int id_local;

    int id;
    String nik;
    String desa_pengantar;
    String tipe_pengajuan;
    String nik_nama;
    String nik_no_kk;
    String nik_status_pernikahan;
    String nik_pekerjaan_desc;
    String nik_alamat_lengkap;
    String nik_tanggal_lahir;
    String nik_tempat_lahir;
    String nik_jenis_kelamin;
    String nik_agama;
    String nik_gol_darah;
    String nik_no_telp;
    String lampiran_foto;
    String lampiran_kk;

    String kode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_local() {
        return id_local;
    }

    public void setId_local(int id_local) {
        this.id_local = id_local;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getDesa_pengantar() {
        return desa_pengantar;
    }

    public void setDesa_pengantar(String desa_pengantar) {
        this.desa_pengantar = desa_pengantar;
    }

    public String getTipe_pengajuan() {
        return tipe_pengajuan;
    }

    public void setTipe_pengajuan(String tipe_pengajuan) {
        this.tipe_pengajuan = tipe_pengajuan;
    }

    public String getNik_nama() {
        return nik_nama;
    }

    public void setNik_nama(String nik_nama) {
        this.nik_nama = nik_nama;
    }

    public String getNik_no_kk() {
        return nik_no_kk;
    }

    public void setNik_no_kk(String nik_no_kk) {
        this.nik_no_kk = nik_no_kk;
    }

    public String getNik_status_pernikahan() {
        return nik_status_pernikahan;
    }

    public void setNik_status_pernikahan(String nik_status_pernikahan) {
        this.nik_status_pernikahan = nik_status_pernikahan;
    }

    public String getNik_pekerjaan_desc() {
        return nik_pekerjaan_desc;
    }

    public void setNik_pekerjaan_desc(String nik_pekerjaan_desc) {
        this.nik_pekerjaan_desc = nik_pekerjaan_desc;
    }

    public String getNik_alamat_lengkap() {
        return nik_alamat_lengkap;
    }

    public void setNik_alamat_lengkap(String nik_alamat_lengkap) {
        this.nik_alamat_lengkap = nik_alamat_lengkap;
    }

    public String getNik_tanggal_lahir() {
        return nik_tanggal_lahir;
    }

    public void setNik_tanggal_lahir(String nik_tanggal_lahir) {
        this.nik_tanggal_lahir = nik_tanggal_lahir;
    }

    public String getNik_tempat_lahir() {
        return nik_tempat_lahir;
    }

    public void setNik_tempat_lahir(String nik_tempat_lahir) {
        this.nik_tempat_lahir = nik_tempat_lahir;
    }

    public String getNik_jenis_kelamin() {
        return nik_jenis_kelamin;
    }

    public void setNik_jenis_kelamin(String nik_jenis_kelamin) {
        this.nik_jenis_kelamin = nik_jenis_kelamin;
    }

    public String getNik_agama() {
        return nik_agama;
    }

    public void setNik_agama(String nik_agama) {
        this.nik_agama = nik_agama;
    }

    public String getNik_gol_darah() {
        return nik_gol_darah;
    }

    public void setNik_gol_darah(String nik_gol_darah) {
        this.nik_gol_darah = nik_gol_darah;
    }

    public String getNik_no_telp() {
        return nik_no_telp;
    }

    public void setNik_no_telp(String nik_no_telp) {
        this.nik_no_telp = nik_no_telp;
    }

    public String getLampiran_foto() {
        return lampiran_foto;
    }

    public void setLampiran_foto(String lampiran_foto) {
        this.lampiran_foto = lampiran_foto;
    }

    public String getLampiran_kk() {
        return lampiran_kk;
    }

    public void setLampiran_kk(String lampiran_kk) {
        this.lampiran_kk = lampiran_kk;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
}
