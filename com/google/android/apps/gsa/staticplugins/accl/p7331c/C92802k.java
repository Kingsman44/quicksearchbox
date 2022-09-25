package com.google.android.apps.gsa.staticplugins.accl.p7331c;

import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.p6816p.C86254i;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.c.k */
/* compiled from: PG */
final class C92802k implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C92804m f258969a;

    public C92802k(C92804m mVar) {
        this.f258969a = mVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C92804m.f258971a.mo56225c()).mo56382g(th)).mo56372aa(13041)).mo56386p("#onNewConversationDeltaResponse SearchResult failed");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C92804m mVar = this.f258969a;
            C86232bo boVar = (C86232bo) axVar.mo56107c();
            if (boVar instanceof C86254i) {
                C86254i iVar = (C86254i) boVar;
                mVar.f258975e.mo28211k(iVar.mo79949a(), "New assistant response received", new C92803l(mVar));
                mVar.f258974d.mo78631p(iVar.mo79950b());
            }
        }
    }
}
