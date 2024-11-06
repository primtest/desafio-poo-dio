import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java Developer");
        curso1.setDescricao("Descrição do Java Developer");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição do curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFulano = new Dev();
        devFulano.setNome("Fulano");
        devFulano.inscreverBootcamp(bootcamp);
        System.out.println(devFulano.getNome());
        System.out.println("Conteúdos Inscritos" + devFulano.getConteudosInscritos());
        devFulano.progredir();
        devFulano.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos" + devFulano.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos" + devFulano.getConteudosInscritos());
        System.out.println("XP:" + devFulano.calcularTotalXp());

        System.out.println("--------");

        Dev devBeltrano = new Dev();
        devBeltrano.setNome("Beltrano");
        System.out.println(devBeltrano.getNome());
        devBeltrano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devBeltrano.getConteudosInscritos());
        devBeltrano.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devBeltrano.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devBeltrano.getConteudosConcluidos());
        System.out.println("XP:" + devBeltrano.calcularTotalXp());
    }
}