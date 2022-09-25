package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.eh */
/* compiled from: PG */
public final /* synthetic */ class C93638eh implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C93641ek f261391a;

    /* renamed from: b */
    public final /* synthetic */ AdapterView.OnItemClickListener f261392b;

    public /* synthetic */ C93638eh(C93641ek ekVar, AdapterView.OnItemClickListener onItemClickListener) {
        this.f261391a = ekVar;
        this.f261392b = onItemClickListener;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C93641ek ekVar = this.f261391a;
        AdapterView.OnItemClickListener onItemClickListener = this.f261392b;
        ekVar.f261399d.dismiss();
        onItemClickListener.onItemClick(adapterView, view, i, j);
    }
}
