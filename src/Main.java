import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição para o curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso React.js");
        curso2.setDescricao("Descrição para o curso de React.js");
        curso2.setCargaHoraria(8);
        System.out.println(curso1.toString());
        System.out.println(curso2.toString());

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria de Java da DIO");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1.toString());
    }
}
