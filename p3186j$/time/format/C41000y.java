package p3186j$.time.format;

import com.evernote.android.state.BuildConfig;
import p3186j$.desugar.sun.nio.p3187fs.C40947a;
import p3186j$.time.LocalDate;
import p3186j$.time.ZoneId;
import p3186j$.time.chrono.C40961d;
import p3186j$.time.chrono.ChronoLocalDate;
import p3186j$.time.temporal.C41022m;
import p3186j$.time.temporal.C41023n;
import p3186j$.time.temporal.TemporalAccessor;
import p3186j$.time.temporal.TemporalField;
import p3186j$.time.temporal.ValueRange;

/* renamed from: j$.time.format.y */
final class C41000y implements TemporalAccessor {

    /* renamed from: a */
    final /* synthetic */ ChronoLocalDate f107395a;

    /* renamed from: b */
    final /* synthetic */ TemporalAccessor f107396b;

    /* renamed from: c */
    final /* synthetic */ C40961d f107397c;

    /* renamed from: d */
    final /* synthetic */ ZoneId f107398d;

    C41000y(LocalDate localDate, TemporalAccessor temporalAccessor, C40961d dVar, ZoneId zoneId) {
        this.f107395a = localDate;
        this.f107396b = temporalAccessor;
        this.f107397c = dVar;
        this.f107398d = zoneId;
    }

    /* renamed from: a */
    public final boolean mo42996a(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.f107395a;
        return (chronoLocalDate == null || !temporalField.isDateBased()) ? this.f107396b.mo42996a(temporalField) : chronoLocalDate.mo42996a(temporalField);
    }

    /* renamed from: e */
    public final ValueRange mo42997e(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.f107395a;
        return (chronoLocalDate == null || !temporalField.isDateBased()) ? this.f107396b.mo42997e(temporalField) : chronoLocalDate.mo42997e(temporalField);
    }

    public final /* synthetic */ int get(TemporalField temporalField) {
        return C40947a.m71097a(this, temporalField);
    }

    public final long getLong(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.f107395a;
        return (chronoLocalDate == null || !temporalField.isDateBased()) ? this.f107396b.getLong(temporalField) : chronoLocalDate.getLong(temporalField);
    }

    /* renamed from: l */
    public final Object mo43002l(C41023n nVar) {
        return nVar == C41022m.m71567a() ? this.f107397c : nVar == C41022m.m71573g() ? this.f107398d : nVar == C41022m.m71571e() ? this.f107396b.mo43002l(nVar) : nVar.mo43245a(this);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f107396b);
        String str = BuildConfig.FLAVOR;
        C40961d dVar = this.f107397c;
        String concat = dVar != null ? " with chronology ".concat(String.valueOf(dVar)) : str;
        ZoneId zoneId = this.f107398d;
        if (zoneId != null) {
            str = " with zone ".concat(String.valueOf(zoneId));
        }
        return valueOf + concat + str;
    }
}
