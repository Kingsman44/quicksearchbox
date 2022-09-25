package p3186j$.time;

import p3186j$.desugar.sun.nio.p3187fs.C40947a;
import p3186j$.time.temporal.C41022m;
import p3186j$.time.temporal.C41023n;
import p3186j$.time.temporal.C41024o;
import p3186j$.time.temporal.ChronoField;
import p3186j$.time.temporal.ChronoUnit;
import p3186j$.time.temporal.Temporal;
import p3186j$.time.temporal.TemporalAccessor;
import p3186j$.time.temporal.TemporalAdjuster;
import p3186j$.time.temporal.TemporalField;
import p3186j$.time.temporal.ValueRange;

/* renamed from: j$.time.DayOfWeek */
public enum DayOfWeek implements TemporalAccessor, TemporalAdjuster {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    

    /* renamed from: a */
    private static final DayOfWeek[] f107235a = null;

    static {
        f107235a = values();
    }

    public static DayOfWeek from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof DayOfWeek) {
            return (DayOfWeek) temporalAccessor;
        }
        try {
            return m71130of(temporalAccessor.get(ChronoField.DAY_OF_WEEK));
        } catch (DateTimeException e) {
            String valueOf = String.valueOf(temporalAccessor);
            String name = temporalAccessor.getClass().getName();
            throw new DateTimeException("Unable to obtain DayOfWeek from TemporalAccessor: " + valueOf + " of type " + name, e);
        }
    }

    /* renamed from: of */
    public static DayOfWeek m71130of(int i) {
        if (i >= 1 && i <= 7) {
            return f107235a[i - 1];
        }
        throw new DateTimeException("Invalid value for DayOfWeek: " + i);
    }

    /* renamed from: a */
    public final boolean mo42996a(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.DAY_OF_WEEK : temporalField != null && temporalField.mo43347b(this);
    }

    /* renamed from: e */
    public final ValueRange mo42997e(TemporalField temporalField) {
        return temporalField == ChronoField.DAY_OF_WEEK ? temporalField.range() : C40947a.m71099c(this, temporalField);
    }

    public int get(TemporalField temporalField) {
        return temporalField == ChronoField.DAY_OF_WEEK ? getValue() : C40947a.m71097a(this, temporalField);
    }

    public long getLong(TemporalField temporalField) {
        if (temporalField == ChronoField.DAY_OF_WEEK) {
            return (long) getValue();
        }
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.mo43350g(this);
        }
        throw new C41024o("Unsupported field: ".concat(String.valueOf(temporalField)));
    }

    public int getValue() {
        return ordinal() + 1;
    }

    /* renamed from: h */
    public final Temporal mo43001h(Temporal temporal) {
        return temporal.mo43043b(ChronoField.DAY_OF_WEEK, (long) getValue());
    }

    /* renamed from: l */
    public final Object mo43002l(C41023n nVar) {
        return nVar == C41022m.m71571e() ? ChronoUnit.DAYS : C40947a.m71098b(this, nVar);
    }

    /* renamed from: m */
    public final DayOfWeek mo43003m(long j) {
        int i = ((int) (j % 7)) + 7;
        return f107235a[(i + ordinal()) % 7];
    }
}
