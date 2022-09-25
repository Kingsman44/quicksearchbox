package com.facebook.litho.widget;

import android.content.Context;
import android.support.p033v7.widget.C0602dr;
import android.support.p033v7.widget.C0667gb;
import android.support.p033v7.widget.C0670ge;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.litho.widget.dj */
/* compiled from: PG */
final class C6505dj extends C0602dr {

    /* renamed from: f */
    final /* synthetic */ C6506dk f19283f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6505dj(C6506dk dkVar, Context context) {
        super(context);
        this.f19283f = dkVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo2793a(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo2796d(int i) {
        return Math.min(100, super.mo2796d(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo2800h(View view, C0670ge geVar, C0667gb gbVar) {
        C6506dk dkVar = this.f19283f;
        int[] c = dkVar.mo2804c(dkVar.f19284b.mLayout, view);
        int i = c[0];
        int i2 = c[1];
        int c2 = mo2795c(Math.max(Math.abs(i), Math.abs(i2)));
        if (c2 > 0) {
            gbVar.mo3048b(i, i2, c2, this.f2334b);
        }
    }
}
