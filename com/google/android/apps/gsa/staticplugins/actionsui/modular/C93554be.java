package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.be */
/* compiled from: PG */
final class C93554be implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ AdapterView.OnItemClickListener f261215a;

    /* renamed from: b */
    final /* synthetic */ C93555bf f261216b;

    public C93554be(C93555bf bfVar, AdapterView.OnItemClickListener onItemClickListener) {
        this.f261216b = bfVar;
        this.f261215a = onItemClickListener;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f261216b.f261222f.dismiss();
        this.f261215a.onItemClick(adapterView, view, i, j);
    }
}
