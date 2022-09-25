package com.google.p370af;

import com.google.common.p4535g.C59203do;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.google.af.c */
/* compiled from: PG */
public final class C7490c {

    /* renamed from: a */
    public ByteBuffer f24688a;

    /* renamed from: b */
    public int f24689b;

    /* renamed from: c */
    int f24690c;

    /* renamed from: d */
    int[] f24691d;

    /* renamed from: e */
    int f24692e;

    /* renamed from: f */
    boolean f24693f;

    /* renamed from: g */
    boolean f24694g;

    /* renamed from: h */
    int f24695h;

    /* renamed from: i */
    int[] f24696i;

    /* renamed from: j */
    int f24697j;

    /* renamed from: k */
    int f24698k;

    /* renamed from: l */
    C7488a f24699l;

    /* renamed from: m */
    final C7494g f24700m;

    public C7490c() {
        this(1024);
    }

    /* renamed from: p */
    public static boolean m22726p(C7492e eVar, int i) {
        return eVar.mo16913a(i) != 0;
    }

    /* renamed from: a */
    public final int mo16893a(byte[] bArr) {
        int length = bArr.length;
        mo16907o(1, length, 1);
        ByteBuffer byteBuffer = this.f24688a;
        int i = this.f24689b - length;
        this.f24689b = i;
        ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(i);
        this.f24688a.put(bArr);
        return mo16896d();
    }

    /* renamed from: b */
    public final int mo16894b(CharSequence charSequence) {
        int a = this.f24700m.mo16919a(charSequence);
        mo16904l(1, 0);
        ByteBuffer byteBuffer = this.f24688a;
        int i = this.f24689b - 1;
        this.f24689b = i;
        byteBuffer.put(i, (byte) 0);
        mo16907o(1, a, 1);
        ByteBuffer byteBuffer2 = this.f24688a;
        int i2 = this.f24689b - a;
        this.f24689b = i2;
        ByteBuffer byteBuffer3 = (ByteBuffer) byteBuffer2.position(i2);
        this.f24700m.mo16921c(charSequence, this.f24688a);
        return mo16896d();
    }

    /* renamed from: c */
    public final int mo16895c() {
        int i;
        if (this.f24691d == null || !this.f24693f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        mo16899g(0);
        int e = mo16897e();
        int i2 = this.f24692e;
        do {
            i2--;
            if (i2 < 0 || this.f24691d[i2] != 0) {
            }
            i2--;
            break;
        } while (this.f24691d[i2] != 0);
        for (int i3 = i2; i3 >= 0; i3--) {
            int i4 = this.f24691d[i3];
            mo16901i((short) (i4 != 0 ? e - i4 : 0));
        }
        mo16901i((short) (e - this.f24695h));
        int i5 = i2 + 3;
        mo16901i((short) (i5 + i5));
        int i6 = 0;
        loop2:
        while (true) {
            if (i6 >= this.f24697j) {
                i = 0;
                break;
            }
            int capacity = this.f24688a.capacity() - this.f24696i[i6];
            int i7 = this.f24689b;
            short s = this.f24688a.getShort(capacity);
            if (s == this.f24688a.getShort(i7)) {
                int i8 = 2;
                while (i8 < s) {
                    if (this.f24688a.getShort(capacity + i8) == this.f24688a.getShort(i7 + i8)) {
                        i8 += 2;
                    }
                }
                i = this.f24696i[i6];
                break loop2;
            }
            i6++;
        }
        if (i != 0) {
            int capacity2 = this.f24688a.capacity() - e;
            this.f24689b = capacity2;
            this.f24688a.putInt(capacity2, i - e);
        } else {
            int i9 = this.f24697j;
            int[] iArr = this.f24696i;
            if (i9 == iArr.length) {
                this.f24696i = Arrays.copyOf(iArr, i9 + i9);
            }
            int[] iArr2 = this.f24696i;
            int i10 = this.f24697j;
            this.f24697j = i10 + 1;
            iArr2[i10] = mo16897e();
            ByteBuffer byteBuffer = this.f24688a;
            byteBuffer.putInt(byteBuffer.capacity() - e, mo16897e() - e);
        }
        this.f24693f = false;
        return e;
    }

    /* renamed from: d */
    public final int mo16896d() {
        if (this.f24693f) {
            this.f24693f = false;
            mo16905m(this.f24698k);
            return mo16897e();
        }
        throw new AssertionError("FlatBuffers: endVector called without startVector");
    }

    /* renamed from: e */
    public final int mo16897e() {
        return this.f24688a.capacity() - this.f24689b;
    }

    /* renamed from: f */
    public final void mo16898f(int i, boolean z, boolean z2) {
        if (z != z2) {
            mo16904l(1, 0);
            ByteBuffer byteBuffer = this.f24688a;
            int i2 = this.f24689b - 1;
            this.f24689b = i2;
            byteBuffer.put(i2, z ? (byte) 1 : 0);
            this.f24691d[i] = mo16897e();
        }
    }

    /* renamed from: g */
    public final void mo16899g(int i) {
        mo16904l(4, 0);
        mo16905m(i);
    }

    /* renamed from: h */
    public final void mo16900h(int i) {
        mo16904l(4, 0);
        mo16905m((mo16897e() - i) + 4);
    }

    /* renamed from: i */
    public final void mo16901i(short s) {
        mo16904l(2, 0);
        ByteBuffer byteBuffer = this.f24688a;
        int i = this.f24689b - 2;
        this.f24689b = i;
        byteBuffer.putShort(i, s);
    }

    /* renamed from: j */
    public final void mo16902j() {
        if (!this.f24694g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    /* renamed from: k */
    public final void mo16903k() {
        if (this.f24693f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    /* renamed from: l */
    public final void mo16904l(int i, int i2) {
        int i3;
        if (i > this.f24690c) {
            this.f24690c = i;
        }
        int capacity = ((((this.f24688a.capacity() - this.f24689b) + i2) ^ -1) + 1) & (i - 1);
        while (this.f24689b < capacity + i + i2) {
            int capacity2 = this.f24688a.capacity();
            ByteBuffer byteBuffer = this.f24688a;
            C7488a aVar = this.f24699l;
            int capacity3 = byteBuffer.capacity();
            if (capacity3 == 0) {
                i3 = 1024;
            } else {
                i3 = 2147483639;
                if (capacity3 == 2147483639) {
                    throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
                } else if ((-1073741824 & capacity3) == 0) {
                    i3 = capacity3 + capacity3;
                }
            }
            ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(0);
            ByteBuffer a = aVar.mo16892a(i3);
            ByteBuffer byteBuffer3 = (ByteBuffer) a.position(((ByteBuffer) a.clear()).capacity() - capacity3);
            a.put(byteBuffer);
            this.f24688a = a;
            this.f24689b += a.capacity() - capacity2;
        }
        for (int i4 = 0; i4 < capacity; i4++) {
            ByteBuffer byteBuffer4 = this.f24688a;
            int i5 = this.f24689b - 1;
            this.f24689b = i5;
            byteBuffer4.put(i5, (byte) 0);
        }
    }

    /* renamed from: m */
    public final void mo16905m(int i) {
        ByteBuffer byteBuffer = this.f24688a;
        int i2 = this.f24689b - 4;
        this.f24689b = i2;
        byteBuffer.putInt(i2, i);
    }

    /* renamed from: n */
    public final void mo16906n(int i) {
        mo16903k();
        int[] iArr = this.f24691d;
        if (iArr == null || iArr.length < i) {
            this.f24691d = new int[i];
        }
        this.f24692e = i;
        Arrays.fill(this.f24691d, 0, i, 0);
        this.f24693f = true;
        this.f24695h = mo16897e();
    }

    /* renamed from: o */
    public final void mo16907o(int i, int i2, int i3) {
        mo16903k();
        this.f24698k = i2;
        int i4 = i * i2;
        mo16904l(4, i4);
        mo16904l(i3, i4);
        this.f24693f = true;
    }

    /* renamed from: q */
    public final void mo16908q(int i, float f) {
        if (((double) f) != C59203do.f157270a) {
            mo16904l(4, 0);
            ByteBuffer byteBuffer = this.f24688a;
            int i2 = this.f24689b - 4;
            this.f24689b = i2;
            byteBuffer.putFloat(i2, f);
            this.f24691d[i] = mo16897e();
        }
    }

    /* renamed from: r */
    public final void mo16909r(int i, int i2) {
        if (i2 != 0) {
            mo16899g(i2);
            this.f24691d[i] = mo16897e();
        }
    }

    /* renamed from: s */
    public final void mo16910s(int i, int i2) {
        if (i2 != 0) {
            mo16900h(i2);
            this.f24691d[i] = mo16897e();
        }
    }

    /* renamed from: t */
    public final void mo16911t(int i) {
        mo16904l(this.f24690c, 4);
        mo16900h(i);
        ByteBuffer byteBuffer = (ByteBuffer) this.f24688a.position(this.f24689b);
        this.f24694g = true;
    }

    public C7490c(int i) {
        C7489b bVar = C7489b.f24687a;
        C7494g d = C7494g.m22760d();
        this.f24690c = 1;
        this.f24691d = null;
        this.f24692e = 0;
        this.f24693f = false;
        this.f24694g = false;
        this.f24696i = new int[16];
        this.f24697j = 0;
        this.f24698k = 0;
        i = i <= 0 ? 1024 : i;
        this.f24699l = bVar;
        ByteBuffer a = bVar.mo16892a(i);
        this.f24688a = a;
        this.f24700m = d;
        this.f24689b = a.capacity();
    }
}
