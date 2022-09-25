package com.google.android.apps.gsa.shared.p7148ui;

import android.graphics.drawable.Animatable;
import android.os.Handler;

/* renamed from: com.google.android.apps.gsa.shared.ui.b */
/* compiled from: PG */
final class C90651b implements Runnable {

    /* renamed from: a */
    public Animatable f253522a;

    /* renamed from: b */
    final /* synthetic */ AnimatedImageView f253523b;

    /* renamed from: c */
    private final Handler f253524c;

    public C90651b(AnimatedImageView animatedImageView, Handler handler) {
        this.f253523b = animatedImageView;
        this.f253524c = handler;
    }

    public final void run() {
        Animatable animatable = this.f253522a;
        if (animatable != null) {
            animatable.start();
            if (this.f253523b.isShown()) {
                this.f253524c.post(this);
            } else {
                this.f253524c.removeCallbacks(this);
            }
        }
    }
}
