package com.google.android.apps.gsa.speech.p7272e.p7274b;

import android.app.ActivityManager;
import android.content.Context;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.speech.e.b.a */
/* compiled from: PG */
public final class C92239a implements C58881cr {

    /* renamed from: a */
    private static final C59071e f257175a = C59071e.m91332i("com.google.android.apps.gsa.speech.e.b.a");

    /* renamed from: b */
    private final ActivityManager f257176b;

    /* renamed from: c */
    private Integer f257177c;

    public C92239a(Context context) {
        this.f257176b = (ActivityManager) context.getSystemService("activity");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        com.google.common.p4541l.C59337t.m92222b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bf, code lost:
        if (r3 != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r0 = new android.app.ActivityManager.MemoryInfo();
        r8.f257176b.getMemoryInfo(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d3, code lost:
        if (r0.totalMem <= 700000000) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d5, code lost:
        r0 = 100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dc, code lost:
        r0 = 10;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:61:0x0113=Splitter:B:61:0x0113, B:40:0x00bc=Splitter:B:40:0x00bc} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Integer mo6453a() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Integer r0 = r8.f257177c     // Catch:{ all -> 0x011d }
            if (r0 != 0) goto L_0x0119
            com.google.android.apps.gsa.shared.s.a.a r0 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a     // Catch:{ all -> 0x011d }
            java.lang.String r0 = "/proc/cpuinfo"
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x00e7, all -> 0x00e5 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x00e7, all -> 0x00e5 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00e7, all -> 0x00e5 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x00e7, all -> 0x00e5 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x00e7, all -> 0x00e5 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x00e7, all -> 0x00e5 }
        L_0x0019:
            java.lang.String r1 = r2.readLine()     // Catch:{ IOException -> 0x00e3 }
            r3 = 0
            if (r1 == 0) goto L_0x00bc
            java.lang.String r4 = "[ \t]*:[ \t]*"
            r5 = 2
            java.lang.String[] r1 = r1.split(r4, r5)     // Catch:{ IOException -> 0x00e3 }
            if (r1 == 0) goto L_0x0019
            int r4 = r1.length     // Catch:{ IOException -> 0x00e3 }
            if (r4 != r5) goto L_0x0019
            java.lang.String r4 = "Features"
            r5 = r1[r3]     // Catch:{ IOException -> 0x00e3 }
            boolean r4 = r4.equals(r5)     // Catch:{ IOException -> 0x00e3 }
            r5 = 1
            if (r4 == 0) goto L_0x0069
            java.lang.String r4 = "[ \t]"
            com.google.common.base.y r4 = com.google.common.base.C58837ba.m90854c(r4)     // Catch:{ IOException -> 0x00e3 }
            com.google.common.base.cf r4 = com.google.common.base.C58869cf.m90937c(r4)     // Catch:{ IOException -> 0x00e3 }
            r1 = r1[r5]     // Catch:{ IOException -> 0x00e3 }
            java.lang.Iterable r1 = r4.mo56153g(r1)     // Catch:{ IOException -> 0x00e3 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IOException -> 0x00e3 }
        L_0x004b:
            boolean r4 = r1.hasNext()     // Catch:{ IOException -> 0x00e3 }
            if (r4 == 0) goto L_0x00bc
            java.lang.Object r4 = r1.next()     // Catch:{ IOException -> 0x00e3 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x00e3 }
            java.lang.String r6 = "neon"
            boolean r6 = com.google.common.base.C58890d.m90990e(r6, r4)     // Catch:{ IOException -> 0x00e3 }
            if (r6 != 0) goto L_0x0067
            java.lang.String r6 = "asimd"
            boolean r4 = com.google.common.base.C58890d.m90990e(r6, r4)     // Catch:{ IOException -> 0x00e3 }
            if (r4 == 0) goto L_0x004b
        L_0x0067:
            r3 = 1
            goto L_0x00bc
        L_0x0069:
            java.lang.String r4 = "flags"
            r6 = r1[r3]     // Catch:{ IOException -> 0x00e3 }
            boolean r4 = r4.equals(r6)     // Catch:{ IOException -> 0x00e3 }
            if (r4 == 0) goto L_0x0019
            java.lang.String r4 = "[ \t]"
            com.google.common.base.y r4 = com.google.common.base.C58837ba.m90854c(r4)     // Catch:{ IOException -> 0x00e3 }
            com.google.common.base.cf r4 = com.google.common.base.C58869cf.m90937c(r4)     // Catch:{ IOException -> 0x00e3 }
            r1 = r1[r5]     // Catch:{ IOException -> 0x00e3 }
            java.lang.Iterable r1 = r4.mo56153g(r1)     // Catch:{ IOException -> 0x00e3 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IOException -> 0x00e3 }
        L_0x0087:
            boolean r4 = r1.hasNext()     // Catch:{ IOException -> 0x00e3 }
            if (r4 == 0) goto L_0x00bc
            java.lang.Object r4 = r1.next()     // Catch:{ IOException -> 0x00e3 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x00e3 }
            java.lang.String r6 = "sse"
            boolean r6 = com.google.common.base.C58890d.m90990e(r6, r4)     // Catch:{ IOException -> 0x00e3 }
            if (r6 != 0) goto L_0x0067
            java.lang.String r6 = "sse2"
            boolean r6 = com.google.common.base.C58890d.m90990e(r6, r4)     // Catch:{ IOException -> 0x00e3 }
            if (r6 != 0) goto L_0x0067
            java.lang.String r6 = "ssse3"
            boolean r6 = com.google.common.base.C58890d.m90990e(r6, r4)     // Catch:{ IOException -> 0x00e3 }
            if (r6 != 0) goto L_0x0067
            java.lang.String r6 = "sse4_1"
            boolean r6 = com.google.common.base.C58890d.m90990e(r6, r4)     // Catch:{ IOException -> 0x00e3 }
            if (r6 != 0) goto L_0x0067
            java.lang.String r6 = "sse4_2"
            boolean r4 = com.google.common.base.C58890d.m90990e(r6, r4)     // Catch:{ IOException -> 0x00e3 }
            if (r4 == 0) goto L_0x0087
            goto L_0x0067
        L_0x00bc:
            com.google.common.p4541l.C59337t.m92222b(r2)     // Catch:{ all -> 0x0117 }
            if (r3 != 0) goto L_0x00c2
            goto L_0x0109
        L_0x00c2:
            android.app.ActivityManager$MemoryInfo r0 = new android.app.ActivityManager$MemoryInfo     // Catch:{ all -> 0x011d }
            r0.<init>()     // Catch:{ all -> 0x011d }
            android.app.ActivityManager r1 = r8.f257176b     // Catch:{ all -> 0x011d }
            r1.getMemoryInfo(r0)     // Catch:{ all -> 0x011d }
            long r0 = r0.totalMem     // Catch:{ all -> 0x011d }
            r2 = 700000000(0x29b92700, double:3.45845952E-315)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x00dc
            r0 = 100
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x011d }
            goto L_0x010e
        L_0x00dc:
            r0 = 10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x011d }
            goto L_0x010e
        L_0x00e3:
            r1 = move-exception
            goto L_0x00eb
        L_0x00e5:
            r0 = move-exception
            goto L_0x0113
        L_0x00e7:
            r2 = move-exception
            r7 = r2
            r2 = r1
            r1 = r7
        L_0x00eb:
            com.google.common.f.e r3 = f257175a     // Catch:{ all -> 0x0111 }
            com.google.common.f.x r3 = r3.mo56225c()     // Catch:{ all -> 0x0111 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x0111 }
            com.google.common.f.x r1 = r3.mo56382g(r1)     // Catch:{ all -> 0x0111 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0111 }
            r3 = 12278(0x2ff6, float:1.7205E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r3)     // Catch:{ all -> 0x0111 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0111 }
            java.lang.String r3 = "Error reading %s"
            r1.mo56389s(r3, r0)     // Catch:{ all -> 0x0111 }
            com.google.common.p4541l.C59337t.m92222b(r2)     // Catch:{ all -> 0x0117 }
        L_0x0109:
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0117 }
        L_0x010e:
            r8.f257177c = r0     // Catch:{ all -> 0x011d }
            goto L_0x0119
        L_0x0111:
            r0 = move-exception
            r1 = r2
        L_0x0113:
            com.google.common.p4541l.C59337t.m92222b(r1)     // Catch:{ all -> 0x0117 }
            throw r0     // Catch:{ all -> 0x0117 }
        L_0x0117:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x011d }
        L_0x0119:
            java.lang.Integer r0 = r8.f257177c     // Catch:{ all -> 0x011d }
            monitor-exit(r8)
            return r0
        L_0x011d:
            r0 = move-exception
            monitor-exit(r8)
            goto L_0x0121
        L_0x0120:
            throw r0
        L_0x0121:
            goto L_0x0120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.p7272e.p7274b.C92239a.mo6453a():java.lang.Integer");
    }
}
