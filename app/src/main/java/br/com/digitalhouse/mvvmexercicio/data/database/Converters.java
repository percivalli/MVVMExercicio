package br.com.digitalhouse.mvvmexercicio.data.database;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;

import androidx.room.TypeConverter;
import br.com.digitalhouse.mvvmexercicio.model.Dob;
import br.com.digitalhouse.mvvmexercicio.model.Id;

class Converters {

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
    public Id fromId (String value) {
        Type listType = (Type) new TypeToken<Id>() {
        }.getType();
        return new Gson().fromJson(value, listType);
    }

    @TypeConverter
    public String fromId(Id id) {
        Gson gson = new Gson();
        return gson.toJson(id);
    }
}
