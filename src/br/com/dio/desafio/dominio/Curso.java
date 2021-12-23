package br.com.dio.desafio.dominio;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;
}
