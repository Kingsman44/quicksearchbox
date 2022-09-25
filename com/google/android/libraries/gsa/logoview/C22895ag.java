package com.google.android.libraries.gsa.logoview;

import com.google.android.libraries.gsa.logoview.p1882b.C22903a;
import com.google.android.libraries.gsa.logoview.p1882b.C22904b;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.gsa.logoview.ag */
/* compiled from: PG */
final class C22895ag extends C22897ai {
    public C22895ag() {
        super("GOT IT");
    }

    /* renamed from: a */
    public final void mo28241a(C22904b bVar) {
        C22897ai.m42806l(bVar);
    }

    /* renamed from: b */
    public final void mo28242b(C22904b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            ((C22903a) it.next()).f63069e.mo28235c(0.0f);
        }
    }

    /* renamed from: c */
    public final boolean mo28243c(long j, long j2, C22904b bVar) {
        float f = ((float) (j2 - j)) / 1000.0f;
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C22903a aVar = (C22903a) it.next();
            float b = f - (((float) bVar.mo28264b(aVar)) * 0.05f);
            if (b < 0.0f) {
                m42801g(bVar, aVar, j2);
            } else if (b < 0.15f) {
                aVar.f63069e.mo28235c(-8.0f);
            } else if (b < 0.3f) {
                aVar.f63069e.mo28235c(8.0f);
            } else {
                m42801g(bVar, aVar, j2);
            }
        }
        return f < 1.0f;
    }
}
