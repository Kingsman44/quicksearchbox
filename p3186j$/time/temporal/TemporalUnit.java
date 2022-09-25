package p3186j$.time.temporal;

import p3186j$.time.Duration;

/* renamed from: j$.time.temporal.TemporalUnit */
public interface TemporalUnit {
    /* renamed from: b */
    Temporal mo43358b(Temporal temporal, long j);

    long between(Temporal temporal, Temporal temporal2);

    Duration getDuration();

    boolean isDateBased();

    boolean isDurationEstimated();

    boolean isTimeBased();
}
