package com.google.protobuf;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.protobuf.al */
/* compiled from: PG */
final class C62904al extends C62906an {

    /* renamed from: a */
    private final ByteBuffer f169844a;

    public C62904al(ByteBuffer byteBuffer) {
        this.f169844a = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.position();
    }

    /* renamed from: X */
    public final void mo58759X() {
        throw null;
    }

    /* renamed from: Z */
    public final void mo58761Z(int i, boolean z) {
        mo58780w(i << 3);
        mo58760Y(z ? (byte) 1 : 0);
    }

    /* renamed from: a */
    public final void mo58762a(byte[] bArr, int i, int i2) {
        mo58786e(bArr, i, i2);
    }

    /* renamed from: aa */
    public final void mo58763aa(int i, C63088z zVar) {
        mo58780w((i << 3) | 2);
        mo58765h(zVar);
    }

    /* renamed from: b */
    public final int mo58753b() {
        return this.f169844a.remaining();
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

    /* renamed from: k */
    public final void mo58768k(int i, long j) {
        mo58780w((i << 3) | 1);
        mo58769l(j);
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
        int position = this.f169844a.position();
        try {
            int N = m95321N(str.length() * 3);
            int N2 = m95321N(str.length());
            if (N2 == N) {
                int position2 = this.f169844a.position() + N2;
                ByteBuffer byteBuffer = (ByteBuffer) this.f169844a.position(position2);
                m95256A(str);
                int position3 = this.f169844a.position();
                ByteBuffer byteBuffer2 = (ByteBuffer) this.f169844a.position(position);
                mo58780w(position3 - position2);
                ByteBuffer byteBuffer3 = (ByteBuffer) this.f169844a.position(position3);
                return;
            }
            mo58780w(C63059fx.m95998a(str));
            m95256A(str);
        } catch (C63058fw e) {
            ByteBuffer byteBuffer4 = (ByteBuffer) this.f169844a.position(position);
            mo58789U(str, e);
        } catch (IllegalArgumentException e2) {
            throw new C62902aj((Throwable) e2);
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
        mo58786e(bArr, 0, i);
    }

    /* renamed from: Y */
    public final void mo58760Y(byte b) {
        try {
            this.f169844a.put(b);
        } catch (BufferOverflowException e) {
            throw new C62902aj((Throwable) e);
        }
    }

    /* renamed from: j */
    public final void mo58767j(int i) {
        try {
            this.f169844a.putInt(i);
        } catch (BufferOverflowException e) {
            throw new C62902aj((Throwable) e);
        }
    }

    /* renamed from: l */
    public final void mo58769l(long j) {
        try {
            this.f169844a.putLong(j);
        } catch (BufferOverflowException e) {
            throw new C62902aj((Throwable) e);
        }
    }

    /* renamed from: w */
    public final void mo58780w(int i) {
        while ((i & -128) != 0) {
            this.f169844a.put((byte) ((i & 127) | 128));
            i >>>= 7;
        }
        try {
            this.f169844a.put((byte) i);
        } catch (BufferOverflowException e) {
            throw new C62902aj((Throwable) e);
        }
    }

    /* renamed from: y */
    public final void mo58782y(long j) {
        while ((-128 & j) != 0) {
            this.f169844a.put((byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        try {
            this.f169844a.put((byte) ((int) j));
        } catch (BufferOverflowException e) {
            throw new C62902aj((Throwable) e);
        }
    }

    /* renamed from: A */
    private final void m95256A(String str) {
        try {
            C63059fx.f170178a.mo59148f(str, this.f169844a);
        } catch (IndexOutOfBoundsException e) {
            throw new C62902aj((Throwable) e);
        }
    }

    /* renamed from: e */
    public final void mo58786e(byte[] bArr, int i, int i2) {
        try {
            this.f169844a.put(bArr, i, i2);
        } catch (IndexOutOfBoundsException e) {
            throw new C62902aj((Throwable) e);
        } catch (BufferOverflowException e2) {
            throw new C62902aj((Throwable) e2);
        }
    }
}
