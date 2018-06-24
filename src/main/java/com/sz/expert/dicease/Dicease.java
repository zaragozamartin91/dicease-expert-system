package com.sz.expert.dicease;

/**
 * Dicease
 */
public class Dicease {
    // SINTOMAS
    private boolean highFever;
    private boolean violetLimbs;
    private boolean cough;
    private boolean bronchospasm;
    private String xray = "";
    private boolean whistle;
    private boolean highWhiteBloodCells;
    private boolean neckPain;
    private boolean highOxygen;

    // DIAGNOSTICO
    private boolean tuberculosis;

    public boolean isHighFever() {
        return highFever;
    }

    public void setHighFever(boolean highFever) {
        this.highFever = highFever;
    }

    public boolean isVioletLimbs() {
        return violetLimbs;
    }

    public void setVioletLimbs(boolean violetLimbs) {
        this.violetLimbs = violetLimbs;
    }

    public boolean isCough() {
        return cough;
    }

    public void setCough(boolean cough) {
        this.cough = cough;
    }

    public boolean isBronchospasm() {
        return bronchospasm;
    }

    public void setBronchospasm(boolean bronchospasm) {
        this.bronchospasm = bronchospasm;
    }

    public String getXray() {
        return xray;
    }

    public void setXray(String xray) {
        this.xray = xray;
    }

    public boolean isWhistle() {
        return whistle;
    }

    public void setWhistle(boolean whistle) {
        this.whistle = whistle;
    }

    public boolean isHighWhiteBloodCells() {
        return highWhiteBloodCells;
    }

    public void setHighWhiteBloodCells(boolean highWhiteBloodCells) {
        this.highWhiteBloodCells = highWhiteBloodCells;
    }

    public boolean isTuberculosis() {
        return tuberculosis;
    }

    public void setTuberculosis(boolean tuberculosis) {
        this.tuberculosis = tuberculosis;
    }

    public boolean isNeckPain() {
        return neckPain;
    }

    public void setNeckPain(boolean neckPain) {
        this.neckPain = neckPain;
    }

    public boolean isHighOxygen() {
        return highOxygen;
    }

    public void setHighOxygen(boolean highOxygen) {
        this.highOxygen = highOxygen;
    }
}