package com.google.android.libraries.gsa.logoview;

import com.google.android.libraries.gsa.logoview.p1882b.C22903a;
import com.google.android.libraries.gsa.logoview.p1882b.C22904b;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.gsa.logoview.p */
/* compiled from: PG */
final class C22923p extends C22897ai {
    public C22923p() {
        super("MIC_EXIT");
    }

    /* renamed from: a */
    public final void mo28241a(C22904b bVar) {
    }

    /* renamed from: b */
    public final void mo28242b(C22904b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C22903a aVar = (C22903a) it.next();
            aVar.f63073i.mo28235c(0.0f);
            aVar.f63068d.mo28235c(0.0f);
            aVar.f63069e.mo28235c(0.0f);
        }
    }

    /* renamed from: c */
    public final boolean mo28243c(long j, long j2, C22904b bVar) {
        bVar.f63078c.f63073i.mo28235c(0.0f);
        bVar.f63079d.f63073i.mo28235c(0.0f);
        bVar.f63080e.f63073i.mo28235c(0.0f);
        if (bVar.f63078c.f63073i.f63013c < 0.5f) {
            bVar.f63077b.f63073i.mo28235c(0.0f);
            bVar.f63078c.f63068d.mo28235c(0.0f);
            bVar.f63079d.f63068d.mo28235c(0.0f);
        }
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            m42801g(bVar, (C22903a) it.next(), j2);
        }
        Iterator it2 = bVar.iterator();
        while (it2.hasNext()) {
            if (((C22903a) it2.next()).mo28261g()) {
                return true;
            }
        }
        return false;
    }
}
