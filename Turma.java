public class Turma{
      private String nome;
      private String curso;
      private int quantidadeDeAlunos;
      private int serie;
      
      public Turma(String n, String c, int q, int s){
         nome = n;
         curso = c;
         quantidadeDeAlunos = q;
         serie = s;
      }
      
      public String getNome(){
         return nome;
      }
      public String getCurso()   {
         return curso;
      }
      public int getQuantidadeDeAlunos(){
         return quantidadeDeAlunos;
      }
      public int getSerie(){
         return serie;
      }
      
      public void setNome(String n){
         nome = n;
      }
      public void setCurso(String c){
         curso = c;
      }
      public void setQuantidadeDeAlunos(int q){
         quantidadeDeAlunos = q;
      }
      public void getSerie(int s){
         serie = s;
      }
}

