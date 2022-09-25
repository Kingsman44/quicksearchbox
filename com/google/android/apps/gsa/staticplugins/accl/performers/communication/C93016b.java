package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.b */
/* compiled from: PG */
final class C93016b extends C93019bc {

    /* renamed from: a */
    private final int f259473a;

    /* renamed from: b */
    private final int f259474b;

    public C93016b(int i, int i2) {
        this.f259473a = i;
        this.f259474b = i2;
    }

    /* renamed from: a */
    public final int mo87520a() {
        return this.f259473a;
    }

    /* renamed from: b */
    public final int mo87521b() {
        return this.f259474b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C93019bc) {
            C93019bc bcVar = (C93019bc) obj;
            return this.f259473a == bcVar.mo87520a() && this.f259474b == bcVar.mo87521b();
        }
    }

    public final int hashCode() {
        return ((this.f259473a ^ 1000003) * 1000003) ^ this.f259474b;
    }

    public final String toString() {
        int i = this.f259473a;
        int i2 = this.f259474b;
        return "SliceRange{beginMs=" + i + ", endMs=" + i2 + "}";
    }
}
