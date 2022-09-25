package p3186j$.time.temporal;

/* 'enum' modifier removed */
/* renamed from: j$.time.temporal.c */
final class C41012c extends C41015f {
    C41012c() {
        super("QUARTER_OF_YEAR", 1);
    }

    /* renamed from: b */
    public final boolean mo43347b(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo42996a(ChronoField.MONTH_OF_YEAR) && C41017h.m71558a(temporalAccessor);
    }

    /* renamed from: d */
    public final ValueRange mo43348d(TemporalAccessor temporalAccessor) {
        if (mo43347b(temporalAccessor)) {
            return range();
        }
        throw new C41024o("Unsupported field: QuarterOfYear");
    }

    /* renamed from: g */
    public final long mo43350g(TemporalAccessor temporalAccessor) {
        if (mo43347b(temporalAccessor)) {
            return (temporalAccessor.getLong(ChronoField.MONTH_OF_YEAR) + 2) / 3;
        }
        throw new C41024o("Unsupported field: QuarterOfYear");
    }

    /* renamed from: h */
    public final Temporal mo43351h(Temporal temporal, long j) {
        long g = mo43350g(temporal);
        range().mo43366b(this, j);
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        return temporal.mo43043b(chronoField, ((j - g) * 3) + temporal.getLong(chronoField));
    }

    public final ValueRange range() {
        return ValueRange.m71512h(1, 4);
    }

    public final String toString() {
        return "QuarterOfYear";
    }
}
