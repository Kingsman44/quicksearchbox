package com.google.android.apps.gsa.staticplugins.p7686co;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.b */
/* compiled from: PG */
final class C98171b extends C98145aa {

    /* renamed from: a */
    private final String f274132a;

    /* renamed from: b */
    private final long f274133b;

    public C98171b(String str, long j) {
        this.f274132a = str;
        this.f274133b = j;
    }

    /* renamed from: a */
    public final long mo90984a() {
        return this.f274133b;
    }

    /* renamed from: b */
    public final String mo90985b() {
        return this.f274132a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C98145aa) {
            C98145aa aaVar = (C98145aa) obj;
            return this.f274132a.equals(aaVar.mo90985b()) && this.f274133b == aaVar.mo90984a();
        }
    }

    public final int hashCode() {
        int hashCode = this.f274132a.hashCode();
        long j = this.f274133b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str = this.f274132a;
        long j = this.f274133b;
        return "RefreshEvent{eventName=" + str + ", timestamp=" + j + "}";
    }
}
