package exercicio;

public class Principal {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Carlos");
		aluno.setCpf("098.546.669-79");
		aluno.setRg("87.485.197");
		aluno.setEndereco("endereco");
	//	aluno.setCurso("Sistemas");
		aluno.setMatricula(8372);
		System.out.println("Dados do Aluno: \n \n" + aluno);
	}
}
