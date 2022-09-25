package com.google.android.apps.gsa.search.core.service;

import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.service.j */
/* compiled from: PG */
final class C86767j extends C86625au {

    /* renamed from: a */
    final /* synthetic */ ClientEventData f234362a;

    /* renamed from: b */
    final /* synthetic */ C86775r f234363b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86767j(C86775r rVar, C86775r rVar2, ClientEventData clientEventData) {
        super(rVar2, "goBack");
        this.f234363b = rVar;
        this.f234362a = clientEventData;
    }

    /* renamed from: a */
    public final void mo80234a() {
        C58976aa aaVar = C58975e.f156826a;
        C86775r rVar = this.f234363b;
        if (rVar.f234387i) {
            this.f234014d.mo80224e(rVar.f234381c, this.f234362a);
        } else {
            rVar.mo80384f();
        }
    }
}
