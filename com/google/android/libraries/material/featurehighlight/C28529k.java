package com.google.android.libraries.material.featurehighlight;

import com.google.android.libraries.p1623at.p1632e.C19555c;

/* renamed from: com.google.android.libraries.material.featurehighlight.k */
/* compiled from: PG */
final class C28529k extends C28511ab {

    /* renamed from: a */
    final /* synthetic */ C28530l f77507a;

    public C28529k(C28530l lVar) {
        this.f77507a = lVar;
    }

    /* renamed from: a */
    public final void mo33994a() {
        C28530l lVar = this.f77507a;
        if (lVar.f77534c) {
            String str = lVar.f77533b;
            if (C19555c.m37297b(str, str) && lVar.f77539h == 1 && lVar.f77538g != null) {
                lVar.mo34075b();
                lVar.mo34078e();
                lVar.f77538g.mo34004e(new C28527i(lVar));
            }
        }
    }

    /* renamed from: b */
    public final void mo33996b() {
        C28530l lVar = this.f77507a;
        long j = lVar.f77535d;
        if (j > 0) {
            lVar.f77538g.postDelayed(lVar.f77540i, j);
        }
    }

    /* renamed from: c */
    public final void mo33997c() {
        C28530l lVar = this.f77507a;
        if (lVar.f77535d > 0) {
            lVar.f77538g.removeCallbacks(lVar.f77540i);
        }
    }

    /* renamed from: d */
    public final void mo33995d() {
        this.f77507a.mo34079f();
    }
}
