package com.google.android.libraries.p579ar.faceviewer.utils;

import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.ar.faceviewer.utils.d */
/* compiled from: PG */
final class C10671d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C60870cx f35596a;

    /* renamed from: b */
    final /* synthetic */ C10673f f35597b;

    public C10671d(C10673f fVar, C60870cx cxVar) {
        this.f35597b = fVar;
        this.f35596a = cxVar;
    }

    /* renamed from: c */
    private final void m25669c() {
        synchronized (this.f35597b) {
            this.f35597b.f35598a.remove(this.f35596a);
        }
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        m25669c();
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        m25669c();
    }
}
