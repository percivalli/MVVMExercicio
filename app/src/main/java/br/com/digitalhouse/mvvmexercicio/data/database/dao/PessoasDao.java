package br.com.digitalhouse.mvvmexercicio.data.database.dao;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import br.com.digitalhouse.mvvmexercicio.model.Pessoa;
import io.reactivex.Flowable;

@Dao
public interface PessoasDao {

    //resolver conflitos

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Pessoa pessoa);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<Pessoa> pessoas);

    @Update
    void update(Pessoa pessoa);

    @Delete
    void update(Pessoa pessoa);

    @Query("select * from pessoas limit 30")
    List<Pessoa> getAll();

    @Query("select * from pessoas limit 30")
    Flowable<Pessoa> getAllRxJava();

    @Query("select * from pessoas where idBanco = :idBanco")
    Pessoa getPessoaById(long idBanco);

    @Query("select * from pessoas where idBanco = :idBanco")
    Flowable<Pessoa> getPessoaByIdRxJava(long idBanco);

    @Query("select * from pessoas where name = :name")
    Pessoa getByName(String name);

}
