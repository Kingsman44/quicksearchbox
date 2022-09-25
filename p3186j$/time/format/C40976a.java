package p3186j$.time.format;

import p3186j$.time.ZoneId;
import p3186j$.time.ZoneOffset;
import p3186j$.time.temporal.C41022m;
import p3186j$.time.temporal.C41023n;
import p3186j$.time.temporal.TemporalAccessor;

/* renamed from: j$.time.format.a */
public final /* synthetic */ class C40976a implements C41023n {
    /* renamed from: a */
    public final Object mo43245a(TemporalAccessor temporalAccessor) {
        int i = DateTimeFormatterBuilder.f107315j;
        ZoneId zoneId = (ZoneId) temporalAccessor.mo43002l(C41022m.m71573g());
        if (zoneId == null || (zoneId instanceof ZoneOffset)) {
            return null;
        }
        return zoneId;
    }
}
