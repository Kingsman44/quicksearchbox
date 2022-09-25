package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import com.google.android.libraries.gsa.p1876k.C22870f;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.f */
/* compiled from: PG */
public final /* synthetic */ class C78067f implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C78069h f215036a;

    public /* synthetic */ C78067f(C78069h hVar) {
        this.f215036a = hVar;
    }

    public final void run() {
        C78069h hVar = this.f215036a;
        if (hVar.f215042e.isAfter(hVar.f215039b.mo57444a())) {
            hVar.mo73053e(Duration.between(hVar.f215039b.mo57444a(), hVar.f215042e).toMillis());
            return;
        }
        hVar.f215041d = false;
        hVar.mo73051c();
        hVar.f215040c.mo74740a();
    }
}
