package com.google.ads.interactivemedia.p367v3.internal;

import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.ads.interactivemedia.v3.internal.mj */
/* compiled from: PG */
final class C7119mj implements C7116mg {

    /* renamed from: a */
    private final aee f22928a;

    /* renamed from: b */
    private final int f22929b;

    /* renamed from: c */
    private final int f22930c;

    /* renamed from: d */
    private int f22931d;

    /* renamed from: e */
    private int f22932e;

    public C7119mj(C7113md mdVar) {
        aee aee = mdVar.f22910a;
        this.f22928a = aee;
        aee.mo14554h(12);
        this.f22930c = aee.mo14538B() & PrivateKeyType.INVALID;
        this.f22929b = aee.mo14538B();
    }

    /* renamed from: a */
    public final int mo16173a() {
        return this.f22929b;
    }

    /* renamed from: b */
    public final int mo16174b() {
        return -1;
    }

    /* renamed from: c */
    public final int mo16175c() {
        int i = this.f22930c;
        if (i == 8) {
            return this.f22928a.mo14560n();
        }
        if (i == 16) {
            return this.f22928a.mo14561o();
        }
        int i2 = this.f22931d;
        this.f22931d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f22932e & 15;
        }
        int n = this.f22928a.mo14560n();
        this.f22932e = n;
        return (n & 240) >> 4;
    }
}
