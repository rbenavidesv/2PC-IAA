package com.company.modelos;

import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;

public class MLAlgoritmoNaiveBayes {
    public MLAlgoritmoNaiveBayes(String filepath) {
        Instances data;
        try {
            data = ConverterUtils.DataSource.read(filepath);
            if (data.classIndex() == -1)
                data.setClassIndex(data.numAttributes() - 1);
            data.setClassIndex(3);
            NaiveBayes reg = new NaiveBayes();
            reg.buildClassifier(data);
            System.out.println(reg.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
