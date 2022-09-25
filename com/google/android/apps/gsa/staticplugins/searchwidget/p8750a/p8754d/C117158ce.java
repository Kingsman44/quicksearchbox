package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.ce */
/* compiled from: PG */
public final /* synthetic */ class C117158ce implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C117161ch f325231a;

    public /* synthetic */ C117158ce(C117161ch chVar) {
        this.f325231a = chVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C117161ch chVar = this.f325231a;
        int intValue = ((Integer) obj).intValue();
        chVar.f325237d.setVisibility(8);
        chVar.f325238e.setVisibility(8);
        if (intValue == 0) {
            chVar.f325238e.setVisibility(0);
        } else if (intValue == 1 || intValue == 2) {
            chVar.f325237d.setVisibility(0);
        }
    }
}
