package android.support.p033v7.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: android.support.v7.widget.ep */
/* compiled from: PG */
final class C0627ep extends C0602dr {

    /* renamed from: f */
    final /* synthetic */ C0628eq f2389f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0627ep(C0628eq eqVar, Context context) {
        super(context);
        this.f2389f = eqVar;
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
        C0628eq eqVar = this.f2389f;
        int[] c = eqVar.mo2804c(eqVar.f2542a.mLayout, view);
        int i = c[0];
        int i2 = c[1];
        int c2 = mo2795c(Math.max(Math.abs(i), Math.abs(i2)));
        if (c2 > 0) {
            gbVar.mo3048b(i, i2, c2, this.f2334b);
        }
    }
}
