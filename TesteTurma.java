import javax.swing.JOptionPane;


public class TesteTurma{
   public static void main(String [] args){
      String nome = JOptionPane.showInputDialog("Digite o nome:");
      String curso = JOptionPane.showInputDialog("Digite o curso:"); 
      int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos:"));
      int serie = Integer.parseInt(JOptionPane.showInputDialog("Digite a serie"));
      
      Turma turma = new Turma(nome, curso, quantidadeDeAlunos, serie);
      
      String msg = "Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso() + "\nQuantidade: " + turma.getQuantidadeDeAlunos() + "\nSerie: " + turma.getSerie();
      
      JOptionPane.showMessageDialog(null, msg);
      
      quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova quantidade de alunos:"));
      
      turma.setQuantidadeDeAlunos(quantidadeDeAlunos);
      
      msg = "Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso() + "\nQuantidade: " + turma.getQuantidadeDeAlunos() + "\nSerie: " + turma.getSerie();
      
      JOptionPane.showMessageDialog(null, msg);
   }
}