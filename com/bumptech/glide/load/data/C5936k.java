package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.bumptech.glide.load.data.k */
/* compiled from: PG */
public final class C5936k extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    private static final byte[] f17588a = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: b */
    private static final int f17589b = 31;

    /* renamed from: c */
    private final byte f17590c;

    /* renamed from: d */
    private int f17591d;

    public C5936k(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
        }
        this.f17590c = (byte) i;
    }

    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() {
        int i;
        int i2 = this.f17591d;
        int read = (i2 < 2 || i2 > (i = f17589b)) ? super.read() : i2 == i ? this.f17590c : f17588a[i2 - 2] & 255;
        if (read != -1) {
            this.f17591d++;
        }
        return read;
    }

    public final void reset() {
        throw new UnsupportedOperationException();
    }

    public final long skip(long j) {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f17591d = (int) (((long) this.f17591d) + skip);
        }
        return skip;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = this.f17591d;
        int i5 = f17589b;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f17590c;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(f17588a, this.f17591d - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.f17591d += i3;
        }
        return i3;
    }
}
