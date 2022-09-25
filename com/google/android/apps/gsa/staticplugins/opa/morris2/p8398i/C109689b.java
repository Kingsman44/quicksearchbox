package com.google.android.apps.gsa.staticplugins.opa.morris2.p8398i;

import android.view.View;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.i.b */
/* compiled from: PG */
public final /* synthetic */ class C109689b implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C109690c f305519a;

    public /* synthetic */ C109689b(C109690c cVar) {
        this.f305519a = cVar;
    }

    public final void onSystemUiVisibilityChange(int i) {
        C109690c cVar = this.f305519a;
        if ((i & 2) != 2) {
            C58976aa aaVar = C58975e.f156826a;
            cVar.f305521a.execute(C47810es.m84977q(new C109688a(cVar)));
        }
    }
}
