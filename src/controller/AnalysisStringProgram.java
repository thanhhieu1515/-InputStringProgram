/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithm;
import view.Menu;

public class AnalysisStringProgram extends Menu<String>{
    static String[] options = {"Input", "Result", "Exit"};
    Algorithm ar;

    public AnalysisStringProgram() {
        super("==== ANALYSIS STRING PROGRAM =====", options);
        ar = new Algorithm();
    }
    @Override
    public void execute(int n) {
        switch(n) {
            case 1 -> ar.getInput();
            case 2 -> ar.getResult();
            case 3 -> System.exit(0);
        }
    }
}
