package com.facebook.litho.p326e;

/* renamed from: com.facebook.litho.e.n */
/* compiled from: PG */
public final class C6225n extends C6226o implements C6223l {

    /* renamed from: e */
    private final long f18398e;

    /* renamed from: f */
    private long f18399f = Long.MIN_VALUE;

    /* renamed from: g */
    private long f18400g = Long.MIN_VALUE;

    /* renamed from: h */
    private long f18401h = Long.MIN_VALUE;

    public C6225n(int i) {
        this.f18398e = (long) i;
    }

    /* renamed from: a */
    public final float mo12765a(long j) {
        if (this.f18401h == Long.MIN_VALUE) {
            this.f18399f = j;
            this.f18401h = j;
            this.f18400g = j + (this.f18398e * 1000000);
            return 0.0f;
        }
        long j2 = this.f18400g;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        this.f18401h = j;
        if (i >= 0) {
            return 1.0f;
        }
        long j3 = this.f18399f;
        return ((float) (j - j3)) / ((float) (j2 - j3));
    }

    /* renamed from: b */
    public final boolean mo13183b() {
        return this.f18401h >= this.f18400g;
    }
}
