package com.google.android.gms.car;

/* renamed from: com.google.android.gms.car.d */
/* compiled from: PG */
public final class C143171d extends C143177dd {

    /* renamed from: a */
    public final boolean f388218a;

    /* renamed from: b */
    public final boolean f388219b;

    /* renamed from: c */
    public final boolean f388220c;

    /* renamed from: d */
    public final int f388221d;

    /* renamed from: e */
    public final int f388222e;

    public C143171d(boolean z, boolean z2, boolean z3, int i, int i2) {
        this.f388218a = z;
        this.f388219b = z2;
        this.f388220c = z3;
        this.f388221d = i;
        this.f388222e = i2;
    }

    /* renamed from: a */
    public final int mo118133a() {
        return this.f388221d;
    }

    /* renamed from: b */
    public final int mo118134b() {
        return this.f388222e;
    }

    /* renamed from: c */
    public final boolean mo118135c() {
        return this.f388220c;
    }

    /* renamed from: d */
    public final boolean mo118136d() {
        return this.f388218a;
    }

    /* renamed from: e */
    public final boolean mo118137e() {
        return this.f388219b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C143177dd) {
            C143177dd ddVar = (C143177dd) obj;
            return this.f388218a == ddVar.mo118136d() && this.f388219b == ddVar.mo118137e() && this.f388220c == ddVar.mo118135c() && this.f388221d == ddVar.mo118133a() && this.f388222e == ddVar.mo118134b();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((true != this.f388218a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.f388219b ? 1237 : 1231)) * 1000003;
        if (true == this.f388220c) {
            i = 1231;
        }
        return ((((i2 ^ i) * 1000003) ^ this.f388221d) * 1000003) ^ this.f388222e;
    }

    public final String toString() {
        boolean z = this.f388218a;
        boolean z2 = this.f388219b;
        boolean z3 = this.f388220c;
        int i = this.f388221d;
        int i2 = this.f388222e;
        return "Options{useConfigurationContext=" + z + ", waitUntilPresentationConfigured=" + z2 + ", crashIfUnableToConfigure=" + z3 + ", delayBetweenConfigChecks=" + i + ", maxConfigChecks=" + i2 + "}";
    }
}
