package p3186j$.time.temporal;

import java.util.HashMap;
import p3186j$.desugar.sun.nio.p3187fs.C40947a;
import p3186j$.time.DateTimeException;
import p3186j$.time.LocalDate;
import p3186j$.time.format.C40972E;

/* 'enum' modifier removed */
/* renamed from: j$.time.temporal.d */
final class C41013d extends C41015f {
    C41013d() {
        super("WEEK_OF_WEEK_BASED_YEAR", 2);
    }

    /* renamed from: b */
    public final boolean mo43347b(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo42996a(ChronoField.EPOCH_DAY) && C41017h.m71558a(temporalAccessor);
    }

    /* renamed from: d */
    public final ValueRange mo43348d(TemporalAccessor temporalAccessor) {
        if (mo43347b(temporalAccessor)) {
            return C41015f.m71553o(LocalDate.m71156o(temporalAccessor));
        }
        throw new C41024o("Unsupported field: WeekOfWeekBasedYear");
    }

    /* renamed from: e */
    public final TemporalAccessor mo43349e(HashMap hashMap, TemporalAccessor temporalAccessor, C40972E e) {
        LocalDate localDate;
        ValueRange valueRange;
        long j;
        LocalDate plusWeeks;
        long j2;
        HashMap hashMap2 = hashMap;
        C40972E e2 = e;
        C41015f fVar = C41015f.WEEK_BASED_YEAR;
        Long l = (Long) hashMap2.get(fVar);
        ChronoField chronoField = ChronoField.DAY_OF_WEEK;
        Long l2 = (Long) hashMap2.get(chronoField);
        if (l == null || l2 == null) {
            return null;
        }
        int a = fVar.range().mo43365a(fVar, l.longValue());
        long longValue = ((Long) hashMap2.get(C41015f.WEEK_OF_WEEK_BASED_YEAR)).longValue();
        if (C41017h.m71558a(temporalAccessor)) {
            LocalDate of = LocalDate.m71157of(a, 1, 4);
            if (e2 == C40972E.LENIENT) {
                long longValue2 = l2.longValue();
                if (longValue2 > 7) {
                    j2 = longValue2 - 1;
                    plusWeeks = of.plusWeeks(j2 / 7);
                } else {
                    j = 1;
                    if (longValue2 < 1) {
                        plusWeeks = of.plusWeeks(C40947a.m71107k(longValue2, 7) / 7);
                        j2 = longValue2 + 6;
                    }
                    localDate = of.plusWeeks(C40947a.m71107k(longValue, j)).mo43043b(chronoField, longValue2);
                }
                of = plusWeeks;
                j = 1;
                longValue2 = (j2 % 7) + 1;
                localDate = of.plusWeeks(C40947a.m71107k(longValue, j)).mo43043b(chronoField, longValue2);
            } else {
                int k = chronoField.mo43354k(l2.longValue());
                if (longValue < 1 || longValue > 52) {
                    if (e2 == C40972E.STRICT) {
                        valueRange = C41015f.m71553o(of);
                    } else {
                        valueRange = range();
                    }
                    valueRange.mo43366b(this, longValue);
                }
                localDate = of.plusWeeks(longValue - 1).mo43043b(chronoField, (long) k);
            }
            hashMap2.remove(this);
            hashMap2.remove(fVar);
            hashMap2.remove(chronoField);
            return localDate;
        }
        throw new DateTimeException("Resolve requires IsoChronology");
    }

    /* renamed from: g */
    public final long mo43350g(TemporalAccessor temporalAccessor) {
        if (mo43347b(temporalAccessor)) {
            return (long) C41015f.m71550l(LocalDate.m71156o(temporalAccessor));
        }
        throw new C41024o("Unsupported field: WeekOfWeekBasedYear");
    }

    /* renamed from: h */
    public final Temporal mo43351h(Temporal temporal, long j) {
        range().mo43366b(this, j);
        return temporal.mo43048g(C40947a.m71107k(j, mo43350g(temporal)), ChronoUnit.WEEKS);
    }

    public final ValueRange range() {
        return ValueRange.m71514j(52, 53);
    }

    public final String toString() {
        return "WeekOfWeekBasedYear";
    }
}
