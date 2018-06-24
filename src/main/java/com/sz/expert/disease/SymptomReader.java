package com.sz.expert.disease;

public class SymptomReader {
    private static SymptomReader ourInstance = new SymptomReader();

    public static SymptomReader read() {
        return ourInstance;
    }

    private SymptomReader() {
    }

    public boolean highFever() {
        return UserInterface.ask().bool("Tiene fiebre alta");
    }

    public boolean violetLimbs() {
        return UserInterface.ask().bool("Las extremidades tienen color violaceo");
    }

    public boolean cough() {
        return UserInterface.ask().bool("Tiene tos");
    }

    public boolean bronchospasm() {
        return UserInterface.ask().bool("Tiene bronco espasmos");
    }

    public String xray() {
        if (UserInterface.ask().bool("La radiografia presenta zonas oscuras")) {
            return "dark";
        }

        if (UserInterface.ask().bool("La radiografia presenta zonas blancas")) {
            return "white";
        }

        return "clear";
    }

    public boolean whistle() {
        return UserInterface.ask().bool("Tiene Auscultacion c/silbido");
    }

    public boolean highWhiteBloodCells() {
        return UserInterface.ask().bool("Tiene conteo alto de globulos blancos");
    }

    public boolean neckPain() {
        return UserInterface.ask().bool("Sufre dolor de cuello");
    }

    public boolean highOxygen() {
        return UserInterface.ask().bool("Tiene oxigeno en sangre alto");
    }
}
