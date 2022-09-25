package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.ao */
/* compiled from: PG */
final class C80659ao extends C80701cc {

    /* renamed from: b */
    private final boolean f221425b;

    /* renamed from: c */
    private final C80700cb f221426c;

    /* renamed from: d */
    private final boolean f221427d;

    /* renamed from: e */
    private final boolean f221428e;

    public C80659ao(boolean z, C80700cb cbVar, boolean z2, boolean z3) {
        this.f221425b = z;
        this.f221426c = cbVar;
        this.f221427d = z2;
        this.f221428e = z3;
    }

    /* renamed from: a */
    public final C80700cb mo74438a() {
        return this.f221426c;
    }

    /* renamed from: b */
    public final boolean mo74439b() {
        return this.f221427d;
    }

    /* renamed from: c */
    public final boolean mo74440c() {
        return this.f221428e;
    }

    /* renamed from: d */
    public final boolean mo74441d() {
        return this.f221425b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C80701cc) {
            C80701cc ccVar = (C80701cc) obj;
            return this.f221425b == ccVar.mo74441d() && this.f221426c.equals(ccVar.mo74438a()) && this.f221427d == ccVar.mo74439b() && this.f221428e == ccVar.mo74440c();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = ((((((true != this.f221425b ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f221426c.hashCode()) * 1000003) ^ (true != this.f221427d ? 1237 : 1231)) * 1000003;
        if (true == this.f221428e) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        boolean z = this.f221425b;
        String valueOf = String.valueOf(this.f221426c);
        boolean z2 = this.f221427d;
        boolean z3 = this.f221428e;
        return "Card{isVisible=" + z + ", color=" + valueOf + ", animateTransition=" + z2 + ", forcesScrim=" + z3 + "}";
    }
}
