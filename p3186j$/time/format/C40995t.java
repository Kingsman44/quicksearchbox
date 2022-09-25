package p3186j$.time.format;

import java.util.Iterator;
import java.util.Map;
import p3186j$.time.chrono.C40961d;
import p3186j$.time.chrono.C40962e;
import p3186j$.time.chrono.C40963f;
import p3186j$.time.chrono.C40964g;
import p3186j$.time.temporal.C41022m;
import p3186j$.time.temporal.ChronoField;
import p3186j$.time.temporal.TemporalField;
import p3186j$.util.List;

/* renamed from: j$.time.format.t */
final class C40995t implements C40982g {

    /* renamed from: a */
    private final TemporalField f107375a;

    /* renamed from: b */
    private final C40974G f107376b;

    /* renamed from: c */
    private final C40969B f107377c;

    /* renamed from: d */
    private volatile C40987l f107378d;

    C40995t(TemporalField temporalField, C40974G g, C40969B b) {
        this.f107375a = temporalField;
        this.f107376b = g;
        this.f107377c = b;
    }

    /* renamed from: b */
    public final boolean mo43294b(C41001z zVar, StringBuilder sb) {
        String str;
        Long e = zVar.mo43343e(this.f107375a);
        if (e == null) {
            return false;
        }
        C40961d dVar = (C40961d) zVar.mo43342d().mo43002l(C41022m.m71567a());
        if (dVar == null || dVar == C40963f.f107281a) {
            str = this.f107377c.mo43249f(this.f107375a, e.longValue(), this.f107376b, zVar.mo43341c());
        } else {
            str = this.f107377c.mo43248e(dVar, this.f107375a, e.longValue(), this.f107376b, zVar.mo43341c());
        }
        if (str == null) {
            if (this.f107378d == null) {
                this.f107378d = new C40987l(this.f107375a, 1, 19, C40973F.NORMAL);
            }
            return this.f107378d.mo43294b(zVar, sb);
        }
        sb.append(str);
        return true;
    }

    /* renamed from: d */
    public final int mo43295d(C40999x xVar, CharSequence charSequence, int i) {
        C40974G g;
        Iterator it;
        int i2 = i;
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            throw new IndexOutOfBoundsException();
        }
        if (xVar.mo43328l()) {
            g = this.f107376b;
        } else {
            g = null;
        }
        C40961d h = xVar.mo43324h();
        C40969B b = this.f107377c;
        TemporalField temporalField = this.f107375a;
        if (h == null || h == C40963f.f107281a) {
            it = b.mo43251h(temporalField, g, xVar.mo43325i());
        } else {
            it = b.mo43250g(h, temporalField, g, xVar.mo43325i());
        }
        Iterator it2 = it;
        if (it2 != null) {
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str = (String) entry.getKey();
                if (xVar.mo43335s(str, 0, charSequence, i, str.length())) {
                    return xVar.mo43331o(this.f107375a, ((Long) entry.getValue()).longValue(), i, str.length() + i2);
                }
            }
            if (temporalField == ChronoField.ERA && !xVar.mo43328l()) {
                ((C40963f) h).getClass();
                for (C40962e eVar : List.CC.m71632c(C40964g.values())) {
                    String obj = eVar.toString();
                    if (xVar.mo43335s(obj, 0, charSequence, i, obj.length())) {
                        return xVar.mo43331o(this.f107375a, (long) ((C40964g) eVar).ordinal(), i, obj.length() + i2);
                    }
                }
            }
            if (xVar.mo43328l()) {
                return i2 ^ -1;
            }
        }
        if (this.f107378d == null) {
            this.f107378d = new C40987l(this.f107375a, 1, 19, C40973F.NORMAL);
        }
        C40999x xVar2 = xVar;
        CharSequence charSequence2 = charSequence;
        return this.f107378d.mo43295d(xVar, charSequence, i2);
    }

    public final String toString() {
        C40974G g = C40974G.FULL;
        TemporalField temporalField = this.f107375a;
        C40974G g2 = this.f107376b;
        if (g2 == g) {
            String valueOf = String.valueOf(temporalField);
            return "Text(" + valueOf + ")";
        }
        String valueOf2 = String.valueOf(temporalField);
        String valueOf3 = String.valueOf(g2);
        return "Text(" + valueOf2 + "," + valueOf3 + ")";
    }
}
