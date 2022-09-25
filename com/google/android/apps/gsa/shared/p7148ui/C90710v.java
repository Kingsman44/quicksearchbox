package com.google.android.apps.gsa.shared.p7148ui;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.shared.ui.v */
/* compiled from: PG */
final class C90710v implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ C90711w f253744a;

    public C90710v(C90711w wVar) {
        this.f253744a = wVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        C90711w wVar = this.f253744a;
        if (i9 != wVar.f253745a) {
            wVar.f253745a = i9;
            wVar.setChanged();
            this.f253744a.notifyObservers();
            this.f253744a.clearChanged();
        }
    }
}
