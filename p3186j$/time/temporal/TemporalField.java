package p3186j$.time.temporal;

import java.util.HashMap;
import p3186j$.time.format.C40972E;

/* renamed from: j$.time.temporal.TemporalField */
public interface TemporalField {
    /* renamed from: b */
    boolean mo43347b(TemporalAccessor temporalAccessor);

    /* renamed from: d */
    ValueRange mo43348d(TemporalAccessor temporalAccessor);

    /* renamed from: e */
    TemporalAccessor mo43349e(HashMap hashMap, TemporalAccessor temporalAccessor, C40972E e);

    /* renamed from: g */
    long mo43350g(TemporalAccessor temporalAccessor);

    /* renamed from: h */
    Temporal mo43351h(Temporal temporal, long j);

    boolean isDateBased();

    boolean isTimeBased();

    ValueRange range();
}
