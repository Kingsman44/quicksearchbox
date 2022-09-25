package com.bumptech.glide.load.p299c.p302c;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.p293a.C5679av;
import com.bumptech.glide.p291h.C5632s;

/* renamed from: com.bumptech.glide.load.c.c.a */
/* compiled from: PG */
final class C5883a implements C5679av {

    /* renamed from: a */
    private final AnimatedImageDrawable f17498a;

    public C5883a(AnimatedImageDrawable animatedImageDrawable) {
        this.f17498a = animatedImageDrawable;
    }

    /* renamed from: a */
    public final int mo12158a() {
        int intrinsicWidth = this.f17498a.getIntrinsicWidth() * this.f17498a.getIntrinsicHeight() * C5632s.m14610c(Bitmap.Config.ARGB_8888);
        return intrinsicWidth + intrinsicWidth;
    }

    /* renamed from: b */
    public final Class mo12159b() {
        return Drawable.class;
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo12160c() {
        return this.f17498a;
    }

    /* renamed from: e */
    public final void mo12162e() {
        this.f17498a.stop();
        this.f17498a.clearAnimationCallbacks();
    }
}
