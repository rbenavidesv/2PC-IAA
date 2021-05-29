package com.company;
import  com.company.modelos.*;


public class Main {
    public static void main(String[] args) {

        // algoritmos  de clasificacionon , dataset iris y medical
        MLAlgoritmoJ48 mlJ48Test = new MLAlgoritmoJ48("file:///C:/Users/REYBERT/Documents/AppR/2pc-IAA/src/com/datasets/iris/iris-test.arff");
        MLAlgoritmoJ48 mlJ48Train = new MLAlgoritmoJ48("file:///C:/Users/REYBERT/Documents/AppR/2pc-IAA/src/com/datasets/iris/iris-train.arff");

        MLAlgoritmoNaiveBayes mlBayesTest = new MLAlgoritmoNaiveBayes("file:///C:/Users/REYBERT/Documents/AppR/2pc-IAA/src/com/datasets/medical/medical-test.arff");
        MLAlgoritmoNaiveBayes mlBayesTrain = new MLAlgoritmoNaiveBayes("file:///C:/Users/REYBERT/Documents/AppR/2pc-IAA/src/com/datasets/medical/medical-train.arff");

        // algoritmos  de Regresion , dataset iris y medical

        MLAlgoritmoReptree mlReptreeTest = new MLAlgoritmoReptree("file:///C:/Users/REYBERT/Documents/AppR/2pc-IAA/src/com/datasets/iris/iris-test.arff");
        MLAlgoritmoReptree mlReptreeTrain = new MLAlgoritmoReptree("file:///C:/Users/REYBERT/Documents/AppR/2pc-IAA/src/com/datasets/iris/iris-train.arff");

        MLAlgoritmoSMO mlSMOTest = new MLAlgoritmoSMO("file:///C:/Users/REYBERT/Documents/AppR/2pc-IAA/src/com/datasets/medical/medical-test.arff");
        MLAlgoritmoSMO mlSMOTrain = new MLAlgoritmoSMO("file:///C:/Users/REYBERT/Documents/AppR/2pc-IAA/src/com/datasets/medical/medical-test.arff");


    }
}
