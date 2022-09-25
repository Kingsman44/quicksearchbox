package org.p5610a.p5611a.p5612a;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import org.p5610a.p5611a.p5612a.p5617e.C71983b;
import p3186j$.util.Objects;

/* renamed from: org.a.a.a.i */
/* compiled from: PG */
public final class C71989i {

    /* renamed from: a */
    public static final byte[] f191703a = new byte[0];

    /* renamed from: b */
    private static final ThreadLocal f191704b = new C71988h();

    static {
        System.lineSeparator();
        String str = C71990j.LF.f191709d;
        String str2 = C71990j.CRLF.f191709d;
        new C71987g();
    }

    /* renamed from: a */
    public static String m105286a(InputStream inputStream, Charset charset) {
        C71983b bVar = new C71983b();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, C71956a.m105231a(charset));
        char[] cArr = (char[]) f191704b.get();
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return bVar.f191697a.toString();
            }
            bVar.write(cArr, 0, read);
        }
    }

    /* renamed from: b */
    public static byte[] m105287b(int i) {
        return new byte[i];
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        throw r6;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0038 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m105288c(java.io.InputStream r6) {
        /*
            org.a.a.a.e.d r0 = new org.a.a.a.e.d
            r1 = 0
            r0.<init>(r1)
            org.a.a.a.e.c r1 = new org.a.a.a.e.c     // Catch:{ all -> 0x0039 }
            org.a.a.a.f r2 = new org.a.a.a.f     // Catch:{ all -> 0x0039 }
            r2.<init>(r0)     // Catch:{ all -> 0x0039 }
            r1.<init>(r2)     // Catch:{ all -> 0x0039 }
            m105290e(r6, r1)     // Catch:{ all -> 0x001b }
            byte[] r6 = r0.mo63171c()     // Catch:{ all -> 0x001b }
            r1.close()     // Catch:{ all -> 0x0039 }
            return r6
        L_0x001b:
            r6 = move-exception
            r1.close()     // Catch:{ all -> 0x0020 }
            goto L_0x0038
        L_0x0020:
            r0 = move-exception
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0038 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r4 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x0038 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r2 = r3.getDeclaredMethod(r5, r2)     // Catch:{ Exception -> 0x0038 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0038 }
            r1[r4] = r0     // Catch:{ Exception -> 0x0038 }
            r2.invoke(r6, r1)     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            throw r6     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p5610a.p5611a.p5612a.C71989i.m105288c(java.io.InputStream):byte[]");
    }

    /* renamed from: d */
    public static void m105289d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: e */
    public static void m105290e(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        Objects.requireNonNull(inputStream, "inputStream");
        Objects.requireNonNull(outputStream, "outputStream");
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public static void m105291f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                throw e;
            }
        }
    }
}
