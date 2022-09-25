package com.google.android.apps.gsa.search.core.preferences;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.w */
/* compiled from: PG */
final class C86343w implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C86346z f233441a;

    public C86343w(C86346z zVar) {
        this.f233441a = zVar;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r10 = this;
            com.google.android.apps.gsa.search.core.preferences.z r0 = r10.f233441a
            java.lang.Object r1 = r0.f233450e
            monitor-enter(r1)
            boolean r2 = r0.f233454i     // Catch:{ all -> 0x016f }
            monitor-exit(r1)     // Catch:{ all -> 0x016f }
            r1 = 0
            if (r2 == 0) goto L_0x000e
        L_0x000b:
            r2 = r1
            goto L_0x00e8
        L_0x000e:
            java.io.File r2 = r0.f233448c
            boolean r2 = r2.exists()
            if (r2 == 0) goto L_0x003d
            java.io.File r2 = r0.f233447b
            r2.delete()
            java.io.File r2 = r0.f233448c
            java.io.File r3 = r0.f233447b
            boolean r2 = r2.renameTo(r3)
            if (r2 != 0) goto L_0x003d
            com.google.common.f.e r2 = com.google.android.apps.gsa.search.core.preferences.C86346z.f233446a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            r3 = 8318(0x207e, float:1.1656E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            java.lang.String r3 = "Failed to rename backup file to %s"
            java.io.File r4 = r0.f233447b
            r2.mo56389s(r3, r4)
            goto L_0x000b
        L_0x003d:
            java.io.File r2 = r0.f233447b
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00d6 }
            r3.<init>(r2)     // Catch:{ FileNotFoundException -> 0x00d6 }
            com.google.android.apps.gsa.shared.aj.d r2 = com.google.android.apps.gsa.shared.p6986aj.C89185d.f241801b     // Catch:{ NullPointerException -> 0x0054 }
            com.google.protobuf.bv r2 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r2, (java.io.InputStream) r3)     // Catch:{ NullPointerException -> 0x0054 }
            com.google.android.apps.gsa.shared.aj.d r2 = (com.google.android.apps.gsa.shared.p6986aj.C89185d) r2     // Catch:{ NullPointerException -> 0x0054 }
            goto L_0x0071
        L_0x004d:
            r2 = move-exception
            goto L_0x00d2
        L_0x0050:
            r2 = move-exception
            goto L_0x007f
        L_0x0052:
            r2 = move-exception
            goto L_0x009b
        L_0x0054:
            r2 = move-exception
            com.google.common.f.e r4 = com.google.android.apps.gsa.search.core.preferences.C86346z.f233446a     // Catch:{ FileNotFoundException -> 0x00b7, ct -> 0x0052, IOException -> 0x0050 }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ FileNotFoundException -> 0x00b7, ct -> 0x0052, IOException -> 0x0050 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ FileNotFoundException -> 0x00b7, ct -> 0x0052, IOException -> 0x0050 }
            com.google.common.f.x r2 = r4.mo56382g(r2)     // Catch:{ FileNotFoundException -> 0x00b7, ct -> 0x0052, IOException -> 0x0050 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ FileNotFoundException -> 0x00b7, ct -> 0x0052, IOException -> 0x0050 }
            r4 = 8322(0x2082, float:1.1662E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r4)     // Catch:{ FileNotFoundException -> 0x00b7, ct -> 0x0052, IOException -> 0x0050 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ FileNotFoundException -> 0x00b7, ct -> 0x0052, IOException -> 0x0050 }
            java.lang.String r4 = "load shared preferences"
            r2.mo56386p(r4)     // Catch:{ FileNotFoundException -> 0x00b7, ct -> 0x0052, IOException -> 0x0050 }
            r2 = r1
        L_0x0071:
            if (r2 == 0) goto L_0x007b
            java.util.Map r2 = com.google.android.apps.gsa.shared.p6986aj.C89186e.m145058c(r2)     // Catch:{ FileNotFoundException -> 0x00b7, ct -> 0x0052, IOException -> 0x0050 }
        L_0x0077:
            com.google.common.p4541l.C59337t.m92221a(r3)     // Catch:{ FileNotFoundException -> 0x00d6 }
            goto L_0x00e8
        L_0x007b:
            com.google.common.p4541l.C59337t.m92221a(r3)     // Catch:{ FileNotFoundException -> 0x00d6 }
            goto L_0x000b
        L_0x007f:
            com.google.common.f.e r4 = com.google.android.apps.gsa.search.core.preferences.C86346z.f233446a     // Catch:{ all -> 0x004d }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ all -> 0x004d }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x004d }
            com.google.common.f.x r2 = r4.mo56382g(r2)     // Catch:{ all -> 0x004d }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x004d }
            r4 = 8321(0x2081, float:1.166E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r4)     // Catch:{ all -> 0x004d }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x004d }
            java.lang.String r4 = "load shared preferences"
            r2.mo56386p(r4)     // Catch:{ all -> 0x004d }
            goto L_0x007b
        L_0x009b:
            com.google.common.f.e r4 = com.google.android.apps.gsa.search.core.preferences.C86346z.f233446a     // Catch:{ all -> 0x004d }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ all -> 0x004d }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x004d }
            com.google.common.f.x r2 = r4.mo56382g(r2)     // Catch:{ all -> 0x004d }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x004d }
            r4 = 8320(0x2080, float:1.1659E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r4)     // Catch:{ all -> 0x004d }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x004d }
            java.lang.String r4 = "load shared preferences"
            r2.mo56386p(r4)     // Catch:{ all -> 0x004d }
            goto L_0x007b
        L_0x00b7:
            com.google.common.f.e r2 = com.google.android.apps.gsa.search.core.preferences.C86346z.f233446a     // Catch:{ all -> 0x004d }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ all -> 0x004d }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x004d }
            r4 = 8319(0x207f, float:1.1657E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r4)     // Catch:{ all -> 0x004d }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x004d }
            java.lang.String r4 = "load shared preferences: file not found"
            r2.mo56386p(r4)     // Catch:{ all -> 0x004d }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x004d }
            r2.<init>()     // Catch:{ all -> 0x004d }
            goto L_0x0077
        L_0x00d2:
            com.google.common.p4541l.C59337t.m92221a(r3)     // Catch:{ FileNotFoundException -> 0x00d6 }
            throw r2     // Catch:{ FileNotFoundException -> 0x00d6 }
        L_0x00d6:
            com.google.common.f.e r2 = com.google.android.apps.gsa.search.core.preferences.C86346z.f233446a
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "load shared preferences: file not found"
            r4 = 8323(0x2083, float:1.1663E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
        L_0x00e8:
            java.lang.Object r3 = r0.f233450e
            monitor-enter(r3)
            boolean r4 = r0.f233454i     // Catch:{ all -> 0x016c }
            r5 = 1
            if (r4 != 0) goto L_0x0155
            if (r2 == 0) goto L_0x0142
            java.util.Map r6 = r0.f233453h     // Catch:{ all -> 0x016c }
            java.util.Set r6 = r6.entrySet()     // Catch:{ all -> 0x016c }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x016c }
        L_0x00fc:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x016c }
            if (r7 == 0) goto L_0x013f
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x016c }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ all -> 0x016c }
            java.lang.Object r8 = r7.getKey()     // Catch:{ all -> 0x016c }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x016c }
            java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x016c }
            java.lang.Object r9 = r0.f233451f     // Catch:{ all -> 0x016c }
            if (r7 != r9) goto L_0x0120
            boolean r7 = r2.containsKey(r8)     // Catch:{ all -> 0x016c }
            if (r7 == 0) goto L_0x00fc
            r2.remove(r8)     // Catch:{ all -> 0x016c }
            goto L_0x013d
        L_0x0120:
            boolean r9 = r2.containsKey(r8)     // Catch:{ all -> 0x016c }
            if (r9 == 0) goto L_0x013a
            if (r7 != 0) goto L_0x012e
            java.lang.Object r9 = r2.get(r8)     // Catch:{ all -> 0x016c }
            if (r9 != 0) goto L_0x013a
        L_0x012e:
            if (r7 == 0) goto L_0x00fc
            java.lang.Object r9 = r2.get(r8)     // Catch:{ all -> 0x016c }
            boolean r9 = r7.equals(r9)     // Catch:{ all -> 0x016c }
            if (r9 != 0) goto L_0x00fc
        L_0x013a:
            r2.put(r8, r7)     // Catch:{ all -> 0x016c }
        L_0x013d:
            r4 = 1
            goto L_0x00fc
        L_0x013f:
            r0.f233453h = r2     // Catch:{ all -> 0x016c }
            goto L_0x014e
        L_0x0142:
            java.util.Map r2 = r0.f233453h     // Catch:{ all -> 0x016c }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x016c }
            com.google.common.base.bc r4 = r0.f233452g     // Catch:{ all -> 0x016c }
            com.google.common.p4522b.C58557jl.m90145z(r2, r4)     // Catch:{ all -> 0x016c }
            r4 = 1
        L_0x014e:
            r0.f233454i = r5     // Catch:{ all -> 0x016c }
            java.lang.Object r2 = r0.f233450e     // Catch:{ all -> 0x016c }
            r2.notifyAll()     // Catch:{ all -> 0x016c }
        L_0x0155:
            if (r4 != 0) goto L_0x0165
            com.google.android.apps.gsa.search.core.preferences.x r2 = r0.f233456k     // Catch:{ all -> 0x016c }
            r2.getClass()
            r2.f233444c = r5     // Catch:{ all -> 0x016c }
            java.util.concurrent.CountDownLatch r2 = r2.f233442a     // Catch:{ all -> 0x016c }
            r2.countDown()     // Catch:{ all -> 0x016c }
            r0.f233456k = r1     // Catch:{ all -> 0x016c }
        L_0x0165:
            monitor-exit(r3)     // Catch:{ all -> 0x016c }
            if (r4 == 0) goto L_0x016b
            r0.mo80103i()
        L_0x016b:
            return
        L_0x016c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x016c }
            throw r0
        L_0x016f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x016f }
            goto L_0x0173
        L_0x0172:
            throw r0
        L_0x0173:
            goto L_0x0172
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.preferences.C86343w.run():void");
    }

    public final String toString() {
        return "SharedPreferencesProto.LoadFromFile";
    }
}
