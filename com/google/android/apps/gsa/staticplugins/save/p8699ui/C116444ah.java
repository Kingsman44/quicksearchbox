package com.google.android.apps.gsa.staticplugins.save.p8699ui;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.libraries.gsa.imageviewer.p1874a.C22822a;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.ui.ah */
/* compiled from: PG */
final class C116444ah implements C22822a {

    /* renamed from: a */
    final /* synthetic */ C116446aj f322881a;

    public C116444ah(C116446aj ajVar) {
        this.f322881a = ajVar;
    }

    /* renamed from: a */
    public final void mo28167a(View view, float f) {
        view.setTranslationY(f);
        float min = Math.min(1.0f, f / ((float) view.getHeight()));
        if (this.f322881a.f322885c.getBackground() != null) {
            this.f322881a.f322885c.getBackground().setAlpha((int) ((1.0f - min) * 255.0f));
        }
    }

    /* renamed from: b */
    public final void mo28168b(View view, float f, boolean z) {
        float[] fArr = new float[2];
        fArr[0] = f;
        fArr[1] = z ? (float) view.getHeight() : 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.addUpdateListener(new C116442af(this, view));
        ofFloat.addListener(new C116443ag(this, z));
        ofFloat.setInterpolator(C116446aj.f322883a);
        ofFloat.setDuration(200);
        ofFloat.start();
    }

    /* renamed from: c */
    public final void mo28169c() {
    }
}
