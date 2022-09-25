package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.pe */
/* compiled from: PG */
public final class C7195pe implements C7208pr {

    /* renamed from: a */
    private final C7194pd f23462a;

    /* renamed from: b */
    private final aee f23463b = new aee(32);

    /* renamed from: c */
    private int f23464c;

    /* renamed from: d */
    private int f23465d;

    /* renamed from: e */
    private boolean f23466e;

    /* renamed from: f */
    private boolean f23467f;

    public C7195pe(C7194pd pdVar) {
        this.f23462a = pdVar;
    }

    /* renamed from: a */
    public final void mo16257a(aes aes, C7056ka kaVar, C7207pq pqVar) {
        this.f23462a.mo16255a(aes, kaVar, pqVar);
        this.f23467f = true;
    }

    /* renamed from: b */
    public final void mo16258b() {
        this.f23467f = true;
    }

    /* renamed from: c */
    public final void mo16259c(aee aee, int i) {
        int i2 = i & 1;
        int g = i2 != 0 ? aee.mo14553g() + aee.mo14560n() : -1;
        if (this.f23467f) {
            if (i2 != 0) {
                this.f23467f = false;
                aee.mo14554h(g);
                this.f23465d = 0;
            } else {
                return;
            }
        }
        while (aee.mo14550d() > 0) {
            int i3 = this.f23465d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int n = aee.mo14560n();
                    aee.mo14554h(aee.mo14553g() - 1);
                    if (n == 255) {
                        this.f23467f = true;
                        return;
                    }
                }
                int min = Math.min(aee.mo14550d(), 3 - this.f23465d);
                aee.mo14559m(this.f23463b.mo14555i(), this.f23465d, min);
                int i4 = this.f23465d + min;
                this.f23465d = i4;
                if (i4 == 3) {
                    this.f23463b.mo14547a(3);
                    this.f23463b.mo14557k(1);
                    int n2 = this.f23463b.mo14560n();
                    int n3 = this.f23463b.mo14560n();
                    this.f23466e = (n2 & 128) != 0;
                    this.f23464c = (((n2 & 15) << 8) | n3) + 3;
                    if (this.f23463b.mo14556j() < this.f23464c) {
                        byte[] i5 = this.f23463b.mo14555i();
                        aee aee2 = this.f23463b;
                        int i6 = this.f23464c;
                        int length = i5.length;
                        aee2.mo14547a(Math.min(4098, Math.max(i6, length + length)));
                        System.arraycopy(i5, 0, this.f23463b.mo14555i(), 0, 3);
                    }
                }
            } else {
                int min2 = Math.min(aee.mo14550d(), this.f23464c - this.f23465d);
                aee.mo14559m(this.f23463b.mo14555i(), this.f23465d, min2);
                int i7 = this.f23465d + min2;
                this.f23465d = i7;
                int i8 = this.f23464c;
                if (i7 != i8) {
                    continue;
                } else {
                    if (!this.f23466e) {
                        this.f23463b.mo14547a(i8);
                    } else if (aeu.m18524ao(this.f23463b.mo14555i(), this.f23464c) != 0) {
                        this.f23467f = true;
                        return;
                    } else {
                        this.f23463b.mo14547a(this.f23464c - 4);
                    }
                    this.f23462a.mo16256b(this.f23463b);
                    this.f23465d = 0;
                }
            }
        }
    }
}
