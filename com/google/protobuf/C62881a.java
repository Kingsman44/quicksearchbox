package com.google.protobuf;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.protobuf.a */
/* compiled from: PG */
final class C62881a extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    private int f169782a;

    public C62881a(InputStream inputStream, int i) {
        super(inputStream);
        this.f169782a = i;
    }

    public final int available() {
        return Math.min(super.available(), this.f169782a);
    }

    public final int read() {
        if (this.f169782a <= 0) {
            return -1;
        }
        int read = super.read();
        if (read >= 0) {
            this.f169782a--;
        }
        return read;
    }

    public final long skip(long j) {
        int skip = (int) super.skip(Math.min(j, (long) this.f169782a));
        if (skip >= 0) {
            this.f169782a -= skip;
        }
        return (long) skip;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f169782a;
        if (i3 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            this.f169782a -= read;
        }
        return read;
    }
}
