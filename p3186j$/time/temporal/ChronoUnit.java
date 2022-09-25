package p3186j$.time.temporal;

import p3186j$.time.Duration;

/* renamed from: j$.time.temporal.ChronoUnit */
public enum ChronoUnit implements TemporalUnit {
    NANOS("Nanos", Duration.ofNanos(1)),
    MICROS("Micros", Duration.ofNanos(1000)),
    MILLIS("Millis", Duration.ofNanos(1000000)),
    SECONDS("Seconds", Duration.ofSeconds(1)),
    MINUTES("Minutes", Duration.ofSeconds(60)),
    HOURS("Hours", Duration.ofSeconds(3600)),
    HALF_DAYS("HalfDays", Duration.ofSeconds(43200)),
    DAYS("Days", Duration.ofSeconds(86400)),
    WEEKS("Weeks", Duration.ofSeconds(604800)),
    MONTHS("Months", Duration.ofSeconds(2629746)),
    YEARS("Years", Duration.ofSeconds(31556952)),
    DECADES("Decades", Duration.ofSeconds(315569520)),
    CENTURIES("Centuries", Duration.ofSeconds(3155695200L)),
    MILLENNIA("Millennia", Duration.ofSeconds(31556952000L)),
    ERAS("Eras", Duration.ofSeconds(31556952000000000L)),
    FOREVER("Forever", Duration.ofSeconds(Long.MAX_VALUE, 999999999));
    

    /* renamed from: a */
    private final String f107419a;

    /* renamed from: b */
    private final Duration f107420b;

    private ChronoUnit(String str, Duration duration) {
        this.f107419a = str;
        this.f107420b = duration;
    }

    /* renamed from: b */
    public final Temporal mo43358b(Temporal temporal, long j) {
        return temporal.mo43048g(j, this);
    }

    public long between(Temporal temporal, Temporal temporal2) {
        return temporal.until(temporal2, this);
    }

    public Duration getDuration() {
        return this.f107420b;
    }

    public final boolean isDateBased() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    public final boolean isDurationEstimated() {
        return compareTo(DAYS) >= 0;
    }

    public final boolean isTimeBased() {
        return compareTo(DAYS) < 0;
    }

    public final String toString() {
        return this.f107419a;
    }
}
