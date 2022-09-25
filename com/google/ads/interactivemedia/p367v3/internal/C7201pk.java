package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.pk */
/* compiled from: PG */
final class C7201pk implements C7194pd {

    /* renamed from: a */
    final /* synthetic */ C7203pm f23485a;

    /* renamed from: b */
    private final aed f23486b = new aed(new byte[4]);

    public C7201pk(C7203pm pmVar) {
        this.f23485a = pmVar;
    }

    /* renamed from: a */
    public final void mo16255a(aes aes, C7056ka kaVar, C7207pq pqVar) {
    }

    /* renamed from: b */
    public final void mo16256b(aee aee) {
        if (aee.mo14560n() == 0 && (aee.mo14560n() & 128) != 0) {
            aee.mo14557k(6);
            int d = aee.mo14550d() / 4;
            for (int i = 0; i < d; i++) {
                aee.mo14558l(this.f23486b, 4);
                int i2 = this.f23486b.mo14532i(16);
                this.f23486b.mo14530g(3);
                if (i2 == 0) {
                    this.f23486b.mo14530g(13);
                } else {
                    int i3 = this.f23486b.mo14532i(13);
                    if (this.f23485a.f23499h.get(i3) == null) {
                        this.f23485a.f23499h.put(i3, new C7195pe(new C7202pl(this.f23485a, i3)));
                        C7203pm.m21492r(this.f23485a);
                    }
                }
            }
            if (this.f23485a.f23493b != 2) {
                this.f23485a.f23499h.remove(0);
            }
        }
    }
}
