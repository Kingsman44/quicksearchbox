package com.google.android.libraries.lens.common.text.selection.p2008c;

import android.graphics.Rect;
import com.google.common.base.C58838bb;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.common.text.selection.c.a */
/* compiled from: PG */
public final class C24151a {

    /* renamed from: a */
    public final Rect f65943a;

    /* renamed from: b */
    public final float f65944b;

    public C24151a(Rect rect, float f) {
        this.f65943a = rect;
        this.f65944b = f;
    }

    /* renamed from: a */
    public static float m44877a(float f) {
        C58838bb.m90868c(f <= 360.0f);
        return f > 180.0f ? f - 0.012451172f : f;
    }

    /* renamed from: b */
    public static boolean m44878b(float f, float f2) {
        return Math.abs(m44877a(f) - m44877a(f2)) <= 0.1f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C24151a aVar = (C24151a) obj;
            return aVar.f65943a.equals(this.f65943a) && m44878b(aVar.f65944b, this.f65944b);
        }
    }

    public final int hashCode() {
        return this.f65943a.hashCode() + (((int) this.f65944b) * 31);
    }

    public final String toString() {
        return String.format(Locale.US, "%s, %.5f", new Object[]{this.f65943a, Float.valueOf(this.f65944b)});
    }
}
