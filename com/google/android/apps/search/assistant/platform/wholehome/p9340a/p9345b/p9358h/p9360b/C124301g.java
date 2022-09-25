package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9360b;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.C124294b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.h.b.g */
/* compiled from: PG */
public final /* synthetic */ class C124301g implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124315u f343137a;

    public /* synthetic */ C124301g(C124315u uVar) {
        this.f343137a = uVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C124315u uVar = this.f343137a;
        if (!uVar.f343172i.get()) {
            ((C59052c) ((C59052c) C124315u.f343164a.mo56226d()).mo56372aa(36151)).mo56386p("Usonia server is already stopped");
        }
        if (!((Boolean) uVar.f343169f.mo17428b()).booleanValue()) {
            C124294b bVar = uVar.f343174k;
            if (bVar == null) {
                return C60856cj.m92899h(new IllegalStateException("Usonia gms is never initialized, this should never happen."));
            }
            return bVar.mo106361b();
        }
        C60870cx g = uVar.mo106372g();
        C124298d dVar = C124298d.f343133a;
        return C60922j.m93044g(g, C47810es.m84963c(dVar), uVar.f343168e);
    }
}
