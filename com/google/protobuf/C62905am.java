package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.protobuf.am */
/* compiled from: PG */
final class C62905am extends C62906an {

    /* renamed from: a */
    private final ByteBuffer f169845a;

    /* renamed from: b */
    private final long f169846b;

    /* renamed from: c */
    private final long f169847c;

    /* renamed from: d */
    private final long f169848d;

    /* renamed from: g */
    private final long f169849g;

    /* renamed from: h */
    private long f169850h;

    public C62905am(ByteBuffer byteBuffer) {
        this.f169845a = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        long a = C63054fs.m95962a(byteBuffer);
        this.f169846b = a;
        long position = ((long) byteBuffer.position()) + a;
        this.f169847c = position;
        long limit = a + ((long) byteBuffer.limit());
        this.f169848d = limit;
        this.f169849g = limit - 10;
        this.f169850h = position;
    }

    /* renamed from: A */
    private final void m95283A(long j) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f169845a.position((int) (j - this.f169846b));
    }

    /* renamed from: X */
    public final void mo58759X() {
        throw null;
    }

    /* renamed from: Y */
    public final void mo58760Y(byte b) {
        long j = this.f169850h;
        long j2 = this.f169848d;
        if (j < j2) {
            this.f169850h = 1 + j;
            C63054fs.f170169a.mo59129g(j, b);
            return;
        }
        throw new C62902aj(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j), Long.valueOf(j2), 1}));
    }

    /* renamed from: Z */
    public final void mo58761Z(int i, boolean z) {
        mo58780w(i << 3);
        mo58760Y(z ? (byte) 1 : 0);
    }

    /* renamed from: a */
    public final void mo58762a(byte[] bArr, int i, int i2) {
        mo58787e(bArr, i, i2);
    }

    /* renamed from: aa */
    public final void mo58763aa(int i, C63088z zVar) {
        mo58780w((i << 3) | 2);
        mo58765h(zVar);
    }

    /* renamed from: b */
    public final int mo58753b() {
        return (int) (this.f169848d - this.f169850h);
    }

    /* renamed from: e */
    public final void mo58787e(byte[] bArr, int i, int i2) {
        if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
            long j = this.f169848d;
            long j2 = (long) i2;
            long j3 = this.f169850h;
            if (j - j2 >= j3) {
                C63054fs.f170169a.mo59127e(bArr, (long) i, j3, j2);
                this.f169850h += j2;
                return;
            }
        }
        if (bArr == null) {
            throw new NullPointerException("value");
        }
        throw new C62902aj(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f169850h), Long.valueOf(this.f169848d), Integer.valueOf(i2)}));
    }

    /* renamed from: h */
    public final void mo58765h(C63088z zVar) {
        mo58780w(zVar.mo59031d());
        zVar.mo59045q(this);
    }

    /* renamed from: i */
    public final void mo58766i(int i, int i2) {
        mo58780w((i << 3) | 5);
        mo58767j(i2);
    }

    /* renamed from: j */
    public final void mo58767j(int i) {
        this.f169845a.putInt((int) (this.f169850h - this.f169846b), i);
        this.f169850h += 4;
    }

    /* renamed from: k */
    public final void mo58768k(int i, long j) {
        mo58780w((i << 3) | 1);
        mo58769l(j);
    }

    /* renamed from: l */
    public final void mo58769l(long j) {
        this.f169845a.putLong((int) (this.f169850h - this.f169846b), j);
        this.f169850h += 8;
    }

    /* renamed from: m */
    public final void mo58770m(int i, int i2) {
        mo58780w(i << 3);
        mo58771n(i2);
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
        long j = this.f169850h;
        try {
            int N = m95321N(str.length() * 3);
            int N2 = m95321N(str.length());
            if (N2 == N) {
                int i = ((int) (this.f169850h - this.f169846b)) + N2;
                ByteBuffer byteBuffer = (ByteBuffer) this.f169845a.position(i);
                C63059fx.f170178a.mo59148f(str, this.f169845a);
                int position = this.f169845a.position() - i;
                mo58780w(position);
                this.f169850h += (long) position;
                return;
            }
            int a = C63059fx.m95998a(str);
            mo58780w(a);
            m95283A(this.f169850h);
            C63059fx.f170178a.mo59148f(str, this.f169845a);
            this.f169850h += (long) a;
        } catch (C63058fw e) {
            this.f169850h = j;
            m95283A(j);
            mo58789U(str, e);
        } catch (IllegalArgumentException e2) {
            throw new C62902aj((Throwable) e2);
        } catch (IndexOutOfBoundsException e3) {
            throw new C62902aj((Throwable) e3);
        }
    }

    /* renamed from: u */
    public final void mo58778u(int i, int i2) {
        mo58780w((i << 3) | i2);
    }

    /* renamed from: v */
    public final void mo58779v(int i, int i2) {
        mo58780w(i << 3);
        mo58780w(i2);
    }

    /* renamed from: x */
    public final void mo58781x(int i, long j) {
        mo58780w(i << 3);
        mo58782y(j);
    }

    /* renamed from: z */
    public final void mo58783z(byte[] bArr, int i) {
        mo58780w(i);
        mo58787e(bArr, 0, i);
    }

    /* renamed from: w */
    public final void mo58780w(int i) {
        if (this.f169850h > this.f169849g) {
            while (true) {
                long j = this.f169850h;
                long j2 = this.f169848d;
                if (j >= j2) {
                    throw new C62902aj(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j), Long.valueOf(j2), 1}));
                } else if ((i & -128) == 0) {
                    this.f169850h = 1 + j;
                    C63054fs.f170169a.mo59129g(j, (byte) i);
                    return;
                } else {
                    this.f169850h = j + 1;
                    C63054fs.f170169a.mo59129g(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            }
        } else {
            while ((i & -128) != 0) {
                long j3 = this.f169850h;
                this.f169850h = j3 + 1;
                C63054fs.f170169a.mo59129g(j3, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            long j4 = this.f169850h;
            this.f169850h = 1 + j4;
            C63054fs.f170169a.mo59129g(j4, (byte) i);
        }
    }

    /* renamed from: y */
    public final void mo58782y(long j) {
        if (this.f169850h <= this.f169849g) {
            while ((j & -128) != 0) {
                long j2 = this.f169850h;
                this.f169850h = j2 + 1;
                C63054fs.f170169a.mo59129g(j2, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            long j3 = this.f169850h;
            this.f169850h = 1 + j3;
            C63054fs.f170169a.mo59129g(j3, (byte) ((int) j));
            return;
        }
        while (true) {
            long j4 = this.f169850h;
            long j5 = this.f169848d;
            if (j4 >= j5) {
                throw new C62902aj(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j4), Long.valueOf(j5), 1}));
            } else if ((j & -128) == 0) {
                this.f169850h = 1 + j4;
                C63054fs.f170169a.mo59129g(j4, (byte) ((int) j));
                return;
            } else {
                this.f169850h = j4 + 1;
                C63054fs.f170169a.mo59129g(j4, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
        }
    }
}
