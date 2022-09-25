package com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a;

import android.view.View;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136453f;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.i.a.i */
/* compiled from: PG */
final class C136506i implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ C136508k f371622a;

    public C136506i(C136508k kVar) {
        this.f371622a = kVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C136453f fVar = this.f371622a.f371628e;
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        int i9 = this.f371622a.f371636m;
        String a = C136495ac.m221813a(i9);
        if (i9 != 0) {
            objArr[0] = a;
            fVar.mo113057a(String.format(locale, "onLayoutChange: setting up overlay, overlayState = %s", objArr));
            this.f371622a.f371631h.getDecorView().removeOnLayoutChangeListener(this);
            C136508k kVar = this.f371622a;
            if (kVar.f371636m == 4) {
                kVar.mo113108g(kVar.f371631h);
                C136508k kVar2 = this.f371622a;
                if (!kVar2.f371629f) {
                    kVar2.mo113106e(kVar2.f371631h);
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }
}
