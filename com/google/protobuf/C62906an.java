package com.google.protobuf;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.an */
/* compiled from: PG */
public abstract class C62906an extends C63079q {

    /* renamed from: a */
    private static final Logger f169851a = Logger.getLogger(C62906an.class.getName());

    /* renamed from: e */
    public static final boolean f169852e = C63054fs.f170171c;

    /* renamed from: f */
    C62907ao f169853f;

    /* renamed from: C */
    public static int m95310C(byte[] bArr) {
        int length = bArr.length;
        return m95321N(length) + length;
    }

    /* renamed from: D */
    public static int m95311D(C63088z zVar) {
        int d = zVar.mo59031d();
        return m95321N(d) + d;
    }

    @Deprecated
    /* renamed from: E */
    static int m95312E(int i, MessageLite messageLite, C63022en enVar) {
        int N = m95321N(i << 3);
        return N + N + ((C62947c) messageLite).getSerializedSize(enVar);
    }

    @Deprecated
    /* renamed from: F */
    public static int m95313F(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    /* renamed from: G */
    public static int m95314G(int i) {
        if (i >= 0) {
            return m95321N(i);
        }
        return 10;
    }

    /* renamed from: H */
    public static int m95315H(C62980cz czVar) {
        int a = czVar.mo58957a();
        return m95321N(a) + a;
    }

    /* renamed from: I */
    public static int m95316I(MessageLite messageLite) {
        int serializedSize = messageLite.getSerializedSize();
        return m95321N(serializedSize) + serializedSize;
    }

    /* renamed from: J */
    static int m95317J(MessageLite messageLite, C63022en enVar) {
        int serializedSize = ((C62947c) messageLite).getSerializedSize(enVar);
        return m95321N(serializedSize) + serializedSize;
    }

    /* renamed from: K */
    static int m95318K(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* renamed from: L */
    public static int m95319L(String str) {
        int i;
        try {
            i = C63059fx.m95998a(str);
        } catch (C63058fw unused) {
            i = str.getBytes(C62972cr.f170009a).length;
        }
        return m95321N(i) + i;
    }

    /* renamed from: M */
    public static int m95320M(int i) {
        return m95321N(i << 3);
    }

    /* renamed from: N */
    public static int m95321N(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: O */
    public static int m95322O(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: P */
    public static C62906an m95323P(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new C62901ai(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        } else if (C63054fs.f170170b) {
            return new C62905am(byteBuffer);
        } else {
            return new C62904al(byteBuffer);
        }
    }

    /* renamed from: Q */
    public static C62906an m95324Q(byte[] bArr) {
        return new C62900ah(bArr, 0, bArr.length);
    }

    /* renamed from: R */
    public static C62906an m95325R(OutputStream outputStream, int i) {
        return new C62903ak(outputStream, i);
    }

    /* renamed from: S */
    public static C62906an m95326S(byte[] bArr, int i, int i2) {
        return new C62900ah(bArr, i, i2);
    }

    /* renamed from: T */
    public final void mo58788T() {
        if (mo58753b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final void mo58789U(String str, C63058fw fwVar) {
        f169851a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", fwVar);
        byte[] bytes = str.getBytes(C62972cr.f170009a);
        try {
            int length = bytes.length;
            mo58780w(length);
            mo58762a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new C62902aj((Throwable) e);
        }
    }

    /* renamed from: X */
    public abstract void mo58759X();

    /* renamed from: Y */
    public abstract void mo58760Y(byte b);

    /* renamed from: Z */
    public abstract void mo58761Z(int i, boolean z);

    /* renamed from: a */
    public abstract void mo58762a(byte[] bArr, int i, int i2);

    /* renamed from: aa */
    public abstract void mo58763aa(int i, C63088z zVar);

    /* renamed from: b */
    public abstract int mo58753b();

    /* renamed from: h */
    public abstract void mo58765h(C63088z zVar);

    /* renamed from: i */
    public abstract void mo58766i(int i, int i2);

    /* renamed from: j */
    public abstract void mo58767j(int i);

    /* renamed from: k */
    public abstract void mo58768k(int i, long j);

    /* renamed from: l */
    public abstract void mo58769l(long j);

    /* renamed from: m */
    public abstract void mo58770m(int i, int i2);

    /* renamed from: n */
    public abstract void mo58771n(int i);

    /* renamed from: o */
    public abstract void mo58772o(int i, MessageLite messageLite, C63022en enVar);

    /* renamed from: p */
    public abstract void mo58773p(MessageLite messageLite);

    /* renamed from: q */
    public abstract void mo58774q(int i, MessageLite messageLite);

    /* renamed from: r */
    public abstract void mo58775r(int i, C63088z zVar);

    /* renamed from: s */
    public abstract void mo58776s(int i, String str);

    /* renamed from: t */
    public abstract void mo58777t(String str);

    /* renamed from: u */
    public abstract void mo58778u(int i, int i2);

    /* renamed from: v */
    public abstract void mo58779v(int i, int i2);

    /* renamed from: w */
    public abstract void mo58780w(int i);

    /* renamed from: x */
    public abstract void mo58781x(int i, long j);

    /* renamed from: y */
    public abstract void mo58782y(long j);

    /* renamed from: z */
    public abstract void mo58783z(byte[] bArr, int i);
}
