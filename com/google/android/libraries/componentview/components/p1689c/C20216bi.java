package com.google.android.libraries.componentview.components.p1689c;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.p119j.p120a.p121a.C2300b;

/* renamed from: com.google.android.libraries.componentview.components.c.bi */
/* compiled from: PG */
final class C20216bi implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ View f56769a;

    /* renamed from: b */
    final /* synthetic */ C20227bt f56770b;

    /* renamed from: c */
    final /* synthetic */ long f56771c;

    /* renamed from: d */
    final /* synthetic */ C20218bk f56772d;

    public C20216bi(C20218bk bkVar, View view, C20227bt btVar, long j) {
        this.f56772d = bkVar;
        this.f56769a = view;
        this.f56770b = btVar;
        this.f56771c = j;
    }

    public final boolean onPreDraw() {
        this.f56769a.getViewTreeObserver().removeOnPreDrawListener(this);
        C20218bk bkVar = this.f56772d;
        C20227bt btVar = this.f56770b;
        long j = this.f56771c;
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(j);
        duration.setInterpolator(new C2300b());
        btVar.f56806a.mo25305b();
        duration.addListener(btVar);
        duration.addUpdateListener(btVar);
        duration.addListener(new C20217bj(bkVar, j));
        duration.start();
        return false;
    }
}
