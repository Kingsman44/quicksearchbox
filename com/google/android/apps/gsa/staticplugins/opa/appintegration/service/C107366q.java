package com.google.android.apps.gsa.staticplugins.opa.appintegration.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.service.q */
/* compiled from: PG */
final class C107366q implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C107367r f298814a;

    public C107366q(C107367r rVar) {
        this.f298814a = rVar;
    }

    /* renamed from: a */
    private final C58485gu m178267a() {
        C58485gu j;
        synchronized (this.f298814a.f298817c) {
            j = C58485gu.m89842j(this.f298814a.f298819e);
            this.f298814a.f298819e.clear();
        }
        return j;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void onServiceConnected(android.content.ComponentName r5, android.os.IBinder r6) {
        /*
            r4 = this;
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5 = 0
            if (r6 != 0) goto L_0x0007
            r0 = r5
            goto L_0x0019
        L_0x0007:
            java.lang.String r0 = "com.google.android.apps.gsa.publicsearch.IPublicSearchService"
            android.os.IInterface r0 = r6.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.apps.gsa.publicsearch.C84205e
            if (r1 == 0) goto L_0x0014
            com.google.android.apps.gsa.publicsearch.e r0 = (com.google.android.apps.gsa.publicsearch.C84205e) r0
            goto L_0x0019
        L_0x0014:
            com.google.android.apps.gsa.publicsearch.c r0 = new com.google.android.apps.gsa.publicsearch.c
            r0.<init>(r6)
        L_0x0019:
            com.google.android.apps.gsa.staticplugins.opa.appintegration.service.r r6 = r4.f298814a
            java.lang.Object r6 = r6.f298818d
            monitor-enter(r6)
            java.lang.String r1 = "opa_app_integration"
            android.os.IBinder r0 = r0.mo77677e(r1, r5, r5)     // Catch:{ RemoteException -> 0x010c }
            if (r0 != 0) goto L_0x007f
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.opa.appintegration.service.C107367r.f298815a     // Catch:{ RemoteException -> 0x010c }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ RemoteException -> 0x010c }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RemoteException -> 0x010c }
            java.lang.String r2 = "PSSDataSender"
            r0.mo56378ag(r1, r2)     // Catch:{ RemoteException -> 0x010c }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ RemoteException -> 0x010c }
            r1 = 23751(0x5cc7, float:3.3282E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ RemoteException -> 0x010c }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ RemoteException -> 0x010c }
            java.lang.String r1 = "binder is null"
            r0.mo56386p(r1)     // Catch:{ RemoteException -> 0x010c }
            com.google.android.apps.gsa.staticplugins.opa.appintegration.service.r r0 = r4.f298814a     // Catch:{ RemoteException -> 0x010c }
            com.google.android.apps.gsa.staticplugins.opa.appintegration.service.q r1 = r0.f298820f     // Catch:{ RemoteException -> 0x010c }
            if (r1 == 0) goto L_0x0051
            android.content.Context r0 = r0.f298816b     // Catch:{ RemoteException -> 0x010c }
            r0.unbindService(r1)     // Catch:{ RemoteException -> 0x010c }
            com.google.android.apps.gsa.staticplugins.opa.appintegration.service.r r0 = r4.f298814a     // Catch:{ RemoteException -> 0x010c }
            r0.f298820f = r5     // Catch:{ RemoteException -> 0x010c }
        L_0x0051:
            com.google.android.apps.gsa.staticplugins.opa.appintegration.service.r r0 = r4.f298814a     // Catch:{ all -> 0x0186 }
            com.google.android.apps.gsa.staticplugins.opa.appintegration.service.q r1 = r0.f298820f     // Catch:{ all -> 0x0186 }
            if (r1 == 0) goto L_0x0061
            android.content.Context r0 = r0.f298816b     // Catch:{ all -> 0x0186 }
            r0.unbindService(r1)     // Catch:{ all -> 0x0186 }
            com.google.android.apps.gsa.staticplugins.opa.appintegration.service.r r0 = r4.f298814a     // Catch:{ all -> 0x0186 }
            r0.f298820f = r5     // Catch:{ all -> 0x0186 }
            goto L_0x007d
        L_0x0061:
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.opa.appintegration.service.C107367r.f298815a     // Catch:{ all -> 0x0186 }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ all -> 0x0186 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0186 }
            java.lang.String r1 = "PSSDataSender"
            r5.mo56378ag(r0, r1)     // Catch:{ all -> 0x0186 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0186 }
            r0 = 23752(0x5cc8, float:3.3284E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r0)     // Catch:{ all -> 0x0186 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0186 }
            java.lang.String r0 = "connection must not be null"
            r5.mo56386p(r0)     // Catch:{ all -> 0x0186 }
        L_0x007d:
            monitor-exit(r6)     // Catch:{ all -> 0x0186 }
            return
        L_0x007f:
            java.lang.String r1 = "com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSession"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x010c }
            boolean r2 = r1 instanceof com.google.android.libraries.assistant.p1467d.p1472c.p1473a.C17846i     // Catch:{ RemoteException -> 0x010c }
            if (r2 == 0) goto L_0x008c
            com.google.android.libraries.assistant.d.c.a.i r1 = (com.google.android.libraries.assistant.p1467d.p1472c.p1473a.C17846i) r1     // Catch:{ RemoteException -> 0x010c }
            goto L_0x0091
        L_0x008c:
            com.google.android.libraries.assistant.d.c.a.g r1 = new com.google.android.libraries.assistant.d.c.a.g     // Catch:{ RemoteException -> 0x010c }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x010c }
        L_0x0091:
            com.google.android.apps.gsa.staticplugins.opa.appintegration.service.r r0 = r4.f298814a     // Catch:{ RemoteException -> 0x010c }
            java.lang.Object r0 = r0.f298817c     // Catch:{ RemoteException -> 0x010c }
            monitor-enter(r0)     // Catch:{ RemoteException -> 0x010c }
            com.google.android.apps.gsa.staticplugins.opa.appintegration.service.r r2 = r4.f298814a     // Catch:{ all -> 0x0107 }
            j$.util.Optional r2 = r2.f298821g     // Catch:{ all -> 0x0107 }
            boolean r2 = r2.isPresent()     // Catch:{ all -> 0x0107 }
            if (r2 == 0) goto L_0x00b5
            com.google.android.apps.gsa.staticplugins.opa.appintegration.service.r r2 = r4.f298814a     // Catch:{ all -> 0x0107 }
            j$.util.Optional r2 = r2.f298821g     // Catch:{ all -> 0x0107 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0107 }
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ all -> 0x0107 }
            r1.mo23481b(r2)     // Catch:{ all -> 0x0107 }
            com.google.android.apps.gsa.staticplugins.opa.appintegration.service.r r2 = r4.f298814a     // Catch:{ all -> 0x0107 }
            j$.util.Optional r3 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x0107 }
            r2.f298821g = r3     // Catch:{ all -> 0x0107 }
        L_0x00b5:
            monitor-exit(r0)     // Catch:{ all -> 0x0107 }
            com.google.common.b.gu r0 = r4.m178267a()     // Catch:{ RemoteException -> 0x010c }
        L_0x00ba:
            boolean r2 = r0.isEmpty()     // Catch:{ RemoteException -> 0x010c }
            if (r2 != 0) goto L_0x00da
            r2 = 0
            com.google.common.b.sm r0 = r0.listIterator(r2)     // Catch:{ RemoteException -> 0x010c }
        L_0x00c5:
            boolean r2 = r0.hasNext()     // Catch:{ RemoteException -> 0x010c }
            if (r2 == 0) goto L_0x00d5
            java.lang.Object r2 = r0.next()     // Catch:{ RemoteException -> 0x010c }
            byte[] r2 = (byte[]) r2     // Catch:{ RemoteException -> 0x010c }
            r1.mo23480a(r2)     // Catch:{ RemoteException -> 0x010c }
            goto L_0x00c5
        L_0x00d5:
            com.google.common.b.gu r0 = r4.m178267a()     // Catch:{ RemoteException -> 0x010c }
            goto L_0x00ba
        L_0x00da:
            com.google.android.apps.gsa.staticplugins.opa.appintegration.service.r r0 = r4.f298814a     // Catch:{ all -> 0x0186 }
            com.google.android.apps.gsa.staticplugins.opa.appintegration.service.q r1 = r0.f298820f     // Catch:{ all -> 0x0186 }
            if (r1 == 0) goto L_0x00ea
            android.content.Context r0 = r0.f298816b     // Catch:{ all -> 0x0186 }
            r0.unbindService(r1)     // Catch:{ all -> 0x0186 }
            com.google.android.apps.gsa.staticplugins.opa.appintegration.service.r r0 = r4.f298814a     // Catch:{ all -> 0x0186 }
        L_0x00e7:
            r0.f298820f = r5     // Catch:{ all -> 0x0186 }
            goto L_0x0157
        L_0x00ea:
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.opa.appintegration.service.C107367r.f298815a     // Catch:{ all -> 0x0186 }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ all -> 0x0186 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0186 }
            java.lang.String r1 = "PSSDataSender"
            r5.mo56378ag(r0, r1)     // Catch:{ all -> 0x0186 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0186 }
            r0 = 23746(0x5cc2, float:3.3275E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r0)     // Catch:{ all -> 0x0186 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0186 }
            java.lang.String r0 = "connection must not be null"
        L_0x0103:
            r5.mo56386p(r0)     // Catch:{ all -> 0x0186 }
            goto L_0x0157
        L_0x0107:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0107 }
            throw r1     // Catch:{ RemoteException -> 0x010c }
        L_0x010a:
            r0 = move-exception
            goto L_0x0159
        L_0x010c:
            r0 = move-exception
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.opa.appintegration.service.C107367r.f298815a     // Catch:{ all -> 0x010a }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x010a }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x010a }
            java.lang.String r3 = "PSSDataSender"
            r1.mo56378ag(r2, r3)     // Catch:{ all -> 0x010a }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x010a }
            com.google.common.f.x r0 = r1.mo56382g(r0)     // Catch:{ all -> 0x010a }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x010a }
            r1 = 23747(0x5cc3, float:3.3277E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x010a }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x010a }
            java.lang.String r1 = "Failed to get a binder"
            r0.mo56386p(r1)     // Catch:{ all -> 0x010a }
            com.google.android.apps.gsa.staticplugins.opa.appintegration.service.r r0 = r4.f298814a     // Catch:{ all -> 0x0186 }
            com.google.android.apps.gsa.staticplugins.opa.appintegration.service.q r1 = r0.f298820f     // Catch:{ all -> 0x0186 }
            if (r1 == 0) goto L_0x013d
            android.content.Context r0 = r0.f298816b     // Catch:{ all -> 0x0186 }
            r0.unbindService(r1)     // Catch:{ all -> 0x0186 }
            com.google.android.apps.gsa.staticplugins.opa.appintegration.service.r r0 = r4.f298814a     // Catch:{ all -> 0x0186 }
            goto L_0x00e7
        L_0x013d:
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.opa.appintegration.service.C107367r.f298815a     // Catch:{ all -> 0x0186 }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ all -> 0x0186 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0186 }
            java.lang.String r1 = "PSSDataSender"
            r5.mo56378ag(r0, r1)     // Catch:{ all -> 0x0186 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0186 }
            r0 = 23748(0x5cc4, float:3.3278E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r0)     // Catch:{ all -> 0x0186 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0186 }
            java.lang.String r0 = "connection must not be null"
            goto L_0x0103
        L_0x0157:
            monitor-exit(r6)     // Catch:{ all -> 0x0186 }
            return
        L_0x0159:
            com.google.android.apps.gsa.staticplugins.opa.appintegration.service.r r1 = r4.f298814a     // Catch:{ all -> 0x0186 }
            com.google.android.apps.gsa.staticplugins.opa.appintegration.service.q r2 = r1.f298820f     // Catch:{ all -> 0x0186 }
            if (r2 == 0) goto L_0x0169
            android.content.Context r1 = r1.f298816b     // Catch:{ all -> 0x0186 }
            r1.unbindService(r2)     // Catch:{ all -> 0x0186 }
            com.google.android.apps.gsa.staticplugins.opa.appintegration.service.r r1 = r4.f298814a     // Catch:{ all -> 0x0186 }
            r1.f298820f = r5     // Catch:{ all -> 0x0186 }
            goto L_0x0185
        L_0x0169:
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.opa.appintegration.service.C107367r.f298815a     // Catch:{ all -> 0x0186 }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ all -> 0x0186 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0186 }
            java.lang.String r2 = "PSSDataSender"
            r5.mo56378ag(r1, r2)     // Catch:{ all -> 0x0186 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0186 }
            r1 = 23749(0x5cc5, float:3.328E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r1)     // Catch:{ all -> 0x0186 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0186 }
            java.lang.String r1 = "connection must not be null"
            r5.mo56386p(r1)     // Catch:{ all -> 0x0186 }
        L_0x0185:
            throw r0     // Catch:{ all -> 0x0186 }
        L_0x0186:
            r5 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0186 }
            goto L_0x018a
        L_0x0189:
            throw r5
        L_0x018a:
            goto L_0x0189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.appintegration.service.C107366q.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C59104x d = C107367r.f298815a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PSSDataSender");
        ((C59052c) ((C59052c) d).mo56372aa(23753)).mo56386p("onServiceDisconnected");
        synchronized (this.f298814a.f298817c) {
            this.f298814a.f298819e.clear();
        }
        synchronized (this.f298814a.f298818d) {
            this.f298814a.f298820f = null;
        }
    }
}
