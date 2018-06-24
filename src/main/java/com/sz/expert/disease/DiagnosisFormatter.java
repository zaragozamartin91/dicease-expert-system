package com.sz.expert.disease;

public class DiagnosisFormatter {
    private static DiagnosisFormatter ourInstance = new DiagnosisFormatter();

    public static DiagnosisFormatter format() {
        return ourInstance;
    }

    private DiagnosisFormatter() {
    }

    public String diagnosis(Disease disease) {
        StringBuilder sb = new StringBuilder("El paciente sufre de:\n ");
        sb.append( disease.isFlu() ? "\tGripe\n" : "" );
        sb.append( disease.isPneumonia() ? "\tNeumonia\n" : "" );
        sb.append( disease.isPneumothorax() ? "\tNeumotorax\n" : "" );
        sb.append( disease.isTuberculosis() ? "\tTuberculosis\n" : "" );

        return disease.anyDisease() ?
                sb.toString() :
                sb.append(" Una afeccion pulmonar no determinada\n").toString();
    }
}
