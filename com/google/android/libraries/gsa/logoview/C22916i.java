package com.google.android.libraries.gsa.logoview;

import com.google.android.libraries.gsa.logoview.p1882b.C22903a;
import com.google.android.libraries.gsa.logoview.p1882b.C22904b;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.gsa.logoview.i */
/* compiled from: PG */
final class C22916i extends C22897ai {
    public C22916i() {
        super("REPLY");
    }

    /* renamed from: a */
    public final void mo28241a(C22904b bVar) {
        C22897ai.m42811q(bVar);
    }

    /* renamed from: b */
    public final void mo28242b(C22904b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            ((C22903a) it.next()).mo28258d(false);
        }
        C22897ai.m42811q(bVar);
    }

    /* renamed from: c */
    public final boolean mo28243c(long j, long j2, C22904b bVar) {
        if (j2 - j > 300) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((C22903a) it.next()).mo28258d(true);
            }
        }
        Iterator it2 = bVar.iterator();
        while (it2.hasNext()) {
            C22903a aVar = (C22903a) it2.next();
            aVar.f63065a.mo28235c((aVar.f63075k * 4.0f) + 4.0f);
        }
        return true;
    }
}
