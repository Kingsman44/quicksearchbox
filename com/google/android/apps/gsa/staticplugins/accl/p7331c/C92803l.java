package com.google.android.apps.gsa.staticplugins.accl.p7331c;

import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.c.l */
/* compiled from: PG */
final class C92803l implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C92804m f258970a;

    public C92803l(C92804m mVar) {
        this.f258970a = mVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C92804m.f258971a.mo56225c()).mo56382g(th)).mo56372aa(13042)).mo56386p("#onNewConversationDeltaResponse assistantResponse future failed");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        this.f258970a.f258974d.mo78641z((C51195j) ((C58833ax) obj).mo56107c(), Query.f252741b);
        this.f258970a.f258974d.mo78609E(new C87684al(C88244um.NEW_ASSISTANT_RESPONSE_RECEIVED).mo81964a());
    }
}
