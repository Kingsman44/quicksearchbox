package com.google.android.material.p3515l;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: com.google.android.material.l.a */
/* compiled from: PG */
public final class C44769a implements C44772c {

    /* renamed from: a */
    private final float f116713a;

    public C44769a(float f) {
        this.f116713a = f;
    }

    /* renamed from: a */
    public final float mo48107a(RectF rectF) {
        return this.f116713a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C44769a) && this.f116713a == ((C44769a) obj).f116713a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f116713a)});
    }
}
