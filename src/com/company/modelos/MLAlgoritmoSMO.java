package com.company.modelos;

import weka.classifiers.functions.SMO;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;

public class MLAlgoritmoSMO {
    public MLAlgoritmoSMO(String filepath){
        Instances data;
        try {
            data = ConverterUtils.DataSource.read(filepath);
            if (data.classIndex() == -1)
                data.setClassIndex(data.numAttributes() - 1);
            SMO reg = new SMO();
            reg.buildClassifier(data);
            System.out.println(reg.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
