package p3186j$.time.chrono;

import p3186j$.desugar.sun.nio.p3187fs.C40947a;
import p3186j$.time.temporal.C41022m;
import p3186j$.time.temporal.C41023n;
import p3186j$.time.temporal.C41024o;
import p3186j$.time.temporal.ChronoField;
import p3186j$.time.temporal.ChronoUnit;
import p3186j$.time.temporal.Temporal;
import p3186j$.time.temporal.TemporalField;
import p3186j$.time.temporal.ValueRange;

/* renamed from: j$.time.chrono.g */
public enum C40964g implements C40962e {
    BCE,
    CE;

    /* renamed from: a */
    public final boolean mo42996a(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.ERA;
        }
        if (temporalField == null || !temporalField.mo43347b(this)) {
            return false;
        }
    }

    /* renamed from: e */
    public final ValueRange mo42997e(TemporalField temporalField) {
        return C40947a.m71099c(this, temporalField);
    }

    public final int get(TemporalField temporalField) {
        if (temporalField == ChronoField.ERA) {
            return ordinal();
        }
        return C40947a.m71097a(this, temporalField);
    }

    public final long getLong(TemporalField temporalField) {
        if (temporalField == ChronoField.ERA) {
            return (long) ordinal();
        }
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.mo43350g(this);
        }
        throw new C41024o("Unsupported field: ".concat(String.valueOf(temporalField)));
    }

    /* renamed from: h */
    public final Temporal mo43001h(Temporal temporal) {
        return temporal.mo43043b(ChronoField.ERA, (long) ordinal());
    }

    /* renamed from: l */
    public final Object mo43002l(C41023n nVar) {
        return nVar == C41022m.m71571e() ? ChronoUnit.ERAS : C40947a.m71098b(this, nVar);
    }
}
