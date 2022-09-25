package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p976c;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.common.base.C58817ah;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61886aw;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.c.c.f */
/* compiled from: PG */
public final /* synthetic */ class C13487f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C61886aw f41373a;

    /* renamed from: b */
    public final /* synthetic */ List f41374b;

    /* renamed from: c */
    public final /* synthetic */ List f41375c;

    /* renamed from: d */
    public final /* synthetic */ C15481g f41376d;

    /* renamed from: e */
    public final /* synthetic */ boolean f41377e;

    public /* synthetic */ C13487f(C61886aw awVar, List list, List list2, C15481g gVar, boolean z) {
        this.f41373a = awVar;
        this.f41374b = list;
        this.f41375c = list2;
        this.f41376d = gVar;
        this.f41377e = z;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0342  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            com.google.knowledge.cerebra.sense.textclassifier.tclib.aw r1 = r0.f41373a
            java.util.List r2 = r0.f41374b
            java.util.List r3 = r0.f41375c
            com.google.android.libraries.assistant.auto.tng.o.a.g r4 = r0.f41376d
            boolean r5 = r0.f41377e
            r6 = r21
            com.google.android.libraries.assistant.auto.tng.f.d.a.d.a.e r6 = (com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.C13512e) r6
            com.google.common.f.e r7 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p976c.C13488g.f41378a
            com.google.common.b.gp r7 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.common.b.gu r1 = r1.mo58325a()
            int r8 = r1.size()
            r10 = 0
        L_0x001f:
            if (r10 >= r8) goto L_0x0362
            java.lang.Object r11 = r1.get(r10)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.aq r11 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.C61880aq) r11
            com.google.android.libraries.assistant.auto.tng.f.d.a.e r12 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e.UNKNOWN_TYPE
            java.lang.String r13 = r11.f167328a
            int r14 = r13.hashCode()
            r16 = -1
            r9 = 2
            r15 = 1
            switch(r14) {
                case -2101779112: goto L_0x0055;
                case 1196176578: goto L_0x004b;
                case 1806822421: goto L_0x0041;
                case 1928092749: goto L_0x0037;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x005f
        L_0x0037:
            java.lang.String r14 = "call_phone"
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x005f
            r13 = 2
            goto L_0x0060
        L_0x0041:
            java.lang.String r14 = "share_location"
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x005f
            r13 = 1
            goto L_0x0060
        L_0x004b:
            java.lang.String r14 = "view_map"
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x005f
            r13 = 3
            goto L_0x0060
        L_0x0055:
            java.lang.String r14 = "text_reply"
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x005f
            r13 = 0
            goto L_0x0060
        L_0x005f:
            r13 = -1
        L_0x0060:
            java.lang.String r14 = "tel:"
            r18 = 0
            if (r13 == 0) goto L_0x0160
            java.lang.String r0 = ""
            if (r13 == r15) goto L_0x00e8
            if (r13 == r9) goto L_0x00c3
            r9 = 3
            if (r13 == r9) goto L_0x008c
            com.google.common.f.e r9 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p976c.C13488g.f41378a
            com.google.common.f.x r9 = r9.mo56226d()
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            r12 = 44850(0xaf32, float:6.2848E-41)
            com.google.common.f.x r9 = r9.mo56372aa(r12)
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            java.lang.String r12 = "Unexpected conversation action type \"%s\""
            java.lang.String r13 = r11.f167328a
            r9.mo56389s(r12, r13)
            com.google.android.libraries.assistant.auto.tng.f.d.a.e r12 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e.UNRECOGNIZED
        L_0x0089:
            r9 = r0
            goto L_0x017e
        L_0x008c:
            android.net.Uri r9 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p976c.C13488g.m29744a(r11)
            if (r9 == 0) goto L_0x00b4
            java.lang.String r12 = r9.toString()
            java.lang.String r13 = "geo:0,0?q="
            java.lang.String r0 = r12.replace(r13, r0)
            java.lang.String r12 = "%20"
            java.lang.String r13 = " "
            java.lang.String r0 = r0.replace(r12, r13)
            java.lang.String r12 = "%2C"
            java.lang.String r13 = ","
            java.lang.String r0 = r0.replace(r12, r13)
            java.lang.String r9 = r9.toString()
            com.google.android.libraries.assistant.auto.tng.f.d.a.e r12 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e.NAVIGATE
            goto L_0x017e
        L_0x00b4:
            com.google.common.f.e r9 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p976c.C13488g.f41378a
            com.google.common.f.x r9 = r9.mo56224b()
            java.lang.String r13 = "Detected empty navigation intent."
            r15 = 44852(0xaf34, float:6.2851E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r15)).mo56386p(r13)
            goto L_0x0089
        L_0x00c3:
            android.net.Uri r9 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p976c.C13488g.m29744a(r11)
            if (r9 == 0) goto L_0x00e3
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = r9.replace(r14, r0)
            java.lang.String r0 = android.net.Uri.decode(r0)
            com.google.android.libraries.assistant.auto.tng.f.d.a.o r9 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.C13528n.m29810a(r3)
            java.lang.String r9 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.C13528n.m29812c(r0, r9)
            r19 = r9
            r9 = r0
            r0 = r19
            goto L_0x00e4
        L_0x00e3:
            r9 = r0
        L_0x00e4:
            com.google.android.libraries.assistant.auto.tng.f.d.a.e r12 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e.CALL_NUMBER
            goto L_0x017e
        L_0x00e8:
            int r9 = r6.mo21153k()
            if (r9 == 0) goto L_0x015f
            r13 = 8
            if (r9 == r13) goto L_0x0101
            com.google.common.f.e r9 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p976c.C13488g.f41378a
            com.google.common.f.x r9 = r9.mo56226d()
            java.lang.String r13 = "Error generating Eta Or Location."
            r15 = 44851(0xaf33, float:6.285E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r15)).mo56386p(r13)
            goto L_0x0089
        L_0x0101:
            java.lang.String r0 = r6.mo21149h()
            java.lang.String r9 = r6.mo21151i()
            java.lang.String r12 = r6.mo21152j()
            int r13 = r12.hashCode()
            r15 = -1611296843(0xffffffff9ff58fb5, float:-1.0399928E-19)
            if (r13 == r15) goto L_0x0126
            r15 = 68978(0x10d72, float:9.6659E-41)
            if (r13 == r15) goto L_0x011c
            goto L_0x0130
        L_0x011c:
            java.lang.String r13 = "ETA"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0130
            r12 = 1
            goto L_0x0131
        L_0x0126:
            java.lang.String r13 = "LOCATION"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0130
            r12 = 0
            goto L_0x0131
        L_0x0130:
            r12 = -1
        L_0x0131:
            if (r12 == 0) goto L_0x0157
            r13 = 1
            if (r12 == r13) goto L_0x014d
            com.google.common.f.e r12 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p976c.C13488g.f41378a
            com.google.common.f.x r12 = r12.mo56226d()
            java.lang.String r13 = r6.mo21152j()
            r15 = 44849(0xaf31, float:6.2847E-41)
            r16 = r0
            java.lang.String r0 = "Unexpected EtaOrLocationString type \"%s\""
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r15)).mo56389s(r0, r13)
            com.google.android.libraries.assistant.auto.tng.f.d.a.e r0 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e.UNRECOGNIZED
            goto L_0x015b
        L_0x014d:
            r16 = r0
            com.google.android.libraries.search.b.i.g r0 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97557cW
            r4.mo22352b(r0)
            com.google.android.libraries.assistant.auto.tng.f.d.a.e r0 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e.SHARE_ETA
            goto L_0x015b
        L_0x0157:
            r16 = r0
            com.google.android.libraries.assistant.auto.tng.f.d.a.e r0 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e.SHARE_LOCATION
        L_0x015b:
            r12 = r0
            r0 = r16
            goto L_0x017e
        L_0x015f:
            throw r18
        L_0x0160:
            java.lang.CharSequence r0 = r11.f167329b
            r0.getClass()
            java.lang.String r0 = r0.toString()
            com.google.br.r r9 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p976c.C13488g.f41379b
            com.google.br.k r12 = new com.google.br.k
            r12.<init>(r9, r0)
            boolean r9 = r12.mo54387h()
            if (r9 == 0) goto L_0x0179
            com.google.android.libraries.assistant.auto.tng.f.d.a.e r9 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e.EMOJI_REPLY
            goto L_0x017b
        L_0x0179:
            com.google.android.libraries.assistant.auto.tng.f.d.a.e r9 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e.TEXT_REPLY
        L_0x017b:
            r12 = r9
            goto L_0x0089
        L_0x017e:
            boolean r13 = r0.isEmpty()
            if (r13 != 0) goto L_0x0342
            boolean r13 = r9.isEmpty()
            if (r13 == 0) goto L_0x0192
            com.google.android.libraries.assistant.auto.tng.f.d.a.e r13 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e.SHARE_LOCATION
            boolean r13 = r13.equals(r12)
            if (r13 == 0) goto L_0x0342
        L_0x0192:
            com.google.android.libraries.assistant.auto.tng.f.d.a.e r13 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e.UNKNOWN_TYPE
            boolean r13 = r13.equals(r12)
            if (r13 != 0) goto L_0x0342
            com.google.android.libraries.assistant.auto.tng.f.d.a.e r13 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e.UNRECOGNIZED
            boolean r13 = r13.equals(r12)
            if (r13 == 0) goto L_0x01a4
            goto L_0x0342
        L_0x01a4:
            boolean r13 = r2.contains(r12)
            if (r13 != 0) goto L_0x01be
            com.google.common.f.e r0 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p976c.C13488g.f41378a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r9 = r12.name()
            r11 = 44855(0xaf37, float:6.2855E-41)
            java.lang.String r12 = "Unsupported smart action candidate type %s is skiped."
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r11)).mo56389s(r12, r9)
            goto L_0x035c
        L_0x01be:
            com.google.android.libraries.assistant.auto.tng.f.d.a.f r13 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13530f.f41474g
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.android.libraries.assistant.auto.tng.f.d.a.b r13 = (com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13441b) r13
            float r11 = r11.f167331d
            r13.copyOnWrite()
            com.google.protobuf.bv r15 = r13.instance
            com.google.android.libraries.assistant.auto.tng.f.d.a.f r15 = (com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13530f) r15
            r15.f41481f = r11
            r13.copyOnWrite()
            com.google.protobuf.bv r11 = r13.instance
            com.google.android.libraries.assistant.auto.tng.f.d.a.f r11 = (com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13530f) r11
            r0.getClass()
            r11.f41480e = r0
            com.google.android.libraries.assistant.auto.tng.f.d.a.c r0 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13461c.TC_LIB
            r13.copyOnWrite()
            com.google.protobuf.bv r11 = r13.instance
            com.google.android.libraries.assistant.auto.tng.f.d.a.f r11 = (com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13530f) r11
            int r0 = r0.getNumber()
            r11.f41479d = r0
            r12.getClass()
            r13.copyOnWrite()
            com.google.protobuf.bv r0 = r13.instance
            com.google.android.libraries.assistant.auto.tng.f.d.a.f r0 = (com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13530f) r0
            int r11 = r12.getNumber()
            r0.f41478c = r11
            int r0 = r12.ordinal()
            r11 = 7
            r15 = 4
            if (r0 == r15) goto L_0x0324
            r15 = 5
            if (r0 == r15) goto L_0x0314
            if (r0 == r11) goto L_0x02e9
            if (r5 == 0) goto L_0x02d2
            r9.getClass()
            com.google.assistant.e.j.zf r0 = com.google.assistant.p3897e.p3921j.C52640zf.f138212e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.ze r0 = (com.google.assistant.p3897e.p3921j.C52639ze) r0
            com.google.assistant.e.j.zj r11 = com.google.assistant.p3897e.p3921j.C52644zj.f138224d
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.e.j.zi r11 = (com.google.assistant.p3897e.p3921j.C52643zi) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r14 = r11.instance
            com.google.assistant.e.j.zj r14 = (com.google.assistant.p3897e.p3921j.C52644zj) r14
            int r15 = r14.f138226a
            r17 = 1
            r15 = r15 | 1
            r14.f138226a = r15
            r14.f138227b = r9
            int r9 = r12.getNumber()
            int r9 = com.google.assistant.p3897e.p3921j.C52646zl.m86681a(r9)
            if (r9 == 0) goto L_0x02d1
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.assistant.e.j.zj r12 = (com.google.assistant.p3897e.p3921j.C52644zj) r12
            int r9 = r9 + -1
            r12.f138228c = r9
            int r9 = r12.f138226a
            r14 = 2
            r9 = r9 | r14
            r12.f138226a = r9
            r0.copyOnWrite()
            com.google.protobuf.bv r9 = r0.instance
            com.google.assistant.e.j.zf r9 = (com.google.assistant.p3897e.p3921j.C52640zf) r9
            com.google.protobuf.bv r11 = r11.build()
            com.google.assistant.e.j.zj r11 = (com.google.assistant.p3897e.p3921j.C52644zj) r11
            r11.getClass()
            r9.f138216c = r11
            int r11 = r9.f138214a
            r12 = 4
            r11 = r11 | r12
            r9.f138214a = r11
            com.google.assistant.e.j.ka r9 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.e.j.jz r9 = (com.google.assistant.p3897e.p3921j.C52228jz) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r11 = r9.instance
            com.google.assistant.e.j.ka r11 = (com.google.assistant.p3897e.p3921j.C52230ka) r11
            int r12 = r11.f137059a
            r14 = 1
            r12 = r12 | r14
            r11.f137059a = r12
            java.lang.String r12 = "assistant.api.client_input.MessageNotificationReplyParam"
            r11.f137060b = r12
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.zf r0 = (com.google.assistant.p3897e.p3921j.C52640zf) r0
            com.google.protobuf.z r0 = r0.toByteString()
            r9.copyOnWrite()
            com.google.protobuf.bv r11 = r9.instance
            com.google.assistant.e.j.ka r11 = (com.google.assistant.p3897e.p3921j.C52230ka) r11
            r0.getClass()
            int r12 = r11.f137059a
            r14 = 2
            r12 = r12 | r14
            r11.f137059a = r12
            r11.f137061c = r0
            com.google.protobuf.bv r0 = r9.build()
            com.google.assistant.e.j.ka r0 = (com.google.assistant.p3897e.p3921j.C52230ka) r0
            com.google.assistant.e.j.du r9 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.e.j.ds r9 = (com.google.assistant.p3897e.p3921j.C51803ds) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r11 = r9.instance
            com.google.assistant.e.j.du r11 = (com.google.assistant.p3897e.p3921j.C51805du) r11
            int r12 = r11.f135926a
            r14 = 1
            r12 = r12 | r14
            r11.f135926a = r12
            java.lang.String r12 = "message_notification.REPLY"
            r11.f135927b = r12
            java.lang.String r11 = "message_notification_reply_param"
            r9.mo53729a(r11, r0)
            com.google.protobuf.bv r0 = r9.build()
            com.google.assistant.e.j.du r0 = (com.google.assistant.p3897e.p3921j.C51805du) r0
            r13.copyOnWrite()
            com.google.protobuf.bv r9 = r13.instance
            com.google.android.libraries.assistant.auto.tng.f.d.a.f r9 = (com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13530f) r9
            r0.getClass()
            r9.f41477b = r0
            r0 = 5
            r9.f41476a = r0
            goto L_0x0338
        L_0x02d1:
            throw r18
        L_0x02d2:
            r0 = 5
            r9.getClass()
            com.google.assistant.e.j.du r9 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.C13515b.m29797b(r9, r12)
            r13.copyOnWrite()
            com.google.protobuf.bv r11 = r13.instance
            com.google.android.libraries.assistant.auto.tng.f.d.a.f r11 = (com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13530f) r11
            r9.getClass()
            r11.f41477b = r9
            r11.f41476a = r0
            goto L_0x0338
        L_0x02e9:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r11 = "android.intent.action.CALL"
            r0.<init>(r11)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r9 = r14.concat(r9)
            android.net.Uri r9 = android.net.Uri.parse(r9)
            r0.setData(r9)
            r9 = 1
            java.lang.String r0 = r0.toUri(r9)
            r13.copyOnWrite()
            com.google.protobuf.bv r9 = r13.instance
            com.google.android.libraries.assistant.auto.tng.f.d.a.f r9 = (com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13530f) r9
            r0.getClass()
            r11 = 6
            r9.f41476a = r11
            r9.f41477b = r0
            goto L_0x0338
        L_0x0314:
            r11 = 6
            r9.getClass()
            r13.copyOnWrite()
            com.google.protobuf.bv r0 = r13.instance
            com.google.android.libraries.assistant.auto.tng.f.d.a.f r0 = (com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13530f) r0
            r0.f41476a = r11
            r0.f41477b = r9
            goto L_0x0338
        L_0x0324:
            com.google.android.libraries.assistant.auto.tng.f.d.a.e r0 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e.SHARE_LOCATION
            java.lang.String r0 = r0.name()
            r13.copyOnWrite()
            com.google.protobuf.bv r9 = r13.instance
            com.google.android.libraries.assistant.auto.tng.f.d.a.f r9 = (com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13530f) r9
            r0.getClass()
            r9.f41476a = r11
            r9.f41477b = r0
        L_0x0338:
            com.google.protobuf.bv r0 = r13.build()
            com.google.android.libraries.assistant.auto.tng.f.d.a.f r0 = (com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13530f) r0
            r7.mo55395g(r0)
            goto L_0x035c
        L_0x0342:
            com.google.common.f.e r9 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p976c.C13488g.f41378a
            com.google.common.f.x r9 = r9.mo56226d()
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            r11 = 44854(0xaf36, float:6.2854E-41)
            com.google.common.f.x r9 = r9.mo56372aa(r11)
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            java.lang.String r11 = "Invalid smart action candidate (text: \"%s\", type: %s) is skipped."
            java.lang.String r12 = r12.name()
            r9.mo56354G(r11, r0, r12)
        L_0x035c:
            int r10 = r10 + 1
            r0 = r20
            goto L_0x001f
        L_0x0362:
            com.google.common.b.gu r0 = r7.mo55394f()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p976c.C13487f.apply(java.lang.Object):java.lang.Object");
    }
}
