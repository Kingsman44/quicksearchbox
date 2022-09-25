package com.facebook.litho.p328f;

import android.graphics.PathEffect;
import com.facebook.litho.C6404n;
import java.util.Arrays;

/* renamed from: com.facebook.litho.f.a */
/* compiled from: PG */
public final class C6254a {

    /* renamed from: a */
    public float f18478a;

    /* renamed from: b */
    public float f18479b;

    /* renamed from: c */
    public float f18480c;

    /* renamed from: d */
    public float f18481d;

    /* renamed from: e */
    public int f18482e;

    /* renamed from: f */
    public int f18483f;

    /* renamed from: g */
    public int f18484g;

    /* renamed from: h */
    public int f18485h;

    /* renamed from: i */
    public PathEffect f18486i;

    /* renamed from: j */
    public float[] f18487j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C6254a aVar = (C6254a) obj;
            return aVar.f18478a == this.f18478a && aVar.f18479b == this.f18479b && aVar.f18480c == this.f18480c && aVar.f18481d == this.f18481d && this.f18482e == aVar.f18482e && this.f18483f == aVar.f18483f && this.f18484g == aVar.f18484g && this.f18485h == aVar.f18485h && C6404n.m17223b(this.f18486i, aVar.f18486i) && Arrays.equals(this.f18487j, aVar.f18487j);
        }
    }

    public final int hashCode() {
        int i = ((((((((((((((((int) this.f18478a) * 31) + ((int) this.f18479b)) * 31) + ((int) this.f18480c)) * 31) + ((int) this.f18481d)) * 31) + this.f18482e) * 31) + this.f18483f) * 31) + this.f18484g) * 31) + this.f18485h) * 31;
        PathEffect pathEffect = this.f18486i;
        return ((i + (pathEffect != null ? pathEffect.hashCode() : 0)) * 31) + Arrays.hashCode(this.f18487j);
    }
}
