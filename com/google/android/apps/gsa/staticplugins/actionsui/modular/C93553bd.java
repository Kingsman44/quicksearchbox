package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.bd */
/* compiled from: PG */
final class C93553bd implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ AdapterView.OnItemClickListener f261213a;

    /* renamed from: b */
    final /* synthetic */ C93555bf f261214b;

    public C93553bd(C93555bf bfVar, AdapterView.OnItemClickListener onItemClickListener) {
        this.f261214b = bfVar;
        this.f261213a = onItemClickListener;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f261214b.f261222f.dismiss();
        this.f261213a.onItemClick(adapterView, view, i, j);
    }
}
