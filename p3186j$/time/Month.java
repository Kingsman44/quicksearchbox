package p3186j$.time;

import p3186j$.desugar.sun.nio.p3187fs.C40947a;
import p3186j$.time.chrono.C40958a;
import p3186j$.time.chrono.C40959b;
import p3186j$.time.chrono.C40963f;
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

/* renamed from: j$.time.Month */
public enum Month implements TemporalAccessor, TemporalAdjuster {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    

    /* renamed from: a */
    private static final Month[] f107256a = null;

    static {
        f107256a = values();
    }

    /* renamed from: o */
    public static Month m71237o(int i) {
        if (i >= 1 && i <= 12) {
            return f107256a[i - 1];
        }
        throw new DateTimeException("Invalid value for MonthOfYear: " + i);
    }

    /* renamed from: a */
    public final boolean mo42996a(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.MONTH_OF_YEAR : temporalField != null && temporalField.mo43347b(this);
    }

    /* renamed from: e */
    public final ValueRange mo42997e(TemporalField temporalField) {
        return temporalField == ChronoField.MONTH_OF_YEAR ? temporalField.range() : C40947a.m71099c(this, temporalField);
    }

    public final int get(TemporalField temporalField) {
        return temporalField == ChronoField.MONTH_OF_YEAR ? getValue() : C40947a.m71097a(this, temporalField);
    }

    public final long getLong(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
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
        if (((C40958a) C40959b.m71322b(temporal)).equals(C40963f.f107281a)) {
            return temporal.mo43043b(ChronoField.MONTH_OF_YEAR, (long) getValue());
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    /* renamed from: l */
    public final Object mo43002l(C41023n nVar) {
        return nVar == C41022m.m71567a() ? C40963f.f107281a : nVar == C41022m.m71571e() ? ChronoUnit.MONTHS : C40947a.m71098b(this, nVar);
    }

    /* renamed from: m */
    public final int mo43170m(boolean z) {
        switch (C41004i.f107405a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + true;
            case 3:
                return z + true;
            case 4:
                return z + true;
            case 5:
                return z + true;
            case 6:
                return 1;
            case 7:
                return z + true;
            case 8:
                return z + true;
            case 9:
                return z + true;
            case 10:
                return z + true;
            case 11:
                return z + true;
            default:
                return z + true;
        }
    }

    /* renamed from: n */
    public final int mo43171n(boolean z) {
        int i = C41004i.f107405a[ordinal()];
        return i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : z ? 29 : 28;
    }

    /* renamed from: p */
    public final Month mo43172p() {
        int i = ((int) 1) + 12;
        return f107256a[(i + ordinal()) % 12];
    }
}
