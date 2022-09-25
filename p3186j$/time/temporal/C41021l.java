package p3186j$.time.temporal;

import p3186j$.time.LocalDate;
import p3186j$.time.LocalTime;
import p3186j$.time.ZoneId;
import p3186j$.time.ZoneOffset;
import p3186j$.time.chrono.C40961d;

/* renamed from: j$.time.temporal.l */
final class C41021l implements C41023n {

    /* renamed from: a */
    public final /* synthetic */ int f107452a;

    public /* synthetic */ C41021l(int i) {
        this.f107452a = i;
    }

    /* renamed from: a */
    public final Object mo43245a(TemporalAccessor temporalAccessor) {
        switch (this.f107452a) {
            case 0:
                return mo43390b(temporalAccessor);
            case 1:
                return (C40961d) temporalAccessor.mo43002l(C41022m.f107454b);
            case 2:
                return (TemporalUnit) temporalAccessor.mo43002l(C41022m.f107455c);
            case 3:
                ChronoField chronoField = ChronoField.OFFSET_SECONDS;
                if (temporalAccessor.mo42996a(chronoField)) {
                    return ZoneOffset.m71285t(temporalAccessor.get(chronoField));
                }
                return null;
            case 4:
                return mo43390b(temporalAccessor);
            case 5:
                ChronoField chronoField2 = ChronoField.EPOCH_DAY;
                if (temporalAccessor.mo42996a(chronoField2)) {
                    return LocalDate.ofEpochDay(temporalAccessor.getLong(chronoField2));
                }
                return null;
            default:
                ChronoField chronoField3 = ChronoField.NANO_OF_DAY;
                if (temporalAccessor.mo42996a(chronoField3)) {
                    return LocalTime.m71214q(temporalAccessor.getLong(chronoField3));
                }
                return null;
        }
    }

    /* renamed from: b */
    public final ZoneId mo43390b(TemporalAccessor temporalAccessor) {
        C41023n nVar = C41022m.f107453a;
        switch (this.f107452a) {
            case 0:
                return (ZoneId) temporalAccessor.mo43002l(nVar);
            default:
                ZoneId zoneId = (ZoneId) temporalAccessor.mo43002l(nVar);
                if (zoneId != null) {
                    return zoneId;
                }
                return (ZoneId) temporalAccessor.mo43002l(C41022m.f107456d);
        }
    }

    public final String toString() {
        switch (this.f107452a) {
            case 0:
                return "ZoneId";
            case 1:
                return "Chronology";
            case 2:
                return "Precision";
            case 3:
                return "ZoneOffset";
            case 4:
                return "Zone";
            case 5:
                return "LocalDate";
            default:
                return "LocalTime";
        }
    }
}
