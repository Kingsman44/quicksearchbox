package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.mi */
/* compiled from: PG */
final class C7118mi implements C7116mg {

    /* renamed from: a */
    private final int f22925a;

    /* renamed from: b */
    private final int f22926b;

    /* renamed from: c */
    private final aee f22927c;

    public C7118mi(C7113md mdVar) {
        aee aee = mdVar.f22910a;
        this.f22927c = aee;
        aee.mo14554h(12);
        int B = aee.mo14538B();
        this.f22925a = B == 0 ? -1 : B;
        this.f22926b = aee.mo14538B();
    }

    /* renamed from: a */
    public final int mo16173a() {
        return this.f22926b;
    }

    /* renamed from: b */
    public final int mo16174b() {
        return this.f22925a;
    }

    /* renamed from: c */
    public final int mo16175c() {
        int i = this.f22925a;
        return i == -1 ? this.f22927c.mo14538B() : i;
    }
}
