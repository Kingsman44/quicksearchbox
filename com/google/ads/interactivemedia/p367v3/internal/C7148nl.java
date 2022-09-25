package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.nl */
/* compiled from: PG */
final class C7148nl {

    /* renamed from: a */
    private final C7149nm f23101a = new C7149nm();

    /* renamed from: b */
    private final aee f23102b = new aee(new byte[65025], 0);

    /* renamed from: c */
    private int f23103c = -1;

    /* renamed from: d */
    private int f23104d;

    /* renamed from: e */
    private boolean f23105e;

    /* renamed from: f */
    private final int m21247f(int i) {
        int i2;
        int i3 = 0;
        this.f23104d = 0;
        do {
            int i4 = this.f23104d;
            int i5 = i + i4;
            C7149nm nmVar = this.f23101a;
            if (i5 >= nmVar.f23109d) {
                break;
            }
            int[] iArr = nmVar.f23112g;
            this.f23104d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* renamed from: a */
    public final void mo16200a() {
        this.f23101a.mo16205a();
        this.f23102b.mo14547a(0);
        this.f23103c = -1;
        this.f23105e = false;
    }

    /* renamed from: b */
    public final C7149nm mo16201b() {
        return this.f23101a;
    }

    /* renamed from: c */
    public final aee mo16202c() {
        return this.f23102b;
    }

    /* renamed from: d */
    public final void mo16203d() {
        if (this.f23102b.mo14555i().length != 65025) {
            aee aee = this.f23102b;
            aee.mo14549c(Arrays.copyOf(aee.mo14555i(), Math.max(65025, this.f23102b.mo14551e())), this.f23102b.mo14551e());
        }
    }

    /* renamed from: e */
    public final boolean mo16204e(C7050jv jvVar) {
        ary.m19464q(true);
        if (this.f23105e) {
            this.f23105e = false;
            this.f23102b.mo14547a(0);
        }
        while (!this.f23105e) {
            int i = this.f23103c;
            if (i < 0) {
                if (!this.f23101a.mo16206b(jvVar) || !this.f23101a.mo16208d(jvVar, true)) {
                    return false;
                }
                C7149nm nmVar = this.f23101a;
                int i2 = nmVar.f23110e;
                if ((nmVar.f23107b & 1) == 1 && this.f23102b.mo14551e() == 0) {
                    i2 += m21247f(0);
                    i = this.f23104d;
                } else {
                    i = 0;
                }
                jvVar.mo16091d(i2);
                this.f23103c = i;
            }
            int f = m21247f(i);
            int i3 = this.f23103c + this.f23104d;
            if (f > 0) {
                if (this.f23102b.mo14556j() < this.f23102b.mo14551e() + f) {
                    aee aee = this.f23102b;
                    aee.mo14549c(Arrays.copyOf(aee.mo14555i(), this.f23102b.mo14551e() + f), this.f23102b.mo14551e());
                }
                jvVar.mo16090c(this.f23102b.mo14555i(), this.f23102b.mo14551e(), f);
                aee aee2 = this.f23102b;
                aee2.mo14552f(aee2.mo14551e() + f);
                this.f23105e = this.f23101a.f23112g[i3 + -1] != 255;
            }
            if (i3 == this.f23101a.f23109d) {
                i3 = -1;
            }
            this.f23103c = i3;
        }
        return true;
    }
}
