import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AulaStringOperacoes {

	public static void main(String[] args) {
	
		//Aula58
		
		String s1 = "Write once";
		System.out.println(s1);  //Write once
		
		//concatenar, une duas ou mais cadeias de texto
		String s2 = s1 + " run anywhere";
		System.out.println(s2);  //Write once run anywhere
		
		//m�todo construtor da String
		String s3 = new String("Java Virtual Machine");
		System.out.println(s3);		//Java Virtual Machine
		
		//outro construtor utilizando um array
		char [] array ={'J','a','v','a'};
		String s4 = new String(array);
		System.out.println(s4);   //Java
		
		/*
		 * Quando carrega em "Ctrl" consegue ter links 
		 * por exemplo em String, ao carregar abre um ficheiro
		 * com a descri��o de tudo acerca do String
		 */
		
		//OPERA��ES
		
		//numero de caracteres e espa�os
		int tamanho = s1.length();
		System.out.println(tamanho);   //10
		
		//ver o caracter correspondente naquele lugar
		//contar a partir do zero, um , dois ...
		char letra = s1.charAt(3);
		System.out.println(letra);    //t
		
		//Retorna a pr�pria Sting
		String texto = s1.toString();
		System.out.println(texto);   //Write once
		
		//LOCALIZA��O
		
		//a posi��o conta se do principio para o fim 
		// contar a partir da posi��o zero
		int posi��o = s3.indexOf("M");
		System.out.println(posi��o);  //13
		
		int frase = s3.indexOf("Virtual");
		System.out.println(frase);  //5
		
		//a primeira e a segunda ocorr�ncia
		int posi��oSeg = s3.indexOf('i');
		System.out.println(posi��oSeg);  //6
		
		posi��oSeg = s3.indexOf('i',posi��oSeg+1);
		System.out.println(posi��oSeg);  //17
		
		//d�-nos a �ltima ocorr�ncia
		int ultimo = s3.lastIndexOf("a");
		System.out.println(ultimo);   //14
		
		int ultimo2 = s3.lastIndexOf("Machine");
		System.out.println(ultimo2);    //13
		
		int ultimo3 = s3.indexOf("aten��o");
		System.out.println(ultimo3);  //sem o elemento retorna -1
		
		
		//verifricar se a String � vazia ou n�o
		boolean vazia = s1.isEmpty();
		System.out.println(vazia);   //false
		
		//COMPARA��O
		
		String bull = "Bulladvisor";
		
		//equals compara valores de duas Strings
		boolean x = bull.equals("bulladvisor");
		System.out.println(x);  //false
		
		//podiamos ignorar maiusculas e minusculas
		boolean y = bull.equalsIgnoreCase("bulladvisor");
		System.out.println(y);  //true
		
		System.out.println(bull=="Bulladvisor");  //true
		
		//Se come�a com o caracter ou caracteres
		boolean z = bull.startsWith("Bu");
		System.out.println(z);  //true
		
		//Se termina com caracter ou caracteres
		boolean n = bull.endsWith("iso");
		System.out.println(n);  //false
		
		//comparar as strings, ordenar textos � o que serve
		int o = "amor".compareTo("bolacha");
		System.out.println(o);  //-1
		
		int p = "bolacha".compareTo("amor");
		System.out.println(p);  //1
		
		int k = "b".compareTo("amor");
		System.out.println(k);  //1
		
		int q = "mora".compareTo("mora");
		System.out.println(q);  //0
		
		int r = "11".compareTo("222");
		System.out.println(r);  //-1
		
		int l = "24".compareTo("12");
		System.out.println(l);  //1
		
		int t = "4".compareTo("12");
		System.out.println(t);  //3
		
		int u = "1234".compareTo("4");
		System.out.println(u);  //-3
		
		//Verificar uma String dentro de outra numa determinada posi��o
		String so ="Olhe, olhe!";
		boolean v = so.regionMatches(6, "Olhe", 0, 4);
		boolean vo = so.regionMatches(6, "olhe", 0, 4);
		//ignorando o case sensitive
		boolean vos = so.regionMatches(true, 6, "olhe", 0, 4);
		System.out.println(v);  //false
		System.out.println(vo);  //true
		System.out.println(vos);  //true
		
		//EXTRAC��O
		
		//extrair dados dentro da string
		String e = "Portugal foi campe�o da Europa";
		String el = e.substring(13);
		System.out.println(el);  //campe�o da Europa
		
		String elc =e.substring(13, 20);
		System.out.println(elc); //campe�o
		
		//Concatenar
		el = e.concat(" de 2016");
		System.out.println(el);  //Portugal foi campe�o da Europa de 2016
		
		e += " de Sempre";	
		System.out.println(e); //Portugal foi campe�o da Europa de Sempre
		
		//trocar caracteres
		el = e.replace('o', 'w');
		System.out.println(el);  //Pwrtugal fwi campe�w da Eurwpa de Sempre
		
		el = e.replaceAll(" ", "X");
		System.out.println(el); //PortugalXfoiXcampe�oXdaXEuropaXdeXSempre
        
		//trocar a primeira occor�ncia
		el=e.replaceFirst("e", "K");
		System.out.println(el);  //Portugal foi campK�o da Europa de Sempre
		
		//tudo em letras maiusculas e minusculas
		el = e.toLowerCase();
		System.out.println(el);  //portugal foi campe�o da europa de sempre
		
		el = e.toUpperCase();
		System.out.println(el); //PORTUGAL FOI CAMPE�O DA EUROPA DE SEMPRE
		
		//limpar caracteres em branco antes e depois da string
		System.out.println("     sem   pre     ");  //     sem   pre     
		System.out.println("     sem   pre     ".trim());  //sem   pre
		
		//TOKENIZA��O      Aula 59
		
       /*
        * tokens s�o peda�os de dados
        * Delimitadores, s�o as express�es que separam os dados
        * por exemplo "HTML; CSS; JQUERY; JAVA"
        * os tokens HTML  CSS  JQUERY  JAVA e o delimitador ;
        */
		
		String tq = "HTML; CSS; JQUERY; JAVA";
		//faz a separa��o em array
		String [] tokens = tq.split(";");
		System.out.println(tokens.length + " tokens");  //4 tokens
		
		for (String separa : tokens){
			
			System.out.println(separa);  //HTML
			                               // CSS
			                               // JQUERY
			                               // JAVA

		}
		//Aqui o delimitador passou a ser o espa�o
		String tq2 = "HTML CSS JQUERY JAVA";
		//faz a separa��o em array
		String [] tokens2 = tq2.split(" ");
		System.out.println(tokens.length + " tokens");  //4 tokens
		
		for (String separa1 : tokens2){
			
			System.out.println(separa1);  //HTML
			                              // CSS
			                              // JQUERY
			                              // JAVA

		}
		
		//STRINGBUFFER E STRINGBUILDER     Aula60
		
		//tamb�m representam textos
		
		//t�m os mesmos conjuntos de m�todos
		//a �nica diferen�a � que os m�todos StrinBuffer s�o sincronizados
		
		String ka = "Oi" + " como " + "vai ?";
		System.out.println(ka);   //Oi como vai ?
		//poderia colocar o mesmo resultado
		String kab = new StringBuilder ("Oi")
				.append(" como ").append("vai ?").toString();	
		System.out.println(kab);  //Oi como vai ?
		//o m�todo append � para concatenar novos elementos
		//.tostring(); para retornar o valor String desse objecto
		
		/*Por que a String cria novos objetos em uma concatena��o?
		Por que a String � imut�vel, logo seu prop�sito n�o � ficar expandindo
		 a cada concatena��o, para isso existe o StringBuilder ou StringBuffer
		*/
		
		StringBuffer kb = new StringBuffer("Grande estudo !");	
		System.out.println(kb.length()); //15
		
		System.out.println(kb.capacity());  //31
		//Capacidade para 31 caracteres, m�todo n�o existe no objecto String
		
		System.out.println(kb.reverse()); //! odutse ednarG
		//Inverte a ordem dos caracteres
		
		kb.append(" Boa !");
		char[] f ={'s','o','r','t','e'};
		kb.append(f).append(" nossa.");
		System.out.println(kb);  //! odutse ednarG Boa !sorte nossa.
		
		String url = new StringBuilder("www.bulladvisor.com").delete(0, 4).toString();
		System.out.println(url);
		//m�todo para remover neste caso www.
		
		//REGULAR EXPRESSION regex EXPRESS�O  Aula61
		
		/*
		 * Que � um padr�o de pesquisa e substitui��o de textos
		 * Regular Expression s�o �teis para validar dados do seu pr�prio programa
		 * e assegurar que esse dados estejam em determinado formato
		 * Vamos construir Regular Expression como utiliz�-las para validar
		 * e formatar textos
		 * 
		 */
		
		String padrao = "Java";
		String texto0 = "Java";
		boolean d = texto0.matches(padrao);
		System.out.println(d); //true
		//o m�todo matches serve para validar express�es regulares
		//podia economizar e colocava s�, sem os Strings
		boolean d1 = "Java".matches("Java");
		System.out.println(d1); //true
		
		boolean d2 = "Java".matches("java");
		System.out.println(d2); //false
		
		//MODIFICADORES (regex)
		/*
		 * (?i), Ignora mai�scula e min�scula
		 * (?x), Coment�rios
		 * (?m), Multilinhas
		 * (?s), Dottal
		 */
		
		boolean d3 = "Java".matches("(?i)java");
		System.out.println(d3); //true
		//podia colocar "(?im)java" ou colocar mais l� dentro
		
		//METACARACTERES
		/*
		 * .  qualquer caracter
		 * \d d�gitos           [0-9]
		 * \D n�o � d�gito      [^0-9]
		 * \s espa�os           [ \t\n\x0B\f\r]
		 * \S n�o � espa�o      [^\s]
		 * \w letra             [a-zA-Z_0-9]
		 * \W n�o � letra 
		 */
		
		boolean d4 = "@".matches(".");
		System.out.println(d4); //true
		
		boolean d5 = "2".matches("\\d");
		System.out.println(d5); //true
		//tenho de colocar dois \\ um n�o d�
		
		boolean d6 = "a".matches("\\d");
		System.out.println(d6); //false
		
		boolean d7 = " ".matches("\\s");
		System.out.println(d7); //true
		
		boolean d8 = "Pi".matches(".");
		System.out.println(d8); //false
		//ele avaliou uma �nica unidade
		
		boolean d9 = "Pi".matches("..");
		System.out.println(d9); //true
		
		boolean d10 = "21".matches("\\d\\d");
		System.out.println(d10); //true
		
		String codigopostal = "\\d\\d\\d\\d-\\d\\d\\d";
		boolean d11 = "1000-264".matches(codigopostal);
		System.out.println(d11);   //true
		
		//qUANTIFICADORES
		/*
		 * X{n}           X, exactamente n vezes
		 * X{n,}          X, pelo menos n vezes
		 * X{n, m}        X, pelo menos n mas n�o mais do que m vezes
		 * X?             X, 0 ou 1 vez
		 * X*             X, 0 ou + vezes
		 * X+             X, 1 ou + vezes
		 */
		
		// occorr�ncia de um caracter n vezes
		
		boolean d12 = "21".matches("\\d{2}");
		System.out.println(d12); //true
		// digito duas vezes
		
		boolean d13 = "123".matches("\\d{2,}");
		System.out.println(d13); //true
		// pelo menos 2 digitos
		
		boolean d14 = "12345".matches("\\d{2,5}");
		System.out.println(d14); //true
		// pelo menos 2 digitos e n�o mais que 5
		
		boolean d15 = "123456".matches("\\d{2,5}");
		System.out.println(d15); //false
		
		boolean d16 = "".matches(".?");
		System.out.println(d16); //true
		
		boolean d17 = "aa".matches(".?");
		System.out.println(d17); //false
		
		boolean d18 = "aa".matches(".*");
		System.out.println(d18); //true
		
		boolean d19 = "".matches(".+");
		System.out.println(d19); //false
		
		//o codigopostal agora
		boolean d20 = "1000-264".matches("\\d{4}-\\d{3}");
		System.out.println(d20); //true
		
		boolean d21 = "04/10/2016".matches("\\d{2}/\\d{2}/\\d{4}");
		System.out.println(d21); //true
		
		//METACARACTER DE FRONTERA
		/*
		 * ^        inicia
		 * $        finaliza
		 * |        ou
		 */
		
		boolean d22 = "Pier21".matches("^Pier.*");
		System.out.println(d22); //true
		
		boolean d23 = "Pier21".matches(".*21$");
		System.out.println(d23); //true
		
		boolean d24 = "tem java aqui dentro".matches(".*java.*");
		System.out.println(d24); //true
		
		boolean d25 = "tem java aqui dentro".matches("^tem.*dentro$");
		System.out.println(d25); //true
		
		boolean d26 = "sim".matches("sim|n�o");
		System.out.println(d26); //true
		//cuidado se coloca espa�o "sim  |  n�o" d� false
		
		//AGRUPADORES
		/*
		 * [...]              Agrupamento
		 * [a-z]              Alcance
		 * [a-e][i-u]         Uni�o
		 * [a-z&&[aeiou]]     Interse��o
		 * [�bc]              Exce��o
		 * [a-z&&[^m-p]]      Subtra��o
		 * \x                 Fuga literal
		 */
		
		boolean d27 = "2".matches("[a-z]");
		System.out.println(d27); //false
		
		boolean d28 = "x".matches("[a-z]");
		System.out.println(d28); //true
		
		boolean d29 = "bolacha".matches("[bB]olacha");
		System.out.println(d29); //true
		//verifica para b e B
		
		boolean d30 = "bolo".matches("[bB]olacha|[bB]olo");
		System.out.println(d30); //true
		//pode ver bolacha ou bolo come�ando por maiuscula tamb�m
		
		boolean d31 = "Jo�o".matches("[A-Z][a-zA-Z].*");
		System.out.println(d31); //true
		//para um nome 
		
		boolean d32 = "Jo�o".matches("[A-Z][A-Z].*");
		System.out.println(d32); //false
		//para um nome 
		
		boolean d33 = "olho".matches("[^abc]lho");
		System.out.println(d33); //true
		//n�o pode come�ar por abc e termina em lho
				
		boolean d34 = "crau".matches("cr[ae]u");
		System.out.println(d34); //true
		//pode escrever crau  ou creu
		
		boolean d35 = "bulladvisor@bulladvisor.com".matches("\\w+@\\w+\\.\\w{2,3}");
		System.out.println(d35); //true
		// a validar o email para validar com o . temos de colocar\\ sen�o confundia 
		//com o . qualquer caracter do METACARACTERES
		
		// NOVIDADE : Classe Pattern tem um m�todo compile de express�o regular
		
		String doce = "Qual � o Doce mais doCe que o doce?";
		//localizar todas as ocorr�ncias do doce
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
		//se usar valida��es v�rias vezes deve utilizar esta class Pattern
		while(matcher.find()){
			System.out.println(matcher.group());  // Doce doCe doce
			// atrav�s do m�todo group
		}
		
		
		//SUBSTITUI��ES
		
		String sub = doce.replaceAll("(?i)doce","DOCINHO");
		System.out.println(sub);  //Qual � o DOCINHO mais DOCINHO que o DOCINHO?
		
		String rato = " O rato roeu a roupa do rei de roma";
		String sub2 = rato.replaceAll("r[aeiou]","KK");
		System.out.println(sub2);  // O KKto KKeu a KKupa do KKi de KKma
		
		//substituir os espa�os por tabula��o
		String sub3 = "Tabular este texto".replaceAll("\\s", "\t");
		System.out.println(sub3);  //Tabular	este	texto
		
		String url1 = "www.bulladvisor.com/clientes-2011.html";
		// o que se deseja � trnsformar http://www.bulladvisor.com/2016/clientes.jsp
		String identificar = "www.bulladvisor.com/\\w{2,}-\\d{4}.html";
		boolean r1 = url1.matches(identificar);
		System.out.println(r1);  //true
		
		/*
		 * String identificar = "www.bulladvisor.com/\\w{2,}-\\d{4}.html";
		 * ao colocar () dentro da String vou criar uma vari�vel
		 * String identificar = "(www.bulladvisor.com/)\\w{2,}-\\d{4}.html";
		 * para chamar essa vari�vel $1 no exemplo a seguir tem mais vari�veis
		 */
		
		String identificar2 = "(www.bulladvisor.com)(\\w{2,})-(\\d{4}).html";
		String subfinal = url1.replaceAll(identificar2,"http://$1/$3/$2.jsp");
		System.out.println(subfinal);  //http://www.bulladvisor.com/2011/clientes.jsp
		
		
	}

}
