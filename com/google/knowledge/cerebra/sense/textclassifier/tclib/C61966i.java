package com.google.knowledge.cerebra.sense.textclassifier.tclib;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.i */
/* compiled from: PG */
final class C61966i extends C61916bz {

    /* renamed from: a */
    private final String f167440a;

    /* renamed from: b */
    private final int f167441b;

    /* renamed from: c */
    private final int f167442c;

    /* renamed from: d */
    private final int f167443d;

    /* renamed from: e */
    private final float f167444e;

    public C61966i(String str, int i, int i2, int i3, float f) {
        if (str != null) {
            this.f167440a = str;
            this.f167441b = i;
            this.f167442c = i2;
            this.f167443d = i3;
            this.f167444e = f;
            return;
        }
        throw new NullPointerException("Null type");
    }

    /* renamed from: a */
    public final float mo58354a() {
        return this.f167444e;
    }

    /* renamed from: b */
    public final int mo58355b() {
        return this.f167443d;
    }

    /* renamed from: c */
    public final int mo58356c() {
        return this.f167441b;
    }

    /* renamed from: d */
    public final int mo58357d() {
        return this.f167442c;
    }

    /* renamed from: e */
    public final String mo58358e() {
        return this.f167440a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C61916bz) {
            C61916bz bzVar = (C61916bz) obj;
            return this.f167440a.equals(bzVar.mo58358e()) && this.f167441b == bzVar.mo58356c() && this.f167442c == bzVar.mo58357d() && this.f167443d == bzVar.mo58355b() && Float.floatToIntBits(this.f167444e) == Float.floatToIntBits(bzVar.mo58354a());
        }
    }

    public final int hashCode() {
        return ((((((((this.f167440a.hashCode() ^ 1000003) * 1000003) ^ this.f167441b) * 1000003) ^ this.f167442c) * 1000003) ^ this.f167443d) * 1000003) ^ Float.floatToIntBits(this.f167444e);
    }

    public final String toString() {
        String str = this.f167440a;
        int i = this.f167441b;
        int i2 = this.f167442c;
        int i3 = this.f167443d;
        float f = this.f167444e;
        return "Slot{type=" + str + ", messageIndex=" + i + ", startIndex=" + i2 + ", endIndex=" + i3 + ", confidenceScore=" + f + "}";
    }
}
