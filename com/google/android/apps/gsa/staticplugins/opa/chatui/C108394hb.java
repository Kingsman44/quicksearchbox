package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.hb */
/* compiled from: PG */
public final /* synthetic */ class C108394hb implements View.OnLongClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108395hc f301485a;

    /* renamed from: b */
    public final /* synthetic */ C108430ik f301486b;

    public /* synthetic */ C108394hb(C108395hc hcVar, C108430ik ikVar) {
        this.f301485a = hcVar;
        this.f301486b = ikVar;
    }

    public final boolean onLongClick(View view) {
        C108395hc hcVar = this.f301485a;
        C108430ik ikVar = this.f301486b;
        C108226ax axVar = hcVar.f301490c;
        if (axVar != null) {
            return axVar.mo96410w(ikVar);
        }
        return false;
    }
}
