package com.google.android.libraries.material.featurehighlight;

import android.view.View;

/* renamed from: com.google.android.libraries.material.featurehighlight.t */
/* compiled from: PG */
final class C28538t implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ C28512ac f77572a;

    public C28538t(C28512ac acVar) {
        this.f77572a = acVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f77572a.mo34014l();
        C28512ac acVar = this.f77572a;
        acVar.mo34015m(acVar.mo33998a());
        this.f77572a.removeOnLayoutChangeListener(this);
    }
}
