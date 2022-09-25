package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl;

import android.animation.ValueAnimator;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.impl.ca */
/* compiled from: PG */
final class C81776ca implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: c */
    public static final /* synthetic */ int f223699c = 0;

    /* renamed from: a */
    public final List f223700a = new ArrayList();

    /* renamed from: b */
    final /* synthetic */ TranscriptionView f223701b;

    public C81776ca(TranscriptionView transcriptionView) {
        this.f223701b = transcriptionView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f223701b.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f223701b.mo75257d();
        Collection.EL.stream(this.f223700a).forEach(new C81774bz(valueAnimator));
        this.f223701b.invalidate();
    }
}
