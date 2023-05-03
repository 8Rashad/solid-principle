package org.example.S;

import java.util.Arrays;

public class TextPrinter {
    TextController textController;

    public TextPrinter(TextController textController) {
        this.textController = textController;
    }

    public void printText() {
        System.out.println(textController.getText());
    }

    public void printOutEachWordOfText() {
        System.out.println(Arrays.toString(textController.getText().split(" ")));
    }

    public void printRangeOfCharacters(int startingIndex, int endIndex) {
        System.out.println(textController.getText().substring(startingIndex, endIndex));
    }
}
