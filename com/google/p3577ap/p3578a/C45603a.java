package com.google.p3577ap.p3578a;

/* renamed from: com.google.ap.a.a */
/* compiled from: PG */
public final class C45603a extends C45606d {

    /* renamed from: a */
    public final int f119949a;

    /* renamed from: b */
    public final int f119950b;

    public C45603a(int i, int i2) {
        this.f119949a = i;
        this.f119950b = i2;
    }

    /* renamed from: a */
    public final int mo49681a() {
        return this.f119949a;
    }

    /* renamed from: b */
    public final int mo49682b() {
        return this.f119950b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45606d) {
            C45606d dVar = (C45606d) obj;
            return this.f119949a == dVar.mo49681a() && this.f119950b == dVar.mo49682b();
        }
    }

    public final int hashCode() {
        return ((this.f119949a ^ 1000003) * 1000003) ^ this.f119950b;
    }

    public final String toString() {
        int i = this.f119949a;
        int i2 = this.f119950b;
        return "PlacementInfo{column=" + i + ", position=" + i2 + "}";
    }
}
