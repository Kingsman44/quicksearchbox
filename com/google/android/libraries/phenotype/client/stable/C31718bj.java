package com.google.android.libraries.phenotype.client.stable;

import android.content.Context;
import com.google.android.libraries.phenotype.client.C31760t;
import com.google.android.libraries.phenotype.client.p2421b.C31660a;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.libraries.phenotype.client.stable.bj */
/* compiled from: PG */
public final class C31718bj implements C58881cr {

    /* renamed from: a */
    public static final /* synthetic */ int f85276a = 0;

    /* renamed from: b */
    private static volatile C31660a f85277b = new C31660a(C31717bi.f85275a);

    /* renamed from: c */
    private final String f85278c;

    /* renamed from: d */
    private final String f85279d;

    /* renamed from: e */
    private final Object f85280e;

    /* renamed from: f */
    private final C31754u f85281f;

    /* renamed from: g */
    private volatile C31694am f85282g;

    /* renamed from: h */
    private volatile int f85283h = -1;

    /* renamed from: i */
    private volatile Object f85284i;

    public C31718bj(String str, String str2, Object obj, C31754u uVar) {
        obj.getClass();
        this.f85278c = str;
        this.f85279d = str2;
        this.f85280e = obj;
        this.f85281f = uVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        return mo37337c(C31760t.m59098a());
    }

    /* renamed from: b */
    public final Object mo37336b(Context context) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        return mo37337c(C31760t.m59099b(applicationContext));
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0105  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo37337c(com.google.android.libraries.phenotype.client.C31760t r8) {
        /*
            r7 = this;
            int r0 = r7.f85283h
            java.lang.Object r1 = r7.f85284i
            com.google.android.libraries.phenotype.client.stable.am r2 = r7.f85282g
            if (r2 == 0) goto L_0x0014
            com.google.android.libraries.phenotype.client.stable.am r2 = r7.f85282g
            java.util.concurrent.atomic.AtomicInteger r2 = r2.f85228a
            int r2 = r2.get()
            if (r0 < r2) goto L_0x0014
            if (r1 != 0) goto L_0x010c
        L_0x0014:
            monitor-enter(r7)
            com.google.android.libraries.phenotype.client.stable.am r0 = r7.f85282g     // Catch:{ all -> 0x010d }
            if (r0 != 0) goto L_0x002a
            com.google.android.libraries.phenotype.client.stable.u r0 = r7.f85281f     // Catch:{ all -> 0x010d }
            java.lang.String r1 = r7.f85278c     // Catch:{ all -> 0x010d }
            com.google.android.libraries.phenotype.client.C31760t.m59103j()     // Catch:{ all -> 0x010d }
            com.google.android.libraries.phenotype.client.stable.j r0 = (com.google.android.libraries.phenotype.client.stable.C31743j) r0     // Catch:{ all -> 0x010d }
            com.google.android.libraries.phenotype.client.stable.aa r0 = r0.mo37353a(r8, r1)     // Catch:{ all -> 0x010d }
            com.google.android.libraries.phenotype.client.stable.am r0 = r0.f85198f     // Catch:{ all -> 0x010d }
            r7.f85282g = r0     // Catch:{ all -> 0x010d }
        L_0x002a:
            int r0 = r7.f85283h     // Catch:{ all -> 0x010d }
            com.google.android.libraries.phenotype.client.stable.am r1 = r7.f85282g     // Catch:{ all -> 0x010d }
            java.util.concurrent.atomic.AtomicInteger r1 = r1.f85228a     // Catch:{ all -> 0x010d }
            int r1 = r1.get()     // Catch:{ all -> 0x010d }
            if (r0 >= r1) goto L_0x0109
            com.google.android.libraries.phenotype.client.stable.am r0 = r7.f85282g     // Catch:{ all -> 0x010d }
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f85228a     // Catch:{ all -> 0x010d }
            int r0 = r0.get()     // Catch:{ all -> 0x010d }
            r7.f85283h = r0     // Catch:{ all -> 0x010d }
            com.google.android.libraries.phenotype.client.C31760t.m59103j()     // Catch:{ all -> 0x010d }
            com.google.android.libraries.phenotype.client.stable.u r0 = r7.f85281f     // Catch:{ all -> 0x010d }
            java.lang.String r1 = r7.f85278c     // Catch:{ all -> 0x010d }
            java.lang.String r2 = r7.f85279d     // Catch:{ all -> 0x010d }
            r3 = r0
            com.google.android.libraries.phenotype.client.stable.j r3 = (com.google.android.libraries.phenotype.client.stable.C31743j) r3     // Catch:{ all -> 0x010d }
            boolean r3 = r3.f85331b     // Catch:{ all -> 0x010d }
            if (r3 == 0) goto L_0x0057
            android.content.Context r3 = r8.f85364a     // Catch:{ all -> 0x010d }
            java.lang.String r3 = com.google.android.libraries.phenotype.client.C31676o.m59022d(r3, r1)     // Catch:{ all -> 0x010d }
            goto L_0x0058
        L_0x0057:
            r3 = r1
        L_0x0058:
            com.google.common.util.concurrent.db r4 = r8.mo37368h()     // Catch:{ all -> 0x010d }
            com.google.android.libraries.phenotype.client.stable.i r5 = new com.google.android.libraries.phenotype.client.stable.i     // Catch:{ all -> 0x010d }
            r5.<init>(r8, r3)     // Catch:{ all -> 0x010d }
            com.google.common.util.concurrent.cx r4 = r4.mo19398a(r5)     // Catch:{ all -> 0x010d }
            com.google.android.libraries.phenotype.client.stable.C31703av.m59037a(r4)     // Catch:{ all -> 0x010d }
            r4 = r0
            com.google.android.libraries.phenotype.client.stable.j r4 = (com.google.android.libraries.phenotype.client.stable.C31743j) r4     // Catch:{ all -> 0x010d }
            com.google.android.libraries.phenotype.client.stable.aa r3 = r4.mo37353a(r8, r3)     // Catch:{ all -> 0x010d }
            com.google.android.libraries.phenotype.client.stable.bh r3 = r3.f85197e     // Catch:{ all -> 0x010d }
            java.util.Map r4 = r3.f85273b     // Catch:{ all -> 0x010d }
            r5 = 0
            if (r4 != 0) goto L_0x0097
            java.lang.Object r4 = r3.f85272a     // Catch:{ all -> 0x010d }
            monitor-enter(r4)     // Catch:{ all -> 0x010d }
            java.util.Map r6 = r3.f85273b     // Catch:{ all -> 0x0094 }
            if (r6 != 0) goto L_0x008e
            com.google.common.base.cr r6 = r3.f85274c     // Catch:{ all -> 0x0094 }
            com.google.android.libraries.phenotype.client.stable.v r6 = (com.google.android.libraries.phenotype.client.stable.C31755v) r6     // Catch:{ all -> 0x0094 }
            com.google.android.libraries.phenotype.client.stable.aa r6 = r6.f85351a     // Catch:{ all -> 0x0094 }
            java.util.Map r6 = r6.mo37321b()     // Catch:{ all -> 0x0094 }
            r6.getClass()
            r3.f85273b = r6     // Catch:{ all -> 0x0094 }
            r3.f85274c = r5     // Catch:{ all -> 0x0094 }
        L_0x008e:
            java.lang.Object r3 = r6.get(r2)     // Catch:{ all -> 0x0094 }
            monitor-exit(r4)     // Catch:{ all -> 0x0094 }
            goto L_0x009b
        L_0x0094:
            r8 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0094 }
            throw r8     // Catch:{ all -> 0x010d }
        L_0x0097:
            java.lang.Object r3 = r4.get(r2)     // Catch:{ all -> 0x010d }
        L_0x009b:
            if (r3 != 0) goto L_0x009f
        L_0x009d:
            r3 = r5
            goto L_0x00b8
        L_0x009f:
            r4 = r0
            com.google.android.libraries.phenotype.client.stable.j r4 = (com.google.android.libraries.phenotype.client.stable.C31743j) r4     // Catch:{ ClassCastException -> 0x00ab, IOException -> 0x00a9 }
            com.google.android.libraries.phenotype.client.stable.bs r4 = r4.f85334e     // Catch:{ ClassCastException -> 0x00ab, IOException -> 0x00a9 }
            java.lang.Object r3 = r4.mo37338a(r3)     // Catch:{ ClassCastException -> 0x00ab, IOException -> 0x00a9 }
            goto L_0x00b8
        L_0x00a9:
            r3 = move-exception
            goto L_0x00ac
        L_0x00ab:
            r3 = move-exception
        L_0x00ac:
            java.lang.String r4 = "PhenotypeCombinedFlags"
            java.lang.String r6 = "Invalid Phenotype flag value for flag "
            java.lang.String r6 = r6.concat(r2)     // Catch:{ all -> 0x010d }
            android.util.Log.e(r4, r6, r3)     // Catch:{ all -> 0x010d }
            goto L_0x009d
        L_0x00b8:
            android.content.Context r8 = r8.f85364a     // Catch:{ all -> 0x010d }
            com.google.common.base.ax r4 = com.google.android.libraries.phenotype.client.stable.C31743j.f85330a     // Catch:{ all -> 0x010d }
            if (r4 != 0) goto L_0x00d3
            java.lang.Class<com.google.android.libraries.phenotype.client.stable.j> r4 = com.google.android.libraries.phenotype.client.stable.C31743j.class
            monitor-enter(r4)     // Catch:{ all -> 0x010d }
            com.google.common.base.ax r6 = com.google.android.libraries.phenotype.client.stable.C31743j.f85330a     // Catch:{ all -> 0x00d0 }
            if (r6 != 0) goto L_0x00cb
            com.google.common.base.ax r8 = com.google.android.libraries.phenotype.client.C31674m.m59018a(r8)     // Catch:{ all -> 0x00d0 }
            com.google.android.libraries.phenotype.client.stable.C31743j.f85330a = r8     // Catch:{ all -> 0x00d0 }
        L_0x00cb:
            com.google.common.base.ax r8 = com.google.android.libraries.phenotype.client.stable.C31743j.f85330a     // Catch:{ all -> 0x00d0 }
            monitor-exit(r4)     // Catch:{ all -> 0x00d0 }
            r4 = r8
            goto L_0x00d3
        L_0x00d0:
            r8 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00d0 }
            throw r8     // Catch:{ all -> 0x010d }
        L_0x00d3:
            boolean r8 = r4.mo56113h()     // Catch:{ all -> 0x010d }
            if (r8 == 0) goto L_0x0102
            java.lang.Object r8 = r4.mo56107c()     // Catch:{ all -> 0x010d }
            com.google.android.libraries.phenotype.client.f r8 = (com.google.android.libraries.phenotype.client.C31667f) r8     // Catch:{ all -> 0x010d }
            android.net.Uri r1 = com.google.android.libraries.phenotype.client.C31676o.m59019a(r1)     // Catch:{ all -> 0x010d }
            java.lang.String r8 = r8.mo37313a(r1, r5, r5, r2)     // Catch:{ all -> 0x010d }
            if (r8 != 0) goto L_0x00ea
            goto L_0x0103
        L_0x00ea:
            com.google.android.libraries.phenotype.client.stable.j r0 = (com.google.android.libraries.phenotype.client.stable.C31743j) r0     // Catch:{ IllegalArgumentException -> 0x00f5, IOException -> 0x00f3 }
            com.google.android.libraries.phenotype.client.stable.bs r0 = r0.f85333d     // Catch:{ IllegalArgumentException -> 0x00f5, IOException -> 0x00f3 }
            java.lang.Object r5 = r0.mo37338a(r8)     // Catch:{ IllegalArgumentException -> 0x00f5, IOException -> 0x00f3 }
            goto L_0x0103
        L_0x00f3:
            r8 = move-exception
            goto L_0x00f6
        L_0x00f5:
            r8 = move-exception
        L_0x00f6:
            java.lang.String r0 = "PhenotypeCombinedFlags"
            java.lang.String r1 = "Invalid Phenotype flag value for flag "
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x010d }
            android.util.Log.e(r0, r1, r8)     // Catch:{ all -> 0x010d }
            goto L_0x0103
        L_0x0102:
            r5 = r3
        L_0x0103:
            if (r5 != 0) goto L_0x0107
            java.lang.Object r5 = r7.f85280e     // Catch:{ all -> 0x010d }
        L_0x0107:
            r7.f85284i = r5     // Catch:{ all -> 0x010d }
        L_0x0109:
            java.lang.Object r1 = r7.f85284i     // Catch:{ all -> 0x010d }
            monitor-exit(r7)     // Catch:{ all -> 0x010d }
        L_0x010c:
            return r1
        L_0x010d:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x010d }
            goto L_0x0111
        L_0x0110:
            throw r8
        L_0x0111:
            goto L_0x0110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.phenotype.client.stable.C31718bj.mo37337c(com.google.android.libraries.phenotype.client.t):java.lang.Object");
    }
}
