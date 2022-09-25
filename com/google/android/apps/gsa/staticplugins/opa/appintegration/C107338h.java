package com.google.android.apps.gsa.staticplugins.opa.appintegration;

import com.google.android.apps.gsa.search.core.google.p6790a.C85812bd;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.h */
/* compiled from: PG */
public final class C107338h implements C85812bd {

    /* renamed from: a */
    private static final C59071e f298722a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.appintegration.h");

    /* renamed from: b */
    private final C58833ax f298723b;

    /* renamed from: c */
    private final C68214a f298724c;

    /* renamed from: d */
    private final C68214a f298725d;

    public C107338h(C58833ax axVar, C68214a aVar, C68214a aVar2) {
        this.f298723b = axVar;
        this.f298724c = aVar;
        this.f298725d = aVar2;
    }

    /* renamed from: b */
    private static boolean m178196b(String str) {
        if (str != null && str.startsWith("and.opa.appinteg.am")) {
            return false;
        }
        C59104x d = f298722a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AppIntegContextPPF");
        ((C59052c) ((C59052c) d).mo56372aa(23664)).mo56389s("skipping MessagingAppParam for wrong source: %s", str);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.base.C58833ax mo79460a(com.google.android.apps.gsa.shared.search.Query r12) {
        /*
            r11 = this;
            java.lang.String r0 = r12.mo84351bj()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x000d
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
            return r12
        L_0x000d:
            com.google.common.f.e r1 = f298722a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "AppIntegContextPPF"
            r1.mo56378ag(r2, r3)
            java.lang.String r2 = "Generate ProtoBufMapEntry: %s"
            r4 = 23656(0x5c68, float:3.3149E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r4)).mo56389s(r2, r12)
            com.google.assistant.e.i.a.aa r1 = com.google.assistant.p3897e.p3917i.p3918a.C51231aa.f133382f
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.i.a.z r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51636z) r1
            com.google.assistant.e.c.c.gh r2 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.c.c.gg r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51097gg) r2
            com.google.assistant.e.c.c.ev r4 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.c.c.es r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51055es) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.e.c.c.ev r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r5
            r0.getClass()
            int r6 = r5.f132943a
            r7 = 1
            r6 = r6 | r7
            r5.f132943a = r6
            r5.f132944b = r0
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.e.c.c.gh r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r5
            com.google.protobuf.bv r4 = r4.build()
            com.google.assistant.e.c.c.ev r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r4
            r4.getClass()
            r5.f133013c = r4
            r5.f133012b = r7
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.assistant.e.i.a.aa r4 = (com.google.assistant.p3897e.p3917i.p3918a.C51231aa) r4
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.c.c.gh r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r2
            r2.getClass()
            r4.f133385b = r2
            int r2 = r4.f133384a
            r2 = r2 | r7
            r4.f133384a = r2
            dagger.a r2 = r11.f298725d
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r2 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r2
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247045J
            boolean r2 = r2.mo79746e(r4)
            r4 = 0
            if (r2 == 0) goto L_0x00ab
            java.lang.String r2 = "android.opa.extra.APP_INTEGRATION_CLIENT_VOICE_PLATE_PARAMS"
            byte[] r2 = r12.mo84440dU(r2)
            if (r2 == 0) goto L_0x00ab
            com.google.android.libraries.assistant.d.c.c.aj r5 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17880aj.f51221i     // Catch:{ ct -> 0x0098 }
            com.google.protobuf.bv r2 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r5, (byte[]) r2)     // Catch:{ ct -> 0x0098 }
            com.google.android.libraries.assistant.d.c.c.aj r2 = (com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17880aj) r2     // Catch:{ ct -> 0x0098 }
            goto L_0x00ac
        L_0x0098:
            r2 = move-exception
            com.google.common.f.e r5 = f298722a
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r6, r3)
            java.lang.String r6 = "Cannot parse the given voice plate params"
            r8 = 23663(0x5c6f, float:3.3159E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r2)).mo56372aa(r8)).mo56386p(r6)
        L_0x00ab:
            r2 = r4
        L_0x00ac:
            if (r2 != 0) goto L_0x00c3
            com.google.common.base.ax r2 = r11.f298723b
            boolean r2 = r2.mo56113h()
            if (r2 == 0) goto L_0x00c4
            com.google.common.base.ax r2 = r11.f298723b
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.apps.gsa.assistant.shared.bd r2 = (com.google.android.apps.gsa.assistant.shared.bd) r2
            com.google.android.libraries.assistant.d.c.c.aj r4 = r2.k(r0)
            goto L_0x00c4
        L_0x00c3:
            r4 = r2
        L_0x00c4:
            dagger.a r2 = r11.f298725d
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r2 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r2
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247041F
            boolean r2 = r2.mo79746e(r5)
            if (r2 == 0) goto L_0x00f0
            com.google.common.b.gu r2 = com.google.android.apps.gsa.shared.util.C90721ae.f253799h
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L_0x00f0
            if (r4 == 0) goto L_0x00ed
            dagger.a r2 = r11.f298724c
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.assistant.shared.be r2 = (com.google.android.apps.gsa.assistant.shared.be) r2
            boolean r2 = r2.i(r4)
            if (r2 == 0) goto L_0x00ed
            goto L_0x00f0
        L_0x00ed:
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
            return r12
        L_0x00f0:
            if (r4 == 0) goto L_0x02cb
            int r2 = r4.f51223a
            r2 = r2 & 16
            if (r2 == 0) goto L_0x010c
            java.lang.String r2 = r4.f51228f
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.assistant.e.i.a.aa r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51231aa) r5
            r2.getClass()
            int r6 = r5.f133384a
            r6 = r6 | 2
            r5.f133384a = r6
            r5.f133386c = r2
        L_0x010c:
            int r2 = r4.f51223a
            r2 = r2 & 8
            java.lang.String r5 = "assistant.api.params.MessagingAppParam"
            if (r2 == 0) goto L_0x01a6
            com.google.android.libraries.assistant.d.c.c.ae r2 = r4.f51227e
            if (r2 != 0) goto L_0x011a
            com.google.android.libraries.assistant.d.c.c.ae r2 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17875ae.f51212c
        L_0x011a:
            java.lang.String r6 = r2.f51214a
            java.lang.String r2 = r2.f51215b
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            if (r8 != 0) goto L_0x01a6
            boolean r8 = android.text.TextUtils.isEmpty(r2)
            if (r8 != 0) goto L_0x01a6
            java.lang.String r8 = r12.mo84355bn()
            boolean r8 = m178196b(r8)
            if (r8 != 0) goto L_0x01a6
            com.google.common.f.e r8 = f298722a
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r9, r3)
            java.lang.String r9 = "Create a MessagingAppParam from conversation context"
            r10 = 23661(0x5c6d, float:3.3156E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r10)).mo56386p(r9)
            com.google.assistant.e.i.a.ij r8 = com.google.assistant.p3897e.p3917i.p3918a.C51456ij.f134037d
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.i.a.ii r8 = (com.google.assistant.p3897e.p3917i.p3918a.C51455ii) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.assistant.e.i.a.ij r9 = (com.google.assistant.p3897e.p3917i.p3918a.C51456ij) r9
            r6.getClass()
            int r10 = r9.f134039a
            r10 = r10 | r7
            r9.f134039a = r10
            r9.f134040b = r6
            r8.copyOnWrite()
            com.google.protobuf.bv r6 = r8.instance
            com.google.assistant.e.i.a.ij r6 = (com.google.assistant.p3897e.p3917i.p3918a.C51456ij) r6
            r2.getClass()
            int r9 = r6.f134039a
            r9 = r9 | 2
            r6.f134039a = r9
            r6.f134041c = r2
            com.google.protobuf.bv r2 = r8.build()
            com.google.assistant.e.i.a.ij r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51456ij) r2
            com.google.assistant.e.j.ka r6 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.j.jz r6 = (com.google.assistant.p3897e.p3921j.C52228jz) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.assistant.e.j.ka r8 = (com.google.assistant.p3897e.p3921j.C52230ka) r8
            int r9 = r8.f137059a
            r9 = r9 | r7
            r8.f137059a = r9
            r8.f137060b = r5
            com.google.protobuf.z r2 = r2.toByteString()
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.assistant.e.j.ka r8 = (com.google.assistant.p3897e.p3921j.C52230ka) r8
            r2.getClass()
            int r9 = r8.f137059a
            r9 = r9 | 2
            r8.f137059a = r9
            r8.f137061c = r2
            r1.mo53669a(r6)
        L_0x01a6:
            int r2 = r4.f51223a
            r2 = r2 & 64
            if (r2 == 0) goto L_0x02cb
            com.google.android.libraries.assistant.d.c.c.ab r2 = r4.f51230h
            if (r2 != 0) goto L_0x01b2
            com.google.android.libraries.assistant.d.c.c.ab r2 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17872ab.f51209b
        L_0x01b2:
            com.google.protobuf.cq r2 = r2.f51211a
            java.util.Iterator r2 = r2.iterator()
        L_0x01b8:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x02cb
            java.lang.Object r4 = r2.next()
            com.google.android.libraries.assistant.d.c.c.z r4 = (com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17924z) r4
            int r6 = r4.f51350a
            r8 = r6 & 1
            if (r8 == 0) goto L_0x01b8
            r6 = r6 & 2
            if (r6 == 0) goto L_0x01b8
            dagger.a r6 = r11.f298725d
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r6 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r6
            com.google.android.apps.gsa.shared.m.h r8 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247042G
            com.google.common.b.gu r6 = r6.mo79745c(r8)
            java.lang.String r8 = r4.f51351b
            boolean r6 = r6.contains(r8)
            if (r6 != 0) goto L_0x0201
            com.google.common.f.e r6 = f298722a
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r8, r3)
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            r8 = 23660(0x5c6c, float:3.3155E-41)
            com.google.common.f.x r6 = r6.mo56372aa(r8)
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            java.lang.String r8 = "Unsupported app context type: %s."
            java.lang.String r4 = r4.f51351b
            r6.mo56389s(r8, r4)
            goto L_0x01b8
        L_0x0201:
            java.lang.String r6 = r4.f51351b     // Catch:{ ct -> 0x02ad }
            java.lang.String r8 = "assistant.api.params.HomeAppParam"
            boolean r6 = r6.equals(r8)     // Catch:{ ct -> 0x02ad }
            if (r6 == 0) goto L_0x0216
            com.google.protobuf.z r6 = r4.f51352c     // Catch:{ ct -> 0x02ad }
            com.google.assistant.e.i.a.he r8 = com.google.assistant.p3897e.p3917i.p3918a.C51424he.f133945a     // Catch:{ ct -> 0x02ad }
            com.google.protobuf.bv r6 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r8, (com.google.protobuf.C63088z) r6)     // Catch:{ ct -> 0x02ad }
            com.google.assistant.e.i.a.he r6 = (com.google.assistant.p3897e.p3917i.p3918a.C51424he) r6     // Catch:{ ct -> 0x02ad }
            goto L_0x0279
        L_0x0216:
            java.lang.String r6 = r4.f51351b     // Catch:{ ct -> 0x02ad }
            java.lang.String r8 = "assistant.api.params.ImeAppParams"
            boolean r6 = r6.equals(r8)     // Catch:{ ct -> 0x02ad }
            if (r6 == 0) goto L_0x022b
            com.google.protobuf.z r6 = r4.f51352c     // Catch:{ ct -> 0x02ad }
            com.google.assistant.e.i.a.hg r8 = com.google.assistant.p3897e.p3917i.p3918a.C51426hg.f133947a     // Catch:{ ct -> 0x02ad }
            com.google.protobuf.bv r6 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r8, (com.google.protobuf.C63088z) r6)     // Catch:{ ct -> 0x02ad }
            com.google.assistant.e.i.a.hg r6 = (com.google.assistant.p3897e.p3917i.p3918a.C51426hg) r6     // Catch:{ ct -> 0x02ad }
            goto L_0x0279
        L_0x022b:
            java.lang.String r6 = r4.f51351b     // Catch:{ ct -> 0x02ad }
            boolean r6 = r6.equals(r5)     // Catch:{ ct -> 0x02ad }
            if (r6 == 0) goto L_0x0262
            com.google.common.f.e r6 = f298722a     // Catch:{ ct -> 0x02ad }
            com.google.common.f.x r6 = r6.mo56224b()     // Catch:{ ct -> 0x02ad }
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ct -> 0x02ad }
            r6.mo56378ag(r8, r3)     // Catch:{ ct -> 0x02ad }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ ct -> 0x02ad }
            r8 = 23659(0x5c6b, float:3.3153E-41)
            com.google.common.f.x r6 = r6.mo56372aa(r8)     // Catch:{ ct -> 0x02ad }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ ct -> 0x02ad }
            java.lang.String r8 = "Found MessagingAppParam in AppContext in package %s"
            r6.mo56389s(r8, r0)     // Catch:{ ct -> 0x02ad }
            com.google.protobuf.z r6 = r4.f51352c     // Catch:{ ct -> 0x02ad }
            com.google.assistant.e.i.a.ij r8 = com.google.assistant.p3897e.p3917i.p3918a.C51456ij.f134037d     // Catch:{ ct -> 0x02ad }
            com.google.protobuf.bv r6 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r8, (com.google.protobuf.C63088z) r6)     // Catch:{ ct -> 0x02ad }
            com.google.assistant.e.i.a.ij r6 = (com.google.assistant.p3897e.p3917i.p3918a.C51456ij) r6     // Catch:{ ct -> 0x02ad }
            java.lang.String r6 = r12.mo84355bn()     // Catch:{ ct -> 0x02ad }
            boolean r6 = m178196b(r6)     // Catch:{ ct -> 0x02ad }
            if (r6 != 0) goto L_0x01b8
            goto L_0x0279
        L_0x0262:
            java.lang.String r6 = r4.f51351b     // Catch:{ ct -> 0x02ad }
            java.lang.String r8 = "assistant.api.params.NavigationAppParam"
            boolean r6 = r6.equals(r8)     // Catch:{ ct -> 0x02ad }
            if (r6 == 0) goto L_0x0277
            com.google.protobuf.z r6 = r4.f51352c     // Catch:{ ct -> 0x02ad }
            com.google.assistant.e.i.a.jd r8 = com.google.assistant.p3897e.p3917i.p3918a.C51477jd.f134130a     // Catch:{ ct -> 0x02ad }
            com.google.protobuf.bv r6 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r8, (com.google.protobuf.C63088z) r6)     // Catch:{ ct -> 0x02ad }
            com.google.assistant.e.i.a.jd r6 = (com.google.assistant.p3897e.p3917i.p3918a.C51477jd) r6     // Catch:{ ct -> 0x02ad }
            goto L_0x0279
        L_0x0277:
            java.lang.String r6 = r4.f51351b     // Catch:{ ct -> 0x02ad }
        L_0x0279:
            com.google.assistant.e.j.ka r6 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.j.jz r6 = (com.google.assistant.p3897e.p3921j.C52228jz) r6
            java.lang.String r8 = r4.f51351b
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.assistant.e.j.ka r9 = (com.google.assistant.p3897e.p3921j.C52230ka) r9
            r8.getClass()
            int r10 = r9.f137059a
            r10 = r10 | r7
            r9.f137059a = r10
            r9.f137060b = r8
            com.google.protobuf.z r4 = r4.f51352c
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.assistant.e.j.ka r8 = (com.google.assistant.p3897e.p3921j.C52230ka) r8
            r4.getClass()
            int r9 = r8.f137059a
            r9 = r9 | 2
            r8.f137059a = r9
            r8.f137061c = r4
            r1.mo53669a(r6)
            goto L_0x01b8
        L_0x02ad:
            com.google.common.f.e r6 = f298722a
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r8, r3)
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            r8 = 23658(0x5c6a, float:3.3152E-41)
            com.google.common.f.x r6 = r6.mo56372aa(r8)
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            java.lang.String r8 = "Invalid protocol buffer for %s."
            java.lang.String r4 = r4.f51351b
            r6.mo56389s(r8, r4)
            goto L_0x01b8
        L_0x02cb:
            com.google.assistant.e.i.a.ac r12 = com.google.assistant.p3897e.p3917i.p3918a.C51233ac.f133389b
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.assistant.e.i.a.ab r12 = (com.google.assistant.p3897e.p3917i.p3918a.C51232ab) r12
            r12.mo53557a(r1)
            com.google.protobuf.bv r12 = r12.build()
            com.google.assistant.e.i.a.ac r12 = (com.google.assistant.p3897e.p3917i.p3918a.C51233ac) r12
            com.google.assistant.e.j.kc r0 = com.google.assistant.p3897e.p3921j.C52232kc.f137062d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.kb r0 = (com.google.assistant.p3897e.p3921j.C52231kb) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.assistant.e.j.kc r1 = (com.google.assistant.p3897e.p3921j.C52232kc) r1
            int r2 = r1.f137064a
            r2 = r2 | r7
            r1.f137064a = r2
            java.lang.String r2 = "asst.integration.context.params"
            r1.f137065b = r2
            com.google.assistant.e.j.ka r1 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.jz r1 = (com.google.assistant.p3897e.p3921j.C52228jz) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.e.j.ka r2 = (com.google.assistant.p3897e.p3921j.C52230ka) r2
            int r3 = r2.f137059a
            r3 = r3 | r7
            r2.f137059a = r3
            java.lang.String r3 = "assistant.api.params.AppContextParams"
            r2.f137060b = r3
            com.google.protobuf.z r12 = r12.toByteString()
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.e.j.ka r2 = (com.google.assistant.p3897e.p3921j.C52230ka) r2
            r12.getClass()
            int r3 = r2.f137059a
            r3 = r3 | 2
            r2.f137059a = r3
            r2.f137061c = r12
            r0.copyOnWrite()
            com.google.protobuf.bv r12 = r0.instance
            com.google.assistant.e.j.kc r12 = (com.google.assistant.p3897e.p3921j.C52232kc) r12
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.ka r1 = (com.google.assistant.p3897e.p3921j.C52230ka) r1
            r1.getClass()
            r12.f137066c = r1
            int r1 = r12.f137064a
            r1 = r1 | 2
            r12.f137064a = r1
            com.google.protobuf.bv r12 = r0.build()
            com.google.assistant.e.j.kc r12 = (com.google.assistant.p3897e.p3921j.C52232kc) r12
            com.google.common.base.ax r12 = com.google.common.base.C58833ax.m90834k(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.appintegration.C107338h.mo79460a(com.google.android.apps.gsa.shared.search.Query):com.google.common.base.ax");
    }
}
