package com.google.android.apps.search.googleapp.search.voicesearch.settings;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.settings.n */
/* compiled from: PG */
final class C138898n implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C138899o f377800a;

    public C138898n(C138899o oVar) {
        this.f377800a = oVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        String str = (String) this.f377800a.f377814n.get(i + 1);
        this.f377800a.f377814n.remove(str);
        this.f377800a.f377814n.add(0, str);
        C138899o oVar = this.f377800a;
        oVar.mo114627b(oVar.f377814n);
        this.f377800a.mo114628c();
        this.f377800a.f377815o.mo1575m();
    }
}
