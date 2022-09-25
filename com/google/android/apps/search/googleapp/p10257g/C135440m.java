package com.google.android.apps.search.googleapp.p10257g;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.g.m */
/* compiled from: PG */
public final class C135440m extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ImageView f368998a;

    public C135440m(ImageView imageView) {
        this.f368998a = imageView;
    }

    public final void onAnimationEnd(Animator animator) {
        C69664n.m101061g(animator, "animation");
        this.f368998a.setVisibility(8);
    }
}
