package com.google.ads.interactivemedia.p367v3.internal;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ux */
/* compiled from: PG */
final class C7349ux {

    /* renamed from: a */
    private final int f23986a = 65536;

    /* renamed from: b */
    private final aee f23987b = new aee(32);

    /* renamed from: c */
    private C7348uw f23988c;

    /* renamed from: d */
    private C7348uw f23989d;

    /* renamed from: e */
    private C7348uw f23990e;

    /* renamed from: f */
    private long f23991f;

    /* renamed from: g */
    private final acc f23992g;

    public C7349ux(acc acc) {
        this.f23992g = acc;
        acc.mo14442h();
        C7348uw uwVar = new C7348uw(0, 65536);
        this.f23988c = uwVar;
        this.f23989d = uwVar;
        this.f23990e = uwVar;
    }

    /* renamed from: i */
    private final void m22049i(long j, ByteBuffer byteBuffer, int i) {
        m22051k(j);
        while (i > 0) {
            int min = Math.min(i, (int) (this.f23989d.f23982b - j));
            C7348uw uwVar = this.f23989d;
            byteBuffer.put(uwVar.f23984d.f20196a, uwVar.mo16589a(j), min);
            i -= min;
            j += (long) min;
            C7348uw uwVar2 = this.f23989d;
            if (j == uwVar2.f23982b) {
                this.f23989d = uwVar2.f23985e;
            }
        }
    }

    /* renamed from: j */
    private final void m22050j(long j, byte[] bArr, int i) {
        m22051k(j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (this.f23989d.f23982b - j));
            C7348uw uwVar = this.f23989d;
            System.arraycopy(uwVar.f23984d.f20196a, uwVar.mo16589a(j), bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            C7348uw uwVar2 = this.f23989d;
            if (j == uwVar2.f23982b) {
                this.f23989d = uwVar2.f23985e;
            }
        }
    }

    /* renamed from: k */
    private final void m22051k(long j) {
        while (true) {
            C7348uw uwVar = this.f23989d;
            if (j >= uwVar.f23982b) {
                this.f23989d = uwVar.f23985e;
            } else {
                return;
            }
        }
    }

    /* renamed from: l */
    private final void m22052l(C7348uw uwVar) {
        if (uwVar.f23983c) {
            C7348uw uwVar2 = this.f23990e;
            int i = (uwVar2.f23983c ? 1 : 0) + (((int) (uwVar2.f23981a - uwVar.f23981a)) / this.f23986a);
            abj[] abjArr = new abj[i];
            for (int i2 = 0; i2 < i; i2++) {
                abjArr[i2] = uwVar.f23984d;
                uwVar = uwVar.mo16590b();
            }
            this.f23992g.mo14439e(abjArr);
        }
    }

    /* renamed from: m */
    private final int m22053m(int i) {
        C7348uw uwVar = this.f23990e;
        if (!uwVar.f23983c) {
            abj c = this.f23992g.mo14437c();
            C7348uw uwVar2 = new C7348uw(this.f23990e.f23982b, this.f23986a);
            uwVar.f23984d = c;
            uwVar.f23985e = uwVar2;
            uwVar.f23983c = true;
        }
        return Math.min(i, (int) (this.f23990e.f23982b - this.f23991f));
    }

    /* renamed from: n */
    private final void m22054n(int i) {
        long j = this.f23991f + ((long) i);
        this.f23991f = j;
        C7348uw uwVar = this.f23990e;
        if (j == uwVar.f23982b) {
            this.f23990e = uwVar.f23985e;
        }
    }

    /* renamed from: a */
    public final void mo16591a() {
        m22052l(this.f23988c);
        C7348uw uwVar = new C7348uw(0, this.f23986a);
        this.f23988c = uwVar;
        this.f23989d = uwVar;
        this.f23990e = uwVar;
        this.f23991f = 0;
        this.f23992g.mo14440f();
    }

    /* renamed from: b */
    public final void mo16592b(long j) {
        this.f23991f = j;
        if (j != 0) {
            C7348uw uwVar = this.f23988c;
            if (j != uwVar.f23981a) {
                while (this.f23991f > uwVar.f23982b) {
                    uwVar = uwVar.f23985e;
                }
                C7348uw uwVar2 = uwVar.f23985e;
                m22052l(uwVar2);
                long j2 = uwVar.f23982b;
                uwVar.f23985e = new C7348uw(j2, this.f23986a);
                this.f23990e = this.f23991f == j2 ? uwVar.f23985e : uwVar;
                if (this.f23989d == uwVar2) {
                    this.f23989d = uwVar.f23985e;
                    return;
                }
                return;
            }
        }
        m22052l(this.f23988c);
        C7348uw uwVar3 = new C7348uw(this.f23991f, this.f23986a);
        this.f23988c = uwVar3;
        this.f23989d = uwVar3;
        this.f23990e = uwVar3;
    }

    /* renamed from: c */
    public final void mo16593c() {
        this.f23989d = this.f23988c;
    }

    /* renamed from: d */
    public final void mo16594d(C7024iw iwVar, C7350uy uyVar) {
        int i;
        C7024iw iwVar2 = iwVar;
        C7350uy uyVar2 = uyVar;
        if (iwVar.mo16044k()) {
            long j = uyVar2.f23994b;
            this.f23987b.mo14547a(1);
            m22050j(j, this.f23987b.mo14555i(), 1);
            long j2 = j + 1;
            byte b = this.f23987b.mo14555i()[0];
            byte b2 = b & 128;
            byte b3 = b & Byte.MAX_VALUE;
            C7021it itVar = iwVar2.f22514a;
            byte[] bArr = itVar.f22498a;
            if (bArr == null) {
                itVar.f22498a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            m22050j(j2, itVar.f22498a, b3);
            long j3 = j2 + ((long) b3);
            if (b2 != 0) {
                this.f23987b.mo14547a(2);
                m22050j(j3, this.f23987b.mo14555i(), 2);
                j3 += 2;
                i = this.f23987b.mo14561o();
            } else {
                i = 1;
            }
            int[] iArr = itVar.f22499b;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = itVar.f22500c;
            if (iArr3 == null || iArr3.length < i) {
                iArr3 = new int[i];
            }
            int[] iArr4 = iArr3;
            if (b2 != 0) {
                int i2 = i * 6;
                this.f23987b.mo14547a(i2);
                m22050j(j3, this.f23987b.mo14555i(), i2);
                j3 += (long) i2;
                this.f23987b.mo14554h(0);
                for (int i3 = 0; i3 < i; i3++) {
                    iArr2[i3] = this.f23987b.mo14561o();
                    iArr4[i3] = this.f23987b.mo14538B();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = uyVar2.f23993a - ((int) (j3 - uyVar2.f23994b));
            }
            C7072kq kqVar = uyVar2.f23995c;
            int i4 = aeu.f20466a;
            itVar.mo16038a(i, iArr2, iArr4, kqVar.f22633b, itVar.f22498a, kqVar.f22632a, kqVar.f22634c, kqVar.f22635d);
            long j4 = uyVar2.f23994b;
            int i5 = (int) (j3 - j4);
            uyVar2.f23994b = j4 + ((long) i5);
            uyVar2.f23993a -= i5;
        }
        if (iwVar.mo16034e()) {
            this.f23987b.mo14547a(4);
            m22050j(uyVar2.f23994b, this.f23987b.mo14555i(), 4);
            int B = this.f23987b.mo14538B();
            uyVar2.f23994b += 4;
            uyVar2.f23993a -= 4;
            iwVar2.mo16042i(B);
            m22049i(uyVar2.f23994b, iwVar2.f22515b, B);
            uyVar2.f23994b += (long) B;
            int i6 = uyVar2.f23993a - B;
            uyVar2.f23993a = i6;
            ByteBuffer byteBuffer = iwVar2.f22518e;
            if (byteBuffer == null || byteBuffer.capacity() < i6) {
                iwVar2.f22518e = ByteBuffer.allocate(i6);
            } else {
                iwVar2.f22518e.clear();
            }
            m22049i(uyVar2.f23994b, iwVar2.f22518e, uyVar2.f23993a);
            return;
        }
        iwVar2.mo16042i(uyVar2.f23993a);
        m22049i(uyVar2.f23994b, iwVar2.f22515b, uyVar2.f23993a);
    }

    /* renamed from: e */
    public final void mo16595e(long j) {
        C7348uw uwVar;
        if (j != -1) {
            while (true) {
                uwVar = this.f23988c;
                if (j < uwVar.f23982b) {
                    break;
                }
                this.f23992g.mo14438d(uwVar.f23984d);
                this.f23988c = this.f23988c.mo16590b();
            }
            if (this.f23989d.f23981a < uwVar.f23981a) {
                this.f23989d = uwVar;
            }
        }
    }

    /* renamed from: f */
    public final long mo16596f() {
        return this.f23991f;
    }

    /* renamed from: g */
    public final int mo16597g(abu abu, int i, boolean z) {
        int m = m22053m(i);
        C7348uw uwVar = this.f23990e;
        int a = abu.mo14388a(uwVar.f23984d.f20196a, uwVar.mo16589a(this.f23991f), m);
        if (a != -1) {
            m22054n(a);
            return a;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: h */
    public final void mo16598h(aee aee, int i) {
        while (i > 0) {
            int m = m22053m(i);
            C7348uw uwVar = this.f23990e;
            aee.mo14559m(uwVar.f23984d.f20196a, uwVar.mo16589a(this.f23991f), m);
            i -= m;
            m22054n(m);
        }
    }
}
