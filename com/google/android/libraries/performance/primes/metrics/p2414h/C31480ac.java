package com.google.android.libraries.performance.primes.metrics.p2414h;

import com.google.common.base.C58833ax;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.libraries.performance.primes.metrics.h.ac */
/* compiled from: PG */
public final class C31480ac {

    /* renamed from: a */
    private static volatile C58833ax f84784a;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f7, code lost:
        r1 = com.google.common.base.C58836b.f156633a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0069 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x006d */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.base.C58833ax m58694a() {
        /*
            com.google.common.base.ax r0 = f84784a
            if (r0 != 0) goto L_0x0132
            int r0 = android.system.OsConstants._SC_CLK_TCK
            long r0 = android.system.Os.sysconf(r0)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0019
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x001b
        L_0x0019:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x001b:
            boolean r1 = r0.mo56113h()
            if (r1 != 0) goto L_0x0025
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x012b
        L_0x0025:
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()
            r4 = 440(0x1b8, float:6.17E-43)
            byte[] r4 = new byte[r4]
            r5 = 0
            r6 = 1
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException -> 0x006d }
            java.io.File r8 = new java.io.File     // Catch:{ IOException -> 0x006d }
            java.lang.String r9 = "/proc/self/stat"
            r8.<init>(r9)     // Catch:{ IOException -> 0x006d }
            r7.<init>(r8)     // Catch:{ IOException -> 0x006d }
            int r8 = r7.read(r4)     // Catch:{ all -> 0x004e }
            r7.close()     // Catch:{ IOException -> 0x006d }
            android.os.StrictMode.setThreadPolicy(r1)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r4, r5, r8)
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            goto L_0x0073
        L_0x004e:
            r4 = move-exception
            r7.close()     // Catch:{ all -> 0x0053 }
            goto L_0x0069
        L_0x0053:
            r7 = move-exception
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x0069 }
            java.lang.Class<java.lang.Throwable> r9 = java.lang.Throwable.class
            r8[r5] = r9     // Catch:{ Exception -> 0x0069 }
            java.lang.Class<java.lang.Throwable> r9 = java.lang.Throwable.class
            java.lang.String r10 = "addSuppressed"
            java.lang.reflect.Method r8 = r9.getDeclaredMethod(r10, r8)     // Catch:{ Exception -> 0x0069 }
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0069 }
            r9[r5] = r7     // Catch:{ Exception -> 0x0069 }
            r8.invoke(r4, r9)     // Catch:{ Exception -> 0x0069 }
        L_0x0069:
            throw r4     // Catch:{ IOException -> 0x006d }
        L_0x006a:
            r0 = move-exception
            goto L_0x012e
        L_0x006d:
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x006a }
            android.os.StrictMode.setThreadPolicy(r1)
            r1 = r4
        L_0x0073:
            boolean r4 = r1.mo56113h()
            if (r4 != 0) goto L_0x007d
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x012b
        L_0x007d:
            java.lang.Object r1 = r1.mo56107c()
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
        L_0x0083:
            int r4 = r1.remaining()
            r7 = 17
            if (r4 <= r7) goto L_0x00fd
            byte r4 = r1.get()
            r7 = 40
            if (r4 != r7) goto L_0x0083
            r4 = 16
        L_0x0095:
            if (r4 < 0) goto L_0x00fd
            int r7 = r1.position()
            int r7 = r7 + r4
            byte r7 = r1.get(r7)
            r8 = 41
            if (r7 != r8) goto L_0x00fa
            int r7 = r1.position()
            int r7 = r7 + r4
            int r7 = r7 + r6
            r1.position(r7)
            byte r4 = r1.get()
            r7 = 32
            if (r4 == r7) goto L_0x00b6
            goto L_0x00fd
        L_0x00b6:
            boolean r4 = m58695b(r1, r6)
            if (r4 == 0) goto L_0x00fd
            r4 = 18
            boolean r4 = m58695b(r1, r4)
            if (r4 == 0) goto L_0x00fd
        L_0x00c4:
            boolean r4 = r1.hasRemaining()
            if (r4 == 0) goto L_0x00f7
            byte r4 = r1.get()
            if (r4 != r7) goto L_0x00db
            if (r5 == 0) goto L_0x00f7
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            goto L_0x00ff
        L_0x00db:
            r5 = 48
            if (r4 < r5) goto L_0x00f7
            r5 = 57
            if (r4 <= r5) goto L_0x00e4
            goto L_0x00f7
        L_0x00e4:
            r8 = 922337203685477580(0xccccccccccccccc, double:5.1488004017107686E-247)
            int r5 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x00f7
            r8 = 10
            long r2 = r2 * r8
            int r4 = r4 + -48
            long r4 = (long) r4
            long r2 = r2 + r4
            r5 = 1
            goto L_0x00c4
        L_0x00f7:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            goto L_0x00ff
        L_0x00fa:
            int r4 = r4 + -1
            goto L_0x0095
        L_0x00fd:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
        L_0x00ff:
            boolean r2 = r1.mo56113h()
            if (r2 != 0) goto L_0x0108
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x012b
        L_0x0108:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.Object r1 = r1.mo56107c()
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            long r1 = r2.toMillis(r3)
            java.lang.Object r0 = r0.mo56107c()
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            long r1 = r1 / r3
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
        L_0x012b:
            f84784a = r0
            return r0
        L_0x012e:
            android.os.StrictMode.setThreadPolicy(r1)
            throw r0
        L_0x0132:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.performance.primes.metrics.p2414h.C31480ac.m58694a():com.google.common.base.ax");
    }

    /* renamed from: b */
    private static boolean m58695b(ByteBuffer byteBuffer, int i) {
        while (byteBuffer.hasRemaining()) {
            if (i <= 0) {
                return true;
            }
            if (byteBuffer.get() == 32) {
                i--;
            }
        }
        return i == 0;
    }
}
