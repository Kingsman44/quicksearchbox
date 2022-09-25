package com.google.android.apps.gsa.staticplugins.opa.chathead.p8351ui;

import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chathead.ui.r */
/* compiled from: PG */
public final /* synthetic */ class C108174r implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C108185z f300836a;

    public /* synthetic */ C108174r(C108185z zVar) {
        this.f300836a = zVar;
    }

    public final void run() {
        C108185z zVar = this.f300836a;
        zVar.mo96529k();
        if (zVar.f300873j != 2) {
            zVar.mo96527i();
            zVar.f300873j = 2;
            zVar.mo96523e().animate().alpha(0.0f).setDuration(C108185z.f300855a.toMillis()).withEndAction(new C108166j(zVar)).start();
        }
        zVar.mo96532q(false);
        zVar.mo96534s(false);
        zVar.mo96525g().mo96510b();
        zVar.mo96526h().mo96511a();
        zVar.mo96522d().setVisibility(8);
    }
}
