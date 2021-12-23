package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class Mentoria extends Conteudo {

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo=" + getTitulo() +
                " descricao=" + getDescricao()+
                " data=" + data +
                '}';
    }
}
