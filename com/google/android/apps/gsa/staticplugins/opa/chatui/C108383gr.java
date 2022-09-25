package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.gr */
/* compiled from: PG */
public final /* synthetic */ class C108383gr implements View.OnLongClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108387gv f301452a;

    /* renamed from: b */
    public final /* synthetic */ SelectionBadge f301453b;

    public /* synthetic */ C108383gr(C108387gv gvVar, SelectionBadge selectionBadge) {
        this.f301452a = gvVar;
        this.f301453b = selectionBadge;
    }

    public final boolean onLongClick(View view) {
        C108387gv gvVar = this.f301452a;
        SelectionBadge selectionBadge = this.f301453b;
        gvVar.mo96830e();
        selectionBadge.toggle();
        return true;
    }
}
