package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.imageviewer.p1874a.C22822a;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.ag */
/* compiled from: PG */
final class C102307ag implements C22822a {

    /* renamed from: a */
    final /* synthetic */ ImageViewerPage f285543a;

    public C102307ag(ImageViewerPage imageViewerPage) {
        this.f285543a = imageViewerPage;
    }

    /* renamed from: a */
    public final void mo28167a(View view, float f) {
        float min = Math.min(1.0f, f / ((float) view.getHeight()));
        this.f285543a.setAlpha(Math.min(1.0f, 1.5f - min));
        int intValue = ((Integer) this.f285543a.f285479z.evaluate(min, Integer.valueOf(this.f285543a.getResources().getColor(R.color.monet_viewer_fullscreen_background)), 0)).intValue();
        this.f285543a.setTranslationY(f);
        this.f285543a.mo93076g(intValue);
    }

    /* renamed from: b */
    public final void mo28168b(View view, float f, boolean z) {
        float[] fArr = new float[2];
        fArr[0] = f;
        fArr[1] = z ? (float) view.getHeight() : 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.addUpdateListener(new C102305ae(this, view));
        ofFloat.addListener(new C102306af(this, z));
        ofFloat.setInterpolator(this.f285543a.f285477x);
        ofFloat.setDuration(200);
        ofFloat.start();
    }

    /* renamed from: c */
    public final void mo28169c() {
    }
}
