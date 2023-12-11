package com.example.praktikum06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Table extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TableView table = new TableView();
        TableColumn<Mahasiswa, String>kolom2 = new TableColumn<>("NIM");
        TableColumn<Mahasiswa, String>kolom3 = new TableColumn<>("NAMA");
        kolom2.setCellValueFactory(
                new PropertyValueFactory<>("nim")
        );
        kolom3.setCellValueFactory(
                new PropertyValueFactory<>("nama")
        );
        table.getColumns().add(kolom2);
        table.getColumns().add(kolom3);
        table.getItems().add(new Mahasiswa(1,"123","Jungkook"));
        table.getItems().add(new Mahasiswa(2,"234","J-Hope"));
        table.getItems().add(new Mahasiswa(3,"345","Taehyung"));
        table.getItems().add(new Mahasiswa(4,"456","Namjoon"));
        table.getItems().add(new Mahasiswa(5,"567","Jimin"));
        table.getItems().add(new Mahasiswa(6,"678","Yoongi"));
        table.getItems().add(new Mahasiswa(7,"789","Seokjin"));
        table.getItems().add(new Mahasiswa(8,"890","Suga"));
        table.getItems().add(new Mahasiswa(9,"012","V"));
        table.getItems().add(new Mahasiswa(10,"213","RM"));

        VBox vbox = new VBox(table);
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
