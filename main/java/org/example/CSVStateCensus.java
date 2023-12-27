package org.example;

import com.opencsv.bean.CsvBindByName;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Iterator;

public class CSVStateCensus {
     public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getPopulation() {
                return population;
            }

            public void setPopulation(String population) {
                this.population = population;
            }

            public String getAreaInSqKm() {
                return areaInSqKm;
            }

            public void setAreaInSqKm(String areaInSqKm) {
                this.areaInSqKm = areaInSqKm;
            }

            public String getDensityPerSqKm() {
                return densityPerSqKm;
            }

            public void setDensityPerSqKm(String densityPerSqKm) {
                this.densityPerSqKm = densityPerSqKm;
            }

            @CsvBindByName(column = "State", required = true)
            public String state;

            @CsvBindByName(column = "Population", required = true)
            public String population;

            @CsvBindByName(column = "AreaInSqKm", required = true)
            public String areaInSqKm;

            @CsvBindByName(column = "DensityPerSqKm", required = true)
            public String densityPerSqKm;

            @Override
            public String toString() {
                return "CSVstateCensus{" +
                        "state='" + state + '\'' +
                        ", population='" + population + '\'' +
                        ", areaInSqKm='" + areaInSqKm + '\'' +
                        ", densityPerSqKm='" + densityPerSqKm + '\'' +
                        '}';
            }
        }
