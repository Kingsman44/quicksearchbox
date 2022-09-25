package com.google.android.apps.gsa.staticplugins.opa.chatui;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.cx */
/* compiled from: PG */
public final /* synthetic */ class C108280cx implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C108303dt f301233a;

    public /* synthetic */ C108280cx(C108303dt dtVar) {
        this.f301233a = dtVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C108303dt dtVar = this.f301233a;
        Exception exc = (Exception) obj;
        C59104x d = C108303dt.f301260a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "HistoryManager");
        ((C59052c) ((C59052c) d).mo56372aa(23974)).mo56389s("Unable to initialize HistoryStore: %s", exc.getLocalizedMessage());
        dtVar.f301286q.mo57357o(exc);
    }
}
