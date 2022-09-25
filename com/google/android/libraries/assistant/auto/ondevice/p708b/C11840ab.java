package com.google.android.libraries.assistant.auto.ondevice.p708b;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;
import com.google.speech.grammar.pumpkin.C66525q;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.b.ab */
/* compiled from: PG */
public final /* synthetic */ class C11840ab implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C11841ac f38036a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f38037b;

    /* renamed from: c */
    public final /* synthetic */ Query f38038c;

    /* renamed from: d */
    public final /* synthetic */ C66525q f38039d;

    public /* synthetic */ C11840ab(C11841ac acVar, C58833ax axVar, Query query, C66525q qVar) {
        this.f38036a = acVar;
        this.f38037b = axVar;
        this.f38038c = query;
        this.f38039d = qVar;
    }

    /* JADX WARNING: type inference failed for: r5v112, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x018b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17947a() {
        /*
            r17 = this;
            r0 = r17
            com.google.android.libraries.assistant.auto.ondevice.b.ac r1 = r0.f38036a
            com.google.common.base.ax r2 = r0.f38037b
            com.google.android.apps.gsa.shared.search.Query r3 = r0.f38038c
            com.google.speech.grammar.pumpkin.q r4 = r0.f38039d
            java.lang.Object r2 = r2.mo56107c()
            com.google.protos.an.f r2 = (com.google.protos.p4850an.C63595f) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            com.google.protobuf.bt r6 = com.google.protos.p4850an.p4855d.p4856a.C63473z.f171528i
            java.lang.Object r6 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32464c(r2, r6)
            com.google.protos.an.d.a.z r6 = (com.google.protos.p4850an.p4855d.p4856a.C63473z) r6
            java.lang.String r7 = ""
            r8 = 0
            r9 = 1
            if (r6 == 0) goto L_0x0452
            com.google.protos.f.b.d.b r5 = r1.f38052m
            int r5 = r5.f175581a
            r10 = 2
            r5 = r5 & r10
            if (r5 == 0) goto L_0x006d
            java.lang.CharSequence r5 = r3.f252768g
            java.lang.String r5 = r5.toString()
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0046
            com.google.common.f.a.d r5 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11841ac.f38040a
            com.google.common.f.x r5 = r5.mo56226d()
            java.lang.String r12 = "#maybeCreateNewSendMessageActionForSettingMessage: Empty query"
            r13 = 43669(0xaa95, float:6.1193E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r5).mo56372aa(r13)).mo56386p(r12)
            goto L_0x006d
        L_0x0046:
            com.google.protos.f.b.d.b r5 = r1.f38052m
            com.google.common.b.gu r12 = r1.mo20201e()
            java.lang.String r5 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27784i(r5, r12)
            java.lang.String r12 = "message"
            boolean r12 = r12.equals(r5)
            if (r12 == 0) goto L_0x006d
            com.google.protos.f.b.d.b r12 = r1.f38052m
            boolean r12 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27787l(r12, r5)
            if (r12 == 0) goto L_0x006d
            com.google.protos.f.b.d.b r12 = r1.f38052m
            int r5 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27791p(r12, r5)
            if (r5 != r9) goto L_0x006d
            com.google.protos.an.d.a.z r5 = com.google.android.libraries.assistant.auto.ondevice.utils.C11946i.m27794a(r3)
            goto L_0x006e
        L_0x006d:
            r5 = 0
        L_0x006e:
            if (r5 != 0) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r6 = r5
        L_0x0072:
            com.google.protos.an.d.a.z r5 = com.google.protos.p4850an.p4855d.p4856a.C63473z.f171527h
            boolean r5 = r6.equals(r5)
            r12 = 4
            r13 = 3
            java.lang.String r14 = "provider"
            if (r5 == 0) goto L_0x012a
            com.google.protos.f.b.d.b r5 = r1.f38052m
            com.google.common.b.gu r15 = r1.mo20201e()
            java.lang.String r5 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27784i(r5, r15)
            boolean r5 = r14.equals(r5)
            if (r5 == 0) goto L_0x012a
            com.google.protobuf.cq r5 = r4.f180933c
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x012a
            com.google.protobuf.cq r5 = r4.f180933c
            java.lang.Object r5 = r5.get(r8)
            com.google.speech.grammar.pumpkin.m r5 = (com.google.speech.grammar.pumpkin.C66521m) r5
            java.lang.String r5 = r5.f180922b
            java.lang.String r15 = "FOLLOWON_TEXT"
            boolean r5 = r5.equals(r15)
            if (r5 == 0) goto L_0x012a
            com.google.protobuf.cq r5 = r4.f180933c
            java.lang.Object r5 = r5.get(r8)
            com.google.speech.grammar.pumpkin.m r5 = (com.google.speech.grammar.pumpkin.C66521m) r5
            java.lang.String r5 = r5.f180925e
            com.google.protos.an.d.a.z r6 = com.google.protos.p4850an.p4855d.p4856a.C63473z.f171527h
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.protos.an.d.a.w r6 = (com.google.protos.p4850an.p4855d.p4856a.C63470w) r6
            com.google.protos.an.d.a.p r15 = com.google.protos.p4850an.p4855d.p4856a.C63463p.f171507e
            com.google.protobuf.bn r15 = r15.createBuilder()
            com.google.protos.an.d.a.o r15 = (com.google.protos.p4850an.p4855d.p4856a.C63462o) r15
            r15.copyOnWrite()
            com.google.protobuf.bv r11 = r15.instance
            com.google.protos.an.d.a.p r11 = (com.google.protos.p4850an.p4855d.p4856a.C63463p) r11
            r5.getClass()
            int r8 = r11.f171509a
            r8 = r8 | r9
            r11.f171509a = r8
            r11.f171510b = r5
            r15.copyOnWrite()
            com.google.protobuf.bv r8 = r15.instance
            com.google.protos.an.d.a.p r8 = (com.google.protos.p4850an.p4855d.p4856a.C63463p) r8
            r5.getClass()
            int r11 = r8.f171509a
            r11 = r11 | r10
            r8.f171509a = r11
            r8.f171512d = r5
            r6.copyOnWrite()
            com.google.protobuf.bv r5 = r6.instance
            com.google.protos.an.d.a.z r5 = (com.google.protos.p4850an.p4855d.p4856a.C63473z) r5
            com.google.protobuf.bv r8 = r15.build()
            com.google.protos.an.d.a.p r8 = (com.google.protos.p4850an.p4855d.p4856a.C63463p) r8
            r8.getClass()
            r5.f171536g = r8
            int r8 = r5.f171530a
            r8 = r8 | 4096(0x1000, float:5.74E-42)
            r5.f171530a = r8
            com.google.protos.an.d.a.j r5 = com.google.protos.p4850an.p4855d.p4856a.C63457j.f171489e
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.protos.an.d.a.e r5 = (com.google.protos.p4850an.p4855d.p4856a.C63452e) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.protos.an.d.a.j r8 = (com.google.protos.p4850an.p4855d.p4856a.C63457j) r8
            r8.f171492b = r13
            int r11 = r8.f171491a
            r11 = r11 | r9
            r8.f171491a = r11
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.protos.an.d.a.j r8 = (com.google.protos.p4850an.p4855d.p4856a.C63457j) r8
            r8.f171493c = r12
            int r11 = r8.f171491a
            r11 = r11 | r10
            r8.f171491a = r11
            r6.mo59213a(r5)
            com.google.protobuf.bv r5 = r6.build()
            r6 = r5
            com.google.protos.an.d.a.z r6 = (com.google.protos.p4850an.p4855d.p4856a.C63473z) r6
        L_0x012a:
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89845m()
            int r8 = r6.f171530a
            r8 = r8 & 8
            if (r8 == 0) goto L_0x0135
            goto L_0x018b
        L_0x0135:
            com.google.protobuf.cq r8 = r6.f171531b
            int r8 = r8.size()
            if (r8 > 0) goto L_0x018b
            com.google.protobuf.cq r8 = r6.f171535f
            int r8 = r8.size()
            if (r8 > 0) goto L_0x018b
            com.google.common.f.a.d r3 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11841ac.f38040a
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r8 = "Send Message Action is empty probably due to unmatched semantics context."
            r11 = 43648(0xaa80, float:6.1164E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r11)).mo56386p(r8)
            com.google.protos.f.b.d.b r3 = r1.f38052m
            int r8 = r3.f175581a
            r8 = r8 & r10
            if (r8 == 0) goto L_0x0452
            java.lang.String r5 = "contact_number"
            boolean r3 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27788m(r3, r5)
            if (r3 != 0) goto L_0x0169
            r3 = 0
            com.google.common.b.gu r5 = r1.mo20200d(r6, r3)
            goto L_0x0452
        L_0x0169:
            int r3 = r1.f38044e
            int r3 = r3 + r9
            r1.f38044e = r3
            if (r3 <= r10) goto L_0x0185
            r1.mo20203g()
            com.google.android.apps.gsa.a.c.a r3 = r1.f38053n
            android.content.Context r5 = r3.f32300b
            android.content.res.Resources r3 = r3.mo17491a(r5)
            java.util.List r3 = com.google.android.libraries.assistant.auto.ondevice.utils.C11932a.m27753f(r3)
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89842j(r3)
            goto L_0x0452
        L_0x0185:
            com.google.common.b.gu r5 = r1.mo20202f()
            goto L_0x0452
        L_0x018b:
            int r5 = r1.mo20204i(r6)
            int r5 = r5 + -1
            if (r5 == 0) goto L_0x01a5
            if (r5 == r13) goto L_0x044e
            com.google.common.f.a.d r3 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11841ac.f38040a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r8 = "Unsupported recipientType. The recipientType is %s"
            r10 = 43643(0xaa7b, float:6.1157E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r10)).mo56387q(r8, r5)
            goto L_0x044e
        L_0x01a5:
            int r5 = r6.f171530a
            r5 = r5 & 4096(0x1000, float:5.74E-42)
            if (r5 == 0) goto L_0x0309
            com.google.protos.an.d.a.p r5 = r6.f171536g
            if (r5 != 0) goto L_0x01b1
            com.google.protos.an.d.a.p r5 = com.google.protos.p4850an.p4855d.p4856a.C63463p.f171507e
        L_0x01b1:
            java.lang.String r8 = r5.f171512d
            com.google.bp.a.c.d r11 = r1.f38049j
            com.google.protobuf.cq r11 = r11.f149631a
            java.util.Iterator r11 = r11.iterator()
        L_0x01bb:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto L_0x01d3
            java.lang.Object r15 = r11.next()
            com.google.bp.a.c.b r15 = (com.google.p4242bp.p4243a.p4246c.C56157b) r15
            java.lang.String r13 = r15.f149624b
            boolean r13 = com.google.common.base.C58890d.m90990e(r8, r13)
            if (r13 == 0) goto L_0x01d1
            r11 = r15
            goto L_0x01d4
        L_0x01d1:
            r13 = 3
            goto L_0x01bb
        L_0x01d3:
            r11 = 0
        L_0x01d4:
            com.google.protos.f.b.d.b r13 = r1.f38052m
            int r15 = r13.f175581a
            r15 = r15 & r10
            if (r15 == 0) goto L_0x01eb
            com.google.common.b.gu r15 = r1.mo20201e()
            java.lang.String r13 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27784i(r13, r15)
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto L_0x01eb
            goto L_0x0279
        L_0x01eb:
            if (r11 != 0) goto L_0x0225
            com.google.common.f.a.d r3 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11841ac.f38040a
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.a.a r3 = (com.google.common.p4526f.p4527a.C58970a) r3
            r6 = 43647(0xaa7f, float:6.1162E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r6)
            com.google.common.f.a.a r3 = (com.google.common.p4526f.p4527a.C58970a) r3
            java.lang.String r6 = "This medium is not whitelisted. %s"
            java.lang.String r5 = r5.f171512d
            r3.mo56389s(r6, r5)
            r1.f38041b = r9
            com.google.android.apps.gsa.a.c.a r3 = r1.f38053n
            android.content.Context r5 = r3.f32300b
            android.content.res.Resources r3 = r3.mo17491a(r5)
            java.lang.Object[] r5 = new java.lang.Object[r9]
            r6 = 0
            r5[r6] = r8
            r6 = 2132093370(0x7f1529ba, float:1.9827163E38)
            java.lang.String r3 = r3.getString(r6, r5)
            com.google.assistant.e.j.dy r3 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r3)
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89846n(r3)
            goto L_0x0452
        L_0x0225:
            java.lang.String r13 = r11.f149625c
            com.google.android.apps.gsa.search.core.carassistant.f.a r15 = r1.f38048i
            com.google.common.base.ax r13 = r15.mo79363a(r13)
            boolean r13 = r13.mo56113h()
            if (r13 != 0) goto L_0x0279
            com.google.common.f.a.d r3 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11841ac.f38040a
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r6 = "Unable to get app info from the device"
            r10 = 43679(0xaa9f, float:6.1207E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r10)).mo56386p(r6)
            com.google.common.f.a.d r3 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11841ac.f38040a
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.a.a r3 = (com.google.common.p4526f.p4527a.C58970a) r3
            r6 = 43646(0xaa7e, float:6.1161E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r6)
            com.google.common.f.a.a r3 = (com.google.common.p4526f.p4527a.C58970a) r3
            java.lang.String r6 = "This medium is not installed. %s"
            java.lang.String r5 = r5.f171512d
            r3.mo56389s(r6, r5)
            r1.f38041b = r9
            com.google.android.apps.gsa.a.c.a r3 = r1.f38053n
            android.content.Context r5 = r3.f32300b
            android.content.res.Resources r3 = r3.mo17491a(r5)
            java.lang.Object[] r5 = new java.lang.Object[r9]
            r6 = 0
            r5[r6] = r8
            r6 = 2132093333(0x7f152995, float:1.9827088E38)
            java.lang.String r3 = r3.getString(r6, r5)
            com.google.assistant.e.j.dy r3 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r3)
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89846n(r3)
            goto L_0x0452
        L_0x0279:
            if (r11 != 0) goto L_0x028b
            com.google.common.f.a.d r5 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11841ac.f38040a
            com.google.common.f.x r5 = r5.mo56226d()
            java.lang.String r8 = "#updateMediumAndAppInfo: App config is null"
            r11 = 43677(0xaa9d, float:6.1205E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r5).mo56372aa(r11)).mo56386p(r8)
            goto L_0x0309
        L_0x028b:
            java.lang.String r8 = r11.f149625c
            java.lang.String r13 = r11.f149626d
            int r15 = r11.f149623a
            r15 = r15 & 16
            if (r15 == 0) goto L_0x0298
            java.lang.String r11 = r11.f149627e
            goto L_0x0299
        L_0x0298:
            r11 = r8
        L_0x0299:
            com.google.protobuf.bn r5 = r5.toBuilder()
            com.google.protos.an.d.a.o r5 = (com.google.protos.p4850an.p4855d.p4856a.C63462o) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r15 = r5.instance
            com.google.protos.an.d.a.p r15 = (com.google.protos.p4850an.p4855d.p4856a.C63463p) r15
            r8.getClass()
            com.google.protobuf.cq r12 = r15.f171511c
            boolean r16 = r12.mo58948c()
            if (r16 != 0) goto L_0x02b7
            com.google.protobuf.cq r12 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r12)
            r15.f171511c = r12
        L_0x02b7:
            com.google.protobuf.cq r12 = r15.f171511c
            r12.add(r8)
            com.google.protobuf.bv r5 = r5.build()
            com.google.protos.an.d.a.p r5 = (com.google.protos.p4850an.p4855d.p4856a.C63463p) r5
            r1.f38043d = r5
            com.google.assistant.e.c.c.ev r5 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.e.c.c.es r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51055es) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r12 = r5.instance
            com.google.assistant.e.c.c.ev r12 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r12
            r8.getClass()
            int r15 = r12.f132943a
            r15 = r15 | r9
            r12.f132943a = r15
            r12.f132944b = r8
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.assistant.e.c.c.ev r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r8
            r13.getClass()
            int r12 = r8.f132943a
            r12 = r12 | 1024(0x400, float:1.435E-42)
            r8.f132943a = r12
            r8.f132953k = r13
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.assistant.e.c.c.ev r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r8
            r11.getClass()
            int r12 = r8.f132943a
            r12 = r12 | 256(0x100, float:3.59E-43)
            r8.f132943a = r12
            r8.f132951i = r11
            com.google.protobuf.bv r5 = r5.build()
            com.google.assistant.e.c.c.ev r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r5
            r1.f38051l = r5
        L_0x0309:
            com.google.bb.a.fp r5 = r1.f38042c
            com.google.protobuf.cq r5 = r5.f144969c
            int r5 = r5.size()
            if (r5 > 0) goto L_0x044e
            com.google.protobuf.cq r5 = r6.f171531b
            int r5 = r5.size()
            if (r5 != 0) goto L_0x0321
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89845m()
            goto L_0x0399
        L_0x0321:
            int r5 = r6.f171533d
            int r5 = com.google.protos.p4850an.p4855d.p4856a.C63472y.m96243a(r5)
            if (r5 != 0) goto L_0x032b
            r13 = 3
            goto L_0x032c
        L_0x032b:
            r13 = r5
        L_0x032c:
            com.google.protos.f.b.d.b r5 = r1.f38052m
            int r8 = r5.f175581a
            r8 = r8 & r10
            if (r8 == 0) goto L_0x0341
            java.lang.String r5 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27783h(r5, r14)
            java.lang.String r8 = "SMS"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x0341
            r5 = 1
            goto L_0x0342
        L_0x0341:
            r5 = 0
        L_0x0342:
            if (r9 != r5) goto L_0x0345
            r13 = r5
        L_0x0345:
            int r13 = r13 + -1
            if (r13 == 0) goto L_0x0393
            if (r13 == r10) goto L_0x0388
            r5 = 4
            if (r13 == r5) goto L_0x0361
            com.google.common.f.a.d r5 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11841ac.f38040a
            com.google.common.f.x r5 = r5.mo56225c()
            java.lang.String r8 = "Unsupported messageType. The messageType is %s"
            r10 = 43655(0xaa87, float:6.1174E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r5).mo56372aa(r10)).mo56387q(r8, r13)
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89845m()
            goto L_0x0399
        L_0x0361:
            com.google.protos.an.d.a.p r5 = r6.f171536g
            if (r5 != 0) goto L_0x0367
            com.google.protos.an.d.a.p r5 = com.google.protos.p4850an.p4855d.p4856a.C63463p.f171507e
        L_0x0367:
            java.lang.String r5 = r5.f171510b
            java.lang.String r8 = "hangouts"
            boolean r8 = com.google.common.base.C58890d.m90990e(r5, r8)
            if (r8 != 0) goto L_0x0381
            java.lang.String r8 = "hangout"
            boolean r5 = com.google.common.base.C58890d.m90990e(r5, r8)
            if (r5 == 0) goto L_0x037a
            goto L_0x0381
        L_0x037a:
            com.google.bb.a.fg r5 = com.google.p4152bb.p4153a.C55084fg.APP_SPECIFIC_ENDPOINT_ID
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89846n(r5)
            goto L_0x0399
        L_0x0381:
            com.google.bb.a.fg r5 = com.google.p4152bb.p4153a.C55084fg.GAIA_ID
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89846n(r5)
            goto L_0x0399
        L_0x0388:
            com.google.bb.a.fg r5 = com.google.p4152bb.p4153a.C55084fg.PHONE_NUMBER
            com.google.bb.a.fg r8 = com.google.p4152bb.p4153a.C55084fg.GAIA_ID
            com.google.bb.a.fg r10 = com.google.p4152bb.p4153a.C55084fg.APP_SPECIFIC_ENDPOINT_ID
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89848p(r5, r8, r10)
            goto L_0x0399
        L_0x0393:
            com.google.bb.a.fg r5 = com.google.p4152bb.p4153a.C55084fg.PHONE_NUMBER
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89846n(r5)
        L_0x0399:
            boolean r8 = r5.isEmpty()
            if (r8 == 0) goto L_0x03af
            com.google.common.f.a.d r3 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11841ac.f38040a
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r5 = "#maybeLoadContacts: no suitable contact methods can be found."
            r8 = 43676(0xaa9c, float:6.1203E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r8)).mo56386p(r5)
            goto L_0x044e
        L_0x03af:
            r8 = r5
            com.google.common.b.pq r8 = (com.google.common.p4522b.C58724pq) r8
            int r10 = r8.f156474d
            if (r10 != r9) goto L_0x03bf
            com.google.protos.an.d.a.ab r10 = r6.f171534e
            if (r10 != 0) goto L_0x03bc
            com.google.protos.an.d.a.ab r10 = com.google.protos.p4850an.p4855d.p4856a.C63442ab.f171454e
        L_0x03bc:
            java.lang.String r10 = r10.f171457b
            goto L_0x03ce
        L_0x03bf:
            com.google.common.f.a.d r10 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11841ac.f38040a
            com.google.common.f.x r10 = r10.mo56226d()
            java.lang.String r11 = "#maybeLoadContacts: Ignored phone type as we have two contact methods."
            r12 = 43673(0xaa99, float:6.1199E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r10).mo56372aa(r12)).mo56386p(r11)
            r10 = r7
        L_0x03ce:
            com.google.protobuf.cq r11 = r6.f171531b
            int r11 = r11.size()
            if (r11 != 0) goto L_0x03e5
            com.google.common.f.a.d r3 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11841ac.f38040a
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r5 = "#maybeLoadContacts: Unable to fetch contacts as no recipient is in SendMessageAction"
            r8 = 43675(0xaa9b, float:6.1202E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r8)).mo56386p(r5)
            goto L_0x044e
        L_0x03e5:
            com.google.android.libraries.assistant.auto.ondevice.utils.f r11 = r1.f38047h
            com.google.protobuf.cq r12 = r6.f171531b
            r13 = 0
            java.lang.Object r12 = r12.get(r13)
            com.google.protos.an.d.a.af r12 = (com.google.protos.p4850an.p4855d.p4856a.C63446af) r12
            com.google.android.apps.gsa.a.c.a r13 = r1.f38053n
            com.google.android.apps.gsa.search.core.carassistant.e.c r13 = r13.f32299a
            java.util.Locale r13 = r13.mo79344b()
            com.google.bb.a.fp r10 = r11.mo20316b(r12, r5, r10, r13)
            if (r10 == 0) goto L_0x044e
            com.google.android.apps.gsa.g.g.c r11 = r1.f38046g
            com.google.bb.a.fg r12 = com.google.p4152bb.p4153a.C55084fg.APP_SPECIFIC_ENDPOINT_ID
            boolean r5 = r5.contains(r12)
            if (r5 == 0) goto L_0x0416
            int r5 = r8.f156474d
            if (r5 <= r9) goto L_0x040f
            com.google.common.b.gu r5 = r1.f38050k
            goto L_0x041a
        L_0x040f:
            com.google.assistant.e.c.c.ev r5 = r1.f38051l
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89846n(r5)
            goto L_0x041a
        L_0x0416:
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89845m()
        L_0x041a:
            com.google.bb.a.fp r3 = r11.a(r3, r10, r5)
            if (r3 == 0) goto L_0x044e
            com.google.common.f.a.d r5 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11841ac.f38040a
            com.google.common.f.x r5 = r5.mo56224b()
            com.google.common.f.a.a r5 = (com.google.common.p4526f.p4527a.C58970a) r5
            r8 = 43674(0xaa9a, float:6.12E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r8)
            com.google.common.f.a.a r5 = (com.google.common.p4526f.p4527a.C58970a) r5
            com.google.protobuf.cq r8 = r3.f144969c
            int r8 = r8.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r11 = "Fetched %d contacts from device. ContactQuery is %s, ContactReference is %s"
            r5.mo56359L(r11, r8, r10, r3)
            com.google.android.apps.gsa.a.c.a r5 = r1.f38053n
            com.google.android.apps.gsa.search.core.carassistant.e.c r5 = r5.f32299a
            java.util.Locale r5 = r5.mo79344b()
            com.google.bb.a.fp r3 = com.google.android.libraries.assistant.auto.ondevice.utils.C11943f.m27769c(r3, r5)
            r1.f38042c = r3
        L_0x044e:
            com.google.common.b.gu r5 = r1.mo20200d(r6, r9)
        L_0x0452:
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L_0x046f
            r1.f38041b = r9
            int r3 = r2.f172015a
            r3 = r3 & r9
            if (r3 == 0) goto L_0x0461
            java.lang.String r7 = r2.f172017c
        L_0x0461:
            com.google.common.f.a.d r2 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11841ac.f38040a
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "Cannot handle AnalyzerResponse in Send message builder. AnalyzerResponse query is: \n %s"
            r6 = 43635(0xaa73, float:6.1146E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r6)).mo56389s(r3, r7)
        L_0x046f:
            java.lang.Integer[] r2 = new java.lang.Integer[r9]
            r3 = 60736(0xed40, float:8.5109E-41)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 0
            r2[r6] = r3
            java.util.List r2 = java.util.Arrays.asList(r2)
            com.google.assistant.e.j.en r2 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32463b(r5, r2)
            if (r2 != 0) goto L_0x049a
            com.google.common.f.a.d r1 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11841ac.f38040a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "ConversationDelta is null"
            r3 = 43664(0xaa90, float:6.1186E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x04d9
        L_0x049a:
            com.google.assistant.e.e.a.j r3 = com.google.assistant.p3897e.p3910e.p3911a.C51195j.f133264n
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.e.e.a.e r3 = (com.google.assistant.p3897e.p3910e.p3911a.C51190e) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.e.e.a.j r5 = (com.google.assistant.p3897e.p3910e.p3911a.C51195j) r5
            r5.f133275j = r2
            int r2 = r5.f133266a
            r2 = r2 | 128(0x80, float:1.794E-43)
            r5.f133266a = r2
            com.google.protobuf.bv r2 = r3.build()
            com.google.assistant.e.e.a.j r2 = (com.google.assistant.p3897e.p3910e.p3911a.C51195j) r2
            com.google.android.apps.gsa.g.c.b r1 = r1.f38045f
            com.google.android.speech.embedded.TaggerResult r3 = new com.google.android.speech.embedded.TaggerResult
            com.google.common.o.te r5 = com.google.common.p4552o.C60527te.f163903c
            r3.<init>(r4, r5)
            r1.e(r3)
            com.google.common.f.a.d r1 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11841ac.f38040a
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r3 = "AssistantResponse created: %s"
            r4 = 43663(0xaa8f, float:6.1185E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r4)).mo56389s(r3, r2)
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r2)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
        L_0x04d9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.ondevice.p708b.C11840ab.mo17947a():java.lang.Object");
    }
}
