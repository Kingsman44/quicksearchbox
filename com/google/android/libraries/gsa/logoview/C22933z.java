package com.google.android.libraries.gsa.logoview;

import com.google.android.libraries.gsa.logoview.p1882b.C22903a;
import com.google.android.libraries.gsa.logoview.p1882b.C22904b;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.gsa.logoview.z */
/* compiled from: PG */
final class C22933z extends C22897ai {

    /* renamed from: D */
    private final int[] f63111D = {0, 2, 3, 1};

    public C22933z() {
        super("MOLECULE_APPEAR");
    }

    /* renamed from: a */
    public final void mo28241a(C22904b bVar) {
        C22897ai.m42808n(bVar);
        bVar.f63084i.mo28235c(0.0f);
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C22903a aVar = (C22903a) it.next();
            aVar.f63069e.mo28235c(C22897ai.f63024a[bVar.mo28264b(aVar)] + 10.0f);
        }
        bVar.mo28266d();
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
        float f = ((float) (j2 - j)) / 300.0f;
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C22903a aVar = (C22903a) it.next();
            int b = bVar.mo28264b(aVar);
            float f2 = f - (((float) this.f63111D[b]) * 0.01f);
            if (f2 > 0.0f && f2 < 0.5f) {
                aVar.f63069e.mo28235c(C22897ai.f63024a[b] - 0.125f);
            } else if (f2 > 0.5f && f2 < 1.0f) {
                aVar.f63069e.mo28235c(C22897ai.f63024a[b]);
            }
        }
        bVar.f63084i.mo28235c(f);
        return f < 1.0f;
    }
}
