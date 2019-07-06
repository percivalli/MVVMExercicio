package br.com.digitalhouse.mvvmexercicio.data.database;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;

import androidx.room.TypeConverter;
import br.com.digitalhouse.mvvmexercicio.model.Dob;
import br.com.digitalhouse.mvvmexercicio.model.Id;
import br.com.digitalhouse.mvvmexercicio.model.Location;
import br.com.digitalhouse.mvvmexercicio.model.Login;
import br.com.digitalhouse.mvvmexercicio.model.Name;
import br.com.digitalhouse.mvvmexercicio.model.Picture;
import br.com.digitalhouse.mvvmexercicio.model.Registered;

public class Converters {

    @TypeConverter
    public Date toDate(Long timestamp) {
        if (timestamp == null) {
            return null;
        } else {
            return new Date(timestamp);
        }
    }

    @TypeConverter
    public Long toTimestamp(Date date) {
        return date.getTime();
    }

    /// Type converter
    @TypeConverter
    public Dob fromDob(String value) {
        Type listType = (Type) new TypeToken<Dob>() {
        }.getType();
        return new Gson().fromJson(value, listType);
    }

    @TypeConverter
    public String fromDob(Dob dob) {
        Gson gson = new Gson();
        return gson.toJson(dob);
    }

    /// Type converter

    @TypeConverter
    public Id fromId(String value) {
        Type listType = (Type) new TypeToken<Id>() {
        }.getType();
        return new Gson().fromJson(value, listType);
    }

    @TypeConverter
    public String fromId(Id id) {
        Gson gson = new Gson();
        return gson.toJson(id);

    }

    /// Type converter

    @TypeConverter
    public Location fromLocation(String value) {
        Type listType = (Type) new TypeToken<Location>() {
        }.getType();
        return new Gson().fromJson(value, listType);
    }

    @TypeConverter
    public String fromLocation(Location location) {
        Gson gson = new Gson();
        return gson.toJson(location);

        /// Type converter

    }

    /// Type converter

    @TypeConverter
    public Login fromLogin(String value) {
        Type listType = (Type) new TypeToken<Login>() {
        }.getType();
        return new Gson().fromJson(value, listType);
    }

    @TypeConverter
    public String fromLogin(Login login) {
        Gson gson = new Gson();
        return gson.toJson(login);

        /// Type converter

    }

    /// Type converter

    @TypeConverter
    public Name fromName(String value) {
        Type listType = (Type) new TypeToken<Name>() {
        }.getType();
        return new Gson().fromJson(value, listType);
    }

    @TypeConverter
    public String fromName(Name name) {
        Gson gson = new Gson();
        return gson.toJson(name);

        /// Type converter

    }

    /// Type converter

    @TypeConverter
    public Picture fromPicture(String value) {
        Type listType = (Type) new TypeToken<Picture>() {
        }.getType();
        return new Gson().fromJson(value, listType);
    }

    @TypeConverter
    public String fromPicture(Picture picture) {
        Gson gson = new Gson();
        return gson.toJson(picture);

        /// Type converter

    }

    /// Type converter

    @TypeConverter
    public Registered fromRegisterd(String value) {
        Type listType = (Type) new TypeToken<Registered>() {
        }.getType();
        return new Gson().fromJson(value, listType);
    }

    @TypeConverter
    public String fromRegistered(Registered registered) {
        Gson gson = new Gson();
        return gson.toJson(registered);

        /// Type converter

    }
}






