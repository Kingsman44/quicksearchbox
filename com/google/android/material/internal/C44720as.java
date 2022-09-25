package com.google.android.material.internal;

import android.graphics.Rect;
import android.view.View;
import androidx.core.p098j.C2010ad;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2082cp;

/* renamed from: com.google.android.material.internal.as */
/* compiled from: PG */
final class C44720as implements C2010ad {

    /* renamed from: a */
    final /* synthetic */ C44721at f116573a;

    public C44720as(C44721at atVar) {
        this.f116573a = atVar;
    }

    /* renamed from: a */
    public final C2082cp mo1337a(View view, C2082cp cpVar) {
        C44721at atVar = this.f116573a;
        if (atVar.f116575b == null) {
            atVar.f116575b = new Rect();
        }
        this.f116573a.f116575b.set(cpVar.mo5240b(), cpVar.mo5242d(), cpVar.mo5241c(), cpVar.mo5239a());
        this.f116573a.mo48029a(cpVar);
        C44721at atVar2 = this.f116573a;
        boolean z = true;
        if (cpVar.mo5247i() && this.f116573a.f116574a != null) {
            z = false;
        }
        atVar2.setWillNotDraw(z);
        C2043bi.m5519M(this.f116573a);
        return cpVar.f5994b.mo5231o();
    }
}
