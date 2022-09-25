package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.protobuf.ae */
/* compiled from: PG */
public abstract class C62897ae {

    /* renamed from: a */
    private static volatile int f169826a = 100;

    /* renamed from: g */
    public static final /* synthetic */ int f169827g = 0;

    /* renamed from: c */
    int f169828c;

    /* renamed from: d */
    final int f169829d = f169826a;

    /* renamed from: e */
    public int f169830e = Integer.MAX_VALUE;

    /* renamed from: f */
    C62898af f169831f;

    /* renamed from: I */
    public static int m95107I(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: J */
    public static int m95108J(int i, InputStream inputStream) {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read != -1) {
                i2 |= (read & 127) << i3;
                if ((read & 128) == 0) {
                    return i2;
                }
                i3 += 7;
            } else {
                throw C62974ct.m95559i();
            }
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw C62974ct.m95559i();
            } else if ((read2 & 128) == 0) {
                return i2;
            } else {
                i3 += 7;
            }
        }
        throw C62974ct.m95554d();
    }

    /* renamed from: K */
    public static long m95109K(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: M */
    public static C62897ae m95110M(InputStream inputStream) {
        if (inputStream != null) {
            return new C62895ac(inputStream);
        }
        byte[] bArr = C62972cr.f170010b;
        int length = bArr.length;
        return m95112O(bArr, 0, 0);
    }

    /* renamed from: N */
    public static C62897ae m95111N(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return m95112O(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        }
        if (byteBuffer.isDirect() && C63054fs.f170170b) {
            return new C62896ad(byteBuffer);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return m95112O(bArr, 0, remaining);
    }

    /* renamed from: O */
    public static C62897ae m95112O(byte[] bArr, int i, int i2) {
        C62893aa aaVar = new C62893aa(bArr, i, i2);
        try {
            aaVar.mo58670e(i2);
            return aaVar;
        } catch (C62974ct e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: A */
    public abstract void mo58658A(int i);

    /* renamed from: B */
    public abstract void mo58659B(int i);

    /* renamed from: C */
    public abstract void mo58660C(int i);

    /* renamed from: D */
    public abstract boolean mo58661D();

    /* renamed from: E */
    public abstract boolean mo58662E();

    /* renamed from: F */
    public abstract boolean mo58663F(int i);

    /* renamed from: G */
    public abstract byte[] mo58664G();

    /* renamed from: H */
    public abstract byte[] mo58665H(int i);

    /* renamed from: L */
    public final void mo58707L() {
        if (this.f169828c >= this.f169829d) {
            throw C62974ct.m95557g();
        }
    }

    /* renamed from: b */
    public abstract double mo58667b();

    /* renamed from: c */
    public abstract float mo58668c();

    /* renamed from: d */
    public abstract int mo58669d();

    /* renamed from: e */
    public abstract int mo58670e(int i);

    /* renamed from: f */
    public abstract int mo58671f();

    /* renamed from: g */
    public abstract int mo58672g();

    /* renamed from: h */
    public abstract int mo58673h();

    /* renamed from: j */
    public abstract int mo58675j();

    /* renamed from: k */
    public abstract int mo58676k();

    /* renamed from: l */
    public abstract int mo58677l();

    /* renamed from: m */
    public abstract int mo58678m();

    /* renamed from: n */
    public abstract int mo58679n();

    /* renamed from: o */
    public abstract long mo58680o();

    /* renamed from: p */
    public abstract long mo58681p();

    /* renamed from: t */
    public abstract long mo58685t();

    /* renamed from: u */
    public abstract long mo58686u();

    /* renamed from: v */
    public abstract long mo58687v();

    /* renamed from: w */
    public abstract C63088z mo58688w();

    /* renamed from: x */
    public abstract MessageLite mo58689x(C63010eb ebVar, C62921ba baVar);

    /* renamed from: y */
    public abstract String mo58690y();

    /* renamed from: z */
    public abstract String mo58691z();
}
