package com.bumptech.glide.p291h;

import android.support.p033v7.widget.LinearLayoutManager;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.bumptech.glide.h.o */
/* compiled from: PG */
public final class C5628o extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    private int f16969a = LinearLayoutManager.INVALID_OFFSET;

    public C5628o(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    private final long m14601a(long j) {
        int i = this.f16969a;
        if (i == 0) {
            return -1;
        }
        if (i != Integer.MIN_VALUE) {
            long j2 = (long) i;
            if (j > j2) {
                return j2;
            }
        }
        return j;
    }

    /* renamed from: b */
    private final void m14602b(long j) {
        int i = this.f16969a;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f16969a = (int) (((long) i) - j);
        }
    }

    public final int available() {
        int i = this.f16969a;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    public final synchronized void mark(int i) {
        super.mark(i);
        this.f16969a = i;
    }

    public final int read() {
        if (m14601a(1) == -1) {
            return -1;
        }
        int read = super.read();
        m14602b(1);
        return read;
    }

    public final synchronized void reset() {
        super.reset();
        this.f16969a = LinearLayoutManager.INVALID_OFFSET;
    }

    public final long skip(long j) {
        long a = m14601a(j);
        if (a == -1) {
            return 0;
        }
        long skip = super.skip(a);
        m14602b(skip);
        return skip;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr, int i, int i2) {
        int a = (int) m14601a((long) i2);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a);
        m14602b((long) read);
        return read;
    }
}
