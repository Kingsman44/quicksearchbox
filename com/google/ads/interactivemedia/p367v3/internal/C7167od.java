package com.google.ads.interactivemedia.p367v3.internal;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.ads.interactivemedia.v3.internal.od */
/* compiled from: PG */
public final class C7167od implements C7171oh {

    /* renamed from: a */
    private static final byte[] f23203a = {73, 68, 51};

    /* renamed from: b */
    private final boolean f23204b;

    /* renamed from: c */
    private final aed f23205c = new aed(new byte[7]);

    /* renamed from: d */
    private final aee f23206d = new aee(Arrays.copyOf(f23203a, 10));

    /* renamed from: e */
    private final String f23207e;

    /* renamed from: f */
    private String f23208f;

    /* renamed from: g */
    private C7073kr f23209g;

    /* renamed from: h */
    private C7073kr f23210h;

    /* renamed from: i */
    private int f23211i;

    /* renamed from: j */
    private int f23212j;

    /* renamed from: k */
    private int f23213k;

    /* renamed from: l */
    private boolean f23214l;

    /* renamed from: m */
    private boolean f23215m;

    /* renamed from: n */
    private int f23216n;

    /* renamed from: o */
    private int f23217o;

    /* renamed from: p */
    private int f23218p;

    /* renamed from: q */
    private boolean f23219q;

    /* renamed from: r */
    private long f23220r;

    /* renamed from: s */
    private int f23221s;

    /* renamed from: t */
    private long f23222t;

    /* renamed from: u */
    private C7073kr f23223u;

    /* renamed from: v */
    private long f23224v;

    public C7167od(boolean z, String str) {
        m21324i();
        this.f23216n = -1;
        this.f23217o = -1;
        this.f23220r = -9223372036854775807L;
        this.f23204b = z;
        this.f23207e = str;
    }

    /* renamed from: f */
    public static boolean m21321f(int i) {
        return (i & 65526) == 65520;
    }

    /* renamed from: g */
    private final void m21322g() {
        this.f23215m = false;
        m21324i();
    }

    /* renamed from: h */
    private final boolean m21323h(aee aee, byte[] bArr, int i) {
        int min = Math.min(aee.mo14550d(), i - this.f23212j);
        aee.mo14559m(bArr, this.f23212j, min);
        int i2 = this.f23212j + min;
        this.f23212j = i2;
        return i2 == i;
    }

    /* renamed from: i */
    private final void m21324i() {
        this.f23211i = 0;
        this.f23212j = 0;
        this.f23213k = 256;
    }

    /* renamed from: j */
    private final void m21325j(C7073kr krVar, long j, int i, int i2) {
        this.f23211i = 4;
        this.f23212j = i;
        this.f23223u = krVar;
        this.f23224v = j;
        this.f23221s = i2;
    }

    /* renamed from: k */
    private final void m21326k() {
        this.f23211i = 3;
        this.f23212j = 0;
    }

    /* renamed from: l */
    private static final boolean m21327l(byte b) {
        return m21321f((b & 255) | 65280);
    }

    /* renamed from: m */
    private static final boolean m21328m(aee aee, byte[] bArr, int i) {
        if (aee.mo14550d() < i) {
            return false;
        }
        aee.mo14559m(bArr, 0, i);
        return true;
    }

    /* renamed from: a */
    public final void mo16215a() {
        m21322g();
    }

    /* renamed from: b */
    public final void mo16216b(C7056ka kaVar, C7207pq pqVar) {
        pqVar.mo16278a();
        this.f23208f = pqVar.mo16280c();
        C7073kr ak = kaVar.mo16113ak(pqVar.mo16279b(), 1);
        this.f23209g = ak;
        this.f23223u = ak;
        if (this.f23204b) {
            pqVar.mo16278a();
            C7073kr ak2 = kaVar.mo16113ak(pqVar.mo16279b(), 4);
            this.f23210h = ak2;
            C6863cx cxVar = new C6863cx();
            cxVar.mo15617S(pqVar.mo16280c());
            cxVar.mo15630ae("application/id3");
            ak2.mo16102a(cxVar.mo15625a());
            return;
        }
        this.f23210h = new C7052jx();
    }

    /* renamed from: c */
    public final void mo16217c(long j, int i) {
        this.f23222t = j;
    }

    /* renamed from: d */
    public final void mo16218d(aee aee) {
        int i;
        byte b;
        int i2;
        aee aee2 = aee;
        ary.m19467t(this.f23209g);
        int i3 = aeu.f20466a;
        while (aee.mo14550d() > 0) {
            int i4 = this.f23211i;
            int i5 = 13;
            int i6 = 2;
            if (i4 == 0) {
                byte[] i7 = aee.mo14555i();
                int g = aee.mo14553g();
                int e = aee.mo14551e();
                while (true) {
                    if (g >= e) {
                        aee2.mo14554h(g);
                        break;
                    }
                    i = g + 1;
                    b = i7[g] & 255;
                    if (this.f23213k == 512 && m21327l((byte) b)) {
                        if (this.f23215m) {
                            break;
                        }
                        int i8 = i - 2;
                        aee2.mo14554h(i8 + 1);
                        if (m21328m(aee2, this.f23205c.f20421a, 1)) {
                            this.f23205c.mo14528e(4);
                            int i9 = this.f23205c.mo14532i(1);
                            int i10 = this.f23216n;
                            if (i10 == -1 || i9 == i10) {
                                if (this.f23217o != -1) {
                                    if (!m21328m(aee2, this.f23205c.f20421a, 1)) {
                                        break;
                                    }
                                    this.f23205c.mo14528e(i6);
                                    if (this.f23205c.mo14532i(4) == this.f23217o) {
                                        aee2.mo14554h(i8 + 2);
                                    }
                                }
                                if (!m21328m(aee2, this.f23205c.f20421a, 4)) {
                                    break;
                                }
                                this.f23205c.mo14528e(14);
                                int i11 = this.f23205c.mo14532i(i5);
                                if (i11 >= 7) {
                                    byte[] i12 = aee.mo14555i();
                                    int e2 = aee.mo14551e();
                                    int i13 = i8 + i11;
                                    if (i13 < e2) {
                                        byte b2 = i12[i13];
                                        if (b2 != -1) {
                                            if (b2 == 73) {
                                                int i14 = i13 + 1;
                                                if (i14 != e2) {
                                                    if (i12[i14] == 68) {
                                                        int i15 = i13 + 2;
                                                        if (i15 != e2) {
                                                            if (i12[i15] == 51) {
                                                                break;
                                                            }
                                                        } else {
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        } else {
                                            int i16 = i13 + 1;
                                            if (i16 == e2) {
                                                break;
                                            }
                                            byte b3 = i12[i16];
                                            if (m21327l(b3) && ((b3 & 8) >> 3) == i9) {
                                                break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    int i17 = this.f23213k;
                    byte b4 = i17 | b;
                    if (b4 == 329) {
                        i2 = 768;
                    } else if (b4 == 511) {
                        i2 = 512;
                    } else if (b4 != 836) {
                        if (b4 == 1075) {
                            this.f23211i = 2;
                            this.f23212j = 3;
                            this.f23221s = 0;
                            this.f23206d.mo14554h(0);
                            aee2.mo14554h(i);
                            break;
                        } else if (i17 != 256) {
                            this.f23213k = 256;
                            g = i - 1;
                            i5 = 13;
                            i6 = 2;
                        } else {
                            g = i;
                            i5 = 13;
                            i6 = 2;
                        }
                    } else {
                        i2 = 1024;
                    }
                    this.f23213k = i2;
                    g = i;
                    i5 = 13;
                    i6 = 2;
                }
                this.f23218p = (b & 8) >> 3;
                this.f23214l = 1 == ((b & 1) ^ 1);
                if (!this.f23215m) {
                    this.f23211i = 1;
                    this.f23212j = 0;
                } else {
                    m21326k();
                }
                aee2.mo14554h(i);
            } else if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        int min = Math.min(aee.mo14550d(), this.f23221s - this.f23212j);
                        this.f23223u.mo16105d(aee2, min);
                        int i18 = this.f23212j + min;
                        this.f23212j = i18;
                        int i19 = this.f23221s;
                        if (i18 == i19) {
                            this.f23223u.mo16103b(this.f23222t, 1, i19, 0, (C7072kq) null);
                            this.f23222t += this.f23224v;
                            m21324i();
                        }
                    } else {
                        if (m21323h(aee2, this.f23205c.f20421a, true != this.f23214l ? 5 : 7)) {
                            this.f23205c.mo14528e(0);
                            if (!this.f23219q) {
                                int i20 = this.f23205c.mo14532i(2) + 1;
                                if (i20 != 2) {
                                    StringBuilder sb = new StringBuilder(61);
                                    sb.append("Detected audio object type: ");
                                    sb.append(i20);
                                    sb.append(", but assuming AAC LC.");
                                    Log.w("AdtsReader", sb.toString());
                                }
                                this.f23205c.mo14530g(5);
                                int i21 = this.f23205c.mo14532i(3);
                                int i22 = this.f23217o;
                                int i23 = C6961gn.f22203a;
                                byte[] bArr = {(byte) (((i22 >> 1) & 7) | 16), (byte) (((i21 << 3) & 120) | ((i22 << 7) & 128))};
                                C6960gm a = C6961gn.m20510a(bArr);
                                C6863cx cxVar = new C6863cx();
                                cxVar.mo15617S(this.f23208f);
                                cxVar.mo15630ae("audio/mp4a-latm");
                                cxVar.mo15607I(a.f22202c);
                                cxVar.mo15606H(a.f22201b);
                                cxVar.mo15631af(a.f22200a);
                                cxVar.mo15618T(Collections.singletonList(bArr));
                                cxVar.mo15620V(this.f23207e);
                                C6864cy a2 = cxVar.mo15625a();
                                this.f23220r = 1024000000 / ((long) a2.f21826z);
                                this.f23209g.mo16102a(a2);
                                this.f23219q = true;
                            } else {
                                this.f23205c.mo14530g(10);
                            }
                            this.f23205c.mo14530g(4);
                            int i24 = this.f23205c.mo14532i(13) - 7;
                            if (this.f23214l) {
                                i24 -= 2;
                            }
                            m21325j(this.f23209g, this.f23220r, 0, i24);
                        }
                    }
                } else if (m21323h(aee2, this.f23206d.mo14555i(), 10)) {
                    this.f23210h.mo16105d(this.f23206d, 10);
                    this.f23206d.mo14554h(6);
                    m21325j(this.f23210h, 0, 10, this.f23206d.mo14537A() + 10);
                }
            } else if (aee.mo14550d() != 0) {
                this.f23205c.f20421a[0] = aee.mo14555i()[aee.mo14553g()];
                this.f23205c.mo14528e(2);
                int i25 = this.f23205c.mo14532i(4);
                int i26 = this.f23217o;
                if (i26 == -1 || i25 == i26) {
                    if (!this.f23215m) {
                        this.f23215m = true;
                        this.f23216n = this.f23218p;
                        this.f23217o = i25;
                    }
                    m21326k();
                } else {
                    m21322g();
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo16219e() {
    }
}
