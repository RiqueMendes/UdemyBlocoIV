public class CursoTeste {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Joao");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java completo");
        Curso curso2 = new Curso("Web 2023");
        Curso curso3 = new Curso("React Native");

        curso1.addAluno(aluno1);
        curso1.addAluno(aluno2);

        curso2.addAluno(aluno3);
        curso2.addAluno(aluno1); // Bidirecional

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for (Aluno aluno : curso1.alunos) { // Aluno percorrendo o curso 1
            System.out.println("Estou matriculado no curso 1 "
                    + curso1.nome + "...");
            System.out.println("E o meu nome é : " + aluno.nome);
            System.out.println();
        }

        for (Aluno aluno : curso2.alunos) { // Aluno percorrendo o curso 1
            System.out.println("Estou matriculado no curso 2 "
                    + curso2.nome + "...");
            System.out.println("E o meu nome é : " + aluno.nome);
            System.out.println();
        }

        for (Aluno aluno : curso3.alunos) { // Aluno percorrendo o curso 1
            System.out.println("Estou matriculado no curso 3 "
                    + curso3.nome + "...");
            System.out.println("E o meu nome é : " + aluno.nome);
            System.out.println();
        }

        System.out.println(aluno1.cursos.get(0).alunos); //A partir de aluno peguei os cursos do aluno
                                                                // peguei o primeiro curso do aluno (indice 0)
                                                                // e mostrei todos os alunos do curso


        Curso cursoEncontrado = aluno1.obteCursoPorNome("Java completo");
    

        if(cursoEncontrado != null){
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }
    }
}
