package com.google.android.libraries.surveys.internal.view;

import android.view.View;
import com.google.android.libraries.surveys.internal.p3328e.C43059h;
import com.google.android.libraries.surveys.internal.p3328e.C43060i;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;

/* renamed from: com.google.android.libraries.surveys.internal.view.ak */
/* compiled from: PG */
public final /* synthetic */ class C43082ak implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C43091at f112669a;

    /* renamed from: b */
    public final /* synthetic */ C43108bj f112670b;

    /* renamed from: c */
    public final /* synthetic */ String f112671c;

    public /* synthetic */ C43082ak(C43091at atVar, C43108bj bjVar, String str) {
        this.f112669a = atVar;
        this.f112670b = bjVar;
        this.f112671c = str;
    }

    public final void onClick(View view) {
        C43091at atVar = this.f112669a;
        C43108bj bjVar = this.f112670b;
        String str = this.f112671c;
        C43060i iVar = new C43060i();
        bjVar.f112747a = null;
        atVar.mo46154i(atVar.f112687d, atVar.f112696m, atVar.f112692i, C43066o.m75995p(atVar.f112690g));
        atVar.f112685b.dismissAllowingStateLoss();
        C43059h.m75973d(iVar, atVar.f112687d, str);
    }
}
