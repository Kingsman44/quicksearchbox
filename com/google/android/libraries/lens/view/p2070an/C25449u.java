package com.google.android.libraries.lens.view.p2070an;

import com.google.android.libraries.lens.p2014e.C24201ad;
import com.google.android.libraries.lens.p2014e.C24203af;
import com.google.android.libraries.lens.view.p2081au.C25557g;
import com.google.android.libraries.lens.view.p2081au.C25560j;
import com.google.android.libraries.lens.view.p2081au.C25574x;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.lens.view.an.u */
/* compiled from: PG */
final class C25449u implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C25453y f69332a;

    public C25449u(C25453y yVar) {
        this.f69332a = yVar;
    }

    /* renamed from: c */
    private final boolean m46875c() {
        return this.f69332a.f69349k == this;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C25453y yVar = this.f69332a;
        if (!yVar.f69351m && m46875c()) {
            yVar.f69349k = null;
            yVar.mo30491g(true);
            this.f69332a.f69344f.mo30598g(new C25557g(1, th));
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C25560j jVar = (C25560j) obj;
        C25453y yVar = this.f69332a;
        if (!yVar.f69351m && m46875c()) {
            yVar.f69349k = null;
            jVar.getClass();
            if (yVar.f69350l || ((Boolean) jVar.mo30616c().mo56106b(C25445q.f69327a).mo56109e(false)).booleanValue()) {
                yVar.mo30492h();
            } else {
                yVar.mo30488d(C24201ad.m45035f(C24203af.m45046b(), yVar.mo30487a(jVar, ((C58833ax) yVar.f69343e.mo30606b().mo30656d()).mo56113h()), C25453y.m46884b(jVar), jVar.mo30614a()), jVar, (C25574x) null);
            }
        }
    }
}
