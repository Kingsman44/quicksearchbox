package com.google.android.apps.gsa.shared.bisto;

/* renamed from: com.google.android.apps.gsa.shared.bisto.bc */
/* compiled from: PG */
public final class C89646bc {

    /* renamed from: a */
    private final int f242744a;

    /* renamed from: b */
    private final int f242745b;

    /* renamed from: c */
    private final long f242746c;

    /* renamed from: d */
    private final long f242747d;

    /* renamed from: e */
    private long f242748e;

    /* renamed from: f */
    private long f242749f = 0;

    public C89646bc(int i, int i2, long j, long j2) {
        this.f242744a = i;
        this.f242745b = i2;
        this.f242746c = j;
        this.f242747d = j2;
    }

    /* renamed from: a */
    public final long mo83534a() {
        long min = Math.min((long) this.f242745b, this.f242748e + 1);
        this.f242748e = min;
        long j = (long) (this.f242744a * (1 << ((int) (min - 1))));
        this.f242749f += j;
        return mo83536c() ? this.f242747d : j;
    }

    /* renamed from: b */
    public final void mo83535b() {
        this.f242748e = 0;
        this.f242749f = 0;
    }

    /* renamed from: c */
    public final boolean mo83536c() {
        long j = this.f242746c;
        return j >= 0 && this.f242749f >= j;
    }
}
