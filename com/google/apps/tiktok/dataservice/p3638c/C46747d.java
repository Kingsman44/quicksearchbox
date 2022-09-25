package com.google.apps.tiktok.dataservice.p3638c;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0641fc;
import android.support.p033v7.widget.C0642fd;

/* renamed from: com.google.apps.tiktok.dataservice.c.d */
/* compiled from: PG */
final class C46747d extends C0642fd {

    /* renamed from: a */
    public int f122088a;

    /* renamed from: b */
    private final C0640fb f122089b;

    public C46747d(C0640fb fbVar) {
        this.f122089b = fbVar;
    }

    /* renamed from: a */
    public final void mo2831a() {
        this.f122089b.mObservable.mo2879a();
    }

    /* renamed from: b */
    public final void mo2832b(int i, int i2) {
        this.f122089b.mObservable.mo2881c(this.f122088a + i, i2, (Object) null);
    }

    /* renamed from: c */
    public final void mo2833c(int i, int i2, Object obj) {
        this.f122089b.mObservable.mo2881c(this.f122088a + i, i2, obj);
    }

    /* renamed from: d */
    public final void mo2834d(int i, int i2) {
        this.f122089b.mObservable.mo2882d(this.f122088a + i, i2);
    }

    /* renamed from: e */
    public final void mo2835e(int i, int i2) {
        this.f122089b.mObservable.mo2883e(this.f122088a + i, i2);
    }

    /* renamed from: g */
    public final void mo2837g(int i, int i2) {
        for (int i3 = 0; i3 <= 0; i3++) {
            C0640fb fbVar = this.f122089b;
            int i4 = this.f122088a;
            C0641fc fcVar = fbVar.mObservable;
            int i5 = i4 + i;
            if (i > i2) {
                fcVar.mo2880b(i5 + i3, i4 + i2 + i3);
            } else {
                fcVar.mo2880b(i5 - i3, (i4 + i2) - i3);
            }
        }
    }
}
