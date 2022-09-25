package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.p1855h.C22695ah;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.av */
/* compiled from: PG */
public final class C92887av extends C22538o {

    /* renamed from: a */
    public static final /* synthetic */ int f259146a = 0;

    /* renamed from: b */
    private static final C59071e f259147b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.av");

    /* renamed from: c */
    private final C22695ah f259148c;

    public C92887av(C22695ah ahVar) {
        this.f259148c = ahVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v69, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v79, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20765a(com.google.assistant.p3897e.p3921j.C51809dy r8, com.google.android.libraries.gsa.conversation.clientop.C22434e r9) {
        /*
            r7 = this;
            java.lang.String r9 = r8.f135936b
            java.lang.String r0 = "zero_state.SETUP_CARD"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x02cb
            com.google.assistant.e.j.dw r8 = r8.f135938d
            if (r8 != 0) goto L_0x0010
            com.google.assistant.e.j.dw r8 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x0010:
            com.google.assistant.e.j.agh r9 = com.google.assistant.p3897e.p3921j.agh.f135049c
            com.google.protobuf.eb r9 = r9.getParserForType()
            java.lang.String r0 = "setup_card_args"
            com.google.protobuf.MessageLite r8 = m41992m(r8, r0, r9)
            com.google.assistant.e.j.agh r8 = (com.google.assistant.p3897e.p3921j.agh) r8
            com.google.assistant.e.j.age r9 = com.google.assistant.p3897e.p3921j.age.ON_MY_WAY_HOME_ARGS
            int r9 = r8.f135051a
            com.google.assistant.e.j.age r9 = com.google.assistant.p3897e.p3921j.age.m86307a(r9)
            int r9 = r9.ordinal()
            java.lang.String r0 = "ZSSetupCardPerformer"
            if (r9 == 0) goto L_0x0053
            com.google.common.f.e r9 = f259147b
            com.google.common.f.x r9 = r9.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r1, r0)
            int r8 = r8.f135051a
            com.google.assistant.e.j.age r8 = com.google.assistant.p3897e.p3921j.age.m86307a(r8)
            r0 = 13111(0x3337, float:1.8372E-41)
            java.lang.String r1 = "Unsupported ZeroState card args type: %s."
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r0)).mo56389s(r1, r8)
            com.google.assistant.e.j.kf r8 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.lang.String r9 = "Unsupported ZeroState card args type."
            com.google.assistant.e.j.ec r8 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r8, r9)
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            return r8
        L_0x0053:
            int r9 = r8.f135051a
            r1 = 1
            if (r9 != r1) goto L_0x005d
            java.lang.Object r8 = r8.f135052b
            com.google.assistant.e.j.agg r8 = (com.google.assistant.p3897e.p3921j.agg) r8
            goto L_0x005f
        L_0x005d:
            com.google.assistant.e.j.agg r8 = com.google.assistant.p3897e.p3921j.agg.f135040f
        L_0x005f:
            com.google.assistant.e.j.pj r9 = r8.f135042a
            if (r9 != 0) goto L_0x0065
            com.google.assistant.e.j.pj r9 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x0065:
            int r2 = r9.f137437b
            java.lang.String r3 = ""
            r4 = 2
            if (r2 != r4) goto L_0x0071
            java.lang.Object r9 = r9.f137438c
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x0072
        L_0x0071:
            r9 = r3
        L_0x0072:
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x00cc
            com.google.assistant.e.j.pj r9 = r8.f135042a
            if (r9 != 0) goto L_0x007e
            com.google.assistant.e.j.pj r9 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x007e:
            int r2 = r9.f137437b
            if (r2 != r4) goto L_0x0087
            java.lang.Object r9 = r9.f137438c
            r3 = r9
            java.lang.String r3 = (java.lang.String) r3
        L_0x0087:
            java.lang.String r9 = android.telephony.PhoneNumberUtils.normalizeNumber(r3)
            com.google.assistant.s.a.bo r2 = com.google.assistant.p3994s.p3995a.C53105bo.f139161c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.s.a.bj r2 = (com.google.assistant.p3994s.p3995a.C53100bj) r2
            com.google.assistant.s.a.bl r3 = com.google.assistant.p3994s.p3995a.C53102bl.f139153c
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.s.a.bk r3 = (com.google.assistant.p3994s.p3995a.C53101bk) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.s.a.bl r5 = (com.google.assistant.p3994s.p3995a.C53102bl) r5
            r9.getClass()
            int r6 = r5.f139155a
            r6 = r6 | r1
            r5.f139155a = r6
            r5.f139156b = r9
            r2.copyOnWrite()
            com.google.protobuf.bv r9 = r2.instance
            com.google.assistant.s.a.bo r9 = (com.google.assistant.p3994s.p3995a.C53105bo) r9
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.s.a.bl r3 = (com.google.assistant.p3994s.p3995a.C53102bl) r3
            r3.getClass()
            r9.f139164b = r3
            r9.f139163a = r4
            com.google.protobuf.bv r9 = r2.build()
            com.google.assistant.s.a.bo r9 = (com.google.assistant.p3994s.p3995a.C53105bo) r9
            j$.util.Optional r9 = p3186j$.util.Optional.m71637of(r9)
            goto L_0x0146
        L_0x00cc:
            com.google.assistant.e.j.pj r9 = r8.f135042a
            if (r9 != 0) goto L_0x00d2
            com.google.assistant.e.j.pj r9 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x00d2:
            int r2 = r9.f137437b
            r5 = 6
            if (r2 != r5) goto L_0x00dc
            java.lang.Object r9 = r9.f137438c
            r3 = r9
            java.lang.String r3 = (java.lang.String) r3
        L_0x00dc:
            boolean r9 = r3.isEmpty()
            if (r9 == 0) goto L_0x00e7
            j$.util.Optional r9 = p3186j$.util.Optional.empty()
            goto L_0x0146
        L_0x00e7:
            com.google.assistant.e.c.c.gh r9 = r8.f135045d
            if (r9 != 0) goto L_0x00ed
            com.google.assistant.e.c.c.gh r9 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x00ed:
            int r2 = r9.f133012b
            if (r2 != r1) goto L_0x00f6
            java.lang.Object r9 = r9.f133013c
            com.google.assistant.e.c.c.ev r9 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r9
            goto L_0x00f8
        L_0x00f6:
            com.google.assistant.e.c.c.ev r9 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x00f8:
            java.lang.String r9 = r9.f132944b
            java.lang.String r2 = "com.whatsapp"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0142
            com.google.assistant.s.a.bo r9 = com.google.assistant.p3994s.p3995a.C53105bo.f139161c
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.s.a.bj r9 = (com.google.assistant.p3994s.p3995a.C53100bj) r9
            com.google.assistant.s.a.bn r2 = com.google.assistant.p3994s.p3995a.C53104bn.f139157c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.s.a.bm r2 = (com.google.assistant.p3994s.p3995a.C53103bm) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.s.a.bn r5 = (com.google.assistant.p3994s.p3995a.C53104bn) r5
            r3.getClass()
            int r6 = r5.f139159a
            r6 = r6 | r1
            r5.f139159a = r6
            r5.f139160b = r3
            r9.copyOnWrite()
            com.google.protobuf.bv r3 = r9.instance
            com.google.assistant.s.a.bo r3 = (com.google.assistant.p3994s.p3995a.C53105bo) r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.s.a.bn r2 = (com.google.assistant.p3994s.p3995a.C53104bn) r2
            r2.getClass()
            r3.f139164b = r2
            r3.f139163a = r1
            com.google.protobuf.bv r9 = r9.build()
            com.google.assistant.s.a.bo r9 = (com.google.assistant.p3994s.p3995a.C53105bo) r9
            j$.util.Optional r9 = p3186j$.util.Optional.m71637of(r9)
            goto L_0x0146
        L_0x0142:
            j$.util.Optional r9 = p3186j$.util.Optional.empty()
        L_0x0146:
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L_0x016a
            com.google.common.f.e r8 = f259147b
            com.google.common.f.x r8 = r8.mo56225c()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r9, r0)
            r9 = 13110(0x3336, float:1.8371E-41)
            java.lang.String r0 = "Missing recipient information"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r9)).mo56386p(r0)
            com.google.assistant.e.j.kf r8 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            com.google.assistant.e.j.ec r8 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r8, r0)
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            goto L_0x02ca
        L_0x016a:
            java.lang.Object r9 = r9.get()
            com.google.assistant.s.a.bo r9 = (com.google.assistant.p3994s.p3995a.C53105bo) r9
            java.lang.String r2 = r8.f135046e
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0198
            com.google.common.f.e r8 = f259147b
            com.google.common.f.x r8 = r8.mo56225c()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r9, r0)
            java.lang.String r9 = "Missing on_my_way_home_args.text."
            r0 = 13109(0x3335, float:1.837E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r0)).mo56386p(r9)
            com.google.assistant.e.j.kf r8 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.lang.String r9 = "Missing on_my_way_home_args.text"
            com.google.assistant.e.j.ec r8 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r8, r9)
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            goto L_0x02ca
        L_0x0198:
            com.google.assistant.s.a.bp r2 = com.google.assistant.p3994s.p3995a.C53106bp.f139165f
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.s.a.bi r2 = (com.google.assistant.p3994s.p3995a.C53099bi) r2
            java.lang.String r3 = r8.f135046e
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.s.a.bp r5 = (com.google.assistant.p3994s.p3995a.C53106bp) r5
            r3.getClass()
            int r6 = r5.f139167a
            r4 = r4 | r6
            r5.f139167a = r4
            r5.f139168b = r3
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.s.a.bp r3 = (com.google.assistant.p3994s.p3995a.C53106bp) r3
            r9.getClass()
            r3.f139171e = r9
            int r9 = r3.f139167a
            r9 = r9 | 16
            r3.f139167a = r9
            java.lang.String r9 = r8.f135043b
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x01e1
            java.lang.String r9 = r8.f135043b
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.s.a.bp r3 = (com.google.assistant.p3994s.p3995a.C53106bp) r3
            r9.getClass()
            int r4 = r3.f139167a
            r4 = r4 | 4
            r3.f139167a = r4
            r3.f139169c = r9
        L_0x01e1:
            com.google.assistant.e.c.c.dc r8 = r8.f135044c
            if (r8 != 0) goto L_0x01e7
            com.google.assistant.e.c.c.dc r8 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x01e7:
            java.lang.String r9 = r8.f132817c
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x01f6
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            j$.util.Optional r8 = p3186j$.util.Optional.empty()
            goto L_0x0234
        L_0x01f6:
            int r9 = r8.f132816b
            int r9 = com.google.assistant.p3897e.p3902c.p3907c.C51014de.m86008a(r9)
            if (r9 != 0) goto L_0x01ff
            r9 = 1
        L_0x01ff:
            int r9 = r9 + -1
            if (r9 == 0) goto L_0x022e
            r3 = 3
            if (r9 == r3) goto L_0x021d
            com.google.common.f.e r8 = f259147b
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r9, r0)
            java.lang.String r9 = "Contact image type not recognized, returning empty image."
            r3 = 13112(0x3338, float:1.8374E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r3)).mo56386p(r9)
            j$.util.Optional r8 = p3186j$.util.Optional.empty()
            goto L_0x0234
        L_0x021d:
            java.lang.String r8 = r8.f132817c
            java.lang.Long r8 = com.google.common.p4575r.C60761r.m92762h(r8)
            j$.util.Optional r8 = p3186j$.util.Optional.ofNullable(r8)
            com.google.android.apps.gsa.staticplugins.accl.performers.au r9 = com.google.android.apps.gsa.staticplugins.accl.performers.C92886au.f259145a
            j$.util.Optional r8 = r8.map(r9)
            goto L_0x0234
        L_0x022e:
            java.lang.String r8 = r8.f132817c
            j$.util.Optional r8 = p3186j$.util.Optional.m71637of(r8)
        L_0x0234:
            p3186j$.util.Objects.requireNonNull(r2)
            com.google.android.apps.gsa.staticplugins.accl.performers.at r9 = new com.google.android.apps.gsa.staticplugins.accl.performers.at
            r9.<init>(r2)
            r8.ifPresent(r9)
            com.google.assistant.s.a.jd r8 = com.google.assistant.p3994s.p3995a.C53310jd.f139802c
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.s.a.jc r8 = (com.google.assistant.p3994s.p3995a.C53309jc) r8
            com.google.assistant.s.a.bq r9 = com.google.assistant.p3994s.p3995a.C53107bq.f139172c
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.s.a.bh r9 = (com.google.assistant.p3994s.p3995a.C53098bh) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r3 = r9.instance
            com.google.assistant.s.a.bq r3 = (com.google.assistant.p3994s.p3995a.C53107bq) r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.s.a.bp r2 = (com.google.assistant.p3994s.p3995a.C53106bp) r2
            r2.getClass()
            r3.f139175b = r2
            r3.f139174a = r1
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.assistant.s.a.jd r1 = (com.google.assistant.p3994s.p3995a.C53310jd) r1
            com.google.protobuf.bv r9 = r9.build()
            com.google.assistant.s.a.bq r9 = (com.google.assistant.p3994s.p3995a.C53107bq) r9
            r9.getClass()
            r1.f139805b = r9
            r9 = 11
            r1.f139804a = r9
            com.google.protobuf.bv r8 = r8.build()
            com.google.assistant.s.a.jd r8 = (com.google.assistant.p3994s.p3995a.C53310jd) r8
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            java.lang.String r1 = "zero_state_action_name"
            java.lang.String r2 = "AsyncUpdateAction"
            r9.putExtra(r1, r2)
            com.google.common.l.i r1 = com.google.common.p4541l.C59326i.f157517e
            byte[] r8 = r8.toByteArray()
            int r2 = r8.length
            java.lang.String r8 = r1.mo56837l(r8, r2)
            java.lang.String r1 = "async_update_data"
            r9.putExtra(r1, r8)
            com.google.android.libraries.gsa.conversation.h.ah r8 = r7.f259148c
            boolean r8 = r8.mo27807a(r9)
            if (r8 != 0) goto L_0x02c2
            com.google.common.f.e r8 = f259147b
            com.google.common.f.x r8 = r8.mo56225c()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r9, r0)
            java.lang.String r9 = "Failed to send SetupZeroStateCard intent. UNKNOWN ERROR."
            r0 = 13108(0x3334, float:1.8368E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r0)).mo56386p(r9)
            com.google.assistant.e.j.kf r8 = com.google.assistant.p3897e.p3921j.C52235kf.INTERNAL
            java.lang.String r9 = "Unknown error"
            com.google.assistant.e.j.ec r8 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r8, r9)
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            goto L_0x02ca
        L_0x02c2:
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.assistant.e.j.ec r8 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61894b
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
        L_0x02ca:
            return r8
        L_0x02cb:
            com.google.android.libraries.gsa.conversation.clientop.d r9 = new com.google.android.libraries.gsa.conversation.clientop.d
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.accl.performers.C92887av.mo20765a(com.google.assistant.e.j.dy, com.google.android.libraries.gsa.conversation.clientop.e):com.google.common.util.concurrent.cx");
    }
}
