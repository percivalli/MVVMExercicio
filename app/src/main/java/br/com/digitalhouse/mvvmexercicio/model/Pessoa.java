
package br.com.digitalhouse.mvvmexercicio.model;

import com.google.gson.annotations.Expose;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "pessoas")
public class Pessoa {

    @PrimaryKey(autoGenerate = true)
    private long idBanco;

    @Expose
    // se quiser renomear o nome da tabela
    @ColumnInfo(name = "cell")
    private String cell;

    // se não, ela fica com o nome que está vindo
    @Expose
    private Dob dob;
    @Expose
    private String email;
    @Expose
    private String gender;
    @Expose
    private Id id;
    @Expose
    private Location location;
    @Expose
    private Login login;
    @Expose
    private Name name;
    @Expose
    private String nat;
    @Expose
    private String phone;
    @Expose
    private Picture picture;
    @Expose
    private Registered registered;

    public long getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(long idBanco) {
        this.idBanco = idBanco;
    }

    public Pessoa() {
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public Dob getDob() {
        return dob;
    }

    public void setDob(Dob dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getNat() {
        return nat;
    }

    public void setNat(String nat) {
        this.nat = nat;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public Registered getRegistered() {
        return registered;
    }

    public void setRegistered(Registered registered) {
        this.registered = registered;
    }

}
