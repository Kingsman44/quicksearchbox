package com.google.android.apps.gsa.nga.shared.p6417x;

import com.google.android.apps.gsa.nga.engine.b.f.a.ak;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4522b.C58800sl;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.x.c */
/* compiled from: PG */
public final class C83353c extends C83352b {

    /* renamed from: f */
    private final C83358h f227189f;

    public C83353c(Class cls, C83358h hVar) {
        super(cls, new C58759qy(hVar));
        this.f227189f = hVar;
    }

    /* renamed from: b */
    public final Object mo76654b() {
        C83358h g = ak.g((Optional) ((C83361k) this.f227189f).f227199b.get());
        C58528ij K = C58528ij.m90011K(this.f227189f, g);
        synchronized (this.f227183a) {
            if (!this.f227185c.equals(K)) {
                C58800sl lA = this.f227185c.iterator();
                while (lA.hasNext()) {
                    ((C83358h) lA.next()).mo76659e(this.f227187e);
                }
                C58800sl lA2 = K.iterator();
                while (lA2.hasNext()) {
                    ((C83358h) lA2.next()).mo76658d(this.f227187e);
                }
                this.f227185c = K;
            }
        }
        return g.mo76657c();
    }
}
