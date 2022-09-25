package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.y */
/* compiled from: PG */
final class C82017y extends C81969af {

    /* renamed from: a */
    private final int f224216a;

    /* renamed from: b */
    private final float f224217b;

    public C82017y(int i, float f) {
        this.f224216a = i;
        this.f224217b = f;
    }

    /* renamed from: a */
    public final float mo75419a() {
        return this.f224217b;
    }

    /* renamed from: b */
    public final int mo75420b() {
        return this.f224216a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C81969af) {
            C81969af afVar = (C81969af) obj;
            return this.f224216a == afVar.mo75420b() && Float.floatToIntBits(this.f224217b) == Float.floatToIntBits(afVar.mo75419a());
        }
    }

    public final int hashCode() {
        return ((this.f224216a ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f224217b);
    }

    public final String toString() {
        int i = this.f224216a;
        float f = this.f224217b;
        return "ColorAtPosition{color=" + i + ", position=" + f + "}";
    }
}
