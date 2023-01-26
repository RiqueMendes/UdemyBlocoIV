import java.util.ArrayList;
import java.util.List;

public class Aluno {

    final String nome; // constante -> Não posso alterar o endereço de memoria
    final List<Curso> cursos = new ArrayList<>(); // Aluno recebe uma lista de Curso chamada cursos
                                                  // Nesse caso, posso manipular a lista mas sempre apontará para o
                                                  // mesmo endereco de memoria
                                                  

    public Aluno(String nome) { // Construtor padrão do java onde as informacoes tem this. as mesmas informacoes
                                // para passarmos depois o nome (neste caso)
        this.nome = nome;
    }

    void adicionarCurso(Curso curso) { // Recebendo um Curso de curso como parametro
        this.cursos.add(curso); // metodo add do list, nesse caso para cursos
        curso.alunos.add(this); // Metodo add do list, nesse caso para alunos
    }

    public String toString(){ //Converter Objeto para String
        return  "O meu nome é " + nome; 
    }

    Curso obteCursoPorNome(String nome){
        for(Curso curso: this.cursos){ 
            if(curso.nome.equalsIgnoreCase(nome)){
                return curso;
            }
        }
        return null;
    }
}
