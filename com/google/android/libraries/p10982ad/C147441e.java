package com.google.android.libraries.p10982ad;

import android.view.animation.AnimationUtils;

/* renamed from: com.google.android.libraries.ad.e */
/* compiled from: PG */
public final class C147441e {

    /* renamed from: a */
    public final C147442f f397990a;

    /* renamed from: b */
    final /* synthetic */ C147443g f397991b;

    public C147441e(C147443g gVar, C147438b bVar) {
        this.f397991b = gVar;
        this.f397990a = new C147442f(bVar);
    }

    /* renamed from: a */
    public final void mo124174a(float f) {
        this.f397990a.f397994c = f;
        this.f397991b.mo124180f(AnimationUtils.currentAnimationTimeMillis(), this.f397990a);
        this.f397991b.mo124178d(false);
    }
}
