package br.senai.sp.jandira.tabuada.ui;

import javafx.application.Application;
import javafx.geometry.Insets;
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
        //Tamanho da tela
        stage.setWidth(500);
        stage.setHeight(500);
        stage.setTitle("Tabuada");

        //Criar o root - componente de layout principal
        VBox root = new VBox();
        root.setStyle("-fx-background-color: #1f0b0c;");

        //Criação da cena e "linkamento" no root
        Scene scene = new Scene(root);

        //Criação do header da tela
        VBox header = new VBox();
        header.setStyle("-fx-background-color: #1f0b0c;");

        //Conteúdo do header
        Label lblTitulo = new Label("Tabuada");
        lblTitulo.setPadding(new Insets(8, 0, 0, 8));
        lblTitulo.setStyle("-fx-text-fill: white; -fx-font-size: 30px; -fx-font-weight: bold;");
        Label lblSubtitulo = new Label("Crie um tipo de tabuada.");
        lblSubtitulo.setPadding(new Insets(0, 0, 8, 8));
        lblSubtitulo.setStyle("-fx-text-fill: white;");

        //Colocando os labels dentro do header
        header.getChildren().addAll(lblTitulo,lblSubtitulo);

        //Criação do grid de formulário
        GridPane gridFormulario = new GridPane();
        gridFormulario.setVgap(10);
        gridFormulario.setHgap(10);
        gridFormulario.setPadding(new Insets(8, 0, 8, 8));
        gridFormulario.setStyle("-fx-background-color: #e7fccf;");

        //Colocando o conteúdo do gridFormulario
        Label lblMultiplicando = new Label("Multiplicando:");
        TextField tfMultiplicando = new TextField();
        Label lblMenorMultiplicador = new Label("Menor Multiplicador:");
        TextField tfMenorMultiplicador = new TextField();
        Label lblMaiorMultiplicador = new Label("Maior Multiplicador:");
        TextField tfMaiorMultiplicador = new TextField();

        //Colocando os componentes no gridFormulario
        gridFormulario.add(lblMultiplicando,0,0);
        gridFormulario.add(tfMultiplicando,1,0);
        gridFormulario.add(lblMenorMultiplicador,0,1);
        gridFormulario.add(tfMenorMultiplicador,1,1);
        gridFormulario.add(lblMaiorMultiplicador,0,2);
        gridFormulario.add(tfMaiorMultiplicador,1,2);

        //Criação da caixa dos botões
        HBox boxBotoes = new HBox();
        boxBotoes.setPrefHeight(100);
        boxBotoes.setStyle("-fx-background-color: #d6c396;");

        //Colocando o conteúdo do boxBotoes
        Button btCalcular = new Button("Calcular");
        Button btLimpar = new Button("Limpar");
        Button btSair = new Button("Sair");

        //Colocando os componentes no boxBotoes
        boxBotoes.getChildren().add(btCalcular);
        boxBotoes.getChildren().add(btLimpar);
        boxBotoes.getChildren().add(btSair);

        //Criação da caixa de resultado
        VBox boxResultados = new VBox();
        boxResultados.setPrefHeight(100);
        boxResultados.setStyle("-fx-background-color: #b3544f;");

        //Colocando o conteúdo do boxResultado
        Label lblResultados = new Label("Resultados:");
        ListView listaTabuada = new ListView();

        //Colocando os componentes do boxResultados
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
