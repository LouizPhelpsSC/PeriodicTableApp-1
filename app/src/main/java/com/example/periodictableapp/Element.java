package com.example.periodictableapp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Element {
    private int atomicNumber;
    private String symbol;
    private String name;
    private String atomicMass;
    private String electronicConfiguration;
    private double electronegativity;
    private int atomicRadius;
    private String ionRadius;
    private String vanDerWaalsRadius;
    private int ionizationEnergy;
    private int electronAffinity;
    private int oxidationStates;
    private String standardState;
    private String bondingType;
    private int meltingPoint;
    private int boilingPoint;
    private double density;
    private String groupBlock;
    private Date yearDiscovered;
    private String block;
    private String cpkHexColor;
    private int period;
    private int group;
    private boolean favorited;

    // CONSTRUCTORS
    public Element() {
    }

//    public List<Element> getAllElements()
//    {
//        ArrayList<Element> elementList = new ArrayList<>();
//        return elementList;
//    }
//
//
//    public List<Element> getElementsByBlock(String block)
//    {
//
//    }
//
//    public List<Element> getElementsByState(String state)
//    {
//
//    }
//
//    public Element getElementByAtomicName(String name)
//    {
//        Element element = new Element();
//        return element;
//    }
//
//    public Element getElementByAtomic(int atomicNumber)
//    {
//        Element element = new Element();
//        return element;
//    }
//
//    public Element getElementBySymbol(String symbol)
//    {
//        Element element = new Element();
//        return element;
//    }
//
//    public List<Element> getElementsByBodingType(String bondingType)
//    {
//
//    }
//
//    public List<Element> getElementsByType(String type)
//    {
//
//    }
//
//    public List<Element> getElementsByGroup(String group)
//    {
//
//    }
//
//    public List<Element> getElementsByPeriod(String period)
//    {
//
//    }

    // GETTERS AND SETTERS
    public int getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAtomicMass() {
        return atomicMass;
    }

    public void setAtomicMass(String atomicMass) {
        this.atomicMass = atomicMass;
    }

    public String getElectronicConfiguration() {
        return electronicConfiguration;
    }

    public void setElectronicConfiguration(String electronicConfiguration) {
        this.electronicConfiguration = electronicConfiguration;
    }

    public double getElectronegativity() {
        return electronegativity;
    }

    public void setElectronegativity(double electronegativity) {
        this.electronegativity = electronegativity;
    }

    public int getAtomicRadius() {
        return atomicRadius;
    }

    public void setAtomicRadius(int atomicRadius) {
        this.atomicRadius = atomicRadius;
    }

    public String getIonRadius() {
        return ionRadius;
    }

    public void setIonRadius(String ionRadius) {
        this.ionRadius = ionRadius;
    }

    public String getVanDerWaalsRadius() {
        return vanDerWaalsRadius;
    }

    public void setVanDerWaalsRadius(String vanDerWaalsRadius) {
        this.vanDerWaalsRadius = vanDerWaalsRadius;
    }

    public int getIonizationEnergy() {
        return ionizationEnergy;
    }

    public void setIonizationEnergy(int ionizationEnergy) {
        this.ionizationEnergy = ionizationEnergy;
    }

    public int getElectronAffinity() {
        return electronAffinity;
    }

    public void setElectronAffinity(int electronAffinity) {
        this.electronAffinity = electronAffinity;
    }

    public int getOxidationStates() {
        return oxidationStates;
    }

    public void setOxidationStates(int oxidationStates) {
        this.oxidationStates = oxidationStates;
    }

    public String getStandardState() {
        return standardState;
    }

    public void setStandardState(String standardState) {
        this.standardState = standardState;
    }

    public String getBondingType() {
        return bondingType;
    }

    public void setBondingType(String bondingType) {
        this.bondingType = bondingType;
    }

    public int getMeltingPoint() {
        return meltingPoint;
    }

    public void setMeltingPoint(int meltingPoint) {
        this.meltingPoint = meltingPoint;
    }

    public int getBoilingPoint() {
        return boilingPoint;
    }

    public void setBoilingPoint(int boilingPoint) {
        this.boilingPoint = boilingPoint;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public String getGroupBlock() {
        return groupBlock;
    }

    public void setGroupBlock(String groupBlock) {
        this.groupBlock = groupBlock;
    }

    public Date getYearDiscovered() {
        return yearDiscovered;
    }

    public void setYearDiscovered(Date yearDiscovered) {
        this.yearDiscovered = yearDiscovered;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getCpkHexColor() {
        return cpkHexColor;
    }

    public void setCpkHexColor(String cpkHexColor) {
        this.cpkHexColor = cpkHexColor;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public boolean isFavorited() {
        return favorited;
    }

    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }
}
