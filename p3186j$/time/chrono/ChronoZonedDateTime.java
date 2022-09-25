package p3186j$.time.chrono;

import p3186j$.time.LocalDateTime;
import p3186j$.time.LocalTime;
import p3186j$.time.ZoneId;
import p3186j$.time.ZoneOffset;
import p3186j$.time.chrono.ChronoLocalDate;
import p3186j$.time.temporal.Temporal;

/* renamed from: j$.time.chrono.ChronoZonedDateTime */
public interface ChronoZonedDateTime<D extends ChronoLocalDate> extends Temporal, Comparable<ChronoZonedDateTime<?>> {
    /* renamed from: c */
    LocalDateTime mo43202c();

    C40961d getChronology();

    ZoneOffset getOffset();

    ZoneId getZone();

    long toEpochSecond();

    LocalTime toLocalTime();
}
