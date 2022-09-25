package com.google.speech.micro;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* compiled from: PG */
public class EchoCancellingInputStream extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    public boolean f183103a;
    private int alignmentIndex;

    /* renamed from: b */
    private long f183104b;

    /* renamed from: c */
    private InputStream f183105c;

    /* renamed from: d */
    private InputStream f183106d;

    /* renamed from: e */
    private byte[] f183107e;

    /* renamed from: f */
    private byte[] f183108f;

    /* renamed from: g */
    private boolean f183109g;
    public boolean latched;
    private int mixedInputBufferWritePos;
    private int referenceInputBufferWritePos;

    public EchoCancellingInputStream(byte[] bArr, InputStream inputStream, InputStream inputStream2, int i, int i2) {
        if (i2 >= 0) {
            this.f183104b = nativeNew(bArr, i);
            this.f183105c = inputStream;
            this.f183106d = inputStream2;
            this.mixedInputBufferWritePos = 0;
            this.referenceInputBufferWritePos = 0;
            this.f183107e = new byte[i2];
            this.f183108f = new byte[i2];
            this.f183109g = false;
            this.f183103a = false;
            return;
        }
        throw new IllegalArgumentException("maxReadLength must be > 0");
    }

    private static native void nativeClose(long j);

    private native int nativeFlush(long j, byte[] bArr, int i, int i2);

    private static native int nativeGetIdealOutputSize(long j);

    private static native long nativeNew(byte[] bArr, int i);

    private native int nativeProcess(long j, byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, int i4);

    public final synchronized void close() {
        InputStream inputStream = this.f183105c;
        if (inputStream != null) {
            inputStream.close();
            this.f183105c = null;
        }
        InputStream inputStream2 = this.f183106d;
        if (inputStream2 != null) {
            inputStream2.close();
            this.f183106d = null;
        }
        nativeClose(this.f183104b);
        this.f183104b = 0;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public final int read() {
        throw new IOException("Single byte reads not supported.");
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008c, code lost:
        return -1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0089 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read(byte[] r16, int r17, int r18) {
        /*
            r15 = this;
            r11 = r15
            monitor-enter(r15)
            java.io.InputStream r0 = r11.f183105c     // Catch:{ all -> 0x008d }
            r12 = -1
            if (r0 == 0) goto L_0x008b
            java.io.InputStream r0 = r11.f183106d     // Catch:{ all -> 0x008d }
            if (r0 != 0) goto L_0x000d
            goto L_0x008b
        L_0x000d:
            byte[] r1 = r11.f183108f     // Catch:{ all -> 0x008d }
            int r2 = r1.length     // Catch:{ all -> 0x008d }
            int r3 = r11.referenceInputBufferWritePos     // Catch:{ all -> 0x008d }
            int r2 = r2 - r3
            int r0 = r0.read(r1, r3, r2)     // Catch:{ all -> 0x008d }
            byte[] r1 = r11.f183107e     // Catch:{ all -> 0x008d }
            int r2 = r1.length     // Catch:{ all -> 0x008d }
            int r3 = r11.mixedInputBufferWritePos     // Catch:{ all -> 0x008d }
            java.io.InputStream r4 = r11.f183105c     // Catch:{ all -> 0x008d }
            int r2 = r2 - r3
            int r1 = r4.read(r1, r3, r2)     // Catch:{ all -> 0x008d }
            r13 = 0
            if (r0 >= 0) goto L_0x0027
            r0 = 0
        L_0x0027:
            int r2 = r11.referenceInputBufferWritePos     // Catch:{ all -> 0x008d }
            int r7 = r2 + r0
            r11.referenceInputBufferWritePos = r7     // Catch:{ all -> 0x008d }
            if (r1 >= 0) goto L_0x0030
            r1 = 0
        L_0x0030:
            int r0 = r11.mixedInputBufferWritePos     // Catch:{ all -> 0x008d }
            int r5 = r0 + r1
            r11.mixedInputBufferWritePos = r5     // Catch:{ all -> 0x008d }
            boolean r0 = r11.f183109g     // Catch:{ all -> 0x008d }
            r14 = 1
            if (r0 != 0) goto L_0x0050
            long r2 = r11.f183104b     // Catch:{ all -> 0x008d }
            byte[] r4 = r11.f183107e     // Catch:{ all -> 0x008d }
            byte[] r6 = r11.f183108f     // Catch:{ all -> 0x008d }
            r1 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            int r0 = r1.nativeProcess(r2, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x008d }
            if (r0 != r12) goto L_0x0051
            r11.f183109g = r14     // Catch:{ all -> 0x008d }
        L_0x0050:
            r0 = 0
        L_0x0051:
            boolean r1 = r11.f183109g     // Catch:{ all -> 0x008d }
            if (r1 == 0) goto L_0x0089
            long r2 = r11.f183104b     // Catch:{ all -> 0x008d }
            r1 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            int r0 = r1.nativeFlush(r2, r4, r5, r6)     // Catch:{ all -> 0x008d }
            if (r0 <= 0) goto L_0x0066
            monitor-exit(r15)
            return r0
        L_0x0066:
            int r0 = r11.mixedInputBufferWritePos     // Catch:{ all -> 0x008d }
            if (r0 <= 0) goto L_0x0087
            r1 = r18
            if (r0 > r1) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r0 = r1
        L_0x0070:
            byte[] r1 = r11.f183107e     // Catch:{ all -> 0x008d }
            r2 = r16
            r3 = r17
            java.lang.System.arraycopy(r1, r13, r2, r3, r0)     // Catch:{ all -> 0x008d }
            int r1 = r11.mixedInputBufferWritePos     // Catch:{ all -> 0x008d }
            int r1 = r1 - r0
            r11.mixedInputBufferWritePos = r1     // Catch:{ all -> 0x008d }
            byte[] r2 = r11.f183107e     // Catch:{ all -> 0x008d }
            java.lang.System.arraycopy(r2, r0, r2, r13, r1)     // Catch:{ all -> 0x008d }
            r11.f183103a = r14     // Catch:{ all -> 0x008d }
            monitor-exit(r15)
            return r0
        L_0x0087:
            monitor-exit(r15)
            return r12
        L_0x0089:
            monitor-exit(r15)
            return r0
        L_0x008b:
            monitor-exit(r15)
            return r12
        L_0x008d:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.speech.micro.EchoCancellingInputStream.read(byte[], int, int):int");
    }
}
