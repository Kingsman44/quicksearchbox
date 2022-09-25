package org.p5633c.p5634a.p5639e;

import java.util.Locale;
import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72151ai;
import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72288l;

/* renamed from: org.c.a.e.p */
/* compiled from: PG */
final class C72259p extends C72251h {
    public C72259p(C72283g gVar, int i, boolean z) {
        super(gVar, i, z);
    }

    /* renamed from: b */
    public final int mo63605b() {
        return this.f192247b;
    }

    /* renamed from: d */
    public final void mo63607d(StringBuffer stringBuffer, C72151ai aiVar, Locale locale) {
        if (aiVar.mo63397i(this.f192246a)) {
            try {
                C72266w.m106677e(stringBuffer, aiVar.mo63392b(this.f192246a));
            } catch (RuntimeException unused) {
                stringBuffer.append(65533);
            }
        } else {
            stringBuffer.append(65533);
        }
    }

    /* renamed from: e */
    public final void mo63608e(StringBuffer stringBuffer, long j, C72132a aVar, int i, C72288l lVar, Locale locale) {
        try {
            C72266w.m106677e(stringBuffer, this.f192246a.mo63646a(aVar).mo63444a(j));
        } catch (RuntimeException unused) {
            stringBuffer.append(65533);
        }
    }
}
