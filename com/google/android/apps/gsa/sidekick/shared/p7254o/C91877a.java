package com.google.android.apps.gsa.sidekick.shared.p7254o;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.o.a */
/* compiled from: PG */
public final class C91877a extends C91883g {

    /* renamed from: a */
    public final int f256199a;

    public C91877a(int i) {
        this.f256199a = i;
    }

    /* renamed from: a */
    public final int mo86407a() {
        return 5;
    }

    /* renamed from: b */
    public final int mo86408b() {
        return this.f256199a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C91883g) {
            C91883g gVar = (C91883g) obj;
            return this.f256199a == gVar.mo86408b() && gVar.mo86407a() == 5;
        }
    }

    public final int hashCode() {
        return ((this.f256199a ^ 1000003) * 1000003) ^ 5;
    }

    public final String toString() {
        int i = this.f256199a;
        return "Thresholds{viewVisibilityThreshold=" + i + ", scrollVelocityThreshold=5}";
    }
}
