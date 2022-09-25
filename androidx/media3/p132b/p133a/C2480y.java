package androidx.media3.p132b.p133a;

import android.os.ConditionVariable;

/* renamed from: androidx.media3.b.a.y */
/* compiled from: PG */
final class C2480y extends Thread {

    /* renamed from: a */
    final /* synthetic */ ConditionVariable f6817a;

    /* renamed from: b */
    final /* synthetic */ C2481z f6818b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2480y(C2481z zVar, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f6818b = zVar;
        this.f6817a = conditionVariable;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:188|189) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x020b, code lost:
        r7 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0227, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0229, code lost:
        r7 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x022c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x022d, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x022e, code lost:
        if (r9 != null) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0230, code lost:
        androidx.media3.common.p136b.C2612ak.m6941X(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0233, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0234, code lost:
        r7 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:?, code lost:
        throw r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:188:0x0379 */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0227 A[Catch:{ IOException -> 0x0387 }, ExcHandler: all (th java.lang.Throwable), Splitter:B:67:0x017e] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x022c A[Catch:{ IOException -> 0x0387 }, ExcHandler: all (th java.lang.Throwable), Splitter:B:58:0x014f] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0230 A[Catch:{ IOException -> 0x0387 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0239 A[Catch:{ IOException -> 0x0387 }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02ff A[Catch:{ IOException -> 0x0387 }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x033b A[Catch:{ a -> 0x001a }, LOOP:3: B:170:0x0335->B:172:0x033b, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r24 = this;
            r1 = r24
            androidx.media3.b.a.z r2 = r1.f6818b
            monitor-enter(r2)
            android.os.ConditionVariable r0 = r1.f6817a     // Catch:{ all -> 0x03a6 }
            r0.open()     // Catch:{ all -> 0x03a6 }
            androidx.media3.b.a.z r3 = r1.f6818b     // Catch:{ all -> 0x03a6 }
            java.io.File r0 = r3.f6820a     // Catch:{ all -> 0x03a6 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x03a6 }
            if (r0 != 0) goto L_0x001f
            java.io.File r0 = r3.f6820a     // Catch:{ a -> 0x001a }
            androidx.media3.p132b.p133a.C2481z.m6533i(r0)     // Catch:{ a -> 0x001a }
            goto L_0x001f
        L_0x001a:
            r0 = move-exception
            r3.f6824e = r0     // Catch:{ all -> 0x03a6 }
            goto L_0x03a4
        L_0x001f:
            java.io.File r0 = r3.f6820a     // Catch:{ all -> 0x03a6 }
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x03a6 }
            if (r0 != 0) goto L_0x0041
            java.lang.String r0 = "Failed to list cache directory files: "
            java.io.File r4 = r3.f6820a     // Catch:{ all -> 0x03a6 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = r0.concat(r4)     // Catch:{ all -> 0x03a6 }
            java.lang.String r4 = "SimpleCache"
            androidx.media3.common.p136b.C2633u.m7048c(r4, r0)     // Catch:{ all -> 0x03a6 }
            androidx.media3.b.a.a r4 = new androidx.media3.b.a.a     // Catch:{ all -> 0x03a6 }
            r4.<init>((java.lang.String) r0)     // Catch:{ all -> 0x03a6 }
            r3.f6824e = r4     // Catch:{ all -> 0x03a6 }
            goto L_0x03a4
        L_0x0041:
            int r4 = r0.length     // Catch:{ all -> 0x03a6 }
            r5 = 0
            r6 = 0
        L_0x0044:
            r7 = 16
            r8 = -1
            if (r6 >= r4) goto L_0x0080
            r10 = r0[r6]     // Catch:{ all -> 0x03a6 }
            java.lang.String r11 = r10.getName()     // Catch:{ all -> 0x03a6 }
            java.lang.String r12 = ".uid"
            boolean r12 = r11.endsWith(r12)     // Catch:{ all -> 0x03a6 }
            if (r12 == 0) goto L_0x007d
            r12 = 46
            int r12 = r11.indexOf(r12)     // Catch:{ NumberFormatException -> 0x0067 }
            java.lang.String r11 = r11.substring(r5, r12)     // Catch:{ NumberFormatException -> 0x0067 }
            long r10 = java.lang.Long.parseLong(r11, r7)     // Catch:{ NumberFormatException -> 0x0067 }
            goto L_0x0081
        L_0x0067:
            java.lang.String r7 = "SimpleCache"
            java.lang.String r8 = "Malformed UID file: "
            java.lang.String r9 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x03a6 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x03a6 }
            java.lang.String r8 = r8.concat(r9)     // Catch:{ all -> 0x03a6 }
            androidx.media3.common.p136b.C2633u.m7048c(r7, r8)     // Catch:{ all -> 0x03a6 }
            r10.delete()     // Catch:{ all -> 0x03a6 }
        L_0x007d:
            int r6 = r6 + 1
            goto L_0x0044
        L_0x0080:
            r10 = r8
        L_0x0081:
            r3.f6823d = r10     // Catch:{ all -> 0x03a6 }
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x00ec
            java.io.File r4 = r3.f6820a     // Catch:{ IOException -> 0x00cd }
            java.security.SecureRandom r6 = new java.security.SecureRandom     // Catch:{ IOException -> 0x00cd }
            r6.<init>()     // Catch:{ IOException -> 0x00cd }
            long r8 = r6.nextLong()     // Catch:{ IOException -> 0x00cd }
            r10 = -9223372036854775808
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x009c
            r8 = 0
        L_0x009a:
            r10 = r8
            goto L_0x00a1
        L_0x009c:
            long r8 = java.lang.Math.abs(r8)     // Catch:{ IOException -> 0x00cd }
            goto L_0x009a
        L_0x00a1:
            java.lang.String r6 = java.lang.Long.toString(r10, r7)     // Catch:{ IOException -> 0x00cd }
            java.io.File r7 = new java.io.File     // Catch:{ IOException -> 0x00cd }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x00cd }
            java.lang.String r8 = ".uid"
            java.lang.String r6 = r6.concat(r8)     // Catch:{ IOException -> 0x00cd }
            r7.<init>(r4, r6)     // Catch:{ IOException -> 0x00cd }
            boolean r4 = r7.createNewFile()     // Catch:{ IOException -> 0x00cd }
            if (r4 == 0) goto L_0x00bd
            r3.f6823d = r10     // Catch:{ IOException -> 0x00cd }
            goto L_0x00ec
        L_0x00bd:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x00cd }
            java.lang.String r4 = "Failed to create UID file: "
            java.lang.String r5 = r7.toString()     // Catch:{ IOException -> 0x00cd }
            java.lang.String r4 = r4.concat(r5)     // Catch:{ IOException -> 0x00cd }
            r0.<init>(r4)     // Catch:{ IOException -> 0x00cd }
            throw r0     // Catch:{ IOException -> 0x00cd }
        L_0x00cd:
            r0 = move-exception
            java.lang.String r4 = "Failed to create cache UID: "
            java.io.File r5 = r3.f6820a     // Catch:{ all -> 0x03a6 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x03a6 }
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x03a6 }
            java.lang.String r5 = "SimpleCache"
            java.lang.String r6 = androidx.media3.common.p136b.C2633u.m7046a(r4, r0)     // Catch:{ all -> 0x03a6 }
            androidx.media3.common.p136b.C2633u.m7048c(r5, r6)     // Catch:{ all -> 0x03a6 }
            androidx.media3.b.a.a r5 = new androidx.media3.b.a.a     // Catch:{ all -> 0x03a6 }
            r5.<init>(r4, r0)     // Catch:{ all -> 0x03a6 }
            r3.f6824e = r5     // Catch:{ all -> 0x03a6 }
            goto L_0x03a4
        L_0x00ec:
            androidx.media3.b.a.r r4 = r3.f6821b     // Catch:{ IOException -> 0x0387 }
            androidx.media3.b.a.q r6 = r4.f6804c     // Catch:{ IOException -> 0x0387 }
            java.lang.String r7 = java.lang.Long.toHexString(r10)     // Catch:{ IOException -> 0x0387 }
            r8 = r6
            androidx.media3.b.a.o r8 = (androidx.media3.p132b.p133a.C2470o) r8     // Catch:{ IOException -> 0x0387 }
            r8.f6797c = r7     // Catch:{ IOException -> 0x0387 }
            r7 = r6
            androidx.media3.b.a.o r7 = (androidx.media3.p132b.p133a.C2470o) r7     // Catch:{ IOException -> 0x0387 }
            java.lang.String r7 = r7.f6797c     // Catch:{ IOException -> 0x0387 }
            androidx.media3.b.a.o r6 = (androidx.media3.p132b.p133a.C2470o) r6     // Catch:{ IOException -> 0x0387 }
            java.lang.String r8 = "ExoPlayerCacheIndex"
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ IOException -> 0x0387 }
            java.lang.String r7 = r8.concat(r7)     // Catch:{ IOException -> 0x0387 }
            r6.f6798d = r7     // Catch:{ IOException -> 0x0387 }
            androidx.media3.b.a.q r6 = r4.f6804c     // Catch:{ IOException -> 0x0387 }
            r7 = r6
            androidx.media3.b.a.o r7 = (androidx.media3.p132b.p133a.C2470o) r7     // Catch:{ IOException -> 0x0387 }
            androidx.media3.a.c r7 = r7.f6799e     // Catch:{ IOException -> 0x0387 }
            android.database.sqlite.SQLiteDatabase r7 = r7.getReadableDatabase()     // Catch:{ IOException -> 0x0387 }
            androidx.media3.b.a.o r6 = (androidx.media3.p132b.p133a.C2470o) r6     // Catch:{ IOException -> 0x0387 }
            java.lang.String r6 = r6.f6797c     // Catch:{ IOException -> 0x0387 }
            r6.getClass()
            r8 = 1
            int r6 = androidx.media3.p131a.C2453d.m6470a(r7, r8, r6)     // Catch:{ IOException -> 0x0387 }
            r7 = -1
            r10 = 2
            if (r6 == r7) goto L_0x0129
            goto L_0x0250
        L_0x0129:
            androidx.media3.b.a.q r6 = r4.f6805d     // Catch:{ IOException -> 0x0387 }
            if (r6 == 0) goto L_0x0250
            androidx.media3.b.a.p r6 = (androidx.media3.p132b.p133a.C2471p) r6     // Catch:{ IOException -> 0x0387 }
            androidx.media3.common.b.b r6 = r6.f6800a     // Catch:{ IOException -> 0x0387 }
            boolean r6 = r6.mo6188b()     // Catch:{ IOException -> 0x0387 }
            if (r6 == 0) goto L_0x0250
            androidx.media3.b.a.q r6 = r4.f6805d     // Catch:{ IOException -> 0x0387 }
            java.util.HashMap r11 = r4.f6802a     // Catch:{ IOException -> 0x0387 }
            android.util.SparseArray r12 = r4.f6803b     // Catch:{ IOException -> 0x0387 }
            r13 = r6
            androidx.media3.b.a.p r13 = (androidx.media3.p132b.p133a.C2471p) r13     // Catch:{ IOException -> 0x0387 }
            boolean r13 = r13.f6801b     // Catch:{ IOException -> 0x0387 }
            r13 = r6
            androidx.media3.b.a.p r13 = (androidx.media3.p132b.p133a.C2471p) r13     // Catch:{ IOException -> 0x0387 }
            androidx.media3.common.b.b r13 = r13.f6800a     // Catch:{ IOException -> 0x0387 }
            boolean r13 = r13.mo6188b()     // Catch:{ IOException -> 0x0387 }
            if (r13 != 0) goto L_0x014f
            goto L_0x0247
        L_0x014f:
            java.io.BufferedInputStream r13 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0234, all -> 0x022c }
            r14 = r6
            androidx.media3.b.a.p r14 = (androidx.media3.p132b.p133a.C2471p) r14     // Catch:{ IOException -> 0x0234, all -> 0x022c }
            androidx.media3.common.b.b r14 = r14.f6800a     // Catch:{ IOException -> 0x0234, all -> 0x022c }
            java.io.File r15 = r14.f7265b     // Catch:{ IOException -> 0x0234, all -> 0x022c }
            boolean r15 = r15.exists()     // Catch:{ IOException -> 0x0234, all -> 0x022c }
            if (r15 == 0) goto L_0x016f
            java.io.File r15 = r14.f7264a     // Catch:{ IOException -> 0x016b, all -> 0x022c }
            r15.delete()     // Catch:{ IOException -> 0x016b, all -> 0x022c }
            java.io.File r15 = r14.f7265b     // Catch:{ IOException -> 0x016b, all -> 0x022c }
            java.io.File r9 = r14.f7264a     // Catch:{ IOException -> 0x016b, all -> 0x022c }
            r15.renameTo(r9)     // Catch:{ IOException -> 0x016b, all -> 0x022c }
            goto L_0x016f
        L_0x016b:
            r7 = r11
            goto L_0x0236
        L_0x016f:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0234, all -> 0x022c }
            java.io.File r14 = r14.f7264a     // Catch:{ IOException -> 0x0234, all -> 0x022c }
            r9.<init>(r14)     // Catch:{ IOException -> 0x0234, all -> 0x022c }
            r13.<init>(r9)     // Catch:{ IOException -> 0x0234, all -> 0x022c }
            java.io.DataInputStream r9 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0234, all -> 0x022c }
            r9.<init>(r13)     // Catch:{ IOException -> 0x0234, all -> 0x022c }
            int r13 = r9.readInt()     // Catch:{ IOException -> 0x0229, all -> 0x0227 }
            if (r13 < 0) goto L_0x0225
            if (r13 <= r10) goto L_0x0188
            goto L_0x0225
        L_0x0188:
            int r14 = r9.readInt()     // Catch:{ IOException -> 0x0229, all -> 0x0227 }
            r14 = r14 & r8
            if (r14 == 0) goto L_0x0195
            androidx.media3.common.p136b.C2612ak.m6941X(r9)     // Catch:{ IOException -> 0x0387 }
            r7 = r11
            goto L_0x023a
        L_0x0195:
            int r14 = r9.readInt()     // Catch:{ IOException -> 0x0229, all -> 0x0227 }
            r15 = 0
        L_0x019a:
            if (r5 >= r14) goto L_0x020e
            int r8 = r9.readInt()     // Catch:{ IOException -> 0x0229, all -> 0x0227 }
            java.lang.String r7 = r9.readUTF()     // Catch:{ IOException -> 0x0229, all -> 0x0227 }
            if (r13 >= r10) goto L_0x01c0
            r16 = r11
            long r10 = r9.readLong()     // Catch:{ IOException -> 0x01bb, all -> 0x0227 }
            androidx.media3.b.a.t r1 = new androidx.media3.b.a.t     // Catch:{ IOException -> 0x01bb, all -> 0x0227 }
            r1.<init>()     // Catch:{ IOException -> 0x01bb, all -> 0x0227 }
            r1.mo5908b(r10)     // Catch:{ IOException -> 0x01bb, all -> 0x0227 }
            androidx.media3.b.a.u r10 = androidx.media3.p132b.p133a.C2476u.f6810a     // Catch:{ IOException -> 0x01bb, all -> 0x0227 }
            androidx.media3.b.a.u r1 = r10.mo5909c(r1)     // Catch:{ IOException -> 0x01bb, all -> 0x0227 }
            goto L_0x01c6
        L_0x01bb:
            r7 = r16
            goto L_0x0237
        L_0x01c0:
            r16 = r11
            androidx.media3.b.a.u r1 = androidx.media3.p132b.p133a.C2473r.m6516c(r9)     // Catch:{ IOException -> 0x020b, all -> 0x0227 }
        L_0x01c6:
            androidx.media3.b.a.n r10 = new androidx.media3.b.a.n     // Catch:{ IOException -> 0x020b, all -> 0x0227 }
            r10.<init>(r8, r7, r1)     // Catch:{ IOException -> 0x020b, all -> 0x0227 }
            java.lang.String r1 = r10.f6791b     // Catch:{ IOException -> 0x020b, all -> 0x0227 }
            r7 = r16
            r7.put(r1, r10)     // Catch:{ IOException -> 0x022a, all -> 0x0227 }
            int r1 = r10.f6790a     // Catch:{ IOException -> 0x022a, all -> 0x0227 }
            java.lang.String r8 = r10.f6791b     // Catch:{ IOException -> 0x022a, all -> 0x0227 }
            r12.put(r1, r8)     // Catch:{ IOException -> 0x022a, all -> 0x0227 }
            int r1 = r10.f6790a     // Catch:{ IOException -> 0x022a, all -> 0x0227 }
            int r1 = r1 * 31
            java.lang.String r8 = r10.f6791b     // Catch:{ IOException -> 0x022a, all -> 0x0227 }
            int r8 = r8.hashCode()     // Catch:{ IOException -> 0x022a, all -> 0x0227 }
            int r1 = r1 + r8
            r8 = 2
            if (r13 >= r8) goto L_0x01f8
            androidx.media3.b.a.u r8 = r10.f6794e     // Catch:{ IOException -> 0x022a, all -> 0x0227 }
            long r10 = r8.mo5905a()     // Catch:{ IOException -> 0x022a, all -> 0x0227 }
            int r1 = r1 * 31
            r8 = 32
            long r16 = r10 >>> r8
            long r10 = r10 ^ r16
            int r8 = (int) r10     // Catch:{ IOException -> 0x022a, all -> 0x0227 }
        L_0x01f6:
            int r1 = r1 + r8
            goto L_0x0201
        L_0x01f8:
            int r1 = r1 * 31
            androidx.media3.b.a.u r8 = r10.f6794e     // Catch:{ IOException -> 0x022a, all -> 0x0227 }
            int r8 = r8.hashCode()     // Catch:{ IOException -> 0x022a, all -> 0x0227 }
            goto L_0x01f6
        L_0x0201:
            int r15 = r15 + r1
            int r5 = r5 + 1
            r1 = r24
            r11 = r7
            r7 = -1
            r8 = 1
            r10 = 2
            goto L_0x019a
        L_0x020b:
            r7 = r16
            goto L_0x022a
        L_0x020e:
            r7 = r11
            int r1 = r9.readInt()     // Catch:{ IOException -> 0x022a, all -> 0x0227 }
            int r5 = r9.read()     // Catch:{ IOException -> 0x022a, all -> 0x0227 }
            if (r1 != r15) goto L_0x0221
            r1 = -1
            if (r5 == r1) goto L_0x021d
            goto L_0x0221
        L_0x021d:
            androidx.media3.common.p136b.C2612ak.m6941X(r9)     // Catch:{ IOException -> 0x0387 }
            goto L_0x0247
        L_0x0221:
            androidx.media3.common.p136b.C2612ak.m6941X(r9)     // Catch:{ IOException -> 0x0387 }
            goto L_0x023a
        L_0x0225:
            r7 = r11
            goto L_0x0221
        L_0x0227:
            r0 = move-exception
            goto L_0x022e
        L_0x0229:
            r7 = r11
        L_0x022a:
            goto L_0x0237
        L_0x022c:
            r0 = move-exception
            r9 = 0
        L_0x022e:
            if (r9 == 0) goto L_0x0233
            androidx.media3.common.p136b.C2612ak.m6941X(r9)     // Catch:{ IOException -> 0x0387 }
        L_0x0233:
            throw r0     // Catch:{ IOException -> 0x0387 }
        L_0x0234:
            r7 = r11
        L_0x0236:
            r9 = 0
        L_0x0237:
            if (r9 == 0) goto L_0x023a
            goto L_0x0221
        L_0x023a:
            r7.clear()     // Catch:{ IOException -> 0x0387 }
            r12.clear()     // Catch:{ IOException -> 0x0387 }
            androidx.media3.b.a.p r6 = (androidx.media3.p132b.p133a.C2471p) r6     // Catch:{ IOException -> 0x0387 }
            androidx.media3.common.b.b r1 = r6.f6800a     // Catch:{ IOException -> 0x0387 }
            r1.mo6187a()     // Catch:{ IOException -> 0x0387 }
        L_0x0247:
            androidx.media3.b.a.q r1 = r4.f6804c     // Catch:{ IOException -> 0x0387 }
            java.util.HashMap r5 = r4.f6802a     // Catch:{ IOException -> 0x0387 }
            r1.mo5899c(r5)     // Catch:{ IOException -> 0x0387 }
            goto L_0x02fb
        L_0x0250:
            androidx.media3.b.a.q r1 = r4.f6804c     // Catch:{ IOException -> 0x0387 }
            java.util.HashMap r6 = r4.f6802a     // Catch:{ IOException -> 0x0387 }
            android.util.SparseArray r7 = r4.f6803b     // Catch:{ IOException -> 0x0387 }
            r8 = r1
            androidx.media3.b.a.o r8 = (androidx.media3.p132b.p133a.C2470o) r8     // Catch:{ IOException -> 0x0387 }
            android.util.SparseArray r8 = r8.f6796b     // Catch:{ IOException -> 0x0387 }
            int r8 = r8.size()     // Catch:{ IOException -> 0x0387 }
            if (r8 != 0) goto L_0x0263
            r8 = 1
            goto L_0x0264
        L_0x0263:
            r8 = 0
        L_0x0264:
            androidx.media3.common.p136b.C2601a.m6832d(r8)     // Catch:{ IOException -> 0x0387 }
            r8 = r1
            androidx.media3.b.a.o r8 = (androidx.media3.p132b.p133a.C2470o) r8     // Catch:{ SQLiteException -> 0x037a }
            androidx.media3.a.c r8 = r8.f6799e     // Catch:{ SQLiteException -> 0x037a }
            android.database.sqlite.SQLiteDatabase r8 = r8.getReadableDatabase()     // Catch:{ SQLiteException -> 0x037a }
            r9 = r1
            androidx.media3.b.a.o r9 = (androidx.media3.p132b.p133a.C2470o) r9     // Catch:{ SQLiteException -> 0x037a }
            java.lang.String r9 = r9.f6797c     // Catch:{ SQLiteException -> 0x037a }
            r9.getClass()
            r10 = 1
            int r8 = androidx.media3.p131a.C2453d.m6470a(r8, r10, r9)     // Catch:{ SQLiteException -> 0x037a }
            if (r8 == r10) goto L_0x029d
            r8 = r1
            androidx.media3.b.a.o r8 = (androidx.media3.p132b.p133a.C2470o) r8     // Catch:{ SQLiteException -> 0x037a }
            androidx.media3.a.c r8 = r8.f6799e     // Catch:{ SQLiteException -> 0x037a }
            android.database.sqlite.SQLiteDatabase r8 = r8.getWritableDatabase()     // Catch:{ SQLiteException -> 0x037a }
            r8.beginTransactionNonExclusive()     // Catch:{ SQLiteException -> 0x037a }
            r9 = r1
            androidx.media3.b.a.o r9 = (androidx.media3.p132b.p133a.C2470o) r9     // Catch:{ all -> 0x0298 }
            r9.mo5897a(r8)     // Catch:{ all -> 0x0298 }
            r8.setTransactionSuccessful()     // Catch:{ all -> 0x0298 }
            r8.endTransaction()     // Catch:{ SQLiteException -> 0x037a }
            goto L_0x029d
        L_0x0298:
            r0 = move-exception
            r8.endTransaction()     // Catch:{ SQLiteException -> 0x037a }
            throw r0     // Catch:{ SQLiteException -> 0x037a }
        L_0x029d:
            r8 = r1
            androidx.media3.b.a.o r8 = (androidx.media3.p132b.p133a.C2470o) r8     // Catch:{ SQLiteException -> 0x037a }
            androidx.media3.a.c r8 = r8.f6799e     // Catch:{ SQLiteException -> 0x037a }
            android.database.sqlite.SQLiteDatabase r16 = r8.getReadableDatabase()     // Catch:{ SQLiteException -> 0x037a }
            androidx.media3.b.a.o r1 = (androidx.media3.p132b.p133a.C2470o) r1     // Catch:{ SQLiteException -> 0x037a }
            java.lang.String r1 = r1.f6798d     // Catch:{ SQLiteException -> 0x037a }
            r1.getClass()
            java.lang.String[] r18 = androidx.media3.p132b.p133a.C2470o.f6795a     // Catch:{ SQLiteException -> 0x037a }
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r17 = r1
            android.database.Cursor r1 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x037a }
        L_0x02bf:
            boolean r8 = r1.moveToNext()     // Catch:{ all -> 0x0358 }
            if (r8 == 0) goto L_0x02f6
            int r8 = r1.getInt(r5)     // Catch:{ all -> 0x0358 }
            r9 = 1
            java.lang.String r10 = r1.getString(r9)     // Catch:{ all -> 0x0358 }
            r10.getClass()
            r9 = 2
            byte[] r11 = r1.getBlob(r9)     // Catch:{ all -> 0x0358 }
            java.io.ByteArrayInputStream r12 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0358 }
            r12.<init>(r11)     // Catch:{ all -> 0x0358 }
            java.io.DataInputStream r11 = new java.io.DataInputStream     // Catch:{ all -> 0x0358 }
            r11.<init>(r12)     // Catch:{ all -> 0x0358 }
            androidx.media3.b.a.u r11 = androidx.media3.p132b.p133a.C2473r.m6516c(r11)     // Catch:{ all -> 0x0358 }
            androidx.media3.b.a.n r12 = new androidx.media3.b.a.n     // Catch:{ all -> 0x0358 }
            r12.<init>(r8, r10, r11)     // Catch:{ all -> 0x0358 }
            java.lang.String r8 = r12.f6791b     // Catch:{ all -> 0x0358 }
            r6.put(r8, r12)     // Catch:{ all -> 0x0358 }
            int r8 = r12.f6790a     // Catch:{ all -> 0x0358 }
            java.lang.String r10 = r12.f6791b     // Catch:{ all -> 0x0358 }
            r7.put(r8, r10)     // Catch:{ all -> 0x0358 }
            goto L_0x02bf
        L_0x02f6:
            if (r1 == 0) goto L_0x02fb
            r1.close()     // Catch:{ SQLiteException -> 0x037a }
        L_0x02fb:
            androidx.media3.b.a.q r1 = r4.f6805d     // Catch:{ IOException -> 0x0387 }
            if (r1 == 0) goto L_0x0309
            androidx.media3.b.a.p r1 = (androidx.media3.p132b.p133a.C2471p) r1     // Catch:{ IOException -> 0x0387 }
            androidx.media3.common.b.b r1 = r1.f6800a     // Catch:{ IOException -> 0x0387 }
            r1.mo6187a()     // Catch:{ IOException -> 0x0387 }
            r1 = 0
            r4.f6805d = r1     // Catch:{ IOException -> 0x0387 }
        L_0x0309:
            androidx.media3.b.a.h r1 = r3.f6822c     // Catch:{ IOException -> 0x0387 }
            long r4 = r3.f6823d     // Catch:{ IOException -> 0x0387 }
            r1.mo5886b(r4)     // Catch:{ IOException -> 0x0387 }
            androidx.media3.b.a.h r1 = r3.f6822c     // Catch:{ IOException -> 0x0387 }
            java.util.Map r1 = r1.mo5885a()     // Catch:{ IOException -> 0x0387 }
            java.io.File r4 = r3.f6820a     // Catch:{ IOException -> 0x0387 }
            r5 = 1
            r3.mo5920j(r4, r5, r0, r1)     // Catch:{ IOException -> 0x0387 }
            androidx.media3.b.a.h r0 = r3.f6822c     // Catch:{ IOException -> 0x0387 }
            java.util.Set r1 = r1.keySet()     // Catch:{ IOException -> 0x0387 }
            r0.mo5888d(r1)     // Catch:{ IOException -> 0x0387 }
            androidx.media3.b.a.r r0 = r3.f6821b     // Catch:{ all -> 0x03a6 }
            java.util.HashMap r1 = r0.f6802a     // Catch:{ all -> 0x03a6 }
            java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x03a6 }
            com.google.common.b.ij r1 = com.google.common.p4522b.C58528ij.m90006F(r1)     // Catch:{ all -> 0x03a6 }
            com.google.common.b.sl r1 = r1.iterator()     // Catch:{ all -> 0x03a6 }
        L_0x0335:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x03a6 }
            if (r4 == 0) goto L_0x0345
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x03a6 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x03a6 }
            r0.mo5903d(r4)     // Catch:{ all -> 0x03a6 }
            goto L_0x0335
        L_0x0345:
            androidx.media3.b.a.r r0 = r3.f6821b     // Catch:{ IOException -> 0x034b }
            r0.mo5904e()     // Catch:{ IOException -> 0x034b }
            goto L_0x03a4
        L_0x034b:
            r0 = move-exception
            java.lang.String r1 = "SimpleCache"
            java.lang.String r3 = "Storing index file failed"
            java.lang.String r0 = androidx.media3.common.p136b.C2633u.m7046a(r3, r0)     // Catch:{ all -> 0x03a6 }
            androidx.media3.common.p136b.C2633u.m7048c(r1, r0)     // Catch:{ all -> 0x03a6 }
            goto L_0x03a4
        L_0x0358:
            r0 = move-exception
            r4 = r0
            if (r1 == 0) goto L_0x0379
            r1.close()     // Catch:{ all -> 0x0360 }
            goto L_0x0379
        L_0x0360:
            r0 = move-exception
            r1 = r0
            r8 = 1
            java.lang.Class[] r0 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x0379 }
            java.lang.Class<java.lang.Throwable> r8 = java.lang.Throwable.class
            r0[r5] = r8     // Catch:{ Exception -> 0x0379 }
            java.lang.Class<java.lang.Throwable> r8 = java.lang.Throwable.class
            java.lang.String r9 = "addSuppressed"
            java.lang.reflect.Method r0 = r8.getDeclaredMethod(r9, r0)     // Catch:{ Exception -> 0x0379 }
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0379 }
            r8[r5] = r1     // Catch:{ Exception -> 0x0379 }
            r0.invoke(r4, r8)     // Catch:{ Exception -> 0x0379 }
        L_0x0379:
            throw r4     // Catch:{ SQLiteException -> 0x037a }
        L_0x037a:
            r0 = move-exception
            r6.clear()     // Catch:{ IOException -> 0x0387 }
            r7.clear()     // Catch:{ IOException -> 0x0387 }
            androidx.media3.a.a r1 = new androidx.media3.a.a     // Catch:{ IOException -> 0x0387 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0387 }
            throw r1     // Catch:{ IOException -> 0x0387 }
        L_0x0387:
            r0 = move-exception
            java.lang.String r1 = "Failed to initialize cache indices: "
            java.io.File r4 = r3.f6820a     // Catch:{ all -> 0x03a6 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x03a6 }
            java.lang.String r1 = r1.concat(r4)     // Catch:{ all -> 0x03a6 }
            java.lang.String r4 = "SimpleCache"
            java.lang.String r5 = androidx.media3.common.p136b.C2633u.m7046a(r1, r0)     // Catch:{ all -> 0x03a6 }
            androidx.media3.common.p136b.C2633u.m7048c(r4, r5)     // Catch:{ all -> 0x03a6 }
            androidx.media3.b.a.a r4 = new androidx.media3.b.a.a     // Catch:{ all -> 0x03a6 }
            r4.<init>(r1, r0)     // Catch:{ all -> 0x03a6 }
            r3.f6824e = r4     // Catch:{ all -> 0x03a6 }
        L_0x03a4:
            monitor-exit(r2)     // Catch:{ all -> 0x03a6 }
            return
        L_0x03a6:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x03a6 }
            goto L_0x03aa
        L_0x03a9:
            throw r0
        L_0x03aa:
            goto L_0x03a9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.p132b.p133a.C2480y.run():void");
    }
}
