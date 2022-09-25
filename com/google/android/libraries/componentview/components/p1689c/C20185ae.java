package com.google.android.libraries.componentview.components.p1689c;

import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.componentview.components.c.ae */
/* compiled from: PG */
public final class C20185ae extends ScaleAnimation {

    /* renamed from: a */
    public Animation.AnimationListener f56647a;

    /* renamed from: b */
    private final Executor f56648b;

    public C20185ae(Executor executor) {
        super(0.0f, 1.0f, 1.0f, 1.0f, 1, 0.0f, 1, 0.5f);
        this.f56648b = executor;
    }

    /* access modifiers changed from: protected */
    public final void applyTransformation(float f, Transformation transformation) {
        super.applyTransformation(f, transformation);
        Animation.AnimationListener animationListener = this.f56647a;
        if (animationListener != null && f == 1.0f) {
            this.f56647a = null;
            this.f56648b.execute(new C20184ad(this, animationListener));
        }
    }

    public final void setAnimationListener(Animation.AnimationListener animationListener) {
        this.f56647a = animationListener;
    }
}
