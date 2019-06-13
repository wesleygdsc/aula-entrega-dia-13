package view;

import javax.swing.JOptionPane;

import model.Professor;

public class execucao {
	
	public static void main (String[]args) {
	
		Professor professor = new Professor();
		
		professor.setNome(JOptionPane.showInputDialog(null,"Nome:"));
		professor.setEndereco(JOptionPane.showInputDialog(null,"Endereço:"));
		professor.setBairro(JOptionPane.showInputDialog(null,"Bairro:"));
		professor.setCep(Integer.parseInt(JOptionPane.showInputDialog(null,"Cep:")));
		professor.setCidade(JOptionPane.showInputDialog(null,"Cidade:"));
		professor.setEstado(JOptionPane.showInputDialog(null,"Estado:"));
		professor.setRg(Long.parseLong(JOptionPane.showInputDialog(null,"Rg:")));
		professor.setCpf(Long.parseLong(JOptionPane.showInputDialog(null,"Cpf")));
		
		System.out.println(professor.getNome());
		System.out.println(professor.getEndereco());
		System.out.println(professor.getBairro());
		System.out.println(professor.getCep());
		System.out.println(professor.getCidade());
		System.out.println(professor.getEstado());
		System.out.println(professor.getRg());
		System.out.println(professor.getCpf());
		
		try {
			int dis = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantas disciplinas vocêpossui ?"));
			String disciplinas[] = new String [100];
			for (int i = 0; i < dis; i++) {
				disciplinas[i] = JOptionPane.showInputDialog(null,"Digite a disciplina" + i);
			}
			professor.setDisciplinas(disciplinas);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try { 
			int cur = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos cursos você possui?"));
			String cursos[] = new String [100];
			for (int i = 0; i < cur; i++) {
				cursos[i] = JOptionPane.showInputDialog(null, "Digite o curso" + i);
			}
			professor.setCursos(cursos);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public double aumentoSalarial(double horaAula, double aumento) {
		double total = horaAula + (horaAula + (horaAula * (aumento / 100))+ (horaAula * 30/100));
		return total;
	}
}
