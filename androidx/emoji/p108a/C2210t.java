package androidx.emoji.p108a;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.core.p095g.C1909g;
import androidx.core.p097i.C1974i;

/* renamed from: androidx.emoji.a.t */
/* compiled from: PG */
public final class C2210t implements C2198h {

    /* renamed from: a */
    public final Object f6254a = new Object();

    /* renamed from: b */
    public Handler f6255b;

    /* renamed from: c */
    public HandlerThread f6256c;

    /* renamed from: d */
    public C2211u f6257d;

    /* renamed from: e */
    C2199i f6258e;

    /* renamed from: f */
    private final Context f6259f;

    /* renamed from: g */
    private final C1909g f6260g;

    /* renamed from: h */
    private ContentObserver f6261h;

    /* renamed from: i */
    private Runnable f6262i;

    public C2210t(Context context, C1909g gVar) {
        C1974i.m5319g(context, "Context cannot be null");
        this.f6259f = context.getApplicationContext();
        this.f6260g = gVar;
    }

    /* renamed from: b */
    private final void m6104b() {
        this.f6258e = null;
        ContentObserver contentObserver = this.f6261h;
        if (contentObserver != null) {
            this.f6259f.getContentResolver().unregisterContentObserver(contentObserver);
            this.f6261h = null;
        }
        synchronized (this.f6254a) {
            this.f6255b.removeCallbacks(this.f6262i);
            HandlerThread handlerThread = this.f6256c;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            this.f6255b = null;
            this.f6256c = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0097, code lost:
        r4 = 2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5527a() {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = "fetchFonts result is not OK. ("
            java.lang.String r2 = "fetchFonts failed ("
            androidx.emoji.a.i r3 = r1.f6258e
            if (r3 == 0) goto L_0x0267
            android.content.Context r3 = r1.f6259f     // Catch:{ NameNotFoundException -> 0x0250 }
            androidx.core.g.g r4 = r1.f6260g     // Catch:{ NameNotFoundException -> 0x0250 }
            r5 = 0
            androidx.core.g.n r3 = androidx.core.p095g.C1908f.m5173a(r3, r4, r5)     // Catch:{ NameNotFoundException -> 0x0250 }
            int r4 = r3.f5806a     // Catch:{ all -> 0x0259 }
            if (r4 != 0) goto L_0x0237
            androidx.core.g.o[] r2 = r3.f5807b     // Catch:{ all -> 0x0259 }
            if (r2 == 0) goto L_0x022f
            int r3 = r2.length     // Catch:{ all -> 0x0259 }
            if (r3 == 0) goto L_0x022f
            r3 = 0
            r2 = r2[r3]     // Catch:{ all -> 0x0259 }
            int r4 = r2.f5812e     // Catch:{ all -> 0x0259 }
            r6 = 2
            if (r4 != r6) goto L_0x009c
            java.lang.Object r4 = r1.f6254a     // Catch:{ all -> 0x0259 }
            monitor-enter(r4)     // Catch:{ all -> 0x0259 }
            androidx.emoji.a.u r9 = r1.f6257d     // Catch:{ all -> 0x0099 }
            if (r9 == 0) goto L_0x0096
            r10 = r9
            androidx.emoji.a.p r10 = (androidx.emoji.p108a.C2206p) r10     // Catch:{ all -> 0x0099 }
            long r10 = r10.f6249a     // Catch:{ all -> 0x0099 }
            r12 = 0
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0042
            long r10 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0099 }
            androidx.emoji.a.p r9 = (androidx.emoji.p108a.C2206p) r9     // Catch:{ all -> 0x0099 }
            r9.f6249a = r10     // Catch:{ all -> 0x0099 }
            r6 = r12
            goto L_0x005f
        L_0x0042:
            long r10 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0099 }
            androidx.emoji.a.p r9 = (androidx.emoji.p108a.C2206p) r9     // Catch:{ all -> 0x0099 }
            long r14 = r9.f6249a     // Catch:{ all -> 0x0099 }
            long r10 = r10 - r14
            r14 = 2000(0x7d0, double:9.88E-321)
            int r9 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x0054
            r6 = -1
            goto L_0x005f
        L_0x0054:
            r6 = 1000(0x3e8, double:4.94E-321)
            long r6 = java.lang.Math.max(r10, r6)     // Catch:{ all -> 0x0099 }
            long r14 = r14 - r10
            long r6 = java.lang.Math.min(r6, r14)     // Catch:{ all -> 0x0099 }
        L_0x005f:
            int r8 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r8 < 0) goto L_0x0096
            android.net.Uri r0 = r2.f5808a     // Catch:{ all -> 0x0099 }
            java.lang.Object r2 = r1.f6254a     // Catch:{ all -> 0x0099 }
            monitor-enter(r2)     // Catch:{ all -> 0x0099 }
            android.database.ContentObserver r5 = r1.f6261h     // Catch:{ all -> 0x0093 }
            if (r5 != 0) goto L_0x007e
            androidx.emoji.a.r r5 = new androidx.emoji.a.r     // Catch:{ all -> 0x0093 }
            android.os.Handler r8 = r1.f6255b     // Catch:{ all -> 0x0093 }
            r5.<init>(r1, r8)     // Catch:{ all -> 0x0093 }
            r1.f6261h = r5     // Catch:{ all -> 0x0093 }
            android.content.Context r8 = r1.f6259f     // Catch:{ all -> 0x0093 }
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ all -> 0x0093 }
            r8.registerContentObserver(r0, r3, r5)     // Catch:{ all -> 0x0093 }
        L_0x007e:
            java.lang.Runnable r0 = r1.f6262i     // Catch:{ all -> 0x0093 }
            if (r0 != 0) goto L_0x0089
            androidx.emoji.a.s r0 = new androidx.emoji.a.s     // Catch:{ all -> 0x0093 }
            r0.<init>(r1)     // Catch:{ all -> 0x0093 }
            r1.f6262i = r0     // Catch:{ all -> 0x0093 }
        L_0x0089:
            android.os.Handler r0 = r1.f6255b     // Catch:{ all -> 0x0093 }
            java.lang.Runnable r3 = r1.f6262i     // Catch:{ all -> 0x0093 }
            r0.postDelayed(r3, r6)     // Catch:{ all -> 0x0093 }
            monitor-exit(r2)     // Catch:{ all -> 0x0093 }
            monitor-exit(r4)     // Catch:{ all -> 0x0099 }
            return
        L_0x0093:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0093 }
            throw r0     // Catch:{ all -> 0x0099 }
        L_0x0096:
            monitor-exit(r4)     // Catch:{ all -> 0x0099 }
            r4 = 2
            goto L_0x009c
        L_0x0099:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0099 }
            throw r0     // Catch:{ all -> 0x0259 }
        L_0x009c:
            if (r4 != 0) goto L_0x0218
            android.content.Context r0 = r1.f6259f     // Catch:{ all -> 0x0259 }
            r4 = 1
            androidx.core.g.o[] r6 = new androidx.core.p095g.C1917o[r4]     // Catch:{ all -> 0x0259 }
            r6[r3] = r2     // Catch:{ all -> 0x0259 }
            androidx.core.graphics.k r7 = androidx.core.graphics.C1943i.f5852a     // Catch:{ all -> 0x0259 }
            android.graphics.Typeface r6 = r7.mo5097a(r0, r6, r3)     // Catch:{ all -> 0x0259 }
            android.content.Context r0 = r1.f6259f     // Catch:{ all -> 0x0259 }
            android.net.Uri r2 = r2.f5808a     // Catch:{ all -> 0x0259 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ all -> 0x0259 }
            java.lang.String r7 = "r"
            android.os.ParcelFileDescriptor r2 = androidx.core.graphics.C1947m.m5267a(r0, r2, r7, r5)     // Catch:{ IOException -> 0x00f5 }
            if (r2 != 0) goto L_0x00bc
            goto L_0x00f6
        L_0x00bc:
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ all -> 0x00e9 }
            java.io.FileDescriptor r0 = r2.getFileDescriptor()     // Catch:{ all -> 0x00e9 }
            r7.<init>(r0)     // Catch:{ all -> 0x00e9 }
            java.nio.channels.FileChannel r8 = p3186j$.wrapper.java.p3189io.FileInputStreamWrapper.getChannel(r7)     // Catch:{ all -> 0x00dd }
            long r12 = r8.size()     // Catch:{ all -> 0x00dd }
            java.nio.channels.FileChannel$MapMode r9 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x00dd }
            r10 = 0
            java.nio.MappedByteBuffer r0 = r8.map(r9, r10, r12)     // Catch:{ all -> 0x00dd }
            r7.close()     // Catch:{ all -> 0x00e9 }
            r2.close()     // Catch:{ IOException -> 0x00f5 }
            r5 = r0
            goto L_0x00f6
        L_0x00dd:
            r0 = move-exception
            r8 = r0
            r7.close()     // Catch:{ all -> 0x00e3 }
            goto L_0x00e8
        L_0x00e3:
            r0 = move-exception
            r7 = r0
            androidx.core.graphics.C1946l.m5266a(r8, r7)     // Catch:{ all -> 0x00e9 }
        L_0x00e8:
            throw r8     // Catch:{ all -> 0x00e9 }
        L_0x00e9:
            r0 = move-exception
            r7 = r0
            r2.close()     // Catch:{ all -> 0x00ef }
            goto L_0x00f4
        L_0x00ef:
            r0 = move-exception
            r2 = r0
            androidx.core.graphics.C1946l.m5266a(r7, r2)     // Catch:{ IOException -> 0x00f5 }
        L_0x00f4:
            throw r7     // Catch:{ IOException -> 0x00f5 }
        L_0x00f5:
        L_0x00f6:
            if (r5 == 0) goto L_0x0210
            androidx.emoji.a.i r0 = r1.f6258e     // Catch:{ all -> 0x0259 }
            androidx.emoji.a.y r2 = new androidx.emoji.a.y     // Catch:{ all -> 0x0259 }
            java.nio.ByteBuffer r5 = r5.duplicate()     // Catch:{ all -> 0x0259 }
            java.nio.ByteOrder r7 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ all -> 0x0259 }
            r5.order(r7)     // Catch:{ all -> 0x0259 }
            int r7 = r5.position()     // Catch:{ all -> 0x0259 }
            int r7 = r7 + 4
            r5.position(r7)     // Catch:{ all -> 0x0259 }
            short r7 = r5.getShort()     // Catch:{ all -> 0x0259 }
            char r7 = (char) r7     // Catch:{ all -> 0x0259 }
            r8 = 100
            if (r7 > r8) goto L_0x0208
            int r8 = r5.position()     // Catch:{ all -> 0x0259 }
            int r8 = r8 + 6
            r5.position(r8)     // Catch:{ all -> 0x0259 }
            r8 = 0
        L_0x0121:
            if (r8 >= r7) goto L_0x0148
            int r9 = r5.getInt()     // Catch:{ all -> 0x0259 }
            int r10 = r5.position()     // Catch:{ all -> 0x0259 }
            int r10 = r10 + 4
            r5.position(r10)     // Catch:{ all -> 0x0259 }
            long r10 = androidx.emoji.p108a.C2213w.m6106a(r5)     // Catch:{ all -> 0x0259 }
            int r12 = r5.position()     // Catch:{ all -> 0x0259 }
            int r12 = r12 + 4
            r5.position(r12)     // Catch:{ all -> 0x0259 }
            r12 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r9 != r12) goto L_0x0145
            r7 = -1
            goto L_0x014c
        L_0x0145:
            int r8 = r8 + 1
            goto L_0x0121
        L_0x0148:
            r7 = -1
            r10 = -1
        L_0x014c:
            int r9 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0200
            int r7 = r5.position()     // Catch:{ all -> 0x0259 }
            long r7 = (long) r7     // Catch:{ all -> 0x0259 }
            long r7 = r10 - r7
            int r8 = (int) r7     // Catch:{ all -> 0x0259 }
            int r7 = r5.position()     // Catch:{ all -> 0x0259 }
            int r7 = r7 + r8
            r5.position(r7)     // Catch:{ all -> 0x0259 }
            int r7 = r5.position()     // Catch:{ all -> 0x0259 }
            int r7 = r7 + 12
            r5.position(r7)     // Catch:{ all -> 0x0259 }
            long r7 = androidx.emoji.p108a.C2213w.m6106a(r5)     // Catch:{ all -> 0x0259 }
        L_0x016d:
            long r12 = (long) r3     // Catch:{ all -> 0x0259 }
            int r9 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0200
            int r9 = r5.getInt()     // Catch:{ all -> 0x0259 }
            long r12 = androidx.emoji.p108a.C2213w.m6106a(r5)     // Catch:{ all -> 0x0259 }
            androidx.emoji.p108a.C2213w.m6106a(r5)     // Catch:{ all -> 0x0259 }
            r14 = 1164798569(0x456d6a69, float:3798.6506)
            if (r9 == r14) goto L_0x018b
            r14 = 1701669481(0x656d6a69, float:7.0072736E22)
            if (r9 != r14) goto L_0x0188
            goto L_0x018b
        L_0x0188:
            int r3 = r3 + 1
            goto L_0x016d
        L_0x018b:
            long r12 = r12 + r10
            int r3 = (int) r12     // Catch:{ all -> 0x0259 }
            r5.position(r3)     // Catch:{ all -> 0x0259 }
            androidx.s.a.a.b r3 = new androidx.s.a.a.b     // Catch:{ all -> 0x0259 }
            r3.<init>()     // Catch:{ all -> 0x0259 }
            java.nio.ByteOrder r7 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ all -> 0x0259 }
            r5.order(r7)     // Catch:{ all -> 0x0259 }
            int r7 = r5.position()     // Catch:{ all -> 0x0259 }
            int r7 = r5.getInt(r7)     // Catch:{ all -> 0x0259 }
            int r8 = r5.position()     // Catch:{ all -> 0x0259 }
            int r7 = r7 + r8
            r3.mo8583h(r7, r5)     // Catch:{ all -> 0x0259 }
            r2.<init>(r6, r3)     // Catch:{ all -> 0x0259 }
            androidx.emoji.a.a r0 = (androidx.emoji.p108a.C2191a) r0     // Catch:{ all -> 0x0259 }
            androidx.emoji.a.b r0 = r0.f6212a     // Catch:{ all -> 0x0259 }
            r0.f6214b = r2     // Catch:{ all -> 0x0259 }
            androidx.emoji.a.n r2 = new androidx.emoji.a.n     // Catch:{ all -> 0x0259 }
            androidx.emoji.a.y r3 = r0.f6214b     // Catch:{ all -> 0x0259 }
            androidx.emoji.a.j r5 = r0.f6215c     // Catch:{ all -> 0x0259 }
            androidx.emoji.a.e r5 = r5.f6230j     // Catch:{ all -> 0x0259 }
            r2.<init>(r3, r5)     // Catch:{ all -> 0x0259 }
            r0.f6213a = r2     // Catch:{ all -> 0x0259 }
            androidx.emoji.a.j r2 = r0.f6215c     // Catch:{ all -> 0x0259 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0259 }
            r0.<init>()     // Catch:{ all -> 0x0259 }
            java.util.concurrent.locks.ReadWriteLock r3 = r2.f6223c     // Catch:{ all -> 0x0259 }
            java.util.concurrent.locks.Lock r3 = r3.writeLock()     // Catch:{ all -> 0x0259 }
            r3.lock()     // Catch:{ all -> 0x0259 }
            r2.f6225e = r4     // Catch:{ all -> 0x01f5 }
            java.util.Set r3 = r2.f6224d     // Catch:{ all -> 0x01f5 }
            r0.addAll(r3)     // Catch:{ all -> 0x01f5 }
            java.util.Set r3 = r2.f6224d     // Catch:{ all -> 0x01f5 }
            r3.clear()     // Catch:{ all -> 0x01f5 }
            java.util.concurrent.locks.ReadWriteLock r3 = r2.f6223c     // Catch:{ all -> 0x0259 }
            java.util.concurrent.locks.Lock r3 = r3.writeLock()     // Catch:{ all -> 0x0259 }
            r3.unlock()     // Catch:{ all -> 0x0259 }
            android.os.Handler r3 = r2.f6226f     // Catch:{ all -> 0x0259 }
            androidx.emoji.a.g r4 = new androidx.emoji.a.g     // Catch:{ all -> 0x0259 }
            int r2 = r2.f6225e     // Catch:{ all -> 0x0259 }
            r4.<init>(r0, r2)     // Catch:{ all -> 0x0259 }
            r3.post(r4)     // Catch:{ all -> 0x0259 }
            r16.m6104b()     // Catch:{ all -> 0x0259 }
            return
        L_0x01f5:
            r0 = move-exception
            java.util.concurrent.locks.ReadWriteLock r2 = r2.f6223c     // Catch:{ all -> 0x0259 }
            java.util.concurrent.locks.Lock r2 = r2.writeLock()     // Catch:{ all -> 0x0259 }
            r2.unlock()     // Catch:{ all -> 0x0259 }
            throw r0     // Catch:{ all -> 0x0259 }
        L_0x0200:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0259 }
            java.lang.String r2 = "Cannot read metadata."
            r0.<init>(r2)     // Catch:{ all -> 0x0259 }
            throw r0     // Catch:{ all -> 0x0259 }
        L_0x0208:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0259 }
            java.lang.String r2 = "Cannot read metadata."
            r0.<init>(r2)     // Catch:{ all -> 0x0259 }
            throw r0     // Catch:{ all -> 0x0259 }
        L_0x0210:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0259 }
            java.lang.String r2 = "Unable to open file."
            r0.<init>(r2)     // Catch:{ all -> 0x0259 }
            throw r0     // Catch:{ all -> 0x0259 }
        L_0x0218:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0259 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0259 }
            r3.<init>(r0)     // Catch:{ all -> 0x0259 }
            r3.append(r4)     // Catch:{ all -> 0x0259 }
            java.lang.String r0 = ")"
            r3.append(r0)     // Catch:{ all -> 0x0259 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0259 }
            r2.<init>(r0)     // Catch:{ all -> 0x0259 }
            throw r2     // Catch:{ all -> 0x0259 }
        L_0x022f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0259 }
            java.lang.String r2 = "fetchFonts failed (empty result)"
            r0.<init>(r2)     // Catch:{ all -> 0x0259 }
            throw r0     // Catch:{ all -> 0x0259 }
        L_0x0237:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0259 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0259 }
            r4.<init>(r2)     // Catch:{ all -> 0x0259 }
            int r2 = r3.f5806a     // Catch:{ all -> 0x0259 }
            r4.append(r2)     // Catch:{ all -> 0x0259 }
            java.lang.String r2 = ")"
            r4.append(r2)     // Catch:{ all -> 0x0259 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0259 }
            r0.<init>(r2)     // Catch:{ all -> 0x0259 }
            throw r0     // Catch:{ all -> 0x0259 }
        L_0x0250:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0259 }
            java.lang.String r3 = "provider not found"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0259 }
            throw r2     // Catch:{ all -> 0x0259 }
        L_0x0259:
            androidx.emoji.a.i r0 = r1.f6258e
            androidx.emoji.a.a r0 = (androidx.emoji.p108a.C2191a) r0
            androidx.emoji.a.b r0 = r0.f6212a
            androidx.emoji.a.j r0 = r0.f6215c
            r0.mo5517g()
            r16.m6104b()
        L_0x0267:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji.p108a.C2210t.mo5527a():void");
    }
}
