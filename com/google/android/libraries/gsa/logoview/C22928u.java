package com.google.android.libraries.gsa.logoview;

import com.google.android.libraries.gsa.logoview.p1882b.C22903a;
import com.google.android.libraries.gsa.logoview.p1882b.C22904b;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.gsa.logoview.u */
/* compiled from: PG */
final class C22928u extends C22897ai {
    public C22928u() {
        super("MOLECULE_EXIT");
    }

    /* renamed from: a */
    public final void mo28241a(C22904b bVar) {
        bVar.f63077b.mo28260f(3.1415927f, 12.0f);
        bVar.f63078c.mo28260f(3.1415927f, 4.0f);
        bVar.f63079d.mo28260f(0.0f, 4.0f);
        bVar.f63080e.mo28260f(0.0f, 12.0f);
        bVar.f63081f.mo28260f(0.0f, 8.0f);
        bVar.f63082g.mo28260f(0.0f, 8.0f);
        C22897ai.m42800f(bVar);
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C22903a aVar = (C22903a) it.next();
            aVar.f63067c.mo28235c(4.0f);
            aVar.f63068d.mo28235c(0.0f);
        }
    }

    /* renamed from: b */
    public final void mo28242b(C22904b bVar) {
        C22897ai.m42805k(bVar);
    }

    /* renamed from: c */
    public final boolean mo28243c(long j, long j2, C22904b bVar) {
        if (j2 - j < 100) {
            bVar.f63077b.f63069e.mo28235c(16.0f);
            bVar.f63078c.f63069e.mo28235c(9.0f);
            bVar.f63079d.f63069e.mo28235c(14.0f);
            bVar.f63080e.f63069e.mo28235c(10.0f);
            return true;
        }
        m42802h(bVar, j2);
        return false;
    }
}
