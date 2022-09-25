package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.ap */
/* compiled from: PG */
public final class C80660ap extends C80703ce {

    /* renamed from: a */
    private final boolean f221429a;

    /* renamed from: b */
    private final int f221430b;

    public C80660ap(boolean z, int i) {
        this.f221429a = z;
        this.f221430b = i;
    }

    /* renamed from: a */
    public final boolean mo74445a() {
        return this.f221429a;
    }

    /* renamed from: b */
    public final int mo74446b() {
        return this.f221430b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C80703ce) {
            C80703ce ceVar = (C80703ce) obj;
            return this.f221429a == ceVar.mo74445a() && this.f221430b == ceVar.mo74446b();
        }
    }

    public final int hashCode() {
        return (((true != this.f221429a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f221430b;
    }

    public final String toString() {
        boolean z = this.f221429a;
        int i = this.f221430b;
        return "ClearText{showAnimation=" + z + ", active=" + C80702cd.m128489a(i) + "}";
    }
}
