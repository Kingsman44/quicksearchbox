package com.google.android.libraries.gsa.logoview;

import com.google.android.libraries.gsa.logoview.p1882b.C22903a;
import com.google.android.libraries.gsa.logoview.p1882b.C22904b;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.gsa.logoview.o */
/* compiled from: PG */
final class C22922o extends C22897ai {
    public C22922o() {
        super("MIC ENTER");
    }

    /* renamed from: a */
    public final void mo28241a(C22904b bVar) {
    }

    /* renamed from: b */
    public final void mo28242b(C22904b bVar) {
        C22897ai.m42804j(bVar);
    }

    /* renamed from: c */
    public final boolean mo28243c(long j, long j2, C22904b bVar) {
        if (C22897ai.m42809o(bVar)) {
            float f = ((float) (j2 - j)) / 300.0f;
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                C22903a aVar = (C22903a) it.next();
                if (f - (((float) bVar.mo28264b(aVar)) * 0.15f) < 0.0f) {
                    m42801g(bVar, aVar, j2);
                } else {
                    aVar.f63069e.mo28235c(-6.0f);
                }
            }
            if (((double) bVar.f63077b.f63069e.f63013c) < -5.666999816894531d) {
                C22897ai.m42807m(bVar);
            }
            Iterator it2 = bVar.iterator();
            while (it2.hasNext()) {
                if (!((C22903a) it2.next()).mo28261g()) {
                    return true;
                }
            }
            return false;
        }
        m42802h(bVar, j2);
        return true;
    }
}
