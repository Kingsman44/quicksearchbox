package com.google.android.apps.gsa.p8889z.p8890a;

import android.media.MediaDataSource;
import com.google.common.p4575r.C60757n;

/* renamed from: com.google.android.apps.gsa.z.a.h */
/* compiled from: PG */
final class C118845h extends MediaDataSource {

    /* renamed from: a */
    final /* synthetic */ byte[] f331473a;

    /* renamed from: b */
    private final byte[] f331474b;

    /* renamed from: c */
    private boolean f331475c;

    public C118845h(byte[] bArr) {
        byte[] bArr2;
        this.f331473a = bArr;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f331474b = bArr2;
        this.f331475c = false;
    }

    public final void close() {
        this.f331475c = true;
    }

    public final long getSize() {
        byte[] bArr = this.f331474b;
        if (bArr == null) {
            return 0;
        }
        return (long) bArr.length;
    }

    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        byte[] bArr2 = this.f331474b;
        if (bArr2 == null || this.f331475c) {
            return -1;
        }
        int length = bArr2.length;
        if (j >= ((long) length)) {
            return -1;
        }
        int i3 = (int) j;
        int h = C60757n.m92747h(length - i3, bArr.length - i, i2);
        System.arraycopy(bArr2, i3, bArr, i, h);
        return h;
    }
}
