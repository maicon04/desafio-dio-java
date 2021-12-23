import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria de Java da DIO");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Spread Java");
        bootcamp.setDescricao("Bootcamp Spread Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Maicon");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" + dev1.getConteudosConcluidos());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("XP: " + dev1.calcularTotalXp());
        System.out.println("...................");
        System.out.println("Conteúdos inscritos" + dev1.getConteudosInscritos());
        System.out.println("*******************");

        Dev dev2 = new Dev();
        dev2.setNome("Luiz");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" + dev2.getConteudosConcluidos());
        dev2.progredir();
        System.out.println("XP: " + dev2.calcularTotalXp());
        System.out.println("...................");
        System.out.println("Conteúdos inscritos" + dev2.getConteudosInscritos());


    }
}
