package com.google.android.apps.gsa.opaonboarding;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.opaonboarding.p */
/* compiled from: PG */
final class C83949p extends C83903bi {

    /* renamed from: a */
    private final int f228686a;

    /* renamed from: b */
    private final C58833ax f228687b;

    /* renamed from: c */
    private final int f228688c;

    public C83949p(int i, C58833ax axVar, int i2) {
        this.f228686a = i;
        this.f228687b = axVar;
        this.f228688c = i2;
    }

    /* renamed from: a */
    public final int mo77307a() {
        return this.f228688c;
    }

    /* renamed from: b */
    public final int mo77308b() {
        return this.f228686a;
    }

    /* renamed from: c */
    public final C58833ax mo77309c() {
        return this.f228687b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C83903bi) {
            C83903bi biVar = (C83903bi) obj;
            return this.f228686a == biVar.mo77308b() && this.f228687b.equals(biVar.mo77309c()) && this.f228688c == biVar.mo77307a();
        }
    }

    public final int hashCode() {
        return ((((this.f228686a ^ 1000003) * 1000003) ^ this.f228687b.hashCode()) * 1000003) ^ this.f228688c;
    }

    public final String toString() {
        int i = this.f228686a;
        String valueOf = String.valueOf(this.f228687b);
        int i2 = this.f228688c;
        return "SequenceResult{resultCode=" + i + ", data=" + valueOf + ", exitAnimationResId=" + i2 + "}";
    }
}
