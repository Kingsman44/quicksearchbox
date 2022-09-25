package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.aa */
/* compiled from: PG */
public final /* synthetic */ class C102301aa implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ImageViewerPage f285533a;

    /* renamed from: b */
    public final /* synthetic */ boolean f285534b;

    public /* synthetic */ C102301aa(ImageViewerPage imageViewerPage, boolean z) {
        this.f285533a = imageViewerPage;
        this.f285534b = z;
    }

    public final void run() {
        ImageViewerPage imageViewerPage = this.f285533a;
        boolean z = this.f285534b;
        int height = imageViewerPage.getHeight() / 3;
        float[] fArr = new float[2];
        float f = 0.0f;
        fArr[0] = z ? (float) height : 0.0f;
        if (!z) {
            f = (float) height;
        }
        fArr[1] = f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setDuration(200);
        ofFloat.setInterpolator(imageViewerPage.f285477x);
        ofFloat.addUpdateListener(new C102302ab(imageViewerPage, height));
        ofFloat.addListener(new C102309ai(imageViewerPage, z));
        ofFloat.start();
    }
}
