package com.google.android.libraries.gsa.logoview;

import com.google.android.libraries.gsa.logoview.p1882b.C22903a;
import com.google.android.libraries.gsa.logoview.p1882b.C22904b;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.gsa.logoview.ae */
/* compiled from: PG */
final class C22893ae extends C22897ai {
    public C22893ae() {
        super("USER_SPEAKS");
    }

    /* renamed from: a */
    public final void mo28241a(C22904b bVar) {
        C22897ai.m42806l(bVar);
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            ((C22903a) it.next()).f63069e.mo28235c(0.0f);
        }
    }

    /* renamed from: b */
    public final void mo28242b(C22904b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            ((C22903a) it.next()).f63070f.mo28235c(0.0f);
        }
    }

    /* renamed from: c */
    public final boolean mo28243c(long j, long j2, C22904b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C22903a aVar = (C22903a) it.next();
            float f = aVar.f63075k;
            int b = bVar.mo28264b(aVar);
            aVar.f63070f.mo28235c(f * (b != 0 ? b != 1 ? b != 2 ? b != 3 ? 0.0f : 8.0f : 10.0f : 7.0f : 9.0f));
        }
        return true;
    }
}
