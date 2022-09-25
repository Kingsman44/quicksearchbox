package com.bumptech.glide.load.p299c.p300a;

import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.c.a.p */
/* compiled from: PG */
final class C5867p implements C5866o {

    /* renamed from: a */
    private final InputStream f17467a;

    public C5867p(InputStream inputStream) {
        this.f17467a = inputStream;
    }

    /* renamed from: a */
    public final int mo12328a() {
        return (mo12331d() << 8) | mo12331d();
    }

    /* renamed from: b */
    public final int mo12329b(byte[] bArr, int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = this.f17467a.read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 != 0 || i3 != -1) {
            return i2;
        }
        throw new C5865n();
    }

    /* renamed from: c */
    public final long mo12330c(long j) {
        if (j < 0) {
            return 0;
        }
        long j2 = j;
        while (j2 > 0) {
            long skip = this.f17467a.skip(j2);
            if (skip > 0) {
                j2 -= skip;
            } else if (this.f17467a.read() == -1) {
                break;
            } else {
                j2--;
            }
        }
        return j - j2;
    }

    /* renamed from: d */
    public final short mo12331d() {
        int read = this.f17467a.read();
        if (read != -1) {
            return (short) read;
        }
        throw new C5865n();
    }
}
