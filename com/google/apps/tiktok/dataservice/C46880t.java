package com.google.apps.tiktok.dataservice;

/* renamed from: com.google.apps.tiktok.dataservice.t */
/* compiled from: PG */
final class C46880t extends C46769cm {

    /* renamed from: a */
    public final long f122318a;

    public C46880t(long j) {
        this.f122318a = j;
    }

    /* renamed from: a */
    public final long mo50781a() {
        return this.f122318a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C46769cm) && this.f122318a == ((C46769cm) obj).mo50781a();
    }

    public final int hashCode() {
        long j = this.f122318a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        long j = this.f122318a;
        return "LoadTaskIdentifier{index=" + j + "}";
    }
}
