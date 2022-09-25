package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.ads.interactivemedia.v3.internal.lc */
/* compiled from: PG */
public final class C7085lc implements C7053jy {

    /* renamed from: a */
    public static final /* synthetic */ int f22686a = 0;

    /* renamed from: b */
    private final byte[] f22687b;

    /* renamed from: c */
    private final aee f22688c;

    /* renamed from: d */
    private final C7059kd f22689d;

    /* renamed from: e */
    private C7056ka f22690e;

    /* renamed from: f */
    private C7073kr f22691f;

    /* renamed from: g */
    private int f22692g;

    /* renamed from: h */
    private C7243qz f22693h;

    /* renamed from: i */
    private C7063kh f22694i;

    /* renamed from: j */
    private int f22695j;

    /* renamed from: k */
    private int f22696k;

    /* renamed from: l */
    private C7083la f22697l;

    /* renamed from: m */
    private int f22698m;

    /* renamed from: n */
    private long f22699n;

    static {
        int i = C7084lb.f22685b;
    }

    public C7085lc() {
        this((byte[]) null);
    }

    public C7085lc(byte[] bArr) {
        this.f22687b = new byte[42];
        this.f22688c = new aee(new byte[32768], 0);
        this.f22689d = new C7059kd();
        this.f22692g = 0;
    }

    /* renamed from: a */
    private final long m21001a(aee aee, boolean z) {
        boolean z2;
        ary.m19467t(this.f22694i);
        int g = aee.mo14553g();
        while (g <= aee.mo14551e() - 16) {
            aee.mo14554h(g);
            if (asn.m19522i(aee, this.f22694i, this.f22696k, this.f22689d)) {
                aee.mo14554h(g);
                return this.f22689d.f22598a;
            }
            g++;
        }
        if (z) {
            while (g <= aee.mo14551e() - this.f22695j) {
                aee.mo14554h(g);
                try {
                    z2 = asn.m19522i(aee, this.f22694i, this.f22696k, this.f22689d);
                } catch (IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                if (aee.mo14553g() <= aee.mo14551e() && z2) {
                    aee.mo14554h(g);
                    return this.f22689d.f22598a;
                }
                g++;
            }
            aee.mo14554h(aee.mo14551e());
            return -1;
        }
        aee.mo14554h(g);
        return -1;
    }

    /* renamed from: b */
    private final void m21002b() {
        long j = this.f22699n;
        C7063kh khVar = this.f22694i;
        int i = aeu.f20466a;
        this.f22691f.mo16103b((j * 1000000) / ((long) khVar.f22608e), 1, this.f22698m, 0, (C7072kq) null);
    }

    /* renamed from: d */
    public final void mo16108d(C7056ka kaVar) {
        this.f22690e = kaVar;
        this.f22691f = kaVar.mo16113ak(0, 1);
        kaVar.mo16114al();
    }

    /* renamed from: f */
    public final void mo16110f() {
    }

    /* renamed from: g */
    public final boolean mo16111g(C7050jv jvVar) {
        atv.m19628t(jvVar, false);
        aee aee = new aee(4);
        jvVar.mo16094g(aee.mo14555i(), 0, 4);
        if (aee.mo14566t() == 1716281667) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo16109e(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.f22692g = 0;
        } else {
            C7083la laVar = this.f22697l;
            if (laVar != null) {
                laVar.mo16082b(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.f22699n = j3;
        this.f22698m = 0;
        this.f22688c.mo14547a(0);
    }

    /* renamed from: h */
    public final int mo16112h(C7050jv jvVar, C7067kl klVar) {
        boolean h;
        C7063kh khVar;
        C7070ko koVar;
        C7050jv jvVar2 = jvVar;
        int i = this.f22692g;
        boolean z = true;
        if (i == 0) {
            jvVar.mo16097j();
            long k = jvVar.mo16098k();
            C7243qz t = atv.m19628t(jvVar2, true);
            jvVar2.mo16091d((int) (jvVar.mo16098k() - k));
            this.f22693h = t;
            this.f22692g = 1;
            return 0;
        } else if (i == 1) {
            byte[] bArr = this.f22687b;
            int length = bArr.length;
            jvVar2.mo16094g(bArr, 0, 42);
            jvVar.mo16097j();
            this.f22692g = 2;
            return 0;
        } else if (i == 2) {
            aee aee = new aee(4);
            jvVar2.mo16090c(aee.mo14555i(), 0, 4);
            if (aee.mo14566t() == 1716281667) {
                this.f22692g = 3;
                return 0;
            }
            throw new C6886dt("Failed to read FLAC stream marker.");
        } else if (i == 3) {
            C7060ke keVar = new C7060ke(this.f22694i);
            do {
                jvVar.mo16097j();
                aed aed = new aed(new byte[4]);
                jvVar2.mo16094g(aed.f20421a, 0, 4);
                h = aed.mo14531h();
                int i2 = aed.mo14532i(7);
                int i3 = aed.mo14532i(24) + 4;
                if (i2 == 0) {
                    byte[] bArr2 = new byte[38];
                    jvVar2.mo16090c(bArr2, 0, 38);
                    keVar.f22599a = new C7063kh(bArr2, 4);
                } else {
                    C7063kh khVar2 = keVar.f22599a;
                    if (khVar2 == null) {
                        throw new IllegalArgumentException();
                    } else if (i2 == 3) {
                        aee aee2 = new aee(i3);
                        jvVar2.mo16090c(aee2.mo14555i(), 0, i3);
                        keVar.f22599a = khVar2.mo16120e(atv.m19627s(aee2));
                    } else if (i2 == 4) {
                        aee aee3 = new aee(i3);
                        jvVar2.mo16090c(aee3.mo14555i(), 0, i3);
                        aee3.mo14557k(4);
                        keVar.f22599a = khVar2.mo16121f(Arrays.asList(atv.m19622n(aee3, false, false).f22640a));
                    } else if (i2 == 6) {
                        aee aee4 = new aee(i3);
                        jvVar2.mo16090c(aee4.mo14555i(), 0, i3);
                        aee4.mo14557k(4);
                        int v = aee4.mo14568v();
                        String F = aee4.mo14542F(aee4.mo14568v(), apv.f21363a);
                        String E = aee4.mo14541E(aee4.mo14568v());
                        int v2 = aee4.mo14568v();
                        int v3 = aee4.mo14568v();
                        int v4 = aee4.mo14568v();
                        int v5 = aee4.mo14568v();
                        int v6 = aee4.mo14568v();
                        byte[] bArr3 = new byte[v6];
                        aee4.mo14559m(bArr3, 0, v6);
                        keVar.f22599a = khVar2.mo16122g(Collections.singletonList(new C7251rg(v, F, E, v2, v3, v4, v5, bArr3)));
                    } else {
                        jvVar2.mo16091d(i3);
                    }
                }
                khVar = keVar.f22599a;
                int i4 = aeu.f20466a;
                this.f22694i = khVar;
            } while (!h);
            ary.m19467t(khVar);
            this.f22695j = Math.max(this.f22694i.f22606c, 6);
            this.f22691f.mo16102a(this.f22694i.mo16118c(this.f22687b, this.f22693h));
            this.f22692g = 4;
            return 0;
        } else if (i != 4) {
            ary.m19467t(this.f22691f);
            ary.m19467t(this.f22694i);
            C7083la laVar = this.f22697l;
            if (laVar != null && laVar.mo16083c()) {
                return laVar.mo16084d(jvVar2, klVar);
            }
            if (this.f22699n == -1) {
                this.f22699n = asn.m19525l(jvVar2, this.f22694i);
                return 0;
            }
            int e = this.f22688c.mo14551e();
            if (e < 32768) {
                int a = jvVar2.mo14388a(this.f22688c.mo14555i(), e, 32768 - e);
                if (a != -1) {
                    z = false;
                }
                if (!z) {
                    this.f22688c.mo14552f(e + a);
                } else if (this.f22688c.mo14550d() == 0) {
                    m21002b();
                    return -1;
                }
            } else {
                z = false;
            }
            int g = this.f22688c.mo14553g();
            int i5 = this.f22698m;
            int i6 = this.f22695j;
            if (i5 < i6) {
                aee aee5 = this.f22688c;
                aee5.mo14557k(Math.min(i6 - i5, aee5.mo14550d()));
            }
            long a2 = m21001a(this.f22688c, z);
            int g2 = this.f22688c.mo14553g() - g;
            this.f22688c.mo14554h(g);
            this.f22691f.mo16105d(this.f22688c, g2);
            this.f22698m += g2;
            if (a2 != -1) {
                m21002b();
                this.f22698m = 0;
                this.f22699n = a2;
            }
            if (this.f22688c.mo14550d() >= 16) {
                return 0;
            }
            System.arraycopy(this.f22688c.mo14555i(), this.f22688c.mo14553g(), this.f22688c.mo14555i(), 0, this.f22688c.mo14550d());
            aee aee6 = this.f22688c;
            aee6.mo14547a(aee6.mo14550d());
            return 0;
        } else {
            jvVar.mo16097j();
            aee aee7 = new aee(2);
            jvVar2.mo16094g(aee7.mo14555i(), 0, 2);
            int o = aee7.mo14561o();
            if ((o >> 2) == 16382) {
                jvVar.mo16097j();
                this.f22696k = o;
                C7056ka kaVar = this.f22690e;
                int i7 = aeu.f20466a;
                long l = jvVar.mo16099l();
                long m = jvVar.mo16100m();
                ary.m19467t(this.f22694i);
                C7063kh khVar3 = this.f22694i;
                if (khVar3.f22614k != null) {
                    koVar = new C7061kf(khVar3, l);
                } else if (m == -1 || khVar3.f22613j <= 0) {
                    koVar = new C7069kn(khVar3.mo16116a());
                } else {
                    C7083la laVar2 = new C7083la(khVar3, this.f22696k, l, m);
                    this.f22697l = laVar2;
                    koVar = laVar2.mo16081a();
                }
                kaVar.mo16115am(koVar);
                this.f22692g = 5;
                return 0;
            }
            jvVar.mo16097j();
            throw new C6886dt("First frame does not start with sync code.");
        }
    }
}
