package com.futurecollars;
import com.futurecollars.lesson7.exc1.ConsoleMessage;
import com.futurecollars.lesson7.exc1.Message;
import com.futurecollars.lesson7.exc1.WindowMessage;
public class Main {
    public static void main(String[] args) {
        Message windowMsg = new WindowMessage();
        windowMsg.getMessage();
        Message consoleMsg = new ConsoleMessage();
        consoleMsg.getMessage();

    }
}