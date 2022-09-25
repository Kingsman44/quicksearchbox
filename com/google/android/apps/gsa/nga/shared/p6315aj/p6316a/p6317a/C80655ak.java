package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.ak */
/* compiled from: PG */
public final class C80655ak extends C80803i {

    /* renamed from: b */
    public final float f221413b;

    public C80655ak(float f) {
        this.f221413b = f;
    }

    /* renamed from: a */
    public final float mo74420a() {
        return this.f221413b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C80803i) && Float.floatToIntBits(this.f221413b) == Float.floatToIntBits(((C80803i) obj).mo74420a());
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f221413b) ^ 1000003;
    }

    public final String toString() {
        float f = this.f221413b;
        return "AudioInfo{speechConfidence=" + f + "}";
    }
}
