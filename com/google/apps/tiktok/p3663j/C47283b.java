package com.google.apps.tiktok.p3663j;

/* renamed from: com.google.apps.tiktok.j.b */
/* compiled from: PG */
final class C47283b extends C47349g {

    /* renamed from: a */
    private final C47350h f122933a;

    /* renamed from: b */
    private final long f122934b;

    public C47283b(C47350h hVar, long j) {
        if (hVar != null) {
            this.f122933a = hVar;
            this.f122934b = j;
            return;
        }
        throw new NullPointerException("Null constraintType");
    }

    /* renamed from: a */
    public final long mo51163a() {
        return this.f122934b;
    }

    /* renamed from: b */
    public final C47350h mo51164b() {
        return this.f122933a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C47349g) {
            C47349g gVar = (C47349g) obj;
            return this.f122933a.equals(gVar.mo51164b()) && this.f122934b == gVar.mo51163a();
        }
    }

    public final int hashCode() {
        int hashCode = this.f122933a.hashCode();
        long j = this.f122934b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String obj = this.f122933a.toString();
        long j = this.f122934b;
        return "SyncConstraint{constraintType=" + obj + ", applicablePeriod=" + j + "}";
    }
}
