package com.example.resistron;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * This method makes it possible to launch the Resistron program,
 * moreover in this one it is declared the variables for each line from 1 to 4,
 * which corresponds to the rings of the resistance from left to right.
 */

public class ResistronApplication extends Application {

    /**
     * The main method that contains the start method, which allows you to launch the Resistron program.
     *
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * This method contains the code to launch the program, as well as the declaration of variables for the program’s color lines,
     * which corresponds to each ring present on the resistance.
     *
     * @param primaryStage
     * @throws IOException
     */
    @Override
    public void start(Stage primaryStage) throws IOException {
        //Those line load the FXML file, that we created with SceneBuilder.
        FXMLLoader loader = new FXMLLoader(getClass().getResource("resistronFinal.fxml"));
        Stage stage = loader.load();
        stage.show();
    }

    //We declare the variable for the lines 1 to 4 and give it a name, to use in the ResistronController.
    static double valueLine1;
    static double valueLine2;
    static double valueLine3 = 1;
    static double valueLine4;
}
