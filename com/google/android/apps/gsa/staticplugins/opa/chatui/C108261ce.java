package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.ce */
/* compiled from: PG */
public final /* synthetic */ class C108261ce implements View.OnLongClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108262cf f301160a;

    /* renamed from: b */
    public final /* synthetic */ C108321ej f301161b;

    public /* synthetic */ C108261ce(C108262cf cfVar, C108321ej ejVar) {
        this.f301160a = cfVar;
        this.f301161b = ejVar;
    }

    public final boolean onLongClick(View view) {
        C108262cf cfVar = this.f301160a;
        C108321ej ejVar = this.f301161b;
        String str = cfVar.f301037s;
        if (str == null) {
            return false;
        }
        C108488w wVar = new C108488w();
        wVar.f301857c = Integer.valueOf(cfVar.mo96602l());
        wVar.f301855a = str;
        ejVar.mo96780b(wVar.mo96774a());
        return true;
    }
}
