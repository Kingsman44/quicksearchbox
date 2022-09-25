package com.google.android.libraries.surveys.internal.view;

import android.view.View;
import com.google.android.libraries.surveys.internal.p3328e.C43059h;
import com.google.android.libraries.surveys.internal.p3328e.C43060i;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;

/* renamed from: com.google.android.libraries.surveys.internal.view.ai */
/* compiled from: PG */
public final /* synthetic */ class C43080ai implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C43091at f112664a;

    /* renamed from: b */
    public final /* synthetic */ C43122bx f112665b;

    /* renamed from: c */
    public final /* synthetic */ String f112666c;

    public /* synthetic */ C43080ai(C43091at atVar, C43122bx bxVar, String str) {
        this.f112664a = atVar;
        this.f112665b = bxVar;
        this.f112666c = str;
    }

    public final void onClick(View view) {
        C43091at atVar = this.f112664a;
        C43122bx bxVar = this.f112665b;
        String str = this.f112666c;
        C43060i iVar = new C43060i();
        bxVar.f112783a = null;
        atVar.mo46154i(atVar.f112687d, atVar.f112696m, atVar.f112692i, C43066o.m75995p(atVar.f112690g));
        atVar.f112685b.dismissAllowingStateLoss();
        C43059h.m75973d(iVar, atVar.f112687d, str);
    }
}
