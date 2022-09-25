package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.ah */
/* compiled from: PG */
final class C102308ah extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ImageViewerPage f285544a;

    public C102308ah(ImageViewerPage imageViewerPage) {
        this.f285544a = imageViewerPage;
    }

    public final void onAnimationEnd(Animator animator) {
        ImageViewerPage imageViewerPage = this.f285544a;
        if (imageViewerPage.f285454a.f285689k && imageViewerPage.mo93081l()) {
            this.f285544a.mo93078i();
        }
        this.f285544a.f285475v.removeAllUpdateListeners();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
