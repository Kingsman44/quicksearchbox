package com.google.android.material.internal;

import android.animation.TimeInterpolator;

/* renamed from: com.google.android.material.internal.ar */
/* compiled from: PG */
public final class C44719ar implements TimeInterpolator {

    /* renamed from: a */
    private final TimeInterpolator f116572a;

    public C44719ar(TimeInterpolator timeInterpolator) {
        this.f116572a = timeInterpolator;
    }

    /* renamed from: a */
    public static TimeInterpolator m79277a(boolean z, TimeInterpolator timeInterpolator) {
        return z ? timeInterpolator : new C44719ar(timeInterpolator);
    }

    public final float getInterpolation(float f) {
        return 1.0f - this.f116572a.getInterpolation(f);
    }
}
