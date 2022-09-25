package com.google.protobuf;

import com.evernote.android.state.BuildConfig;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.protobuf.z */
/* compiled from: PG */
public abstract class C63088z implements Iterable, Serializable {

    /* renamed from: b */
    public static final C63088z f170246b = new C63086x(C62972cr.f170010b);

    /* renamed from: c */
    public int f170247c = 0;

    /* renamed from: A */
    public static C63088z m96139A(byte[] bArr) {
        return m96142D(bArr, 0, bArr.length);
    }

    /* renamed from: B */
    public static C63088z m96140B(String str, Charset charset) {
        return new C63086x(str.getBytes(charset));
    }

    /* renamed from: C */
    public static C63088z m96141C(ByteBuffer byteBuffer, int i) {
        m96149t(0, i, byteBuffer.remaining());
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new C63086x(bArr);
    }

    /* renamed from: D */
    public static C63088z m96142D(byte[] bArr, int i, int i2) {
        m96149t(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C63086x(bArr2);
    }

    /* renamed from: E */
    public static C63088z m96143E(String str) {
        return new C63086x(str.getBytes(C62972cr.f170009a));
    }

    /* renamed from: F */
    public static C63088z m96144F(InputStream inputStream) {
        C63088z zVar;
        ArrayList arrayList = new ArrayList();
        int i = 256;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            if (i2 == 0) {
                zVar = null;
            } else {
                zVar = m96142D(bArr, 0, i2);
            }
            if (zVar == null) {
                return m96152y(arrayList);
            }
            arrayList.add(zVar);
            i = Math.min(i + i, 8192);
        }
    }

    /* renamed from: G */
    static C63088z m96145G(byte[] bArr) {
        return new C63086x(bArr);
    }

    /* renamed from: H */
    static C63088z m96146H(byte[] bArr, int i, int i2) {
        return new C63082t(bArr, i, i2);
    }

    /* renamed from: J */
    static void m96147J(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    /* renamed from: v */
    public static C63087y m96150v() {
        return new C63087y(128);
    }

    /* renamed from: w */
    public static C63087y m96151w(int i) {
        return new C63087y(i);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.protobuf.C63088z m96152y(java.lang.Iterable r3) {
        /*
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 != 0) goto L_0x0015
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L_0x0009:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0019
            r0.next()
            int r1 = r1 + 1
            goto L_0x0009
        L_0x0015:
            int r1 = r3.size()
        L_0x0019:
            if (r1 != 0) goto L_0x001e
            com.google.protobuf.z r3 = f170246b
            return r3
        L_0x001e:
            java.util.Iterator r3 = r3.iterator()
            com.google.protobuf.z r3 = m96148c(r3, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C63088z.m96152y(java.lang.Iterable):com.google.protobuf.z");
    }

    /* renamed from: z */
    public static C63088z m96153z(ByteBuffer byteBuffer) {
        return m96141C(byteBuffer, byteBuffer.remaining());
    }

    /* renamed from: I */
    public final String mo59170I(Charset charset) {
        return mo59031d() == 0 ? BuildConfig.FLAVOR : mo59042n(charset);
    }

    /* renamed from: K */
    public final void mo59171K(byte[] bArr, int i) {
        mo59172L(bArr, 0, i, mo59031d());
    }

    @Deprecated
    /* renamed from: L */
    public final void mo59172L(byte[] bArr, int i, int i2, int i3) {
        m96149t(i, i + i3, mo59031d());
        m96149t(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            mo59032e(bArr, i, i2, i3);
        }
    }

    /* renamed from: M */
    public final boolean mo59173M() {
        return mo59031d() == 0;
    }

    /* renamed from: N */
    public final byte[] mo59174N() {
        int d = mo59031d();
        if (d == 0) {
            return C62972cr.f170010b;
        }
        byte[] bArr = new byte[d];
        mo59032e(bArr, 0, 0, d);
        return bArr;
    }

    /* renamed from: a */
    public abstract byte mo59029a(int i);

    /* renamed from: b */
    public abstract byte mo59030b(int i);

    /* renamed from: d */
    public abstract int mo59031d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo59032e(byte[] bArr, int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract int mo59034f();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract boolean mo59035h();

    public final int hashCode() {
        int i = this.f170247c;
        if (i == 0) {
            int d = mo59031d();
            i = mo59036i(d, 0, d);
            if (i == 0) {
                i = 1;
            }
            this.f170247c = i;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract int mo59036i(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract int mo59038j(int i, int i2, int i3);

    /* renamed from: k */
    public abstract C63088z mo59039k(int i, int i2);

    /* renamed from: l */
    public abstract C62897ae mo59040l();

    /* renamed from: m */
    public abstract InputStream mo59041m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract String mo59042n(Charset charset);

    /* renamed from: o */
    public abstract ByteBuffer mo59043o();

    /* renamed from: p */
    public abstract void mo59044p(ByteBuffer byteBuffer);

    /* renamed from: q */
    public abstract void mo59045q(C63079q qVar);

    /* renamed from: r */
    public abstract void mo59046r(OutputStream outputStream);

    /* renamed from: s */
    public abstract boolean mo59047s();

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo59031d());
        objArr[2] = mo59031d() <= 50 ? C63040fe.m95870a(this) : C63040fe.m95870a(mo59039k(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: u */
    public C63083u iterator() {
        return new C63080r(this);
    }

    /* renamed from: x */
    public final C63088z mo59177x(C63088z zVar) {
        C63021em emVar;
        if (Integer.MAX_VALUE - mo59031d() >= zVar.mo59031d()) {
            int i = C63021em.f170113h;
            if (zVar.mo59031d() == 0) {
                return this;
            }
            if (mo59031d() == 0) {
                return zVar;
            }
            int d = mo59031d() + zVar.mo59031d();
            if (d < 128) {
                return C63021em.m95768g(this, zVar);
            }
            if (this instanceof C63021em) {
                C63021em emVar2 = (C63021em) this;
                if (emVar2.f170116f.mo59031d() + zVar.mo59031d() < 128) {
                    emVar = new C63021em(emVar2.f170115e, C63021em.m95768g(emVar2.f170116f, zVar));
                    return emVar;
                } else if (emVar2.f170115e.mo59034f() > emVar2.f170116f.mo59034f() && emVar2.f170117g > zVar.mo59034f()) {
                    return new C63021em(emVar2.f170115e, new C63021em(emVar2.f170116f, zVar));
                }
            }
            if (d >= C63021em.m95767c(Math.max(mo59034f(), zVar.mo59034f()) + 1)) {
                emVar = new C63021em(this, zVar);
                return emVar;
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            C63018ej.m95759a(this, arrayDeque);
            C63018ej.m95759a(zVar, arrayDeque);
            C63088z zVar2 = (C63088z) arrayDeque.pop();
            while (!arrayDeque.isEmpty()) {
                zVar2 = new C63021em((C63088z) arrayDeque.pop(), zVar2);
            }
            return zVar2;
        }
        int d2 = mo59031d();
        int d3 = zVar.mo59031d();
        throw new IllegalArgumentException("ByteString would be too long: " + d2 + "+" + d3);
    }

    /* renamed from: c */
    private static C63088z m96148c(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i)}));
        } else if (i == 1) {
            return (C63088z) it.next();
        } else {
            int i2 = i >>> 1;
            return m96148c(it, i2).mo59177x(m96148c(it, i - i2));
        }
    }

    /* renamed from: t */
    static int m96149t(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
        }
    }
}
