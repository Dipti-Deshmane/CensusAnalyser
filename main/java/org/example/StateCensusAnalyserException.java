package org.example;

public class StateCensusAnalyserException extends Exception {

    //CONSTANT
    public enum CensusAnalyserCustomExceptionType{
        FILE_NOT_FOUND,NO_SUCH_TYPE,WRONG_DELIMITER_OR_HEADER;;

    }
    public CensusAnalyserCustomExceptionType type;

    //CONSTRUCTOR
    public StateCensusAnalyserException(CensusAnalyserCustomExceptionType type, String message) {
        super(message);
        this.type = type;
    }

}
