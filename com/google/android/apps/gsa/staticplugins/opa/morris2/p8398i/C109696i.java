package com.google.android.apps.gsa.staticplugins.opa.morris2.p8398i;

import android.view.View;
import android.view.Window;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.i.i */
/* compiled from: PG */
public final /* synthetic */ class C109696i implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C109699l f305582a;

    /* renamed from: b */
    public final /* synthetic */ Window f305583b;

    public /* synthetic */ C109696i(C109699l lVar, Window window) {
        this.f305582a = lVar;
        this.f305583b = window;
    }

    public final void onSystemUiVisibilityChange(int i) {
        C109699l lVar = this.f305582a;
        Window window = this.f305583b;
        if ((i & 2) != 2) {
            C58976aa aaVar = C58975e.f156826a;
            lVar.f305588a.execute(C47810es.m84977q(new C109697j(lVar, window)));
        }
    }
}
