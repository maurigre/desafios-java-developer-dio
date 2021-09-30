<h1>1 - Contagem repetida de números</h1>

<h2>Desafio</h2>
<p>Neste desafio sua tarefa será ler vários números e em seguida dizer quantas vezes cada número aparece, ou seja, deve-se escrever cada um dos valores distintos que aparecem na entrada por ordem crescente de valor.</p>

<h2>Entrada</h2>
<p>A primeira linha de entrada contem um único inteiro <strong>N</strong>, que indica a quantidade de valores que serão lidos para X (1 ≤ <strong>N</strong> ≤ 2000) logo em seguida. Com certeza cada número não aparecerá mais do que 20 vezes na entrada de dados.</p>

<h2>Saída</h2>
<p>Imprima a saída de acordo com o exemplo fornecido abaixo, indicando quantas vezes cada um deles aparece na entrada por ordem crescente de valor.</p>

<table>
	<thead>
		<tr>
			<td>Exemplo de Entrada</td>
			<td>Exemplo de Saída</td>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>
			<p>7<br>
			8<br>
			10<br>
			8<br>
			260<br>
			4<br>
			10<br>
			10</p>
			</td>
			<td>
			<p>4 aparece 1 vez(es)<br>
			8 aparece 2 vez(es)<br>
			10 aparece 3 vez(es)<br>
			260 aparece 1 vez(es)</p>
			</td>
		</tr>
	</tbody>
</table>
<hr>

<h1>2 - Vogais Extraterrestres</h1>

<h2>Desafio</h2>
<p>Desde o Gerador de Improbabilidade Infinita, muitos nem questionam sobre vidas extraterrestres, e se aprofundam em questionamentos mais improváveis, como, por exemplo, será que seres de outros planetas usam os mesmos caracteres que nós para se comunicarem? E se isso for verdade, será que usam as mesmas letras vogais que a gente? Pensando nisso, vários cientistas criaram inúmeros tipos de alfabetos alienígenas, usando as letras do nosso alfabeto, além dos dígitos, de 0 a 9, com as suas respectivas vogais. Baseados nisto, eles querem a sua ajuda para identificar vogais em alfabetos alienígenas e realizar a contagem.</p>
<p>Escreva um programa que, dado uma sequência de vogais, em um determinado alfabeto alienígena, contabilize, em um texto escrito com o mesmo alfabeto, quantas vogais o mesmo possui.</p>
<h2>Entrada</h2>
<p>Haverá diversos casos de teste. Cada caso de teste é formado por duas linhas. A primeira linha informa uma palavra, formada por todas as vogais alienígenas de um determinado planeta. A segunda linha contém uma frase formada por letras do mesmo alfabeto. A entrada termina com fim de arquivo.</p>
<h2>Saída</h2>
<p>Para cada caso de teste, imprima a quantidade de vogais alienígenas correspondente.</p>
<table>
	<thead>
		<tr>
			<td>Exemplo de Entrada</td>
			<td>Exemplo de Saída</td>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>
			<p>aeiou<br>
			o rato roeu a roupa do rei de roma</p>
			<p>4310<br>
			t3st3 p4r4 c0d1f1c4r</p>
			<p>kwy<br>
			the quick brown fox jumps over the lazy dog</p>
			</td>
			<td>
			<p>16</p>
			<p>8</p>
			<p>3</p>
			</td>
		</tr>
	</tbody>
</table>

<hr>

<h1>3 - Melhor amigo do Pablo</h1>
<h2>Desafio</h2>
<p>Todo final de ano ocorre uma festa na escola. As inscrições para participar da festa são abertas no início de julho. No momento da inscrição, o aluno pode escolher se quer ser "O Amigo do Pablo" na festa ou não. O mais lógico seria escolher a opção Sim, afinal, é um privilégio ser O Amigo do Pablo, já que ele é a pessoa mais descolada da escola. Porém, há indivíduos que definitivamente não pretendem ser O Amigo do Pablo, e por motivos desconhecidos.</p>
<p>Somente um será o escolhido. Em vista disso, muitos alunos que escolheram a opção Sim realizaram a inscrição diversas vezes para aumentar a própria probabilidade de ser O Amigo do Pablo. A diretora da escola&nbsp;pediu que&nbsp;você desenvolva um programa que organize&nbsp;as inscrições do site, pois está havendo um spam de inscrições. O critério para ser o escolhido é a quantidade de letras do primeiro nome, e em caso de empate, vence aquele que realizou primeiro a inscrição. A organização final dos inscritos deverá seguir a ordem de escolha (Sim ou Não), mas respeitando a ordem alfabética.</p>
<p>OBS.: Ninguém que escolheu a opção Não realizou a inscrição mais de uma vez.</p>

<h2>Entrada</h2>
<p>A entrada contém somente um caso de teste. Cada linha é composta pelo primeiro nome do participante (sem espaços), seguido da opção SIM (caso o usuário queira ser O Amigo do Pablo) ou NAO (caso não queira). A entrada termina assim que o usuário digita "FIM" (sem as aspas).</p>

<h2>Saída</h2>
<p>Seu programa deverá imprimir os inscritos pela ordem de escolha e por ordem alfabética, seguido do nome do vencedor. Imprima uma linha em branco entre a lista de inscritos e o nome do vencedor.</p>
<table>
	<thead>
		<tr>
			<td>Exemplo de Entrada</td>
			<td>Exemplo de Saída</td>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>
			<p>Joao NAO<br>
                Carlos SIM<br>
                Abner NAO<br>
                Samuel SIM<br>
                Ricardo NAO<br>
                Abhay SIM<br>
                Samuel SIM<br>
                Andres SIM<br>
                Roberto NAO<br>
                Carlos SIM<br>
                Samuel SIM<br>
                Samuel SIM<br>
                Abhay SIM<br>
                Aline SIM<br>
                Andres SIM<br>
                FIM</p>
			</td>
			<td>
			<p>Abhay<br>
                Aline<br>
                Andres<br>
                Carlos<br>
                Samuel<br>
                Abner<br>
                Joao<br>
                Ricardo<br>
                Roberto<br>
    			&nbsp;<br>
                Amigo do Pablo:<br>
                Carlos</p>
			</td>
		</tr>
	</tbody>
</table>
