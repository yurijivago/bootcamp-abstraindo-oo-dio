import br.com.yurijivago.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescicao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescicao("Descrição do curso JavaScipt");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescicao("Mentoria utilizando a linguagem Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Yuri");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + dev1.getNome() + "\n" + dev1.getConteudosIncritos());

        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos: " + dev1.getNome() + "\n" + dev1.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos: " + dev1.getNome() + "\n" + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");

        Dev dev2 = new Dev();
        dev2.setNome("Simone");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + dev2.getNome() + "\n" + dev2.getConteudosIncritos());
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos: " + dev2.getNome() + "\n" + dev2.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos: " + dev2.getNome() + "\n" + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());

    }
}
