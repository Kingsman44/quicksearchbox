package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.h */
/* compiled from: PG */
final class C95435h extends C95395cs {

    /* renamed from: a */
    private final C58485gu f267038a;

    /* renamed from: b */
    private final int f267039b;

    /* renamed from: c */
    private final int f267040c;

    /* renamed from: d */
    private final int f267041d;

    public C95435h(int i, int i2, int i3, C58485gu guVar) {
        this.f267039b = i;
        this.f267040c = i2;
        this.f267041d = i3;
        this.f267038a = guVar;
    }

    /* renamed from: a */
    public final C58485gu mo89337a() {
        return this.f267038a;
    }

    /* renamed from: b */
    public final int mo89338b() {
        return this.f267039b;
    }

    /* renamed from: c */
    public final int mo89339c() {
        return this.f267040c;
    }

    /* renamed from: d */
    public final int mo89340d() {
        return this.f267041d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C95395cs) {
            C95395cs csVar = (C95395cs) obj;
            return this.f267039b == csVar.mo89338b() && this.f267040c == csVar.mo89339c() && this.f267041d == csVar.mo89340d() && C58597ky.m90218i(this.f267038a, csVar.mo89337a());
        }
    }

    public final int hashCode() {
        return ((((((this.f267039b ^ 1000003) * 1000003) ^ this.f267040c) * 1000003) ^ this.f267041d) * 1000003) ^ this.f267038a.hashCode();
    }

    public final String toString() {
        String num = Integer.toString(this.f267039b - 1);
        String num2 = Integer.toString(this.f267040c - 1);
        String num3 = Integer.toString(this.f267041d - 1);
        String obj = this.f267038a.toString();
        return "LedProtocolData{actionType=" + num + ", animationMode=" + num2 + ", colorId=" + num3 + ", colors=" + obj + "}";
    }
}
