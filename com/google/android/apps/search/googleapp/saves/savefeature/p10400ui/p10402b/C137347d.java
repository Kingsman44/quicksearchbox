package com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.p10402b;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.ui.b.d */
/* compiled from: PG */
public final class C137347d implements C137348e {

    /* renamed from: b */
    private static final Interpolator f373598b = new DecelerateInterpolator();

    /* renamed from: a */
    public final C137346c f373599a;

    public C137347d(C137346c cVar) {
        this.f373599a = cVar;
    }

    /* renamed from: a */
    public final void mo113674a(View view, float f) {
        view.setTranslationY(f);
    }

    /* renamed from: b */
    public final void mo113675b(View view, float f, boolean z) {
        float[] fArr = new float[2];
        fArr[0] = f;
        fArr[1] = z ? (float) view.getHeight() : 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.addUpdateListener(new C137344a(view));
        ofFloat.addListener(new C137345b(this, z));
        ofFloat.setInterpolator(f373598b);
        ofFloat.setDuration(200);
        ofFloat.start();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo113676c() {
    }
}
