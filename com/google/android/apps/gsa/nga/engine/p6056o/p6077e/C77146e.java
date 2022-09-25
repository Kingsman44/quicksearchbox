package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e */
/* compiled from: PG */
final class C77146e extends C76922bd {

    /* renamed from: a */
    public final boolean f212902a;

    /* renamed from: b */
    public final int f212903b;

    /* renamed from: c */
    public final int f212904c;

    /* renamed from: d */
    public final int f212905d;

    /* renamed from: e */
    public final int f212906e;

    /* renamed from: f */
    public final boolean f212907f;

    /* renamed from: g */
    public final int f212908g;

    public C77146e(boolean z, int i, int i2, int i3, int i4, boolean z2, int i5) {
        this.f212902a = z;
        this.f212903b = i;
        this.f212904c = i2;
        this.f212905d = i3;
        this.f212906e = i4;
        this.f212907f = z2;
        this.f212908g = i5;
    }

    /* renamed from: a */
    public final int mo72352a() {
        return this.f212908g;
    }

    /* renamed from: b */
    public final int mo72353b() {
        return this.f212906e;
    }

    /* renamed from: c */
    public final int mo72354c() {
        return this.f212905d;
    }

    /* renamed from: d */
    public final int mo72355d() {
        return this.f212904c;
    }

    /* renamed from: e */
    public final int mo72356e() {
        return this.f212903b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C76922bd) {
            C76922bd bdVar = (C76922bd) obj;
            return this.f212902a == bdVar.mo72358g() && this.f212903b == bdVar.mo72356e() && this.f212904c == bdVar.mo72355d() && this.f212905d == bdVar.mo72354c() && this.f212906e == bdVar.mo72353b() && this.f212907f == bdVar.mo72357f() && this.f212908g == bdVar.mo72352a();
        }
    }

    /* renamed from: f */
    public final boolean mo72357f() {
        return this.f212907f;
    }

    /* renamed from: g */
    public final boolean mo72358g() {
        return this.f212902a;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((((((true != this.f212902a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f212903b) * 1000003) ^ this.f212904c) * 1000003) ^ this.f212905d) * 1000003) ^ this.f212906e) * 1000003;
        if (true == this.f212907f) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ this.f212908g;
    }

    public final String toString() {
        boolean z = this.f212902a;
        int i = this.f212903b;
        int i2 = this.f212904c;
        int i3 = this.f212905d;
        int i4 = this.f212906e;
        boolean z2 = this.f212907f;
        int i5 = this.f212908g;
        return "NgaWinningFulfillment{isPrefetch=" + z + ", speechRecognizer=" + i + ", rewriter=" + i2 + ", intentGenerator=" + i3 + ", fulfiller=" + i4 + ", isOnDevice=" + z2 + ", cloudReason=" + i5 + "}";
    }
}
