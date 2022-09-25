package p3186j$.time.temporal;

import java.util.HashMap;
import p3186j$.desugar.sun.nio.p3187fs.C40947a;
import p3186j$.time.DateTimeException;
import p3186j$.time.LocalDate;
import p3186j$.time.chrono.C40959b;
import p3186j$.time.chrono.C40961d;
import p3186j$.time.chrono.C40963f;
import p3186j$.time.format.C40972E;

/* renamed from: j$.time.temporal.i */
enum C41018i implements TemporalField {
    JULIAN_DAY("JulianDay", r17, r18, 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", r13, r14, 40587),
    RATA_DIE("RataDie", r13, r14, 719163);
    

    /* renamed from: a */
    private final transient String f107444a;

    /* renamed from: b */
    private final transient TemporalUnit f107445b;

    /* renamed from: c */
    private final transient TemporalUnit f107446c;

    /* renamed from: d */
    private final transient ValueRange f107447d;

    /* renamed from: e */
    private final transient long f107448e;

    private C41018i(String str, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j) {
        this.f107444a = str;
        this.f107445b = chronoUnit;
        this.f107446c = chronoUnit2;
        this.f107447d = ValueRange.m71512h(-365243219162L + j, 365241780471L + j);
        this.f107448e = j;
    }

    /* renamed from: b */
    public final boolean mo43347b(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo42996a(ChronoField.EPOCH_DAY);
    }

    /* renamed from: d */
    public final ValueRange mo43348d(TemporalAccessor temporalAccessor) {
        if (mo43347b(temporalAccessor)) {
            return this.f107447d;
        }
        throw new DateTimeException("Unsupported field: ".concat(String.valueOf(this)));
    }

    /* renamed from: e */
    public final TemporalAccessor mo43349e(HashMap hashMap, TemporalAccessor temporalAccessor, C40972E e) {
        long longValue = ((Long) hashMap.remove(this)).longValue();
        C40961d b = C40959b.m71322b(temporalAccessor);
        C40972E e2 = C40972E.LENIENT;
        long j = this.f107448e;
        if (e == e2) {
            long k = C40947a.m71107k(longValue, j);
            ((C40963f) b).getClass();
            return LocalDate.ofEpochDay(k);
        }
        this.f107447d.mo43366b(this, longValue);
        ((C40963f) b).getClass();
        return LocalDate.ofEpochDay(longValue - j);
    }

    /* renamed from: g */
    public final long mo43350g(TemporalAccessor temporalAccessor) {
        return temporalAccessor.getLong(ChronoField.EPOCH_DAY) + this.f107448e;
    }

    /* renamed from: h */
    public final Temporal mo43351h(Temporal temporal, long j) {
        if (this.f107447d.mo43371g(j)) {
            return temporal.mo43043b(ChronoField.EPOCH_DAY, C40947a.m71107k(j, this.f107448e));
        }
        throw new DateTimeException("Invalid value: " + this.f107444a + " " + j);
    }

    public final boolean isDateBased() {
        return true;
    }

    public final boolean isTimeBased() {
        return false;
    }

    public final ValueRange range() {
        return this.f107447d;
    }

    public final String toString() {
        return this.f107444a;
    }
}
