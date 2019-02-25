package by.bntu.fitr.povt.enotes.model;

import java.time.LocalDate;
public class InformationAboutBet {
    private static final Double START_SUMM = 0.0;
    private final LocalDate BEGIN_DATE = LocalDate.now();
    private final LocalDate END_DATE;
    private Double summFirst = START_SUMM;
    private Double summSecond = START_SUMM;
    private String description;
    private double rate = 1;

    public  InformationAboutBet(LocalDate endDate, String description ){
        this.END_DATE = endDate;
        this.description = description;
    }

    private double countUpRate(){
        return this.summSecond/this.summFirst;
    }
}

