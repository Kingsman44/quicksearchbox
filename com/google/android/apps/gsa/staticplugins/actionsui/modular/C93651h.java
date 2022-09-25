package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.h */
/* compiled from: PG */
final class C93651h implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ View f261419a;

    /* renamed from: b */
    final /* synthetic */ int f261420b;

    /* renamed from: c */
    final /* synthetic */ C93652i f261421c;

    public C93651h(C93652i iVar, View view, int i) {
        this.f261421c = iVar;
        this.f261419a = view;
        this.f261420b = i;
    }

    public final void onClick(View view) {
        AdapterView.OnItemClickListener onItemClickListener = this.f261421c.f261382c;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick((AdapterView) null, this.f261419a, this.f261420b, 0);
        }
    }
}
