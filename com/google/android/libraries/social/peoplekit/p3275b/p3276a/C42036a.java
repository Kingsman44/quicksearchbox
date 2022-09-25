package com.google.android.libraries.social.peoplekit.p3275b.p3276a;

import android.view.View;
import com.google.android.libraries.social.peoplekit.common.p3283e.C42131a;

/* renamed from: com.google.android.libraries.social.peoplekit.b.a.a */
/* compiled from: PG */
final class C42036a implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ C42044i f109829a;

    public C42036a(C42044i iVar) {
        this.f109829a = iVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i8 - i6;
        if (view.getHeight() != i9 && i9 != 0) {
            if (C42131a.m73927j()) {
                this.f109829a.f109851g.f109627c.mObservable.mo2879a();
            }
            this.f109829a.f109851g.f109626b.scrollBy(0, view.getHeight() - i9);
        }
    }
}
