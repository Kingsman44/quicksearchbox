package com.google.android.libraries.lens.p2014e;

/* renamed from: com.google.android.libraries.lens.e.l */
/* compiled from: PG */
final class C24220l extends C24203af {

    /* renamed from: a */
    private final long f66253a;

    public C24220l(long j) {
        this.f66253a = j;
    }

    /* renamed from: a */
    public final long mo29687a() {
        return this.f66253a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C24203af) && this.f66253a == ((C24203af) obj).mo29687a();
    }

    public final int hashCode() {
        long j = this.f66253a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }
}
