package com.example.resistron;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.math.BigDecimal;

/**
 * This method declares each button of the program as well as their position on the resistance,
 * it allows to change the color of the rings on the diagram of the resistance, and of the label at the beginning of each line,
 * which also corresponds to each ring of a resistance.
 * It also contains a method that calculates the value of the resistance, and allows the display of the unit, as well as its tolerance.
 */
public class ResistronController {

    //We declare each button that will be used in the program, and what it does.
    ////////////////////BLACK BUTTON OF THE PROGRAM////////////////////
    @FXML
    private Button bBlack1;

    /**
     * In the method below we declare the 1st button of line 1 named bBlack1 "b" = button + its color "Black" + "line number",
     * all the buttons are named in this way, then the color of this one is repeated at the beginning of the line on the label,
     * moreover the color of the button is also repeated on the diagram of the resistance, at the ring level concerned,
     * finally we declare its value and link it to the "Display();' method, which calculates the value of the resistance,
     * and allows the display of the unit and its tolerance.
     * All methods are named "clickOnButton + b + button color + line" number works this way.
     */
    @FXML
    public void clickOnButtonbBlack1() {
        //This line of command fills the Label, with the color chosen : Band 1, the operation of all buttons is organized in this way.
        mLabelB1.setBackground(Background.fill(Color.BLACK));
        //This line of command color the band that is present on the resistance, on the bottom left of the program,
        //when you click on the button, the operation of all buttons is organized in this way.
        mLabelRB1.setBackground(Background.fill(Color.BLACK));
        //In the following statement we declare the value of the button, the operation of all buttons is organized in this way.
        ResistronApplication.valueLine1 = 0;
        //The following line display the value of the chose color, in the label "mLabelBand1Value",
        //the operation of all buttons is organized in this way.
        mLabelBand1Value.setText("Value band 1 : " + ResistronApplication.valueLine1);
        display();
    }

    @FXML
    private Button bBlack2;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbBlack2() {
        //This line of command fills the Label, with the color chosen : Band 2.
        mLabelB2.setBackground(Background.fill(Color.BLACK));
        //This line of command color the band that is present on the resistance, on the bottom left of the program,
        //when you click on the button.
        mLabelRB2.setBackground(Background.fill(Color.BLACK));
        //In the following statement we declare the value of the button.
        ResistronApplication.valueLine2 = 0;
        //The following line display the value of the chose color, in the label "mLabelBand2Value".
        mLabelBand2Value.setText("Value band 2 : " + ResistronApplication.valueLine2);
        display();
    }

    @FXML
    private Button bBlack3;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbBlack3() {
        //This line of command fills the Label, with the color chosen : Band 3.
        mLabelB3.setBackground(Background.fill(Color.BLACK));
        //This line of command color the band that is present on the resistance, on the bottom left of the program,
        //when you click on the button.
        mLabelRB3.setBackground(Background.fill(Color.BLACK));
        //In the following statement we declare the value of the button.
        ResistronApplication.valueLine3 = 1;
        //The following line display the value of the chose color, in the label "mLabelBand3Value".
        mLabelBand3Value.setText("Value band 3 : " + ResistronApplication.valueLine3);
        display();
    }

    ////////////////////BROWN BUTTON OF THE PROGRAM////////////////////
    @FXML
    private Button bBrown1;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbBrown1() {
        //This line of command fills the Label, with the color chosen : Band 1.
        mLabelB1.setBackground(Background.fill(Color.BROWN));
        //This line of command color the band that is present on the resistance, on the bottom left of the program,
        //when you click on the button.
        mLabelRB1.setBackground(Background.fill(Color.BROWN));
        //In the following statement we declare the value of the button.
        ResistronApplication.valueLine1 = 1;
        //The following line display the value of the chose color, in the label "mLabelBand1Value".
        mLabelBand1Value.setText("Value band 1 : " + ResistronApplication.valueLine1);
        display();
    }

    @FXML
    private Button bBrown2;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbBrown2() {
        //This line of command fills the Label, with the color chosen : Band 2.
        mLabelB2.setBackground(Background.fill(Color.BROWN));
        //This line of command color the band that is present on the resistance, on the bottom left of the program,
        //when you click on the button.
        mLabelRB2.setBackground(Background.fill(Color.BROWN));
        //In the following statement we declare the value of the button.
        ResistronApplication.valueLine2 = 1;
        //The following line display the value of the chose color, in the label "mLabelBand2Value".
        mLabelBand2Value.setText("Value band 2 : " + ResistronApplication.valueLine2);
        display();
    }

    @FXML
    private Button bBrown3;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbBrown3() {
        //This line of command fills the Label, with the color chosen : Band 3.
        mLabelB3.setBackground(Background.fill(Color.BROWN));
        //This line of command color the band that is present on the resistance, on the bottom left of the program,
        //when you click on the button.
        mLabelRB3.setBackground(Background.fill(Color.BROWN));
        //In the following statement we declare the value of the button.
        ResistronApplication.valueLine3 = 10;
        //The following line display the value of the chose color, in the label "mLabelBand3Value".
        mLabelBand3Value.setText("Value band 3 : " + ResistronApplication.valueLine3);
        display();
    }

    @FXML
    private Button bBrown4;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbBrown4() {
        //This line of command fills the Label, with the color chosen : Band 4.
        mLabelB4.setBackground(Background.fill(Color.BROWN));
        //This line of command color the band that is present on the resistance, on the bottom left of the program,
        //when you click on the button.
        mLabelRB4.setBackground(Background.fill(Color.BROWN));
        //In the following statement we declare the value of the button.
        ResistronApplication.valueLine4 = 1;
        mLabelBand4Value.setText("Value band 4 : " + ResistronApplication.valueLine4);
        //The following line display the value of the chose color, in the label "mLabelBand4Value".
        display();
    }

    ////////////////////RED BUTTON OF THE PROGRAM////////////////////
    @FXML
    private Button bRed1;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbRed1() {
        mLabelB1.setBackground(Background.fill(Color.RED));
        mLabelRB1.setBackground(Background.fill(Color.RED));
        ResistronApplication.valueLine1 = 2;
        mLabelBand1Value.setText("Value band 1 : " + ResistronApplication.valueLine1);
        display();
    }

    @FXML
    private Button bRed2;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbRed2() {
        mLabelB2.setBackground(Background.fill(Color.RED));
        mLabelRB2.setBackground(Background.fill(Color.RED));
        ResistronApplication.valueLine2 = 2;
        mLabelBand2Value.setText("Value band 2 : " + ResistronApplication.valueLine2);
        display();
    }

    @FXML
    private Button bRed3;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbRed3() {
        mLabelB3.setBackground(Background.fill(Color.RED));
        mLabelRB3.setBackground(Background.fill(Color.RED));
        ResistronApplication.valueLine3 = 100;
        mLabelBand3Value.setText("Value band 3 : " + ResistronApplication.valueLine3);
        display();
    }

    @FXML
    private Button bRed4;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbRed4() {
        mLabelB4.setBackground(Background.fill(Color.RED));
        mLabelRB4.setBackground(Background.fill(Color.RED));
        ResistronApplication.valueLine4 = 2;
        mLabelBand4Value.setText("Value band 4 : " + ResistronApplication.valueLine4);
        display();
    }

    ////////////////////ORANGE BUTTON OF THE PROGRAM////////////////////
    @FXML
    private Button bOrange1;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbOrange1() {
        mLabelB1.setBackground(Background.fill(Color.ORANGE));
        mLabelRB1.setBackground(Background.fill(Color.ORANGE));
        ResistronApplication.valueLine1 = 3;
        mLabelBand1Value.setText("Value band 1 : " + ResistronApplication.valueLine1);
        display();
    }

    @FXML
    private Button bOrange2;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbOrange2() {
        mLabelB2.setBackground(Background.fill(Color.ORANGE));
        mLabelRB2.setBackground(Background.fill(Color.ORANGE));
        ResistronApplication.valueLine2 = 3;
        mLabelBand2Value.setText("Value band 2 : " + ResistronApplication.valueLine2);
        display();
    }

    @FXML
    private Button bOrange3;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbOrange3() {
        mLabelB3.setBackground(Background.fill(Color.ORANGE));
        mLabelRB3.setBackground(Background.fill(Color.ORANGE));
        ResistronApplication.valueLine3 = 1000;
        mLabelBand3Value.setText("Value band 3 : " + ResistronApplication.valueLine3);
        display();
    }

    ////////////////////YELLOW BUTTON OF THE PROGRAM////////////////////
    @FXML
    private Button bYellow1;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbYellow1() {
        mLabelB1.setBackground(Background.fill(Color.YELLOW));
        mLabelRB1.setBackground(Background.fill(Color.YELLOW));
        ResistronApplication.valueLine1 = 4;
        mLabelBand1Value.setText("Value band 1 : " + ResistronApplication.valueLine1);
        display();
    }

    @FXML
    private Button bYellow2;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbYellow2() {
        mLabelB2.setBackground(Background.fill(Color.YELLOW));
        mLabelRB2.setBackground(Background.fill(Color.YELLOW));
        ResistronApplication.valueLine2 = 4;
        mLabelBand2Value.setText("Value band 2 : " + ResistronApplication.valueLine2);
        display();
    }

    @FXML
    private Button bYellow3;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbYellow3() {
        mLabelB3.setBackground(Background.fill(Color.YELLOW));
        mLabelRB3.setBackground(Background.fill(Color.YELLOW));
        ResistronApplication.valueLine3 = 10000;
        mLabelBand3Value.setText("Value band 3 : " + ResistronApplication.valueLine3);
        display();
    }

    ////////////////////GREEN BUTTON OF THE PROGRAM////////////////////
    @FXML
    private Button bGreen1;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbGreen1() {
        mLabelB1.setBackground(Background.fill(Color.GREEN));
        mLabelRB1.setBackground(Background.fill(Color.GREEN));
        ResistronApplication.valueLine1 = 5;
        mLabelBand1Value.setText("Value band 1 : " + ResistronApplication.valueLine1);
        display();
    }

    @FXML
    private Button bGreen2;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbGreen2() {
        mLabelB2.setBackground(Background.fill(Color.GREEN));
        mLabelRB2.setBackground(Background.fill(Color.GREEN));
        ResistronApplication.valueLine2 = 5;
        mLabelBand2Value.setText("Value band 2 : " + ResistronApplication.valueLine2);
        display();
    }

    @FXML
    private Button bGreen3;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbGreen3() {
        mLabelB3.setBackground(Background.fill(Color.GREEN));
        mLabelRB3.setBackground(Background.fill(Color.GREEN));
        ResistronApplication.valueLine3 = 100000;
        mLabelBand3Value.setText("Value band 3 : " + ResistronApplication.valueLine3);
        display();
    }

    @FXML
    private Button bGreen4;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbGreen4() {
        mLabelB4.setBackground(Background.fill(Color.GREEN));
        mLabelRB4.setBackground(Background.fill(Color.GREEN));
        ResistronApplication.valueLine4 = 0.5;
        mLabelBand4Value.setText("Value band 4 : " + ResistronApplication.valueLine4);
        display();
    }

    ////////////////////BLUE BUTTON OF THE PROGRAM////////////////////
    @FXML
    private Button bBlue1;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbBlue1() {
        mLabelB1.setBackground(Background.fill(Color.BLUE));
        mLabelRB1.setBackground(Background.fill(Color.BLUE));
        ResistronApplication.valueLine1 = 6;
        mLabelBand1Value.setText("Value band 1 : " + ResistronApplication.valueLine1);
        display();
    }

    @FXML
    private Button bBlue2;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbBlue2() {
        mLabelB2.setBackground(Background.fill(Color.BLUE));
        mLabelRB2.setBackground(Background.fill(Color.BLUE));
        ResistronApplication.valueLine2 = 6;
        mLabelBand2Value.setText("Value band 2 : " + ResistronApplication.valueLine2);
        display();
    }

    @FXML
    private Button bBlue3;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbBlue3() {
        mLabelB3.setBackground(Background.fill(Color.BLUE));
        mLabelRB3.setBackground(Background.fill(Color.BLUE));
        ResistronApplication.valueLine3 = 1000000;
        mLabelBand3Value.setText("Value band 3 : " + ResistronApplication.valueLine3);
        display();
    }

    @FXML
    private Button bBlue4;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbBlue4() {
        mLabelB4.setBackground(Background.fill(Color.BLUE));
        mLabelRB4.setBackground(Background.fill(Color.BLUE));
        ResistronApplication.valueLine4 = 0.25;
        mLabelBand4Value.setText("Value band 4 : " + ResistronApplication.valueLine4);
        display();
    }

    ////////////////////PURPLE BUTTON OF THE PROGRAM////////////////////
    @FXML
    private Button bPurple1;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbPurple1() {
        mLabelB1.setBackground(Background.fill(Color.PURPLE));
        mLabelRB1.setBackground(Background.fill(Color.PURPLE));
        ResistronApplication.valueLine1 = 7;
        mLabelBand1Value.setText("Value band 1 : " + ResistronApplication.valueLine1);
        display();
    }

    @FXML
    private Button bPurple2;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbPurple2() {
        mLabelB2.setBackground(Background.fill(Color.PURPLE));
        mLabelRB2.setBackground(Background.fill(Color.PURPLE));
        ResistronApplication.valueLine2 = 7;
        mLabelBand2Value.setText("Value band 2 : " + ResistronApplication.valueLine2);
        display();
    }

    @FXML
    private Button bPurple3;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbPurple3() {
        mLabelB3.setBackground(Background.fill(Color.PURPLE));
        mLabelRB3.setBackground(Background.fill(Color.PURPLE));
        ResistronApplication.valueLine3 = 10000000;
        mLabelBand3Value.setText("Value band 3 : " + ResistronApplication.valueLine3);
        display();
    }

    @FXML
    private Button bPurple4;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbPurple4() {
        mLabelB4.setBackground(Background.fill(Color.PURPLE));
        mLabelRB4.setBackground(Background.fill(Color.PURPLE));
        ResistronApplication.valueLine4 = 0.10;
        mLabelBand4Value.setText("Value band 4 : " + ResistronApplication.valueLine4);
        display();
    }

    ////////////////////GRAY BUTTON OF THE PROGRAM////////////////////
    @FXML
    private Button bGray1;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbGray1() {
        mLabelB1.setBackground(Background.fill(Color.GRAY));
        mLabelRB1.setBackground(Background.fill(Color.GRAY));
        ResistronApplication.valueLine1 = 8;
        mLabelBand1Value.setText("Value band 1 : " + ResistronApplication.valueLine1);
        display();
    }

    @FXML
    private Button bGray2;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbGray2() {
        mLabelB2.setBackground(Background.fill(Color.GRAY));
        mLabelRB2.setBackground(Background.fill(Color.GRAY));
        ResistronApplication.valueLine2 = 8;
        mLabelBand2Value.setText("Value band 2 : " + ResistronApplication.valueLine2);
        display();
    }

    @FXML
    private Button bGray3;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbGray3() {
        mLabelB3.setBackground(Background.fill(Color.GRAY));
        mLabelRB3.setBackground(Background.fill(Color.GRAY));
        ResistronApplication.valueLine3 = 100000000;
        mLabelBand3Value.setText("Value band 3 : " + ResistronApplication.valueLine3);
        display();
    }

    @FXML
    private Button bGray4;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbGray4() {
        mLabelB4.setBackground(Background.fill(Color.GRAY));
        mLabelRB4.setBackground(Background.fill(Color.GRAY));
        ResistronApplication.valueLine4 = 0.05;
        mLabelBand4Value.setText("Value band 4 : " + ResistronApplication.valueLine4);
        display();
    }

    ////////////////////WHITE BUTTON OF THE PROGRAM////////////////////
    @FXML
    private Button bWhite1;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbWhite1() {
        mLabelB1.setBackground(Background.fill(Color.WHITE));
        mLabelRB1.setBackground(Background.fill(Color.WHITE));
        ResistronApplication.valueLine1 = 9;
        mLabelBand1Value.setText("Value band 1 : " + ResistronApplication.valueLine1);
        display();
    }

    @FXML
    private Button bWhite2;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbWhite2() {
        mLabelB2.setBackground(Background.fill(Color.WHITE));
        mLabelRB2.setBackground(Background.fill(Color.WHITE));
        ResistronApplication.valueLine2 = 9;
        mLabelBand2Value.setText("Value band 2 : " + ResistronApplication.valueLine2);
        display();
    }

    @FXML
    private Button bWhite3;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbWhite3() {
        mLabelB3.setBackground(Background.fill(Color.WHITE));
        mLabelRB3.setBackground(Background.fill(Color.WHITE));
        ResistronApplication.valueLine3 = 1000000000;
        mLabelBand3Value.setText("Value band 3 : " + ResistronApplication.valueLine3);
        display();
    }

    ////////////////////GOLD BUTTON OF THE PROGRAM////////////////////
    @FXML
    private Button bGold3;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbGold3() {
        mLabelB3.setBackground(Background.fill(Color.GOLD));
        mLabelRB3.setBackground(Background.fill(Color.GOLD));
        ResistronApplication.valueLine3 = 0.1;
        mLabelBand3Value.setText("Value band 3 : " + ResistronApplication.valueLine3);
        display();
    }

    @FXML
    private Button bGold4;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbGold4() {
        mLabelB4.setBackground(Background.fill(Color.GOLD));
        mLabelRB4.setBackground(Background.fill(Color.GOLD));
        ResistronApplication.valueLine4 = 5;
        mLabelBand4Value.setText("Value band 4 : " + ResistronApplication.valueLine4);
        display();
    }

    ////////////////////SILVER BUTTON OF THE PROGRAM////////////////////
    @FXML
    private Button bSilver3;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbSilver3() {
        //This line of command fills the Label, with the color chosen : Band 3.
        mLabelB3.setBackground(Background.fill(Color.SILVER));
        //This line of command color the band that is present on the resistance,on the bottom left of the program,
        //when you click on the button.
        mLabelRB3.setBackground(Background.fill(Color.SILVER));
        //In the following statement we declare the value of the button.
        ResistronApplication.valueLine3 = 0.01;
        //The following line display the value of the chose color, in the label "mLabelBand3Value".
        mLabelBand3Value.setText("Value band 3 : " + ResistronApplication.valueLine3);
        display();
    }

    @FXML
    private Button bSilver4;

    /**
     * This method works in the same way as the method "clickOnButtonbBlack1"
     */
    @FXML
    public void clickOnButtonbSilver4() {
        //This line of command fills the Label, with the color chosen : Band 4.
        mLabelB4.setBackground(Background.fill(Color.SILVER));
        //This line of command color the band that is present on the resistance,on the bottom left of the program,
        //when you click on the button.
        mLabelRB4.setBackground(Background.fill(Color.SILVER));
        //In the following statement we declare the value of the button.
        ResistronApplication.valueLine4 = 10;
        //The following line display the value of the chose color, in the label "mLabelBand4Value".
        mLabelBand4Value.setText("Value band 4 : " + ResistronApplication.valueLine4);
        display();
    }

    //We declare here all the label that we will use in the program, in front of each line of color,
    //on the left of the color lines.
    //Label "Band 1"
    @FXML
    private Label mLabelB1;

    //Label "Band 2"
    @FXML
    private Label mLabelB2;

    //Label "Band 3"
    @FXML
    private Label mLabelB3;

    //Label "Band 4"
    @FXML
    private Label mLabelB4;

    //We used a label to display the value of the chosen band for each color line, at the bottom center of the application.
    //Displays the value of the color selected in line 1.
    @FXML
    private Label mLabelBand1Value;

    //Displays the value of the color selected in line 2.
    @FXML
    private Label mLabelBand2Value;

    //Displays the value of the color selected in line 3.
    @FXML
    private Label mLabelBand3Value;

    //Displays the value of the color selected in line 4.
    @FXML
    private Label mLabelBand4Value;

    //The following label displays the name of the program at the top of the window
    @FXML
    private Label mLabelPageTitle;

    //The following label displays the sentence present above the colored buttons
    @FXML
    private Label mLabelDoThis;

    // The following label displays the resistance diagram on the bottom left of the program.
    @FXML
    private Rectangle mShapeResistor;

    //Rings 1 from the left on the resistor diagram
    @FXML
    private Label mLabelRB1;

    //Rings 2 from the left on the resistor diagram
    @FXML
    private Label mLabelRB2;

    //Rings 3 from the left on the resistor diagram
    @FXML
    private Label mLabelRB3;

    //Rings 4 from the left on the resistor diagram
    @FXML
    private Label mLabelRB4;

    //Label in front of the field "displayResult"
    @FXML
    private Label tBoxResult;

    //Displays the result of the resistance calculation, after selecting the first three colors
    @FXML
    private TextField displayResult;

    //Displays the unit in Ohms, KOhms, MOhms or GOhms, depending on the value obtained from the calculation.
    @FXML
    private Label displayUnit;

    //Displays the tolerance of the resistance, depending on the color selected on the fourth color line "Band 4".
    @FXML
    private TextField displayTolerance;

    /**
     * This method calculates the value of the resistance with a BigDecimal, and then displays it in the result field of the program,
     * with the unit and tolerance displayed in their respective fields.
     * Each ring is declared in this method, as well as the unit, with an "if/else if" loop,
     * in order to determine if it is Ohms, KOhms, MOhms or GOhms.
     * Moreover, once the value of the resistance, the unit and the tolerance are displayed, the text fields cannot be modified by the user,
     * but he can make a copy/paste.
     */
    @FXML
    public void display() {
        //Calculates the value of the resistance as follows (ring 1 * 10 + ring 2) * per ring 3, using the command,
        //to include the special case of multiplication by 0.1
        BigDecimal result = BigDecimal.valueOf(ResistronApplication.valueLine1 * 10 + ResistronApplication.valueLine2).multiply(BigDecimal.valueOf(ResistronApplication.valueLine3));
        String textTol = "±" + ResistronApplication.valueLine4 + "%";

        String textValue;
        String textUnit;
        //The lines below declare the variable that will display the unit of the result that we calculated
        String Ohms = "Ω";
        String KOhms = "KΩ";
        String MOhms = "MΩ";
        String GOhms = "GΩ";

        //This loop converts the result of the given calculation into Ohms, KOhms, MOhms and GOhms.
        if (result.doubleValue() < 1000) {
            textValue = result + " ";
            textUnit = Ohms;
        } else if (result.doubleValue() < 1000000) {
            result = result.divide(BigDecimal.valueOf(1000));
            textValue = result + " ";
            textUnit = KOhms;
        } else if (result.doubleValue() < 1000000000) {
            result = result.divide(BigDecimal.valueOf(1000000));
            textValue = result + " ";
            textUnit = MOhms;
        } else {
            result = result.divide(BigDecimal.valueOf(1000000000));
            textValue = result + " ";
            textUnit = GOhms;
        }
        //These lines display the result of the calculation on the program, in the textfield.
        displayResult.setText(textValue);
        displayUnit.setText(textUnit);
        displayTolerance.setText(textTol);

        //The TextField is read-only and cannot be edited for the result and tolerance.
        displayResult.setEditable(false);
        displayTolerance.setEditable(false);
    }
}


