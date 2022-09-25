package com.google.speech.micro;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* compiled from: PG */
public class DecimatingInputStream extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    private long f183098a;

    /* renamed from: b */
    private InputStream f183099b;

    /* renamed from: c */
    private byte[] f183100c;

    /* renamed from: d */
    private int f183101d;

    /* renamed from: e */
    private float f183102e;
    private int inputBufferWritePos;

    public DecimatingInputStream(int i, InputStream inputStream) {
        long nativeNew = nativeNew(i, 16000, i / 100);
        this.f183098a = nativeNew;
        this.f183101d = nativeGetExtraSamplesNeededInInput(nativeNew);
        this.f183099b = inputStream;
        this.f183102e = ((float) i) / 16000.0f;
    }

    private static native void nativeClose(long j);

    private static native int nativeGetExtraSamplesNeededInInput(long j);

    private static native long nativeNew(int i, int i2, int i3);

    private native int nativeProcess(long j, byte[] bArr, int i, byte[] bArr2, int i2, int i3);

    public final synchronized void close() {
        nativeClose(this.f183098a);
        this.f183098a = 0;
        InputStream inputStream = this.f183099b;
        if (inputStream != null) {
            inputStream.close();
            this.f183099b = null;
        }
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

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read(byte[] r13, int r14, int r15) {
        /*
            r12 = this;
            monitor-enter(r12)
            java.io.InputStream r0 = r12.f183099b     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0058
            float r0 = r12.f183102e     // Catch:{ all -> 0x0060 }
            int r1 = r12.f183101d     // Catch:{ all -> 0x0060 }
            float r2 = (float) r15     // Catch:{ all -> 0x0060 }
            float r2 = r2 * r0
            int r0 = (int) r2     // Catch:{ all -> 0x0060 }
            int r1 = r1 + r1
            int r0 = r0 + r1
            int r1 = r0 % 2
            r2 = 1
            if (r1 != r2) goto L_0x0016
            int r0 = r0 + 1
        L_0x0016:
            byte[] r1 = r12.f183100c     // Catch:{ all -> 0x0060 }
            r3 = 0
            if (r1 != 0) goto L_0x0020
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0060 }
            r12.f183100c = r0     // Catch:{ all -> 0x0060 }
            goto L_0x002a
        L_0x0020:
            int r4 = r1.length     // Catch:{ all -> 0x0060 }
            if (r4 >= r0) goto L_0x002a
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0060 }
            java.lang.System.arraycopy(r1, r3, r0, r3, r4)     // Catch:{ all -> 0x0060 }
            r12.f183100c = r0     // Catch:{ all -> 0x0060 }
        L_0x002a:
            byte[] r0 = r12.f183100c     // Catch:{ all -> 0x0060 }
            int r1 = r0.length     // Catch:{ all -> 0x0060 }
            int r4 = r12.inputBufferWritePos     // Catch:{ all -> 0x0060 }
            java.io.InputStream r5 = r12.f183099b     // Catch:{ all -> 0x0060 }
            int r1 = r1 - r4
            int r0 = r5.read(r0, r4, r1)     // Catch:{ all -> 0x0060 }
            if (r0 >= 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r2 = 0
        L_0x003a:
            if (r0 >= 0) goto L_0x003d
            r0 = 0
        L_0x003d:
            long r5 = r12.f183098a     // Catch:{ all -> 0x0060 }
            byte[] r7 = r12.f183100c     // Catch:{ all -> 0x0060 }
            int r1 = r12.inputBufferWritePos     // Catch:{ all -> 0x0060 }
            int r8 = r0 + r1
            r4 = r12
            r9 = r13
            r10 = r14
            r11 = r15
            int r13 = r4.nativeProcess(r5, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0060 }
            if (r13 != 0) goto L_0x0055
            if (r2 != 0) goto L_0x0052
            goto L_0x0056
        L_0x0052:
            monitor-exit(r12)
            r13 = -1
            return r13
        L_0x0055:
            r3 = r13
        L_0x0056:
            monitor-exit(r12)
            return r3
        L_0x0058:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ all -> 0x0060 }
            java.lang.String r14 = "stream closed"
            r13.<init>(r14)     // Catch:{ all -> 0x0060 }
            throw r13     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.speech.micro.DecimatingInputStream.read(byte[], int, int):int");
    }
}
