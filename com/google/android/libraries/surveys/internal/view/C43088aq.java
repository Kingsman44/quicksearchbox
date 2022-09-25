package com.google.android.libraries.surveys.internal.view;

import android.view.View;
import com.google.android.libraries.surveys.internal.p3328e.C43059h;
import com.google.android.libraries.surveys.internal.p3328e.C43060i;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;

/* renamed from: com.google.android.libraries.surveys.internal.view.aq */
/* compiled from: PG */
public final /* synthetic */ class C43088aq implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C43091at f112679a;

    /* renamed from: b */
    public final /* synthetic */ C43156n f112680b;

    /* renamed from: c */
    public final /* synthetic */ String f112681c;

    public /* synthetic */ C43088aq(C43091at atVar, C43156n nVar, String str) {
        this.f112679a = atVar;
        this.f112680b = nVar;
        this.f112681c = str;
    }

    public final void onClick(View view) {
        C43091at atVar = this.f112679a;
        C43156n nVar = this.f112680b;
        String str = this.f112681c;
        C43060i iVar = new C43060i();
        nVar.f112855c = null;
        atVar.mo46154i(atVar.f112687d, atVar.f112696m, atVar.f112692i, C43066o.m75995p(atVar.f112690g));
        atVar.f112685b.dismissAllowingStateLoss();
        C43059h.m75973d(iVar, atVar.f112687d, str);
    }
}
