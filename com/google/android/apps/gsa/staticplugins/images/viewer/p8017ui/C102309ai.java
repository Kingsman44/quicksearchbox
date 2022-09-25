package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.ai */
/* compiled from: PG */
final class C102309ai extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ boolean f285545a;

    /* renamed from: b */
    final /* synthetic */ ImageViewerPage f285546b;

    public C102309ai(ImageViewerPage imageViewerPage, boolean z) {
        this.f285546b = imageViewerPage;
        this.f285545a = z;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f285546b.setAlpha(true != this.f285545a ? 0.0f : 1.0f);
        if (this.f285545a) {
            ImageViewerPage imageViewerPage = this.f285546b;
            imageViewerPage.mo93076g(imageViewerPage.mo93072b());
            return;
        }
        this.f285546b.f285454a.mo93172c();
    }
}
