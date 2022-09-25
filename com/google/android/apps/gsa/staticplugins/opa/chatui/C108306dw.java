package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.dw */
/* compiled from: PG */
final class C108306dw implements View.OnLongClickListener {

    /* renamed from: a */
    final /* synthetic */ C108321ej f301296a;

    /* renamed from: b */
    final /* synthetic */ C108307dx f301297b;

    public C108306dw(C108307dx dxVar, C108321ej ejVar) {
        this.f301297b = dxVar;
        this.f301296a = ejVar;
    }

    public final boolean onLongClick(View view) {
        String str = this.f301297b.f301037s;
        if (str == null) {
            return false;
        }
        C108321ej ejVar = this.f301296a;
        C108488w wVar = new C108488w();
        wVar.f301855a = str;
        ejVar.mo96780b(wVar.mo96774a());
        return true;
    }
}
