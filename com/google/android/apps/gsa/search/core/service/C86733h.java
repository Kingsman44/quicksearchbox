package com.google.android.apps.gsa.search.core.service;

import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.service.h */
/* compiled from: PG */
final class C86733h extends C86625au {

    /* renamed from: a */
    final /* synthetic */ ClientEventData f234290a;

    /* renamed from: b */
    final /* synthetic */ C86775r f234291b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86733h(C86775r rVar, C86775r rVar2, ClientEventData clientEventData) {
        super(rVar2, "commit");
        this.f234291b = rVar;
        this.f234290a = clientEventData;
    }

    /* renamed from: a */
    public final void mo80234a() {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f234291b.f234393o) {
            C86775r rVar = this.f234291b;
            if (rVar.f234387i) {
                this.f234014d.mo80224e(rVar.f234381c, this.f234290a);
                return;
            }
            rVar.f234398t = this.f234290a;
            rVar.f234400v = null;
            rVar.f234399u = false;
            rVar.f234382d.mo80255u(rVar);
        }
    }
}
