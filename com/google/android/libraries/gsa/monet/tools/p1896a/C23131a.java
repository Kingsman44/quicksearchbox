package com.google.android.libraries.gsa.monet.tools.p1896a;

import android.animation.TimeInterpolator;

/* renamed from: com.google.android.libraries.gsa.monet.tools.a.a */
/* compiled from: PG */
public final /* synthetic */ class C23131a implements TimeInterpolator {

    /* renamed from: a */
    public final /* synthetic */ TimeInterpolator f63480a;

    public /* synthetic */ C23131a(TimeInterpolator timeInterpolator) {
        this.f63480a = timeInterpolator;
    }

    public final float getInterpolation(float f) {
        return this.f63480a.getInterpolation(1.0f - f);
    }
}
