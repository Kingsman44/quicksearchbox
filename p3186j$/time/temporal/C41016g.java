package p3186j$.time.temporal;

import p3186j$.desugar.sun.nio.p3187fs.C40947a;
import p3186j$.time.Duration;

/* renamed from: j$.time.temporal.g */
enum C41016g implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears", Duration.ofSeconds(31556952)),
    QUARTER_YEARS("QuarterYears", Duration.ofSeconds(7889238));
    

    /* renamed from: a */
    private final String f107437a;

    /* renamed from: b */
    private final Duration f107438b;

    private C41016g(String str, Duration duration) {
        this.f107437a = str;
        this.f107438b = duration;
    }

    /* renamed from: b */
    public final Temporal mo43358b(Temporal temporal, long j) {
        int i = C41010a.f107433a[ordinal()];
        if (i == 1) {
            TemporalField temporalField = C41017h.f107441c;
            return temporal.mo43043b(temporalField, C40947a.m71106j((long) temporal.get(temporalField), j));
        } else if (i == 2) {
            return temporal.mo43048g(j / 4, ChronoUnit.YEARS).mo43048g((j % 4) * 3, ChronoUnit.MONTHS);
        } else {
            throw new IllegalStateException("Unreachable");
        }
    }

    public final long between(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.until(temporal2, this);
        }
        int i = C41010a.f107433a[ordinal()];
        if (i == 1) {
            TemporalField temporalField = C41017h.f107441c;
            return C40947a.m71107k(temporal2.getLong(temporalField), temporal.getLong(temporalField));
        } else if (i == 2) {
            return temporal.until(temporal2, ChronoUnit.MONTHS) / 3;
        } else {
            throw new IllegalStateException("Unreachable");
        }
    }

    public final Duration getDuration() {
        return this.f107438b;
    }

    public final boolean isDateBased() {
        return true;
    }

    public final boolean isDurationEstimated() {
        return true;
    }

    public final boolean isTimeBased() {
        return false;
    }

    public final String toString() {
        return this.f107437a;
    }
}
