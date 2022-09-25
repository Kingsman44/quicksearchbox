package com.google.android.libraries.web.weblayer.p3468g.p3469a;

import org.chromium.weblayer.C72582ar;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.web.weblayer.g.a.b */
/* compiled from: PG */
final class C44274b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C44280h f115136a;

    /* renamed from: b */
    final /* synthetic */ C72582ar f115137b;

    public C44274b(C44280h hVar, C72582ar arVar) {
        this.f115136a = hVar;
        this.f115137b = arVar;
    }

    public final void run() {
        if (!this.f115136a.f115144a.mo64478i()) {
            Map.EL.computeIfPresent(this.f115136a.f115149f, this.f115137b, new C44269a(this.f115136a));
        }
    }
}
