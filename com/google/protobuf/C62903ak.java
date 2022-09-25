package com.google.protobuf;

import java.io.OutputStream;

/* renamed from: com.google.protobuf.ak */
/* compiled from: PG */
public final class C62903ak extends C62899ag {

    /* renamed from: g */
    private final OutputStream f169843g;

    public C62903ak(OutputStream outputStream, int i) {
        super(i);
        if (outputStream != null) {
            this.f169843g = outputStream;
            return;
        }
        throw new NullPointerException("out");
    }

    /* renamed from: V */
    private final void m95228V() {
        this.f169843g.write(this.f169836a, 0, this.f169838c);
        this.f169838c = 0;
    }

    /* renamed from: W */
    private final void m95229W(int i) {
        if (this.f169837b - this.f169838c < i) {
            m95228V();
        }
    }

    /* renamed from: A */
    public final void mo58784A(byte[] bArr, int i, int i2) {
        int i3 = this.f169837b;
        int i4 = this.f169838c;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.f169836a, i4, i2);
            this.f169838c += i2;
            this.f169839d += i2;
            return;
        }
        System.arraycopy(bArr, i, this.f169836a, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f169838c = this.f169837b;
        this.f169839d += i5;
        m95228V();
        if (i7 <= this.f169837b) {
            System.arraycopy(bArr, i6, this.f169836a, 0, i7);
            this.f169838c = i7;
        } else {
            this.f169843g.write(bArr, i6, i7);
        }
        this.f169839d += i7;
    }

    /* renamed from: B */
    public final void mo58785B(int i, byte[] bArr, int i2) {
        mo58780w((i << 3) | 2);
        mo58783z(bArr, i2);
    }

    /* renamed from: X */
    public final void mo58759X() {
        if (this.f169838c > 0) {
            m95228V();
        }
    }

    /* renamed from: Y */
    public final void mo58760Y(byte b) {
        if (this.f169838c == this.f169837b) {
            m95228V();
        }
        mo58754c(b);
    }

    /* renamed from: Z */
    public final void mo58761Z(int i, boolean z) {
        m95229W(11);
        mo58757f(i << 3);
        mo58754c(z ? (byte) 1 : 0);
    }

    /* renamed from: a */
    public final void mo58762a(byte[] bArr, int i, int i2) {
        mo58784A(bArr, i, i2);
    }

    /* renamed from: aa */
    public final void mo58763aa(int i, C63088z zVar) {
        mo58780w((i << 3) | 2);
        mo58765h(zVar);
    }

    /* renamed from: h */
    public final void mo58765h(C63088z zVar) {
        mo58780w(zVar.mo59031d());
        zVar.mo59045q(this);
    }

    /* renamed from: i */
    public final void mo58766i(int i, int i2) {
        m95229W(14);
        mo58757f((i << 3) | 5);
        mo58755d(i2);
    }

    /* renamed from: j */
    public final void mo58767j(int i) {
        m95229W(4);
        mo58755d(i);
    }

    /* renamed from: k */
    public final void mo58768k(int i, long j) {
        m95229W(18);
        mo58757f((i << 3) | 1);
        mo58756e(j);
    }

    /* renamed from: l */
    public final void mo58769l(long j) {
        m95229W(8);
        mo58756e(j);
    }

    /* renamed from: m */
    public final void mo58770m(int i, int i2) {
        m95229W(20);
        mo58757f(i << 3);
        if (i2 >= 0) {
            mo58757f(i2);
        } else {
            mo58758g((long) i2);
        }
    }

    /* renamed from: n */
    public final void mo58771n(int i) {
        if (i >= 0) {
            mo58780w(i);
        } else {
            mo58782y((long) i);
        }
    }

    /* renamed from: o */
    public final void mo58772o(int i, MessageLite messageLite, C63022en enVar) {
        mo58780w((i << 3) | 2);
        mo58780w(((C62947c) messageLite).getSerializedSize(enVar));
        enVar.mo59002m(messageLite, this.f169853f);
    }

    /* renamed from: p */
    public final void mo58773p(MessageLite messageLite) {
        mo58780w(messageLite.getSerializedSize());
        messageLite.writeTo((C62906an) this);
    }

    /* renamed from: q */
    public final void mo58774q(int i, MessageLite messageLite) {
        mo58780w(11);
        mo58779v(2, i);
        mo58780w(26);
        mo58773p(messageLite);
        mo58780w(12);
    }

    /* renamed from: r */
    public final void mo58775r(int i, C63088z zVar) {
        mo58780w(11);
        mo58779v(2, i);
        mo58763aa(3, zVar);
        mo58780w(12);
    }

    /* renamed from: s */
    public final void mo58776s(int i, String str) {
        mo58780w((i << 3) | 2);
        mo58777t(str);
    }

    /* renamed from: t */
    public final void mo58777t(String str) {
        int i;
        int i2;
        try {
            int length = str.length() * 3;
            int N = m95321N(length);
            int i3 = N + length;
            int i4 = this.f169837b;
            if (i3 > i4) {
                byte[] bArr = new byte[length];
                int a = C63059fx.f170178a.mo59143a(str, bArr, 0, length);
                mo58780w(a);
                mo58784A(bArr, 0, a);
                return;
            }
            if (i3 > i4 - this.f169838c) {
                m95228V();
            }
            int N2 = m95321N(str.length());
            i = this.f169838c;
            if (N2 == N) {
                int i5 = i + N2;
                this.f169838c = i5;
                C63056fu fuVar = C63059fx.f170178a;
                int a2 = C63059fx.f170178a.mo59143a(str, this.f169836a, i5, this.f169837b - i5);
                this.f169838c = i;
                i2 = (a2 - i) - N2;
                mo58757f(i2);
                this.f169838c = a2;
            } else {
                i2 = C63059fx.m95998a(str);
                mo58757f(i2);
                this.f169838c = C63059fx.f170178a.mo59143a(str, this.f169836a, this.f169838c, i2);
            }
            this.f169839d += i2;
        } catch (C63058fw e) {
            this.f169839d -= this.f169838c - i;
            this.f169838c = i;
            throw e;
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new C62902aj((Throwable) e2);
        } catch (C63058fw e3) {
            mo58789U(str, e3);
        }
    }

    /* renamed from: u */
    public final void mo58778u(int i, int i2) {
        mo58780w((i << 3) | i2);
    }

    /* renamed from: v */
    public final void mo58779v(int i, int i2) {
        m95229W(20);
        mo58757f(i << 3);
        mo58757f(i2);
    }

    /* renamed from: w */
    public final void mo58780w(int i) {
        m95229W(5);
        mo58757f(i);
    }

    /* renamed from: x */
    public final void mo58781x(int i, long j) {
        m95229W(20);
        mo58757f(i << 3);
        mo58758g(j);
    }

    /* renamed from: y */
    public final void mo58782y(long j) {
        m95229W(10);
        mo58758g(j);
    }

    /* renamed from: z */
    public final void mo58783z(byte[] bArr, int i) {
        mo58780w(i);
        mo58784A(bArr, 0, i);
    }
}
