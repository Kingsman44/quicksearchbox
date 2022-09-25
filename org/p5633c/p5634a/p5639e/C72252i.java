package org.p5633c.p5634a.p5639e;

import java.util.Locale;
import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72151ai;
import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72288l;

/* renamed from: org.c.a.e.i */
/* compiled from: PG */
class C72252i extends C72251h {

    /* renamed from: d */
    protected final int f192249d;

    protected C72252i(C72283g gVar, int i, boolean z, int i2) {
        super(gVar, i, z);
        this.f192249d = i2;
    }

    /* renamed from: b */
    public final int mo63605b() {
        return this.f192247b;
    }

    /* renamed from: d */
    public final void mo63607d(StringBuffer stringBuffer, C72151ai aiVar, Locale locale) {
        if (aiVar.mo63397i(this.f192246a)) {
            try {
                C72266w.m106676d(stringBuffer, aiVar.mo63392b(this.f192246a), this.f192249d);
            } catch (RuntimeException unused) {
                C72260q.m106634c(stringBuffer, this.f192249d);
            }
        } else {
            C72260q.m106634c(stringBuffer, this.f192249d);
        }
    }

    /* renamed from: e */
    public final void mo63608e(StringBuffer stringBuffer, long j, C72132a aVar, int i, C72288l lVar, Locale locale) {
        try {
            C72266w.m106676d(stringBuffer, this.f192246a.mo63646a(aVar).mo63444a(j), this.f192249d);
        } catch (RuntimeException unused) {
            C72260q.m106634c(stringBuffer, this.f192249d);
        }
    }
}
