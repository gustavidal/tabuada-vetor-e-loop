package br.senai.sp.jandira.tabuada.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaTabuada extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        //Definir tamanho da tela
        stage.setWidth(500);
        stage.setHeight(500);
        stage.setTitle("Tabuada");

        //Criar o root - que é o componente de leiaute principal
        VBox root = new VBox();
        root.setStyle("-fx-background-color: #8ff7ff;");

        //Criamos a cena e colocamos dentro o root dentro dela
        Scene scene = new Scene(root);

        //Criação do header da tela
        VBox header = new VBox();
        header.setPrefHeight(100);
        header.setStyle("-fx-background-color: #8fa5ff;");

        //colocar o conteúdo do header
        Label lbltitulo = new Label("Tabuada");
        lbltitulo.setStyle("-fx-text-fill: white;-fx-font-size: 20px;-fx-font-weight: bold;");

        Label lblSubtitulo = new Label("Crie um tipo de tabuada.");

        //Colocar os labels dentro do header
        header.getChildren().addAll(lbltitulo,lblSubtitulo);

        //criar grid de formulario
        GridPane gridFormulario = new GridPane();
        gridFormulario.setPrefHeight(100);
        gridFormulario.setStyle("-fx-background-color: #2fff00;");

        //Colocando o conteúdo do gridFormulario
        Label lblMultiplicando = new Label("Multiplicando:");
        TextField tfMultiplicando = new TextField();
        Label lblMenorMultiplicador = new Label("Menor Multiplicador:");
        TextField tfMenorMultiplicador = new TextField();
        Label lblMaiorMultiplicador = new Label("Maior Multiplicador:");
        TextField tfMaiorMultiplicador = new TextField();

        //Colocar os componentes no grid
        gridFormulario.add(lblMultiplicando,0,0);
        gridFormulario.add(tfMultiplicando,1,0);
        gridFormulario.add(lblMenorMultiplicador,0,1);
        gridFormulario.add(tfMenorMultiplicador,1,1);
        gridFormulario.add(lblMaiorMultiplicador,0,2);
        gridFormulario.add(tfMaiorMultiplicador,1,2);

        //criar a caixa dos botões
        HBox boxBotoes = new HBox();
        boxBotoes.setPrefHeight(100);
        boxBotoes.setStyle("-fx-background-color: #ff1f1f;");

        //Colocando o conteúdo do boxBotoes
        Button btCalcular = new Button("Calcular");
        Button btLimpar = new Button("Limpar");
        Button btSair = new Button("Sair");

        //Colar os componentes no botão
        boxBotoes.getChildren().add(btCalcular);
        boxBotoes.getChildren().add(btLimpar);
        boxBotoes.getChildren().add(btSair);

        //Criar a caixa de resultado
        VBox boxResultados = new VBox();
        boxResultados.setPrefHeight(100);
        boxResultados.setStyle("-fx-background-color: #fff200;");

        //colocando o conteúdo do boxResultado
        Label lblResultados = new Label("Resultados:");
        ListView listaTabuada = new ListView();
        String[] exemplo = new String[2];
        exemplo[0] = "para ver";
        exemplo[1] = "se deu certo";
        listaTabuada.getItems().addAll(exemplo);

        //Colocar os componentes do boxResultados
        boxResultados.getChildren().add(lblResultados);
        boxResultados.getChildren().add(listaTabuada);

        //Adicionar componentes ao root
        root.getChildren().add(header);
        root.getChildren().add(gridFormulario);
        root.getChildren().add(boxBotoes);
        root.getChildren().add(boxResultados);

        //Colocamos a cena no palco
        stage.setScene(scene);

        stage.show();
    }
}
