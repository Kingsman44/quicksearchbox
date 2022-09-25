package com.google.android.apps.gsa.staticplugins.p7686co.p7693g;

import com.google.android.libraries.gcoreclient.p1809y.C21739a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.g.c */
/* compiled from: PG */
final class C98315c implements C21739a {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f274445a;

    public C98315c(SettableFuture settableFuture) {
        this.f274445a = settableFuture;
    }

    /* renamed from: a */
    public final void mo27014a(Exception exc) {
        C59104x c = C98316d.f274446a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "LinkSharing");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(30607)).mo56386p("FDL shortlink onFailureListener onFailure");
        this.f274445a.mo57357o(exc);
    }
}
