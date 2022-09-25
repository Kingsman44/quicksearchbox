package com.google.android.apps.gsa.speech.audio;

import android.media.MediaDataSource;
import com.google.common.p4575r.C60757n;

/* renamed from: com.google.android.apps.gsa.speech.audio.z */
/* compiled from: PG */
public final class C92215z extends MediaDataSource {

    /* renamed from: a */
    private final byte[] f257095a;

    public C92215z(byte[] bArr) {
        this.f257095a = bArr;
    }

    public final void close() {
    }

    public final long getSize() {
        return (long) this.f257095a.length;
    }

    public final int readAt(long j, byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.f257095a;
        int length = bArr2.length;
        if (j >= ((long) length)) {
            return -1;
        }
        int i3 = (int) j;
        int h = C60757n.m92747h(i2, bArr.length - i, length - i3);
        System.arraycopy(bArr2, i3, bArr, i, h);
        return h;
    }
}
