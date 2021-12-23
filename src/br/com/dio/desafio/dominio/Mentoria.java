package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate data;

}
