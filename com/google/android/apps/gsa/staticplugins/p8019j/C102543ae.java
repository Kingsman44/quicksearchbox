package com.google.android.apps.gsa.staticplugins.p8019j;

import com.google.assistant.p3897e.p3921j.C51714bl;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.ae */
/* compiled from: PG */
public final /* synthetic */ class C102543ae implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C102550al f286177a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f286178b;

    /* renamed from: c */
    public final /* synthetic */ C51714bl f286179c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f286180d;

    /* renamed from: e */
    public final /* synthetic */ int f286181e;

    /* renamed from: f */
    public final /* synthetic */ C60870cx f286182f;

    public /* synthetic */ C102543ae(C102550al alVar, C60870cx cxVar, C51714bl blVar, C60870cx cxVar2, int i, C60870cx cxVar3) {
        this.f286177a = alVar;
        this.f286178b = cxVar;
        this.f286179c = blVar;
        this.f286180d = cxVar2;
        this.f286181e = i;
        this.f286182f = cxVar3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r12 = this;
            java.lang.String r0 = "DeviceCapHelper"
            com.google.android.apps.gsa.staticplugins.j.al r1 = r12.f286177a
            com.google.common.util.concurrent.cx r2 = r12.f286178b
            com.google.assistant.e.j.bl r3 = r12.f286179c
            com.google.common.util.concurrent.cx r4 = r12.f286180d
            int r5 = r12.f286181e
            com.google.common.util.concurrent.cx r6 = r12.f286182f
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            java.lang.Object r2 = com.google.common.util.concurrent.C60856cj.m92909r(r2)     // Catch:{ Exception -> 0x0018 }
            com.google.common.base.ax r2 = (com.google.common.base.C58833ax) r2     // Catch:{ Exception -> 0x0018 }
            r7 = r2
            goto L_0x002b
        L_0x0018:
            r2 = move-exception
            com.google.common.f.e r8 = com.google.android.apps.gsa.staticplugins.p8019j.C102550al.f286195a
            com.google.common.f.x r8 = r8.mo56225c()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r9, r0)
            java.lang.String r9 = "Could not retrieve car capabilities."
            r10 = 13975(0x3697, float:1.9583E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56382g(r2)).mo56372aa(r10)).mo56386p(r9)
        L_0x002b:
            boolean r2 = r7.mo56113h()
            r8 = 1
            if (r2 == 0) goto L_0x00a4
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.S3_HEADER_REQUEST_OEM_CAPABILITIES_COMPLETE
            r1.mo93331g(r2)
            com.google.protobuf.bv r2 = r3.instance
            com.google.assistant.e.j.bm r2 = (com.google.assistant.p3897e.p3921j.C51715bm) r2
            com.google.assistant.e.j.cy r2 = r2.f135671h
            if (r2 != 0) goto L_0x0041
            com.google.assistant.e.j.cy r2 = com.google.assistant.p3897e.p3921j.C51772cy.f135824p
        L_0x0041:
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.assistant.e.j.cx r2 = (com.google.assistant.p3897e.p3921j.C51771cx) r2
            com.google.protobuf.bv r9 = r3.instance
            com.google.assistant.e.j.bm r9 = (com.google.assistant.p3897e.p3921j.C51715bm) r9
            com.google.assistant.e.j.cy r9 = r9.f135671h
            if (r9 != 0) goto L_0x0051
            com.google.assistant.e.j.cy r9 = com.google.assistant.p3897e.p3921j.C51772cy.f135824p
        L_0x0051:
            com.google.assistant.e.j.ca r9 = r9.f135834i
            if (r9 != 0) goto L_0x0057
            com.google.assistant.e.j.ca r9 = com.google.assistant.p3897e.p3921j.C51748ca.f135762d
        L_0x0057:
            com.google.protobuf.bn r9 = r9.toBuilder()
            com.google.assistant.e.j.bz r9 = (com.google.assistant.p3897e.p3921j.C51728bz) r9
            java.lang.Object r7 = r7.mo56107c()
            java.lang.String r7 = (java.lang.String) r7
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.assistant.e.j.ca r10 = (com.google.assistant.p3897e.p3921j.C51748ca) r10
            r7.getClass()
            int r11 = r10.f135764a
            r11 = r11 | r8
            r10.f135764a = r11
            r10.f135765b = r7
            com.google.protobuf.bv r7 = r9.build()
            com.google.assistant.e.j.ca r7 = (com.google.assistant.p3897e.p3921j.C51748ca) r7
            r2.copyOnWrite()
            com.google.protobuf.bv r9 = r2.instance
            com.google.assistant.e.j.cy r9 = (com.google.assistant.p3897e.p3921j.C51772cy) r9
            r7.getClass()
            r9.f135834i = r7
            int r7 = r9.f135826a
            r7 = r7 | 128(0x80, float:1.794E-43)
            r9.f135826a = r7
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            com.google.assistant.e.j.bm r7 = (com.google.assistant.p3897e.p3921j.C51715bm) r7
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.j.cy r2 = (com.google.assistant.p3897e.p3921j.C51772cy) r2
            r2.getClass()
            r7.f135671h = r2
            int r2 = r7.f135664a
            r2 = r2 | 128(0x80, float:1.794E-43)
            r7.f135664a = r2
        L_0x00a4:
            dagger.a r2 = r1.f286203c
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r2 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r2
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250446dL
            boolean r2 = r2.mo79746e(r7)
            if (r2 != 0) goto L_0x00b6
            goto L_0x017e
        L_0x00b6:
            com.google.assistant.e.j.ci r2 = com.google.assistant.p3897e.p3921j.C51756ci.ALL_PERSONAL_DATA
            r7 = 0
            r9 = 6
            if (r5 != r9) goto L_0x00d0
            dagger.a r5 = r1.f286203c
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r5 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r5
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250527y
            boolean r5 = r5.mo79746e(r10)
            if (r5 == 0) goto L_0x00cf
            r5 = 6
            r10 = 1
            goto L_0x00d1
        L_0x00cf:
            r5 = 6
        L_0x00d0:
            r10 = 0
        L_0x00d1:
            dagger.a r11 = r1.f286207g
            java.lang.Object r11 = r11.mo27525b()
            com.google.android.apps.gsa.search.core.google.gaia.o r11 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r11
            android.accounts.Account r11 = r11.mo79668a()
            if (r11 != 0) goto L_0x00e0
            goto L_0x00e1
        L_0x00e0:
            r7 = 1
        L_0x00e1:
            r7 = r7 & r10
            if (r7 != 0) goto L_0x00e8
            r7 = 5
            if (r5 != r7) goto L_0x0111
            r5 = 5
        L_0x00e8:
            java.lang.Object r2 = com.google.common.util.concurrent.C60856cj.m92909r(r4)     // Catch:{ Exception -> 0x00f4 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x00f4 }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x00f4 }
            r2 = r2 ^ r8
            goto L_0x0108
        L_0x00f4:
            r2 = move-exception
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.p8019j.C102550al.f286195a
            com.google.common.f.x r4 = r4.mo56225c()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r7, r0)
            java.lang.String r7 = "Could not retrieve is personal response disabled."
            r10 = 13977(0x3699, float:1.9586E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r2)).mo56372aa(r10)).mo56386p(r7)
            r2 = 1
        L_0x0108:
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            if (r2 == 0) goto L_0x010f
            com.google.assistant.e.j.ci r2 = com.google.assistant.p3897e.p3921j.C51756ci.NO_PERSONAL_DATA
            goto L_0x0111
        L_0x010f:
            com.google.assistant.e.j.ci r2 = com.google.assistant.p3897e.p3921j.C51756ci.ALL_PERSONAL_DATA
        L_0x0111:
            if (r5 != r9) goto L_0x0126
            dagger.a r4 = r1.f286203c
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r4 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r4
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250328b
            boolean r4 = r4.mo79746e(r5)
            if (r4 == 0) goto L_0x0126
            com.google.assistant.e.j.ck r4 = com.google.assistant.p3897e.p3921j.C51758ck.ALL_PROACTIVE_NOTIFICATIONS
            goto L_0x0128
        L_0x0126:
            com.google.assistant.e.j.ck r4 = com.google.assistant.p3897e.p3921j.C51758ck.NO_PROACTIVE_NOTIFICATION
        L_0x0128:
            com.google.assistant.e.j.cg r5 = com.google.assistant.p3897e.p3921j.C51754cg.f135778e
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.e.j.cf r5 = (com.google.assistant.p3897e.p3921j.C51753cf) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.e.j.cg r7 = (com.google.assistant.p3897e.p3921j.C51754cg) r7
            int r2 = r2.f135790e
            r7.f135781b = r2
            int r2 = r7.f135780a
            r2 = r2 | r8
            r7.f135780a = r2
            com.google.assistant.e.j.dr r2 = com.google.assistant.p3897e.p3921j.C51802dr.ALL_YOUTUBE_CONTENT
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.e.j.cg r7 = (com.google.assistant.p3897e.p3921j.C51754cg) r7
            int r2 = r2.f135922c
            r7.f135782c = r2
            int r2 = r7.f135780a
            r2 = r2 | 2
            r7.f135780a = r2
            r5.copyOnWrite()
            com.google.protobuf.bv r2 = r5.instance
            com.google.assistant.e.j.cg r2 = (com.google.assistant.p3897e.p3921j.C51754cg) r2
            int r4 = r4.f135796d
            r2.f135783d = r4
            int r4 = r2.f135780a
            r4 = r4 | 16
            r2.f135780a = r4
            r3.copyOnWrite()
            com.google.protobuf.bv r2 = r3.instance
            com.google.assistant.e.j.bm r2 = (com.google.assistant.p3897e.p3921j.C51715bm) r2
            com.google.protobuf.bv r4 = r5.build()
            com.google.assistant.e.j.cg r4 = (com.google.assistant.p3897e.p3921j.C51754cg) r4
            com.google.assistant.e.j.bm r5 = com.google.assistant.p3897e.p3921j.C51715bm.f135662t
            r4.getClass()
            r2.f135672i = r4
            int r4 = r2.f135664a
            r4 = r4 | 256(0x100, float:3.59E-43)
            r2.f135664a = r4
        L_0x017e:
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
            java.lang.Object r4 = com.google.common.util.concurrent.C60856cj.m92909r(r6)     // Catch:{ all -> 0x0188 }
            com.google.common.base.ax r4 = (com.google.common.base.C58833ax) r4     // Catch:{ all -> 0x0188 }
            r2 = r4
            goto L_0x019b
        L_0x0188:
            r4 = move-exception
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.p8019j.C102550al.f286195a
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r6, r0)
            java.lang.String r0 = "Could not retrieve car device model ID."
            r6 = 13965(0x368d, float:1.9569E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r4)).mo56372aa(r6)).mo56386p(r0)
        L_0x019b:
            boolean r0 = r2.mo56113h()
            if (r0 != 0) goto L_0x01a4
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x0211
        L_0x01a4:
            com.google.protobuf.bv r0 = r3.instance
            com.google.assistant.e.j.bm r0 = (com.google.assistant.p3897e.p3921j.C51715bm) r0
            com.google.assistant.e.j.cy r0 = r0.f135671h
            if (r0 != 0) goto L_0x01ae
            com.google.assistant.e.j.cy r0 = com.google.assistant.p3897e.p3921j.C51772cy.f135824p
        L_0x01ae:
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.assistant.e.j.cx r0 = (com.google.assistant.p3897e.p3921j.C51771cx) r0
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.e.j.cy r4 = (com.google.assistant.p3897e.p3921j.C51772cy) r4
            com.google.assistant.e.j.ca r4 = r4.f135834i
            if (r4 != 0) goto L_0x01be
            com.google.assistant.e.j.ca r4 = com.google.assistant.p3897e.p3921j.C51748ca.f135762d
        L_0x01be:
            com.google.protobuf.bn r4 = r4.toBuilder()
            com.google.assistant.e.j.bz r4 = (com.google.assistant.p3897e.p3921j.C51728bz) r4
            java.lang.Object r2 = r2.mo56107c()
            java.lang.String r2 = (java.lang.String) r2
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.e.j.ca r5 = (com.google.assistant.p3897e.p3921j.C51748ca) r5
            r2.getClass()
            int r6 = r5.f135764a
            r6 = r6 | 16
            r5.f135764a = r6
            r5.f135766c = r2
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.j.cy r2 = (com.google.assistant.p3897e.p3921j.C51772cy) r2
            com.google.protobuf.bv r4 = r4.build()
            com.google.assistant.e.j.ca r4 = (com.google.assistant.p3897e.p3921j.C51748ca) r4
            r4.getClass()
            r2.f135834i = r4
            int r4 = r2.f135826a
            r4 = r4 | 128(0x80, float:1.794E-43)
            r2.f135826a = r4
            r3.copyOnWrite()
            com.google.protobuf.bv r2 = r3.instance
            com.google.assistant.e.j.bm r2 = (com.google.assistant.p3897e.p3921j.C51715bm) r2
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.cy r0 = (com.google.assistant.p3897e.p3921j.C51772cy) r0
            r0.getClass()
            r2.f135671h = r0
            int r0 = r2.f135664a
            r0 = r0 | 128(0x80, float:1.794E-43)
            r2.f135664a = r0
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.S3_HEADER_REQUEST_ASSISTANT_SDK_DEVICE_PARAMS_COMPLETE
            r1.mo93331g(r0)
        L_0x0211:
            dagger.a r0 = r1.f286205e
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.b r0 = (com.google.android.apps.gsa.search.core.p6805i.C86106b) r0
            java.lang.String r0 = r0.mo79727b()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0287
            com.google.assistant.e.j.rj r2 = com.google.assistant.p3897e.p3921j.C52428rj.f137558m
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.ri r2 = (com.google.assistant.p3897e.p3921j.C52427ri) r2
            com.google.assistant.e.j.rh r4 = com.google.assistant.p3897e.p3921j.C52426rh.f137553d
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.j.rg r4 = (com.google.assistant.p3897e.p3921j.C52425rg) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.e.j.rh r5 = (com.google.assistant.p3897e.p3921j.C52426rh) r5
            r0.getClass()
            int r6 = r5.f137555a
            r6 = r6 | r8
            r5.f137555a = r6
            r5.f137556b = r0
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.e.j.rj r5 = (com.google.assistant.p3897e.p3921j.C52428rj) r5
            com.google.protobuf.bv r4 = r4.build()
            com.google.assistant.e.j.rh r4 = (com.google.assistant.p3897e.p3921j.C52426rh) r4
            r4.getClass()
            r5.f137566g = r4
            int r4 = r5.f137560a
            r4 = r4 | 128(0x80, float:1.794E-43)
            r5.f137560a = r4
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.assistant.e.j.rj r4 = (com.google.assistant.p3897e.p3921j.C52428rj) r4
            r0.getClass()
            int r5 = r4.f137560a
            r5 = r5 | 8
            r4.f137560a = r5
            r4.f137563d = r0
            com.google.protobuf.bv r0 = r2.build()
            com.google.assistant.e.j.rj r0 = (com.google.assistant.p3897e.p3921j.C52428rj) r0
            r3.copyOnWrite()
            com.google.protobuf.bv r2 = r3.instance
            com.google.assistant.e.j.bm r2 = (com.google.assistant.p3897e.p3921j.C51715bm) r2
            com.google.assistant.e.j.bm r4 = com.google.assistant.p3897e.p3921j.C51715bm.f135662t
            r0.getClass()
            r2.f135665b = r0
            int r0 = r2.f135664a
            r0 = r0 | r8
            r2.f135664a = r0
        L_0x0287:
            com.google.android.apps.gsa.shared.s.a.a r0 = r1.f286210j
            boolean r0 = r0.mo84225b()
            if (r0 == 0) goto L_0x0292
            android.os.Trace.endSection()
        L_0x0292:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p8019j.C102543ae.call():java.lang.Object");
    }
}
