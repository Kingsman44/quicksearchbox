package com.google.android.libraries.lens.common.text.selection.p2006a;

import android.graphics.Rect;

/* renamed from: com.google.android.libraries.lens.common.text.selection.a.b */
/* compiled from: PG */
public final class C24144b extends C24146d {

    /* renamed from: a */
    public final String f65925a;

    /* renamed from: b */
    public final int f65926b;

    /* renamed from: c */
    public final int f65927c;

    /* renamed from: d */
    public final int f65928d;

    /* renamed from: e */
    public final int f65929e;

    /* renamed from: f */
    private final String f65930f;

    /* renamed from: g */
    private final String f65931g;

    /* renamed from: h */
    private final Rect f65932h;

    /* renamed from: i */
    private final float f65933i;

    public C24144b(String str, String str2, String str3, Rect rect, float f, int i, int i2, int i3, int i4) {
        this.f65925a = str;
        this.f65930f = str2;
        this.f65931g = str3;
        this.f65932h = rect;
        this.f65933i = f;
        this.f65926b = i;
        this.f65927c = i2;
        this.f65928d = i3;
        this.f65929e = i4;
    }

    /* renamed from: a */
    public final float mo29548a() {
        return this.f65933i;
    }

    /* renamed from: b */
    public final int mo29549b() {
        return this.f65927c;
    }

    /* renamed from: c */
    public final int mo29550c() {
        return this.f65928d;
    }

    /* renamed from: d */
    public final int mo29551d() {
        return this.f65926b;
    }

    /* renamed from: e */
    public final Rect mo29552e() {
        return this.f65932h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24146d) {
            C24146d dVar = (C24146d) obj;
            return this.f65925a.equals(dVar.mo29554f()) && this.f65930f.equals(dVar.mo29555g()) && this.f65931g.equals(dVar.mo29556h()) && this.f65932h.equals(dVar.mo29552e()) && Float.floatToIntBits(this.f65933i) == Float.floatToIntBits(dVar.mo29548a()) && this.f65926b == dVar.mo29551d() && this.f65927c == dVar.mo29549b() && this.f65928d == dVar.mo29550c() && this.f65929e == dVar.mo29558i();
        }
    }

    /* renamed from: f */
    public final String mo29554f() {
        return this.f65925a;
    }

    /* renamed from: g */
    public final String mo29555g() {
        return this.f65930f;
    }

    /* renamed from: h */
    public final String mo29556h() {
        return this.f65931g;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f65925a.hashCode() ^ 1000003) * 1000003) ^ this.f65930f.hashCode()) * 1000003) ^ this.f65931g.hashCode()) * 1000003) ^ this.f65932h.hashCode()) * 1000003) ^ Float.floatToIntBits(this.f65933i)) * 1000003) ^ this.f65926b) * 1000003) ^ this.f65927c) * 1000003) ^ this.f65928d) * 1000003) ^ this.f65929e;
    }

    /* renamed from: i */
    public final int mo29558i() {
        return this.f65929e;
    }
}
