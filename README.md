# Criando um Banco Digital com Java e Orientação a Objetos

## Digital Innovation One
### Bootcamps "Amdocs JAVA Developer" e "Cognizant Java Developer"

Projeto desenvolvido com instruções de [Venilton FalvoJr](https://github.com/falvojr) na trilha de estudo dos Bootcamps "Amdocs JAVA Developer" e "Cognizant Java Developer" da [dio.me](https://dio.me/).

<p align="center">
	<img alt="Repository language count" src="https://img.shields.io/github/languages/count/didifive/lab-banco-digital-oo">
<a href="https://www.linkedin.com/in/falvojr/">
		<img alt="Made by Didi" src="https://img.shields.io/badge/made%20by-FalvoJr-blue">
	</a>	
<a href="https://www.linkedin.com/in/luis-carlos-zancanela/">
		<img alt="Update by Didi" src="https://img.shields.io/badge/update%20by-Didi-green">
	</a>
	<a href="https://github.com/didifive/lab-banco-digital-oo/commits/master">
		<img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/didifive/lab-banco-digital-oo?color=blue">
	</a>
	<img alt="License" src="https://img.shields.io/badge/license-MIT-brightgreen?color=blue">
</p>

<p align="center">
	<a href="https://dev.java/">
	  <img alt="Java" src="https://img.shields.io/static/v1?color=red&label=Dev&message=Java&style=for-the-badge&logo=Java">
	</a>
</p>

Link da base utilizada neste projeto: [falvojr/lab-banco-digital-oo](https://github.com/falvojr/lab-banco-digital-oo)

Abaixo seguem modificações feitas em relação ao projeto base:
* Foi criada a classe `Agencia` visto que um banco pode ter mais de uma agência;
* Foi criado método para permitir trocar o vínculo da agência das contas;
* A classe `Cliente` original foi modificada para abstrata para ser extendida em `ClientePessoaFisica` e `ClientePessoaJuridica`;
* Mudanças na classe `Main` para adaptar as mudanças realizadas.

Versões utilizadas no desenvolvimento:
* Java 17;
* IntelliJ IDEA Community Edition 2021.2.