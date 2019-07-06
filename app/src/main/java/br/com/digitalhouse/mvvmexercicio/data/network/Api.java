package br.com.digitalhouse.mvvmexercicio.data.network;

import br.com.digitalhouse.mvvmexercicio.model.Pessoa;
import io.reactivex.Single;
import retrofit2.http.GET;

public interface Api {

    @GET("api/?results=10")
    Single<Pessoa> getPessoas();

}
