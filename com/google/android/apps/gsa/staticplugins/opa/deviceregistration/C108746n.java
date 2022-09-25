package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.n */
/* compiled from: PG */
final class C108746n extends C108727gs {

    /* renamed from: a */
    private final int f302425a;

    /* renamed from: b */
    private final String f302426b;

    public C108746n(int i, String str) {
        this.f302425a = i;
        this.f302426b = str;
    }

    /* renamed from: a */
    public final int mo97085a() {
        return this.f302425a;
    }

    /* renamed from: b */
    public final String mo97086b() {
        return this.f302426b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C108727gs) {
            C108727gs gsVar = (C108727gs) obj;
            return this.f302425a == gsVar.mo97085a() && this.f302426b.equals(gsVar.mo97086b());
        }
    }

    public final int hashCode() {
        return ((this.f302425a ^ 1000003) * 1000003) ^ this.f302426b.hashCode();
    }

    public final String toString() {
        int i = this.f302425a;
        String str = this.f302426b;
        return "TopicHeader{iconResId=" + i + ", topicText=" + str + "}";
    }
}
