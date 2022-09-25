package com.google.android.libraries.gsa.logoview;

import com.google.android.libraries.gsa.logoview.p1882b.C22903a;
import com.google.android.libraries.gsa.logoview.p1882b.C22904b;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.gsa.logoview.l */
/* compiled from: PG */
final class C22919l extends C22897ai {
    public C22919l() {
        super("GOOGLE LOGO ENTER");
    }

    /* renamed from: a */
    public final void mo28241a(C22904b bVar) {
        C22897ai.m42806l(bVar);
        bVar.mo28267e(true);
    }

    /* renamed from: b */
    public final void mo28242b(C22904b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C22903a aVar = (C22903a) it.next();
            aVar.f63072h.mo28235c(1.0f);
            aVar.f63071g.mo28235c(1.0f);
            aVar.f63068d.mo28235c(bVar.mo28263a(aVar));
            aVar.f63069e.mo28235c(0.0f);
        }
    }

    /* renamed from: c */
    public final boolean mo28243c(long j, long j2, C22904b bVar) {
        if (C22897ai.m42809o(bVar)) {
            float f = ((float) (j2 - j)) / 300.0f;
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                C22903a aVar = (C22903a) it.next();
                if (f - (((float) bVar.mo28264b(aVar)) * 0.15f) > 0.0f) {
                    aVar.f63072h.mo28235c(1.0f);
                    aVar.f63071g.mo28235c(1.0f);
                    aVar.f63068d.mo28235c(bVar.mo28263a(aVar));
                    aVar.f63069e.mo28235c(0.0f);
                } else {
                    m42801g(bVar, aVar, j2);
                }
            }
            if (f < 1.0f) {
                return true;
            }
            return false;
        }
        m42802h(bVar, j2);
        return true;
    }
}
