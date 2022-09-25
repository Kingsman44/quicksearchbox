package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f;

import android.content.Context;
import android.support.p033v7.widget.C0602dr;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.C0667gb;
import android.support.p033v7.widget.C0670ge;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.f.aa */
/* compiled from: PG */
final class C15326aa extends C0602dr {

    /* renamed from: f */
    final /* synthetic */ C0653fo f46001f;

    /* renamed from: n */
    final /* synthetic */ C15327ab f46002n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15326aa(C15327ab abVar, Context context, C0653fo foVar) {
        super(context);
        this.f46002n = abVar;
        this.f46001f = foVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo2793a(DisplayMetrics displayMetrics) {
        return 50.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo2800h(View view, C0670ge geVar, C0667gb gbVar) {
        C15327ab abVar = this.f46002n;
        if (abVar.f46003b != null) {
            int[] c = abVar.mo2804c(this.f46001f, view);
            int i = c[0];
            int i2 = c[1];
            int c2 = mo2795c(Math.max(Math.abs(i), Math.abs(i2)));
            if (c2 > 0) {
                gbVar.mo3048b(i, i2, c2, this.f2334b);
            }
        }
    }
}
