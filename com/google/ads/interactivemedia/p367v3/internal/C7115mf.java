package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.mf */
/* compiled from: PG */
final class C7115mf {

    /* renamed from: a */
    public final int f22912a;

    /* renamed from: b */
    public int f22913b;

    /* renamed from: c */
    public int f22914c;

    /* renamed from: d */
    public long f22915d;

    /* renamed from: e */
    private final boolean f22916e;

    /* renamed from: f */
    private final aee f22917f;

    /* renamed from: g */
    private final aee f22918g;

    /* renamed from: h */
    private int f22919h;

    /* renamed from: i */
    private int f22920i;

    public C7115mf(aee aee, aee aee2, boolean z) {
        this.f22918g = aee;
        this.f22917f = aee2;
        this.f22916e = z;
        aee2.mo14554h(12);
        this.f22912a = aee2.mo14538B();
        aee.mo14554h(12);
        this.f22920i = aee.mo14538B();
        ary.m19465r(aee.mo14568v() != 1 ? false : true, "first_chunk must be 1");
        this.f22913b = -1;
    }

    /* renamed from: a */
    public final boolean mo16172a() {
        long j;
        int i = this.f22913b + 1;
        this.f22913b = i;
        if (i == this.f22912a) {
            return false;
        }
        if (this.f22916e) {
            j = this.f22917f.mo14540D();
        } else {
            j = this.f22917f.mo14566t();
        }
        this.f22915d = j;
        if (this.f22913b == this.f22919h) {
            this.f22914c = this.f22918g.mo14538B();
            this.f22918g.mo14557k(4);
            int i2 = -1;
            int i3 = this.f22920i - 1;
            this.f22920i = i3;
            if (i3 > 0) {
                i2 = -1 + this.f22918g.mo14538B();
            }
            this.f22919h = i2;
        }
        return true;
    }
}
