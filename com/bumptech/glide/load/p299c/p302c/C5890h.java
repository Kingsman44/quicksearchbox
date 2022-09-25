package com.bumptech.glide.load.p299c.p302c;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.p293a.C5679av;

/* renamed from: com.bumptech.glide.load.c.c.h */
/* compiled from: PG */
final class C5890h extends C5888f {
    private C5890h(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: f */
    static C5679av m15223f(Drawable drawable) {
        if (drawable != null) {
            return new C5890h(drawable);
        }
        return null;
    }

    /* renamed from: a */
    public final int mo12158a() {
        return Math.max(1, this.f17504a.getIntrinsicWidth() * this.f17504a.getIntrinsicHeight() * 4);
    }

    /* renamed from: b */
    public final Class mo12159b() {
        return this.f17504a.getClass();
    }

    /* renamed from: e */
    public final void mo12162e() {
    }
}
