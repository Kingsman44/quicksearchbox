package com.bumptech.glide.p280a;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* renamed from: com.bumptech.glide.a.h */
/* compiled from: PG */
final class C5509h implements Closeable {

    /* renamed from: a */
    public final Charset f16678a;

    /* renamed from: b */
    public int f16679b;

    /* renamed from: c */
    private final InputStream f16680c;

    /* renamed from: d */
    private byte[] f16681d;

    /* renamed from: e */
    private int f16682e;

    public C5509h(InputStream inputStream, Charset charset) {
        charset.getClass();
        if (charset.equals(C5510i.f16683a)) {
            this.f16680c = inputStream;
            this.f16678a = charset;
            this.f16681d = new byte[8192];
            return;
        }
        throw new IllegalArgumentException("Unsupported encoding");
    }

    /* renamed from: b */
    private final void m14248b() {
        InputStream inputStream = this.f16680c;
        byte[] bArr = this.f16681d;
        int length = bArr.length;
        int read = inputStream.read(bArr, 0, 8192);
        if (read != -1) {
            this.f16682e = 0;
            this.f16679b = read;
            return;
        }
        throw new EOFException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r2[r4] != 13) goto L_0x002a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo11856a() {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.f16680c
            monitor-enter(r0)
            byte[] r1 = r7.f16681d     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x007e
            int r1 = r7.f16682e     // Catch:{ all -> 0x0086 }
            int r2 = r7.f16679b     // Catch:{ all -> 0x0086 }
            if (r1 < r2) goto L_0x0010
            r7.m14248b()     // Catch:{ all -> 0x0086 }
        L_0x0010:
            int r1 = r7.f16682e     // Catch:{ all -> 0x0086 }
        L_0x0012:
            int r2 = r7.f16679b     // Catch:{ all -> 0x0086 }
            r3 = 10
            if (r1 == r2) goto L_0x0040
            byte[] r2 = r7.f16681d     // Catch:{ all -> 0x0086 }
            byte r4 = r2[r1]     // Catch:{ all -> 0x0086 }
            if (r4 != r3) goto L_0x003d
            int r3 = r7.f16682e     // Catch:{ all -> 0x0086 }
            if (r1 == r3) goto L_0x002a
            int r4 = r1 + -1
            byte r5 = r2[r4]     // Catch:{ all -> 0x0086 }
            r6 = 13
            if (r5 == r6) goto L_0x002b
        L_0x002a:
            r4 = r1
        L_0x002b:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0086 }
            int r4 = r4 - r3
            java.nio.charset.Charset r6 = r7.f16678a     // Catch:{ all -> 0x0086 }
            java.lang.String r6 = r6.name()     // Catch:{ all -> 0x0086 }
            r5.<init>(r2, r3, r4, r6)     // Catch:{ all -> 0x0086 }
            int r1 = r1 + 1
            r7.f16682e = r1     // Catch:{ all -> 0x0086 }
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            return r5
        L_0x003d:
            int r1 = r1 + 1
            goto L_0x0012
        L_0x0040:
            com.bumptech.glide.a.g r1 = new com.bumptech.glide.a.g     // Catch:{ all -> 0x0086 }
            int r2 = r7.f16679b     // Catch:{ all -> 0x0086 }
            int r4 = r7.f16682e     // Catch:{ all -> 0x0086 }
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r7, r2)     // Catch:{ all -> 0x0086 }
        L_0x004c:
            byte[] r2 = r7.f16681d     // Catch:{ all -> 0x0086 }
            int r4 = r7.f16682e     // Catch:{ all -> 0x0086 }
            int r5 = r7.f16679b     // Catch:{ all -> 0x0086 }
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch:{ all -> 0x0086 }
            r2 = -1
            r7.f16679b = r2     // Catch:{ all -> 0x0086 }
            r7.m14248b()     // Catch:{ all -> 0x0086 }
            int r2 = r7.f16682e     // Catch:{ all -> 0x0086 }
        L_0x005e:
            int r4 = r7.f16679b     // Catch:{ all -> 0x0086 }
            if (r2 == r4) goto L_0x004c
            byte[] r4 = r7.f16681d     // Catch:{ all -> 0x0086 }
            byte r5 = r4[r2]     // Catch:{ all -> 0x0086 }
            if (r5 != r3) goto L_0x007b
            int r3 = r7.f16682e     // Catch:{ all -> 0x0086 }
            if (r2 == r3) goto L_0x0071
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch:{ all -> 0x0086 }
        L_0x0071:
            int r2 = r2 + 1
            r7.f16682e = r2     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0086 }
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            return r1
        L_0x007b:
            int r2 = r2 + 1
            goto L_0x005e
        L_0x007e:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = "LineReader is closed"
            r1.<init>(r2)     // Catch:{ all -> 0x0086 }
            throw r1     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            goto L_0x008a
        L_0x0089:
            throw r1
        L_0x008a:
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p280a.C5509h.mo11856a():java.lang.String");
    }

    public final void close() {
        synchronized (this.f16680c) {
            if (this.f16681d != null) {
                this.f16681d = null;
                this.f16680c.close();
            }
        }
    }
}
