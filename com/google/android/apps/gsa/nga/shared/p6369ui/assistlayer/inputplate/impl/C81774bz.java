package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl;

import android.animation.ValueAnimator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.impl.bz */
/* compiled from: PG */
public final /* synthetic */ class C81774bz implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ ValueAnimator f223688a;

    public /* synthetic */ C81774bz(ValueAnimator valueAnimator) {
        this.f223688a = valueAnimator;
    }

    public final void accept(Object obj) {
        ValueAnimator valueAnimator = this.f223688a;
        int i = C81776ca.f223699c;
        ((C81777cb) obj).f223702a = valueAnimator.getAnimatedFraction();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
