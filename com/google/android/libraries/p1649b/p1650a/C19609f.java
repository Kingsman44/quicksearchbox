package com.google.android.libraries.p1649b.p1650a;

import com.google.common.p4552o.p4566l.C60214n;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.b.a.f */
/* compiled from: PG */
public final class C19609f {

    /* renamed from: a */
    public final int f54564a;

    /* renamed from: b */
    public final int f54565b;

    /* renamed from: c */
    public final int f54566c;

    /* renamed from: d */
    public final int f54567d;

    /* renamed from: e */
    public final C60214n f54568e;

    /* renamed from: f */
    public final int f54569f;

    public C19609f(int i, int i2, int i3, int i4, C60214n nVar, int i5) {
        this.f54564a = i;
        this.f54565b = i2;
        this.f54566c = i4;
        this.f54567d = i3;
        this.f54568e = nVar;
        this.f54569f = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && C19609f.class.isAssignableFrom(obj.getClass())) {
            C19609f fVar = (C19609f) obj;
            return this.f54566c == fVar.f54566c && this.f54567d == fVar.f54567d && this.f54564a == fVar.f54564a && this.f54565b == fVar.f54565b && this.f54569f == fVar.f54569f && Objects.equals(this.f54568e, fVar.f54568e);
        }
    }

    public final int hashCode() {
        return ((((((((((this.f54566c + 527) * 31) + this.f54567d) * 31) + this.f54564a) * 31) + this.f54565b) * 31) + this.f54569f) * 31) + Objects.hashCode(this.f54568e);
    }

    public final String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = Integer.valueOf(this.f54569f);
        C60214n nVar = this.f54568e;
        objArr[1] = nVar != null ? nVar.toString() : null;
        objArr[2] = Integer.valueOf(this.f54566c);
        objArr[3] = Integer.valueOf(this.f54567d);
        objArr[4] = Integer.valueOf(this.f54564a);
        objArr[5] = Integer.valueOf(this.f54565b);
        return String.format("<%d, %s> (%d,%d) %dx%d", objArr);
    }
}
