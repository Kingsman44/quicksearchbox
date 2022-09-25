package com.google.android.apps.gsa.search.core.service;

import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.search.core.service.o */
/* compiled from: PG */
final class C86772o extends C86625au {

    /* renamed from: a */
    final /* synthetic */ C86773p f234373a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86772o(C86773p pVar) {
        super(pVar.f234376c, "SessionController#handleGenericClientEvent");
        this.f234373a = pVar;
    }

    /* renamed from: a */
    public final void mo80234a() {
        C58838bb.m90883r(!this.f234373a.f234374a.isEmpty());
        C86775r rVar = this.f234373a.f234376c;
        rVar.mo80388j((ClientEventData) this.f234373a.f234374a.remove(), rVar);
    }
}
