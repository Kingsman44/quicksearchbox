package com.google.android.libraries.componentview.components.p1689c;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.libraries.componentview.components.p1685b.C19893b;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20145bo;

/* renamed from: com.google.android.libraries.componentview.components.c.dv */
/* compiled from: PG */
final class C20283dv implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ C19893b f56936a;

    /* renamed from: b */
    final /* synthetic */ String f56937b;

    /* renamed from: c */
    final /* synthetic */ C20285dx f56938c;

    public C20283dv(C20285dx dxVar, C19893b bVar, String str) {
        this.f56938c = dxVar;
        this.f56936a = bVar;
        this.f56937b = str;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C19893b bVar = this.f56936a;
        C20285dx dxVar = this.f56938c;
        if (bVar == dxVar.f56962e) {
            C20145bo boVar = (C20145bo) dxVar.f56972v.get(i);
            if (!this.f56938c.f56970m.f56490b.equals(boVar.f56490b)) {
                C20285dx dxVar2 = this.f56938c;
                dxVar2.f56970m = boVar;
                dxVar2.mo25327n(3, this.f56937b);
            }
        } else if (bVar == dxVar.f56963f) {
            C20145bo boVar2 = (C20145bo) dxVar.f56973w.get(i);
            if (!this.f56938c.f56971u.f56490b.equals(boVar2.f56490b)) {
                C20285dx dxVar3 = this.f56938c;
                dxVar3.f56971u = boVar2;
                dxVar3.mo25327n(3, this.f56937b);
            }
        } else {
            throw new AssertionError();
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
