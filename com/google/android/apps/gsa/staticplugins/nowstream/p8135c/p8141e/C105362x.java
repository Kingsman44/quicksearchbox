package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8141e;

import com.google.android.apps.gsa.sidekick.main.p7204g.C91391c;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91396h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C8142xb;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.e.x */
/* compiled from: PG */
public final class C105362x extends C105363y {

    /* renamed from: a */
    private static final C59071e f293969a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowstream.c.e.x");

    /* renamed from: i */
    private final boolean f293970i;

    /* renamed from: j */
    private final C7642eo f293971j;

    public C105362x(C7642eo eoVar, C91391c cVar, C8142xb xbVar, C22871g gVar, C22871g gVar2, boolean z, C105359u uVar) {
        super("RefreshNowControllerTask", cVar, xbVar, gVar, gVar2, uVar);
        this.f293971j = eoVar;
        this.f293970i = z;
    }

    /* renamed from: c */
    private final C91396h m175034c() {
        try {
            return mo94760f(false, this.f293971j, (C7669fo) null, 3);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        r7 = ((com.google.android.apps.gsa.sidekick.main.p7204g.C91400l) r7).f254980a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        if (r7 == 1) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        if (r7 != 7) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
        r5 = m175034c();
        r1 = f293969a.mo56225c();
        r1.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "RefreshNowControllerTsk");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r6)).mo56372aa(22310)).mo56386p("The request was throttled or blocked.");
        r1 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
        r1 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
        r1 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008e, code lost:
        r5 = m175034c();
        r6 = f293969a.mo56225c();
        r6.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "RefreshNowControllerTsk");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56382g(r2)).mo56372aa(22307)).mo56386p("Failed to access data from EntryProvider.");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c A[ExcHandler: InterruptedException | TimeoutException (r2v10 'e' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r3 
      PHI: (r3v3 long) = (r3v0 long), (r3v0 long), (r3v0 long), (r3v5 long) binds: [B:5:0x000c, B:6:?, B:7:0x0024, B:8:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x000c] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8141e.C105361w mo94733b() {
        /*
            r9 = this;
            java.lang.String r0 = "RefreshNowControllerTsk"
            boolean r1 = r9.f293970i
            r2 = 1
            if (r2 == r1) goto L_0x0009
            r1 = 2
            goto L_0x000a
        L_0x0009:
            r1 = 5
        L_0x000a:
            r3 = 0
            com.google.android.apps.gsa.sidekick.main.g.c r5 = r9.f293963c     // Catch:{ InterruptedException -> 0x003e, TimeoutException -> 0x003c, ExecutionException -> 0x0040 }
            com.google.ai.b.eo r6 = r9.f293971j     // Catch:{ InterruptedException -> 0x003e, TimeoutException -> 0x003c, ExecutionException -> 0x0040 }
            com.google.common.util.concurrent.cx r5 = r5.mo85725a(r6)     // Catch:{ InterruptedException -> 0x003e, TimeoutException -> 0x003c, ExecutionException -> 0x0040 }
            com.google.ai.b.eo r6 = r9.f293971j     // Catch:{ InterruptedException -> 0x003e, TimeoutException -> 0x003c, ExecutionException -> 0x0040 }
            com.google.common.util.concurrent.cx r5 = r9.mo94758d(r5, r6)     // Catch:{ InterruptedException -> 0x003e, TimeoutException -> 0x003c, ExecutionException -> 0x0040 }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x003e, TimeoutException -> 0x003c, ExecutionException -> 0x0040 }
            r7 = 20
            java.lang.Object r5 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148473g(r5, r7, r6)     // Catch:{ InterruptedException -> 0x003e, TimeoutException -> 0x003c, ExecutionException -> 0x0040 }
            com.google.android.apps.gsa.sidekick.main.g.h r5 = (com.google.android.apps.gsa.sidekick.main.p7204g.C91396h) r5     // Catch:{ InterruptedException -> 0x003e, TimeoutException -> 0x003c, ExecutionException -> 0x0040 }
            com.google.android.apps.gsa.sidekick.main.g.c r6 = r9.f293963c     // Catch:{ InterruptedException -> 0x003e, TimeoutException -> 0x003c, ExecutionException -> 0x003a }
            com.google.common.util.concurrent.cx r6 = r6.mo85726b()     // Catch:{ InterruptedException -> 0x003e, TimeoutException -> 0x003c, ExecutionException -> 0x003a }
            java.lang.Object r6 = com.google.common.util.concurrent.C60856cj.m92910s(r6)     // Catch:{ InterruptedException -> 0x003e, TimeoutException -> 0x003c, ExecutionException -> 0x003a }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ InterruptedException -> 0x003e, TimeoutException -> 0x003c, ExecutionException -> 0x003a }
            long r3 = r6.longValue()     // Catch:{ InterruptedException -> 0x003e, TimeoutException -> 0x003c, ExecutionException -> 0x003a }
            com.google.android.apps.gsa.staticplugins.nowstream.c.e.c r6 = new com.google.android.apps.gsa.staticplugins.nowstream.c.e.c     // Catch:{ InterruptedException -> 0x003e, TimeoutException -> 0x003c, ExecutionException -> 0x003a }
            r6.<init>(r5, r3, r2)     // Catch:{ InterruptedException -> 0x003e, TimeoutException -> 0x003c, ExecutionException -> 0x003a }
            return r6
        L_0x003a:
            r6 = move-exception
            goto L_0x0043
        L_0x003c:
            r2 = move-exception
            goto L_0x008e
        L_0x003e:
            r2 = move-exception
            goto L_0x008e
        L_0x0040:
            r5 = move-exception
            r6 = r5
            r5 = 0
        L_0x0043:
            java.lang.Throwable r7 = r6.getCause()
            boolean r8 = r7 instanceof com.google.android.apps.gsa.sidekick.main.p7204g.C91400l
            if (r8 == 0) goto L_0x007b
            com.google.android.apps.gsa.sidekick.main.g.l r7 = (com.google.android.apps.gsa.sidekick.main.p7204g.C91400l) r7
            int r7 = r7.f254980a
            r8 = 3
            if (r7 == r2) goto L_0x007a
            if (r7 == r8) goto L_0x007a
            r2 = 7
            if (r7 == r2) goto L_0x0078
            r2 = 10
            if (r7 == r2) goto L_0x0060
            r2 = 11
            if (r7 == r2) goto L_0x0060
            goto L_0x007b
        L_0x0060:
            com.google.android.apps.gsa.sidekick.main.g.h r5 = r9.m175034c()
            com.google.common.f.e r1 = f293969a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r0)
            java.lang.String r2 = "The request was throttled or blocked."
            r7 = 22310(0x5726, float:3.1263E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r6)).mo56372aa(r7)).mo56386p(r2)
            r1 = 6
            goto L_0x007b
        L_0x0078:
            r1 = 4
            goto L_0x007b
        L_0x007a:
            r1 = 3
        L_0x007b:
            com.google.common.f.e r2 = f293969a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r7, r0)
            java.lang.String r7 = "Failed to access data from EntryProvider. ExecutionException."
            r8 = 22309(0x5725, float:3.1262E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r6)).mo56372aa(r8)).mo56386p(r7)
            goto L_0x00a4
        L_0x008e:
            com.google.android.apps.gsa.sidekick.main.g.h r5 = r9.m175034c()
            com.google.common.f.e r6 = f293969a
            com.google.common.f.x r6 = r6.mo56225c()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r7, r0)
            java.lang.String r7 = "Failed to access data from EntryProvider."
            r8 = 22307(0x5723, float:3.1259E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56382g(r2)).mo56372aa(r8)).mo56386p(r7)
        L_0x00a4:
            com.google.common.f.e r2 = f293969a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r6, r0)
            java.lang.String r0 = "Could not complete scheduled request to refresh entries"
            r6 = 22308(0x5724, float:3.126E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r6)).mo56386p(r0)
            com.google.android.apps.gsa.staticplugins.nowstream.c.e.c r0 = new com.google.android.apps.gsa.staticplugins.nowstream.c.e.c
            r0.<init>(r5, r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8141e.C105362x.mo94733b():com.google.android.apps.gsa.staticplugins.nowstream.c.e.w");
    }
}
