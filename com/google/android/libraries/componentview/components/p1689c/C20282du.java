package com.google.android.libraries.componentview.components.p1689c;

import android.view.View;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20145bo;

/* renamed from: com.google.android.libraries.componentview.components.c.du */
/* compiled from: PG */
final class C20282du implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C20285dx f56935a;

    public C20282du(C20285dx dxVar) {
        this.f56935a = dxVar;
    }

    public final void onClick(View view) {
        C20145bo boVar;
        C20285dx dxVar = this.f56935a;
        C20145bo boVar2 = (C20145bo) dxVar.f56972v.get(dxVar.f56962e.mo25170i());
        if (boVar2.f56490b.equals(dxVar.f56958a.f56490b) && (boVar = dxVar.f56969l) != null) {
            boVar2 = boVar;
        }
        if (!boVar2.f56490b.isEmpty() && !boVar2.equals(dxVar.f56958a)) {
            C20145bo boVar3 = (C20145bo) dxVar.f56973w.get(dxVar.f56963f.mo25170i());
            if (!dxVar.f56972v.contains(boVar3)) {
                dxVar.f56972v.add(boVar3);
            }
            if (!dxVar.f56973w.contains(boVar2)) {
                dxVar.f56973w.add(boVar2);
            }
            dxVar.f56962e.mo25169D(dxVar.mo25325i(dxVar.f56972v));
            dxVar.f56963f.mo25169D(dxVar.mo25325i(dxVar.f56973w));
            dxVar.f56970m = boVar3;
            dxVar.f56971u = boVar2;
            dxVar.f56962e.mo25168C(dxVar.f56970m.f56491c);
            dxVar.f56963f.mo25168C(dxVar.f56971u.f56491c);
        }
        dxVar.f56974x = false;
        dxVar.f56959b.mo25289A(dxVar.f56968k);
        dxVar.f56974x = true;
        dxVar.mo25327n(3, dxVar.f56966i);
    }
}
