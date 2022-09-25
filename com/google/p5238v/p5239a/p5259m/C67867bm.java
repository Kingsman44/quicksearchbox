package com.google.p5238v.p5239a.p5259m;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.v.a.m.bm */
/* compiled from: PG */
final class C67867bm extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    private final ByteBuffer f183997a;

    /* renamed from: b */
    private final ByteBuffer f183998b;

    /* renamed from: c */
    private final int f183999c;

    /* renamed from: d */
    private boolean f184000d = false;

    /* renamed from: e */
    private boolean f184001e = false;

    /* renamed from: f */
    private boolean f184002f = false;

    /* renamed from: g */
    private boolean f184003g = false;

    /* renamed from: h */
    private final byte[] f184004h;

    /* renamed from: i */
    private int f184005i = 0;

    /* renamed from: j */
    private final C67865bk f184006j;

    /* renamed from: k */
    private final int f184007k;

    /* renamed from: l */
    private final int f184008l;

    public C67867bm(C67852ay ayVar, InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.f184006j = ayVar.mo60001g();
        this.f183999c = ayVar.mo59999e();
        this.f184004h = Arrays.copyOf(bArr, bArr.length);
        int d = ayVar.mo59998d();
        this.f184007k = d;
        ByteBuffer allocate = ByteBuffer.allocate(d + 1);
        this.f183997a = allocate;
        allocate.limit(0);
        this.f184008l = d - ayVar.mo59997c();
        ByteBuffer allocate2 = ByteBuffer.allocate(ayVar.mo60000f() + 16);
        this.f183998b = allocate2;
        allocate2.limit(0);
    }

    /* renamed from: a */
    private final void m98073a() {
        byte b;
        while (!this.f184001e && this.f183997a.remaining() > 0) {
            int read = this.in.read(this.f183997a.array(), this.f183997a.position(), this.f183997a.remaining());
            if (read > 0) {
                ByteBuffer byteBuffer = this.f183997a;
                byteBuffer.position(byteBuffer.position() + read);
            } else if (read == -1) {
                this.f184001e = true;
            } else if (read == 0) {
                throw new IOException("Could not read bytes from the ciphertext stream");
            }
        }
        if (!this.f184001e) {
            ByteBuffer byteBuffer2 = this.f183997a;
            b = byteBuffer2.get(byteBuffer2.position() - 1);
            ByteBuffer byteBuffer3 = this.f183997a;
            byteBuffer3.position(byteBuffer3.position() - 1);
        } else {
            b = 0;
        }
        this.f183997a.flip();
        this.f183998b.clear();
        try {
            this.f184006j.mo59990a(this.f183997a, this.f184005i, this.f184001e, this.f183998b);
            this.f184005i++;
            this.f183998b.flip();
            this.f183997a.clear();
            if (!this.f184001e) {
                this.f183997a.clear();
                this.f183997a.limit(this.f184007k + 1);
                this.f183997a.put(b);
            }
        } catch (GeneralSecurityException e) {
            m98075c();
            throw new IOException(e.getMessage() + "\n" + toString() + "\nsegmentNr:" + this.f184005i + " endOfCiphertext:" + this.f184001e, e);
        }
    }

    /* renamed from: b */
    private final void m98074b() {
        if (!this.f184000d) {
            ByteBuffer allocate = ByteBuffer.allocate(this.f183999c);
            while (allocate.remaining() > 0) {
                int read = this.in.read(allocate.array(), allocate.position(), allocate.remaining());
                if (read == -1) {
                    m98075c();
                    throw new IOException("Ciphertext is too short");
                } else if (read != 0) {
                    allocate.position(allocate.position() + read);
                } else {
                    throw new IOException("Could not read bytes from the ciphertext stream");
                }
            }
            allocate.flip();
            try {
                this.f184006j.mo59991b(allocate, this.f184004h);
                this.f184000d = true;
            } catch (GeneralSecurityException e) {
                throw new IOException(e);
            }
        } else {
            m98075c();
            throw new IOException("Decryption failed.");
        }
    }

    /* renamed from: c */
    private final void m98075c() {
        this.f184003g = true;
        this.f183998b.limit(0);
    }

    public final synchronized int available() {
        return this.f183998b.remaining();
    }

    public final synchronized void mark(int i) {
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() {
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        if (read == 1) {
            return bArr[0] & 255;
        }
        if (read == -1) {
            return -1;
        }
        throw new IOException("Reading failed");
    }

    public final long skip(long j) {
        int read;
        long j2 = (long) this.f184007k;
        if (j <= 0) {
            return 0;
        }
        int min = (int) Math.min(j2, j);
        byte[] bArr = new byte[min];
        long j3 = j;
        while (j3 > 0 && (read = read(bArr, 0, (int) Math.min((long) min, j3))) > 0) {
            j3 -= (long) read;
        }
        return j - j3;
    }

    public final synchronized String toString() {
        return "StreamingAeadDecryptingStream\nsegmentNr:" + this.f184005i + "\nciphertextSegmentSize:" + this.f184007k + "\nheaderRead:" + this.f184000d + "\nendOfCiphertext:" + this.f184001e + "\nendOfPlaintext:" + this.f184002f + "\ndecryptionErrorOccured:" + this.f184003g + "\nciphertextSgement position:" + this.f183997a.position() + " limit:" + this.f183997a.limit() + "\nplaintextSegment position:" + this.f183998b.position() + " limit:" + this.f183998b.limit();
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f184003g     // Catch:{ all -> 0x005d }
            if (r0 != 0) goto L_0x0055
            boolean r0 = r6.f184000d     // Catch:{ all -> 0x005d }
            r1 = 1
            if (r0 != 0) goto L_0x001a
            r6.m98074b()     // Catch:{ all -> 0x005d }
            java.nio.ByteBuffer r0 = r6.f183997a     // Catch:{ all -> 0x005d }
            r0.clear()     // Catch:{ all -> 0x005d }
            java.nio.ByteBuffer r0 = r6.f183997a     // Catch:{ all -> 0x005d }
            int r2 = r6.f184008l     // Catch:{ all -> 0x005d }
            int r2 = r2 + r1
            r0.limit(r2)     // Catch:{ all -> 0x005d }
        L_0x001a:
            boolean r0 = r6.f184002f     // Catch:{ all -> 0x005d }
            r2 = -1
            if (r0 != 0) goto L_0x0053
            r0 = 0
        L_0x0020:
            if (r0 >= r9) goto L_0x0049
            java.nio.ByteBuffer r3 = r6.f183998b     // Catch:{ all -> 0x005d }
            int r3 = r3.remaining()     // Catch:{ all -> 0x005d }
            if (r3 != 0) goto L_0x0034
            boolean r3 = r6.f184001e     // Catch:{ all -> 0x005d }
            if (r3 == 0) goto L_0x0031
            r6.f184002f = r1     // Catch:{ all -> 0x005d }
            goto L_0x0049
        L_0x0031:
            r6.m98073a()     // Catch:{ all -> 0x005d }
        L_0x0034:
            java.nio.ByteBuffer r3 = r6.f183998b     // Catch:{ all -> 0x005d }
            int r3 = r3.remaining()     // Catch:{ all -> 0x005d }
            int r4 = r9 - r0
            int r3 = java.lang.Math.min(r3, r4)     // Catch:{ all -> 0x005d }
            java.nio.ByteBuffer r4 = r6.f183998b     // Catch:{ all -> 0x005d }
            int r5 = r0 + r8
            r4.get(r7, r5, r3)     // Catch:{ all -> 0x005d }
            int r0 = r0 + r3
            goto L_0x0020
        L_0x0049:
            if (r0 != 0) goto L_0x0051
            boolean r7 = r6.f184002f     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x0051
            monitor-exit(r6)
            return r2
        L_0x0051:
            monitor-exit(r6)
            return r0
        L_0x0053:
            monitor-exit(r6)
            return r2
        L_0x0055:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x005d }
            java.lang.String r8 = "Decryption failed."
            r7.<init>(r8)     // Catch:{ all -> 0x005d }
            throw r7     // Catch:{ all -> 0x005d }
        L_0x005d:
            r7 = move-exception
            monitor-exit(r6)
            goto L_0x0061
        L_0x0060:
            throw r7
        L_0x0061:
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p5238v.p5239a.p5259m.C67867bm.read(byte[], int, int):int");
    }
}
