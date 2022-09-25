package com.android.p261d.p263b;

import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.android.d.b.a */
/* compiled from: PG */
final class C5042a extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    public int f15915a = 0;

    /* renamed from: b */
    public final ByteBuffer f15916b;

    /* renamed from: c */
    private final byte[] f15917c;

    protected C5042a(InputStream inputStream) {
        super(inputStream);
        byte[] bArr = new byte[8];
        this.f15917c = bArr;
        this.f15916b = ByteBuffer.wrap(bArr);
    }

    /* renamed from: a */
    public final int mo9983a() {
        mo9986d(this.f15917c, 4);
        this.f15916b.rewind();
        return this.f15916b.getInt();
    }

    /* renamed from: b */
    public final long mo9984b() {
        return ((long) mo9983a()) & 4294967295L;
    }

    /* renamed from: c */
    public final short mo9985c() {
        mo9986d(this.f15917c, 2);
        this.f15916b.rewind();
        return this.f15916b.getShort();
    }

    /* renamed from: d */
    public final void mo9986d(byte[] bArr, int i) {
        if (read(bArr, 0, i) != i) {
            throw new EOFException();
        }
    }

    public final int read() {
        int read = this.in.read();
        this.f15915a += read >= 0 ? 1 : 0;
        return read;
    }

    public final long skip(long j) {
        long skip = this.in.skip(j);
        this.f15915a = (int) (((long) this.f15915a) + skip);
        return skip;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr) {
        int read = this.in.read(bArr);
        this.f15915a += read >= 0 ? read : 0;
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        this.f15915a += read >= 0 ? read : 0;
        return read;
    }
}
