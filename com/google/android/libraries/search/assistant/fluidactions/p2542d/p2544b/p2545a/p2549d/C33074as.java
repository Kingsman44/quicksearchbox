package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d;

import android.content.Context;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.as */
/* compiled from: PG */
public final /* synthetic */ class C33074as implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C33079ax f88540a;

    /* renamed from: b */
    public final /* synthetic */ C52091ex f88541b;

    /* renamed from: c */
    public final /* synthetic */ Context f88542c;

    public /* synthetic */ C33074as(C33079ax axVar, C52091ex exVar, Context context) {
        this.f88540a = axVar;
        this.f88541b = exVar;
        this.f88542c = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0324  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.ax r1 = r0.f88540a
            com.google.assistant.e.j.ex r2 = r0.f88541b
            android.content.Context r3 = r0.f88542c
            r4 = r17
            com.google.assistant.e.i.a.nm r4 = (com.google.assistant.p3897e.p3917i.p3918a.C51594nm) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            com.google.protobuf.cq r6 = r4.f134477b
            int r6 = r6.size()
            r7 = 1
            if (r6 == r7) goto L_0x0034
            com.google.common.f.e r1 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33079ax.f88551a
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r3 = "getConfirmResponse: There is no timer instance defined in timerParams."
            r4 = 50908(0xc6dc, float:7.1337E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r4)).mo56386p(r3)
            com.google.common.b.pz r1 = com.google.common.p4522b.C58733pz.f156496a
            com.google.assistant.e.j.en r1 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f.m61461b(r5, r1, r2)
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            goto L_0x053f
        L_0x0034:
            int r6 = r4.f134476a
            r8 = 4
            r6 = r6 & r8
            if (r6 == 0) goto L_0x0527
            java.lang.String r6 = r4.f134480e
            r1.mo38511b(r6)
            java.lang.String r6 = "timer_params"
            java.lang.String r9 = "assistant.api.params.TimerParams"
            java.lang.String r10 = "timer.CREATE_TIMER"
            com.google.assistant.e.j.dy r6 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61446e(r10, r4, r6, r9)
            r5.add(r6)
            com.google.assistant.e.j.e.fc r6 = r1.f88555e
            com.google.assistant.e.j.e.fc r9 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY
            java.lang.String r11 = "intent:#Intent;action=android.intent.action.SHOW_TIMERS;end"
            if (r6 != r9) goto L_0x020c
            android.content.res.Resources r6 = r3.getResources()
            r9 = 2132085238(0x7f1509f6, float:1.981067E38)
            java.lang.String r6 = r6.getString(r9)
            android.content.res.Resources r9 = r3.getResources()
            r12 = 2132085237(0x7f1509f5, float:1.9810667E38)
            java.lang.String r9 = r9.getString(r12)
            com.google.assistant.e.c.c.hb r12 = com.google.assistant.p3897e.p3902c.p3907c.C51119hb.f133058f
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.assistant.e.c.c.gy r12 = (com.google.assistant.p3897e.p3902c.p3907c.C51115gy) r12
            com.google.assistant.e.c.c.dc r13 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.assistant.e.c.c.db r13 = (com.google.assistant.p3897e.p3902c.p3907c.C51011db) r13
            r13.copyOnWrite()
            com.google.protobuf.bv r14 = r13.instance
            com.google.assistant.e.c.c.dc r14 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r14
            int r15 = r14.f132815a
            r15 = r15 | 2
            r14.f132815a = r15
            java.lang.String r15 = "https://www.gstatic.com/assistant/verticals/communication/iris_confirmation_light.png"
            r14.f132817c = r15
            r12.copyOnWrite()
            com.google.protobuf.bv r14 = r12.instance
            com.google.assistant.e.c.c.hb r14 = (com.google.assistant.p3897e.p3902c.p3907c.C51119hb) r14
            com.google.protobuf.bv r13 = r13.build()
            com.google.assistant.e.c.c.dc r13 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r13
            r13.getClass()
            r14.f133063d = r13
            int r13 = r14.f133060a
            r8 = r8 | r13
            r14.f133060a = r8
            r12.copyOnWrite()
            com.google.protobuf.bv r8 = r12.instance
            com.google.assistant.e.c.c.hb r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51119hb) r8
            r6.getClass()
            int r13 = r8.f133060a
            r13 = r13 | r7
            r8.f133060a = r13
            r8.f133061b = r6
            com.google.assistant.e.c.c.ha r6 = com.google.assistant.p3897e.p3902c.p3907c.C51118ha.f133049g
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.c.c.gz r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51116gz) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.assistant.e.c.c.ha r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51118ha) r8
            r9.getClass()
            int r13 = r8.f133051a
            r13 = r13 | r7
            r8.f133051a = r13
            r8.f133054d = r9
            com.google.assistant.e.c.c.dc r8 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.c.c.db r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51011db) r8
            java.lang.String r9 = r4.f134480e
            r8.copyOnWrite()
            com.google.protobuf.bv r13 = r8.instance
            com.google.assistant.e.c.c.dc r13 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r13
            r9.getClass()
            int r14 = r13.f132815a
            r14 = r14 | 32
            r13.f132815a = r14
            r13.f132821g = r9
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.assistant.e.c.c.ha r9 = (com.google.assistant.p3897e.p3902c.p3907c.C51118ha) r9
            com.google.protobuf.bv r8 = r8.build()
            com.google.assistant.e.c.c.dc r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r8
            r8.getClass()
            r9.f133055e = r8
            int r8 = r9.f133051a
            r8 = r8 | 2
            r9.f133051a = r8
            com.google.protobuf.bv r6 = r6.build()
            com.google.assistant.e.c.c.ha r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51118ha) r6
            r12.copyOnWrite()
            com.google.protobuf.bv r8 = r12.instance
            com.google.assistant.e.c.c.hb r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51119hb) r8
            r6.getClass()
            r8.f133064e = r6
            int r6 = r8.f133060a
            r6 = r6 | 8
            r8.f133060a = r6
            com.google.protobuf.bv r6 = r12.build()
            com.google.assistant.e.c.c.hb r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51119hb) r6
            com.google.assistant.e.j.e.ff r8 = com.google.assistant.p3897e.p3921j.p3926e.C51953ff.f136315l
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.j.e.en r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51934en) r8
            com.google.assistant.e.j.e.fa r9 = com.google.assistant.p3897e.p3921j.p3926e.C51948fa.f136294i
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.e.j.e.ex r9 = (com.google.assistant.p3897e.p3921j.p3926e.C51944ex) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r12 = r9.instance
            com.google.assistant.e.j.e.fa r12 = (com.google.assistant.p3897e.p3921j.p3926e.C51948fa) r12
            int r13 = r12.f136296a
            r13 = r13 | 16
            r12.f136296a = r13
            r12.f136301f = r7
            com.google.assistant.e.j.e.ew r12 = com.google.assistant.p3897e.p3921j.p3926e.C51943ew.f136285f
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.assistant.e.j.e.ev r12 = (com.google.assistant.p3897e.p3921j.p3926e.C51942ev) r12
            com.google.assistant.e.j.e.eu r13 = com.google.assistant.p3897e.p3921j.p3926e.C51941eu.f136271l
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.assistant.e.j.e.eq r13 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r13
            r13.copyOnWrite()
            com.google.protobuf.bv r14 = r13.instance
            com.google.assistant.e.j.e.eu r14 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r14
            r6.getClass()
            r14.f136278f = r6
            r6 = 26
            r14.f136277e = r6
            com.google.assistant.e.c.c.gh r6 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.c.c.gg r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51097gg) r6
            com.google.assistant.e.c.c.ev r14 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.assistant.e.c.c.es r14 = (com.google.assistant.p3897e.p3902c.p3907c.C51055es) r14
            java.lang.String r4 = r4.f134480e
            r14.copyOnWrite()
            com.google.protobuf.bv r15 = r14.instance
            com.google.assistant.e.c.c.ev r15 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r15
            r4.getClass()
            int r0 = r15.f132943a
            r0 = r0 | r7
            r15.f132943a = r0
            r15.f132944b = r4
            r14.copyOnWrite()
            com.google.protobuf.bv r0 = r14.instance
            com.google.assistant.e.c.c.ev r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r0
            int r4 = r0.f132943a
            r4 = r4 | 32
            r0.f132943a = r4
            r0.f132949g = r11
            com.google.protobuf.bv r0 = r14.build()
            com.google.assistant.e.c.c.ev r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r0
            r6.copyOnWrite()
            com.google.protobuf.bv r4 = r6.instance
            com.google.assistant.e.c.c.gh r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r4
            r0.getClass()
            r4.f133013c = r0
            r4.f133012b = r7
            r13.copyOnWrite()
            com.google.protobuf.bv r0 = r13.instance
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            com.google.protobuf.bv r4 = r6.build()
            com.google.assistant.e.c.c.gh r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r4
            r4.getClass()
            r0.f136276d = r4
            r4 = 22
            r0.f136275c = r4
            r12.mo53758a(r13)
            r9.mo53762a(r12)
            com.google.protobuf.bv r0 = r9.build()
            com.google.assistant.e.j.e.fa r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51948fa) r0
            r8.mo53755b(r0)
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.assistant.e.j.e.ff r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r0
            int r4 = r0.f136317a
            r4 = r4 | 16
            r0.f136317a = r4
            r0.f136322f = r7
            com.google.assistant.e.j.e.fc r0 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY
            r8.copyOnWrite()
            com.google.protobuf.bv r4 = r8.instance
            com.google.assistant.e.j.e.ff r4 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r4
            int r0 = r0.f136309c
            r4.f136324h = r0
            int r0 = r4.f136317a
            r0 = r0 | 64
            r4.f136317a = r0
            com.google.assistant.e.j.e.ep r0 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.TIMER
            r8.copyOnWrite()
            com.google.protobuf.bv r4 = r8.instance
            com.google.assistant.e.j.e.ff r4 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r4
            int r0 = r0.f136236u
            r4.f136323g = r0
            int r0 = r4.f136317a
            r0 = r0 | 32
            r4.f136317a = r0
            com.google.protobuf.bv r0 = r8.build()
            com.google.assistant.e.j.e.ff r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r0
            com.google.assistant.e.j.dy r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61451j(r0)
            r5.add(r0)
            goto L_0x04b4
        L_0x020c:
            java.lang.String r0 = "duration"
            com.google.assistant.e.j.e.ff r6 = r1.f88553c
            j$.util.Optional r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r0, r6)
            boolean r6 = r0.isPresent()
            java.lang.String r9 = ""
            if (r6 == 0) goto L_0x0259
            java.lang.Object r6 = r0.get()
            com.google.assistant.e.j.e.eu r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r6
            int r6 = r6.f136277e
            r12 = 21
            if (r6 != r12) goto L_0x0259
            java.lang.Object r6 = r0.get()
            com.google.assistant.e.j.e.eu r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r6
            int r13 = r6.f136277e
            if (r13 != r12) goto L_0x0237
            java.lang.Object r6 = r6.f136278f
            com.google.assistant.e.c.c.ck r6 = (com.google.assistant.p3897e.p3902c.p3907c.C50993ck) r6
            goto L_0x0239
        L_0x0237:
            com.google.assistant.e.c.c.ck r6 = com.google.assistant.p3897e.p3902c.p3907c.C50993ck.f132751e
        L_0x0239:
            int r6 = r6.f132753a
            r6 = r6 & 2
            if (r6 == 0) goto L_0x0259
            java.lang.Object r0 = r0.get()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            int r6 = r0.f136277e
            if (r6 != r12) goto L_0x024e
            java.lang.Object r0 = r0.f136278f
            com.google.assistant.e.c.c.ck r0 = (com.google.assistant.p3897e.p3902c.p3907c.C50993ck) r0
            goto L_0x0250
        L_0x024e:
            com.google.assistant.e.c.c.ck r0 = com.google.assistant.p3897e.p3902c.p3907c.C50993ck.f132751e
        L_0x0250:
            com.google.assistant.e.c.c.ci r0 = r0.f132756d
            if (r0 != 0) goto L_0x0256
            com.google.assistant.e.c.c.ci r0 = com.google.assistant.p3897e.p3902c.p3907c.C50991ci.f132741h
        L_0x0256:
            java.lang.String r0 = r0.f132748f
            goto L_0x025a
        L_0x0259:
            r0 = r9
        L_0x025a:
            java.lang.String r6 = "label"
            com.google.assistant.e.j.e.ff r12 = r1.f88553c
            j$.util.Optional r6 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r6, r12)
            boolean r12 = r6.isPresent()
            if (r12 == 0) goto L_0x0285
            java.lang.Object r12 = r6.get()
            com.google.assistant.e.j.e.eu r12 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r12
            int r12 = r12.f136277e
            if (r12 != r8) goto L_0x0285
            java.lang.Object r6 = r6.get()
            com.google.assistant.e.j.e.eu r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r6
            int r9 = r6.f136277e
            if (r9 != r8) goto L_0x0281
            java.lang.Object r6 = r6.f136278f
            com.google.assistant.e.c.c.co r6 = (com.google.assistant.p3897e.p3902c.p3907c.C50997co) r6
            goto L_0x0283
        L_0x0281:
            com.google.assistant.e.c.c.co r6 = com.google.assistant.p3897e.p3902c.p3907c.C50997co.f132759h
        L_0x0283:
            java.lang.String r9 = r6.f132764d
        L_0x0285:
            com.google.assistant.e.j.e.fa r6 = com.google.assistant.p3897e.p3921j.p3926e.C51948fa.f136294i
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.j.e.ex r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51944ex) r6
            boolean r12 = r0.isEmpty()
            r13 = 3
            if (r12 != 0) goto L_0x031e
            com.google.assistant.e.j.e.ew r12 = com.google.assistant.p3897e.p3921j.p3926e.C51943ew.f136285f
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.assistant.e.j.e.ev r12 = (com.google.assistant.p3897e.p3921j.p3926e.C51942ev) r12
            com.google.assistant.e.j.e.eu r14 = com.google.assistant.p3897e.p3921j.p3926e.C51941eu.f136271l
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.assistant.e.j.e.eq r14 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r14
            com.google.assistant.e.c.c.hx r15 = com.google.assistant.p3897e.p3902c.p3907c.C51141hx.f133119h
            com.google.protobuf.bn r15 = r15.createBuilder()
            com.google.assistant.e.c.c.hu r15 = (com.google.assistant.p3897e.p3902c.p3907c.C51138hu) r15
            r15.copyOnWrite()
            com.google.protobuf.bv r8 = r15.instance
            com.google.assistant.e.c.c.hx r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r8
            r0.getClass()
            r8.f133122b = r7
            r8.f133123c = r0
            com.google.assistant.e.c.c.hw r0 = com.google.assistant.p3897e.p3902c.p3907c.C51140hw.CONFIRMATION_PRIMARY
            r15.copyOnWrite()
            com.google.protobuf.bv r8 = r15.instance
            com.google.assistant.e.c.c.hx r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r8
            int r0 = r0.f133118j
            r8.f133125e = r0
            int r0 = r8.f133121a
            r0 = r0 | 8
            r8.f133121a = r0
            com.google.assistant.e.c.c.dc r0 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.c.c.db r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51011db) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r8 = r0.instance
            com.google.assistant.e.c.c.dc r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r8
            int r7 = r8.f132815a
            r7 = r7 | 2
            r8.f132815a = r7
            java.lang.String r7 = "https://www.gstatic.com/images/icons/material/system/2x/check_circle_googgreen_48dp.png"
            r8.f132817c = r7
            r15.copyOnWrite()
            com.google.protobuf.bv r7 = r15.instance
            com.google.assistant.e.c.c.hx r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r7
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.c.c.dc r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r0
            r0.getClass()
            r7.f133126f = r0
            int r0 = r7.f133121a
            r0 = r0 | 16
            r7.f133121a = r0
            r14.copyOnWrite()
            com.google.protobuf.bv r0 = r14.instance
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            com.google.protobuf.bv r7 = r15.build()
            com.google.assistant.e.c.c.hx r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r7
            r7.getClass()
            r0.f136278f = r7
            r0.f136277e = r13
            com.google.protobuf.bv r0 = r14.build()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            r12.mo53759b(r0)
            r6.mo53762a(r12)
        L_0x031e:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x037e
            com.google.assistant.e.j.e.ew r0 = com.google.assistant.p3897e.p3921j.p3926e.C51943ew.f136285f
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.e.ev r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51942ev) r0
            com.google.assistant.e.j.e.eu r7 = com.google.assistant.p3897e.p3921j.p3926e.C51941eu.f136271l
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.e.j.e.eq r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r7
            com.google.assistant.e.c.c.hx r8 = com.google.assistant.p3897e.p3902c.p3907c.C51141hx.f133119h
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.c.c.hu r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51138hu) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r12 = r8.instance
            com.google.assistant.e.c.c.hx r12 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r12
            r9.getClass()
            r14 = 1
            r12.f133122b = r14
            r12.f133123c = r9
            com.google.assistant.e.c.c.hw r9 = com.google.assistant.p3897e.p3902c.p3907c.C51140hw.CONFIRMATION_SECONDARY
            r8.copyOnWrite()
            com.google.protobuf.bv r12 = r8.instance
            com.google.assistant.e.c.c.hx r12 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r12
            int r9 = r9.f133118j
            r12.f133125e = r9
            int r9 = r12.f133121a
            r9 = r9 | 8
            r12.f133121a = r9
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.assistant.e.j.e.eu r9 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r9
            com.google.protobuf.bv r8 = r8.build()
            com.google.assistant.e.c.c.hx r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r8
            r8.getClass()
            r9.f136278f = r8
            r9.f136277e = r13
            com.google.protobuf.bv r7 = r7.build()
            com.google.assistant.e.j.e.eu r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r7
            r0.mo53759b(r7)
            r6.mo53762a(r0)
        L_0x037e:
            android.content.res.Resources r0 = r3.getResources()
            r7 = 2132085236(0x7f1509f4, float:1.9810665E38)
            java.lang.String r0 = r0.getString(r7)
            com.google.assistant.e.j.e.ew r7 = com.google.assistant.p3897e.p3921j.p3926e.C51943ew.f136285f
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.e.j.e.ev r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51942ev) r7
            com.google.assistant.e.j.e.eu r8 = com.google.assistant.p3897e.p3921j.p3926e.C51941eu.f136271l
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.j.e.eq r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r8
            com.google.assistant.e.c.c.ah r9 = com.google.assistant.p3897e.p3902c.p3907c.C50936ah.f132593m
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.e.c.c.aa r9 = (com.google.assistant.p3897e.p3902c.p3907c.C50929aa) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r12 = r9.instance
            com.google.assistant.e.c.c.ah r12 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r12
            int r13 = r12.f132595a
            r14 = 4
            r13 = r13 | r14
            r12.f132595a = r13
            r13 = 1
            r12.f132600f = r13
            com.google.assistant.e.c.c.ac r12 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.DEFAULT
            r9.copyOnWrite()
            com.google.protobuf.bv r13 = r9.instance
            com.google.assistant.e.c.c.ah r13 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r13
            int r12 = r12.f132590g
            r13.f132602h = r12
            int r12 = r13.f132595a
            r12 = r12 | 64
            r13.f132595a = r12
            r9.copyOnWrite()
            com.google.protobuf.bv r12 = r9.instance
            com.google.assistant.e.c.c.ah r12 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r12
            r0.getClass()
            r13 = 1
            r12.f132596b = r13
            r12.f132597c = r0
            com.google.assistant.e.c.c.dc r0 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.c.c.db r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51011db) r0
            java.lang.String r12 = r4.f134480e
            r0.copyOnWrite()
            com.google.protobuf.bv r13 = r0.instance
            com.google.assistant.e.c.c.dc r13 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r13
            r12.getClass()
            int r14 = r13.f132815a
            r14 = r14 | 32
            r13.f132815a = r14
            r13.f132821g = r12
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.c.c.dc r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r0
            r9.copyOnWrite()
            com.google.protobuf.bv r12 = r9.instance
            com.google.assistant.e.c.c.ah r12 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r12
            r0.getClass()
            r12.f132601g = r0
            int r0 = r12.f132595a
            r0 = r0 | 32
            r12.f132595a = r0
            com.google.assistant.e.c.c.gh r0 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.c.c.gg r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51097gg) r0
            com.google.assistant.e.c.c.ev r12 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.assistant.e.c.c.es r12 = (com.google.assistant.p3897e.p3902c.p3907c.C51055es) r12
            java.lang.String r4 = r4.f134480e
            r12.copyOnWrite()
            com.google.protobuf.bv r13 = r12.instance
            com.google.assistant.e.c.c.ev r13 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r13
            r4.getClass()
            int r14 = r13.f132943a
            r15 = 1
            r14 = r14 | r15
            r13.f132943a = r14
            r13.f132944b = r4
            r12.copyOnWrite()
            com.google.protobuf.bv r4 = r12.instance
            com.google.assistant.e.c.c.ev r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r4
            int r13 = r4.f132943a
            r13 = r13 | 32
            r4.f132943a = r13
            r4.f132949g = r11
            com.google.protobuf.bv r4 = r12.build()
            com.google.assistant.e.c.c.ev r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r4
            r0.copyOnWrite()
            com.google.protobuf.bv r11 = r0.instance
            com.google.assistant.e.c.c.gh r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r11
            r4.getClass()
            r11.f133013c = r4
            r4 = 1
            r11.f133012b = r4
            r9.copyOnWrite()
            com.google.protobuf.bv r4 = r9.instance
            com.google.assistant.e.c.c.ah r4 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r4
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.c.c.gh r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r0
            r0.getClass()
            r4.f132599e = r0
            r0 = 4
            r4.f132598d = r0
            com.google.protobuf.bv r0 = r9.build()
            com.google.assistant.e.c.c.ah r0 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r0
            r8.copyOnWrite()
            com.google.protobuf.bv r4 = r8.instance
            com.google.assistant.e.j.e.eu r4 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r4
            r0.getClass()
            r4.f136278f = r0
            r0 = 17
            r4.f136277e = r0
            com.google.protobuf.bv r0 = r8.build()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            r7.mo53759b(r0)
            r6.mo53762a(r7)
            com.google.assistant.e.j.e.ff r0 = com.google.assistant.p3897e.p3921j.p3926e.C51953ff.f136315l
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.e.en r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51934en) r0
            com.google.protobuf.bv r4 = r6.build()
            com.google.assistant.e.j.e.fa r4 = (com.google.assistant.p3897e.p3921j.p3926e.C51948fa) r4
            r0.mo53755b(r4)
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.e.j.e.ff r4 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r4
            int r6 = r4.f136317a
            r6 = r6 | 16
            r4.f136317a = r6
            r6 = 1
            r4.f136322f = r6
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.e.ff r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r0
            com.google.assistant.e.j.dy r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61451j(r0)
            r5.add(r0)
        L_0x04b4:
            com.google.assistant.e.j.e.o r0 = com.google.assistant.p3897e.p3921j.p3926e.C52056o.f136624a
            com.google.assistant.e.j.dy r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61448g(r0)
            r5.add(r0)
            java.lang.String r0 = "keyguard"
            java.lang.Object r0 = r3.getSystemService(r0)
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
            boolean r0 = r0.isDeviceLocked()
            if (r0 == 0) goto L_0x051c
            com.google.assistant.e.j.e.fc r0 = r1.f88555e
            com.google.assistant.e.j.e.fc r1 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY
            if (r0 != r1) goto L_0x051c
            java.util.Locale r0 = java.util.Locale.getDefault()
            android.content.res.Resources r1 = r3.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            android.os.LocaleList r1 = r1.getLocales()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x04f8
            android.content.res.Resources r0 = r3.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            android.os.LocaleList r0 = r0.getLocales()
            r1 = 0
            java.util.Locale r0 = r0.get(r1)
        L_0x04f8:
            android.content.res.Resources r1 = r3.getResources()
            r3 = 2132085219(0x7f1509e3, float:1.981063E38)
            java.lang.String r1 = r1.getString(r3)
            java.lang.String r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61459r(r0)
            com.google.assistant.e.j.dy r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61454m(r1, r0)
            r5.add(r0)
            com.google.common.b.qy r0 = new com.google.common.b.qy
            r0.<init>(r10)
            com.google.assistant.e.j.en r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f.m61461b(r5, r0, r2)
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x053f
        L_0x051c:
            com.google.common.b.pz r0 = com.google.common.p4522b.C58733pz.f156496a
            com.google.assistant.e.j.en r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f.m61461b(r5, r0, r2)
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x053f
        L_0x0527:
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33079ax.f88551a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "getConfirmResponse: android provider package name is undefined"
            r3 = 50907(0xc6db, float:7.1336E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r1)
            com.google.common.b.pz r0 = com.google.common.p4522b.C58733pz.f156496a
            com.google.assistant.e.j.en r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f.m61461b(r5, r0, r2)
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r0)
        L_0x053f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33074as.apply(java.lang.Object):java.lang.Object");
    }
}
