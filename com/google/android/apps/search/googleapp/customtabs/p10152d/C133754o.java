package com.google.android.apps.search.googleapp.customtabs.p10152d;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.d.o */
/* compiled from: PG */
final class C133754o implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C133756q f364300a;

    public C133754o(C133756q qVar) {
        this.f364300a = qVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C133756q.f364302a.mo56226d()).mo56382g(th)).mo56372aa(40089)).mo56386p("Unbinding after a failed connection.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C133746g gVar = (C133746g) obj;
        Runnable runnable = this.f364300a.f364309h;
        synchronized (gVar.f364286d) {
            gVar.f364290h.remove(runnable);
        }
        gVar.f364287e.mo111377c();
    }
}
