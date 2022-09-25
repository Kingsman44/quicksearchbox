package com.google.android.apps.search.googleapp.search.srp;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.C1926c;
import androidx.core.p098j.C2010ad;
import androidx.core.p098j.C2082cp;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.ae */
/* compiled from: PG */
public final /* synthetic */ class C137702ae implements C2010ad {

    /* renamed from: a */
    public final /* synthetic */ C137711an f374535a;

    /* renamed from: b */
    public final /* synthetic */ View f374536b;

    public /* synthetic */ C137702ae(C137711an anVar, View view) {
        this.f374535a = anVar;
        this.f374536b = view;
    }

    /* renamed from: a */
    public final C2082cp mo1337a(View view, C2082cp cpVar) {
        int i;
        C137711an anVar = this.f374535a;
        View view2 = this.f374536b;
        C1926c a = cpVar.f5994b.mo5216a(131);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
        if (anVar.f374565T.f101930a) {
            i = 0;
        } else {
            i = a.f5822c;
        }
        marginLayoutParams.topMargin = i;
        marginLayoutParams.bottomMargin = a.f5824e;
        view2.setLayoutParams(marginLayoutParams);
        return cpVar;
    }
}
