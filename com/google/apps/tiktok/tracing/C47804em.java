package com.google.apps.tiktok.tracing;

import android.view.animation.Animation;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.tracing.em */
/* compiled from: PG */
final class C47804em implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ C47572bw f123811a;

    /* renamed from: b */
    final /* synthetic */ Animation.AnimationListener f123812b;

    public C47804em(C47572bw bwVar, Animation.AnimationListener animationListener) {
        this.f123811a = bwVar;
        this.f123812b = animationListener;
    }

    public final void onAnimationEnd(Animation animation) {
        C47572bw h = C47831fm.m85013h(this.f123811a);
        try {
            this.f123812b.onAnimationEnd(animation);
        } finally {
            C47831fm.m85013h(h);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
        C47572bw h = C47831fm.m85013h(this.f123811a);
        try {
            C69664n.m101061g(animation, "animation");
        } finally {
            C47831fm.m85013h(h);
        }
    }

    public final void onAnimationStart(Animation animation) {
        C47572bw h = C47831fm.m85013h(this.f123811a);
        try {
            C69664n.m101061g(animation, "animation");
        } finally {
            C47831fm.m85013h(h);
        }
    }
}
