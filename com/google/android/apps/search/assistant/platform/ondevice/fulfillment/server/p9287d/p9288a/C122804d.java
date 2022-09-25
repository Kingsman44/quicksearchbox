package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.p9288a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.d.a.d */
/* compiled from: PG */
public final /* synthetic */ class C122804d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122805e f340163a;

    /* renamed from: b */
    public final /* synthetic */ C122799ad f340164b;

    public /* synthetic */ C122804d(C122805e eVar, C122799ad adVar) {
        this.f340163a = eVar;
        this.f340164b = adVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx g;
        C122805e eVar = this.f340163a;
        C122799ad adVar = this.f340164b;
        C122811k kVar = (C122811k) obj;
        synchronized (eVar) {
            C122799ad adVar2 = eVar.f340166b;
            if (adVar2 != adVar) {
                eVar.mo105749c(adVar2);
                eVar.f340166b = adVar;
            }
            C60870cx j = C60856cj.m92901j(eVar.f340167c.f340614a);
            C122795a aVar = new C122795a(kVar);
            g = C60922j.m93044g(j, C47810es.m84963c(aVar), C60826bg.f164896a);
        }
        return g;
    }
}
