package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9342a;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.C124182b;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124204t;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124210z;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C124173c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C124176f f342916a;

    /* renamed from: b */
    public final /* synthetic */ C124210z f342917b;

    public /* synthetic */ C124173c(C124176f fVar, C124210z zVar) {
        this.f342916a = fVar;
        this.f342917b = zVar;
    }

    public final void run() {
        C124176f fVar = this.f342916a;
        C124210z zVar = this.f342917b;
        C124182b bVar = fVar.f342921a.f342924c;
        if (zVar.f342972a == 5) {
            C124204t tVar = (C124204t) zVar.f342973b;
        } else {
            C124204t tVar2 = C124204t.f342960c;
        }
        C60870cx c = bVar.mo40055c();
        C124175e eVar = new C124175e(fVar);
        C46459k.m82829b(C60922j.m93045h(c, C47810es.m84966f(eVar), fVar.f342921a.f342926e), "Failed to handle remote execution", new Object[0]);
    }
}
