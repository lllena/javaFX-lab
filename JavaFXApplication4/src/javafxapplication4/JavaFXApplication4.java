/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import java.util.Random;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author 1488
 */
public class JavaFXApplication4 extends Application {

    static final int MAX_SIZE = 4;
    static final int MIN_SIZE = 2;
    static final int MIN_VALUE = -9;
    static final int MAX_VALUE = 9;

    private int n;
    int m;
    int[][] arr;
    String[][] formuls;

    public JavaFXApplication4(int n, int m) {
        this.n = n;
        this.m = m;
        arr = new int[n][m];
        formuls = new String[n][m];
    }

    public JavaFXApplication4() {
        Random random = new Random();
        n = random.nextInt(MAX_SIZE - MIN_SIZE + 1) + MIN_SIZE;
        m = random.nextInt(MAX_SIZE - MIN_SIZE + 1) + MIN_SIZE;
        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
            }
        }
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public void setValue(int value, int i, int j) {
        arr[i][j] = value;
    }

    public void setFormula(String formula, int i, int j) {
        formuls[i][j] = formula;
    }

    public int getValue(int i, int j) {
        return arr[i][j];
    }

    public String getFormula(int i, int j) {
        return formuls[i][j];
    }

    public boolean isCorrect(int value, int i, int j) {
        return value == arr[i][j];
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
