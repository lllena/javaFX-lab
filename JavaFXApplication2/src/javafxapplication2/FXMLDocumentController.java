/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 1488
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Label info;
    @FXML
    private LineChart<Number,Number>chart;
    @FXML
    private TextField xMin;
    @FXML
    private TextField xMax;
    @FXML
    private TextField dx;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    @FXML
    private void draw() {
        info.setText("");
        double min;
        double max;
        double step;
        try {
            min = Double.parseDouble(xMin.getText());
            max = Double.parseDouble(xMax.getText());
            step = Double.parseDouble(dx.getText());
        } catch (Exception e) {
            info.setText("Введіть коректні дані");
            return;
        }
        chart.getData().clear();
        XYChart.Series series = new XYChart.Series();
        series.setName("y=x^2+10*sin(x)");
        double x = min;
        double y;
        while (x <= max) {
            y = x * x + 10 * Math.sin(x);
            series.getData().add(new XYChart.Data(x, y));
            x += step;
        }
        chart.getData().add(series);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
