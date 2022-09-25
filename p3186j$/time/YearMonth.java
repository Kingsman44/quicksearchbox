package p3186j$.time;

import java.io.Serializable;
import p3186j$.desugar.sun.nio.p3187fs.C40947a;
import p3186j$.time.chrono.C40958a;
import p3186j$.time.chrono.C40959b;
import p3186j$.time.chrono.C40963f;
import p3186j$.time.format.C40973F;
import p3186j$.time.format.DateTimeFormatterBuilder;
import p3186j$.time.temporal.C41022m;
import p3186j$.time.temporal.C41023n;
import p3186j$.time.temporal.C41024o;
import p3186j$.time.temporal.ChronoField;
import p3186j$.time.temporal.ChronoUnit;
import p3186j$.time.temporal.Temporal;
import p3186j$.time.temporal.TemporalAdjuster;
import p3186j$.time.temporal.TemporalField;
import p3186j$.time.temporal.TemporalUnit;
import p3186j$.time.temporal.ValueRange;
import p3186j$.util.Objects;

/* renamed from: j$.time.YearMonth */
public final class YearMonth implements Temporal, TemporalAdjuster, Comparable<YearMonth>, Serializable {

    /* renamed from: a */
    private final int f107264a;

    /* renamed from: b */
    private final int f107265b;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.mo43280j(ChronoField.YEAR, 4, 10, C40973F.EXCEEDS_PAD);
        dateTimeFormatterBuilder.mo43275e('-');
        dateTimeFormatterBuilder.mo43281l(ChronoField.MONTH_OF_YEAR, 2);
        dateTimeFormatterBuilder.toFormatter();
    }

    private YearMonth(int i, int i2) {
        this.f107264a = i;
        this.f107265b = i2;
    }

    /* renamed from: m */
    private long m71263m() {
        return ((((long) this.f107264a) * 12) + ((long) this.f107265b)) - 1;
    }

    /* renamed from: of */
    public static YearMonth m71264of(int i, int i2) {
        ChronoField.YEAR.mo43355l((long) i);
        ChronoField.MONTH_OF_YEAR.mo43355l((long) i2);
        return new YearMonth(i, i2);
    }

    /* renamed from: q */
    private YearMonth m71265q(int i, int i2) {
        return (this.f107264a == i && this.f107265b == i2) ? this : new YearMonth(i, i2);
    }

    /* renamed from: a */
    public final boolean mo42996a(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.YEAR || temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.PROLEPTIC_MONTH || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA : temporalField != null && temporalField.mo43347b(this);
    }

    public LocalDate atEndOfMonth() {
        int i = this.f107265b;
        Month o = Month.m71237o(i);
        C40963f fVar = C40963f.f107281a;
        int i2 = this.f107264a;
        fVar.getClass();
        return LocalDate.m71157of(i2, i, o.mo43171n(C40963f.isLeapYear((long) i2)));
    }

    public final int compareTo(Object obj) {
        YearMonth yearMonth = (YearMonth) obj;
        int i = this.f107264a - yearMonth.f107264a;
        if (i == 0) {
            return this.f107265b - yearMonth.f107265b;
        }
        return i;
    }

    /* renamed from: d */
    public final Temporal mo43046d(LocalDate localDate) {
        return (YearMonth) localDate.mo43001h(this);
    }

    /* renamed from: e */
    public final ValueRange mo42997e(TemporalField temporalField) {
        if (temporalField != ChronoField.YEAR_OF_ERA) {
            return C40947a.m71099c(this, temporalField);
        }
        return ValueRange.m71512h(1, this.f107264a <= 0 ? 1000000000 : 999999999);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        r5 = (p3186j$.time.YearMonth) r5;
        r1 = r5.f107264a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof p3186j$.time.YearMonth
            r2 = 0
            if (r1 == 0) goto L_0x001a
            j$.time.YearMonth r5 = (p3186j$.time.YearMonth) r5
            int r1 = r5.f107264a
            int r3 = r4.f107264a
            if (r3 != r1) goto L_0x0018
            int r1 = r4.f107265b
            int r5 = r5.f107265b
            if (r1 != r5) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            return r0
        L_0x001a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.time.YearMonth.equals(java.lang.Object):boolean");
    }

    public final int get(TemporalField temporalField) {
        return mo42997e(temporalField).mo43365a(temporalField, getLong(temporalField));
    }

    public final long getLong(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.mo43350g(this);
        }
        int i = C41007l.f107408a[((ChronoField) temporalField).ordinal()];
        int i2 = 1;
        if (i == 1) {
            return (long) this.f107265b;
        }
        if (i == 2) {
            return m71263m();
        }
        int i3 = this.f107264a;
        if (i == 3) {
            if (i3 < 1) {
                i3 = 1 - i3;
            }
            return (long) i3;
        } else if (i == 4) {
            return (long) i3;
        } else {
            if (i == 5) {
                if (i3 < 1) {
                    i2 = 0;
                }
                return (long) i2;
            }
            throw new C41024o("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
    }

    /* renamed from: h */
    public final Temporal mo43001h(Temporal temporal) {
        if (((C40958a) C40959b.m71322b(temporal)).equals(C40963f.f107281a)) {
            return temporal.mo43043b(ChronoField.PROLEPTIC_MONTH, m71263m());
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    public final int hashCode() {
        return (this.f107265b << 27) ^ this.f107264a;
    }

    /* renamed from: k */
    public final Temporal mo43054k(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? mo43048g(Long.MAX_VALUE, chronoUnit).mo43048g(1, chronoUnit) : mo43048g(-j, chronoUnit);
    }

    /* renamed from: l */
    public final Object mo43002l(C41023n nVar) {
        return nVar == C41022m.m71567a() ? C40963f.f107281a : nVar == C41022m.m71571e() ? ChronoUnit.MONTHS : C40947a.m71098b(this, nVar);
    }

    /* renamed from: n */
    public final YearMonth mo43048g(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (YearMonth) temporalUnit.mo43358b(this, j);
        }
        switch (C41007l.f107409b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return mo43191o(j);
            case 2:
                return mo43192p(j);
            case 3:
                return mo43192p(C40947a.m71104h(j, (long) 10));
            case 4:
                return mo43192p(C40947a.m71104h(j, (long) 100));
            case 5:
                return mo43192p(C40947a.m71104h(j, (long) 1000));
            case 6:
                ChronoField chronoField = ChronoField.ERA;
                return mo43043b(chronoField, C40947a.m71106j(getLong(chronoField), j));
            default:
                throw new C41024o("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    /* renamed from: o */
    public final YearMonth mo43191o(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.f107264a) * 12) + ((long) (this.f107265b - 1)) + j;
        long j3 = (long) 12;
        return m71265q(ChronoField.YEAR.mo43354k(C40947a.m71102f(j2, j3)), ((int) C40947a.m71105i(j2, j3)) + 1);
    }

    /* renamed from: p */
    public final YearMonth mo43192p(long j) {
        return j == 0 ? this : m71265q(ChronoField.YEAR.mo43354k(((long) this.f107264a) + j), this.f107265b);
    }

    /* renamed from: r */
    public final YearMonth mo43043b(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return (YearMonth) temporalField.mo43351h(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.mo43355l(j);
        int i = C41007l.f107408a[chronoField.ordinal()];
        int i2 = this.f107264a;
        if (i == 1) {
            int i3 = (int) j;
            ChronoField.MONTH_OF_YEAR.mo43355l((long) i3);
            return m71265q(i2, i3);
        } else if (i == 2) {
            return mo43191o(j - m71263m());
        } else {
            int i4 = this.f107265b;
            if (i == 3) {
                if (i2 < 1) {
                    j = 1 - j;
                }
                int i5 = (int) j;
                ChronoField.YEAR.mo43355l((long) i5);
                return m71265q(i5, i4);
            } else if (i == 4) {
                int i6 = (int) j;
                ChronoField.YEAR.mo43355l((long) i6);
                return m71265q(i6, i4);
            } else if (i != 5) {
                throw new C41024o("Unsupported field: ".concat(String.valueOf(temporalField)));
            } else if (getLong(ChronoField.ERA) == j) {
                return this;
            } else {
                int i7 = 1 - i2;
                ChronoField.YEAR.mo43355l((long) i7);
                return m71265q(i7, i4);
            }
        }
    }

    public final String toString() {
        int i;
        int i2 = this.f107264a;
        int abs = Math.abs(i2);
        StringBuilder sb = new StringBuilder(9);
        if (abs < 1000) {
            if (i2 < 0) {
                sb.append(i2 - 10000);
                i = 1;
            } else {
                sb.append(i2 + 10000);
                i = 0;
            }
            sb.deleteCharAt(i);
        } else {
            sb.append(i2);
        }
        int i3 = this.f107265b;
        sb.append(i3 < 10 ? "-0" : "-");
        sb.append(i3);
        return sb.toString();
    }

    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        YearMonth yearMonth;
        if (temporal instanceof YearMonth) {
            yearMonth = (YearMonth) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!C40963f.f107281a.equals(C40959b.m71322b(temporal))) {
                    temporal = LocalDate.m71156o(temporal);
                }
                yearMonth = m71264of(temporal.get(ChronoField.YEAR), temporal.get(ChronoField.MONTH_OF_YEAR));
            } catch (DateTimeException e) {
                String valueOf = String.valueOf(temporal);
                String name = temporal.getClass().getName();
                throw new DateTimeException("Unable to obtain YearMonth from TemporalAccessor: " + valueOf + " of type " + name, e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, yearMonth);
        }
        long m = yearMonth.m71263m() - m71263m();
        switch (C41007l.f107409b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return m;
            case 2:
                return m / 12;
            case 3:
                return m / 120;
            case 4:
                return m / 1200;
            case 5:
                return m / 12000;
            case 6:
                ChronoField chronoField = ChronoField.ERA;
                return yearMonth.getLong(chronoField) - getLong(chronoField);
            default:
                throw new C41024o("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }
}
