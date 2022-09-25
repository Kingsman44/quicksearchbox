package com.google.android.libraries.gsa.logoview;

import com.google.android.libraries.gsa.logoview.p1882b.C22903a;
import com.google.android.libraries.gsa.logoview.p1882b.C22904b;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.gsa.logoview.n */
/* compiled from: PG */
final class C22921n extends C22897ai {
    public C22921n() {
        super("GOOGLE LOGO EXIT");
    }

    /* renamed from: a */
    public final void mo28241a(C22904b bVar) {
        bVar.mo28267e(true);
    }

    /* renamed from: b */
    public final void mo28242b(C22904b bVar) {
        bVar.f63081f.f63071g.mo28235c(0.0f);
        bVar.f63082g.f63071g.mo28235c(0.0f);
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C22903a aVar = (C22903a) it.next();
            aVar.f63072h.mo28235c(0.0f);
            aVar.f63068d.mo28235c(0.0f);
        }
        bVar.mo28267e(false);
    }

    /* renamed from: c */
    public final boolean mo28243c(long j, long j2, C22904b bVar) {
        float f = ((float) (j2 - j)) / 500.0f;
        C22903a aVar = bVar.f63081f;
        C22903a aVar2 = bVar.f63082g;
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C22903a aVar3 = (C22903a) it.next();
            if (f - (((float) bVar.mo28264b(aVar3)) * 0.15f) > 0.0f) {
                aVar3.f63072h.mo28235c(0.0f);
                aVar3.f63068d.mo28235c(0.0f);
                if (aVar3 == aVar || aVar3 == aVar2) {
                    aVar3.f63071g.mo28235c(0.0f);
                }
                m42801g(bVar, aVar3, j2);
            }
        }
        return aVar.mo28262h() || aVar2.mo28262h();
    }
}
