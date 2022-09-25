package com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.webfeature;

import com.google.android.libraries.web.p3353c.C43376u;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63033ey;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.webfeature.c */
/* compiled from: PG */
public final class C135941c implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C43376u f370241a;

    /* renamed from: b */
    final /* synthetic */ C135944f f370242b;

    public C135941c(C135944f fVar, C43376u uVar) {
        this.f370242b = fVar;
        this.f370241a = uVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C135944f.f370245a.mo56224b()).mo56382g(th)).mo56372aa(40636)).mo56386p("Unable to check SWAA permission.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            C135944f fVar = this.f370242b;
            String str = this.f370241a.f113329b;
            C60870cx e = fVar.f370247c.mo50345e(C63033ey.m95859a(str));
            C135943e eVar = new C135943e(fVar, str);
            C60856cj.m92911t(e, C47810es.m84974n(eVar), fVar.f370248d);
        }
    }
}
