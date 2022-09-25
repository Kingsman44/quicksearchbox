package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.f */
/* compiled from: PG */
final class C93649f implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ View f261416a;

    /* renamed from: b */
    final /* synthetic */ int f261417b;

    /* renamed from: c */
    final /* synthetic */ C93650g f261418c;

    public C93649f(C93650g gVar, View view, int i) {
        this.f261418c = gVar;
        this.f261416a = view;
        this.f261417b = i;
    }

    public final void onClick(View view) {
        AdapterView.OnItemClickListener onItemClickListener = this.f261418c.f261382c;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick((AdapterView) null, this.f261416a, this.f261417b, 0);
        }
    }
}
