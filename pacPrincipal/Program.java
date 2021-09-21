package pacPrincipal;

import javax.swing.JOptionPane;
import pacOutros.Aluno;
import pacOutros.Professor;
import pacOutros.Endereco;

public class Program {

	public static void main(String[] args) {
		
		try {
			JOptionPane.showMessageDialog(null, "Dados de Alunos e Professores", "Sala de Aula", JOptionPane.INFORMATION_MESSAGE);
			
			//A L U N O S 
			JOptionPane.showMessageDialog(null, "Dados dos Alunos", "Sala de Aula", JOptionPane.INFORMATION_MESSAGE);
			
			int qtdAl = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos deseja informar?"));
			Aluno turma[] = new Aluno[qtdAl];
			
			for(int i=0; i<turma.length; i++) {
			
			String nome = JOptionPane.showInputDialog("Digite o nome do " +(i+1)+ "º Aluno");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade de " +nome));
			int serie = Integer.parseInt(JOptionPane.showInputDialog("Sua série: "));
			
			String bairro = JOptionPane.showInputDialog("Qual o bairro em que mora: ");
			String rua = JOptionPane.showInputDialog("Sua rua: ");
			int num = Integer.parseInt(JOptionPane.showInputDialog("Número da casa: "));
			
			Endereco end = new Endereco(bairro, rua, num);
			turma[i] = new Aluno(nome, idade, serie, end);
			}
			
			//P R O F E S S O R E S
			JOptionPane.showMessageDialog(null, "Dados dos Professores", "Sala de Aula", JOptionPane.INFORMATION_MESSAGE);
			
			int qtdPf = Integer.parseInt(JOptionPane.showInputDialog("Quantos Professores deseja informar?"));
			Professor profs[] = new Professor[qtdPf];
			
			for(int i=0; i<profs.length; i++) {
			
			String nome = JOptionPane.showInputDialog("Digite o nome do " +(i+1)+ "º Professor");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do professor " +nome));
			String materia = JOptionPane.showInputDialog("Qual sua matéria: ");
			
			String bairro = JOptionPane.showInputDialog("Qual o bairro em que mora:");
			String rua = JOptionPane.showInputDialog("Sua rua: ");
			int num = Integer.parseInt(JOptionPane.showInputDialog("Número da casa: "));
			
			Endereco end = new Endereco(bairro, rua, num);
			profs[i] = new Professor(nome, idade, materia, end);
			}
			
			//ALTERAÇÃO DE DADOS
			JOptionPane.showMessageDialog(null, "Confirmação de dados dos Alunos", "Sala de Aula", JOptionPane.INFORMATION_MESSAGE);
			for(int i=0; i<turma.length;) {
				Object[] option = {"Ok", "Alterar Dados"}; 
				int r = JOptionPane.showOptionDialog(null, turma[i].toString(), "Aluno " +(i+1),  JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[1]);
				
				if (r == 1) {
					String nome = JOptionPane.showInputDialog("Nome do Aluno");
					int idade = Integer.parseInt(JOptionPane.showInputDialog("Sua idade: "));
					int serie = Integer.parseInt(JOptionPane.showInputDialog("Sua série: "));
					
					String bairro = JOptionPane.showInputDialog("Bairro de sua residência: ");
					String rua = JOptionPane.showInputDialog("Sua rua: ");
					int num = Integer.parseInt(JOptionPane.showInputDialog("Número da casa: "));
					
					Endereco end = new Endereco(bairro, rua, num);
					turma[i] = new Aluno(nome, idade, serie, end);
				} else {
					i++;
				}
			}
			
			JOptionPane.showMessageDialog(null, "Confirmação de dados dos Professores", "Sala de Aula", JOptionPane.INFORMATION_MESSAGE);
			for(int i=0; i<profs.length;) {
				Object[] option = {"Ok", "Alterar Dados"}; 
				int r = JOptionPane.showOptionDialog(null, profs[i].toString(), "Professor " +(i+1),  JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[1]);
				
				if (r == 1) {
					String nome = JOptionPane.showInputDialog("Nome do Professor");
					int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do professor "));
					String materia = JOptionPane.showInputDialog("Qual sua matéria: ");
					
					String bairro = JOptionPane.showInputDialog("Bairro de sua residência: ");
					String rua = JOptionPane.showInputDialog("Sua rua: ");
					int num = Integer.parseInt(JOptionPane.showInputDialog("Número da casa: "));
					
					Endereco end = new Endereco(bairro, rua, num);
					profs[i] = new Professor(nome, idade, materia, end);
				} else {
					i++;
				}
			}
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Inválido!!! \nInforme um número.", "Erro", JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro Desconhecido!!!", "Erro", JOptionPane.ERROR_MESSAGE);
		}
		finally{
			JOptionPane.showMessageDialog(null, "Finalizado!!");
		}
	}
}