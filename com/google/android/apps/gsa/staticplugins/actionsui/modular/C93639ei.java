package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.ei */
/* compiled from: PG */
public final /* synthetic */ class C93639ei implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C93641ek f261393a;

    /* renamed from: b */
    public final /* synthetic */ AdapterView.OnItemClickListener f261394b;

    public /* synthetic */ C93639ei(C93641ek ekVar, AdapterView.OnItemClickListener onItemClickListener) {
        this.f261393a = ekVar;
        this.f261394b = onItemClickListener;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C93641ek ekVar = this.f261393a;
        AdapterView.OnItemClickListener onItemClickListener = this.f261394b;
        ekVar.f261399d.dismiss();
        onItemClickListener.onItemClick(adapterView, view, i, j);
    }
}
