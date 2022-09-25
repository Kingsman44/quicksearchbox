package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.ag */
/* compiled from: PG */
public final /* synthetic */ class C90788ag implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C90790ai f253884a;

    public /* synthetic */ C90788ag(C90790ai aiVar) {
        this.f253884a = aiVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        if (r1 != null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        r0.mo85118c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        r2 = (double) (r0.f253890c.mo26874f() - r1.f253886b);
        java.lang.Double.isNaN(r2);
        r2 = r2 / 1000.0d;
        r0 = r1.f253885a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (android.os.Debug.isDebuggerConnected() == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        r4 = com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90790ai.f253888a.mo56226d();
        r4.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "DeadlockDetectingExr");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(11381)).mo56386p("The EventBus thread appears to be deadlocked.");
        r4 = com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90790ai.f253888a.mo56226d();
        r4.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "DeadlockDetectingExr");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(11382)).mo56360M("Task [%s] on thread (%s - %s) running for %3f seconds", r1.f253887c.mo6453a(), r0.getName(), r0.getState(), java.lang.Double.valueOf(r2));
        r0 = com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90790ai.f253888a.mo56226d();
        r0.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "DeadlockDetectingExr");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(11383)).mo56386p("If you recognize the above task as one paused by a breakpoint, you can safely ignore this error.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c8, code lost:
        throw new com.google.android.apps.gsa.shared.p7127q.C90458e(r0, java.lang.String.format("Task [%s] on thread (%s - %s) running for %3f seconds", new java.lang.Object[]{r1.f253887c.mo6453a(), r0.getName(), r0.getState(), java.lang.Double.valueOf(r2)}));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            com.google.android.apps.gsa.shared.util.c.a.ai r0 = r11.f253884a
            com.google.android.apps.gsa.shared.util.c.a.ah r1 = r0.f253891d
            r2 = 0
            if (r1 == 0) goto L_0x0016
            com.google.android.libraries.f.a r3 = r0.f253890c
            long r3 = r3.mo26874f()
            long r5 = r1.f253886b
            long r3 = r3 - r5
            long r5 = r0.f253889b
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0017
        L_0x0016:
            r1 = r2
        L_0x0017:
            java.lang.Object r2 = r0.f253892e
            monitor-enter(r2)
            int r3 = r0.f253893f     // Catch:{ all -> 0x00c9 }
            r4 = 0
            if (r3 > 0) goto L_0x0023
            r0.f253894g = r4     // Catch:{ all -> 0x00c9 }
            monitor-exit(r2)     // Catch:{ all -> 0x00c9 }
            return
        L_0x0023:
            monitor-exit(r2)     // Catch:{ all -> 0x00c9 }
            if (r1 != 0) goto L_0x002a
            r0.mo85118c()
            return
        L_0x002a:
            com.google.android.libraries.f.a r0 = r0.f253890c
            long r2 = r0.mo26874f()
            long r5 = r1.f253886b
            long r2 = r2 - r5
            double r2 = (double) r2
            r5 = 4652007308841189376(0x408f400000000000, double:1000.0)
            java.lang.Double.isNaN(r2)
            double r2 = r2 / r5
            java.lang.Thread r0 = r1.f253885a
            boolean r5 = android.os.Debug.isDebuggerConnected()
            if (r5 == 0) goto L_0x009d
            com.google.common.f.e r4 = com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90790ai.f253888a
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r6 = "DeadlockDetectingExr"
            r4.mo56378ag(r5, r6)
            java.lang.String r5 = "The EventBus thread appears to be deadlocked."
            r6 = 11381(0x2c75, float:1.5948E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r6)).mo56386p(r5)
            com.google.common.f.e r4 = com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90790ai.f253888a
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r6 = "DeadlockDetectingExr"
            r4.mo56378ag(r5, r6)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            r5 = 11382(0x2c76, float:1.595E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)
            r5 = r4
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            java.lang.String r6 = "Task [%s] on thread (%s - %s) running for %3f seconds"
            com.google.common.base.cr r1 = r1.f253887c
            java.lang.Object r7 = r1.mo6453a()
            java.lang.String r8 = r0.getName()
            java.lang.Thread$State r9 = r0.getState()
            java.lang.Double r10 = java.lang.Double.valueOf(r2)
            r5.mo56360M(r6, r7, r8, r9, r10)
            com.google.common.f.e r0 = com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90790ai.f253888a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "DeadlockDetectingExr"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "If you recognize the above task as one paused by a breakpoint, you can safely ignore this error."
            r2 = 11383(0x2c77, float:1.5951E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            return
        L_0x009d:
            com.google.android.apps.gsa.shared.q.e r5 = new com.google.android.apps.gsa.shared.q.e
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            com.google.common.base.cr r1 = r1.f253887c
            java.lang.Object r1 = r1.mo6453a()
            r6[r4] = r1
            r1 = 1
            java.lang.String r4 = r0.getName()
            r6[r1] = r4
            r1 = 2
            java.lang.Thread$State r4 = r0.getState()
            r6[r1] = r4
            r1 = 3
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r6[r1] = r2
            java.lang.String r1 = "Task [%s] on thread (%s - %s) running for %3f seconds"
            java.lang.String r1 = java.lang.String.format(r1, r6)
            r5.<init>(r0, r1)
            throw r5
        L_0x00c9:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00c9 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90788ag.run():void");
    }
}
