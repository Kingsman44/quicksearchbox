package com.google.android.gms.search.p10865b;

/* renamed from: com.google.android.gms.search.b.a */
/* compiled from: PG */
public final class C145861a extends C145864b {

    /* renamed from: a */
    public final int f394402a;

    public C145861a(int i) {
        this.f394402a = i;
    }

    /* renamed from: a */
    public final int mo122237a() {
        return this.f394402a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C145864b) && this.f394402a == ((C145864b) obj).mo122237a();
    }

    public final int hashCode() {
        return this.f394402a ^ 1000003;
    }

    public final String toString() {
        int i = this.f394402a;
        return "DocumentIdHash32{value=" + i + "}";
    }
}
