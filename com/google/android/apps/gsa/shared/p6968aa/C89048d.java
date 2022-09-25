package com.google.android.apps.gsa.shared.p6968aa;

/* renamed from: com.google.android.apps.gsa.shared.aa.d */
/* compiled from: PG */
final class C89048d extends C89065u {

    /* renamed from: b */
    private final int f241326b;

    /* renamed from: c */
    private final int f241327c;

    public C89048d(int i, int i2) {
        this.f241326b = i;
        this.f241327c = i2;
    }

    /* renamed from: a */
    public final int mo83015a() {
        return this.f241326b;
    }

    /* renamed from: b */
    public final int mo83016b() {
        return this.f241327c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C89065u) {
            C89065u uVar = (C89065u) obj;
            return this.f241326b == uVar.mo83015a() && this.f241327c == uVar.mo83016b();
        }
    }

    public final int hashCode() {
        return ((this.f241326b ^ 1000003) * 1000003) ^ this.f241327c;
    }

    public final String toString() {
        int i = this.f241326b;
        int i2 = this.f241327c;
        return "NetworkQuality{maximumRttMs=" + i + ", minimumThroughput=" + i2 + "}";
    }
}
