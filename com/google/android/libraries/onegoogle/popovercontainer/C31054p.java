package com.google.android.libraries.onegoogle.popovercontainer;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;

/* renamed from: com.google.android.libraries.onegoogle.popovercontainer.p */
/* compiled from: PG */
final class C31054p {

    /* renamed from: a */
    public static final Property f83637a = new C31053o(Float.class);

    /* renamed from: b */
    public final ViewTreeObserver.OnScrollChangedListener f83638b = new C31051m(this);

    /* renamed from: c */
    public final ViewTreeObserver.OnGlobalLayoutListener f83639c = new C31052n(this);

    /* renamed from: d */
    public final View f83640d;

    /* renamed from: e */
    private final ObjectAnimator f83641e;

    /* renamed from: f */
    private boolean f83642f = true;

    public C31054p(ExpandableDialogView expandableDialogView, Property property, View view) {
        this.f83640d = view;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(expandableDialogView, property, new float[]{0.0f, 1.0f});
        this.f83641e = ofFloat;
        ofFloat.setDuration(115);
        ofFloat.setInterpolator(new LinearInterpolator());
        mo36760b();
        if (!view.canScrollVertically(-1)) {
            this.f83642f = false;
        }
    }

    /* renamed from: a */
    public final void mo36759a() {
        if (this.f83642f != this.f83640d.canScrollVertically(-1)) {
            this.f83642f = !this.f83642f;
            this.f83641e.cancel();
            ObjectAnimator objectAnimator = this.f83641e;
            float[] fArr = new float[2];
            fArr[0] = ((Float) objectAnimator.getAnimatedValue()).floatValue();
            fArr[1] = true != this.f83642f ? 0.0f : 1.0f;
            objectAnimator.setFloatValues(fArr);
            this.f83641e.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo36760b() {
        this.f83640d.getViewTreeObserver().addOnScrollChangedListener(this.f83638b);
        this.f83640d.getViewTreeObserver().addOnGlobalLayoutListener(this.f83639c);
    }
}
