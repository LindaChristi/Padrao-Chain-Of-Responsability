# Chain of Responsibility

Trabalho desenvolvido para a disciplina **Arquitetura e Projeto de Software**, com o objetivo de implementar e testar o padrão de projeto comportamental **Chain of Responsibility** em Java.

## Tecnologias

- Java 21
- Maven
- JUnit 5

## Sobre o projeto

O sistema simula o atendimento de chamados de TI, encaminhando cada solicitação para o responsável adequado, conforme o tipo de problema.

## Estrutura e arquivos

### Classes principais

- `Chamado.java`: representa um chamado e armazena seu tipo.
- `TipoChamado.java`: interface que define os tipos de chamados.
- `ResponsavelChamado.java`: classe abstrata que implementa a lógica de encaminhamento dos chamados pela cadeia de responsabilidades.

### Responsáveis

- `ResponsavelAtendente.java`: trata chamados de acesso.
- `ResponsavelTecnico.java`: trata chamados de software.
- `ResponsavelCoordenador.java`: trata chamados de rede.
- `ResponsavelGerente.java`: trata chamados de servidor.

### Tipos de chamado

- `TipoChamadoAcesso.java`: representa chamados de acesso.
- `TipoChamadoSoftware.java`: representa chamados de software.
- `TipoChamadoRede.java`: representa chamados de rede.
- `TipoChamadoServidor.java`: representa chamados de servidor.
- `TipoChamadoImpressora.java`: representa chamados de impressora, sem responsável definido na cadeia atual.

### Testes

- `ChamadoTest.java`: contém testes automatizados para verificar o encaminhamento dos chamados e o comportamento quando não há um responsável adequado.

### Outros arquivos

- `pom.xml`: configura o projeto Maven, a versão do Java e as dependências.
- `.gitignore`: define arquivos e pastas que não devem ser versionados pelo Git.
- `images/diagrama.png`: contém o diagrama do projeto.


## Autora

**Linda Christi Freitas**