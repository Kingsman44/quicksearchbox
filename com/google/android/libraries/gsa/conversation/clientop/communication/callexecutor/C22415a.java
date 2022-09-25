package com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor;

import com.google.assistant.p3897e.p3921j.C52289mf;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.a */
/* compiled from: PG */
public final /* synthetic */ class C22415a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ CallExecutor f61923a;

    /* renamed from: b */
    public final /* synthetic */ boolean f61924b;

    /* renamed from: c */
    public final /* synthetic */ C52289mf f61925c;

    /* renamed from: d */
    public final /* synthetic */ boolean f61926d;

    public /* synthetic */ C22415a(CallExecutor callExecutor, boolean z, C52289mf mfVar, boolean z2) {
        this.f61923a = callExecutor;
        this.f61924b = z;
        this.f61925c = mfVar;
        this.f61926d = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x028b, code lost:
        if (r5.f137263d.equals("EMERGENCY") != false) goto L_0x028d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x045c, code lost:
        r3.mo27608c("PACKAGE_NOT_FOUND");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.CallExecutor.f61911a.mo56225c()).mo56372aa(48266)).mo56386p("Failed to get package information");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x047b, code lost:
        r3.mo27608c("INVALID_ARGS");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.CallExecutor.f61911a.mo56225c()).mo56372aa(48265)).mo56386p("Invalid data in call args");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:?, code lost:
        return com.google.common.util.concurrent.C60856cj.m92900i(com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(com.google.assistant.p3897e.p3921j.C52235kf.INTERNAL, (java.lang.String) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:?, code lost:
        return com.google.common.util.concurrent.C60856cj.m92900i(com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(com.google.assistant.p3897e.p3921j.C52235kf.INTERNAL, (java.lang.String) null));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0400 A[Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }] */
    /* JADX WARNING: Removed duplicated region for block: B:190:? A[ExcHandler: k (unused com.google.android.libraries.gsa.conversation.clientop.k), SYNTHETIC, Splitter:B:1:0x0013] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx apply(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.String r1 = "com.google.android.apps.tachyon"
            java.lang.String r2 = "com.android.server.telecom"
            com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.CallExecutor r3 = r0.f61923a
            boolean r4 = r0.f61924b
            com.google.assistant.e.j.mf r5 = r0.f61925c
            boolean r6 = r0.f61926d
            r7 = r17
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r8 = 0
            boolean r7 = r7.booleanValue()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r7 == 0) goto L_0x0435
            java.lang.String r7 = "voicemail:"
            java.lang.String r9 = "VOICEMAIL"
            java.lang.String r10 = "SUCCESS"
            java.lang.String r11 = "tel:"
            java.lang.String r12 = "android.telecom.extra.START_CALL_WITH_SPEAKERPHONE"
            r13 = 1
            if (r4 == 0) goto L_0x00b4
            android.telecom.TelecomManager r4 = r3.f61916f     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r4 != 0) goto L_0x002c
            goto L_0x00b4
        L_0x002c:
            boolean r4 = r5.f137268i     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r4 == 0) goto L_0x00b4
            boolean r4 = com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.CallExecutor.m41846g(r5)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r4 != 0) goto L_0x00b4
            boolean r4 = com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.CallExecutor.m41845f(r5)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r4 != 0) goto L_0x00b4
            android.telecom.TelecomManager r1 = r3.f61916f     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r1 == 0) goto L_0x0099
            java.lang.String r1 = r5.f137263d     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            boolean r1 = r9.equals(r1)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r1 == 0) goto L_0x0057
            java.lang.String r1 = r5.f137262c     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r1 = r7.concat(r1)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            goto L_0x0065
        L_0x0057:
            java.lang.String r1 = r5.f137262c     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r1 = r11.concat(r1)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x0065:
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r2.<init>()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            boolean r4 = r5.f137264e     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r4 == 0) goto L_0x0071
            r2.putBoolean(r12, r13)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x0071:
            r3.mo27609d(r5)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.common.f.e r4 = com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.CallExecutor.f61911a     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.common.f.x r4 = r4.mo56224b()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r5 = "Placing call with TelecomManager"
            r7 = 48259(0xbc83, float:6.7625E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r7)).mo56386p(r5)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.android.libraries.gsa.conversation.clientop.communication.a.b r4 = r3.f61915e     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r4 == 0) goto L_0x008d
            com.google.android.libraries.gsa.conversation.clientop.communication.a.a r5 = r3.f61917g     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r5 == 0) goto L_0x008d
            r4.mo27602b(r5)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x008d:
            android.telecom.TelecomManager r4 = r3.f61916f     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r4.placeCall(r1, r2)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r3.mo27608c(r10)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61893a     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            goto L_0x03e8
        L_0x0099:
            com.google.common.f.e r1 = com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.CallExecutor.f61911a     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r2 = "Unable to place call: null TelecomManager"
            r4 = 48258(0xbc82, float:6.7624E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r4)).mo56386p(r2)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r1 = "TELECOM_MANAGER_FAIL"
            r3.mo27608c(r1)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.INTERNAL     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r1, r8)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            goto L_0x03e8
        L_0x00b4:
            android.content.Context r4 = r3.f61912b     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            dagger.a r14 = r3.f61914d     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.Object r14 = r14.mo27525b()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            android.content.pm.PackageManager r14 = (android.content.pm.PackageManager) r14     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            boolean r15 = com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.CallExecutor.m41845f(r5)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r8 = "PHONE_NUMBER"
            r13 = 6
            if (r15 == 0) goto L_0x01a6
            java.lang.String r2 = r5.f137263d     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            boolean r2 = r2.equals(r8)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r7 = "Only phone number is supported."
            com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.CallExecutor.m41844b(r2, r7)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r2 = r5.f137262c     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            boolean r7 = r2.isEmpty()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r8 = 1
            r7 = r7 ^ r8
            java.lang.String r9 = "Missing phone number"
            com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.CallExecutor.m41844b(r7, r9)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.android.apps.i.c.a.e r7 = com.google.android.apps.p8928i.p8932c.p8933a.C119155f.m197863d()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r7.mo104210c(r8)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r7.mo104225e(r2)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.android.apps.i.a.a.d r2 = com.google.android.apps.p8928i.p8929a.p8930a.C119148d.f332313c     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.android.apps.i.a.a.a r2 = (com.google.android.apps.p8928i.p8929a.p8930a.C119145a) r2     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.assistant.e.j.me r8 = r5.f137266g     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r8 != 0) goto L_0x00f7
            com.google.assistant.e.j.me r8 = com.google.assistant.p3897e.p3921j.C52288me.f137255b     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x00f7:
            java.lang.String r8 = r8.f137257a     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            boolean r8 = r8.isEmpty()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r8 != 0) goto L_0x012d
            com.google.assistant.e.j.me r8 = r5.f137266g     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r8 != 0) goto L_0x0105
            com.google.assistant.e.j.me r8 = com.google.assistant.p3897e.p3921j.C52288me.f137255b     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x0105:
            java.lang.String r8 = r8.f137257a     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.android.apps.i.a.a.c r9 = com.google.android.apps.p8928i.p8929a.p8930a.C119147c.f332310b     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.protobuf.bn r9 = r9.createBuilder()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.android.apps.i.a.a.b r9 = (com.google.android.apps.p8928i.p8929a.p8930a.C119146b) r9     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r9.copyOnWrite()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.protobuf.bv r11 = r9.instance     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.android.apps.i.a.a.c r11 = (com.google.android.apps.p8928i.p8929a.p8930a.C119147c) r11     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r8.getClass()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r11.f332312a = r8     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r2.copyOnWrite()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.protobuf.bv r8 = r2.instance     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.android.apps.i.a.a.d r8 = (com.google.android.apps.p8928i.p8929a.p8930a.C119148d) r8     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.protobuf.bv r9 = r9.build()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.android.apps.i.a.a.c r9 = (com.google.android.apps.p8928i.p8929a.p8930a.C119147c) r9     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r9.getClass()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r8.f332316b = r9     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x012d:
            com.google.protobuf.cq r8 = r5.f137267h     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x0133:
            boolean r9 = r8.hasNext()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r9 == 0) goto L_0x017d
            java.lang.Object r9 = r8.next()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.assistant.e.j.pj r9 = (com.google.assistant.p3897e.p3921j.C52374pj) r9     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            int r11 = r9.f137437b     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r12 = 4
            if (r11 != r12) goto L_0x0133
            java.lang.Object r9 = r9.f137438c     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r9 = r9.trim()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.common.l.i r11 = com.google.common.p4541l.C59326i.f157516d     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            boolean r11 = r11.mo56829i(r9)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r11 == 0) goto L_0x0161
            r11 = 0
            byte[] r9 = android.util.Base64.decode(r9, r11)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.protobuf.z r9 = com.google.protobuf.C63088z.m96139A(r9)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r2.mo104207a(r9)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            goto L_0x0133
        L_0x0161:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r2.<init>()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r4 = "decodeRegistrationId: invalid base64 string %s["
            r2.append(r4)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r2.append(r9)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r4 = "]"
            r2.append(r4)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r2 = r2.toString()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r1.<init>(r2)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            throw r1     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x017d:
            com.google.protobuf.bv r8 = r2.instance     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.android.apps.i.a.a.d r8 = (com.google.android.apps.p8928i.p8929a.p8930a.C119148d) r8     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.protobuf.cq r8 = r8.f332315a     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.util.List r8 = java.util.Collections.unmodifiableList(r8)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            boolean r8 = r8.isEmpty()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r8 != 0) goto L_0x019c
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.android.apps.i.a.a.d r2 = (com.google.android.apps.p8928i.p8929a.p8930a.C119148d) r2     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r8 = r7
            com.google.android.apps.i.c.a.a r8 = (com.google.android.apps.p8928i.p8932c.p8933a.C119150a) r8     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r8.f332317a = r2     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x019c:
            com.google.android.apps.i.c.a.f r2 = r7.mo104224d()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            android.content.Intent r2 = com.google.android.apps.p8928i.p8932c.p8933a.C119156g.m197867a(r2, r4)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            goto L_0x0330
        L_0x01a6:
            boolean r15 = com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.CallExecutor.m41846g(r5)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r15 == 0) goto L_0x0201
            android.content.ContentResolver r2 = r4.getContentResolver()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r7 = r5.f137263d     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r8 = "APP_UNIQUE_ENDPOINT"
            boolean r7 = r7.equals(r8)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r7 == 0) goto L_0x01bd
            java.lang.String r7 = r5.f137262c     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            goto L_0x01c3
        L_0x01bd:
            java.lang.String r7 = r5.f137262c     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r7 = com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.C22419e.m41853b(r7)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x01c3:
            java.lang.String r8 = "vnd.android.cursor.item/vnd.com.whatsapp.voip.call"
            android.content.Intent r2 = com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.C22419e.m41852a(r2, r7, r8)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r2 == 0) goto L_0x01cd
            goto L_0x0330
        L_0x01cd:
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r2 = r5.f137262c     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r5 = 0
            r1[r5] = r2     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r2 = 2132093722(0x7f152b1a, float:1.9827877E38)
            java.lang.String r1 = r4.getString(r2, r1)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.common.f.e r2 = com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.CallExecutor.f61911a     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r5 = "%s"
            r6 = 48257(0xbc81, float:6.7622E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r6)).mo56389s(r5, r1)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            android.os.Handler r2 = new android.os.Handler     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            android.os.Looper r5 = android.os.Looper.getMainLooper()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r2.<init>(r5)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.b r5 = new com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.b     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r5.<init>(r4, r1)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r2.post(r5)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.android.libraries.gsa.conversation.clientop.k r1 = new com.google.android.libraries.gsa.conversation.clientop.k     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r1.<init>()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            throw r1     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x0201:
            int r15 = r5.f137260a     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r15 != r13) goto L_0x0279
            java.lang.Object r15 = r5.f137261b     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.assistant.e.c.c.gh r15 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r15     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            int r13 = r15.f133012b     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r0 = 1
            if (r13 != r0) goto L_0x0213
            java.lang.Object r0 = r15.f133013c     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.assistant.e.c.c.ev r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r0     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            goto L_0x0215
        L_0x0213:
            com.google.assistant.e.c.c.ev r0 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x0215:
            java.lang.String r0 = r0.f132944b     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            boolean r0 = r0.isEmpty()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r0 != 0) goto L_0x0279
            int r0 = r5.f137260a     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r13 = 6
            if (r0 != r13) goto L_0x0227
            java.lang.Object r0 = r5.f137261b     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.assistant.e.c.c.gh r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r0     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            goto L_0x0229
        L_0x0227:
            com.google.assistant.e.c.c.gh r0 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x0229:
            int r13 = r0.f133012b     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r15 = 1
            if (r13 != r15) goto L_0x0233
            java.lang.Object r0 = r0.f133013c     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.assistant.e.c.c.ev r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r0     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            goto L_0x0235
        L_0x0233:
            com.google.assistant.e.c.c.ev r0 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x0235:
            int r0 = r0.f132943a     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0279
            android.content.ContentResolver r0 = r4.getContentResolver()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r2 = r5.f137262c     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            int r7 = r5.f137260a     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r8 = 6
            if (r7 != r8) goto L_0x024b
            java.lang.Object r8 = r5.f137261b     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.assistant.e.c.c.gh r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r8     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            goto L_0x024d
        L_0x024b:
            com.google.assistant.e.c.c.gh r8 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x024d:
            int r9 = r8.f133012b     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r11 = 1
            if (r9 != r11) goto L_0x0257
            java.lang.Object r8 = r8.f133013c     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.assistant.e.c.c.ev r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r8     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            goto L_0x0259
        L_0x0257:
            com.google.assistant.e.c.c.ev r8 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x0259:
            java.lang.String r8 = r8.f132953k     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r9 = 6
            if (r7 != r9) goto L_0x0263
            java.lang.Object r7 = r5.f137261b     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.assistant.e.c.c.gh r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r7     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            goto L_0x0265
        L_0x0263:
            com.google.assistant.e.c.c.gh r7 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x0265:
            int r9 = r7.f133012b     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r11 = 1
            if (r9 != r11) goto L_0x026f
            java.lang.Object r7 = r7.f133013c     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.assistant.e.c.c.ev r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r7     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            goto L_0x0271
        L_0x026f:
            com.google.assistant.e.c.c.ev r7 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x0271:
            java.lang.String r7 = r7.f132944b     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            android.content.Intent r2 = com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.C22418d.m41851a(r4, r0, r2, r8, r7)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            goto L_0x0330
        L_0x0279:
            java.lang.String r0 = r5.f137263d     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            boolean r0 = r0.equals(r8)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r8 = "android.intent.action.CALL"
            java.lang.String r13 = "EMERGENCY"
            if (r0 != 0) goto L_0x028d
            java.lang.String r0 = r5.f137263d     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            boolean r0 = r0.equals(r13)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r0 == 0) goto L_0x0314
        L_0x028d:
            java.lang.String r0 = r5.f137262c     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            boolean r0 = r0.isEmpty()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r0 != 0) goto L_0x0314
            java.lang.String r0 = r5.f137263d     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            boolean r0 = r0.equals(r13)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r0 != 0) goto L_0x02d1
            java.lang.String r0 = r5.f137262c     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            boolean r0 = android.telephony.PhoneNumberUtils.isEmergencyNumber(r0)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r0 == 0) goto L_0x02a6
            goto L_0x02d1
        L_0x02a6:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r0.<init>(r8)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x02b6, k -> 0x047b }
            r7 = 0
            r4.getPackageInfo(r2, r7)     // Catch:{ NameNotFoundException -> 0x02b6, k -> 0x047b }
            r0.setPackage(r2)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x02b6:
            boolean r2 = r5.f137264e     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r2 == 0) goto L_0x02be
            r2 = 1
            r0.putExtra(r12, r2)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x02be:
            java.lang.String r2 = r5.f137262c     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r2 = r11.concat(r2)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r0.setData(r2)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r2 = r0
            goto L_0x0330
        L_0x02d1:
            android.content.Intent r2 = new android.content.Intent     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r0 = "android.intent.action.CALL_PRIVILEGED"
            r2.<init>(r0)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r0 = r5.f137262c     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r0 = r11.concat(r0)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r2.setData(r0)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            boolean r0 = r5.f137264e     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r0 == 0) goto L_0x02f1
            r0 = 1
            r2.putExtra(r12, r0)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x02f1:
            java.util.List r0 = com.google.android.libraries.gsa.conversation.clientop.C22535l.m41990b(r2, r14)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.util.List r0 = com.google.android.libraries.gsa.conversation.clientop.C22535l.m41989a(r0, r14)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            boolean r0 = r0.isEmpty()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r0 != 0) goto L_0x0300
            goto L_0x0330
        L_0x0300:
            com.google.common.f.e r0 = com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.CallExecutor.f61911a     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r1 = "Unable to call emergency number. CALL_PRIVILEGED intent is not supported."
            r2 = 48253(0xbc7d, float:6.7617E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.android.libraries.gsa.conversation.clientop.k r0 = new com.google.android.libraries.gsa.conversation.clientop.k     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r0.<init>()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            throw r0     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x0314:
            java.lang.String r0 = r5.f137263d     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            boolean r0 = r0.equals(r9)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r0 == 0) goto L_0x0421
            android.content.Intent r2 = new android.content.Intent     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r2.<init>(r8)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            boolean r0 = r5.f137264e     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r0 == 0) goto L_0x0329
            r0 = 1
            r2.putExtra(r12, r0)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x0329:
            android.net.Uri r0 = android.net.Uri.parse(r7)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r2.setData(r0)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x0330:
            boolean r0 = r5.f137268i     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r0 == 0) goto L_0x0339
            r0 = 262144(0x40000, float:3.67342E-40)
            r2.addFlags(r0)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x0339:
            com.google.common.f.e r0 = com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.CallExecutor.f61911a     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r4 = "Placing a call"
            r7 = 48260(0xbc84, float:6.7627E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r7)).mo56386p(r4)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            android.content.Context r0 = r3.f61912b     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            int r4 = r5.f137260a     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r7 = 6
            if (r4 != r7) goto L_0x039d
            java.lang.Object r4 = r5.f137261b     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.assistant.e.c.c.gh r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r4     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            int r7 = r4.f133012b     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r8 = 1
            if (r7 != r8) goto L_0x035c
            java.lang.Object r4 = r4.f133013c     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.assistant.e.c.c.ev r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r4     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            goto L_0x035e
        L_0x035c:
            com.google.assistant.e.c.c.ev r4 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x035e:
            java.lang.String r4 = r4.f132944b     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            boolean r4 = com.google.common.base.C58890d.m90990e(r4, r1)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r4 == 0) goto L_0x039d
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r4 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r4)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            int r0 = r0.versionCode     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r1 = 2983276(0x2d856c, float:4.18046E-39)
            if (r0 >= r1) goto L_0x039d
            com.google.android.libraries.gsa.conversation.h.ah r0 = r3.f61913c     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            boolean r0 = r0.mo27811e()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r0 == 0) goto L_0x038e
            com.google.android.libraries.gsa.conversation.h.ah r0 = r3.f61913c     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.android.libraries.gsa.conversation.h.ag r1 = com.google.android.libraries.gsa.conversation.p1855h.C22695ah.f62473a     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            boolean r0 = r0.mo27810d(r2, r1)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r0 == 0) goto L_0x038e
            r3.mo27608c(r10)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61893a     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            goto L_0x03e8
        L_0x038e:
            com.google.common.f.e r0 = com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.CallExecutor.f61911a     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r1 = "Could not startActivityForResult or unsupported intent:%s"
            r4 = 48263(0xbc87, float:6.7631E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56389s(r1, r2)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            goto L_0x03cd
        L_0x039d:
            r3.mo27609d(r5)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.android.libraries.gsa.conversation.h.ah r0 = r3.f61913c     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            boolean r0 = r0.mo27807a(r2)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r0 == 0) goto L_0x03ae
            r3.mo27608c(r10)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61893a     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            goto L_0x03e8
        L_0x03ae:
            com.google.common.f.e r0 = com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.CallExecutor.f61911a     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r1 = "Could not startActivity intent:%s"
            r4 = 48261(0xbc85, float:6.7628E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56389s(r1, r2)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            boolean r0 = r3.mo27610e(r5)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r0 == 0) goto L_0x03cd
            com.google.android.libraries.gsa.conversation.clientop.communication.a.b r0 = r3.f61915e     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r0 == 0) goto L_0x03cd
            com.google.android.libraries.gsa.conversation.clientop.communication.a.a r1 = r3.f61917g     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r1 == 0) goto L_0x03cd
            r0.mo27601a(r1)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x03cd:
            com.google.common.f.e r0 = com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.CallExecutor.f61911a     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r1 = "Failed to started intent:%s"
            r4 = 48262(0xbc86, float:6.763E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56389s(r1, r2)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r0 = "CALL_INTENT_FAILED"
            r3.mo27608c(r0)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.INTERNAL     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r1 = 0
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r0, r1)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r1 = r0
        L_0x03e8:
            com.google.common.f.e r0 = com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.CallExecutor.f61911a     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r2 = 48267(0xbc8b, float:6.7636E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r2 = "Call has been handled."
            r0.mo56386p(r2)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r6 == 0) goto L_0x041c
            com.google.assistant.e.j.kg r0 = r1.f136654b     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r0 != 0) goto L_0x0406
            com.google.assistant.e.j.kg r0 = com.google.assistant.p3897e.p3921j.C52236kg.f137089d     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x0406:
            int r0 = r0.f137092b     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.m86549a(r0)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r0 != 0) goto L_0x0410
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.OK     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x0410:
            com.google.assistant.e.j.kf r2 = com.google.assistant.p3897e.p3921j.C52235kf.OK     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            if (r0 != r2) goto L_0x041c
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61894b     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            goto L_0x0499
        L_0x041c:
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r1)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            goto L_0x0499
        L_0x0421:
            com.google.common.f.e r0 = com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.CallExecutor.f61911a     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r1 = "Unsupported CallArgs"
            r2 = 48251(0xbc7b, float:6.7614E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.android.libraries.gsa.conversation.clientop.k r0 = new com.google.android.libraries.gsa.conversation.clientop.k     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r0.<init>()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            throw r0     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
        L_0x0435:
            java.lang.String r0 = "PERMISSION_DENIED"
            r3.mo27608c(r0)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.common.f.e r0 = com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.CallExecutor.f61911a     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r1 = 48264(0xbc88, float:6.7632E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            java.lang.String r1 = "Permission denied"
            r0.mo56386p(r1)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.PERMISSION_DENIED     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            r1 = 0
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r0, r1)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)     // Catch:{ k -> 0x047b, NameNotFoundException -> 0x045c }
            goto L_0x0499
        L_0x045c:
            java.lang.String r0 = "PACKAGE_NOT_FOUND"
            r3.mo27608c(r0)
            com.google.common.f.e r0 = com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.CallExecutor.f61911a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "Failed to get package information"
            r2 = 48266(0xbc8a, float:6.7635E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.INTERNAL
            r1 = 0
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r0, r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0499
        L_0x047b:
            java.lang.String r0 = "INVALID_ARGS"
            r3.mo27608c(r0)
            com.google.common.f.e r0 = com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.CallExecutor.f61911a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "Invalid data in call args"
            r2 = 48265(0xbc89, float:6.7634E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.INTERNAL
            r1 = 0
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r0, r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
        L_0x0499:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.C22415a.apply(java.lang.Object):com.google.common.util.concurrent.cx");
    }
}
