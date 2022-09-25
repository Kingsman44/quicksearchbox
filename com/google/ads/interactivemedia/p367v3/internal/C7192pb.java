package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.pb */
/* compiled from: PG */
final class C7192pb {

    /* renamed from: a */
    private final C7171oh f23442a;

    /* renamed from: b */
    private final aes f23443b;

    /* renamed from: c */
    private final aed f23444c = new aed(new byte[64]);

    /* renamed from: d */
    private boolean f23445d;

    /* renamed from: e */
    private boolean f23446e;

    /* renamed from: f */
    private boolean f23447f;

    /* renamed from: g */
    private int f23448g;

    /* renamed from: h */
    private long f23449h;

    public C7192pb(C7171oh ohVar, aes aes) {
        this.f23442a = ohVar;
        this.f23443b = aes;
    }

    /* renamed from: a */
    public final void mo16270a() {
        this.f23447f = false;
        this.f23442a.mo16215a();
    }

    /* renamed from: b */
    public final void mo16271b(aee aee) {
        aee.mo14559m(this.f23444c.f20421a, 0, 3);
        this.f23444c.mo14528e(0);
        this.f23444c.mo14530g(8);
        this.f23445d = this.f23444c.mo14531h();
        this.f23446e = this.f23444c.mo14531h();
        this.f23444c.mo14530g(6);
        int i = this.f23444c.mo14532i(8);
        this.f23448g = i;
        aee.mo14559m(this.f23444c.f20421a, 0, i);
        this.f23444c.mo14528e(0);
        long j = 0;
        this.f23449h = 0;
        if (this.f23445d) {
            this.f23444c.mo14530g(4);
            int i2 = this.f23444c.mo14532i(3);
            this.f23444c.mo14530g(1);
            int i3 = this.f23444c.mo14532i(15);
            this.f23444c.mo14530g(1);
            long i4 = (((long) i2) << 30) | ((long) (i3 << 15)) | ((long) this.f23444c.mo14532i(15));
            this.f23444c.mo14530g(1);
            if (!this.f23447f && this.f23446e) {
                this.f23444c.mo14530g(4);
                int i5 = this.f23444c.mo14532i(3);
                this.f23444c.mo14530g(1);
                int i6 = this.f23444c.mo14532i(15);
                this.f23444c.mo14530g(1);
                int i7 = this.f23444c.mo14532i(15);
                this.f23444c.mo14530g(1);
                this.f23443b.mo14602f((((long) i5) << 30) | ((long) (i6 << 15)) | ((long) i7));
                this.f23447f = true;
            }
            j = this.f23443b.mo14602f(i4);
            this.f23449h = j;
        }
        this.f23442a.mo16217c(j, 4);
        this.f23442a.mo16218d(aee);
        this.f23442a.mo16219e();
    }
}
