package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9360b;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.C124294b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3741aa.C48175j;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.h.b.o */
/* compiled from: PG */
public final /* synthetic */ class C124309o implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124315u f343153a;

    /* renamed from: b */
    public final /* synthetic */ C48175j f343154b;

    public /* synthetic */ C124309o(C124315u uVar, C48175j jVar) {
        this.f343153a = uVar;
        this.f343154b = jVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C124315u uVar = this.f343153a;
        C48175j jVar = this.f343154b;
        if (!uVar.f343172i.get()) {
            ((C59052c) ((C59052c) C124315u.f343164a.mo56226d()).mo56372aa(36154)).mo56386p("Usonia server is already stopped");
            return C60856cj.m92899h(new IllegalStateException("Usonia server is not started"));
        } else if (!((Boolean) uVar.f343169f.mo17428b()).booleanValue()) {
            C124294b bVar = uVar.f343174k;
            if (bVar == null) {
                return C60856cj.m92899h(new IllegalStateException("Usonia gms is never initialized, this should never happen."));
            }
            return bVar.mo106364e(jVar);
        } else {
            C60870cx g = uVar.mo106372g();
            C124300f fVar = new C124300f(jVar);
            return C60922j.m93044g(g, C47810es.m84963c(fVar), uVar.f343168e);
        }
    }
}
