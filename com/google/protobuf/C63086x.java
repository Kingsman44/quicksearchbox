package com.google.protobuf;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.protobuf.x */
/* compiled from: PG */
public class C63086x extends C63085w {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public final byte[] f170239a;

    public C63086x(byte[] bArr) {
        bArr.getClass();
        this.f170239a = bArr;
    }

    /* renamed from: a */
    public byte mo59029a(int i) {
        return this.f170239a[i];
    }

    /* renamed from: b */
    public byte mo59030b(int i) {
        return this.f170239a[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo59161c() {
        return 0;
    }

    /* renamed from: d */
    public int mo59031d() {
        return this.f170239a.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo59032e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f170239a, i, bArr, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C63088z) || mo59031d() != ((C63088z) obj).mo59031d()) {
            return false;
        }
        if (mo59031d() == 0) {
            return true;
        }
        if (!(obj instanceof C63086x)) {
            return obj.equals(this);
        }
        C63086x xVar = (C63086x) obj;
        int i = this.f170247c;
        int i2 = xVar.f170247c;
        if (i == 0 || i2 == 0 || i == i2) {
            return mo59163g(xVar, 0, mo59031d());
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo59163g(C63088z zVar, int i, int i2) {
        if (i2 <= zVar.mo59031d()) {
            int i3 = i + i2;
            if (i3 > zVar.mo59031d()) {
                int d = zVar.mo59031d();
                throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + d);
            } else if (!(zVar instanceof C63086x)) {
                return zVar.mo59039k(i, i3).equals(mo59039k(0, i2));
            } else {
                C63086x xVar = (C63086x) zVar;
                byte[] bArr = this.f170239a;
                byte[] bArr2 = xVar.f170239a;
                int c = mo59161c() + i2;
                int c2 = mo59161c();
                int c3 = xVar.mo59161c() + i;
                while (c2 < c) {
                    if (bArr[c2] != bArr2[c3]) {
                        return false;
                    }
                    c2++;
                    c3++;
                }
                return true;
            }
        } else {
            int d2 = mo59031d();
            throw new IllegalArgumentException("Length too large: " + i2 + d2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final int mo59036i(int i, int i2, int i3) {
        return C62972cr.m95544d(i, this.f170239a, mo59161c() + i2, i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final int mo59038j(int i, int i2, int i3) {
        int c = mo59161c() + i2;
        return C63059fx.f170178a.mo59144b(i, this.f170239a, c, i3 + c);
    }

    /* renamed from: k */
    public final C63088z mo59039k(int i, int i2) {
        int t = m96149t(i, i2, mo59031d());
        if (t == 0) {
            return C63088z.f170246b;
        }
        return new C63082t(this.f170239a, mo59161c() + i, t);
    }

    /* renamed from: l */
    public final C62897ae mo59040l() {
        return C62897ae.m95112O(this.f170239a, mo59161c(), mo59031d());
    }

    /* renamed from: m */
    public final InputStream mo59041m() {
        return new ByteArrayInputStream(this.f170239a, mo59161c(), mo59031d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final String mo59042n(Charset charset) {
        return new String(this.f170239a, mo59161c(), mo59031d(), charset);
    }

    /* renamed from: o */
    public final ByteBuffer mo59043o() {
        return ByteBuffer.wrap(this.f170239a, mo59161c(), mo59031d()).asReadOnlyBuffer();
    }

    /* renamed from: p */
    public final void mo59044p(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f170239a, mo59161c(), mo59031d());
    }

    /* renamed from: q */
    public final void mo59045q(C63079q qVar) {
        qVar.mo58762a(this.f170239a, mo59161c(), mo59031d());
    }

    /* renamed from: r */
    public final void mo59046r(OutputStream outputStream) {
        outputStream.write(mo59174N());
    }

    /* renamed from: s */
    public final boolean mo59047s() {
        int c = mo59161c();
        return C63059fx.f170178a.mo59150h(this.f170239a, c, mo59031d() + c);
    }
}
