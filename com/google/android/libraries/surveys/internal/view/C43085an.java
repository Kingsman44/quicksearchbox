package com.google.android.libraries.surveys.internal.view;

import android.view.View;
import com.google.android.libraries.surveys.internal.p3328e.C43059h;
import com.google.android.libraries.surveys.internal.p3328e.C43060i;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;

/* renamed from: com.google.android.libraries.surveys.internal.view.an */
/* compiled from: PG */
public final /* synthetic */ class C43085an implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C43091at f112674a;

    /* renamed from: b */
    public final /* synthetic */ String f112675b;

    public /* synthetic */ C43085an(C43091at atVar, String str) {
        this.f112674a = atVar;
        this.f112675b = str;
    }

    public final void onClick(View view) {
        C43091at atVar = this.f112674a;
        String str = this.f112675b;
        C43060i iVar = new C43060i();
        atVar.mo46154i(atVar.f112687d, atVar.f112696m, atVar.f112692i, C43066o.m75995p(atVar.f112690g));
        atVar.f112685b.dismissAllowingStateLoss();
        C43059h.m75973d(iVar, atVar.f112687d, str);
    }
}
