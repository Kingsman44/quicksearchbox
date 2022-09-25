package p3186j$.time.chrono;

import p3186j$.time.LocalDate;
import p3186j$.time.LocalDateTime;
import p3186j$.time.LocalTime;
import p3186j$.time.Period;
import p3186j$.time.temporal.Temporal;
import p3186j$.time.temporal.TemporalAdjuster;
import p3186j$.time.temporal.TemporalField;

/* renamed from: j$.time.chrono.ChronoLocalDate */
public interface ChronoLocalDate extends Temporal, TemporalAdjuster, Comparable<ChronoLocalDate> {
    /* renamed from: a */
    boolean mo42996a(TemporalField temporalField);

    int compareTo(ChronoLocalDate chronoLocalDate);

    boolean equals(Object obj);

    /* renamed from: f */
    LocalDateTime mo43076f(LocalTime localTime);

    C40961d getChronology();

    /* renamed from: i */
    LocalDate mo43084i(Period period);

    long toEpochDay();
}
