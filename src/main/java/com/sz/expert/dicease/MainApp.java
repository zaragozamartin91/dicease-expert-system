package com.sz.expert.dicease;


import org.drools.compiler.compiler.DroolsParserException;
import org.drools.compiler.compiler.PackageBuilder;
import org.drools.core.RuleBase;
import org.drools.core.RuleBaseFactory;
import org.drools.core.WorkingMemory;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class MainApp {

    public static void main(String[] args) throws DroolsParserException, IOException {
        MainApp droolsTest = new MainApp();
        droolsTest.executeDrools();
    }

    public void executeDrools() throws DroolsParserException, IOException {

        PackageBuilder packageBuilder = new PackageBuilder();

        // InputStream resourceAsStream = getClass()
        //     .getResourceAsStream("/com/sz/expert/dicease/Rules.drl");

        InputStream resourceAsStream = getClass()
            .getResourceAsStream("/com/rule/Rules.drl");

        Reader reader = new InputStreamReader(resourceAsStream);
        packageBuilder.addPackageFromDrl(reader);
        org.drools.core.rule.Package rulesPackage = packageBuilder.getPackage();
        RuleBase ruleBase = RuleBaseFactory.newRuleBase();
        ruleBase.addPackage(rulesPackage);

        WorkingMemory workingMemory = ruleBase.newStatefulSession();

        Dicease dicease = new Dicease();
        dicease.setHighFever(true);
        dicease.setVioletLimbs(true);
        dicease.setCough(true);
        dicease.setBronchospasm(true);
        dicease.setXray("dark");
        dicease.setWhistle(true);
        dicease.setHighWhiteBloodCells(true);

        workingMemory.insert(dicease);
        workingMemory.fireAllRules();

        System.out.println("Tiene tuberculosis: " + dicease.isTuberculosis());
    }

}