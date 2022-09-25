package com.bumptech.glide.p291h;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.bumptech.glide.h.c */
/* compiled from: PG */
public final class C5616c {

    /* renamed from: a */
    public static final /* synthetic */ int f16951a = 0;

    /* renamed from: b */
    private static final AtomicReference f16952b = new AtomicReference();

    /* renamed from: a */
    public static InputStream m14580a(ByteBuffer byteBuffer) {
        return new C5604a(byteBuffer);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.io.RandomAccessFile} */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|(2:10|11)|12|13|14) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002f */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049 A[SYNTHETIC, Splitter:B:25:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0050 A[SYNTHETIC, Splitter:B:29:0x0050] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer m14581b(java.io.File r8) {
        /*
            r0 = 0
            long r5 = r8.length()     // Catch:{ all -> 0x0045 }
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x003d
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0035
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0045 }
            java.lang.String r1 = "r"
            r7.<init>(r8, r1)     // Catch:{ all -> 0x0045 }
            java.nio.channels.FileChannel r0 = r7.getChannel()     // Catch:{ all -> 0x0033 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0033 }
            r3 = 0
            r1 = r0
            java.nio.MappedByteBuffer r8 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0033 }
            java.nio.MappedByteBuffer r8 = r8.load()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x002f
            r0.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            r7.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            return r8
        L_0x0033:
            r8 = move-exception
            goto L_0x0047
        L_0x0035:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0045 }
            java.lang.String r1 = "File unsuitable for memory mapping"
            r8.<init>(r1)     // Catch:{ all -> 0x0045 }
            throw r8     // Catch:{ all -> 0x0045 }
        L_0x003d:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0045 }
            java.lang.String r1 = "File too large to map into memory"
            r8.<init>(r1)     // Catch:{ all -> 0x0045 }
            throw r8     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r8 = move-exception
            r7 = r0
        L_0x0047:
            if (r0 == 0) goto L_0x004e
            r0.close()     // Catch:{ IOException -> 0x004d }
            goto L_0x004e
        L_0x004d:
        L_0x004e:
            if (r7 == 0) goto L_0x0053
            r7.close()     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p291h.C5616c.m14581b(java.io.File):java.nio.ByteBuffer");
    }

    /* renamed from: c */
    public static ByteBuffer m14582c(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] bArr = (byte[]) f16952b.getAndSet((Object) null);
        if (bArr == null) {
            bArr = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                f16952b.set(bArr);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return m14583d(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
        }
    }

    /* renamed from: d */
    public static ByteBuffer m14583d(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|(2:6|7)|8|9|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b A[SYNTHETIC, Splitter:B:15:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0032 A[SYNTHETIC, Splitter:B:19:0x0032] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m14584e(java.nio.ByteBuffer r3, java.io.File r4) {
        /*
            m14583d(r3)
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0027 }
            java.lang.String r2 = "rw"
            r1.<init>(r4, r2)     // Catch:{ all -> 0x0027 }
            java.nio.channels.FileChannel r0 = r1.getChannel()     // Catch:{ all -> 0x0025 }
            r0.write(r3)     // Catch:{ all -> 0x0025 }
            r3 = 0
            r0.force(r3)     // Catch:{ all -> 0x0025 }
            r0.close()     // Catch:{ all -> 0x0025 }
            r1.close()     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0021
            r0.close()     // Catch:{ IOException -> 0x0021 }
        L_0x0021:
            r1.close()     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            return
        L_0x0025:
            r3 = move-exception
            goto L_0x0029
        L_0x0027:
            r3 = move-exception
            r1 = r0
        L_0x0029:
            if (r0 == 0) goto L_0x0030
            r0.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0030
        L_0x002f:
        L_0x0030:
            if (r1 == 0) goto L_0x0035
            r1.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p291h.C5616c.m14584e(java.nio.ByteBuffer, java.io.File):void");
    }
}
