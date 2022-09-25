package com.google.android.libraries.gsa.logoview;

import com.google.android.libraries.gsa.logoview.p1882b.C22903a;
import com.google.android.libraries.gsa.logoview.p1882b.C22904b;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.gsa.logoview.r */
/* compiled from: PG */
final class C22925r extends C22897ai {
    public C22925r() {
        super("MIC ENTER FAST");
    }

    /* renamed from: a */
    public final void mo28241a(C22904b bVar) {
    }

    /* renamed from: b */
    public final void mo28242b(C22904b bVar) {
        C22897ai.m42804j(bVar);
    }

    /* renamed from: c */
    public final boolean mo28243c(long j, long j2, C22904b bVar) {
        if (!C22897ai.m42809o(bVar)) {
            m42802h(bVar, j2);
            return false;
        }
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            ((C22903a) it.next()).f63069e.mo28235c(-6.0f);
        }
        C22897ai.m42807m(bVar);
        Iterator it2 = bVar.iterator();
        while (it2.hasNext()) {
            if (!((C22903a) it2.next()).mo28261g()) {
                return true;
            }
        }
        return false;
    }
}
