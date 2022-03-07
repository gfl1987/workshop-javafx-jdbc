# javafx-jdbc

Criação de um projeto JavaFX com JDBC.

1º passo
Criar projeto local - WorkShop-javafx-jdbc 
-- User libraries: JavaFX, MySQLConnector 

2º passo
Configurar execução:
-- Run configurarions -> VM arguments: 
--module-path E:\Desenvolvimento\java-libs\javafx-sdk\lib --add-modules=javafx.fxml,javafx.controls

### O que usamos?

- Eclipse
- SceneBuilder
- JDBC
- JavaFX
- MySQL

#### Como iniciamos o App?

1º opção 
Comando para rodar App no CMD: Instalado na pasta C:\MyApp
java --module-path %PATH_TO_FX% --add-modules javafx.controls,javafx.fxml -cp workshop-javafx-jdbc.jar application.Main

2º opção 
Criamos um BAT para iniciar o App sem precisar digitar o comando:
- Vá em Painel de Controle - Opções do Explorador de arquivos;
- Clique na aba Modo de Exibição;
- Desmarque a caixa: Ocultar as extensões dos tipos de arquivos conhecidos. 

Após vá a pasta do App e criar o arquivo .bat - Meu Exemplo: myapp.bat

3º opção
Criamos um atalho para área de trabalho:
- Botão direito - Criar atalho
- Aponte para seu BAT criado

Caso não queira visualizar a imagem do BAT em seu atalho, vá nas Propriedades do atalho e mude o caminho do Destino para o comando JAVA.
