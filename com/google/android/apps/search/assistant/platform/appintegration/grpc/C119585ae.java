package com.google.android.apps.search.assistant.platform.appintegration.grpc;

import android.content.ComponentName;
import android.content.ServiceConnection;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.ae */
/* compiled from: PG */
final class C119585ae implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C119586af f333287a;

    public C119585ae(C119586af afVar) {
        this.f333287a = afVar;
    }

    /* renamed from: a */
    private final C58485gu m198473a() {
        C58485gu j;
        synchronized (this.f333287a.f333290c) {
            j = C58485gu.m89842j(this.f333287a.f333292e);
            this.f333287a.f333292e.clear();
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
    public final void onServiceConnected(android.content.ComponentName r7, android.os.IBinder r8) {
        /*
            r6 = this;
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7 = 0
            if (r8 != 0) goto L_0x0007
            r0 = r7
            goto L_0x0019
        L_0x0007:
            java.lang.String r0 = "com.google.android.apps.gsa.publicsearch.IPublicSearchService"
            android.os.IInterface r0 = r8.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.apps.gsa.publicsearch.C84205e
            if (r1 == 0) goto L_0x0014
            com.google.android.apps.gsa.publicsearch.e r0 = (com.google.android.apps.gsa.publicsearch.C84205e) r0
            goto L_0x0019
        L_0x0014:
            com.google.android.apps.gsa.publicsearch.c r0 = new com.google.android.apps.gsa.publicsearch.c
            r0.<init>(r8)
        L_0x0019:
            com.google.android.apps.search.assistant.platform.appintegration.grpc.af r8 = r6.f333287a
            java.lang.Object r8 = r8.f333291d
            monitor-enter(r8)
            java.lang.String r1 = "opa_app_integration"
            android.os.IBinder r0 = r0.mo77677e(r1, r7, r7)     // Catch:{ RemoteException -> 0x0183 }
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119586af.f333288a     // Catch:{ RemoteException -> 0x0183 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ RemoteException -> 0x0183 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RemoteException -> 0x0183 }
            java.lang.String r3 = "GrpcPSSDataSender"
            r1.mo56378ag(r2, r3)     // Catch:{ RemoteException -> 0x0183 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ RemoteException -> 0x0183 }
            r2 = 34451(0x8693, float:4.8276E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ RemoteException -> 0x0183 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ RemoteException -> 0x0183 }
            java.lang.String r2 = "binder=%s"
            r1.mo56389s(r2, r0)     // Catch:{ RemoteException -> 0x0183 }
            if (r0 != 0) goto L_0x009e
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119586af.f333288a     // Catch:{ RemoteException -> 0x0183 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ RemoteException -> 0x0183 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RemoteException -> 0x0183 }
            java.lang.String r2 = "GrpcPSSDataSender"
            r0.mo56378ag(r1, r2)     // Catch:{ RemoteException -> 0x0183 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ RemoteException -> 0x0183 }
            r1 = 34460(0x869c, float:4.8289E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ RemoteException -> 0x0183 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ RemoteException -> 0x0183 }
            java.lang.String r1 = "binder is null"
            r0.mo56386p(r1)     // Catch:{ RemoteException -> 0x0183 }
            com.google.android.apps.search.assistant.platform.appintegration.grpc.af r0 = r6.f333287a     // Catch:{ RemoteException -> 0x0183 }
            com.google.android.apps.search.assistant.platform.appintegration.grpc.ae r1 = r0.f333294g     // Catch:{ RemoteException -> 0x0183 }
            if (r1 == 0) goto L_0x006f
            android.content.Context r0 = r0.f333289b     // Catch:{ RemoteException -> 0x0183 }
            r0.unbindService(r1)     // Catch:{ RemoteException -> 0x0183 }
            com.google.android.apps.search.assistant.platform.appintegration.grpc.af r0 = r6.f333287a     // Catch:{ RemoteException -> 0x0183 }
            r0.f333294g = r7     // Catch:{ RemoteException -> 0x0183 }
        L_0x006f:
            com.google.android.apps.search.assistant.platform.appintegration.grpc.af r0 = r6.f333287a     // Catch:{ all -> 0x0200 }
            com.google.android.apps.search.assistant.platform.appintegration.grpc.ae r1 = r0.f333294g     // Catch:{ all -> 0x0200 }
            if (r1 == 0) goto L_0x007f
            android.content.Context r0 = r0.f333289b     // Catch:{ all -> 0x0200 }
            r0.unbindService(r1)     // Catch:{ all -> 0x0200 }
            com.google.android.apps.search.assistant.platform.appintegration.grpc.af r0 = r6.f333287a     // Catch:{ all -> 0x0200 }
            r0.f333294g = r7     // Catch:{ all -> 0x0200 }
            goto L_0x009c
        L_0x007f:
            com.google.common.f.e r7 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119586af.f333288a     // Catch:{ all -> 0x0200 }
            com.google.common.f.x r7 = r7.mo56226d()     // Catch:{ all -> 0x0200 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0200 }
            java.lang.String r1 = "GrpcPSSDataSender"
            r7.mo56378ag(r0, r1)     // Catch:{ all -> 0x0200 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x0200 }
            r0 = 34461(0x869d, float:4.829E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r0)     // Catch:{ all -> 0x0200 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x0200 }
            java.lang.String r0 = "connection must not be null"
            r7.mo56386p(r0)     // Catch:{ all -> 0x0200 }
        L_0x009c:
            monitor-exit(r8)     // Catch:{ all -> 0x0200 }
            return
        L_0x009e:
            java.lang.String r1 = "com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSession"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0183 }
            boolean r2 = r1 instanceof com.google.android.libraries.assistant.p1467d.p1472c.p1473a.C17846i     // Catch:{ RemoteException -> 0x0183 }
            if (r2 == 0) goto L_0x00ab
            com.google.android.libraries.assistant.d.c.a.i r1 = (com.google.android.libraries.assistant.p1467d.p1472c.p1473a.C17846i) r1     // Catch:{ RemoteException -> 0x0183 }
            goto L_0x00b0
        L_0x00ab:
            com.google.android.libraries.assistant.d.c.a.g r1 = new com.google.android.libraries.assistant.d.c.a.g     // Catch:{ RemoteException -> 0x0183 }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x0183 }
        L_0x00b0:
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119586af.f333288a     // Catch:{ RemoteException -> 0x0183 }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ RemoteException -> 0x0183 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RemoteException -> 0x0183 }
            java.lang.String r3 = "GrpcPSSDataSender"
            r0.mo56378ag(r2, r3)     // Catch:{ RemoteException -> 0x0183 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ RemoteException -> 0x0183 }
            r2 = 34452(0x8694, float:4.8278E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ RemoteException -> 0x0183 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ RemoteException -> 0x0183 }
            java.lang.String r2 = "session=%s"
            r0.mo56389s(r2, r1)     // Catch:{ RemoteException -> 0x0183 }
            com.google.android.apps.search.assistant.platform.appintegration.grpc.af r0 = r6.f333287a     // Catch:{ RemoteException -> 0x0183 }
            java.lang.Object r0 = r0.f333290c     // Catch:{ RemoteException -> 0x0183 }
            monitor-enter(r0)     // Catch:{ RemoteException -> 0x0183 }
            com.google.android.apps.search.assistant.platform.appintegration.grpc.af r2 = r6.f333287a     // Catch:{ all -> 0x017e }
            j$.util.Optional r2 = r2.f333293f     // Catch:{ all -> 0x017e }
            boolean r2 = r2.isPresent()     // Catch:{ all -> 0x017e }
            if (r2 == 0) goto L_0x00f1
            com.google.android.apps.search.assistant.platform.appintegration.grpc.af r2 = r6.f333287a     // Catch:{ all -> 0x017e }
            j$.util.Optional r2 = r2.f333293f     // Catch:{ all -> 0x017e }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x017e }
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ all -> 0x017e }
            r1.mo23481b(r2)     // Catch:{ all -> 0x017e }
            com.google.android.apps.search.assistant.platform.appintegration.grpc.af r2 = r6.f333287a     // Catch:{ all -> 0x017e }
            j$.util.Optional r3 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x017e }
            r2.f333293f = r3     // Catch:{ all -> 0x017e }
        L_0x00f1:
            monitor-exit(r0)     // Catch:{ all -> 0x017e }
            com.google.common.b.gu r0 = r6.m198473a()     // Catch:{ RemoteException -> 0x0183 }
        L_0x00f6:
            boolean r2 = r0.isEmpty()     // Catch:{ RemoteException -> 0x0183 }
            if (r2 != 0) goto L_0x0150
            com.google.common.f.e r2 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119586af.f333288a     // Catch:{ RemoteException -> 0x0183 }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ RemoteException -> 0x0183 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RemoteException -> 0x0183 }
            java.lang.String r4 = "GrpcPSSDataSender"
            r2.mo56378ag(r3, r4)     // Catch:{ RemoteException -> 0x0183 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ RemoteException -> 0x0183 }
            r3 = 34454(0x8696, float:4.828E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ RemoteException -> 0x0183 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ RemoteException -> 0x0183 }
            java.lang.String r3 = "pendingdata=%s"
            r2.mo56389s(r3, r0)     // Catch:{ RemoteException -> 0x0183 }
            r2 = 0
            com.google.common.b.sm r0 = r0.listIterator(r2)     // Catch:{ RemoteException -> 0x0183 }
        L_0x011e:
            boolean r2 = r0.hasNext()     // Catch:{ RemoteException -> 0x0183 }
            if (r2 == 0) goto L_0x014b
            java.lang.Object r2 = r0.next()     // Catch:{ RemoteException -> 0x0183 }
            byte[] r2 = (byte[]) r2     // Catch:{ RemoteException -> 0x0183 }
            com.google.common.f.e r3 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119586af.f333288a     // Catch:{ RemoteException -> 0x0183 }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ RemoteException -> 0x0183 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RemoteException -> 0x0183 }
            java.lang.String r5 = "GrpcPSSDataSender"
            r3.mo56378ag(r4, r5)     // Catch:{ RemoteException -> 0x0183 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ RemoteException -> 0x0183 }
            r4 = 34458(0x869a, float:4.8286E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)     // Catch:{ RemoteException -> 0x0183 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ RemoteException -> 0x0183 }
            java.lang.String r4 = "session.sendData!"
            r3.mo56386p(r4)     // Catch:{ RemoteException -> 0x0183 }
            r1.mo23480a(r2)     // Catch:{ RemoteException -> 0x0183 }
            goto L_0x011e
        L_0x014b:
            com.google.common.b.gu r0 = r6.m198473a()     // Catch:{ RemoteException -> 0x0183 }
            goto L_0x00f6
        L_0x0150:
            com.google.android.apps.search.assistant.platform.appintegration.grpc.af r0 = r6.f333287a     // Catch:{ all -> 0x0200 }
            com.google.android.apps.search.assistant.platform.appintegration.grpc.ae r1 = r0.f333294g     // Catch:{ all -> 0x0200 }
            if (r1 == 0) goto L_0x0160
            android.content.Context r0 = r0.f333289b     // Catch:{ all -> 0x0200 }
            r0.unbindService(r1)     // Catch:{ all -> 0x0200 }
            com.google.android.apps.search.assistant.platform.appintegration.grpc.af r0 = r6.f333287a     // Catch:{ all -> 0x0200 }
        L_0x015d:
            r0.f333294g = r7     // Catch:{ all -> 0x0200 }
            goto L_0x01d0
        L_0x0160:
            com.google.common.f.e r7 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119586af.f333288a     // Catch:{ all -> 0x0200 }
            com.google.common.f.x r7 = r7.mo56226d()     // Catch:{ all -> 0x0200 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0200 }
            java.lang.String r1 = "GrpcPSSDataSender"
            r7.mo56378ag(r0, r1)     // Catch:{ all -> 0x0200 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x0200 }
            r0 = 34453(0x8695, float:4.8279E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r0)     // Catch:{ all -> 0x0200 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x0200 }
            java.lang.String r0 = "connection must not be null"
        L_0x017a:
            r7.mo56386p(r0)     // Catch:{ all -> 0x0200 }
            goto L_0x01d0
        L_0x017e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x017e }
            throw r1     // Catch:{ RemoteException -> 0x0183 }
        L_0x0181:
            r0 = move-exception
            goto L_0x01d2
        L_0x0183:
            r0 = move-exception
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119586af.f333288a     // Catch:{ all -> 0x0181 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x0181 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0181 }
            java.lang.String r3 = "GrpcPSSDataSender"
            r1.mo56378ag(r2, r3)     // Catch:{ all -> 0x0181 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0181 }
            com.google.common.f.x r0 = r1.mo56382g(r0)     // Catch:{ all -> 0x0181 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0181 }
            r1 = 34455(0x8697, float:4.8282E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x0181 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0181 }
            java.lang.String r1 = "Failed to get a binder"
            r0.mo56386p(r1)     // Catch:{ all -> 0x0181 }
            com.google.android.apps.search.assistant.platform.appintegration.grpc.af r0 = r6.f333287a     // Catch:{ all -> 0x0200 }
            com.google.android.apps.search.assistant.platform.appintegration.grpc.ae r1 = r0.f333294g     // Catch:{ all -> 0x0200 }
            if (r1 == 0) goto L_0x01b5
            android.content.Context r0 = r0.f333289b     // Catch:{ all -> 0x0200 }
            r0.unbindService(r1)     // Catch:{ all -> 0x0200 }
            com.google.android.apps.search.assistant.platform.appintegration.grpc.af r0 = r6.f333287a     // Catch:{ all -> 0x0200 }
            goto L_0x015d
        L_0x01b5:
            com.google.common.f.e r7 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119586af.f333288a     // Catch:{ all -> 0x0200 }
            com.google.common.f.x r7 = r7.mo56226d()     // Catch:{ all -> 0x0200 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0200 }
            java.lang.String r1 = "GrpcPSSDataSender"
            r7.mo56378ag(r0, r1)     // Catch:{ all -> 0x0200 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x0200 }
            r0 = 34456(0x8698, float:4.8283E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r0)     // Catch:{ all -> 0x0200 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x0200 }
            java.lang.String r0 = "connection must not be null"
            goto L_0x017a
        L_0x01d0:
            monitor-exit(r8)     // Catch:{ all -> 0x0200 }
            return
        L_0x01d2:
            com.google.android.apps.search.assistant.platform.appintegration.grpc.af r1 = r6.f333287a     // Catch:{ all -> 0x0200 }
            com.google.android.apps.search.assistant.platform.appintegration.grpc.ae r2 = r1.f333294g     // Catch:{ all -> 0x0200 }
            if (r2 == 0) goto L_0x01e2
            android.content.Context r1 = r1.f333289b     // Catch:{ all -> 0x0200 }
            r1.unbindService(r2)     // Catch:{ all -> 0x0200 }
            com.google.android.apps.search.assistant.platform.appintegration.grpc.af r1 = r6.f333287a     // Catch:{ all -> 0x0200 }
            r1.f333294g = r7     // Catch:{ all -> 0x0200 }
            goto L_0x01ff
        L_0x01e2:
            com.google.common.f.e r7 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119586af.f333288a     // Catch:{ all -> 0x0200 }
            com.google.common.f.x r7 = r7.mo56226d()     // Catch:{ all -> 0x0200 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0200 }
            java.lang.String r2 = "GrpcPSSDataSender"
            r7.mo56378ag(r1, r2)     // Catch:{ all -> 0x0200 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x0200 }
            r1 = 34457(0x8699, float:4.8285E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r1)     // Catch:{ all -> 0x0200 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x0200 }
            java.lang.String r1 = "connection must not be null"
            r7.mo56386p(r1)     // Catch:{ all -> 0x0200 }
        L_0x01ff:
            throw r0     // Catch:{ all -> 0x0200 }
        L_0x0200:
            r7 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0200 }
            goto L_0x0204
        L_0x0203:
            throw r7
        L_0x0204:
            goto L_0x0203
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.appintegration.grpc.C119585ae.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C59104x d = C119586af.f333288a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "GrpcPSSDataSender");
        ((C59052c) ((C59052c) d).mo56372aa(34462)).mo56389s("onServiceDisconnected %s", componentName);
        synchronized (this.f333287a.f333290c) {
            this.f333287a.f333292e.clear();
        }
        synchronized (this.f333287a.f333291d) {
            this.f333287a.f333294g = null;
        }
    }
}
