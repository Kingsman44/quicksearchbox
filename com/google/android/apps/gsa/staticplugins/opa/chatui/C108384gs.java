package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.gs */
/* compiled from: PG */
public final /* synthetic */ class C108384gs implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108387gv f301454a;

    /* renamed from: b */
    public final /* synthetic */ SelectionBadge f301455b;

    /* renamed from: c */
    public final /* synthetic */ int f301456c;

    public /* synthetic */ C108384gs(C108387gv gvVar, SelectionBadge selectionBadge, int i) {
        this.f301454a = gvVar;
        this.f301455b = selectionBadge;
        this.f301456c = i;
    }

    public final void onClick(View view) {
        C108387gv gvVar = this.f301454a;
        SelectionBadge selectionBadge = this.f301455b;
        int i = this.f301456c;
        if (gvVar.f301464F) {
            selectionBadge.toggle();
        } else {
            gvVar.f301475d.mo95799d(gvVar.f301474c, gvVar.f301471M, i);
        }
    }
}
