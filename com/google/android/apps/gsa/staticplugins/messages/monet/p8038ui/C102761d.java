package com.google.android.apps.gsa.staticplugins.messages.monet.p8038ui;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ProgressBar;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.monet.ui.d */
/* compiled from: PG */
final class C102761d extends Animation {

    /* renamed from: a */
    private final ProgressBar f286867a;

    /* renamed from: b */
    private final float f286868b;

    public C102761d(ProgressBar progressBar, float f) {
        this.f286867a = progressBar;
        this.f286868b = f;
    }

    /* access modifiers changed from: protected */
    public final void applyTransformation(float f, Transformation transformation) {
        super.applyTransformation(f, transformation);
        this.f286867a.setProgress((int) (((this.f286868b + 0.0f) * f) + 0.0f));
    }
}
