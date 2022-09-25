package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import android.content.BroadcastReceiver;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.am */
/* compiled from: PG */
final class C95722am extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C95724ao f267978a;

    public C95722am(C95724ao aoVar) {
        this.f267978a = aoVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r19, android.content.Intent r20) {
        /*
            r18 = this;
            r1 = r18
            r0 = r20
            java.lang.String r2 = "ExtVoiceInHandler"
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95724ao.f267982a
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            if (r0 == 0) goto L_0x0211
            java.lang.String r3 = "com.google.android.apps.gsa.shared.bisto.action.SDK_REQUEST"
            java.lang.String r4 = r20.getAction()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001a
            goto L_0x0211
        L_0x001a:
            java.lang.String r3 = "bisto_sdk_payload"
            byte[] r0 = r0.getByteArrayExtra(r3)
            if (r0 == 0) goto L_0x0211
            com.google.android.d.gr r4 = com.google.android.p10712d.C142474gr.f386644c     // Catch:{ ct -> 0x01fe }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (byte[]) r0)     // Catch:{ ct -> 0x01fe }
            com.google.android.d.gr r0 = (com.google.android.p10712d.C142474gr) r0     // Catch:{ ct -> 0x01fe }
            int r4 = r0.f386646a
            r5 = 0
            r6 = 2
            r7 = 3
            r8 = 1
            if (r4 == 0) goto L_0x003c
            if (r4 == r8) goto L_0x003a
            if (r4 == r6) goto L_0x0038
            r9 = 0
            goto L_0x003d
        L_0x0038:
            r9 = 2
            goto L_0x003d
        L_0x003a:
            r9 = 1
            goto L_0x003d
        L_0x003c:
            r9 = 3
        L_0x003d:
            int r10 = r9 + -1
            r11 = 0
            if (r9 == 0) goto L_0x01fd
            if (r10 == 0) goto L_0x0158
            if (r10 == r8) goto L_0x0048
            goto L_0x01fc
        L_0x0048:
            if (r4 != r6) goto L_0x004f
            java.lang.Object r0 = r0.f386647b
            com.google.android.d.gn r0 = (com.google.android.p10712d.C142470gn) r0
            goto L_0x0051
        L_0x004f:
            com.google.android.d.gn r0 = com.google.android.p10712d.C142470gn.f386633f
        L_0x0051:
            r14 = r0
            com.google.android.apps.gsa.staticplugins.bisto.o.ao r15 = r1.f267978a
            int r0 = r14.f386635a
            java.lang.String r3 = ""
            if (r0 != r7) goto L_0x005f
            java.lang.Object r0 = r14.f386636b
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0060
        L_0x005f:
            r0 = r3
        L_0x0060:
            java.lang.String r4 = r15.f267988f
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0069
            goto L_0x00aa
        L_0x0069:
            com.google.android.apps.gsa.staticplugins.bisto.u.c.d r0 = r15.f267989g
            int r4 = r14.f386635a
            r6 = 4
            if (r4 != r6) goto L_0x0075
            java.lang.Object r4 = r14.f386636b
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0076
        L_0x0075:
            r4 = r3
        L_0x0076:
            java.lang.String r9 = r15.f267988f
            boolean r0 = r0.mo89910b(r4, r9)
            if (r0 != 0) goto L_0x00aa
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95724ao.f267982a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r2)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r2 = 15267(0x3ba3, float:2.1394E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            int r2 = r14.f386635a
            if (r2 != r7) goto L_0x009c
            java.lang.Object r2 = r14.f386636b
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x009e
        L_0x009c:
            r7 = r2
            r2 = r3
        L_0x009e:
            if (r7 != r6) goto L_0x00a4
            java.lang.Object r3 = r14.f386636b
            java.lang.String r3 = (java.lang.String) r3
        L_0x00a4:
            java.lang.String r4 = "Invalid bind request(%s,%s)"
            r0.mo56354G(r4, r2, r3)
            return
        L_0x00aa:
            int r0 = r14.f386638d
            com.google.android.d.hq r0 = com.google.android.p10712d.C142500hq.m231092a(r0)
            if (r0 != 0) goto L_0x00b4
            com.google.android.d.hq r0 = com.google.android.p10712d.C142500hq.UNRECOGNIZED
        L_0x00b4:
            android.content.Context r3 = r15.f267984b
            com.google.android.apps.gsa.shared.bisto.k r4 = r15.f267987e
            java.lang.String r6 = r15.mo89692l()
            java.lang.String r7 = "com.google.android.apps.gsa.shared.bisto.action.BIND_BISTO_SESSION"
            android.content.Intent r0 = com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95795ca.m158754c(r7, r0, r4, r6)
            if (r0 != 0) goto L_0x00c5
            goto L_0x0107
        L_0x00c5:
            java.lang.String r4 = r0.getPackage()
            if (r4 != 0) goto L_0x00cd
        L_0x00cb:
            r3 = r11
            goto L_0x0100
        L_0x00cd:
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            java.util.List r3 = r3.queryIntentServices(r0, r5)
            if (r3 == 0) goto L_0x00cb
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto L_0x00cb
            java.util.Iterator r3 = r3.iterator()
        L_0x00e1:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00cb
            java.lang.Object r5 = r3.next()
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
            android.content.pm.ServiceInfo r6 = r5.serviceInfo
            java.lang.String r6 = r6.name
            android.content.pm.ServiceInfo r5 = r5.serviceInfo
            java.lang.String r5 = r5.packageName
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x00e1
            android.content.ComponentName r3 = new android.content.ComponentName
            r3.<init>(r4, r6)
        L_0x0100:
            if (r3 != 0) goto L_0x0103
            goto L_0x0107
        L_0x0103:
            r0.setComponent(r3)
            r11 = r0
        L_0x0107:
            if (r11 != 0) goto L_0x010b
            goto L_0x01fc
        L_0x010b:
            java.util.concurrent.atomic.AtomicReference r0 = r15.f267985c
            java.lang.Object r0 = r0.get()
            com.google.android.apps.gsa.staticplugins.bisto.ae.c r0 = (com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95110c) r0
            if (r0 == 0) goto L_0x011b
            boolean r0 = r0.mo89040g()
            if (r0 != 0) goto L_0x01fc
        L_0x011b:
            java.lang.String r0 = r15.mo89693n()
            java.lang.String r17 = com.google.common.base.C58837ba.m90858g(r0)
            java.util.concurrent.atomic.AtomicReference r0 = r15.f267985c     // Catch:{ SecurityException -> 0x0144 }
            android.content.Context r3 = r15.f267984b     // Catch:{ SecurityException -> 0x0144 }
            java.lang.String r4 = r15.f267988f     // Catch:{ SecurityException -> 0x0144 }
            com.google.android.apps.gsa.staticplugins.bisto.ae.bo r5 = new com.google.android.apps.gsa.staticplugins.bisto.ae.bo     // Catch:{ SecurityException -> 0x0144 }
            r12 = r5
            r13 = r3
            r16 = r4
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ SecurityException -> 0x0144 }
            boolean r3 = r3.bindService(r11, r5, r8)     // Catch:{ SecurityException -> 0x0144 }
            if (r3 == 0) goto L_0x013c
            r0.set(r5)     // Catch:{ SecurityException -> 0x0144 }
            return
        L_0x013c:
            java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch:{ SecurityException -> 0x0144 }
            java.lang.String r3 = "could not bind to remote service"
            r0.<init>(r3)     // Catch:{ SecurityException -> 0x0144 }
            throw r0     // Catch:{ SecurityException -> 0x0144 }
        L_0x0144:
            r0 = move-exception
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95724ao.f267982a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r2)
            java.lang.String r2 = "cannot bind to external voice service"
            r4 = 15240(0x3b88, float:2.1356E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r4)).mo56386p(r2)
            return
        L_0x0158:
            if (r4 != r8) goto L_0x015f
            java.lang.Object r0 = r0.f386647b
            com.google.android.d.hd r0 = (com.google.android.p10712d.C142487hd) r0
            goto L_0x0161
        L_0x015f:
            com.google.android.d.hd r0 = com.google.android.p10712d.C142487hd.f386669c
        L_0x0161:
            com.google.android.apps.gsa.staticplugins.bisto.o.ao r2 = r1.f267978a
            int r4 = r0.f386672b
            com.google.android.d.hq r4 = com.google.android.p10712d.C142500hq.m231092a(r4)
            if (r4 != 0) goto L_0x016d
            com.google.android.d.hq r4 = com.google.android.p10712d.C142500hq.UNRECOGNIZED
        L_0x016d:
            android.content.Context r5 = r2.f267984b
            com.google.android.apps.gsa.shared.bisto.k r6 = r2.f267987e
            java.lang.String r7 = r2.mo89692l()
            android.content.Intent r4 = com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95795ca.m158753b(r5, r4, r6, r7)
            if (r4 == 0) goto L_0x01fc
            com.google.android.d.gz r5 = com.google.android.p10712d.C142482gz.f386657c
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.d.gy r5 = (com.google.android.p10712d.C142481gy) r5
            java.lang.String r6 = r2.f267988f
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.android.d.gz r7 = (com.google.android.p10712d.C142482gz) r7
            r6.getClass()
            r7.f386659a = r6
            java.lang.String r6 = r2.mo89693n()
            if (r6 == 0) goto L_0x01a0
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.android.d.gz r7 = (com.google.android.p10712d.C142482gz) r7
            r7.f386660b = r6
        L_0x01a0:
            com.google.android.d.hf r6 = com.google.android.p10712d.C142489hf.f386673c
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.d.he r6 = (com.google.android.p10712d.C142488he) r6
            java.lang.String r0 = r0.f386671a
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.android.d.hf r7 = (com.google.android.p10712d.C142489hf) r7
            r0.getClass()
            r7.f386675a = r0
            com.google.protobuf.bv r0 = r5.build()
            com.google.android.d.gz r0 = (com.google.android.p10712d.C142482gz) r0
            r6.copyOnWrite()
            com.google.protobuf.bv r5 = r6.instance
            com.google.android.d.hf r5 = (com.google.android.p10712d.C142489hf) r5
            r0.getClass()
            r5.mo117137a()
            com.google.protobuf.cq r5 = r5.f386676b
            r5.add(r0)
            com.google.protobuf.bv r0 = r6.build()
            com.google.android.d.hf r0 = (com.google.android.p10712d.C142489hf) r0
            com.google.android.d.gp r5 = com.google.android.p10712d.C142472gp.f386640c
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.d.go r5 = (com.google.android.p10712d.C142471go) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.d.gp r6 = (com.google.android.p10712d.C142472gp) r6
            r0.getClass()
            r6.f386643b = r0
            r6.f386642a = r8
            com.google.protobuf.bv r0 = r5.build()
            com.google.android.d.gp r0 = (com.google.android.p10712d.C142472gp) r0
            byte[] r0 = r0.toByteArray()
            r4.putExtra(r3, r0)
            android.content.Context r0 = r2.f267984b
            r0.sendBroadcast(r4)
        L_0x01fc:
            return
        L_0x01fd:
            throw r11
        L_0x01fe:
            r0 = move-exception
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95724ao.f267982a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r2)
            java.lang.String r2 = "Failed to parse payload"
            r4 = 15235(0x3b83, float:2.1349E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r4)).mo56386p(r2)
        L_0x0211:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95722am.onReceive(android.content.Context, android.content.Intent):void");
    }
}
