package com.google.android.libraries.material.opensearchbar;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.internal.ClippableRoundedCornerLayout;

/* renamed from: com.google.android.libraries.material.opensearchbar.p */
/* compiled from: PG */
public final /* synthetic */ class C28561p implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C28571z f77640a;

    /* renamed from: b */
    public final /* synthetic */ float f77641b;

    /* renamed from: c */
    public final /* synthetic */ Rect f77642c;

    public /* synthetic */ C28561p(C28571z zVar, float f, Rect rect) {
        this.f77640a = zVar;
        this.f77641b = f;
        this.f77642c = rect;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C28571z zVar = this.f77640a;
        float f = this.f77641b;
        Rect rect = this.f77642c;
        float animatedFraction = f * (1.0f - valueAnimator.getAnimatedFraction());
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = zVar.f77654b;
        RectF rectF = new RectF((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        if (clippableRoundedCornerLayout.f116514a == null) {
            clippableRoundedCornerLayout.f116514a = new Path();
        }
        clippableRoundedCornerLayout.f116514a.reset();
        clippableRoundedCornerLayout.f116514a.addRoundRect(rectF, animatedFraction, animatedFraction, Path.Direction.CW);
        clippableRoundedCornerLayout.f116514a.close();
        clippableRoundedCornerLayout.invalidate();
    }
}
