package com.google.android.material.navigation;

import android.support.p033v7.view.menu.C0480t;
import android.view.View;

/* renamed from: com.google.android.material.navigation.h */
/* compiled from: PG */
final class C44821h implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C44822i f116926a;

    public C44821h(C44822i iVar) {
        this.f116926a = iVar;
    }

    public final void onClick(View view) {
        C0480t tVar = ((C44819f) view).f116905e;
        C44822i iVar = this.f116926a;
        if (!iVar.f116955x.mo1680z(tVar, iVar.f116954w, 0)) {
            tVar.setChecked(true);
        }
    }
}
