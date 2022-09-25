package com.google.android.apps.search.googleapp.customtabs.features.appactions;

import com.google.android.libraries.appactions.serviceengine.api.C147869b;
import com.google.android.libraries.appactions.serviceengine.api.C147876i;
import com.google.android.libraries.appactions.serviceengine.api.C147877j;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3944g.p3948b.p3949a.C52935af;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.appactions.n */
/* compiled from: PG */
public final /* synthetic */ class C133795n implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C133798q f364430a;

    /* renamed from: b */
    public final /* synthetic */ String f364431b;

    public /* synthetic */ C133795n(C133798q qVar, String str) {
        this.f364430a = qVar;
        this.f364431b = str;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C133798q qVar = this.f364430a;
        String str = this.f364431b;
        C133806y yVar = qVar.f364438f;
        C147876i e = C147877j.m241016e();
        C147869b bVar = (C147869b) e;
        bVar.f398897a = Optional.m71637of(C52935af.SURFACE_TYPE_AGA_CCT);
        bVar.f398898b = Optional.m71637of("com.instacart.client");
        return C47633f.m84733g(yVar.f364452b.mo124561c(e.mo124563c())).mo51516i(new C133791j(qVar, str), qVar.f364436d).mo51516i(new C133792k(qVar), qVar.f364436d);
    }
}
