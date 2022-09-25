package com.google.p5238v.p5239a.p5258l;

import com.google.p5238v.p5239a.C67533ad;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.v.a.l.g */
/* compiled from: PG */
final class C67821g extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    boolean f183909a = false;

    /* renamed from: b */
    InputStream f183910b = null;

    /* renamed from: c */
    final InputStream f183911c;

    /* renamed from: d */
    final C67533ad f183912d;

    /* renamed from: e */
    final byte[] f183913e;

    public C67821g(C67533ad adVar, InputStream inputStream, byte[] bArr) {
        this.f183912d = adVar;
        if (inputStream.markSupported()) {
            this.f183911c = inputStream;
        } else {
            this.f183911c = new BufferedInputStream(inputStream);
        }
        this.f183911c.mark(Integer.MAX_VALUE);
        this.f183913e = (byte[]) bArr.clone();
    }

    public final synchronized int available() {
        InputStream inputStream = this.f183910b;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    public final synchronized void close() {
        this.f183911c.close();
    }

    public final boolean markSupported() {
        return false;
    }

    public final synchronized int read() {
        byte[] bArr = new byte[1];
        if (read(bArr) != 1) {
            return -1;
        }
        return bArr[0];
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final synchronized int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0052 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read(byte[] r6, int r7, int r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            if (r8 != 0) goto L_0x0006
            monitor-exit(r5)
            return r0
        L_0x0006:
            java.io.InputStream r1 = r5.f183910b     // Catch:{ all -> 0x006e }
            if (r1 == 0) goto L_0x0010
            int r6 = r1.read(r6, r7, r8)     // Catch:{ all -> 0x006e }
            monitor-exit(r5)
            return r6
        L_0x0010:
            boolean r1 = r5.f183909a     // Catch:{ all -> 0x006e }
            if (r1 != 0) goto L_0x0066
            r1 = 1
            r5.f183909a = r1     // Catch:{ all -> 0x006e }
            com.google.v.a.ad r1 = r5.f183912d     // Catch:{ all -> 0x006e }
            byte[] r2 = com.google.p5238v.p5239a.C67552d.f183465a     // Catch:{ all -> 0x006e }
            java.util.List r1 = r1.mo59910b(r2)     // Catch:{ all -> 0x006e }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x006e }
        L_0x0023:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x006e }
            if (r2 == 0) goto L_0x005e
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x006e }
            com.google.v.a.ab r2 = (com.google.p5238v.p5239a.C67531ab) r2     // Catch:{ all -> 0x006e }
            java.lang.Object r2 = r2.f183443a     // Catch:{ IOException -> 0x0058, GeneralSecurityException -> 0x0052 }
            com.google.v.a.ak r2 = (com.google.p5238v.p5239a.C67540ak) r2     // Catch:{ IOException -> 0x0058, GeneralSecurityException -> 0x0052 }
            java.io.InputStream r3 = r5.f183911c     // Catch:{ IOException -> 0x0058, GeneralSecurityException -> 0x0052 }
            byte[] r4 = r5.f183913e     // Catch:{ IOException -> 0x0058, GeneralSecurityException -> 0x0052 }
            java.io.InputStream r2 = r2.mo59913a(r3, r4)     // Catch:{ IOException -> 0x0058, GeneralSecurityException -> 0x0052 }
            int r3 = r2.read(r6, r7, r8)     // Catch:{ IOException -> 0x0058, GeneralSecurityException -> 0x0052 }
            if (r3 == 0) goto L_0x004a
            r5.f183910b = r2     // Catch:{ IOException -> 0x0058, GeneralSecurityException -> 0x0052 }
            java.io.InputStream r2 = r5.f183911c     // Catch:{ IOException -> 0x0058, GeneralSecurityException -> 0x0052 }
            r2.mark(r0)     // Catch:{ IOException -> 0x0058, GeneralSecurityException -> 0x0052 }
            monitor-exit(r5)
            return r3
        L_0x004a:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0058, GeneralSecurityException -> 0x0052 }
            java.lang.String r3 = "Could not read bytes from the ciphertext stream"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0058, GeneralSecurityException -> 0x0052 }
            throw r2     // Catch:{ IOException -> 0x0058, GeneralSecurityException -> 0x0052 }
        L_0x0052:
            java.io.InputStream r2 = r5.f183911c     // Catch:{ all -> 0x006e }
            r2.reset()     // Catch:{ all -> 0x006e }
            goto L_0x0023
        L_0x0058:
            java.io.InputStream r2 = r5.f183911c     // Catch:{ all -> 0x006e }
            r2.reset()     // Catch:{ all -> 0x006e }
            goto L_0x0023
        L_0x005e:
            java.io.IOException r6 = new java.io.IOException     // Catch:{ all -> 0x006e }
            java.lang.String r7 = "No matching key found for the ciphertext in the stream."
            r6.<init>(r7)     // Catch:{ all -> 0x006e }
            throw r6     // Catch:{ all -> 0x006e }
        L_0x0066:
            java.io.IOException r6 = new java.io.IOException     // Catch:{ all -> 0x006e }
            java.lang.String r7 = "No matching key found for the ciphertext in the stream."
            r6.<init>(r7)     // Catch:{ all -> 0x006e }
            throw r6     // Catch:{ all -> 0x006e }
        L_0x006e:
            r6 = move-exception
            monitor-exit(r5)
            goto L_0x0072
        L_0x0071:
            throw r6
        L_0x0072:
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p5238v.p5239a.p5258l.C67821g.read(byte[], int, int):int");
    }
}
