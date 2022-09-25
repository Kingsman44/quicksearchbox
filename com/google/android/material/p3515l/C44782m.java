package com.google.android.material.p3515l;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: com.google.android.material.l.m */
/* compiled from: PG */
public final class C44782m implements C44772c {

    /* renamed from: a */
    private final float f116765a;

    public C44782m(float f) {
        this.f116765a = f;
    }

    /* renamed from: a */
    public final float mo48107a(RectF rectF) {
        return this.f116765a * Math.min(rectF.width(), rectF.height());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C44782m) && this.f116765a == ((C44782m) obj).f116765a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f116765a)});
    }
}
