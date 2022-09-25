package p3186j$.time.chrono;

import p3186j$.time.LocalDate;
import p3186j$.time.LocalTime;
import p3186j$.time.chrono.ChronoLocalDate;
import p3186j$.time.temporal.Temporal;
import p3186j$.time.temporal.TemporalAdjuster;

/* renamed from: j$.time.chrono.ChronoLocalDateTime */
public interface ChronoLocalDateTime<D extends ChronoLocalDate> extends Temporal, TemporalAdjuster, Comparable<ChronoLocalDateTime<?>> {
    C40961d getChronology();

    /* renamed from: j */
    LocalDate mo43126j();

    LocalTime toLocalTime();
}
