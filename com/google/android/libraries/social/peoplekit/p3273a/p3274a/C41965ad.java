package com.google.android.libraries.social.peoplekit.p3273a.p3274a;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.core.graphics.drawable.C1929b;

/* renamed from: com.google.android.libraries.social.peoplekit.a.a.ad */
/* compiled from: PG */
final class C41965ad implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ Drawable f109524a;

    /* renamed from: b */
    final /* synthetic */ ValueAnimator f109525b;

    /* renamed from: c */
    final /* synthetic */ ImageView f109526c;

    public C41965ad(Drawable drawable, ValueAnimator valueAnimator, ImageView imageView) {
        this.f109524a = drawable;
        this.f109525b = valueAnimator;
        this.f109526c = imageView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C1929b.m5225f(this.f109524a.mutate(), ((Integer) this.f109525b.getAnimatedValue()).intValue());
        this.f109526c.setImageDrawable(this.f109524a);
    }
}
