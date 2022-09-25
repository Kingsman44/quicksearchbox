package com.google.protobuf;

import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.protobuf.em */
/* compiled from: PG */
final class C63021em extends C63088z {

    /* renamed from: a */
    static final int[] f170112a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: h */
    public static final /* synthetic */ int f170113h = 0;
    private static final long serialVersionUID = 1;

    /* renamed from: d */
    public final int f170114d;

    /* renamed from: e */
    public final C63088z f170115e;

    /* renamed from: f */
    public final C63088z f170116f;

    /* renamed from: g */
    public final int f170117g;

    /* renamed from: i */
    private final int f170118i;

    public C63021em(C63088z zVar, C63088z zVar2) {
        this.f170115e = zVar;
        this.f170116f = zVar2;
        int d = zVar.mo59031d();
        this.f170118i = d;
        this.f170114d = d + zVar2.mo59031d();
        this.f170117g = Math.max(zVar.mo59034f(), zVar2.mo59034f()) + 1;
    }

    /* renamed from: c */
    static int m95767c(int i) {
        int[] iArr = f170112a;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    /* renamed from: g */
    public static C63088z m95768g(C63088z zVar, C63088z zVar2) {
        int d = zVar.mo59031d();
        int d2 = zVar2.mo59031d();
        byte[] bArr = new byte[(d + d2)];
        zVar.mo59172L(bArr, 0, 0, d);
        zVar2.mo59172L(bArr, 0, d, d2);
        return new C63086x(bArr);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    /* renamed from: a */
    public final byte mo59029a(int i) {
        m96147J(i, this.f170114d);
        return mo59030b(i);
    }

    /* renamed from: b */
    public final byte mo59030b(int i) {
        int i2 = this.f170118i;
        if (i < i2) {
            return this.f170115e.mo59030b(i);
        }
        return this.f170116f.mo59030b(i - i2);
    }

    /* renamed from: d */
    public final int mo59031d() {
        return this.f170114d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo59032e(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.f170118i;
        if (i + i3 <= i4) {
            this.f170115e.mo59032e(bArr, i, i2, i3);
        } else if (i >= i4) {
            this.f170116f.mo59032e(bArr, i - i4, i2, i3);
        } else {
            int i5 = i4 - i;
            this.f170115e.mo59032e(bArr, i, i2, i5);
            this.f170116f.mo59032e(bArr, 0, i2 + i5, i3 - i5);
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C63088z)) {
            return false;
        }
        C63088z zVar = (C63088z) obj;
        if (this.f170114d != zVar.mo59031d()) {
            return false;
        }
        if (this.f170114d == 0) {
            return true;
        }
        int i = this.f170247c;
        int i2 = zVar.f170247c;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        C63019ek ekVar = new C63019ek(this);
        C63085w a = ekVar.next();
        C63019ek ekVar2 = new C63019ek(zVar);
        C63085w a2 = ekVar2.next();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int d = a.mo59031d() - i3;
            int d2 = a2.mo59031d() - i4;
            int min = Math.min(d, d2);
            if (i3 == 0) {
                z = a.mo59163g(a2, i4, min);
            } else {
                z = a2.mo59163g(a, i3, min);
            }
            if (!z) {
                return false;
            }
            i5 += min;
            int i6 = this.f170114d;
            if (i5 < i6) {
                if (min == d) {
                    a = ekVar.next();
                    i3 = 0;
                } else {
                    i3 += min;
                }
                if (min == d2) {
                    a2 = ekVar2.next();
                    i4 = 0;
                } else {
                    i4 += min;
                }
            } else if (i5 == i6) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo59034f() {
        return this.f170117g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo59035h() {
        return this.f170114d >= m95767c(this.f170117g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final int mo59036i(int i, int i2, int i3) {
        int i4 = this.f170118i;
        if (i2 + i3 <= i4) {
            return this.f170115e.mo59036i(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.f170116f.mo59036i(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.f170116f.mo59036i(this.f170115e.mo59036i(i, i2, i5), 0, i3 - i5);
    }

    public final /* synthetic */ Iterator iterator() {
        return new C63017ei(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final int mo59038j(int i, int i2, int i3) {
        int i4 = this.f170118i;
        if (i2 + i3 <= i4) {
            return this.f170115e.mo59038j(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.f170116f.mo59038j(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.f170116f.mo59038j(this.f170115e.mo59038j(i, i2, i5), 0, i3 - i5);
    }

    /* renamed from: k */
    public final C63088z mo59039k(int i, int i2) {
        int t = m96149t(i, i2, this.f170114d);
        if (t == 0) {
            return C63088z.f170246b;
        }
        if (t == this.f170114d) {
            return this;
        }
        int i3 = this.f170118i;
        if (i2 <= i3) {
            return this.f170115e.mo59039k(i, i2);
        }
        if (i >= i3) {
            return this.f170116f.mo59039k(i - i3, i2 - i3);
        }
        C63088z zVar = this.f170115e;
        return new C63021em(zVar.mo59039k(i, zVar.mo59031d()), this.f170116f.mo59039k(0, i2 - this.f170118i));
    }

    /* renamed from: l */
    public final C62897ae mo59040l() {
        ArrayList<ByteBuffer> arrayList = new ArrayList<>();
        C63019ek ekVar = new C63019ek(this);
        while (ekVar.hasNext()) {
            arrayList.add(ekVar.next().mo59043o());
        }
        int i = C62897ae.f169827g;
        boolean z = false;
        int i2 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i2 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                z |= true;
            } else {
                z = byteBuffer.isDirect() ? z | true : z | true;
            }
        }
        if (z) {
            return new C62894ab(arrayList, i2);
        }
        return C62897ae.m95110M(new C62975cu(arrayList));
    }

    /* renamed from: m */
    public final InputStream mo59041m() {
        return new C63020el(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final String mo59042n(Charset charset) {
        return new String(mo59174N(), charset);
    }

    /* renamed from: o */
    public final ByteBuffer mo59043o() {
        return ByteBuffer.wrap(mo59174N()).asReadOnlyBuffer();
    }

    /* renamed from: p */
    public final void mo59044p(ByteBuffer byteBuffer) {
        this.f170115e.mo59044p(byteBuffer);
        this.f170116f.mo59044p(byteBuffer);
    }

    /* renamed from: q */
    public final void mo59045q(C63079q qVar) {
        this.f170115e.mo59045q(qVar);
        this.f170116f.mo59045q(qVar);
    }

    /* renamed from: r */
    public final void mo59046r(OutputStream outputStream) {
        this.f170115e.mo59046r(outputStream);
        this.f170116f.mo59046r(outputStream);
    }

    /* renamed from: s */
    public final boolean mo59047s() {
        int j = this.f170115e.mo59038j(0, 0, this.f170118i);
        C63088z zVar = this.f170116f;
        if (zVar.mo59038j(j, 0, zVar.mo59031d()) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final C63083u mo59048u() {
        return new C63017ei(this);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C63086x(mo59174N());
    }
}
