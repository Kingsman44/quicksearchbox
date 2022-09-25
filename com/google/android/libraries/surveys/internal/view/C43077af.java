package com.google.android.libraries.surveys.internal.view;

import android.view.View;
import com.google.android.libraries.surveys.internal.p3328e.C43059h;
import com.google.android.libraries.surveys.internal.p3328e.C43060i;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;

/* renamed from: com.google.android.libraries.surveys.internal.view.af */
/* compiled from: PG */
public final /* synthetic */ class C43077af implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C43091at f112658a;

    /* renamed from: b */
    public final /* synthetic */ String f112659b;

    public /* synthetic */ C43077af(C43091at atVar, String str) {
        this.f112658a = atVar;
        this.f112659b = str;
    }

    public final void onClick(View view) {
        C43091at atVar = this.f112658a;
        String str = this.f112659b;
        C43060i iVar = new C43060i();
        atVar.mo46154i(atVar.f112687d, atVar.f112696m, atVar.f112692i, C43066o.m75995p(atVar.f112690g));
        atVar.f112685b.dismissAllowingStateLoss();
        C43059h.m75973d(iVar, atVar.f112687d, str);
    }
}
