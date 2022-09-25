package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.cp */
/* compiled from: PG */
public final class C32674cp {

    /* renamed from: a */
    public final int f87569a;

    /* renamed from: b */
    private final int f87570b;

    /* renamed from: c */
    private final int f87571c;

    public C32674cp(int i, int i2, int i3) {
        this.f87569a = i;
        this.f87570b = i2;
        this.f87571c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32674cp)) {
            return false;
        }
        C32674cp cpVar = (C32674cp) obj;
        return this.f87569a == cpVar.f87569a && this.f87570b == cpVar.f87570b && this.f87571c == cpVar.f87571c;
    }

    public final int hashCode() {
        return (((this.f87569a * 31) + this.f87570b) * 31) + this.f87571c;
    }

    public final String toString() {
        int i = this.f87569a;
        int i2 = this.f87570b;
        int i3 = this.f87571c;
        return "StateCount(ready=" + i + ", connecting=" + i2 + ", disconnected=" + i3 + ")";
    }
}
