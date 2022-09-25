package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.search.core.p6513aj.C84551k;
import com.google.android.apps.gsa.shared.util.C90723ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;

/* renamed from: com.google.android.apps.gsa.search.core.p.t */
/* compiled from: PG */
final class C86265t extends C90888av {

    /* renamed from: a */
    private final C90723ag f233190a;

    /* renamed from: b */
    private final int f233191b;

    /* renamed from: c */
    private final C84551k f233192c;

    public C86265t(C90723ag agVar, int i, C84551k kVar) {
        super("AsyncHttpResponse", 1, 12);
        this.f233190a = agVar;
        this.f233191b = i;
        this.f233192c = kVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0061, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0063, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r0.mo78285g(new com.google.android.apps.gsa.shared.p7127q.C90457d((java.lang.Throwable) r3, (int) com.google.android.apps.gsa.shared.logger.p7054d.C89885b.GWS_READ_RAW_STREAM_VALUE));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006f, code lost:
        com.google.common.p4541l.C59337t.m92221a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0072, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r0.mo78285g(new com.google.android.apps.gsa.shared.p7127q.C90457d((java.lang.Throwable) r1, (int) com.google.android.apps.gsa.shared.logger.p7054d.C89885b.GWS_FETCH_INTERRUPTED_VALUE));
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0085, code lost:
        com.google.common.p4541l.C59337t.m92221a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0088, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0061 A[ExcHandler: Exception (r3v1 'e' java.lang.Exception A[CUSTOM_DECLARE]), PHI: r2 
      PHI: (r2v3 java.io.InputStream) = (r2v0 java.io.InputStream), (r2v5 java.io.InputStream), (r2v5 java.io.InputStream), (r2v5 java.io.InputStream) binds: [B:1:0x000b, B:21:0x0038, B:7:0x001d, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x000b] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0063 A[ExcHandler: InterruptedException (r1v3 'e' java.lang.InterruptedException A[CUSTOM_DECLARE]), PHI: r2 
      PHI: (r2v2 java.io.InputStream) = (r2v0 java.io.InputStream), (r2v5 java.io.InputStream), (r2v5 java.io.InputStream), (r2v5 java.io.InputStream) binds: [B:1:0x000b, B:21:0x0038, B:7:0x001d, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x000b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.google.android.apps.gsa.search.core.p.ai r0 = new com.google.android.apps.gsa.search.core.p.ai
            com.google.android.apps.gsa.search.core.aj.k r1 = r7.f233192c
            r0.<init>(r1)
            r1 = 196623(0x3000f, float:2.75528E-40)
            r2 = 0
            com.google.android.apps.gsa.shared.util.ag r3 = r7.f233190a     // Catch:{ b -> 0x0065, InterruptedException -> 0x0063, Exception -> 0x0061 }
            com.google.android.apps.gsa.search.core.p.q r3 = (com.google.android.apps.gsa.search.core.p6816p.C86262q) r3     // Catch:{ b -> 0x0065, InterruptedException -> 0x0063, Exception -> 0x0061 }
            java.io.InputStream r2 = r3.mo79589b()     // Catch:{ b -> 0x0065, InterruptedException -> 0x0063, Exception -> 0x0061 }
        L_0x0013:
            int r3 = r7.f233191b     // Catch:{ b -> 0x0065, InterruptedException -> 0x0063, Exception -> 0x0061 }
            byte[] r3 = new byte[r3]     // Catch:{ b -> 0x0065, InterruptedException -> 0x0063, Exception -> 0x0061 }
            r4 = 0
        L_0x0018:
            int r5 = r7.f233191b     // Catch:{ b -> 0x0065, InterruptedException -> 0x0063, Exception -> 0x0061 }
            if (r4 >= r5) goto L_0x002f
            int r5 = r5 - r4
            int r5 = r2.read(r3, r4, r5)     // Catch:{ b -> 0x002d, IOException -> 0x0026, InterruptedException -> 0x0063, Exception -> 0x0061 }
            if (r5 >= 0) goto L_0x0024
            goto L_0x002f
        L_0x0024:
            int r4 = r4 + r5
            goto L_0x0018
        L_0x0026:
            r3 = move-exception
            com.google.android.apps.gsa.shared.q.d r4 = new com.google.android.apps.gsa.shared.q.d     // Catch:{ b -> 0x0065, InterruptedException -> 0x0063, Exception -> 0x0061 }
            r4.<init>((java.lang.Throwable) r3, (int) r1)     // Catch:{ b -> 0x0065, InterruptedException -> 0x0063, Exception -> 0x0061 }
            throw r4     // Catch:{ b -> 0x0065, InterruptedException -> 0x0063, Exception -> 0x0061 }
        L_0x002d:
            r3 = move-exception
            throw r3     // Catch:{ b -> 0x0065, InterruptedException -> 0x0063, Exception -> 0x0061 }
        L_0x002f:
            if (r4 != 0) goto L_0x0038
            r0.mo78283e()     // Catch:{ b -> 0x0065, InterruptedException -> 0x0063, Exception -> 0x0061 }
            com.google.common.p4541l.C59337t.m92221a(r2)
            return
        L_0x0038:
            java.util.concurrent.atomic.AtomicInteger r5 = r0.f232936a     // Catch:{ b -> 0x0065, InterruptedException -> 0x0063, Exception -> 0x0061 }
            int r5 = r5.getAndIncrement()     // Catch:{ b -> 0x0065, InterruptedException -> 0x0063, Exception -> 0x0061 }
            com.google.android.apps.gsa.search.core.aj.h r6 = new com.google.android.apps.gsa.search.core.aj.h     // Catch:{ b -> 0x0065, InterruptedException -> 0x0063, Exception -> 0x0061 }
            r6.<init>(r3, r4, r5)     // Catch:{ b -> 0x0065, InterruptedException -> 0x0063, Exception -> 0x0061 }
            boolean r3 = r0.mo78284f(r6)     // Catch:{ b -> 0x0065, InterruptedException -> 0x0063, Exception -> 0x0061 }
            if (r3 == 0) goto L_0x0056
            boolean r3 = java.lang.Thread.interrupted()     // Catch:{ b -> 0x0065, InterruptedException -> 0x0063, Exception -> 0x0061 }
            if (r3 != 0) goto L_0x0050
            goto L_0x0013
        L_0x0050:
            java.lang.InterruptedException r3 = new java.lang.InterruptedException     // Catch:{ b -> 0x0065, InterruptedException -> 0x0063, Exception -> 0x0061 }
            r3.<init>()     // Catch:{ b -> 0x0065, InterruptedException -> 0x0063, Exception -> 0x0061 }
            throw r3     // Catch:{ b -> 0x0065, InterruptedException -> 0x0063, Exception -> 0x0061 }
        L_0x0056:
            com.google.android.apps.gsa.shared.q.d r3 = new com.google.android.apps.gsa.shared.q.d     // Catch:{ b -> 0x0065, InterruptedException -> 0x0063, Exception -> 0x0061 }
            r4 = 196617(0x30009, float:2.75519E-40)
            r3.<init>(r4)     // Catch:{ b -> 0x0065, InterruptedException -> 0x0063, Exception -> 0x0061 }
            throw r3     // Catch:{ b -> 0x0065, InterruptedException -> 0x0063, Exception -> 0x0061 }
        L_0x005f:
            r0 = move-exception
            goto L_0x0090
        L_0x0061:
            r3 = move-exception
            goto L_0x0067
        L_0x0063:
            r1 = move-exception
            goto L_0x0073
        L_0x0065:
            r1 = move-exception
            goto L_0x0089
        L_0x0067:
            com.google.android.apps.gsa.shared.q.d r4 = new com.google.android.apps.gsa.shared.q.d     // Catch:{ all -> 0x005f }
            r4.<init>((java.lang.Throwable) r3, (int) r1)     // Catch:{ all -> 0x005f }
            r0.mo78285g(r4)     // Catch:{ all -> 0x005f }
            com.google.common.p4541l.C59337t.m92221a(r2)
            return
        L_0x0073:
            com.google.android.apps.gsa.shared.q.d r3 = new com.google.android.apps.gsa.shared.q.d     // Catch:{ all -> 0x005f }
            r4 = 196609(0x30001, float:2.75508E-40)
            r3.<init>((java.lang.Throwable) r1, (int) r4)     // Catch:{ all -> 0x005f }
            r0.mo78285g(r3)     // Catch:{ all -> 0x005f }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x005f }
            r0.interrupt()     // Catch:{ all -> 0x005f }
            com.google.common.p4541l.C59337t.m92221a(r2)
            return
        L_0x0089:
            r0.mo78285g(r1)     // Catch:{ all -> 0x005f }
            com.google.common.p4541l.C59337t.m92221a(r2)
            return
        L_0x0090:
            com.google.common.p4541l.C59337t.m92221a(r2)
            goto L_0x0095
        L_0x0094:
            throw r0
        L_0x0095:
            goto L_0x0094
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6816p.C86265t.run():void");
    }
}
