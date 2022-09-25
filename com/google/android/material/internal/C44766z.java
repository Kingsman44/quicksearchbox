package com.google.android.material.internal;

import android.support.p033v7.view.menu.C0480t;
import android.view.View;

/* renamed from: com.google.android.material.internal.z */
/* compiled from: PG */
final class C44766z implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C44714am f116703a;

    public C44766z(C44714am amVar) {
        this.f116703a = amVar;
    }

    public final void onClick(View view) {
        boolean z = true;
        this.f116703a.mo48022p(true);
        C0480t tVar = ((NavigationMenuItemView) view).f116521h;
        C44714am amVar = this.f116703a;
        boolean z2 = amVar.f116543c.mo1680z(tVar, amVar, 0);
        if (tVar == null || !tVar.isCheckable() || !z2) {
            z = false;
        } else {
            this.f116703a.f116545e.mo48017b(tVar);
        }
        this.f116703a.mo48022p(false);
        if (z) {
            this.f116703a.mo1546f(false);
        }
    }
}
