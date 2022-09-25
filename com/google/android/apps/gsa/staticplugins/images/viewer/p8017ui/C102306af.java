package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.af */
/* compiled from: PG */
final class C102306af extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ boolean f285541a;

    /* renamed from: b */
    final /* synthetic */ C102307ag f285542b;

    public C102306af(C102307ag agVar, boolean z) {
        this.f285542b = agVar;
        this.f285541a = z;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f285541a) {
            this.f285542b.f285543a.f285454a.mo93172c();
            return;
        }
        this.f285542b.f285543a.setTranslationY(0.0f);
        ImageViewerPage imageViewerPage = this.f285542b.f285543a;
        imageViewerPage.mo93076g(imageViewerPage.mo93072b());
    }
}
