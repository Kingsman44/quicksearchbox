package com.google.android.ssb.service;

import android.os.Handler;

/* renamed from: com.google.android.ssb.service.f */
/* compiled from: PG */
final class C45360f extends Handler {

    /* renamed from: a */
    final /* synthetic */ SsbService f118600a;

    public C45360f(SsbService ssbService) {
        this.f118600a = ssbService;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d9  */
    public final void handleMessage(android.os.Message r12) {
        /*
            r11 = this;
            java.lang.Class<androidx.annotation.b> r0 = androidx.annotation.C0826b.class
            com.google.android.libraries.gsa.p1876k.C22872h.m42743c(r0)
            com.google.android.ssb.service.SsbService r0 = r11.f118600a
            boolean r0 = r0.f118568c
            if (r0 != 0) goto L_0x001a
            com.google.common.f.e r0 = com.google.android.ssb.service.SsbService.f118566a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "Incoming message after destroy:%s"
            r2 = 54356(0xd454, float:7.6169E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56389s(r1, r12)
            return
        L_0x001a:
            int r0 = r12.what
            r1 = 1
            if (r0 == r1) goto L_0x015f
            r2 = 2
            if (r0 == r2) goto L_0x0064
            r1 = 4
            if (r0 == r1) goto L_0x004f
            r1 = 5
            if (r0 == r1) goto L_0x003f
            r1 = 6
            if (r0 == r1) goto L_0x002f
            super.handleMessage(r12)
            return
        L_0x002f:
            android.os.Bundle r12 = r12.getData()
            java.lang.String r0 = "ssb_service:ssb_enable_hotword_service"
            boolean r12 = r12.getBoolean(r0)
            com.google.android.ssb.service.SsbService r0 = r11.f118600a
            r0.mo49364f(r12)
            return
        L_0x003f:
            com.google.android.ssb.service.SsbService r12 = r11.f118600a
            com.google.android.ssb.service.i r12 = r12.f118567b
            dagger.a r12 = r12.f118613h
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.configuration.a r12 = (com.google.android.apps.gsa.configuration.C74464a) r12
            r12.mo70780a()
            return
        L_0x004f:
            com.google.android.ssb.service.SsbService r12 = r11.f118600a
            com.google.android.ssb.service.i r12 = r12.f118567b
            com.google.android.apps.gsa.search.shared.service.j r0 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r1 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.TTS_STOP_SPEAKING
            r0.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r1)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r0 = r0.mo82013a()
            android.content.Context r12 = r12.f118611f
            com.google.android.apps.gsa.search.shared.service.p6940d.C88483e.m142828c(r12, r0)
            return
        L_0x0064:
            com.google.android.ssb.service.SsbService r0 = r11.f118600a
            com.google.android.ssb.service.i r0 = r0.f118567b
            android.os.Bundle r3 = r12.peekData()
            if (r3 == 0) goto L_0x015e
            android.os.Messenger r3 = r12.replyTo
            if (r3 == 0) goto L_0x015e
            android.os.Bundle r3 = r12.getData()
            java.lang.String r4 = "ssb_service:ssb_package_is_google"
            r5 = 0
            boolean r4 = r3.getBoolean(r4, r5)
            if (r4 != 0) goto L_0x0081
            goto L_0x015e
        L_0x0081:
            java.lang.String r4 = "ssb_service:ssb_package_name"
            java.lang.String r4 = r3.getString(r4)
            java.lang.String r6 = "ssb_service:ssb_context"
            byte[] r6 = r3.getByteArray(r6)
            r7 = 0
            if (r6 == 0) goto L_0x00ac
            com.google.protobuf.ba r8 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x009d }
            com.google.android.ssb.d r9 = com.google.android.ssb.C45347d.f118533e     // Catch:{ ct -> 0x009d }
            com.google.protobuf.bv r6 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r9, (byte[]) r6, (com.google.protobuf.C62921ba) r8)     // Catch:{ ct -> 0x009d }
            com.google.android.ssb.d r6 = (com.google.android.ssb.C45347d) r6     // Catch:{ ct -> 0x009d }
            goto L_0x00ad
        L_0x009d:
            r6 = move-exception
            com.google.common.f.e r8 = com.google.android.ssb.service.C45363i.f118606a
            com.google.common.f.x r8 = r8.mo56226d()
            java.lang.String r9 = "Invalid SsbContext."
            r10 = 54375(0xd467, float:7.6196E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56382g(r6)).mo56372aa(r10)).mo56386p(r9)
        L_0x00ac:
            r6 = r7
        L_0x00ad:
            if (r6 == 0) goto L_0x00e1
            dagger.a r8 = r0.f118612g
            if (r8 == 0) goto L_0x00e1
            boolean r9 = com.google.android.apps.gsa.shared.util.C91041i.m148716a(r4)
            if (r9 == 0) goto L_0x00e1
            boolean r9 = r6.f118538d
            if (r9 == 0) goto L_0x00c7
            java.lang.String r9 = r6.f118537c
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x00c7
            java.lang.String r7 = r6.f118537c
        L_0x00c7:
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.search.core.preferences.r r8 = (com.google.android.apps.gsa.search.core.preferences.C86338r) r8
            com.google.android.apps.gsa.search.core.preferences.q r8 = r8.mo80076b()
            if (r7 == 0) goto L_0x00d9
            java.lang.String r9 = "chrome_history_sync_account"
            r8.mo80073h(r9, r7)
            goto L_0x00de
        L_0x00d9:
            java.lang.String r7 = "chrome_history_sync_account"
            r8.mo80075j(r7)
        L_0x00de:
            r8.apply()
        L_0x00e1:
            java.lang.String r7 = "ssb_service:chrome_holds_account_update_permission"
            boolean r3 = r3.getBoolean(r7)
            java.lang.Object r7 = r0.f118609d
            monitor-enter(r7)
            android.os.Message r8 = r0.mo49377a(r3)     // Catch:{ all -> 0x015b }
            monitor-exit(r7)     // Catch:{ all -> 0x015b }
            android.os.Messenger r7 = r12.replyTo
            boolean r7 = r0.mo49383j(r7, r8)
            if (r7 == 0) goto L_0x015e
            java.lang.Object r7 = r0.f118609d
            monitor-enter(r7)
            if (r6 == 0) goto L_0x0117
            com.google.android.ssb.i r8 = r0.f118610e     // Catch:{ all -> 0x0115 }
            java.lang.String r8 = r8.f118553c     // Catch:{ all -> 0x0115 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0115 }
            if (r8 != 0) goto L_0x0117
            com.google.android.ssb.i r8 = r0.f118610e     // Catch:{ all -> 0x0115 }
            java.lang.String r8 = r8.f118553c     // Catch:{ all -> 0x0115 }
            java.lang.String r6 = r6.f118537c     // Catch:{ all -> 0x0115 }
            boolean r6 = r8.equals(r6)     // Catch:{ all -> 0x0115 }
            if (r6 != 0) goto L_0x0113
            goto L_0x0117
        L_0x0113:
            r1 = 0
            goto L_0x0117
        L_0x0115:
            r12 = move-exception
            goto L_0x0159
        L_0x0117:
            monitor-exit(r7)     // Catch:{ all -> 0x0115 }
            com.google.common.o.uf r5 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.common.o.tz r5 = (com.google.common.p4552o.C60548tz) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.common.o.uf r6 = (com.google.common.p4552o.C60555uf) r6
            int r7 = r6.f164093a
            r2 = r2 | r7
            r6.f164093a = r2
            r2 = 397(0x18d, float:5.56E-43)
            r6.f164258m = r2
            r5.copyOnWrite()
            com.google.protobuf.bv r2 = r5.instance
            com.google.common.o.uf r2 = (com.google.common.p4552o.C60555uf) r2
            int r6 = r2.f164199c
            r6 = r6 | 4096(0x1000, float:5.74E-42)
            r2.f164199c = r6
            r2.f164128ai = r1
            com.google.protobuf.bv r1 = r5.build()
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1
            com.google.android.ssb.service.C45363i.m80871c(r1, r4)
            com.google.android.ssb.service.h r1 = new com.google.android.ssb.service.h
            r1.<init>()
            r1.f118604a = r4
            r1.f118605b = r3
            java.util.concurrent.ConcurrentMap r0 = r0.f118608c
            android.os.Messenger r12 = r12.replyTo
            r0.put(r12, r1)
            return
        L_0x0159:
            monitor-exit(r7)     // Catch:{ all -> 0x0115 }
            throw r12
        L_0x015b:
            r12 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x015b }
            throw r12
        L_0x015e:
            return
        L_0x015f:
            com.google.common.f.e r12 = com.google.android.ssb.service.SsbService.f118566a
            com.google.common.f.x r12 = r12.mo56225c()
            java.lang.String r0 = "AGSA does not support the prepareOverlay message any more."
            r1 = 54351(0xd44f, float:7.6162E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r1)).mo56386p(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.ssb.service.C45360f.handleMessage(android.os.Message):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        if (r9 == false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean sendMessageAtTime(android.os.Message r12, long r13) {
        /*
            r11 = this;
            com.google.android.ssb.service.SsbService r0 = r11.f118600a
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            int r2 = android.os.Binder.getCallingUid()
            android.os.Bundle r3 = r12.getData()
            java.lang.String r4 = "ssb_service:ssb_package_name"
            java.lang.String r5 = r3.getString(r4)
            java.lang.String[] r1 = r1.getPackagesForUid(r2)
            java.lang.String r2 = "ssb_service:ssb_package_is_google"
            r6 = 0
            if (r1 == 0) goto L_0x0051
            int r7 = r1.length
            if (r7 <= 0) goto L_0x0051
            r8 = 0
            r9 = 0
        L_0x0022:
            if (r8 >= r7) goto L_0x002e
            r10 = r1[r8]
            boolean r10 = android.text.TextUtils.equals(r5, r10)
            r9 = r9 | r10
            int r8 = r8 + 1
            goto L_0x0022
        L_0x002e:
            int r7 = r1.length
            r8 = 1
            if (r7 != r8) goto L_0x0038
            r1 = r1[r6]
            r3.putString(r4, r1)
            goto L_0x003b
        L_0x0038:
            if (r9 != 0) goto L_0x003b
            goto L_0x0051
        L_0x003b:
            java.lang.String r1 = r3.getString(r4)
            g.a.a r0 = r0.f118576k
            java.lang.Object r0 = r0.mo17428b()
            com.google.android.libraries.gcoreclient.h.c.e r0 = (com.google.android.libraries.gcoreclient.p1763h.p1769c.C21560e) r0
            com.google.android.gms.common.ac r0 = r0.f59951a
            boolean r0 = r0.mo119084c(r1)
            r3.putBoolean(r2, r0)
            goto L_0x0065
        L_0x0051:
            com.google.common.f.e r0 = com.google.android.ssb.service.SsbService.f118566a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "Potential package name unavailable: %s"
            r7 = 54370(0xd462, float:7.6189E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r7)).mo56389s(r1, r5)
            r3.remove(r4)
            r3.putBoolean(r2, r6)
        L_0x0065:
            boolean r12 = super.sendMessageAtTime(r12, r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.ssb.service.C45360f.sendMessageAtTime(android.os.Message, long):boolean");
    }
}
