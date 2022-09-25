package com.bumptech.glide.load.data;

import com.bumptech.glide.load.p293a.p294a.C5640b;
import java.io.OutputStream;

/* renamed from: com.bumptech.glide.load.data.c */
/* compiled from: PG */
public final class C5928c extends OutputStream {

    /* renamed from: a */
    private final OutputStream f17581a;

    /* renamed from: b */
    private byte[] f17582b;

    /* renamed from: c */
    private final C5640b f17583c;

    /* renamed from: d */
    private int f17584d;

    public C5928c(OutputStream outputStream, C5640b bVar) {
        this.f17581a = outputStream;
        this.f17583c = bVar;
        this.f17582b = (byte[]) bVar.mo12105a(65536, byte[].class);
    }

    /* renamed from: a */
    private final void m15305a() {
        int i = this.f17584d;
        if (i > 0) {
            this.f17581a.write(this.f17582b, 0, i);
            this.f17584d = 0;
        }
    }

    /* renamed from: b */
    private final void m15306b() {
        if (this.f17584d == this.f17582b.length) {
            m15305a();
        }
    }

    /* JADX INFO: finally extract failed */
    public final void close() {
        try {
            flush();
            this.f17581a.close();
            byte[] bArr = this.f17582b;
            if (bArr != null) {
                this.f17583c.mo12107c(bArr);
                this.f17582b = null;
            }
        } catch (Throwable th) {
            this.f17581a.close();
            throw th;
        }
    }

    public final void flush() {
        m15305a();
        this.f17581a.flush();
    }

    public final void write(int i) {
        byte[] bArr = this.f17582b;
        int i2 = this.f17584d;
        this.f17584d = i2 + 1;
        bArr[i2] = (byte) i;
        m15306b();
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f17584d;
            if (i6 == 0) {
                if (i4 < this.f17582b.length) {
                    i6 = 0;
                } else {
                    this.f17581a.write(bArr, i5, i4);
                    return;
                }
            }
            int min = Math.min(i4, this.f17582b.length - i6);
            System.arraycopy(bArr, i5, this.f17582b, this.f17584d, min);
            this.f17584d += min;
            i3 += min;
            m15306b();
        } while (i3 < i2);
    }
}
