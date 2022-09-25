package com.google.android.apps.gsa.staticplugins.opa.p8365h.p8366a;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106546e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106551f;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106559h;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.h.a.ab */
/* compiled from: PG */
final class C109143ab implements C106551f, C90991b {

    /* renamed from: a */
    public final C106559h f303930a;

    /* renamed from: b */
    final /* synthetic */ C109144ac f303931b;

    public C109143ab(C109144ac acVar, C106559h hVar) {
        this.f303931b = acVar;
        this.f303930a = hVar;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.C60870cx mo95574a(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8219f.C106555d
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0050
            com.google.android.apps.gsa.staticplugins.opa.h.a.ac r4 = r8.f303931b
            com.google.common.f.a.d r4 = r4.f303932a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.a.a r4 = (com.google.common.p4526f.p4527a.C58970a) r4
            r5 = 23887(0x5d4f, float:3.3473E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)
            com.google.common.f.a.a r4 = (com.google.common.p4526f.p4527a.C58970a) r4
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.h r5 = r8.f303930a
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.e r5 = r5.mo95576a()
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d r5 = r5.mo95556a()
            java.lang.String r5 = r5.name()
            r6 = r9
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.f.d r6 = (com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8219f.C106555d) r6
            int r6 = r6.f297131a
            int r6 = com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8219f.C106554c.m177337a(r6)
            if (r6 != 0) goto L_0x0033
            goto L_0x0048
        L_0x0033:
            if (r6 == r3) goto L_0x0048
            if (r6 == r2) goto L_0x0045
            if (r6 == r1) goto L_0x0042
            r7 = 4
            if (r6 == r7) goto L_0x003f
            java.lang.String r6 = "OPT_IN_STATE"
            goto L_0x004a
        L_0x003f:
            java.lang.String r6 = "LAUNCHER_VISIBILITY"
            goto L_0x004a
        L_0x0042:
            java.lang.String r6 = "SCREEN_ON"
            goto L_0x004a
        L_0x0045:
            java.lang.String r6 = "TIME_TICK"
            goto L_0x004a
        L_0x0048:
            java.lang.String r6 = "UNSPECIFIED"
        L_0x004a:
            java.lang.String r7 = "onTrigger(): %s %s"
            r4.mo56354G(r7, r5, r6)
            goto L_0x006d
        L_0x0050:
            com.google.android.apps.gsa.staticplugins.opa.h.a.ac r4 = r8.f303931b
            com.google.common.f.a.d r4 = r4.f303932a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.h r5 = r8.f303930a
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.e r5 = r5.mo95576a()
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d r5 = r5.mo95556a()
            java.lang.String r5 = r5.name()
            r6 = 23886(0x5d4e, float:3.3471E-41)
            java.lang.String r7 = "onTrigger(): %s"
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r4).mo56372aa(r6)).mo56389s(r7, r5)
        L_0x006d:
            java.lang.String r4 = "AmbientBroadcastReceiverServiceClientImpl#onTrigger"
            com.google.apps.tiktok.tracing.bi r4 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r4)
            com.google.android.apps.gsa.staticplugins.opa.h.a.ac r5 = r8.f303931b     // Catch:{ all -> 0x01b0 }
            android.app.ActivityManager r5 = r5.f303934c     // Catch:{ all -> 0x01b0 }
            java.util.List r5 = r5.getRunningAppProcesses()     // Catch:{ all -> 0x01b0 }
            j$.util.stream.Stream r5 = p3186j$.util.Collection.EL.stream(r5)     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.staticplugins.opa.h.a.aa r6 = com.google.android.apps.gsa.staticplugins.opa.p8365h.p8366a.C109142aa.f303929a     // Catch:{ all -> 0x01b0 }
            boolean r5 = r5.anyMatch(r6)     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.staticplugins.opa.h.a.ac r6 = r8.f303931b     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.shared.util.v.g r6 = r6.f303938g     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90017bw.f247909aX     // Catch:{ all -> 0x01b0 }
            boolean r6 = r6.mo85405j(r7)     // Catch:{ all -> 0x01b0 }
            if (r6 != 0) goto L_0x012c
            boolean r6 = r9 instanceof com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106532f     // Catch:{ all -> 0x01b0 }
            if (r6 == 0) goto L_0x0097
            goto L_0x012c
        L_0x0097:
            if (r5 != 0) goto L_0x0161
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.k r5 = com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106599k.f297221e     // Catch:{ all -> 0x01b0 }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.j r5 = (com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106598j) r5     // Catch:{ all -> 0x01b0 }
            if (r0 == 0) goto L_0x00b4
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.f.d r9 = (com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8219f.C106555d) r9     // Catch:{ all -> 0x01b0 }
            r5.copyOnWrite()     // Catch:{ all -> 0x01b0 }
            com.google.protobuf.bv r0 = r5.instance     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.k r0 = (com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106599k) r0     // Catch:{ all -> 0x01b0 }
            r9.getClass()     // Catch:{ all -> 0x01b0 }
            r0.f297225c = r9     // Catch:{ all -> 0x01b0 }
            r0.f297224b = r2     // Catch:{ all -> 0x01b0 }
            goto L_0x00c8
        L_0x00b4:
            boolean r0 = r9 instanceof com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8225l.C106586c     // Catch:{ all -> 0x01b0 }
            if (r0 == 0) goto L_0x00c8
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.l.c r9 = (com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8225l.C106586c) r9     // Catch:{ all -> 0x01b0 }
            r5.copyOnWrite()     // Catch:{ all -> 0x01b0 }
            com.google.protobuf.bv r0 = r5.instance     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.k r0 = (com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106599k) r0     // Catch:{ all -> 0x01b0 }
            r9.getClass()     // Catch:{ all -> 0x01b0 }
            r0.f297225c = r9     // Catch:{ all -> 0x01b0 }
            r0.f297224b = r1     // Catch:{ all -> 0x01b0 }
        L_0x00c8:
            com.google.android.apps.gsa.staticplugins.opa.h.a.ac r9 = r8.f303931b     // Catch:{ all -> 0x01b0 }
            com.google.android.libraries.f.a r9 = r9.f303940i     // Catch:{ all -> 0x01b0 }
            long r0 = r9.mo26870b()     // Catch:{ all -> 0x01b0 }
            r5.copyOnWrite()     // Catch:{ all -> 0x01b0 }
            com.google.protobuf.bv r9 = r5.instance     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.k r9 = (com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106599k) r9     // Catch:{ all -> 0x01b0 }
            int r2 = r9.f297223a     // Catch:{ all -> 0x01b0 }
            r2 = r2 | r3
            r9.f297223a = r2     // Catch:{ all -> 0x01b0 }
            r9.f297226d = r0     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.staticplugins.opa.h.a.ac r9 = r8.f303931b     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.i r9 = r9.f303941j     // Catch:{ all -> 0x01b0 }
            r9.copyOnWrite()     // Catch:{ all -> 0x01b0 }
            com.google.protobuf.bv r9 = r9.instance     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.l r9 = (com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106600l) r9     // Catch:{ all -> 0x01b0 }
            com.google.protobuf.bv r0 = r5.build()     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.k r0 = (com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106599k) r0     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.l r1 = com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106600l.f297227d     // Catch:{ all -> 0x01b0 }
            r0.getClass()     // Catch:{ all -> 0x01b0 }
            com.google.protobuf.cq r1 = r9.f297231c     // Catch:{ all -> 0x01b0 }
            boolean r2 = r1.mo58948c()     // Catch:{ all -> 0x01b0 }
            if (r2 != 0) goto L_0x0102
            com.google.protobuf.cq r1 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r1)     // Catch:{ all -> 0x01b0 }
            r9.f297231c = r1     // Catch:{ all -> 0x01b0 }
        L_0x0102:
            com.google.protobuf.cq r9 = r9.f297231c     // Catch:{ all -> 0x01b0 }
            r9.add(r0)     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.staticplugins.opa.h.a.ac r9 = r8.f303931b     // Catch:{ all -> 0x01b0 }
            com.google.common.f.a.d r9 = r9.f303932a     // Catch:{ all -> 0x01b0 }
            com.google.common.f.x r9 = r9.mo56226d()     // Catch:{ all -> 0x01b0 }
            java.lang.String r0 = "Dropping %s, because :search is not running"
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.h r1 = r8.f303930a     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.e r1 = r1.mo95576a()     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d r1 = r1.mo95556a()     // Catch:{ all -> 0x01b0 }
            java.lang.String r1 = r1.name()     // Catch:{ all -> 0x01b0 }
            r2 = 23884(0x5d4c, float:3.3469E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r9).mo56372aa(r2)).mo56389s(r0, r1)     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.x.c r9 = com.google.android.apps.gsa.p8883x.C118826c.f331422a     // Catch:{ all -> 0x01b0 }
            com.google.common.util.concurrent.cx r9 = com.google.common.util.concurrent.C60856cj.m92900i(r9)     // Catch:{ all -> 0x01b0 }
            goto L_0x01a9
        L_0x012c:
            com.google.android.apps.gsa.staticplugins.opa.h.a.ac r0 = r8.f303931b     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.i r0 = r0.f303941j     // Catch:{ all -> 0x01b0 }
            r1 = r5 ^ 1
            r0.copyOnWrite()     // Catch:{ all -> 0x01b0 }
            com.google.protobuf.bv r0 = r0.instance     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.l r0 = (com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106600l) r0     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.l r2 = com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106600l.f297227d     // Catch:{ all -> 0x01b0 }
            int r2 = r0.f297229a     // Catch:{ all -> 0x01b0 }
            r2 = r2 | r3
            r0.f297229a = r2     // Catch:{ all -> 0x01b0 }
            r0.f297230b = r1     // Catch:{ all -> 0x01b0 }
            if (r5 != 0) goto L_0x0161
            com.google.android.apps.gsa.staticplugins.opa.h.a.ac r0 = r8.f303931b     // Catch:{ all -> 0x01b0 }
            com.google.common.f.a.d r0 = r0.f303932a     // Catch:{ all -> 0x01b0 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x01b0 }
            java.lang.String r1 = "Starting :search to process %s"
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.h r2 = r8.f303930a     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.e r2 = r2.mo95576a()     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d r2 = r2.mo95556a()     // Catch:{ all -> 0x01b0 }
            java.lang.String r2 = r2.name()     // Catch:{ all -> 0x01b0 }
            r5 = 23885(0x5d4d, float:3.347E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r5)).mo56389s(r1, r2)     // Catch:{ all -> 0x01b0 }
        L_0x0161:
            com.google.android.apps.gsa.staticplugins.opa.h.a.ac r0 = r8.f303931b     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.i r0 = r0.f303941j     // Catch:{ all -> 0x01b0 }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.l r0 = (com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106600l) r0     // Catch:{ all -> 0x01b0 }
            byte[] r0 = r0.toByteArray()     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.staticplugins.opa.h.a.ac r1 = r8.f303931b     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.i r1 = r1.f303941j     // Catch:{ all -> 0x01b0 }
            r1.clear()     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.staticplugins.opa.h.a.ac r1 = r8.f303931b     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.staticplugins.opa.h.s r1 = r1.f303935d     // Catch:{ all -> 0x01b0 }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ all -> 0x01b0 }
            java.lang.String r5 = "com.google.android.apps.gsa.staticplugins.opa.ambient.context.ACTION_PROCESS_TRIGGER"
            r2.<init>(r5)     // Catch:{ all -> 0x01b0 }
            java.lang.String r5 = "event"
            byte[] r9 = r9.toByteArray()     // Catch:{ all -> 0x01b0 }
            android.content.Intent r9 = r2.putExtra(r5, r9)     // Catch:{ all -> 0x01b0 }
            java.lang.String r2 = "source"
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.h r5 = r8.f303930a     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.e r5 = r5.mo95576a()     // Catch:{ all -> 0x01b0 }
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d r5 = r5.mo95556a()     // Catch:{ all -> 0x01b0 }
            java.lang.String r5 = r5.name()     // Catch:{ all -> 0x01b0 }
            android.content.Intent r9 = r9.putExtra(r2, r5)     // Catch:{ all -> 0x01b0 }
            java.lang.String r2 = "stats"
            android.content.Intent r9 = r9.putExtra(r2, r0)     // Catch:{ all -> 0x01b0 }
            com.google.common.util.concurrent.cx r9 = r1.mo97656a(r9)     // Catch:{ all -> 0x01b0 }
        L_0x01a9:
            r4.mo51417a(r9)     // Catch:{ all -> 0x01b0 }
            r4.close()
            return r9
        L_0x01b0:
            r9 = move-exception
            r4.close()     // Catch:{ all -> 0x01b5 }
            goto L_0x01cc
        L_0x01b5:
            r0 = move-exception
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x01cc }
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            r4 = 0
            r1[r4] = r2     // Catch:{ Exception -> 0x01cc }
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r1 = r2.getDeclaredMethod(r5, r1)     // Catch:{ Exception -> 0x01cc }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01cc }
            r2[r4] = r0     // Catch:{ Exception -> 0x01cc }
            r1.invoke(r9, r2)     // Catch:{ Exception -> 0x01cc }
        L_0x01cc:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8365h.p8366a.C109143ab.mo95574a(java.lang.Object):com.google.common.util.concurrent.cx");
    }

    /* renamed from: b */
    public final C106546e mo97635b() {
        return this.f303930a.mo95576a();
    }

    /* renamed from: c */
    public final C60870cx mo97636c() {
        C60870cx b = this.f303930a.mo95577b(this);
        C46459k.m82829b(b, "failed to start", new Object[0]);
        return b;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("MonitorAndListener");
        fVar.mo85292s(C90752i.m148229c(this.f303930a.mo95576a().mo95556a().name()));
        fVar.mo85286m(this.f303930a);
    }
}
