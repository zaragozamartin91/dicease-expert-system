package com.sz.expert.disease;


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
        //     .getResourceAsStream("/com/sz/expert/disease/Rules.drl");

        InputStream resourceAsStream = getClass()
            .getResourceAsStream("/com/rule/Rules.drl");

        Reader reader = new InputStreamReader(resourceAsStream);
        packageBuilder.addPackageFromDrl(reader);
        org.drools.core.rule.Package rulesPackage = packageBuilder.getPackage();
        RuleBase ruleBase = RuleBaseFactory.newRuleBase();
        ruleBase.addPackage(rulesPackage);

        WorkingMemory workingMemory = ruleBase.newStatefulSession();

        Disease disease = new Disease();
        disease.setHighFever(true);
        disease.setVioletLimbs(true);
        disease.setCough(true);
        disease.setBronchospasm(true);
        disease.setXray("dark");
        disease.setWhistle(true);
        disease.setHighWhiteBloodCells(true);

        workingMemory.insert(disease);
        workingMemory.fireAllRules();

        System.out.println("Tiene tuberculosis: " + disease.isTuberculosis());
    }

}