package exe3;

public class Aluno extends Pessoa{
	private String curso;
	
	public Aluno(String nome, int idade, String curso) {
		setNome(nome);
		setIdade(idade);
		setCurso(curso);
		
		mostraDados();
	}

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void mostraDados() {
		System.out.println("Nome: "+getNome());
		System.out.println("Idade: "+getIdade());
		System.out.println("Curso do aluno: "+getCurso());
	}
}
