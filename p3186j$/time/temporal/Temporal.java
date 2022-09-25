package p3186j$.time.temporal;

import p3186j$.time.LocalDate;

/* renamed from: j$.time.temporal.Temporal */
public interface Temporal extends TemporalAccessor {
    /* renamed from: b */
    Temporal mo43043b(TemporalField temporalField, long j);

    /* renamed from: d */
    Temporal mo43046d(LocalDate localDate);

    /* renamed from: g */
    Temporal mo43048g(long j, TemporalUnit temporalUnit);

    /* renamed from: k */
    Temporal mo43054k(long j, ChronoUnit chronoUnit);

    long until(Temporal temporal, TemporalUnit temporalUnit);
}
