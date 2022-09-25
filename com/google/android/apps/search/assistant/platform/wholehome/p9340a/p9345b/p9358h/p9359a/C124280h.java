package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9359a;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.h.a.h */
/* compiled from: PG */
public final /* synthetic */ class C124280h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C124293u f343104a;

    /* renamed from: b */
    public final /* synthetic */ C124292t f343105b;

    public /* synthetic */ C124280h(C124293u uVar, C124292t tVar) {
        this.f343104a = uVar;
        this.f343105b = tVar;
    }

    public final void run() {
        C124293u uVar = this.f343104a;
        C124292t tVar = this.f343105b;
        C60870cx cxVar = uVar.f343125d;
        C124274b bVar = new C124274b(tVar);
        C46459k.m82829b(C60922j.m93045h(cxVar, C47810es.m84966f(bVar), uVar.f343126e), "Failed to remove service observer", new Object[0]);
    }
}
