package com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1411a.p1412a;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import p5488io.grpc.p5533i.C70869h;

/* renamed from: com.google.android.libraries.assistant.c.g.g.a.a.a.h */
/* compiled from: PG */
public final /* synthetic */ class C17390h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17393k f50272a;

    /* renamed from: b */
    public final /* synthetic */ String f50273b;

    public /* synthetic */ C17390h(C17393k kVar, String str) {
        this.f50272a = kVar;
        this.f50273b = str;
    }

    public final void run() {
        C17393k kVar = this.f50272a;
        String str = this.f50273b;
        if (!kVar.f50281d) {
            kVar.f50281d = true;
            kVar.f50280c = false;
            C58976aa aaVar = C58975e.f156826a;
            C17398p pVar = kVar.f50278a;
            C17394l lVar = new C17394l(pVar);
            C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(lVar), pVar.f50289a), "#cancel processing failed.", new Object[0]);
            ((C70869h) kVar.f50279b).f189042b.mo27480d(str, (Throwable) null);
        }
    }
}
