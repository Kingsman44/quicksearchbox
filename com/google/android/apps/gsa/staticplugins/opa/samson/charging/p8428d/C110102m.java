package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d;

import android.view.View;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.d.m */
/* compiled from: PG */
public final /* synthetic */ class C110102m implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C110103n f306765a;

    public /* synthetic */ C110102m(C110103n nVar) {
        this.f306765a = nVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C110103n nVar = this.f306765a;
        if (i3 - i != i7 - i5) {
            nVar.f306773h.x = nVar.f306767b.widthPixels - nVar.f306766a.getMeasuredWidth();
            C58976aa aaVar = C58975e.f156826a;
            int i9 = nVar.f306773h.x;
            nVar.f306766a.setTranslationX(Math.min(Math.abs(nVar.f306775j), (float) nVar.f306773h.x));
        }
    }
}
