package com.google.android.libraries.gsa.logoview;

import com.google.android.libraries.gsa.logoview.p1882b.C22903a;
import com.google.android.libraries.gsa.logoview.p1882b.C22904b;
import java.util.Iterator;
import java.util.Random;

/* renamed from: com.google.android.libraries.gsa.logoview.af */
/* compiled from: PG */
final class C22894af extends C22897ai {
    public C22894af() {
        super("LISTENING_RANDOM_LINES");
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
        if (j2 % 5 != 0) {
            return true;
        }
        Random random = new Random();
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C22903a aVar = (C22903a) it.next();
            float nextFloat = random.nextFloat();
            int b = bVar.mo28264b(aVar);
            aVar.f63070f.mo28235c(nextFloat * (b != 0 ? b != 1 ? b != 2 ? b != 3 ? 0.0f : 8.0f : 10.0f : 7.0f : 9.0f));
        }
        return true;
    }
}
