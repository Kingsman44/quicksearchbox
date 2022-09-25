package p3186j$.time.chrono;

import p3186j$.desugar.sun.nio.p3187fs.C40947a;
import p3186j$.time.temporal.C41022m;
import p3186j$.time.temporal.C41024o;
import p3186j$.time.temporal.ChronoField;
import p3186j$.time.temporal.TemporalAccessor;
import p3186j$.time.temporal.TemporalField;
import p3186j$.util.Objects;

/* renamed from: j$.time.chrono.b */
public abstract /* synthetic */ class C40959b {
    /* renamed from: a */
    public static int m71321a(ChronoZonedDateTime chronoZonedDateTime, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return C40947a.m71097a(chronoZonedDateTime, temporalField);
        }
        int i = C40960c.f107280a[((ChronoField) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? chronoZonedDateTime.mo43202c().get(temporalField) : chronoZonedDateTime.getOffset().mo43201q();
        }
        throw new C41024o("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    /* renamed from: b */
    public static C40961d m71322b(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        return (C40961d) Objects.requireNonNullElse((C40961d) temporalAccessor.mo43002l(C41022m.m71567a()), C40963f.f107281a);
    }
}
