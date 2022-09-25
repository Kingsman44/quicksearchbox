package com.bumptech.glide;

import com.bumptech.glide.manager.C5971c;
import com.bumptech.glide.manager.C5988t;
import com.bumptech.glide.p287f.C5588e;
import com.bumptech.glide.p291h.C5632s;

/* renamed from: com.bumptech.glide.ac */
/* compiled from: PG */
final class C5513ac implements C5971c {

    /* renamed from: a */
    final /* synthetic */ C5514ad f16685a;

    /* renamed from: b */
    private final C5988t f16686b;

    public C5513ac(C5514ad adVar, C5988t tVar) {
        this.f16685a = adVar;
        this.f16686b = tVar;
    }

    /* renamed from: a */
    public final void mo11862a(boolean z) {
        if (z) {
            synchronized (this.f16685a) {
                C5988t tVar = this.f16686b;
                for (C5588e eVar : C5632s.m14614g(tVar.f17658a)) {
                    if (!eVar.mo12024l() && !eVar.mo12023k()) {
                        eVar.mo12015c();
                        if (!tVar.f17660c) {
                            eVar.mo12014b();
                        } else {
                            tVar.f17659b.add(eVar);
                        }
                    }
                }
            }
        }
    }
}
