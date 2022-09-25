package com.android.p275j.p276a;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.android.j.a.f */
/* compiled from: PG */
final class C5176f extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    public final long f16449a;

    /* renamed from: b */
    public long f16450b;

    public C5176f(InputStream inputStream, long j) {
        super(inputStream);
        this.f16449a = j;
    }

    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.f16450b++;
        }
        return read;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f16450b += (long) read;
        }
        return read;
    }
}
