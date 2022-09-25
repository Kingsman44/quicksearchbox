package com.google.protobuf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* renamed from: com.google.protobuf.t */
/* compiled from: PG */
final class C63082t extends C63086x {
    private static final long serialVersionUID = 1;

    /* renamed from: d */
    private final int f170237d;

    /* renamed from: e */
    private final int f170238e;

    public C63082t(byte[] bArr, int i, int i2) {
        super(bArr);
        m96149t(i, i + i2, bArr.length);
        this.f170237d = i;
        this.f170238e = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    /* renamed from: a */
    public final byte mo59029a(int i) {
        m96147J(i, this.f170238e);
        return this.f170239a[this.f170237d + i];
    }

    /* renamed from: b */
    public final byte mo59030b(int i) {
        return this.f170239a[this.f170237d + i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo59161c() {
        return this.f170237d;
    }

    /* renamed from: d */
    public final int mo59031d() {
        return this.f170238e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo59032e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f170239a, this.f170237d + i, bArr, i2, i3);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C63086x(mo59174N());
    }
}
