package com.google.android.libraries.assistant.p1363c.p1364a.p1368b.p1369a;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;

/* renamed from: com.google.android.libraries.assistant.c.a.b.a.ac */
/* compiled from: PG */
public final class C16950ac {

    /* renamed from: a */
    static final C62910ar f49527a = C62948a.m95459j(50);

    /* renamed from: d */
    public static final /* synthetic */ int f49528d = 0;

    /* renamed from: b */
    public C16951ad f49529b = C16949ab.f49526a;

    /* renamed from: c */
    public C62910ar f49530c = C62948a.f169987b;

    /* renamed from: e */
    private final C60888db f49531e;

    /* renamed from: f */
    private final C21370a f49532f;

    /* renamed from: g */
    private C60870cx f49533g;

    /* renamed from: h */
    private boolean f49534h;

    public C16950ac(C60888db dbVar, C21370a aVar) {
        this.f49531e = dbVar;
        this.f49532f = aVar;
    }

    /* renamed from: c */
    private final void m34019c() {
        C60870cx cxVar = this.f49533g;
        if (cxVar != null) {
            cxVar.cancel(true);
            this.f49533g = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo23142a() {
        this.f49534h = true;
        m34019c();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x0029=Splitter:B:20:0x0029, B:24:0x004d=Splitter:B:24:0x004d} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo23143b(com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16988l r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.f49534h     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r9)
            return
        L_0x0007:
            com.google.protobuf.ar r0 = r9.f49530c     // Catch:{ all -> 0x0054 }
            com.google.protobuf.ar r1 = com.google.protobuf.p4750c.C62948a.f169987b     // Catch:{ all -> 0x0054 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0054 }
            if (r0 != 0) goto L_0x0052
            int r10 = r10.f49624a     // Catch:{ all -> 0x0054 }
            int r10 = com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16991o.m34084a(r10)     // Catch:{ all -> 0x0054 }
            if (r10 != 0) goto L_0x001a
            goto L_0x004d
        L_0x001a:
            r0 = 7
            if (r10 != r0) goto L_0x004d
            com.google.common.util.concurrent.cx r10 = r9.f49533g     // Catch:{ all -> 0x0054 }
            if (r10 == 0) goto L_0x0029
            boolean r10 = r10.isDone()     // Catch:{ all -> 0x0054 }
            if (r10 != 0) goto L_0x0029
            monitor-exit(r9)
            return
        L_0x0029:
            com.google.android.libraries.assistant.c.a.b.a.ad r10 = r9.f49529b     // Catch:{ all -> 0x0054 }
            p3186j$.util.Objects.requireNonNull(r10)     // Catch:{ all -> 0x0054 }
            com.google.android.libraries.assistant.c.a.b.a.aa r0 = new com.google.android.libraries.assistant.c.a.b.a.aa     // Catch:{ all -> 0x0054 }
            r0.<init>(r10)     // Catch:{ all -> 0x0054 }
            java.lang.Runnable r1 = com.google.apps.tiktok.tracing.C47810es.m84977q(r0)     // Catch:{ all -> 0x0054 }
            r2 = 0
            com.google.protobuf.ar r10 = r9.f49530c     // Catch:{ all -> 0x0054 }
            long r4 = com.google.protobuf.p4750c.C62948a.m95453d(r10)     // Catch:{ all -> 0x0054 }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0054 }
            com.google.android.libraries.f.a r7 = r9.f49532f     // Catch:{ all -> 0x0054 }
            com.google.common.util.concurrent.db r8 = r9.f49531e     // Catch:{ all -> 0x0054 }
            com.google.common.util.concurrent.cx r10 = com.google.common.android.concurrent.C58301z.m89281a(r1, r2, r4, r6, r7, r8)     // Catch:{ all -> 0x0054 }
            r9.f49533g = r10     // Catch:{ all -> 0x0054 }
            monitor-exit(r9)
            return
        L_0x004d:
            r9.m34019c()     // Catch:{ all -> 0x0054 }
            monitor-exit(r9)
            return
        L_0x0052:
            monitor-exit(r9)
            return
        L_0x0054:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.p1363c.p1364a.p1368b.p1369a.C16950ac.mo23143b(com.google.android.libraries.assistant.c.a.c.l):void");
    }
}
