package pessoal;

import java.time.LocalDate;

public class FactoryFuncionarios {
	
	
	public FactoryFuncionarios(){
		
	}
	
	public Funcionario criaFuncionario(String cargo, String nome, LocalDate dataDeNascimento){
		
		switch (cargo) {
		case "diretor":
			return criaDiretor(nome, dataDeNascimento);
		case "medico":
			return criaMedico(nome, dataDeNascimento);
		case "tecnico":
			return criaTecnico(nome, dataDeNascimento);

		default:
			break;
		}
		return null;
	
		
	}
	
	private Funcionario criaDiretor(String nome, LocalDate dataDeNascimento){
		Funcionario diretor = new Funcionario(nome, dataDeNascimento);
		diretor.atribuiCargoDiretor();
		return diretor;
	}
	
	private Funcionario criaMedico(String nome, LocalDate dataDeNascimento){
		Funcionario medico = new Funcionario(nome, dataDeNascimento);
		medico.atribuiCargoMedico();
		return medico;
	}
	
	private Funcionario criaTecnico(String nome, LocalDate dataDeNascimento){
		Funcionario tecnico = new Funcionario(nome, dataDeNascimento);
		tecnico.atribuiCargoTecnico();
		return tecnico;
	}
	
}