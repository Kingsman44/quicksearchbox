package com.google.android.libraries.lens.view.infopanel;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.lens.view.infopanel.bx */
/* compiled from: PG */
public final class C27070bx {

    /* renamed from: c */
    private static final Property f73795c = new C27068bv(Float.class);

    /* renamed from: a */
    public final View f73796a;

    /* renamed from: b */
    public boolean f73797b = true;

    /* renamed from: d */
    private final View f73798d;

    /* renamed from: e */
    private final ObjectAnimator f73799e;

    /* renamed from: f */
    private boolean f73800f = false;

    private C27070bx(View view, View view2) {
        this.f73798d = view2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, f73795c, new float[]{0.0f});
        this.f73799e = ofFloat;
        this.f73796a = view;
        ofFloat.setDuration(200);
        ofFloat.setInterpolator(new LinearInterpolator());
    }

    /* renamed from: a */
    public static C27070bx m50232a(InfoPanelHeader infoPanelHeader, View view) {
        C27070bx bxVar = new C27070bx(infoPanelHeader.mo17754z().f74390d.f74382g, view);
        ViewTreeObserver viewTreeObserver = bxVar.f73798d.getViewTreeObserver();
        Objects.requireNonNull(bxVar);
        viewTreeObserver.addOnScrollChangedListener(new C27066bt(bxVar));
        ViewTreeObserver viewTreeObserver2 = bxVar.f73798d.getViewTreeObserver();
        Objects.requireNonNull(bxVar);
        viewTreeObserver2.addOnGlobalLayoutListener(new C27067bu(bxVar));
        return bxVar;
    }

    /* renamed from: b */
    public final void mo32518b() {
        if (this.f73800f != this.f73798d.canScrollVertically(-1) && this.f73797b) {
            this.f73800f = !this.f73800f;
            this.f73799e.cancel();
            this.f73799e.addListener(new C27069bw(this));
            ObjectAnimator objectAnimator = this.f73799e;
            float[] fArr = new float[1];
            fArr[0] = true != this.f73800f ? 0.0f : 1.0f;
            objectAnimator.setFloatValues(fArr);
            this.f73799e.start();
        }
    }
}
