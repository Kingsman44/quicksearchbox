package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.bi */
/* compiled from: PG */
final class C80680bi extends C80762ej {

    /* renamed from: b */
    private final boolean f221516b;

    /* renamed from: c */
    private final boolean f221517c;

    /* renamed from: d */
    private final boolean f221518d;

    /* renamed from: e */
    private final boolean f221519e;

    public C80680bi(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f221516b = z;
        this.f221517c = z2;
        this.f221518d = z3;
        this.f221519e = z4;
    }

    /* renamed from: a */
    public final boolean mo74562a() {
        return this.f221517c;
    }

    /* renamed from: b */
    public final boolean mo74563b() {
        return this.f221516b;
    }

    /* renamed from: c */
    public final boolean mo74564c() {
        return this.f221519e;
    }

    /* renamed from: d */
    public final boolean mo74565d() {
        return this.f221518d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C80762ej) {
            C80762ej ejVar = (C80762ej) obj;
            return this.f221516b == ejVar.mo74563b() && this.f221517c == ejVar.mo74562a() && this.f221518d == ejVar.mo74565d() && this.f221519e == ejVar.mo74564c();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((true != this.f221516b ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.f221517c ? 1237 : 1231)) * 1000003) ^ (true != this.f221518d ? 1237 : 1231)) * 1000003;
        if (true == this.f221519e) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.f221516b;
        boolean z2 = this.f221517c;
        boolean z3 = this.f221518d;
        boolean z4 = this.f221519e;
        return "ScreenState{lockScreen=" + z + ", homeScreen=" + z2 + ", screenOn=" + z3 + ", opaCardVisible=" + z4 + "}";
    }
}
