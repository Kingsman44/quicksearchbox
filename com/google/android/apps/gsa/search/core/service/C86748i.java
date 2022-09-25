package com.google.android.apps.gsa.search.core.service;

import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.service.i */
/* compiled from: PG */
final class C86748i extends C86625au {

    /* renamed from: a */
    final /* synthetic */ Query f234322a;

    /* renamed from: b */
    final /* synthetic */ ClientEventData f234323b;

    /* renamed from: c */
    final /* synthetic */ C86775r f234324c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86748i(C86775r rVar, C86775r rVar2, Query query, ClientEventData clientEventData) {
        super(rVar2, "startQueryEdit");
        this.f234324c = rVar;
        this.f234322a = query;
        this.f234323b = clientEventData;
    }

    /* renamed from: a */
    public final void mo80234a() {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f234324c.f234393o) {
            C86775r rVar = this.f234324c;
            if (rVar.f234387i) {
                this.f234014d.mo80224e(rVar.f234381c, this.f234323b);
                return;
            }
            rVar.f234399u = true;
            rVar.f234400v = this.f234322a;
        }
    }
}
