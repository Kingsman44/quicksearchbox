package com.facebook.litho.p326e;

import android.animation.TimeInterpolator;

/* renamed from: com.facebook.litho.e.j */
/* compiled from: PG */
public final class C6221j extends C6226o {

    /* renamed from: e */
    private final TimeInterpolator f18395e;

    public C6221j(TimeInterpolator timeInterpolator) {
        this.f18395e = timeInterpolator;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo12765a(long j) {
        return this.f18395e.getInterpolation(mo13186f("default_input").f18404c);
    }
}
