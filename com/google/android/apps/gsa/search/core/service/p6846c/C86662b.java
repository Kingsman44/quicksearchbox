package com.google.android.apps.gsa.search.core.service.p6846c;

import android.os.StrictMode;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91007g;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C59071e;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.apps.gsa.search.core.service.c.b */
/* compiled from: PG */
public final class C86662b implements C90991b {

    /* renamed from: b */
    private static final C59071e f234116b = C59071e.m91332i("com.google.android.apps.gsa.search.core.service.c.b");

    /* renamed from: a */
    public final Set f234117a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c */
    private final C22871g f234118c;

    public C86662b(C22871g gVar) {
        this.f234118c = gVar;
    }

    /* renamed from: a */
    public final void mo80264a(C91006f fVar) {
        C58485gu j;
        C91018d.m148680c();
        StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
        synchronized (this.f234117a) {
            j = C58485gu.m89842j(this.f234117a);
        }
        C58801sm G = j.listIterator(0);
        while (G.hasNext()) {
            fVar.mo85287n((C91007g) G.next());
        }
    }

    /* renamed from: b */
    public final void mo80265b(C91007g gVar) {
        synchronized (this.f234117a) {
            this.f234117a.add(gVar);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0029 */
    /* renamed from: gS */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17602gS(com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f r6) {
        /*
            r5 = this;
            java.lang.String r0 = "EventBusDumpableReg"
            java.lang.Class<com.google.android.apps.gsa.search.core.service.a.a> r1 = com.google.android.apps.gsa.search.core.service.p6842a.C86593a.class
            boolean r1 = com.google.android.libraries.gsa.p1876k.C22872h.m42744d(r1)
            if (r1 == 0) goto L_0x000e
            r5.mo80264a(r6)
            return
        L_0x000e:
            com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.m148680c()
            com.google.android.libraries.gsa.k.g r1 = r5.f234118c
            com.google.android.apps.gsa.search.core.service.c.a r2 = new com.google.android.apps.gsa.search.core.service.c.a
            r2.<init>(r5, r6)
            java.lang.String r6 = "Dump EventBusDumpables"
            com.google.common.util.concurrent.cx r6 = r1.mo28207g(r6, r2)
            r1 = 0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0071, ExecutionException -> 0x004f, TimeoutException -> 0x0031, CancellationException -> 0x0029 }
            r3 = 3
            com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148473g(r6, r3, r2)     // Catch:{ InterruptedException -> 0x0071, ExecutionException -> 0x004f, TimeoutException -> 0x0031, CancellationException -> 0x0029 }
            return
        L_0x0027:
            r6 = move-exception
            goto L_0x009d
        L_0x0029:
            java.lang.Error r6 = new java.lang.Error     // Catch:{ all -> 0x0027 }
            java.lang.String r0 = "Dumping EventBusDumpables was cancelled unexpectedly."
            r6.<init>(r0)     // Catch:{ all -> 0x0027 }
            throw r6     // Catch:{ all -> 0x0027 }
        L_0x0031:
            r6.cancel(r1)     // Catch:{ all -> 0x0027 }
            com.google.common.f.e r6 = f234116b     // Catch:{ all -> 0x0027 }
            com.google.common.f.x r6 = r6.mo56225c()     // Catch:{ all -> 0x0027 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0027 }
            r6.mo56378ag(r1, r0)     // Catch:{ all -> 0x0027 }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x0027 }
            r0 = 8486(0x2126, float:1.1891E-41)
            com.google.common.f.x r6 = r6.mo56372aa(r0)     // Catch:{ all -> 0x0027 }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x0027 }
            java.lang.String r0 = "Dumping EventBusDumpables timed out."
            r6.mo56386p(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x004f:
            r6 = move-exception
            com.google.common.f.e r1 = f234116b     // Catch:{ all -> 0x0027 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x0027 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0027 }
            r1.mo56378ag(r2, r0)     // Catch:{ all -> 0x0027 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0027 }
            com.google.common.f.x r6 = r1.mo56382g(r6)     // Catch:{ all -> 0x0027 }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x0027 }
            r0 = 8485(0x2125, float:1.189E-41)
            com.google.common.f.x r6 = r6.mo56372aa(r0)     // Catch:{ all -> 0x0027 }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x0027 }
            java.lang.String r0 = "Dumping EventBusDumpables failed."
            r6.mo56386p(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x0071:
            r2 = move-exception
            r6.cancel(r1)     // Catch:{ all -> 0x0027 }
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0027 }
            r6.interrupt()     // Catch:{ all -> 0x0027 }
            com.google.common.f.e r6 = f234116b     // Catch:{ all -> 0x0027 }
            com.google.common.f.x r6 = r6.mo56225c()     // Catch:{ all -> 0x0027 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0027 }
            r6.mo56378ag(r1, r0)     // Catch:{ all -> 0x0027 }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x0027 }
            com.google.common.f.x r6 = r6.mo56382g(r2)     // Catch:{ all -> 0x0027 }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x0027 }
            r0 = 8484(0x2124, float:1.1889E-41)
            com.google.common.f.x r6 = r6.mo56372aa(r0)     // Catch:{ all -> 0x0027 }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x0027 }
            java.lang.String r0 = "Dumping EventBusDumpables was interrupted."
            r6.mo56386p(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x009d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.service.p6846c.C86662b.mo17602gS(com.google.android.apps.gsa.shared.util.debug.a.f):void");
    }
}
