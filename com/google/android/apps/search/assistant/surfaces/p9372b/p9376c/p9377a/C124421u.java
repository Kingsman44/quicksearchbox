package com.google.android.apps.search.assistant.surfaces.p9372b.p9376c.p9377a;

import com.google.android.libraries.search.assistant.p2714o.C34917c;
import com.google.android.libraries.search.assistant.p2828y.p2851l.C36995c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.c.a.u */
/* compiled from: PG */
public final /* synthetic */ class C124421u implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124423w f343395a;

    /* renamed from: b */
    public final /* synthetic */ C36995c f343396b;

    public /* synthetic */ C124421u(C124423w wVar, C36995c cVar) {
        this.f343395a = wVar;
        this.f343396b = cVar;
    }

    public final C60870cx apply(Object obj) {
        C124423w wVar = this.f343395a;
        C36995c cVar = this.f343396b;
        Optional b = ((C34917c) obj).mo39613b();
        Objects.requireNonNull(cVar);
        b.ifPresent(new C124420t(cVar));
        if (wVar.f343402c == null) {
            wVar.f343402c = wVar.f343401b.mo40530a();
        }
        return wVar.f343402c.mo40529a(cVar.mo40523a());
    }
}
