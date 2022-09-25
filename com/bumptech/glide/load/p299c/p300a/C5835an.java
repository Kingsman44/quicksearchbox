package com.bumptech.glide.load.p299c.p300a;

import com.bumptech.glide.load.p293a.p294a.C5640b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.bumptech.glide.load.c.a.an */
/* compiled from: PG */
public final class C5835an extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    private volatile byte[] f17426a;

    /* renamed from: b */
    private int f17427b;

    /* renamed from: c */
    private int f17428c;

    /* renamed from: d */
    private int f17429d = -1;

    /* renamed from: e */
    private int f17430e;

    /* renamed from: f */
    private final C5640b f17431f;

    public C5835an(InputStream inputStream, C5640b bVar) {
        super(inputStream);
        this.f17431f = bVar;
        this.f17426a = (byte[]) bVar.mo12105a(65536, byte[].class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m15087c(java.io.InputStream r6, byte[] r7) {
        /*
            r5 = this;
            int r0 = r5.f17429d
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L_0x0055
            int r3 = r5.f17430e
            int r4 = r5.f17428c
            int r3 = r3 - r0
            if (r3 < r4) goto L_0x000e
            goto L_0x0055
        L_0x000e:
            if (r0 != 0) goto L_0x0034
            int r0 = r7.length
            if (r4 <= r0) goto L_0x0033
            int r2 = r5.f17427b
            if (r2 != r0) goto L_0x0033
            int r2 = r0 + r0
            if (r2 <= r4) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r4 = r2
        L_0x001d:
            com.bumptech.glide.load.a.a.b r2 = r5.f17431f
            java.lang.Class<byte[]> r3 = byte[].class
            java.lang.Object r2 = r2.mo12105a(r4, r3)
            byte[] r2 = (byte[]) r2
            java.lang.System.arraycopy(r7, r1, r2, r1, r0)
            r5.f17426a = r2
            com.bumptech.glide.load.a.a.b r0 = r5.f17431f
            r0.mo12107c(r7)
            r7 = r2
            goto L_0x003b
        L_0x0033:
            r0 = 0
        L_0x0034:
            if (r0 <= 0) goto L_0x003b
            int r2 = r7.length
            int r2 = r2 - r0
            java.lang.System.arraycopy(r7, r0, r7, r1, r2)
        L_0x003b:
            int r0 = r5.f17430e
            int r2 = r5.f17429d
            int r0 = r0 - r2
            r5.f17430e = r0
            r5.f17429d = r1
            r5.f17427b = r1
            int r1 = r7.length
            int r1 = r1 - r0
            int r6 = r6.read(r7, r0, r1)
            int r7 = r5.f17430e
            if (r6 > 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            int r7 = r7 + r6
        L_0x0052:
            r5.f17427b = r7
            return r6
        L_0x0055:
            int r6 = r6.read(r7)
            if (r6 <= 0) goto L_0x0061
            r5.f17429d = r2
            r5.f17430e = r1
            r5.f17427b = r6
        L_0x0061:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p299c.p300a.C5835an.m15087c(java.io.InputStream, byte[]):int");
    }

    /* renamed from: d */
    private static IOException m15088d() {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: a */
    public final synchronized void mo12302a() {
        this.f17428c = this.f17426a.length;
    }

    public final synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f17426a == null || inputStream == null) {
            throw m15088d();
        }
        return (this.f17427b - this.f17430e) + inputStream.available();
    }

    /* renamed from: b */
    public final synchronized void mo12304b() {
        if (this.f17426a != null) {
            this.f17431f.mo12107c(this.f17426a);
            this.f17426a = null;
        }
    }

    public final void close() {
        if (this.f17426a != null) {
            this.f17431f.mo12107c(this.f17426a);
            this.f17426a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final synchronized void mark(int i) {
        this.f17428c = Math.max(this.f17428c, i);
        this.f17429d = this.f17430e;
    }

    public final boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0019=Splitter:B:11:0x0019, B:27:0x003a=Splitter:B:27:0x003a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read() {
        /*
            r5 = this;
            monitor-enter(r5)
            byte[] r0 = r5.f17426a     // Catch:{ all -> 0x003f }
            java.io.InputStream r1 = r5.in     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x003a
            if (r1 == 0) goto L_0x003a
            int r2 = r5.f17430e     // Catch:{ all -> 0x003f }
            int r3 = r5.f17427b     // Catch:{ all -> 0x003f }
            r4 = -1
            if (r2 < r3) goto L_0x0019
            int r1 = r5.m15087c(r1, r0)     // Catch:{ all -> 0x003f }
            if (r1 == r4) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            monitor-exit(r5)
            return r4
        L_0x0019:
            byte[] r1 = r5.f17426a     // Catch:{ all -> 0x003f }
            if (r0 == r1) goto L_0x0027
            byte[] r0 = r5.f17426a     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0022
            goto L_0x0027
        L_0x0022:
            java.io.IOException r0 = m15088d()     // Catch:{ all -> 0x003f }
            throw r0     // Catch:{ all -> 0x003f }
        L_0x0027:
            int r1 = r5.f17427b     // Catch:{ all -> 0x003f }
            int r2 = r5.f17430e     // Catch:{ all -> 0x003f }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0038
            int r1 = r2 + 1
            r5.f17430e = r1     // Catch:{ all -> 0x003f }
            byte r0 = r0[r2]     // Catch:{ all -> 0x003f }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r5)
            return r0
        L_0x0038:
            monitor-exit(r5)
            return r4
        L_0x003a:
            java.io.IOException r0 = m15088d()     // Catch:{ all -> 0x003f }
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p299c.p300a.C5835an.read():int");
    }

    public final synchronized void reset() {
        if (this.f17426a != null) {
            int i = this.f17429d;
            if (i != -1) {
                this.f17430e = i;
            } else {
                int i2 = this.f17430e;
                int i3 = this.f17428c;
                throw new C5834am("Mark has been invalidated, pos: " + i2 + " markLimit: " + i3);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0;
        }
        byte[] bArr = this.f17426a;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i = this.f17427b;
                int i2 = this.f17430e;
                if (((long) (i - i2)) >= j) {
                    this.f17430e = (int) (((long) i2) + j);
                    return j;
                }
                long j2 = ((long) i) - ((long) i2);
                this.f17430e = i;
                if (this.f17429d == -1 || j > ((long) this.f17428c)) {
                    long skip = inputStream.skip(j - j2);
                    if (skip > 0) {
                        this.f17429d = -1;
                    }
                    return j2 + skip;
                } else if (m15087c(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    int i3 = this.f17427b;
                    int i4 = this.f17430e;
                    if (((long) (i3 - i4)) >= j - j2) {
                        this.f17430e = (int) ((((long) i4) + j) - j2);
                        return j;
                    }
                    this.f17430e = i3;
                    return (j2 + ((long) i3)) - ((long) i4);
                }
            } else {
                throw m15088d();
            }
        } else {
            throw m15088d();
        }
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read(byte[] r6, int r7, int r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            byte[] r0 = r5.f17426a     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x0085
            if (r8 != 0) goto L_0x000a
            monitor-exit(r5)
            r6 = 0
            return r6
        L_0x000a:
            java.io.InputStream r1 = r5.in     // Catch:{ all -> 0x008a }
            if (r1 == 0) goto L_0x0080
            int r2 = r5.f17430e     // Catch:{ all -> 0x008a }
            int r3 = r5.f17427b     // Catch:{ all -> 0x008a }
            if (r2 >= r3) goto L_0x002f
            int r3 = r3 - r2
            if (r3 < r8) goto L_0x0018
            r3 = r8
        L_0x0018:
            java.lang.System.arraycopy(r0, r2, r6, r7, r3)     // Catch:{ all -> 0x008a }
            int r2 = r5.f17430e     // Catch:{ all -> 0x008a }
            int r2 = r2 + r3
            r5.f17430e = r2     // Catch:{ all -> 0x008a }
            if (r3 == r8) goto L_0x002d
            int r2 = r1.available()     // Catch:{ all -> 0x008a }
            if (r2 != 0) goto L_0x0029
            goto L_0x002d
        L_0x0029:
            int r7 = r7 + r3
            int r2 = r8 - r3
            goto L_0x0030
        L_0x002d:
            monitor-exit(r5)
            return r3
        L_0x002f:
            r2 = r8
        L_0x0030:
            int r3 = r5.f17429d     // Catch:{ all -> 0x008a }
            r4 = -1
            if (r3 != r4) goto L_0x0045
            int r3 = r0.length     // Catch:{ all -> 0x008a }
            if (r2 < r3) goto L_0x0045
            int r3 = r1.read(r6, r7, r2)     // Catch:{ all -> 0x008a }
            if (r3 != r4) goto L_0x0070
            if (r2 != r8) goto L_0x0042
            monitor-exit(r5)
            return r4
        L_0x0042:
            int r8 = r8 - r2
            monitor-exit(r5)
            return r8
        L_0x0045:
            int r3 = r5.m15087c(r1, r0)     // Catch:{ all -> 0x008a }
            if (r3 != r4) goto L_0x0052
            if (r2 != r8) goto L_0x004f
            monitor-exit(r5)
            return r4
        L_0x004f:
            int r8 = r8 - r2
            monitor-exit(r5)
            return r8
        L_0x0052:
            byte[] r3 = r5.f17426a     // Catch:{ all -> 0x008a }
            if (r0 == r3) goto L_0x0060
            byte[] r0 = r5.f17426a     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x005b
            goto L_0x0060
        L_0x005b:
            java.io.IOException r6 = m15088d()     // Catch:{ all -> 0x008a }
            throw r6     // Catch:{ all -> 0x008a }
        L_0x0060:
            int r3 = r5.f17427b     // Catch:{ all -> 0x008a }
            int r4 = r5.f17430e     // Catch:{ all -> 0x008a }
            int r3 = r3 - r4
            if (r3 < r2) goto L_0x0068
            r3 = r2
        L_0x0068:
            java.lang.System.arraycopy(r0, r4, r6, r7, r3)     // Catch:{ all -> 0x008a }
            int r4 = r5.f17430e     // Catch:{ all -> 0x008a }
            int r4 = r4 + r3
            r5.f17430e = r4     // Catch:{ all -> 0x008a }
        L_0x0070:
            int r2 = r2 - r3
            if (r2 != 0) goto L_0x0075
            monitor-exit(r5)
            return r8
        L_0x0075:
            int r4 = r1.available()     // Catch:{ all -> 0x008a }
            if (r4 != 0) goto L_0x007e
            int r8 = r8 - r2
            monitor-exit(r5)
            return r8
        L_0x007e:
            int r7 = r7 + r3
            goto L_0x0030
        L_0x0080:
            java.io.IOException r6 = m15088d()     // Catch:{ all -> 0x008a }
            throw r6     // Catch:{ all -> 0x008a }
        L_0x0085:
            java.io.IOException r6 = m15088d()     // Catch:{ all -> 0x008a }
            throw r6     // Catch:{ all -> 0x008a }
        L_0x008a:
            r6 = move-exception
            monitor-exit(r5)
            goto L_0x008e
        L_0x008d:
            throw r6
        L_0x008e:
            goto L_0x008d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p299c.p300a.C5835an.read(byte[], int, int):int");
    }
}
