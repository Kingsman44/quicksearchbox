package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9360b;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.C124294b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.h.b.n */
/* compiled from: PG */
public final /* synthetic */ class C124308n implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124315u f343152a;

    public /* synthetic */ C124308n(C124315u uVar) {
        this.f343152a = uVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C124315u uVar = this.f343152a;
        if (uVar.f343172i.get()) {
            ((C59052c) ((C59052c) C124315u.f343164a.mo56226d()).mo56372aa(36152)).mo56386p("Usonia server is already started");
            return C60866ct.f164955a;
        } else if (!((Boolean) uVar.f343169f.mo17428b()).booleanValue()) {
            uVar.f343174k = (C124294b) uVar.f343165b.mo17428b();
            C60870cx c = uVar.f343174k.mo106362c();
            C124305k kVar = new C124305k(uVar);
            return C60922j.m93044g(c, C47810es.m84963c(kVar), uVar.f343166c);
        } else {
            C60870cx g = uVar.mo106372g();
            C60870cx a = uVar.f343176m.mo106326a();
            return C47636i.m84746e(g, a).mo51518a(new C124306l(uVar, g, a), uVar.f343168e);
        }
    }
}
