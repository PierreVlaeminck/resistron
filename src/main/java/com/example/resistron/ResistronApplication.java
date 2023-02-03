package com.example.resistron;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created with Intellij IDEA<br/>
 * This class makes it possible to launch the Resistron program,<br/>
 * moreover in this one we declare the variables for each line from 1 to 4,<br/>
 * which corresponds to the rings of the resistance from left to right.<br/>
 * <br/>
 *
 * @author : Pierre, Ann and Mélanie
 * @version : 03/02/2023
 *
 */

public class ResistronApplication extends Application {

    /**
     * The main method that contains the start method, which allows you to launch the Resistron program.<br/>
     *
     * @param args
     *
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * This method contains the code to launch the program, as well as the declaration of variables for the program’s color lines,<br/>
     * which corresponds to each ring present on the resistance.<br/>
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
