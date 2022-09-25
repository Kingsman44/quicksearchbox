package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.view.View;
import com.google.android.apps.gsa.search.core.p6513aj.C84533ar;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.lk */
/* compiled from: PG */
public final /* synthetic */ class C96377lk implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C96381lo f269633a;

    public /* synthetic */ C96377lk(C96381lo loVar) {
        this.f269633a = loVar;
    }

    public final void onClick(View view) {
        C96381lo loVar = this.f269633a;
        boolean z = loVar.f269641e.mo83560o() || loVar.f269641e.mo83554i();
        C84533ar a = loVar.f269640d.mo78243a().mo78241a();
        if (z) {
            a.mo78237c("key_send_diagnostics", true);
        } else {
            a.mo78240f("key_send_diagnostics");
        }
        a.mo78236b();
        loVar.mo77318iT().mo77312a();
    }
}
