package com.google.android.apps.gsa.search.core.service;

import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.service.g */
/* compiled from: PG */
final class C86698g extends C86625au {

    /* renamed from: a */
    final /* synthetic */ Query f234191a;

    /* renamed from: b */
    final /* synthetic */ ClientEventData f234192b;

    /* renamed from: c */
    final /* synthetic */ C86775r f234193c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86698g(C86775r rVar, C86775r rVar2, Query query, ClientEventData clientEventData) {
        super(rVar2, "set");
        this.f234193c = rVar;
        this.f234191a = query;
        this.f234192b = clientEventData;
    }

    /* renamed from: a */
    public final void mo80234a() {
        C58976aa aaVar = C58975e.f156826a;
        C86775r rVar = this.f234193c;
        if (rVar.f234387i) {
            this.f234014d.mo80224e(rVar.f234381c, this.f234192b);
            return;
        }
        rVar.f234400v = this.f234191a;
        if (!rVar.f234399u) {
            rVar.f234398t = null;
        }
    }
}
