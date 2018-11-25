
import java.util.Scanner;

public class Agenda {
   
   
	public static void main(String[]args) {
		
		String nome[]=new String[15];
		String curso[]=new String[15];
		String email[]=new String[15];
		String idade[]=new String[15];
		String celular[]=new String[15];
		String nascimento[]=new String[15];
		String pesquisa;
		String varpesqu;
		
		int contador, codigo = 0;
		
		Scanner leitura = new Scanner (System.in);
		
		nome[0]="Matheus Sales";
		nome[1]="Ezio Pacheco";
		nome[2]="Leila Sales";
		nome[3]="Sheila Sales";
		nome[4]="Emily Bittner";
		nome[5]="Waltinho";
		nome[6]="Samara(Waltinho)";
		nome[7]="Pedro";
		nome[8]="Mudinho";
		nome[9]="Brother";
		nome[10]="Sheylang";
		nome[11]="Carlos";
		nome[12]="Jeferson";
		nome[13]="Taís(Jeferson)";
		nome[14]="Pedro Augusto";
		curso[0]="Medicina Veterinaria";
		curso[1]="Fabricação Mecanica";
		curso[2]="Pedagogia";
		curso[3]="Enfermagem";
		curso[4]="Letras";
		curso[5]="Arquitetura";
		curso[6]="Biomedicina";
		curso[7]="Biqueira";
		curso[8]="Biqueira";
		curso[9]="Ed. Física";
		curso[10]="Enfermagem";
		curso[11]="Medicina";
		curso[12]="Biologia";
		curso[13]="Medicina Veterinaria";
		curso[14]="Economia";
		email[0]="matheus@gmail.com";
		email[1]="nene12@hotmai.com";
		email[2]="leilaorusso@gmail.com";
		email[3]="davidluiz@globo.com";
		email[4]="meumozao@hotmai.com";
		email[5]="enfimcasado0112@gmail.com";
		email[6]="samarinhabezerra@globo.com";
		email[7]="naofalo@gmail.com";
		email[8]="mudinho@hotmai.com";
		email[9]="falazika@gmail.com";
		email[10]="bafinho@globo.com";
		email[11]="maozinha@hotmai.com";
		email[12]="vireipai@globo.com";
		email[13]="vireimae@hotmai.com";
		email[14]="pedrinho@globo.com";
		idade[0]="17";
		idade[1]="38";
		idade[2]="44";
		idade[3]="16";
		idade[4]="19";
		idade[5]="31";
		idade[6]="34";
		idade[7]="18";
		idade[8]="20";
		idade[9]="34";
		idade[10]="53";
		idade[11]="46";
		idade[12]="19";
		idade[13]="29";
		idade[14]="24";
		celular[0]="(11)95077-0065";
		celular[1]="(11)94653-5437";
		celular[2]="(11)92323-5050";
		celular[3]="(11)96383-2520";
		celular[4]="(11)92785-3494";
		celular[5]="(11)93486-3206";
		celular[6]="(11)93487-3492";
		celular[7]="(11)99684-6459";
		celular[8]="(11)94544-3509";
		celular[9]="(11)94873-9043";
		celular[10]="(11)93439-4734";
		celular[11]="(11)93493-4655";
		celular[12]="(11)94002-8922";
		celular[13]="(11)93493-7394";
		celular[14]="(11)93498-3404";
		nascimento[0]="07/12/2000";
		nascimento[1]="23/07/1980";
		nascimento[2]="09/07/1973";
		nascimento[3]="23/06/2002";
		nascimento[4]="06/04/1999";
		nascimento[5]="21/04/1986";
		nascimento[6]="29/07/1990";
		nascimento[7]="11/07/1999";
		nascimento[8]="13/02/1940";
		nascimento[9]="12/01/1998";
		nascimento[10]="25/12/2000";
		nascimento[11]="31/12/1990";
		nascimento[12]="17/12/2000";
		nascimento[13]="12/12/2012";
		nascimento[14]="19/11/1994";
		
		System.out.println("--------------EMAIL--------------");
		System.out.println("");
		System.out.println("matheus@gmail.com");
		System.out.println("nene12@hotmai.com");
		System.out.println("leilaorusso@gmail.com");
		System.out.println("davidluiz@globo.com");
		System.out.println("meumozao@hotmai.com");
		System.out.println("enfimcasado0112@gmail.com");
		System.out.println("samarinhabezerra@globo.com");
		System.out.println("naofalo@gmail.com");
		System.out.println("mudinho@hotmai.com");
		System.out.println("falazika@gmail.com");
		System.out.println("bafinho@globo.com");
		System.out.println("maozinha@hotmai.com");
		System.out.println("vireipai@globo.com");
		System.out.println("vireimae@hotmai.com");
		System.out.println("pedrinho@globo.com");
		System.out.println("");
		System.out.println("---------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("-------------CELULAR-------------");
		System.out.println("(11)95077-0065");
		System.out.println("(11)94653-5437");
		System.out.println("(11)92323-5050");
		System.out.println("(11)96383-2520");
		System.out.println("(11)92785-3494");
		System.out.println("(11)93486-3206");
		System.out.println("(11)93487-3492");
		System.out.println("(11)99684-6459");
		System.out.println("(11)94544-3509");
		System.out.println("(11)94873-9043");
		System.out.println("(11)93439-4734");
		System.out.println("(11)93493-4655");
		System.out.println("(11)94002-8922");
		System.out.println("(11)93493-7394");
		System.out.println("(11)93498-3404");
		System.out.println("---------------------------------");
		System.out.println("");
		System.out.println("");
		
		for (contador=0; contador<=2; contador++) {
     		
	     	System.out.println("Digite (1)para pesquisar por email");
	     	System.out.println("Digite (2) para pesquisar por celular");
	     	System.out.println("Qual sua escolha? :");
	     	codigo=leitura.nextInt();
	     	
	     	if(codigo==1) {
	     		System.out.println("Digite o email:");
	     		pesquisa=leitura.next();
	     		
	     		
	     		if(pesquisa.equals(email[contador])) {
	        		 
	         		System.out.println("");
	         		System.out.println("--------------CONTATO--------------");
	         		System.out.println("");
	         		System.out.println("Nome:" + " " + nome[contador]);
	         		System.out.println("Curso:" + " " + curso[contador]);
	         		System.out.println("Email:" + " " + email[contador]);
	         		System.out.println("Idade:" + " "+ idade[contador]);
	         		System.out.println("Celular:" + " " + celular[contador]);
	         		System.out.println("Nascimento:" + " " + nascimento[contador]);
	         		System.out.println("");
	         		System.out.println("-----------------------------------");
	         		 
	         	 }//fim equals
	     	
	     	}//fim codigo1
	     	
	     	if(codigo==2) {
	     		System.out.println("Digite o celular:");
	     		pesquisa=leitura.next();
	     	
	 
	     	if(pesquisa.equals(celular[contador])) {
	     		 
	     		System.out.println("");
	     		System.out.println("--------------CONTATO--------------");
	     		System.out.println("");
	     		System.out.println("Nome:" + " " + nome [contador]);
	     		System.out.println("Curso:" + " " + curso[contador]);
	     		System.out.println("Email:" + " " + email[contador]);
	     		System.out.println("Idade:" + " " + idade[contador]);
         		System.out.println("Celular:" + " " + celular[contador]);
         		System.out.println("Nascimento:" + " " + nascimento[contador]);
         		System.out.println("");
         		System.out.println("-----------------------------------");
         		 
         		
	     		}//fim equals
	     	
	     	
	     	}//fim codigo 2
	     	System.out.println("Deseja continuar? (S/N)");
	     	varpesqu=leitura.next();
	     	if(varpesqu.equals("S") ||varpesqu.equals("s") ){
	     		
	     	}//fim do if(resposta sim)
	     	
	     	else if(varpesqu.equals("N") ||varpesqu.equals("n") ) {
	     		System.out.println("Obrigado por escolher a Matheusoft Corporation!");
	     		break;
	     	}//fim do else(resposta nao)
	     	
	     	
		 
	     	
		}//fim do FOR
		
		
		
	
	}//Fim do metodo

}//fim da classe
