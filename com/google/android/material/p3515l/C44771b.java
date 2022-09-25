package com.google.android.material.p3515l;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: com.google.android.material.l.b */
/* compiled from: PG */
public final class C44771b implements C44772c {

    /* renamed from: a */
    private final C44772c f116714a;

    /* renamed from: b */
    private final float f116715b;

    public C44771b(float f, C44772c cVar) {
        while (cVar instanceof C44771b) {
            cVar = ((C44771b) cVar).f116714a;
            f += ((C44771b) cVar).f116715b;
        }
        this.f116714a = cVar;
        this.f116715b = f;
    }

    /* renamed from: a */
    public final float mo48107a(RectF rectF) {
        return Math.max(0.0f, this.f116714a.mo48107a(rectF) + this.f116715b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44771b)) {
            return false;
        }
        C44771b bVar = (C44771b) obj;
        return this.f116714a.equals(bVar.f116714a) && this.f116715b == bVar.f116715b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f116714a, Float.valueOf(this.f116715b)});
    }
}
