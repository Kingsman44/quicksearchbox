package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.animation.ValueAnimator;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.ab */
/* compiled from: PG */
public final /* synthetic */ class C102302ab implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ ImageViewerPage f285535a;

    /* renamed from: b */
    public final /* synthetic */ int f285536b;

    public /* synthetic */ C102302ab(ImageViewerPage imageViewerPage, int i) {
        this.f285535a = imageViewerPage;
        this.f285536b = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ImageViewerPage imageViewerPage = this.f285535a;
        int i = this.f285536b;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        imageViewerPage.setTranslationY(floatValue);
        float f = floatValue / ((float) i);
        imageViewerPage.setAlpha(1.0f - f);
        imageViewerPage.mo93076g(((Integer) imageViewerPage.f285479z.evaluate(1.0f - Math.min(1.0f, f), 0, Integer.valueOf(imageViewerPage.getResources().getColor(R.color.monet_viewer_fullscreen_background)))).intValue());
    }
}
