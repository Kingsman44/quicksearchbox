package com.google.android.libraries.gsa.p1859d.p1861b;

import android.view.View;

/* renamed from: com.google.android.libraries.gsa.d.b.j */
/* compiled from: PG */
final class C22764j implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ C22768n f62647a;

    public C22764j(C22768n nVar) {
        this.f62647a = nVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f62647a.f62639aa.getDecorView().removeOnLayoutChangeListener(this);
        if (this.f62647a.f62656aC == 1) {
            this.f62647a.mo28043ac(true);
        }
    }
}
