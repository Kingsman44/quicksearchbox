package com.google.android.libraries.surveys.internal.view;

import android.view.View;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;

/* renamed from: com.google.android.libraries.surveys.internal.view.am */
/* compiled from: PG */
public final /* synthetic */ class C43084am implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C43091at f112673a;

    public /* synthetic */ C43084am(C43091at atVar) {
        this.f112673a = atVar;
    }

    public final void onClick(View view) {
        C43091at atVar = this.f112673a;
        atVar.f112686c.f112633e = false;
        atVar.mo46154i(atVar.f112687d, atVar.f112696m, atVar.f112692i, C43066o.m75995p(atVar.f112690g));
        atVar.mo46153h(atVar.f112687d, atVar.f112696m, atVar.f112692i, C43066o.m75995p(atVar.f112690g));
        atVar.f112685b.dismissAllowingStateLoss();
    }
}
