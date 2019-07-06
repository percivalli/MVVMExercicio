
package br.com.digitalhouse.mvvmexercicio.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PessoasResponse {

    @Expose
    private Info info;
    @Expose
    @SerializedName("Pessoas")
    private List<Pessoa> pessoas;

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

}
