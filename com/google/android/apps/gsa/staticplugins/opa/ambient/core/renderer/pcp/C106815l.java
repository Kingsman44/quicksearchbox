package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.pcp;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.pcp.l */
/* compiled from: PG */
final class C106815l implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C106816m f297669a;

    public C106815l(C106816m mVar) {
        this.f297669a = mVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) this.f297669a.f297670a.mo56225c()).mo56382g(th)).mo56372aa(23303)).mo56386p("failed to get pcp request");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C60870cx b = this.f297669a.f297671b.mo90814b(C53306j.AMBIENT_ASSISTANT, (List) obj, false);
        C106814k kVar = new C106814k(this);
        C60856cj.m92911t(b, C47810es.m84974n(kVar), this.f297669a.f297672c);
    }
}
