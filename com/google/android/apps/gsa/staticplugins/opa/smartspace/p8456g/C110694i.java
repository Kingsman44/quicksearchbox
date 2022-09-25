package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8456g;

import com.google.android.apps.gsa.opa.smartspace.C83805u;
import com.google.android.apps.gsa.opa.smartspace.p6456e.C83785c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.g.i */
/* compiled from: PG */
public final class C110694i implements C83805u {

    /* renamed from: a */
    public static final C59071e f308447a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.smartspace.g.i");

    /* renamed from: b */
    public final C83785c f308448b;

    /* renamed from: c */
    public final C86124t f308449c;

    /* renamed from: d */
    private final C110688c f308450d;

    /* renamed from: e */
    private final C22871g f308451e;

    public C110694i(C110688c cVar, C22871g gVar, C83785c cVar2, C86124t tVar) {
        this.f308450d = cVar;
        this.f308451e = gVar;
        this.f308448b = cVar2;
        this.f308449c = tVar;
    }

    /* JADX WARNING: type inference failed for: r11v15, types: [com.google.protobuf.bv] */
    /* JADX WARNING: type inference failed for: r11v27, types: [com.google.protobuf.bv] */
    /* JADX WARNING: type inference failed for: r11v30, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo77190a(com.google.android.apps.gsa.opa.smartspace.C83739ak r11) {
        /*
            r10 = this;
            com.google.common.f.e r0 = f308447a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "SmartspaceFlightCtrl"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "SmartspaceFlightsController#checkEligibilityAndUpdate"
            r2 = 26677(0x6835, float:3.7382E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.android.libraries.gsa.k.g r0 = r10.f308451e
            r1 = 2
            com.google.common.util.concurrent.cx[] r2 = new com.google.common.util.concurrent.C60870cx[r1]
            com.google.android.apps.gsa.staticplugins.opa.smartspace.g.c r3 = r10.f308450d
            com.google.common.util.concurrent.cx r3 = r3.mo98852a(r11)
            r4 = 0
            r2[r4] = r3
            com.google.android.apps.gsa.staticplugins.opa.smartspace.g.c r3 = r10.f308450d
            java.lang.String r5 = r11.f228242k
            com.google.android.apps.gsa.opa.smartspace.aj r11 = r11.f228233b
            if (r11 != 0) goto L_0x002c
            com.google.android.apps.gsa.opa.smartspace.aj r11 = com.google.android.apps.gsa.opa.smartspace.C83738aj.f228226c
        L_0x002c:
            int r6 = r11.f228228a
            r7 = 4
            if (r6 != r7) goto L_0x0036
            java.lang.Object r11 = r11.f228229b
            com.google.assistant.s.a.es r11 = (com.google.assistant.p3994s.p3995a.C53190es) r11
            goto L_0x0038
        L_0x0036:
            com.google.assistant.s.a.es r11 = com.google.assistant.p3994s.p3995a.C53190es.f139393s
        L_0x0038:
            com.google.android.apps.gsa.staticplugins.opa.smartspace.g.g r3 = r3.f308427a
            com.google.common.f.a.d r6 = r3.f308444g
            com.google.common.f.x r6 = r6.mo56224b()
            java.lang.String r7 = "#buildSmartspaceChipProtoForFlightUpdate()"
            r8 = 26663(0x6827, float:3.7363E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r6).mo56372aa(r8)).mo56386p(r7)
            com.google.android.apps.gsa.search.core.i.t r6 = r3.f308439b
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C89985ax.f246734q
            boolean r6 = r6.mo79746e(r7)
            j$.util.Optional r6 = com.google.android.apps.gsa.staticplugins.opa.smartspace.p8456g.C110692g.m184394f(r11, r6)
            boolean r7 = r6.isPresent()
            r8 = 0
            r9 = 1
            if (r7 != 0) goto L_0x006a
            com.google.common.f.a.d r11 = r3.f308444g
            com.google.common.f.x r11 = r11.mo56224b()
            java.lang.String r1 = "Not building the chip because Smartspace can not parse the departual time."
            r3 = 26665(0x6829, float:3.7366E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r11).mo56372aa(r3)).mo56386p(r1)
            goto L_0x021b
        L_0x006a:
            java.lang.Object r6 = r6.get()
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            boolean r6 = r3.mo98856k(r6)
            if (r6 != 0) goto L_0x0089
            com.google.common.f.a.d r11 = r3.f308444g
            com.google.common.f.x r11 = r11.mo56224b()
            java.lang.String r1 = "Not building the chip because flight status is inactive."
            r3 = 26664(0x6828, float:3.7364E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r11).mo56372aa(r3)).mo56386p(r1)
            goto L_0x021b
        L_0x0089:
            android.content.Context r6 = r3.f308438a
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2132083785(0x7f150449, float:1.9807722E38)
            java.lang.String r6 = r6.getString(r7)
            boolean r7 = com.google.android.apps.gsa.staticplugins.opa.smartspace.p8456g.C110692g.m184396i(r11)
            if (r7 == 0) goto L_0x00b4
            android.content.Context r6 = r3.f308438a
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2132083783(0x7f150447, float:1.9807718E38)
            java.lang.String r6 = r6.getString(r7)
            com.google.protobuf.cq r11 = r11.f139407l
            java.lang.Object r11 = r11.get(r4)
            com.google.assistant.s.a.en r11 = (com.google.assistant.p3994s.p3995a.C53185en) r11
            java.lang.String r11 = r11.f139381c
            goto L_0x00d4
        L_0x00b4:
            boolean r7 = com.google.android.apps.gsa.staticplugins.opa.smartspace.p8456g.C110692g.m184397j(r11)
            if (r7 == 0) goto L_0x00d2
            android.content.Context r6 = r3.f308438a
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2132083784(0x7f150448, float:1.980772E38)
            java.lang.String r6 = r6.getString(r7)
            com.google.protobuf.cq r11 = r11.f139407l
            java.lang.Object r11 = r11.get(r4)
            com.google.assistant.s.a.en r11 = (com.google.assistant.p3994s.p3995a.C53185en) r11
            java.lang.String r11 = r11.f139382d
            goto L_0x00d4
        L_0x00d2:
            java.lang.String r11 = ""
        L_0x00d4:
            com.google.assistant.c.bc r4 = com.google.assistant.p3886c.C50738bc.f132032l
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.c.an r4 = (com.google.assistant.p3886c.C50702an) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.assistant.c.bc r7 = (com.google.assistant.p3886c.C50738bc) r7
            int r8 = r7.f132034a
            r8 = r8 | r1
            r7.f132034a = r8
            java.lang.String r8 = "FLIGHT_CHIP_ID"
            r7.f132038e = r8
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.assistant.c.bc r7 = (com.google.assistant.p3886c.C50738bc) r7
            r6.getClass()
            int r8 = r7.f132034a
            r8 = r8 | r9
            r7.f132034a = r8
            r7.f132037d = r6
            com.google.assistant.c.am r6 = com.google.assistant.p3886c.C50701am.FLIGHT
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.assistant.c.bc r7 = (com.google.assistant.p3886c.C50738bc) r7
            int r6 = r6.f131953N
            r7.f132040g = r6
            int r6 = r7.f132034a
            r8 = 8
            r6 = r6 | r8
            r7.f132034a = r6
            boolean r6 = r11.isEmpty()
            if (r6 != 0) goto L_0x015c
            com.google.assistant.c.bb r3 = com.google.assistant.p3886c.C50737bb.f132027d
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.c.ay r3 = (com.google.assistant.p3886c.C50713ay) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.c.bb r5 = (com.google.assistant.p3886c.C50737bb) r5
            r5.f132031c = r1
            int r6 = r5.f132029a
            r1 = r1 | r6
            r5.f132029a = r1
            r3.copyOnWrite()
            com.google.protobuf.bv r1 = r3.instance
            com.google.assistant.c.bb r1 = (com.google.assistant.p3886c.C50737bb) r1
            r11.getClass()
            int r5 = r1.f132029a
            r5 = r5 | r9
            r1.f132029a = r5
            r1.f132030b = r11
            r4.copyOnWrite()
            com.google.protobuf.bv r11 = r4.instance
            com.google.assistant.c.bc r11 = (com.google.assistant.p3886c.C50738bc) r11
            com.google.protobuf.bv r1 = r3.build()
            com.google.assistant.c.bb r1 = (com.google.assistant.p3886c.C50737bb) r1
            r1.getClass()
            r11.f132036c = r1
            r1 = 7
            r11.f132035b = r1
            com.google.protobuf.bv r11 = r4.build()
            r8 = r11
            com.google.assistant.c.bc r8 = (com.google.assistant.p3886c.C50738bc) r8
            goto L_0x021b
        L_0x015c:
            boolean r11 = r5.isEmpty()
            if (r11 != 0) goto L_0x01f8
            com.google.assistant.s.a.ih r11 = com.google.assistant.p3994s.p3995a.C53287ih.f139693l
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.s.a.hw r11 = (com.google.assistant.p3994s.p3995a.C53275hw) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r1 = r11.instance
            com.google.assistant.s.a.ih r1 = (com.google.assistant.p3994s.p3995a.C53287ih) r1
            r5.getClass()
            int r3 = r1.f139695a
            r3 = r3 | r8
            r1.f139695a = r3
            r1.f139701g = r5
            r11.copyOnWrite()
            com.google.protobuf.bv r1 = r11.instance
            com.google.assistant.s.a.ih r1 = (com.google.assistant.p3994s.p3995a.C53287ih) r1
            r3 = 3
            r1.f139698d = r3
            int r5 = r1.f139695a
            r5 = r5 | r9
            r1.f139695a = r5
            r11.copyOnWrite()
            com.google.protobuf.bv r1 = r11.instance
            com.google.assistant.s.a.ih r1 = (com.google.assistant.p3994s.p3995a.C53287ih) r1
            r1.f139702h = r3
            int r3 = r1.f139695a
            r3 = r3 | 64
            r1.f139695a = r3
            r11.copyOnWrite()
            com.google.protobuf.bv r1 = r11.instance
            com.google.assistant.s.a.ih r1 = (com.google.assistant.p3994s.p3995a.C53287ih) r1
            r3 = 9
            r1.f139703i = r3
            int r3 = r1.f139695a
            r3 = r3 | 128(0x80, float:1.794E-43)
            r1.f139695a = r3
            com.google.protobuf.bv r11 = r11.build()
            com.google.assistant.s.a.ih r11 = (com.google.assistant.p3994s.p3995a.C53287ih) r11
            com.google.android.apps.gsa.smartspace.c.l r1 = com.google.android.apps.gsa.smartspace.p7259c.C92096l.f256787c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.smartspace.c.k r1 = (com.google.android.apps.gsa.smartspace.p7259c.C92095k) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.gsa.smartspace.c.l r3 = (com.google.android.apps.gsa.smartspace.p7259c.C92096l) r3
            r11.getClass()
            r3.f256791b = r11
            int r11 = r3.f256790a
            r11 = r11 | r9
            r3.f256790a = r11
            com.google.protobuf.bv r11 = r1.build()
            com.google.android.apps.gsa.smartspace.c.l r11 = (com.google.android.apps.gsa.smartspace.p7259c.C92096l) r11
            com.google.assistant.c.ax r1 = com.google.assistant.p3886c.C50712ax.f131969a
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.c.aw r1 = (com.google.assistant.p3886c.C50711aw) r1
            com.google.protobuf.bt r3 = com.google.android.apps.gsa.smartspace.p7259c.C92096l.f256788d
            r1.mo58885m(r3, r11)
            com.google.protobuf.bv r11 = r1.build()
            com.google.assistant.c.ax r11 = (com.google.assistant.p3886c.C50712ax) r11
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.assistant.c.bc r1 = (com.google.assistant.p3886c.C50738bc) r1
            r11.getClass()
            r1.f132036c = r11
            r1.f132035b = r8
            com.google.protobuf.bv r11 = r4.build()
            r8 = r11
            com.google.assistant.c.bc r8 = (com.google.assistant.p3886c.C50738bc) r8
            goto L_0x021b
        L_0x01f8:
            android.content.Context r11 = r3.f308438a
            android.content.res.Resources r11 = r11.getResources()
            r1 = 2132084046(0x7f15054e, float:1.9808251E38)
            java.lang.String r11 = r11.getString(r1)
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.assistant.c.bc r1 = (com.google.assistant.p3886c.C50738bc) r1
            r11.getClass()
            r3 = 6
            r1.f132035b = r3
            r1.f132036c = r11
            com.google.protobuf.bv r11 = r4.build()
            r8 = r11
            com.google.assistant.c.bc r8 = (com.google.assistant.p3886c.C50738bc) r8
        L_0x021b:
            if (r8 == 0) goto L_0x0222
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            goto L_0x022d
        L_0x0222:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r1 = "Flight card for Smartspace could not be constructed."
            r11.<init>(r1)
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60856cj.m92899h(r11)
        L_0x022d:
            r2[r9] = r11
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60856cj.m92907p(r2)
            com.google.android.apps.gsa.staticplugins.opa.smartspace.g.h r1 = new com.google.android.apps.gsa.staticplugins.opa.smartspace.g.h
            r1.<init>(r10)
            java.lang.String r2 = "createSmartspaceFlightsCardAndChip"
            com.google.common.util.concurrent.cx r11 = r0.mo28210j(r11, r2, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.smartspace.p8456g.C110694i.mo77190a(com.google.android.apps.gsa.opa.smartspace.ak):com.google.common.util.concurrent.cx");
    }
}
