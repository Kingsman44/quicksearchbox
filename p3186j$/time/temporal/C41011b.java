package p3186j$.time.temporal;

import java.util.HashMap;
import p3186j$.desugar.sun.nio.p3187fs.C40947a;
import p3186j$.time.DateTimeException;
import p3186j$.time.LocalDate;
import p3186j$.time.chrono.C40963f;
import p3186j$.time.format.C40972E;

/* 'enum' modifier removed */
/* renamed from: j$.time.temporal.b */
final class C41011b extends C41015f {
    C41011b() {
        super("DAY_OF_QUARTER", 0);
    }

    /* renamed from: b */
    public final boolean mo43347b(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo42996a(ChronoField.DAY_OF_YEAR) && temporalAccessor.mo42996a(ChronoField.MONTH_OF_YEAR) && temporalAccessor.mo42996a(ChronoField.YEAR) && C41017h.m71558a(temporalAccessor);
    }

    /* renamed from: d */
    public final ValueRange mo43348d(TemporalAccessor temporalAccessor) {
        if (mo43347b(temporalAccessor)) {
            long j = temporalAccessor.getLong(C41015f.QUARTER_OF_YEAR);
            if (j != 1) {
                return j == 2 ? ValueRange.m71512h(1, 91) : (j == 3 || j == 4) ? ValueRange.m71512h(1, 92) : range();
            }
            long j2 = temporalAccessor.getLong(ChronoField.YEAR);
            C40963f.f107281a.getClass();
            return C40963f.isLeapYear(j2) ? ValueRange.m71512h(1, 91) : ValueRange.m71512h(1, 90);
        }
        throw new C41024o("Unsupported field: DayOfQuarter");
    }

    /* renamed from: e */
    public final TemporalAccessor mo43349e(HashMap hashMap, TemporalAccessor temporalAccessor, C40972E e) {
        long j;
        LocalDate localDate;
        ValueRange valueRange;
        HashMap hashMap2 = hashMap;
        C40972E e2 = e;
        ChronoField chronoField = ChronoField.YEAR;
        Long l = (Long) hashMap2.get(chronoField);
        C41015f fVar = C41015f.QUARTER_OF_YEAR;
        Long l2 = (Long) hashMap2.get(fVar);
        if (l == null || l2 == null) {
            return null;
        }
        int k = chronoField.mo43354k(l.longValue());
        long longValue = ((Long) hashMap2.get(C41015f.DAY_OF_QUARTER)).longValue();
        if (C41017h.m71558a(temporalAccessor)) {
            if (e2 == C40972E.LENIENT) {
                localDate = LocalDate.m71157of(k, 1, 1).plusMonths(C40947a.m71104h(C40947a.m71107k(l2.longValue(), 1), (long) 3));
                j = C40947a.m71107k(longValue, 1);
            } else {
                LocalDate of = LocalDate.m71157of(k, ((fVar.range().mo43365a(fVar, l2.longValue()) - 1) * 3) + 1, 1);
                if (longValue < 1 || longValue > 90) {
                    if (e2 == C40972E.STRICT) {
                        valueRange = mo43348d(of);
                    } else {
                        valueRange = range();
                    }
                    valueRange.mo43366b(this, longValue);
                }
                localDate = of;
                j = longValue - 1;
            }
            hashMap2.remove(this);
            hashMap2.remove(chronoField);
            hashMap2.remove(fVar);
            return localDate.plusDays(j);
        }
        throw new DateTimeException("Resolve requires IsoChronology");
    }

    /* renamed from: g */
    public final long mo43350g(TemporalAccessor temporalAccessor) {
        if (mo43347b(temporalAccessor)) {
            int i = temporalAccessor.get(ChronoField.DAY_OF_YEAR);
            int i2 = temporalAccessor.get(ChronoField.MONTH_OF_YEAR);
            long j = temporalAccessor.getLong(ChronoField.YEAR);
            int[] k = C41015f.f107434a;
            int i3 = (i2 - 1) / 3;
            C40963f.f107281a.getClass();
            return (long) (i - k[i3 + (C40963f.isLeapYear(j) ? 4 : 0)]);
        }
        throw new C41024o("Unsupported field: DayOfQuarter");
    }

    /* renamed from: h */
    public final Temporal mo43351h(Temporal temporal, long j) {
        long g = mo43350g(temporal);
        range().mo43366b(this, j);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        return temporal.mo43043b(chronoField, (j - g) + temporal.getLong(chronoField));
    }

    public final ValueRange range() {
        return ValueRange.m71514j(90, 92);
    }

    public final String toString() {
        return "DayOfQuarter";
    }
}
