package com.google.android.libraries.material.opensearchbar;

import android.animation.ValueAnimator;
import com.google.android.material.internal.C44751k;

/* renamed from: com.google.android.libraries.material.opensearchbar.r */
/* compiled from: PG */
public final /* synthetic */ class C28563r implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C44751k f77644a;

    public /* synthetic */ C28563r(C44751k kVar) {
        this.f77644a = kVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f77644a.mo48077a(valueAnimator.getAnimatedFraction());
    }
}
