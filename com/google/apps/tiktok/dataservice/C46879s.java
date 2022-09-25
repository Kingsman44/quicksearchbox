package com.google.apps.tiktok.dataservice;

/* renamed from: com.google.apps.tiktok.dataservice.s */
/* compiled from: PG */
final class C46879s extends C46763cg {

    /* renamed from: a */
    public final long f122317a;

    public C46879s(long j) {
        this.f122317a = j;
    }

    /* renamed from: a */
    public final long mo50776a() {
        return this.f122317a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C46763cg) && this.f122317a == ((C46763cg) obj).mo50776a();
    }

    public final int hashCode() {
        long j = this.f122317a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        long j = this.f122317a;
        return "FetchTaskIdentifier{index=" + j + "}";
    }
}
