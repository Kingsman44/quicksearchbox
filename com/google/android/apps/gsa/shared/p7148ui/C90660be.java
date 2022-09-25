package com.google.android.apps.gsa.shared.p7148ui;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.apps.gsa.shared.logger.p7065j.C89932c;

/* renamed from: com.google.android.apps.gsa.shared.ui.be */
/* compiled from: PG */
public abstract class C90660be implements AdapterView.OnItemClickListener {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo84955a(int i);

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C89932c.f246391b.mo83778h(view, 5);
        mo84955a(i);
    }
}
