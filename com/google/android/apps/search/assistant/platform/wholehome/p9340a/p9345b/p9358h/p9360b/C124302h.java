package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9360b;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.C124294b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.h.b.h */
/* compiled from: PG */
public final /* synthetic */ class C124302h implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124315u f343138a;

    public /* synthetic */ C124302h(C124315u uVar) {
        this.f343138a = uVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C124315u uVar = this.f343138a;
        if (!uVar.f343172i.get()) {
            ((C59052c) ((C59052c) C124315u.f343164a.mo56226d()).mo56372aa(36153)).mo56386p("Usonia server is already stopped");
            return C60866ct.f164955a;
        } else if (!((Boolean) uVar.f343169f.mo17428b()).booleanValue()) {
            C124294b bVar = uVar.f343174k;
            if (bVar == null) {
                return C60856cj.m92899h(new IllegalStateException("Usonia gms is never initialized, this should never happen."));
            }
            C60870cx d = bVar.mo106363d();
            C124296b bVar2 = new C124296b(uVar);
            return C60922j.m93044g(d, C47810es.m84963c(bVar2), uVar.f343166c);
        } else {
            C60870cx g = uVar.mo106372g();
            C124297c cVar = new C124297c(uVar);
            return C60922j.m93044g(g, C47810es.m84963c(cVar), uVar.f343168e);
        }
    }
}
