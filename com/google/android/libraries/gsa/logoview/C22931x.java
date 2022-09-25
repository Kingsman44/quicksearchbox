package com.google.android.libraries.gsa.logoview;

import com.google.android.libraries.gsa.logoview.p1882b.C22903a;
import com.google.android.libraries.gsa.logoview.p1882b.C22904b;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.gsa.logoview.x */
/* compiled from: PG */
final class C22931x extends C22897ai {

    /* renamed from: D */
    private final int[] f63110D = {0, 2, 3, 1};

    public C22931x() {
        super("MOLECULE_DISAPPEAR");
    }

    /* renamed from: a */
    public final void mo28241a(C22904b bVar) {
        C22897ai.m42808n(bVar);
    }

    /* renamed from: b */
    public final void mo28242b(C22904b bVar) {
        bVar.f63084i.mo28235c(0.0f);
    }

    /* renamed from: c */
    public final boolean mo28243c(long j, long j2, C22904b bVar) {
        float f = ((float) (j2 - j)) / 300.0f;
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C22903a aVar = (C22903a) it.next();
            int b = bVar.mo28264b(aVar);
            float f2 = f - (((float) this.f63110D[b]) * 0.01f);
            if (f2 > 0.0f && f2 < 0.5f) {
                aVar.f63069e.mo28235c(C22897ai.f63024a[b] - 0.1796875f);
            } else if (f2 > 0.5f && f2 < 1.0f) {
                aVar.f63069e.mo28235c(C22897ai.f63024a[b] + 10.0f);
            }
        }
        if (f > 0.8f) {
            bVar.f63084i.mo28235c(0.0f);
        }
        return f < 1.0f;
    }
}
