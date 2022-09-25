package com.google.android.apps.gsa.staticplugins.opa.chathead.p8351ui;

import android.animation.ValueAnimator;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chathead.ui.h */
/* compiled from: PG */
public final /* synthetic */ class C108164h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ CircularProgressIndicator f300825a;

    public /* synthetic */ C108164h(CircularProgressIndicator circularProgressIndicator) {
        this.f300825a = circularProgressIndicator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        CircularProgressIndicator circularProgressIndicator = this.f300825a;
        Duration duration = C108185z.f300855a;
        circularProgressIndicator.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
