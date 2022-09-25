package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.br */
/* compiled from: PG */
public final /* synthetic */ class C33023br implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C33025bt f88426a;

    /* renamed from: b */
    public final /* synthetic */ C32951d f88427b;

    /* renamed from: c */
    public final /* synthetic */ C52490tr f88428c;

    public /* synthetic */ C33023br(C33025bt btVar, C32951d dVar, C52490tr trVar) {
        this.f88426a = btVar;
        this.f88427b = dVar;
        this.f88428c = trVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:176:0x05b1, code lost:
        if (r11 == false) goto L_0x087d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0831, code lost:
        if (r7.f133181d == false) goto L_0x0833;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x09b7, code lost:
        if (r1.equals("com.google.android.apps.messaging") == false) goto L_0x0a3f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0259, code lost:
        if (r1.isPresent() == false) goto L_0x0267;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x03e7  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x03fd  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x040a  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x048c  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0523  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x052b  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x08ee  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x093f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0380  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx apply(java.lang.Object r29) {
        /*
            r28 = this;
            r1 = r28
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.bt r2 = r1.f88426a
            com.google.android.libraries.search.assistant.fluidactions.b.d r3 = r1.f88427b
            com.google.assistant.e.j.tr r0 = r1.f88428c
            r4 = r29
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r5 = r2.f88437g
            if (r5 == 0) goto L_0x0b50
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r5 = r2.f88438h
            if (r5 != 0) goto L_0x001a
            goto L_0x0b50
        L_0x001a:
            android.content.Context r5 = r2.f88436f
            java.lang.String r6 = "keyguard"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.app.KeyguardManager r5 = (android.app.KeyguardManager) r5
            r3.mo38369a()
            com.google.common.b.pz r6 = com.google.common.p4522b.C58733pz.f156496a
            boolean r5 = r5.isDeviceLocked()
            r7 = 9
            r8 = 2
            r9 = 1
            if (r5 == 0) goto L_0x0140
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r5 = r2.f88438h
            j$.util.Optional r5 = r5.mo38489s()
            boolean r5 = r5.isPresent()
            if (r5 == 0) goto L_0x0140
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r5 = r2.f88438h
            j$.util.Optional r5 = r5.mo38489s()
            java.lang.Object r5 = r5.get()
            boolean r5 = r6.contains(r5)
            if (r5 != 0) goto L_0x0140
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r5 = r2.f88438h
            j$.util.Optional r5 = r5.mo38476f()
            boolean r5 = r5.isPresent()
            if (r5 == 0) goto L_0x0140
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r5 = r2.f88438h
            j$.util.Optional r5 = r5.mo38476f()
            java.lang.Object r5 = r5.get()
            com.google.assistant.e.i.a.gi r6 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.SET_MESSAGE
            if (r5 == r6) goto L_0x0140
            int r5 = r0.f137798b
            if (r5 != r7) goto L_0x006f
            goto L_0x0140
        L_0x006f:
            com.google.assistant.e.j.gt r0 = com.google.assistant.p3897e.p3921j.C52141gt.f136816c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.gq r0 = (com.google.assistant.p3897e.p3921j.C52138gq) r0
            com.google.assistant.e.j.e.ff r3 = r2.f88434d
            com.google.assistant.e.j.uh r4 = r2.f88435e
            com.google.assistant.e.j.ka r5 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.e.j.jz r5 = (com.google.assistant.p3897e.p3921j.C52228jz) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.assistant.e.j.ka r6 = (com.google.assistant.p3897e.p3921j.C52230ka) r6
            int r7 = r6.f137059a
            r7 = r7 | r9
            r6.f137059a = r7
            java.lang.String r7 = "assistant.api.client_input.FormInput"
            r6.f137060b = r7
            com.google.assistant.e.j.tt r6 = com.google.assistant.p3897e.p3921j.C52492tt.f137803d
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.j.ts r6 = (com.google.assistant.p3897e.p3921j.C52491ts) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.assistant.e.j.tt r7 = (com.google.assistant.p3897e.p3921j.C52492tt) r7
            r3.getClass()
            r7.f137806b = r3
            int r3 = r7.f137805a
            r3 = r3 | r9
            r7.f137805a = r3
            r6.copyOnWrite()
            com.google.protobuf.bv r3 = r6.instance
            com.google.assistant.e.j.tt r3 = (com.google.assistant.p3897e.p3921j.C52492tt) r3
            r4.getClass()
            r3.f137807c = r4
            int r4 = r3.f137805a
            r4 = r4 | r8
            r3.f137805a = r4
            com.google.protobuf.bv r3 = r6.build()
            com.google.assistant.e.j.tt r3 = (com.google.assistant.p3897e.p3921j.C52492tt) r3
            com.google.protobuf.z r3 = r3.toByteString()
            r5.copyOnWrite()
            com.google.protobuf.bv r4 = r5.instance
            com.google.assistant.e.j.ka r4 = (com.google.assistant.p3897e.p3921j.C52230ka) r4
            r3.getClass()
            int r6 = r4.f137059a
            r6 = r6 | r8
            r4.f137059a = r6
            r4.f137061c = r3
            com.google.protobuf.bv r3 = r5.build()
            com.google.assistant.e.j.ka r3 = (com.google.assistant.p3897e.p3921j.C52230ka) r3
            com.google.assistant.e.j.du r4 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.j.ds r4 = (com.google.assistant.p3897e.p3921j.C51803ds) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.e.j.du r5 = (com.google.assistant.p3897e.p3921j.C51805du) r5
            int r6 = r5.f135926a
            r6 = r6 | r9
            r5.f135926a = r6
            java.lang.String r6 = "ui.FORM_INPUT"
            r5.f135927b = r6
            java.lang.String r5 = "form_input"
            r4.mo53729a(r5, r3)
            com.google.protobuf.bv r3 = r4.build()
            com.google.assistant.e.j.du r3 = (com.google.assistant.p3897e.p3921j.C51805du) r3
            com.google.protobuf.z r3 = r3.toByteString()
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.e.j.gt r4 = (com.google.assistant.p3897e.p3921j.C52141gt) r4
            r3.getClass()
            int r5 = r4.f136818a
            r5 = r5 | r9
            r4.f136818a = r5
            r4.f136819b = r3
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.gt r0 = (com.google.assistant.p3897e.p3921j.C52141gt) r0
            java.lang.String r3 = "wait_for_authentication_args"
            java.lang.String r4 = "assistant.api.client_op.WaitForAuthenticationArgs"
            java.lang.String r5 = "device.WAIT_FOR_AUTHENTICATION"
            com.google.assistant.e.j.dy r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61446e(r5, r0, r3, r4)
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89846n(r0)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r2 = r2.f88437g
            com.google.assistant.e.j.ex r2 = r2.mo38452a()
            com.google.common.b.pz r3 = com.google.common.p4522b.C58733pz.f156496a
            com.google.assistant.e.j.en r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f.m61461b(r0, r3, r2)
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0b58
        L_0x0140:
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r5 = r2.f88437g
            if (r5 == 0) goto L_0x0b47
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r5 = r2.f88438h
            if (r5 != 0) goto L_0x014a
            goto L_0x0b47
        L_0x014a:
            j$.util.Optional r5 = r5.mo38480j()
            boolean r5 = r5.isPresent()
            if (r5 != 0) goto L_0x0163
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r5 = r2.f88438h
            j$.util.Optional r5 = r5.mo38473c()
            boolean r5 = r5.isPresent()
            if (r5 == 0) goto L_0x0161
            goto L_0x0163
        L_0x0161:
            r5 = 0
            goto L_0x0164
        L_0x0163:
            r5 = 1
        L_0x0164:
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r10 = r2.f88438h
            j$.util.Optional r10 = r10.mo38475e()
            boolean r10 = r10.isPresent()
            if (r10 == 0) goto L_0x018a
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r10 = r2.f88438h
            j$.util.Optional r10 = r10.mo38483m()
            boolean r10 = r10.isPresent()
            if (r10 != 0) goto L_0x0188
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r10 = r2.f88438h
            j$.util.Optional r10 = r10.mo38493w()
            boolean r10 = r10.isPresent()
            if (r10 == 0) goto L_0x018a
        L_0x0188:
            r10 = 1
            goto L_0x018b
        L_0x018a:
            r10 = 0
        L_0x018b:
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r11 = r2.f88437g
            j$.util.Optional r11 = r11.f88385c
            java.lang.Object r11 = r11.get()
            com.google.assistant.e.i.a.gn r11 = (com.google.assistant.p3897e.p3917i.p3918a.C51406gn) r11
            boolean r11 = r11.f133902n
            com.google.assistant.e.j.e.ff r12 = r2.f88434d
            java.lang.String r13 = "confirmation_button_id"
            j$.util.Optional r12 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r13, r12)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r14 = r2.f88437g
            j$.util.Optional r14 = r14.f88385c
            java.lang.Object r14 = r14.get()
            com.google.assistant.e.i.a.gn r14 = (com.google.assistant.p3897e.p3917i.p3918a.C51406gn) r14
            j$.util.Optional r14 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33036j.m61316g(r14)
            if (r4 == 0) goto L_0x01bf
            if (r11 == 0) goto L_0x01bf
            boolean r4 = r12.isPresent()
            if (r4 == 0) goto L_0x01bf
            boolean r4 = r14.isPresent()
            if (r4 == 0) goto L_0x01bf
            r4 = 1
            goto L_0x01c0
        L_0x01bf:
            r4 = 0
        L_0x01c0:
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r11 = r2.f88437g
            j$.util.Optional r11 = r11.f88385c
            java.lang.Object r11 = r11.get()
            com.google.assistant.e.i.a.gn r11 = (com.google.assistant.p3897e.p3917i.p3918a.C51406gn) r11
            boolean r11 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61283n(r11)
            com.google.assistant.e.j.e.ff r15 = r2.f88434d
            java.lang.String r6 = "text_composition_form_field_id"
            j$.util.Optional r15 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r6, r15)
            com.google.assistant.e.j.e.ff r8 = r2.f88434d
            java.lang.String r9 = "audio_message_form_field_id"
            j$.util.Optional r8 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r9, r8)
            if (r4 == 0) goto L_0x0225
            com.google.assistant.e.j.e.ff r5 = r2.f88434d
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r7 = r2.f88438h
            if (r7 == 0) goto L_0x0221
            com.google.assistant.e.i.a.gi r1 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.CREATE_RELATIONSHIP_CONFIRMATION
            r7.mo38459D(r1)
            java.lang.Object r1 = r12.get()
            com.google.assistant.e.j.e.eu r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r1
            java.lang.Object r7 = r14.get()
            com.google.assistant.e.j.du r7 = (com.google.assistant.p3897e.p3921j.C51805du) r7
            com.google.assistant.e.j.e.eu r1 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61486c(r1, r7)
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.assistant.e.j.e.eq r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r7 = r1.instance
            com.google.assistant.e.j.e.eu r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r7
            int r14 = r7.f136274b
            r14 = r14 | 16
            r7.f136274b = r14
            r14 = 83151(0x144cf, float:1.1652E-40)
            r7.f136283k = r14
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.e.eu r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r1
            j$.util.Optional r7 = p3186j$.util.Optional.empty()
            com.google.assistant.e.j.e.ff r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61489f(r1, r5, r7)
        L_0x0221:
            r2.f88434d = r5
        L_0x0223:
            r1 = 0
            goto L_0x0275
        L_0x0225:
            if (r11 == 0) goto L_0x025c
            if (r10 == 0) goto L_0x0223
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r1 = r2.f88437g
            j$.util.Optional r1 = r1.f88385c
            java.lang.Object r1 = r1.get()
            com.google.assistant.e.i.a.gn r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51406gn) r1
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r5 = r2.f88438h
            j$.util.Optional r5 = r5.mo38475e()
            java.lang.Object r5 = r5.get()
            com.google.assistant.e.j.pj r5 = (com.google.assistant.p3897e.p3921j.C52374pj) r5
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r7 = r2.f88438h
            j$.util.Optional r7 = r7.mo38486p()
            com.google.assistant.e.j.dy r1 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61274e(r1, r5, r7)
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89846n(r1)
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89845m()
            j$.util.Optional r1 = r2.mo38502b(r1, r5)
            boolean r5 = r1.isPresent()
            if (r5 != 0) goto L_0x0b4b
            goto L_0x0267
        L_0x025c:
            if (r5 == 0) goto L_0x0269
            if (r10 == 0) goto L_0x0269
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r1 = r2.f88438h
            com.google.assistant.e.i.a.gi r5 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.SEND_MESSAGE_CONFIRMATION
            r1.mo38459D(r5)
        L_0x0267:
            r1 = 1
            goto L_0x0275
        L_0x0269:
            if (r5 != 0) goto L_0x0223
            if (r10 == 0) goto L_0x0223
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r1 = r2.f88438h
            com.google.assistant.e.i.a.gi r5 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.SET_MESSAGE
            r1.mo38459D(r5)
            goto L_0x0223
        L_0x0275:
            com.google.assistant.e.j.e.ff r5 = r2.f88434d
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r7 = r2.f88438h
            java.lang.String r14 = "contact_form_field_id"
            r17 = r8
            if (r7 != 0) goto L_0x0282
        L_0x027f:
            r19 = r10
            goto L_0x02e1
        L_0x0282:
            j$.util.Optional r7 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r14, r5)
            boolean r18 = r7.isPresent()
            if (r18 == 0) goto L_0x027f
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r8 = r2.f88438h
            if (r8 != 0) goto L_0x0294
            r19 = r10
        L_0x0292:
            r8 = 0
            goto L_0x02cf
        L_0x0294:
            com.google.assistant.e.i.a.gi r8 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.CONTROLLER_STATE_UNKNOWN
            com.google.assistant.e.c.c.ac r8 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.DEFAULT
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r8 = r2.f88438h
            j$.util.Optional r8 = r8.mo38476f()
            java.lang.Object r8 = r8.get()
            com.google.assistant.e.i.a.gi r8 = (com.google.assistant.p3897e.p3917i.p3918a.C51401gi) r8
            int r8 = r8.ordinal()
            r19 = r10
            r10 = 3
            if (r8 == r10) goto L_0x02cc
            r10 = 9
            if (r8 == r10) goto L_0x02c8
            r10 = 11
            if (r8 == r10) goto L_0x02c4
            r10 = 5
            if (r8 == r10) goto L_0x02c0
            r10 = 6
            if (r8 == r10) goto L_0x02bc
            goto L_0x0292
        L_0x02bc:
            r8 = 83153(0x144d1, float:1.16522E-40)
            goto L_0x02cf
        L_0x02c0:
            r8 = 83154(0x144d2, float:1.16524E-40)
            goto L_0x02cf
        L_0x02c4:
            r8 = 83152(0x144d0, float:1.16521E-40)
            goto L_0x02cf
        L_0x02c8:
            r8 = 83159(0x144d7, float:1.1653E-40)
            goto L_0x02cf
        L_0x02cc:
            r8 = 83158(0x144d6, float:1.16529E-40)
        L_0x02cf:
            java.lang.Object r7 = r7.get()
            com.google.assistant.e.j.e.eu r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r7
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            j$.util.Optional r8 = p3186j$.util.Optional.m71637of(r8)
            com.google.assistant.e.j.e.ff r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61489f(r7, r5, r8)
        L_0x02e1:
            r2.f88434d = r5
            com.google.assistant.e.j.e.ff r5 = r2.f88434d
            boolean r7 = r15.isPresent()
            if (r7 == 0) goto L_0x0334
            java.lang.Object r7 = r15.get()
            com.google.assistant.e.j.e.eu r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r7
            r8 = 83162(0x144da, float:1.16535E-40)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            j$.util.Optional r8 = p3186j$.util.Optional.m71637of(r8)
            com.google.assistant.e.j.e.ff r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61489f(r7, r5, r8)
            boolean r7 = r12.isPresent()
            if (r7 == 0) goto L_0x0334
            if (r4 != 0) goto L_0x0334
            java.lang.Object r7 = r12.get()
            com.google.assistant.e.j.e.eu r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r7
            com.google.protobuf.bn r7 = r7.toBuilder()
            com.google.assistant.e.j.e.eq r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.assistant.e.j.e.eu r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r8
            int r10 = r8.f136274b
            r10 = r10 | 16
            r8.f136274b = r10
            r10 = 83192(0x144f8, float:1.16577E-40)
            r8.f136283k = r10
            com.google.protobuf.bv r7 = r7.build()
            com.google.assistant.e.j.e.eu r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r7
            j$.util.Optional r8 = p3186j$.util.Optional.empty()
            com.google.assistant.e.j.e.ff r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61489f(r7, r5, r8)
        L_0x0334:
            r2.f88434d = r5
            com.google.assistant.e.j.e.ff r5 = r2.f88434d
            java.lang.String r7 = "cancel_button_id"
            j$.util.Optional r8 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r7, r5)
            boolean r10 = r8.isPresent()
            if (r10 == 0) goto L_0x0370
            java.lang.Object r8 = r8.get()
            com.google.assistant.e.j.e.eu r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r8
            com.google.protobuf.bn r8 = r8.toBuilder()
            com.google.assistant.e.j.e.eq r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.assistant.e.j.e.eu r10 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r10
            int r12 = r10.f136274b
            r12 = r12 | 16
            r10.f136274b = r12
            r12 = 83150(0x144ce, float:1.16518E-40)
            r10.f136283k = r12
            com.google.protobuf.bv r8 = r8.build()
            com.google.assistant.e.j.e.eu r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r8
            j$.util.Optional r10 = p3186j$.util.Optional.empty()
            com.google.assistant.e.j.e.ff r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61489f(r8, r5, r10)
        L_0x0370:
            r2.f88434d = r5
            com.google.assistant.e.j.e.ff r5 = r2.f88434d
            j$.util.Optional r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r13, r5)
            boolean r8 = r5.isPresent()
            r10 = 17
            if (r8 == 0) goto L_0x03e7
            java.lang.Object r8 = r5.get()
            com.google.assistant.e.j.e.eu r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r8
            com.google.protobuf.bn r8 = r8.toBuilder()
            com.google.assistant.e.j.e.eq r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r8
            java.lang.Object r12 = r5.get()
            com.google.assistant.e.j.e.eu r12 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r12
            r20 = r5
            int r5 = r12.f136277e
            if (r5 != r10) goto L_0x039d
            java.lang.Object r5 = r12.f136278f
            com.google.assistant.e.c.c.ah r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r5
            goto L_0x039f
        L_0x039d:
            com.google.assistant.e.c.c.ah r5 = com.google.assistant.p3897e.p3902c.p3907c.C50936ah.f132593m
        L_0x039f:
            com.google.protobuf.bn r5 = r5.toBuilder()
            com.google.assistant.e.c.c.aa r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50929aa) r5
            if (r1 != 0) goto L_0x03ac
            if (r4 == 0) goto L_0x03aa
            goto L_0x03ac
        L_0x03aa:
            r12 = 0
            goto L_0x03ad
        L_0x03ac:
            r12 = 1
        L_0x03ad:
            r5.copyOnWrite()
            com.google.protobuf.bv r10 = r5.instance
            com.google.assistant.e.c.c.ah r10 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r10
            r21 = r4
            int r4 = r10.f132595a
            r4 = r4 | 4
            r10.f132595a = r4
            r10.f132600f = r12
            r8.copyOnWrite()
            com.google.protobuf.bv r4 = r8.instance
            com.google.assistant.e.j.e.eu r4 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r4
            com.google.protobuf.bv r5 = r5.build()
            com.google.assistant.e.c.c.ah r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r5
            r5.getClass()
            r4.f136278f = r5
            r5 = 17
            r4.f136277e = r5
            com.google.protobuf.bv r4 = r8.build()
            com.google.assistant.e.j.e.eu r4 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r4
            com.google.assistant.e.j.e.ff r5 = r2.f88434d
            j$.util.Optional r8 = p3186j$.util.Optional.empty()
            com.google.assistant.e.j.e.ff r4 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61489f(r4, r5, r8)
            r2.f88434d = r4
            goto L_0x03eb
        L_0x03e7:
            r21 = r4
            r20 = r5
        L_0x03eb:
            j$.util.Optional r4 = p3186j$.util.Optional.empty()
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r5 = r2.f88438h
            j$.util.Optional r5 = r5.mo38489s()
            boolean r8 = r5.isPresent()
            java.lang.String r10 = ""
            if (r8 == 0) goto L_0x040a
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r8 = r2.f88438h
            java.lang.Object r5 = r5.get()
            java.lang.String r5 = (java.lang.String) r5
            j$.util.Optional r5 = r8.mo38490t(r5, r10)
            goto L_0x040e
        L_0x040a:
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
        L_0x040e:
            boolean r8 = r5.isPresent()
            if (r8 == 0) goto L_0x041e
            java.lang.Object r4 = r5.get()
            com.google.assistant.e.j.yp r4 = (com.google.assistant.p3897e.p3921j.C52623yp) r4
            j$.util.Optional r4 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33036j.m61315f(r4)
        L_0x041e:
            com.google.assistant.e.j.e.fc r8 = r2.f88433c
            com.google.assistant.e.j.e.fc r12 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY
            if (r8 == r12) goto L_0x046c
            boolean r8 = r15.isPresent()
            if (r8 == 0) goto L_0x046c
            java.lang.Object r8 = r15.get()
            com.google.assistant.e.j.e.eu r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r8
            int r8 = r8.f136275c
            r12 = 22
            if (r8 != r12) goto L_0x046c
            boolean r5 = r5.isPresent()
            if (r5 == 0) goto L_0x046c
            android.content.Context r5 = r2.f88436f
            java.lang.Object r8 = r15.get()
            r23 = r8
            com.google.assistant.e.j.e.eu r23 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r23
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r8 = r2.f88438h
            j$.util.Optional r24 = r8.mo38489s()
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r8 = r2.f88438h
            j$.util.Optional r25 = r8.mo38486p()
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r8 = r2.f88438h
            j$.util.Optional r27 = r8.mo38482l()
            r22 = r5
            r26 = r4
            com.google.assistant.e.j.e.eu r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61275f(r22, r23, r24, r25, r26, r27)
            com.google.assistant.e.j.e.ff r8 = r2.f88434d
            j$.util.Optional r12 = p3186j$.util.Optional.empty()
            com.google.assistant.e.j.e.ff r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61489f(r5, r8, r12)
            r2.f88434d = r5
        L_0x046c:
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r5 = r2.f88437g
            java.lang.String r8 = "omwh_confirmation_form_field_id"
            if (r5 == 0) goto L_0x0523
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r5 = r2.f88438h
            if (r5 != 0) goto L_0x0478
            goto L_0x0523
        L_0x0478:
            j$.util.Optional r5 = r5.mo38476f()
            boolean r5 = r5.isPresent()
            if (r5 == 0) goto L_0x0523
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r5 = r2.f88437g
            j$.util.Optional r5 = r5.f88385c
            boolean r5 = r5.isPresent()
            if (r5 == 0) goto L_0x0523
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r5 = r2.f88438h
            j$.util.Optional r5 = r5.mo38476f()
            java.lang.Object r5 = r5.get()
            com.google.assistant.e.i.a.gi r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51401gi) r5
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r12 = r2.f88437g
            com.google.assistant.e.j.ex r12 = r12.mo38452a()
            boolean r12 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33119g.m61470f(r12)
            if (r12 == 0) goto L_0x04d5
            com.google.assistant.e.j.e.fc r12 = r2.f88433c
            r22 = r15
            com.google.assistant.e.j.e.fc r15 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY
            if (r12 == r15) goto L_0x04d7
            boolean r12 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61293x(r5)
            r2.mo38503c(r6, r12)
            boolean r6 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61285p(r5)
            r2.mo38503c(r9, r6)
            boolean r6 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61288s(r5)
            r2.mo38503c(r13, r6)
            boolean r6 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61287r(r5)
            r2.mo38503c(r7, r6)
            com.google.assistant.e.j.e.ff r6 = r2.f88434d
            r6.getClass()
            boolean r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61289t(r5, r6)
            r2.mo38503c(r14, r5)
            goto L_0x0525
        L_0x04d5:
            r22 = r15
        L_0x04d7:
            boolean r12 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61292w(r5)
            r2.mo38503c(r6, r12)
            boolean r6 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61284o(r5)
            r2.mo38503c(r9, r6)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r6 = r2.f88437g
            j$.util.Optional r6 = r6.f88385c
            java.lang.Object r6 = r6.get()
            com.google.assistant.e.i.a.gn r6 = (com.google.assistant.p3897e.p3917i.p3918a.C51406gn) r6
            boolean r6 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61290u(r6)
            r2.mo38503c(r8, r6)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r6 = r2.f88437g
            j$.util.Optional r6 = r6.f88385c
            java.lang.Object r6 = r6.get()
            com.google.assistant.e.i.a.gn r6 = (com.google.assistant.p3897e.p3917i.p3918a.C51406gn) r6
            boolean r6 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61290u(r6)
            java.lang.String r9 = "omwh_information_form_field_group_id"
            r2.mo38503c(r9, r6)
            boolean r6 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61286q(r5)
            r2.mo38503c(r13, r6)
            r2.mo38503c(r7, r6)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r6 = r2.f88438h
            j$.util.Optional r6 = r6.mo38486p()
            boolean r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61291v(r5, r6, r3)
            java.lang.String r6 = "switch_to_audio_button_id"
            r2.mo38503c(r6, r5)
            goto L_0x0525
        L_0x0523:
            r22 = r15
        L_0x0525:
            int r5 = r0.f137798b
            r6 = 9
            if (r5 != r6) goto L_0x08ee
            com.google.assistant.e.j.e.ff r5 = r2.f88434d
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r6 = r2.f88437g
            if (r6 == 0) goto L_0x08e8
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r6 = r2.f88438h
            if (r6 != 0) goto L_0x0537
            goto L_0x08e8
        L_0x0537:
            int r6 = r0.f137797a
            r7 = 1
            r6 = r6 & r7
            if (r6 == 0) goto L_0x08e2
            java.lang.Object r6 = r0.f137799c
            com.google.assistant.e.j.tc r6 = (com.google.assistant.p3897e.p3921j.C52475tc) r6
            boolean r6 = r6.f137747b
            if (r6 == 0) goto L_0x08e2
            java.lang.String r0 = r0.f137800d
            j$.util.Optional r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r0, r5)
            boolean r5 = r0.isPresent()
            if (r5 == 0) goto L_0x08e2
            java.lang.Object r5 = r0.get()
            com.google.assistant.e.j.e.eu r5 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r5
            int r5 = r5.f136277e
            r6 = 17
            if (r5 != r6) goto L_0x08e2
            java.lang.Object r0 = r0.get()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            int r5 = r0.f136277e
            if (r5 != r6) goto L_0x056c
            java.lang.Object r0 = r0.f136278f
            com.google.assistant.e.c.c.ah r0 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r0
            goto L_0x056e
        L_0x056c:
            com.google.assistant.e.c.c.ah r0 = com.google.assistant.p3897e.p3902c.p3907c.C50936ah.f132593m
        L_0x056e:
            com.google.assistant.e.i.a.gi r5 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.CONTROLLER_STATE_UNKNOWN
            com.google.assistant.e.c.c.ac r5 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.DEFAULT
            int r0 = r0.f132602h
            com.google.assistant.e.c.c.ac r0 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.m85981a(r0)
            if (r0 != 0) goto L_0x057c
            com.google.assistant.e.c.c.ac r0 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.DEFAULT
        L_0x057c:
            int r0 = r0.ordinal()
            r5 = 1
            if (r0 == r5) goto L_0x0890
            r5 = 2
            if (r0 == r5) goto L_0x0588
            goto L_0x08e2
        L_0x0588:
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r0 = r2.f88437g
            if (r0 == 0) goto L_0x088a
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r0 = r2.f88438h
            if (r0 != 0) goto L_0x0592
            goto L_0x088a
        L_0x0592:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            if (r1 == 0) goto L_0x087d
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r1 = r2.f88438h
            j$.util.Optional r1 = r1.mo38480j()
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r5 = r2.f88438h
            j$.util.Optional r5 = r5.mo38473c()
            boolean r6 = r1.isPresent()
            if (r6 != 0) goto L_0x05b5
            boolean r6 = r5.isPresent()
            if (r6 == 0) goto L_0x05b1
            goto L_0x05b5
        L_0x05b1:
            if (r11 != 0) goto L_0x0851
            goto L_0x087d
        L_0x05b5:
            if (r11 != 0) goto L_0x0851
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r0 = r2.f88438h
            j$.util.Optional r6 = r0.mo38494x()
            boolean r0 = r5.isPresent()
            if (r0 != 0) goto L_0x06fc
            boolean r0 = r1.isPresent()
            if (r0 == 0) goto L_0x06fc
            java.lang.Object r0 = r1.get()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x06fc
            boolean r0 = r6.isPresent()
            if (r0 == 0) goto L_0x06fc
            java.lang.Object r0 = r6.get()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x06fc
            java.lang.Object r0 = r6.get()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r5 = r1.get()
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0605
            com.google.android.libraries.search.assistant.fluidactions.d.c.e r0 = r2.f88439i
            r0.getClass()
            com.google.android.libraries.search.b.b r0 = r0.f88684a
            com.google.android.libraries.search.b.i.g r5 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97004dP
            r0.mo19974a(r5)
            goto L_0x06fc
        L_0x0605:
            boolean r0 = r3.mo38388r()
            if (r0 == 0) goto L_0x06f0
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r0 = r2.f88437g
            com.google.assistant.e.j.ex r0 = r0.mo38452a()
            if (r0 != 0) goto L_0x0618
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x0676
        L_0x0618:
            com.google.protobuf.cq r0 = r0.f136712a
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.i r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33035i.f88467a
            j$.util.stream.Stream r0 = r0.filter(r5)
            j$.util.Optional r0 = r0.findFirst()
            boolean r5 = r0.isPresent()
            if (r5 != 0) goto L_0x0633
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x0676
        L_0x0633:
            java.lang.Object r0 = r0.get()     // Catch:{ ct -> 0x065f }
            com.google.assistant.e.j.kc r0 = (com.google.assistant.p3897e.p3921j.C52232kc) r0     // Catch:{ ct -> 0x065f }
            com.google.assistant.e.j.ka r0 = r0.f137066c     // Catch:{ ct -> 0x065f }
            if (r0 != 0) goto L_0x063f
            com.google.assistant.e.j.ka r0 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x065f }
        L_0x063f:
            com.google.protobuf.z r0 = r0.f137061c     // Catch:{ ct -> 0x065f }
            com.google.protobuf.ba r5 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x065f }
            com.google.assistant.e.i.a.li r7 = com.google.assistant.p3897e.p3917i.p3918a.C51536li.f134316k     // Catch:{ ct -> 0x065f }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r7, (com.google.protobuf.C63088z) r0, (com.google.protobuf.C62921ba) r5)     // Catch:{ ct -> 0x065f }
            com.google.assistant.e.i.a.li r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51536li) r0     // Catch:{ ct -> 0x065f }
            java.lang.String r0 = r0.f134320c     // Catch:{ ct -> 0x065f }
            boolean r5 = r0.isEmpty()     // Catch:{ ct -> 0x065f }
            if (r5 == 0) goto L_0x065a
            j$.util.Optional r0 = p3186j$.util.Optional.empty()     // Catch:{ ct -> 0x065f }
            goto L_0x0676
        L_0x065a:
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)     // Catch:{ ct -> 0x065f }
            goto L_0x0676
        L_0x065f:
            r0 = move-exception
            com.google.common.f.e r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33036j.f88468a
            com.google.common.f.x r5 = r5.mo56225c()
            java.lang.String r0 = r0.getMessage()
            r7 = 50708(0xc614, float:7.1057E-41)
            java.lang.String r9 = "Parsing asst.response.logging.params proto with exception. %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56389s(r9, r0)
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
        L_0x0676:
            com.google.android.libraries.search.assistant.fluidactions.d.c.e r5 = r2.f88439i
            r5.getClass()
            java.lang.Object r0 = r0.orElse(r10)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r6 = r6.get()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r1.get()
            java.lang.String r7 = (java.lang.String) r7
            j.a.c.c.a.i r9 = p5535j.p5536a.p5545c.p5548c.p5549a.C71122i.f189727e
            com.google.protobuf.bn r9 = r9.createBuilder()
            j.a.c.c.a.h r9 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71121h) r9
            j.a.c.c.a.q r11 = p5535j.p5536a.p5545c.p5548c.p5549a.C71130q.f189744d
            com.google.protobuf.bn r11 = r11.createBuilder()
            j.a.c.c.a.p r11 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71129p) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            j.a.c.c.a.q r12 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71130q) r12
            r0.getClass()
            int r13 = r12.f189746a
            r14 = 1
            r13 = r13 | r14
            r12.f189746a = r13
            r12.f189747b = r0
            com.google.assistant.ab.g.n r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33134v.m61482a(r6, r7)
            r11.copyOnWrite()
            com.google.protobuf.bv r6 = r11.instance
            j.a.c.c.a.q r6 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71130q) r6
            r0.getClass()
            r6.f189748c = r0
            int r0 = r6.f189746a
            r7 = 2
            r0 = r0 | r7
            r6.f189746a = r0
            com.google.protobuf.bv r0 = r11.build()
            j.a.c.c.a.q r0 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71130q) r0
            r9.copyOnWrite()
            com.google.protobuf.bv r6 = r9.instance
            j.a.c.c.a.i r6 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71122i) r6
            r0.getClass()
            r6.f189732c = r0
            int r0 = r6.f189730a
            r0 = r0 | r7
            r6.f189730a = r0
            com.google.protobuf.bv r0 = r9.build()
            j.a.c.c.a.i r0 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71122i) r0
            com.google.android.libraries.search.b.b r5 = r5.f88684a
            com.google.android.libraries.search.b.i.g r6 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97003dO
            com.google.protobuf.bt r7 = p5535j.p5536a.p5545c.p5548c.p5549a.C71122i.f189728f
            com.google.android.libraries.search.b.i.a r0 = r6.mo40812e(r7, r0)
            r5.mo19974a(r0)
            goto L_0x06fc
        L_0x06f0:
            com.google.android.libraries.search.assistant.fluidactions.d.c.e r0 = r2.f88439i
            r0.getClass()
            com.google.android.libraries.search.b.b r0 = r0.f88684a
            com.google.android.libraries.search.b.i.g r5 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97003dO
            r0.mo19974a(r5)
        L_0x06fc:
            boolean r0 = r2.mo38505e()
            if (r0 == 0) goto L_0x0708
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()
            goto L_0x07d7
        L_0x0708:
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r0 = r2.f88438h
            if (r0 != 0) goto L_0x0712
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()
            goto L_0x07d7
        L_0x0712:
            j$.util.Optional r0 = r0.mo38473c()
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L_0x0796
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33025bt.f88431a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r5 = "generate send audio message client op"
            r6 = 50821(0xc685, float:7.1215E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r6)).mo56386p(r5)
            com.google.common.b.gp r0 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r5 = r2.f88438h
            j$.util.Optional r5 = r5.mo38475e()
            java.lang.Object r5 = r5.get()
            com.google.assistant.e.j.pj r5 = (com.google.assistant.p3897e.p3921j.C52374pj) r5
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r6 = r2.f88438h
            j$.util.Optional r6 = r6.mo38473c()
            java.lang.Object r6 = r6.get()
            java.lang.String r6 = (java.lang.String) r6
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r7 = r2.f88438h
            j$.util.Optional r7 = r7.mo38486p()
            com.google.assistant.e.j.dy r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61294y(r5, r6, r7)
            r0.mo55395g(r5)
            boolean r3 = r3.mo38393v()
            if (r3 == 0) goto L_0x0791
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r3 = r2.f88438h
            j$.util.Optional r3 = r3.mo38494x()
            boolean r5 = r3.isPresent()
            if (r5 == 0) goto L_0x0791
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r5 = r2.f88438h
            j$.util.Optional r5 = r5.mo38475e()
            java.lang.Object r5 = r5.get()
            com.google.assistant.e.j.pj r5 = (com.google.assistant.p3897e.p3921j.C52374pj) r5
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r6 = r2.f88438h
            j$.util.Optional r6 = r6.mo38489s()
            java.lang.Object r6 = r6.orElse(r10)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r3 = r3.get()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r7 = r2.f88438h
            j$.util.Optional r7 = r7.mo38486p()
            r9 = 0
            com.google.assistant.e.j.dy r3 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61273d(r5, r6, r3, r7, r9)
            r0.mo55395g(r3)
        L_0x0791:
            com.google.common.b.gu r0 = r0.mo55394f()
            goto L_0x07d7
        L_0x0796:
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33025bt.f88431a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r3 = "generate send text message client op"
            r5 = 50820(0xc684, float:7.1214E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r3)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r0 = r2.f88438h
            j$.util.Optional r0 = r0.mo38475e()
            java.lang.Object r0 = r0.get()
            com.google.assistant.e.j.pj r0 = (com.google.assistant.p3897e.p3921j.C52374pj) r0
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r3 = r2.f88438h
            j$.util.Optional r3 = r3.mo38489s()
            java.lang.Object r3 = r3.orElse(r10)
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r5 = r2.f88438h
            j$.util.Optional r5 = r5.mo38480j()
            java.lang.Object r5 = r5.orElse(r10)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r6 = r2.f88438h
            j$.util.Optional r6 = r6.mo38486p()
            r7 = 0
            com.google.assistant.e.j.dy r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61273d(r0, r3, r5, r6, r7)
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89846n(r0)
        L_0x07d7:
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r3 = r2.f88438h
            j$.util.Optional r3 = r3.mo38475e()
            java.lang.Object r3 = r3.get()
            com.google.assistant.e.j.pj r3 = (com.google.assistant.p3897e.p3921j.C52374pj) r3
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r5 = r2.f88438h
            j$.util.Optional r5 = r5.mo38489s()
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r6 = r2.f88438h
            j$.util.Optional r6 = r6.mo38486p()
            boolean r7 = r1.isPresent()
            if (r7 != 0) goto L_0x07fa
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89845m()
            goto L_0x084c
        L_0x07fa:
            com.google.assistant.e.j.e.ff r7 = r2.f88434d
            if (r7 != 0) goto L_0x07ff
            goto L_0x0833
        L_0x07ff:
            j$.util.Optional r7 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r8, r7)
            boolean r8 = r7.isPresent()
            if (r8 == 0) goto L_0x0833
            java.lang.Object r8 = r7.get()
            com.google.assistant.e.j.e.eu r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r8
            int r8 = r8.f136277e
            r9 = 5
            if (r8 != r9) goto L_0x0833
            java.lang.Object r8 = r7.get()
            com.google.assistant.e.j.e.eu r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r8
            boolean r8 = r8.f136281i
            if (r8 != 0) goto L_0x0833
            java.lang.Object r7 = r7.get()
            com.google.assistant.e.j.e.eu r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r7
            int r8 = r7.f136277e
            if (r8 != r9) goto L_0x082d
            java.lang.Object r7 = r7.f136278f
            com.google.assistant.e.c.c.t r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51163t) r7
            goto L_0x082f
        L_0x082d:
            com.google.assistant.e.c.c.t r7 = com.google.assistant.p3897e.p3902c.p3907c.C51163t.f133176l
        L_0x082f:
            boolean r7 = r7.f133181d
            if (r7 != 0) goto L_0x083e
        L_0x0833:
            boolean r7 = r2.mo38505e()
            if (r7 != 0) goto L_0x083e
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89845m()
            goto L_0x084c
        L_0x083e:
            java.lang.Object r1 = r1.get()
            java.lang.String r1 = (java.lang.String) r1
            com.google.assistant.e.j.dy r1 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61272c(r3, r1, r5, r4, r6)
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89846n(r1)
        L_0x084c:
            j$.util.Optional r0 = r2.mo38502b(r0, r1)
            goto L_0x087d
        L_0x0851:
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r0 = r2.f88437g
            j$.util.Optional r0 = r0.f88385c
            java.lang.Object r0 = r0.get()
            com.google.assistant.e.i.a.gn r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51406gn) r0
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r1 = r2.f88438h
            j$.util.Optional r1 = r1.mo38475e()
            java.lang.Object r1 = r1.get()
            com.google.assistant.e.j.pj r1 = (com.google.assistant.p3897e.p3921j.C52374pj) r1
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r3 = r2.f88438h
            j$.util.Optional r3 = r3.mo38486p()
            com.google.assistant.e.j.dy r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61274e(r0, r1, r3)
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89846n(r0)
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89845m()
            j$.util.Optional r0 = r2.mo38502b(r0, r1)
        L_0x087d:
            r1 = r0
            boolean r0 = r1.isPresent()
            if (r0 != 0) goto L_0x0b4b
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
            goto L_0x0b4b
        L_0x088a:
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
            goto L_0x0b4b
        L_0x0890:
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r0 = r2.f88437g
            if (r0 == 0) goto L_0x08dc
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r0 = r2.f88438h
            if (r0 != 0) goto L_0x0899
            goto L_0x08dc
        L_0x0899:
            com.google.assistant.e.i.a.gi r1 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.CANCEL
            r0.mo38459D(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r1 = r2.f88438h
            j$.util.Optional r1 = r1.mo38477g()
            boolean r3 = r1.isPresent()
            if (r3 == 0) goto L_0x08bc
            java.lang.Object r1 = r1.get()
            com.google.assistant.e.j.dy r1 = (com.google.assistant.p3897e.p3921j.C51809dy) r1
            com.google.assistant.e.j.dy r1 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61457p(r1)
            r0.add(r1)
        L_0x08bc:
            com.google.assistant.e.j.e.o r1 = com.google.assistant.p3897e.p3921j.p3926e.C52056o.f136624a
            com.google.assistant.e.j.dy r1 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61448g(r1)
            r0.add(r1)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r1 = r2.f88438h
            r1.mo38460E()
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r1 = r2.f88437g
            com.google.assistant.e.j.ex r1 = r1.mo38452a()
            com.google.common.b.pz r2 = com.google.common.p4522b.C58733pz.f156496a
            com.google.assistant.e.j.en r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f.m61461b(r0, r2, r1)
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x0b4b
        L_0x08dc:
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
            goto L_0x0b4b
        L_0x08e2:
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
            goto L_0x0b4b
        L_0x08e8:
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
            goto L_0x0b4b
        L_0x08ee:
            r7 = 0
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r1 = r2.f88438h
            j$.util.Optional r1 = r1.mo38476f()
            android.content.Context r4 = r2.f88436f
            j$.util.Optional r4 = p3186j$.util.Optional.ofNullable(r4)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.bo r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33020bo.f88422a
            j$.util.Optional r4 = r4.map(r5)
            boolean r5 = r3.mo38386p()
            if (r5 == 0) goto L_0x0a3f
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r5 = r2.f88438h
            j$.util.Optional r5 = r5.mo38486p()
            boolean r6 = r5.isPresent()
            if (r6 == 0) goto L_0x0934
            com.google.common.b.gu r6 = r3.mo38371c()
            java.lang.Object r5 = r5.get()
            com.google.assistant.e.c.c.gh r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r5
            int r8 = r5.f133012b
            r9 = 1
            if (r8 != r9) goto L_0x0927
            java.lang.Object r5 = r5.f133013c
            com.google.assistant.e.c.c.ev r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r5
            goto L_0x0929
        L_0x0927:
            com.google.assistant.e.c.c.ev r5 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x0929:
            java.lang.String r5 = r5.f132944b
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L_0x0932
            goto L_0x0934
        L_0x0932:
            r6 = 0
            goto L_0x0935
        L_0x0934:
            r6 = 1
        L_0x0935:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0a3f
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r5 = r2.f88437g
            j$.util.Optional r5 = r5.f88385c
            boolean r6 = r5.isPresent()
            r7 = 131072(0x20000, float:1.83671E-40)
            if (r6 == 0) goto L_0x0957
            java.lang.Object r5 = r5.get()
            com.google.assistant.e.i.a.gn r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51406gn) r5
            int r5 = r5.f133889a
            r5 = r5 & r7
            if (r5 == 0) goto L_0x0957
            goto L_0x095f
        L_0x0957:
            boolean r5 = r3.mo38377h()
            if (r5 == 0) goto L_0x095f
            goto L_0x0a3f
        L_0x095f:
            if (r11 != 0) goto L_0x0a3f
            if (r21 != 0) goto L_0x0a3f
            boolean r5 = r2.mo38504d()
            if (r5 != 0) goto L_0x0a3f
            if (r19 == 0) goto L_0x0a3f
            boolean r5 = r1.isPresent()
            if (r5 == 0) goto L_0x0a3f
            java.lang.Object r5 = r1.get()
            com.google.assistant.e.i.a.gi r6 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.SET_MESSAGE
            if (r5 == r6) goto L_0x0981
            java.lang.Object r1 = r1.get()
            com.google.assistant.e.i.a.gi r5 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.SEND_MESSAGE_CONFIRMATION
            if (r1 != r5) goto L_0x0a3f
        L_0x0981:
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r1 = r2.f88438h
            j$.util.Optional r1 = r1.mo38486p()
            android.content.Context r5 = r2.f88436f
            boolean r6 = r1.isPresent()
            if (r6 == 0) goto L_0x09b9
            java.lang.Object r1 = r1.get()
            com.google.assistant.e.c.c.gh r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r1
            int r6 = r1.f133012b
            r8 = 1
            if (r6 != r8) goto L_0x099f
            java.lang.Object r1 = r1.f133013c
            com.google.assistant.e.c.c.ev r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r1
            goto L_0x09a1
        L_0x099f:
            com.google.assistant.e.c.c.ev r1 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x09a1:
            java.lang.String r1 = r1.f132944b
            java.lang.String r6 = "SMS"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x09b9
            java.lang.String r1 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61281l(r5)
            if (r1 == 0) goto L_0x0a3f
            java.lang.String r5 = "com.google.android.apps.messaging"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0a3f
        L_0x09b9:
            boolean r1 = r4.isPresent()
            if (r1 == 0) goto L_0x0a3f
            java.lang.Object r1 = r4.get()
            android.app.KeyguardManager r1 = (android.app.KeyguardManager) r1
            boolean r1 = r1.isDeviceLocked()
            if (r1 != 0) goto L_0x0a3f
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r0 = r2.f88438h
            com.google.assistant.e.i.a.gi r1 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.FULFILLMENT
            r0.mo38459D(r1)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r0 = r2.f88438h
            j$.util.Optional r0 = r0.mo38475e()
            java.lang.Object r0 = r0.get()
            r11 = r0
            com.google.assistant.e.j.pj r11 = (com.google.assistant.p3897e.p3921j.C52374pj) r11
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r0 = r2.f88438h
            j$.util.Optional r0 = r0.mo38489s()
            java.lang.Object r0 = r0.orElse(r10)
            r12 = r0
            java.lang.String r12 = (java.lang.String) r12
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r0 = r2.f88438h
            j$.util.Optional r0 = r0.mo38480j()
            java.lang.Object r0 = r0.orElse(r10)
            r13 = r0
            java.lang.String r13 = (java.lang.String) r13
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r0 = r2.f88438h
            j$.util.Optional r14 = r0.mo38486p()
            boolean r15 = r3.mo38380j()
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r0 = r2.f88437g
            j$.util.Optional r0 = r0.f88385c
            boolean r1 = r0.isPresent()
            if (r1 == 0) goto L_0x0a25
            java.lang.Object r1 = r0.get()
            com.google.assistant.e.i.a.gn r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51406gn) r1
            int r1 = r1.f133889a
            r1 = r1 & r7
            if (r1 == 0) goto L_0x0a25
            java.lang.Object r0 = r0.get()
            com.google.assistant.e.i.a.gn r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51406gn) r0
            com.google.protos.f.b.b.a.n r0 = r0.f133906r
            if (r0 != 0) goto L_0x0a27
            com.google.protos.f.b.b.a.n r0 = com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n.f175467n
            goto L_0x0a27
        L_0x0a25:
            com.google.protos.f.b.b.a.n r0 = com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n.f175467n
        L_0x0a27:
            r16 = r0
            com.google.common.b.gu r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61276g(r11, r12, r13, r14, r15, r16)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r1 = r2.f88437g
            com.google.assistant.e.j.ex r1 = r1.mo38452a()
            com.google.common.b.pz r2 = com.google.common.p4522b.C58733pz.f156496a
            com.google.assistant.e.j.en r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f.m61461b(r0, r2, r1)
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x0b4b
        L_0x0a3f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r0 = r0.f137798b
            r3 = 3
            if (r0 != r3) goto L_0x0a7c
            boolean r0 = r20.isPresent()
            if (r0 == 0) goto L_0x0af1
            com.google.assistant.e.j.e.ff r0 = r2.f88434d
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.assistant.e.j.e.en r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51934en) r0
            com.google.assistant.e.j.e.fe r3 = com.google.assistant.p3897e.p3921j.p3926e.C51952fe.FORM_FIELD_STATUS_UPDATE
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.e.j.e.ff r4 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r4
            int r3 = r3.f136314c
            r4.f136326j = r3
            int r3 = r4.f136317a
            r3 = r3 | 256(0x100, float:3.59E-43)
            r4.f136317a = r3
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.e.ff r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r0
            r2.f88434d = r0
            com.google.assistant.e.j.e.ff r0 = r2.f88434d
            com.google.assistant.e.j.dy r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61451j(r0)
            r1.add(r0)
            goto L_0x0af1
        L_0x0a7c:
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r0 = r2.f88438h
            j$.util.Optional r0 = r0.mo38477g()
            boolean r3 = r0.isPresent()
            if (r3 == 0) goto L_0x0a95
            java.lang.Object r0 = r0.get()
            com.google.assistant.e.j.dy r0 = (com.google.assistant.p3897e.p3921j.C51809dy) r0
            com.google.assistant.e.j.dy r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61457p(r0)
            r1.add(r0)
        L_0x0a95:
            com.google.assistant.e.j.e.ff r0 = r2.f88434d
            com.google.assistant.e.j.dy r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61451j(r0)
            r1.add(r0)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r0 = r2.f88438h
            j$.util.Optional r0 = r0.mo38476f()
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L_0x0af1
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r0 = r2.f88438h
            j$.util.Optional r0 = r0.mo38476f()
            java.lang.Object r0 = r0.get()
            com.google.assistant.e.i.a.gi r3 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.SET_MESSAGE
            if (r0 != r3) goto L_0x0af1
            boolean r0 = r2.mo38504d()
            if (r0 != 0) goto L_0x0af1
            com.google.assistant.e.j.zt r0 = com.google.assistant.p3897e.p3921j.C52654zt.f138233e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.zo r0 = (com.google.assistant.p3897e.p3921j.C52649zo) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.e.j.zt r3 = (com.google.assistant.p3897e.p3921j.C52654zt) r3
            r4 = 1
            r3.f138236b = r4
            int r5 = r3.f138235a
            r5 = r5 | r4
            r3.f138235a = r5
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.e.j.zt r3 = (com.google.assistant.p3897e.p3921j.C52654zt) r3
            r3.f138237c = r4
            int r4 = r3.f138235a
            r5 = 2
            r4 = r4 | r5
            r3.f138235a = r4
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.zt r0 = (com.google.assistant.p3897e.p3921j.C52654zt) r0
            com.google.assistant.e.j.dy r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61449h(r0)
            r1.add(r0)
        L_0x0af1:
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r0 = r2.f88438h
            j$.util.Optional r0 = r0.mo38476f()
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L_0x0b36
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r0 = r2.f88438h
            j$.util.Optional r0 = r0.mo38476f()
            java.lang.Object r0 = r0.get()
            com.google.assistant.e.i.a.gi r3 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.SET_MESSAGE
            if (r0 != r3) goto L_0x0b36
            boolean r0 = r17.isPresent()
            if (r0 == 0) goto L_0x0b21
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r0 = r2.f88437g
            com.google.assistant.e.j.ex r3 = r0.mo38452a()
            java.lang.String r4 = "audio_message"
            com.google.assistant.e.j.ex r3 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36495a(r3, r4)
            r0.mo38455d(r3)
            goto L_0x0b36
        L_0x0b21:
            boolean r0 = r22.isPresent()
            if (r0 == 0) goto L_0x0b36
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r0 = r2.f88437g
            com.google.assistant.e.j.ex r3 = r0.mo38452a()
            java.lang.String r4 = "dictation"
            com.google.assistant.e.j.ex r3 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36495a(r3, r4)
            r0.mo38455d(r3)
        L_0x0b36:
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r0 = r2.f88437g
            com.google.assistant.e.j.ex r0 = r0.mo38452a()
            com.google.common.b.pz r2 = com.google.common.p4522b.C58733pz.f156496a
            com.google.assistant.e.j.en r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f.m61461b(r1, r2, r0)
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x0b4b
        L_0x0b47:
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
        L_0x0b4b:
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x0b58
        L_0x0b50:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
        L_0x0b58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33023br.apply(java.lang.Object):com.google.common.util.concurrent.cx");
    }
}
