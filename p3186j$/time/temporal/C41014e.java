package p3186j$.time.temporal;

import p3186j$.time.LocalDate;

/* 'enum' modifier removed */
/* renamed from: j$.time.temporal.e */
final class C41014e extends C41015f {
    C41014e() {
        super("WEEK_BASED_YEAR", 3);
    }

    /* renamed from: b */
    public final boolean mo43347b(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo42996a(ChronoField.EPOCH_DAY) && C41017h.m71558a(temporalAccessor);
    }

    /* renamed from: d */
    public final ValueRange mo43348d(TemporalAccessor temporalAccessor) {
        if (mo43347b(temporalAccessor)) {
            return range();
        }
        throw new C41024o("Unsupported field: WeekBasedYear");
    }

    /* renamed from: g */
    public final long mo43350g(TemporalAccessor temporalAccessor) {
        if (mo43347b(temporalAccessor)) {
            return (long) C41015f.m71554p(LocalDate.m71156o(temporalAccessor));
        }
        throw new C41024o("Unsupported field: WeekBasedYear");
    }

    /* renamed from: h */
    public final Temporal mo43351h(Temporal temporal, long j) {
        if (mo43347b(temporal)) {
            int a = range().mo43365a(C41015f.WEEK_BASED_YEAR, j);
            LocalDate o = LocalDate.m71156o(temporal);
            ChronoField chronoField = ChronoField.DAY_OF_WEEK;
            int i = o.get(chronoField);
            int l = C41015f.m71550l(o);
            if (l == 53 && C41015f.m71555q(a) == 52) {
                l = 52;
            }
            LocalDate of = LocalDate.m71157of(a, 1, 4);
            return temporal.mo43046d(of.plusDays((long) (((l - 1) * 7) + (i - of.get(chronoField)))));
        }
        throw new C41024o("Unsupported field: WeekBasedYear");
    }

    public final ValueRange range() {
        return ChronoField.YEAR.range();
    }

    public final String toString() {
        return "WeekBasedYear";
    }
}
