package com.google.android.libraries.p10908a.p10911c.p10914c;

import android.content.res.Resources;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5477g.C69678a;

/* renamed from: com.google.android.libraries.a.c.c.b */
/* compiled from: PG */
public final class C146644b {

    /* renamed from: a */
    public final int f396087a;

    /* renamed from: b */
    public final int f396088b;

    /* renamed from: c */
    private final float f396089c;

    /* renamed from: d */
    private final float f396090d;

    public C146644b(float f, float f2) {
        this.f396089c = f;
        this.f396090d = f2;
        this.f396087a = C69678a.m101088a(f * Resources.getSystem().getDisplayMetrics().density);
        this.f396088b = C69678a.m101088a(f2 * Resources.getSystem().getDisplayMetrics().density);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C146644b)) {
            return false;
        }
        C146644b bVar = (C146644b) obj;
        return C69664n.m101066l(Float.valueOf(this.f396089c), Float.valueOf(bVar.f396089c)) && C69664n.m101066l(Float.valueOf(this.f396090d), Float.valueOf(bVar.f396090d));
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f396089c) * 31) + Float.floatToIntBits(this.f396090d);
    }

    public final String toString() {
        float f = this.f396089c;
        float f2 = this.f396090d;
        return "WidgetSize(widthDp=" + f + ", heightDp=" + f2 + ")";
    }
}
