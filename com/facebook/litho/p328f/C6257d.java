package com.facebook.litho.p328f;

import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.litho.f.d */
/* compiled from: PG */
public final class C6257d {
    /* renamed from: a */
    public static boolean m16805a(Drawable drawable, Drawable drawable2) {
        if (drawable == null) {
            return drawable2 == null;
        }
        if (drawable2 == null) {
            return false;
        }
        if (!(drawable instanceof C6256c) || !(drawable2 instanceof C6256c)) {
            return drawable.equals(drawable2);
        }
        return ((C6256c) drawable).mo13241a((C6256c) drawable2);
    }
}
