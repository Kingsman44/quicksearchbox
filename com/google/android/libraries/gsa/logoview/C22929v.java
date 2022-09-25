package com.google.android.libraries.gsa.logoview;

import com.google.android.libraries.gsa.logoview.p1882b.C22903a;
import com.google.android.libraries.gsa.logoview.p1882b.C22904b;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.gsa.logoview.v */
/* compiled from: PG */
final class C22929v extends C22897ai {
    public C22929v() {
        super("MOLECULE_WAVY");
    }

    /* renamed from: a */
    public final void mo28241a(C22904b bVar) {
        C22897ai.m42808n(bVar);
    }

    /* renamed from: b */
    public final void mo28242b(C22904b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C22903a aVar = (C22903a) it.next();
            aVar.f63069e.mo28235c(C22897ai.f63024a[bVar.mo28264b(aVar)]);
        }
    }

    /* renamed from: c */
    public final boolean mo28243c(long j, long j2, C22904b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C22903a aVar = (C22903a) it.next();
            int b = bVar.mo28264b(aVar);
            float e = C22897ai.m42799e(j2, b);
            C22897ai.m42803i(aVar, b, e);
            if (aVar == bVar.f63077b) {
                double d = (double) e;
                Double.isNaN(d);
                if (d % 0.5d < 0.25d) {
                    aVar.f63067c.mo28235c(14.0f);
                } else {
                    aVar.f63067c.mo28235c(12.0f);
                }
            }
        }
        return true;
    }
}
