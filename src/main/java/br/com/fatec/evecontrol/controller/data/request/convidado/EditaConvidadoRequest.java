package br.com.fatec.evecontrol.controller.data.request.convidado;

import br.com.fatec.evecontrol.model.Convidado;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;

public class EditaConvidadoRequest {

    @JsonProperty(value = "nome_convidado")
    @NotBlank(message = "convidado.nome.notblank")
    private String nome;

    @JsonProperty(value = "rg")
    @NotBlank(message = "convidado.rg.notblank")
    private String rg;

    @JsonProperty(value = "cpf")
    @NotBlank(message = "convidado.cpf.notblank")
    private String cpf;

    @JsonProperty(value = "telefone")
    @NotBlank(message = "convidade.telefone.notblank")
    private String telefone;

    public Convidado toModel(Convidado convidado){

        return Convidado.builder()
                .id(convidado.getId())
                .nome(this.nome)
                .rg(this.rg)
                .cpf(this.cpf)
                .telefone(this.telefone)
                .confirmacaoPresenca(convidado.isConfirmacaoPresenca())
                .build();
    }

}