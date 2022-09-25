package com.google.apps.tiktok.tracing;

import android.animation.ValueAnimator;

/* renamed from: com.google.apps.tiktok.tracing.cg */
/* compiled from: PG */
public final /* synthetic */ class C47583cg implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C47770dh f123484a;

    /* renamed from: b */
    public final /* synthetic */ ValueAnimator.AnimatorUpdateListener f123485b;

    /* renamed from: c */
    public final /* synthetic */ String f123486c;

    public /* synthetic */ C47583cg(C47770dh dhVar, ValueAnimator.AnimatorUpdateListener animatorUpdateListener, String str) {
        this.f123484a = dhVar;
        this.f123485b = animatorUpdateListener;
        this.f123486c = str;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C47770dh dhVar = this.f123484a;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f123485b;
        String str = this.f123486c;
        if (!C47831fm.m85027v()) {
            C47538ax c = dhVar.mo51613c(str);
            try {
                animatorUpdateListener.onAnimationUpdate(valueAnimator);
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                C47574by.m84679a(th, th);
            }
        } else {
            animatorUpdateListener.onAnimationUpdate(valueAnimator);
            return;
        }
        throw th;
    }
}
