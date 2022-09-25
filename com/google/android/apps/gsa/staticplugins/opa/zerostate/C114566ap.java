package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.ap */
/* compiled from: PG */
public final /* synthetic */ class C114566ap implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C114575ay f317699a;

    public /* synthetic */ C114566ap(C114575ay ayVar) {
        this.f317699a = ayVar;
    }

    public final void run() {
        C114575ay ayVar = this.f317699a;
        ayVar.f317759s = false;
        ayVar.f317760t = false;
        SwipeRefreshLayout swipeRefreshLayout = ayVar.f317712A;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.mo8794l(false, false);
        }
    }
}
