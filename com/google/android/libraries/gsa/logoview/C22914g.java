package com.google.android.libraries.gsa.logoview;

import com.google.android.libraries.gsa.logoview.p1882b.C22903a;
import com.google.android.libraries.gsa.logoview.p1882b.C22904b;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.gsa.logoview.g */
/* compiled from: PG */
final class C22914g extends C22897ai {
    public C22914g() {
        super("DIDN'T GET IT");
    }

    /* renamed from: a */
    public final void mo28241a(C22904b bVar) {
        C22897ai.m42806l(bVar);
    }

    /* renamed from: b */
    public final void mo28242b(C22904b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            ((C22903a) it.next()).f63068d.mo28235c(0.0f);
        }
    }

    /* renamed from: c */
    public final boolean mo28243c(long j, long j2, C22904b bVar) {
        float f = ((float) (j2 - j)) / 550.0f;
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C22903a aVar = (C22903a) it.next();
            aVar.f63068d.mo28235c((float) (Math.sin((double) ((f - (((float) bVar.mo28264b(aVar)) * 0.030909091f)) * 6.2831855f * 3.0f)) * 6.0d));
            m42801g(bVar, aVar, j2);
        }
        return f < 1.0f;
    }
}
