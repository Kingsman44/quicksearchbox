package com.google.android.apps.gsa.plugins.nativeresults.canvas.p6472a;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.a.b */
/* compiled from: PG */
public final /* synthetic */ class C84061b implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f228956a;

    public /* synthetic */ C84061b(SettableFuture settableFuture) {
        this.f228956a = settableFuture;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        SettableFuture settableFuture = this.f228956a;
        Exception exc = (Exception) obj;
        C59104x c = C84063d.f228958a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "CardFactoryEntryPointM");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(7026)).mo56386p("Failed to obtain canvas worker binder");
        settableFuture.mo57357o(exc);
    }
}
