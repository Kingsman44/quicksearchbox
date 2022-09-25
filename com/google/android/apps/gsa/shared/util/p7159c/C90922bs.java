package com.google.android.apps.gsa.shared.util.p7159c;

import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.shared.util.c.bs */
/* compiled from: PG */
public final /* synthetic */ class C90922bs implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C90923bt f254109a;

    public /* synthetic */ C90922bs(C90923bt btVar) {
        this.f254109a = btVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C90923bt btVar = this.f254109a;
        Exception exc = (Exception) obj;
        ((C59052c) ((C59052c) ((C59052c) C90923bt.f254110a.mo56224b()).mo56382g(exc)).mo56372aa(11370)).mo56389s("[%s] attempt failed. Potentially retrying...", btVar.f254111b);
        synchronized (btVar.f254114e) {
            int i = btVar.f254115f + 1;
            btVar.f254115f = i;
            if (btVar.f254112c.mo56912b(i)) {
                btVar.mo85233e(btVar.f254112c.mo56909a(btVar.f254115f));
            } else {
                btVar.mo57357o(exc);
            }
        }
    }
}
