package com.google.p4486ci.p4487a;

import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.common.base.C58838bb;
import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: com.google.ci.a.c */
/* compiled from: PG */
public final class C58098c implements C58097b {

    /* renamed from: a */
    private final RandomAccessFile f155297a;

    /* renamed from: b */
    private long f155298b = 0;

    /* renamed from: c */
    private long f155299c = 0;

    public C58098c(File file) {
        this.f155297a = new RandomAccessFile(file, C33259r.f88929b);
    }

    /* renamed from: a */
    public final synchronized int mo54639a(byte[] bArr, int i, int i2) {
        C58838bb.m90869d(65536 - i >= i2, "Buffer length must be greater than desired number of bytes.");
        if (i2 == 0) {
            return 0;
        }
        if (this.f155299c != this.f155297a.getFilePointer()) {
            this.f155297a.seek(this.f155299c);
        }
        int read = this.f155297a.read(bArr, i, i2);
        if (read == -1) {
            return 0;
        }
        this.f155299c += (long) read;
        return read;
    }

    /* renamed from: b */
    public final synchronized long mo54640b() {
        return this.f155298b;
    }

    /* renamed from: c */
    public final synchronized long mo54641c() {
        return Long.MAX_VALUE;
    }

    public final synchronized void close() {
        this.f155297a.close();
    }

    /* renamed from: d */
    public final synchronized long mo54643d() {
        return this.f155299c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000d, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo54644e() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.io.RandomAccessFile r0 = r2.f155297a     // Catch:{ IOException -> 0x000c, all -> 0x0009 }
            long r0 = r0.length()     // Catch:{ IOException -> 0x000c, all -> 0x0009 }
            monitor-exit(r2)
            return r0
        L_0x0009:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x000c:
            monitor-exit(r2)
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4486ci.p4487a.C58098c.mo54644e():long");
    }

    /* renamed from: f */
    public final synchronized long mo54645f(long j) {
        C58838bb.m90869d(j >= 0, "Can't skip negative bytes.");
        if (j == 0) {
            return 0;
        }
        long min = Math.min(this.f155299c + j, this.f155297a.length());
        this.f155297a.seek(min);
        long j2 = this.f155299c;
        this.f155299c = min;
        return min - j2;
    }

    /* renamed from: g */
    public final synchronized void mo54646g() {
        this.f155298b = this.f155299c;
    }

    /* renamed from: h */
    public final synchronized void mo54647h() {
        this.f155299c = this.f155298b;
    }

    /* renamed from: i */
    public final synchronized boolean mo54648i() {
        return this.f155299c < this.f155297a.length();
    }
}
