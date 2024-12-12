package me.huynhducphu.glowpuzzle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class MainController {
    @FXML
    private Button button1, button2, button3, button4, button5, button6, button7;

    @FXML
    private ImageView bulb1, bulb2, bulb3, bulb4, bulb5, bulb6, bulb7;

    @FXML
    private Button resetBtn;

    @FXML
    private Text dialogueText;

    private ArrayList<Integer> dialogue = new ArrayList<>();

    private final Image bulbOnImage = new Image(String.valueOf(getClass().getResource("/me/huynhducphu/glowpuzzle/icon/lightbulb_on.png")));
    private final Image bulbOffImage = new Image(String.valueOf(getClass().getResource("/me/huynhducphu/glowpuzzle/icon/lightbulb_off.png")));

    @FXML
    private boolean
            bulb1On = false,
            bulb2On = false,
            bulb3On = false,
            bulb4On = false,
            bulb5On = false,
            bulb6On = false,
            bulb7On = false;

    public void initialize() {
        button1.setOnAction(event -> handleToggleButton(1));
        button2.setOnAction(event -> handleToggleButton(2));
        button3.setOnAction(event -> handleToggleButton(3));
        button4.setOnAction(event -> handleToggleButton(4));
        button5.setOnAction(event -> handleToggleButton(5));
        button6.setOnAction(event -> handleToggleButton(6));
        button7.setOnAction(event -> handleToggleButton(7));

        handleUpdateBulbImgs();

        resetBtn.setOnAction(event -> handleResetAction());
    }

    private void handleToggleButton(int buttonNumber) {
        switch (buttonNumber) {
            case 1 -> {
                bulb1On = !bulb1On;
                dialogue.add(1);
            }
            case 2 -> {
                bulb2On = !bulb2On;
                bulb3On = !bulb3On;
                bulb5On = !bulb5On;
                bulb7On = !bulb7On;
                dialogue.add(2);
            }
            case 3 -> {
                bulb3On = !bulb3On;
                bulb4On = !bulb4On;
                bulb6On = !bulb6On;
                dialogue.add(3);
            }
            case 4 -> {
                bulb1On = !bulb1On;
                bulb4On = !bulb4On;
                bulb5On = !bulb5On;
                dialogue.add(4);
            }
            case 5 -> {
                bulb2On = !bulb2On;
                bulb5On = !bulb5On;
                bulb6On = !bulb6On;
                bulb7On = !bulb7On;
                dialogue.add(5);
            }
            case 6 -> {
                bulb3On = !bulb3On;
                bulb6On = !bulb6On;
                bulb7On = !bulb7On;
                dialogue.add(6);
            }
            case 7 -> {
                bulb1On = !bulb1On;
                bulb2On = !bulb2On;
                bulb4On = !bulb4On;
                bulb7On = !bulb7On;
                dialogue.add(7);
            }
        }


        dialogueText.setText("Nhật ký: " + dialogue);
        handleUpdateBulbImgs();
    }

    private void handleUpdateBulbImgs() {
        bulb1.setImage(bulb1On ? bulbOnImage : bulbOffImage);
        bulb2.setImage(bulb2On ? bulbOnImage : bulbOffImage);
        bulb3.setImage(bulb3On ? bulbOnImage : bulbOffImage);
        bulb4.setImage(bulb4On ? bulbOnImage : bulbOffImage);
        bulb5.setImage(bulb5On ? bulbOnImage : bulbOffImage);
        bulb6.setImage(bulb6On ? bulbOnImage : bulbOffImage);
        bulb7.setImage(bulb7On ? bulbOnImage : bulbOffImage);
    }

    private void handleResetAction() {
        dialogue = new ArrayList<>();

        bulb1On = false;
        bulb2On = false;
        bulb3On = false;
        bulb4On = false;
        bulb5On = false;
        bulb6On = false;
        bulb7On = false;

        dialogueText.setText("Nhật ký: " + dialogue);
        handleUpdateBulbImgs();
    }
}
