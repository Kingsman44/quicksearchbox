package com.google.android.libraries.assistant.auto.ondevice.utils;

import com.google.common.p4526f.p4527a.C58974d;
import com.google.p4242bp.p4243a.p4245b.C56151j;
import com.google.p4242bp.p4243a.p4245b.C56152k;
import com.google.protos.p4985f.p4988b.p4993d.C64782b;
import com.google.protos.p4985f.p4988b.p4993d.C64784d;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.utils.k */
/* compiled from: PG */
public final class C11948k {

    /* renamed from: a */
    private static final C58974d f38386a = C58974d.m91134h("SemanticsParamsUtil");

    /* renamed from: a */
    public static C56152k m27805a(C64782b bVar) {
        C56151j jVar = (C56151j) C56152k.f149611f.createBuilder();
        if ((bVar.f175581a & 2) != 0) {
            C64784d dVar = bVar.f175582b;
            if (dVar == null) {
                dVar = C64784d.f175584d;
            }
            if (dVar.f175587b.equals("call.CONTACT")) {
                jVar.mo54328a("Call-Unprompted");
                if (C11945h.m27791p(bVar, "client_entity_id") == 1) {
                    jVar.mo54328a("Call-Prompted-Recipient");
                } else {
                    String i = C11945h.m27784i(bVar, C11939b.f38355c);
                    if ("client_entity_id".equals(i)) {
                        jVar.mo54328a("Call-Prompted-ContactNameDisambiguation");
                    } else if ("contact_type".equals(i) || "contact_number".equals(i)) {
                        jVar.mo54328a("Call-Prompted-ContactTypeDisambiguation");
                    }
                }
            }
        }
        return (C56152k) jVar.build();
    }

    /* renamed from: b */
    public static C56152k m27806b(C64782b bVar) {
        C56151j jVar = (C56151j) C56152k.f149611f.createBuilder();
        if ((bVar.f175581a & 2) != 0) {
            if (m27808d(bVar, "search.MESSAGE")) {
                jVar.mo54328a("SearchMessageAction-Prompted-Read");
                jVar.mo54328a("SearchMessageAction-Prompted-Reply");
                jVar.mo54328a("SearchMessageAction-Prompted-Cancel");
                jVar.mo54328a("SearchMessageAction-Prompted-Skip");
            } else if (m27808d(bVar, "reply.MESSAGE")) {
                if (C11945h.m27791p(bVar, "message") == 1) {
                    jVar.mo54328a("SendTextMessageToContact-Prompted-Message");
                } else if (C11945h.m27791p(bVar, "message") == 2) {
                    jVar.mo54328a("SendTextMessageToContact-Prompted-Confirmed");
                    jVar.mo54328a("SearchMessageAction-Prompted-Cancel");
                }
                jVar.mo54328a("SendTextMessageToContact-Unprompted");
            }
        }
        return (C56152k) jVar.build();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.p4242bp.p4243a.p4245b.C56152k m27807c(com.google.protos.p4985f.p4988b.p4993d.C64782b r11) {
        /*
            com.google.bp.a.b.k r0 = com.google.p4242bp.p4243a.p4245b.C56152k.f149611f
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.bp.a.b.j r0 = (com.google.p4242bp.p4243a.p4245b.C56151j) r0
            int r1 = r11.f175581a
            r2 = 2
            r1 = r1 & r2
            if (r1 == 0) goto L_0x00fa
            boolean r1 = m27809e(r11)
            java.lang.String r3 = "SendMessage.NUMBER"
            boolean r3 = m27808d(r11, r3)
            java.lang.String r4 = "contact_number"
            r5 = 1
            java.lang.String r6 = "SendTextMessageToContact-Unprompted"
            java.lang.String r7 = "SendChatMessageToContact-Unprompted"
            if (r3 != 0) goto L_0x00bd
            java.lang.String r3 = "client_entity_id"
            int r8 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27791p(r11, r3)
            if (r8 != r5) goto L_0x003f
            if (r1 == 0) goto L_0x0035
            java.lang.String r1 = "SendTextMessageToContact-Prompted-Recipient"
            r0.mo54328a(r1)
            r0.mo54328a(r6)
            goto L_0x00bd
        L_0x0035:
            java.lang.String r1 = "SendChatMessageToContact-Prompted-Recipient"
            r0.mo54328a(r1)
            r0.mo54328a(r7)
            goto L_0x00bd
        L_0x003f:
            com.google.common.b.gu r8 = com.google.android.libraries.assistant.auto.ondevice.utils.C11939b.f38354b
            java.lang.String r8 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27784i(r11, r8)
            if (r8 == 0) goto L_0x00bd
            int r9 = r8.hashCode()
            r10 = 3
            switch(r9) {
                case -987494927: goto L_0x006a;
                case -442052536: goto L_0x0062;
                case 582339459: goto L_0x005a;
                case 1277933561: goto L_0x0050;
                default: goto L_0x004f;
            }
        L_0x004f:
            goto L_0x0074
        L_0x0050:
            java.lang.String r3 = "contact_type"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0074
            r3 = 2
            goto L_0x0075
        L_0x005a:
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0074
            r3 = 0
            goto L_0x0075
        L_0x0062:
            boolean r3 = r8.equals(r4)
            if (r3 == 0) goto L_0x0074
            r3 = 3
            goto L_0x0075
        L_0x006a:
            java.lang.String r3 = "provider"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0074
            r3 = 1
            goto L_0x0075
        L_0x0074:
            r3 = -1
        L_0x0075:
            if (r3 == 0) goto L_0x00aa
            if (r3 == r5) goto L_0x00a0
            if (r3 == r2) goto L_0x008c
            if (r3 == r10) goto L_0x008c
            com.google.common.f.a.d r1 = f38386a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Unknown states. No contexts are added."
            r3 = 43903(0xab7f, float:6.1521E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56386p(r2)
            goto L_0x00bd
        L_0x008c:
            if (r1 == 0) goto L_0x0097
            java.lang.String r1 = "SendTextMessageToContact-Prompted-ContactTypeDisambiguation"
            r0.mo54328a(r1)
            r0.mo54328a(r6)
            goto L_0x00bd
        L_0x0097:
            java.lang.String r1 = "SendChatMessageToContact-Prompted-ContactTypeDisambiguation"
            r0.mo54328a(r1)
            r0.mo54328a(r7)
            goto L_0x00bd
        L_0x00a0:
            if (r1 == 0) goto L_0x00a6
            r0.mo54328a(r6)
            goto L_0x00bd
        L_0x00a6:
            r0.mo54328a(r7)
            goto L_0x00bd
        L_0x00aa:
            if (r1 == 0) goto L_0x00b5
            java.lang.String r1 = "SendTextMessageToContact-Prompted-ContactNameDisambiguation"
            r0.mo54328a(r1)
            r0.mo54328a(r6)
            goto L_0x00bd
        L_0x00b5:
            java.lang.String r1 = "SendChatMessageToContact-Prompted-ContactNameDisambiguation"
            r0.mo54328a(r1)
            r0.mo54328a(r7)
        L_0x00bd:
            boolean r1 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27788m(r11, r4)
            if (r1 == 0) goto L_0x00fa
            java.lang.String r1 = "message"
            int r1 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27791p(r11, r1)
            if (r1 != r5) goto L_0x00e3
            boolean r11 = m27809e(r11)
            if (r11 == 0) goto L_0x00da
            java.lang.String r11 = "SendTextMessageToContact-Prompted-Message"
            r0.mo54328a(r11)
            r0.mo54328a(r6)
            goto L_0x00fa
        L_0x00da:
            java.lang.String r11 = "SendChatMessageToContact-Prompted-Message"
            r0.mo54328a(r11)
            r0.mo54328a(r7)
            goto L_0x00fa
        L_0x00e3:
            boolean r11 = m27809e(r11)
            if (r11 == 0) goto L_0x00f2
            java.lang.String r11 = "SendTextMessageToContact-Prompted-Confirmed"
            r0.mo54328a(r11)
            r0.mo54328a(r6)
            goto L_0x00fa
        L_0x00f2:
            java.lang.String r11 = "SendChatMessageToContact-Prompted-Confirmed"
            r0.mo54328a(r11)
            r0.mo54328a(r7)
        L_0x00fa:
            com.google.protobuf.bv r11 = r0.build()
            com.google.bp.a.b.k r11 = (com.google.p4242bp.p4243a.p4245b.C56152k) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.ondevice.utils.C11948k.m27807c(com.google.protos.f.b.d.b):com.google.bp.a.b.k");
    }

    /* renamed from: d */
    private static boolean m27808d(C64782b bVar, String str) {
        C64784d dVar = bVar.f175582b;
        if (dVar == null) {
            dVar = C64784d.f175584d;
        }
        return dVar.f175587b.equals(str);
    }

    /* renamed from: e */
    private static boolean m27809e(C64782b bVar) {
        return m27808d(bVar, "SendMessage.CONTACT") || m27808d(bVar, "SendMessage.NUMBER");
    }
}
