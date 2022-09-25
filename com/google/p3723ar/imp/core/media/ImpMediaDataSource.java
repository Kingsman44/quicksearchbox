package com.google.p3723ar.imp.core.media;

import android.media.MediaDataSource;

/* renamed from: com.google.ar.imp.core.media.ImpMediaDataSource */
/* compiled from: PG */
class ImpMediaDataSource extends MediaDataSource {

    /* renamed from: a */
    private byte[] f124150a;

    public final void close() {
    }

    public final long getSize() {
        return (long) this.f124150a.length;
    }

    public final synchronized int readAt(long j, byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.f124150a;
        long length = (long) bArr2.length;
        if (j >= length) {
            return -1;
        }
        long j2 = (long) i2;
        long j3 = j + j2;
        if (j3 > length) {
            i2 = (int) ((j2 - j3) + length);
        }
        System.arraycopy(bArr2, (int) j, bArr, i, i2);
        return i2;
    }

    public synchronized void setData(byte[] bArr) {
        this.f124150a = bArr;
    }
}
