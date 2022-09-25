package com.google.android.libraries.elements.interfaces;

import android.graphics.drawable.Drawable;
import com.facebook.litho.C6179d;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.elements.interfaces.by */
/* compiled from: PG */
public final class C21282by {

    /* renamed from: a */
    public float f59598a = 0.0f;

    /* renamed from: b */
    public int f59599b = 0;

    /* renamed from: c */
    public C6179d f59600c = null;

    /* renamed from: d */
    public RectCornersProxy f59601d;

    /* renamed from: e */
    public Drawable f59602e = null;

    public final boolean equals(Object obj) {
        if (obj instanceof C21282by) {
            C21282by byVar = (C21282by) obj;
            if (Objects.equals(this.f59602e, byVar.f59602e)) {
                if (((long) (Float.valueOf(this.f59598a).floatValue() * 10000.0f)) == ((long) (Float.valueOf(byVar.f59598a).floatValue() * 10000.0f)) && Objects.equals(this.f59600c, byVar.f59600c) && this.f59599b == byVar.f59599b) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f59602e, Float.valueOf(this.f59598a), this.f59600c, Integer.valueOf(this.f59599b));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f59602e);
        float f = this.f59598a;
        String valueOf2 = String.valueOf(this.f59600c);
        int i = this.f59599b;
        return "StyleBuilderImpl(backgroundDrawable:" + valueOf + ", cornerRadiusPx:" + f + ", border:" + valueOf2 + ", borderColor:" + i + ")";
    }
}
