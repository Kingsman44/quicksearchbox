package p3186j$.time.temporal;

import p3186j$.time.chrono.C40958a;
import p3186j$.time.chrono.C40959b;
import p3186j$.time.chrono.C40963f;

/* renamed from: j$.time.temporal.h */
public abstract class C41017h {

    /* renamed from: a */
    public static final TemporalField f107439a = C41015f.QUARTER_OF_YEAR;

    /* renamed from: b */
    public static final TemporalField f107440b = C41015f.WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: c */
    public static final TemporalField f107441c = C41015f.WEEK_BASED_YEAR;

    /* renamed from: d */
    public static final TemporalUnit f107442d = C41016g.WEEK_BASED_YEARS;

    static {
        C41015f fVar = C41015f.DAY_OF_QUARTER;
        C41016g gVar = C41016g.WEEK_BASED_YEARS;
    }

    /* renamed from: a */
    static boolean m71558a(TemporalAccessor temporalAccessor) {
        return ((C40958a) C40959b.m71322b(temporalAccessor)).equals(C40963f.f107281a);
    }
}
