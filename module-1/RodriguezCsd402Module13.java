/*
 * Name: Luis Rodriguez
 * Course: CSD-402
 * Assignment: Module 1 - Energy Needed to Heat Water
 * Date: August 16, 2026
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RodriguezCsd402Module13 extends Application {

    @Override
    public void start(Stage stage) {

        Label massLabel = new Label("Water Mass (kg):");
        TextField massField = new TextField();

        Label initialLabel = new Label("Initial Temperature (°C):");
        TextField initialField = new TextField();

        Label finalLabel = new Label("Final Temperature (°C):");
        TextField finalField = new TextField();

        Button calculateButton = new Button("Calculate");

        Label resultLabel = new Label("Energy Required:");

        calculateButton.setOnAction(event -> {
            try {
                double waterMass = Double.parseDouble(massField.getText());
                double initialTemperature =
                        Double.parseDouble(initialField.getText());
                double finalTemperature =
                        Double.parseDouble(finalField.getText());

                double energy = waterMass
                        * (finalTemperature - initialTemperature)
                        * 4184;

                resultLabel.setText(
                        String.format("Energy Required: %.2f Joules", energy)
                );

            } catch (NumberFormatException e) {
                resultLabel.setText("Please enter valid numbers.");
            }
        });

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(massLabel, 0, 0);
        grid.add(massField, 1, 0);

        grid.add(initialLabel, 0, 1);
        grid.add(initialField, 1, 1);

        grid.add(finalLabel, 0, 2);
        grid.add(finalField, 1, 2);

        grid.add(calculateButton, 1, 3);
        grid.add(resultLabel, 0, 4, 2, 1);

        Scene scene = new Scene(grid, 450, 250);

        stage.setTitle("Water Heating Energy Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}