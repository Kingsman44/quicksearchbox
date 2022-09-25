package com.google.android.libraries.search.assistant.p2825x.p2826a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34119a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c.p2688a.C34670c;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.quickphrasesmanager.impl.QuickPhrasesManagerImpl$onConfigurationUpdate$configUpdateFuture$1", mo61344c = "QuickPhrasesManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {157, 180})
/* renamed from: com.google.android.libraries.search.assistant.x.a.v */
/* compiled from: PG */
final class C36816v extends C69572j implements C69626l {

    /* renamed from: a */
    int f95947a;

    /* renamed from: b */
    final /* synthetic */ C34670c f95948b;

    /* renamed from: c */
    final /* synthetic */ C36808o f95949c;

    /* renamed from: d */
    final /* synthetic */ C34119a f95950d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36816v(C34670c cVar, C36808o oVar, C34119a aVar, C69577g gVar) {
        super(1, gVar);
        this.f95948b = cVar;
        this.f95949c = oVar;
        this.f95950d = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C36816v(this.f95948b, this.f95949c, this.f95950d, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x02a9 A[Catch:{ all -> 0x0012 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x02c8 A[Catch:{ all -> 0x0012 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r0 = "builder"
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r13.f95947a
            r3 = 1
            java.lang.String r4 = "QuickPhrases.Manager"
            if (r2 == 0) goto L_0x0019
            if (r2 == r3) goto L_0x0015
            p5462h.C69714l.m101134b(r14)     // Catch:{ all -> 0x0012 }
            goto L_0x0265
        L_0x0012:
            r14 = move-exception
            goto L_0x02e1
        L_0x0015:
            p5462h.C69714l.m101134b(r14)
            goto L_0x006a
        L_0x0019:
            p5462h.C69714l.m101134b(r14)
            com.google.android.libraries.search.assistant.invocation.o.i.c.a.c r14 = r13.f95948b
            com.google.protobuf.cj r2 = new com.google.protobuf.cj
            com.google.protobuf.ch r14 = r14.f92058b
            com.google.protobuf.ci r5 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c.p2688a.C34670c.f92053c
            r2.<init>(r14, r5)
            boolean r14 = r2.isEmpty()
            if (r14 == 0) goto L_0x006d
            com.google.android.libraries.search.assistant.x.a.o r14 = r13.f95949c
            boolean r2 = r14.f95918f
            if (r2 == 0) goto L_0x0036
            r14.mo40413g()
        L_0x0036:
            com.google.android.libraries.search.assistant.invocation.o.i.c.a.c r14 = r13.f95948b
            boolean r14 = r14.f92059d
            if (r14 != 0) goto L_0x006d
            com.google.common.f.e r14 = com.google.android.libraries.search.assistant.p2825x.p2826a.C36808o.f95913a
            com.google.common.f.x r14 = r14.mo56224b()
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r14.mo56378ag(r0, r4)
            com.google.common.f.n r0 = new com.google.common.f.n
            r2 = 52354(0xcc82, float:7.3364E-41)
            r0.<init>(r2)
            r14.mo56379ah(r0)
            java.lang.String r0 = "List of active QuickPhrases is empty. Bringing the SodaQuickPhrasesFrontend down."
            r14.mo56386p(r0)
            com.google.android.libraries.search.assistant.x.a.o r14 = r13.f95949c
            com.google.android.libraries.search.assistant.invocation.o.c.a r0 = r13.f95950d
            com.google.android.libraries.search.assistant.invocation.o.a.b r0 = com.google.android.libraries.search.assistant.p2825x.p2826a.C36808o.m65503j(r0)
            r13.f95947a = r3
            java.lang.Object r14 = r14.mo40412f(r0, r13)
            if (r14 != r1) goto L_0x006a
            return r1
        L_0x006a:
            h.q r14 = p5462h.C69788q.f186170a
            return r14
        L_0x006d:
            com.google.android.libraries.search.assistant.x.a.o r14 = r13.f95949c
            boolean r2 = r14.f95918f
            java.lang.String r3 = "configuration.locale"
            java.lang.String r5 = "newBuilder()"
            if (r2 == 0) goto L_0x0111
            com.google.android.libraries.search.assistant.invocation.o.c.a r2 = r13.f95950d
            com.google.android.libraries.search.assistant.invocation.o.i.c.a.c r6 = r13.f95948b
            java.lang.String r6 = r6.f92057a
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r3)
            if (r2 != 0) goto L_0x00a0
            com.google.common.f.e r14 = com.google.android.libraries.search.assistant.p2825x.p2826a.C36808o.f95913a
            com.google.common.f.x r14 = r14.mo56224b()
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r14.mo56378ag(r2, r4)
            com.google.common.f.n r2 = new com.google.common.f.n
            r6 = 52368(0xcc90, float:7.3383E-41)
            r2.<init>(r6)
            r14.mo56379ah(r2)
            java.lang.String r2 = "Cannot connect to OnDeviceNluFulfillmentService without a client."
            r14.mo56386p(r2)
            goto L_0x0111
        L_0x00a0:
            com.google.android.libraries.search.assistant.invocation.o.c.a r7 = r14.f95922j
            boolean r7 = p5462h.p5473f.p5475b.C69664n.m101066l(r2, r7)
            if (r7 != 0) goto L_0x0111
            com.google.android.libraries.search.assistant.invocation.o.c.a r7 = r14.f95922j
            if (r7 == 0) goto L_0x00af
            r14.mo40413g()
        L_0x00af:
            com.google.common.f.e r7 = com.google.android.libraries.search.assistant.p2825x.p2826a.C36808o.f95913a
            com.google.common.f.x r7 = r7.mo56224b()
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r8, r4)
            com.google.common.f.n r8 = new com.google.common.f.n
            r9 = 52367(0xcc8f, float:7.3382E-41)
            r8.<init>(r9)
            r7.mo56379ah(r8)
            java.lang.String r8 = "Connecting to OnDeviceNluFulfillmentService."
            r7.mo56386p(r8)
            r14.f95922j = r2
            android.content.Context r7 = r14.f95915c
            java.lang.Class<com.google.android.libraries.search.assistant.x.a.o$a> r8 = com.google.android.libraries.search.assistant.p2825x.p2826a.C36808o.C36809a.class
            com.google.apps.tiktok.account.AccountId r2 = r2.f90870b
            java.lang.Object r2 = com.google.apps.tiktok.inject.C47245e.m84045a(r7, r8, r2)
            com.google.android.libraries.search.assistant.x.a.o$a r2 = (com.google.android.libraries.search.assistant.p2825x.p2826a.C36808o.C36809a) r2
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a r7 = r2.mo40416J()
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.e r7 = r7.mo105629a()
            r14.f95923k = r7
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.e r14 = r14.f95923k
            if (r14 == 0) goto L_0x0111
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bk r7 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk.f339392l
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bi r7 = (com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122417bi) r7
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r5)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bm r7 = p5462h.p5473f.p5475b.C69664n.m101061g(r7, "builder")
            long r8 = r2.mo40417p()
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bi r2 = r7.f339405a
            r2.copyOnWrite()
            com.google.protobuf.bv r2 = r2.instance
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bk r2 = (com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk) r2
            int r9 = (int) r8
            r2.f339394a = r9
            r7.mo105624c(r6)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bk r2 = r7.mo105622a()
            r14.mo105650b(r2)
        L_0x0111:
            com.google.common.f.e r14 = com.google.android.libraries.search.assistant.p2825x.p2826a.C36808o.f95913a     // Catch:{ all -> 0x0012 }
            com.google.common.f.x r14 = r14.mo56224b()     // Catch:{ all -> 0x0012 }
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14     // Catch:{ all -> 0x0012 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0012 }
            r14.mo56378ag(r2, r4)     // Catch:{ all -> 0x0012 }
            java.lang.String r2 = "Sending QP configuration to SODA for locale %s with QuickPhrases%s."
            com.google.android.libraries.search.assistant.invocation.o.i.c.a.c r6 = r13.f95948b     // Catch:{ all -> 0x0012 }
            java.lang.String r7 = r6.f92057a     // Catch:{ all -> 0x0012 }
            com.google.protobuf.cj r8 = new com.google.protobuf.cj     // Catch:{ all -> 0x0012 }
            com.google.protobuf.ch r6 = r6.f92058b     // Catch:{ all -> 0x0012 }
            com.google.protobuf.ci r9 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c.p2688a.C34670c.f92053c     // Catch:{ all -> 0x0012 }
            r8.<init>(r6, r9)     // Catch:{ all -> 0x0012 }
            java.lang.String r6 = com.google.android.libraries.search.assistant.p2825x.p2826a.C36794ah.m65482b(r8)     // Catch:{ all -> 0x0012 }
            com.google.common.f.n r8 = new com.google.common.f.n     // Catch:{ all -> 0x0012 }
            r9 = 52351(0xcc7f, float:7.336E-41)
            r8.<init>(r9)     // Catch:{ all -> 0x0012 }
            r14.mo56379ah(r8)     // Catch:{ all -> 0x0012 }
            r14.mo56354G(r2, r7, r6)     // Catch:{ all -> 0x0012 }
            com.google.android.libraries.search.assistant.x.a.o r14 = r13.f95949c     // Catch:{ all -> 0x0012 }
            com.google.android.libraries.search.n.f.b r2 = r14.f95919g     // Catch:{ all -> 0x0012 }
            if (r2 != 0) goto L_0x0186
            com.google.android.libraries.search.n.f.a.e r2 = r14.f95926n     // Catch:{ all -> 0x0012 }
            com.google.android.libraries.search.assistant.x.a.u r6 = new com.google.android.libraries.search.assistant.x.a.u     // Catch:{ all -> 0x0012 }
            r6.<init>(r14)     // Catch:{ all -> 0x0012 }
            com.google.android.libraries.search.n.f.a.d r7 = new com.google.android.libraries.search.n.f.a.d     // Catch:{ all -> 0x0012 }
            g.a.a r8 = r2.f104471a     // Catch:{ all -> 0x0012 }
            java.lang.Object r8 = r8.mo17428b()     // Catch:{ all -> 0x0012 }
            java.util.concurrent.Executor r8 = (java.util.concurrent.Executor) r8     // Catch:{ all -> 0x0012 }
            r8.getClass()     // Catch:{ all -> 0x0012 }
            g.a.a r2 = r2.f104472b     // Catch:{ all -> 0x0012 }
            java.lang.Object r2 = r2.mo17428b()     // Catch:{ all -> 0x0012 }
            com.google.android.libraries.search.n.f.b.o r2 = (com.google.android.libraries.search.p3055n.p3078f.p3080b.C39712o) r2     // Catch:{ all -> 0x0012 }
            r2.getClass()     // Catch:{ all -> 0x0012 }
            r7.<init>(r6, r8, r2)     // Catch:{ all -> 0x0012 }
            r14.f95919g = r7     // Catch:{ all -> 0x0012 }
            com.google.common.f.e r2 = com.google.android.libraries.search.assistant.p2825x.p2826a.C36808o.f95913a     // Catch:{ all -> 0x0012 }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ all -> 0x0012 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0012 }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0012 }
            r2.mo56378ag(r6, r4)     // Catch:{ all -> 0x0012 }
            com.google.common.f.n r6 = new com.google.common.f.n     // Catch:{ all -> 0x0012 }
            r7 = 52357(0xcc85, float:7.3368E-41)
            r6.<init>(r7)     // Catch:{ all -> 0x0012 }
            r2.mo56379ah(r6)     // Catch:{ all -> 0x0012 }
            java.lang.String r6 = "SodaQuickPhrasesFrontend has been started."
            r2.mo56386p(r6)     // Catch:{ all -> 0x0012 }
        L_0x0186:
            com.google.android.libraries.search.n.f.b r14 = r14.f95919g     // Catch:{ all -> 0x0012 }
            if (r14 == 0) goto L_0x02d9
            com.google.android.libraries.search.assistant.invocation.o.i.c.a.c r2 = r13.f95948b     // Catch:{ all -> 0x0012 }
            com.google.speech.j.fm r6 = com.google.speech.p5218j.C66950fm.f181991d     // Catch:{ all -> 0x0012 }
            com.google.protobuf.bn r6 = r6.createBuilder()     // Catch:{ all -> 0x0012 }
            com.google.speech.j.fl r6 = (com.google.speech.p5218j.C66949fl) r6     // Catch:{ all -> 0x0012 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r5)     // Catch:{ all -> 0x0012 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r0)     // Catch:{ all -> 0x0012 }
            com.google.protobuf.a.b r7 = new com.google.protobuf.a.b     // Catch:{ all -> 0x0012 }
            com.google.protobuf.bv r8 = r6.instance     // Catch:{ all -> 0x0012 }
            com.google.speech.j.fm r8 = (com.google.speech.p5218j.C66950fm) r8     // Catch:{ all -> 0x0012 }
            com.google.protobuf.cq r8 = r8.f181994b     // Catch:{ all -> 0x0012 }
            java.util.List r8 = java.util.Collections.unmodifiableList(r8)     // Catch:{ all -> 0x0012 }
            java.lang.String r9 = "_builder.getPhraseList()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)     // Catch:{ all -> 0x0012 }
            r7.<init>(r8)     // Catch:{ all -> 0x0012 }
            com.google.protobuf.cj r7 = new com.google.protobuf.cj     // Catch:{ all -> 0x0012 }
            com.google.protobuf.ch r8 = r2.f92058b     // Catch:{ all -> 0x0012 }
            com.google.protobuf.ci r9 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c.p2688a.C34670c.f92053c     // Catch:{ all -> 0x0012 }
            r7.<init>(r8, r9)     // Catch:{ all -> 0x0012 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0012 }
            r9 = 10
            int r9 = p5462h.p5463a.C69540x.m100804k(r7, r9)     // Catch:{ all -> 0x0012 }
            r8.<init>(r9)     // Catch:{ all -> 0x0012 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0012 }
        L_0x01c6:
            boolean r9 = r7.hasNext()     // Catch:{ all -> 0x0012 }
            java.lang.String r10 = "_builder.build()"
            java.lang.String r11 = "value"
            if (r9 == 0) goto L_0x0206
            java.lang.Object r9 = r7.next()     // Catch:{ all -> 0x0012 }
            com.google.speech.j.fk r9 = (com.google.speech.p5218j.C66948fk) r9     // Catch:{ all -> 0x0012 }
            com.google.speech.j.fc r12 = com.google.speech.p5218j.C66940fc.f181950c     // Catch:{ all -> 0x0012 }
            com.google.protobuf.bn r12 = r12.createBuilder()     // Catch:{ all -> 0x0012 }
            com.google.speech.j.fb r12 = (com.google.speech.p5218j.C66939fb) r12     // Catch:{ all -> 0x0012 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r5)     // Catch:{ all -> 0x0012 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r0)     // Catch:{ all -> 0x0012 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r11)     // Catch:{ all -> 0x0012 }
            r12.copyOnWrite()     // Catch:{ all -> 0x0012 }
            com.google.protobuf.bv r11 = r12.instance     // Catch:{ all -> 0x0012 }
            com.google.speech.j.fc r11 = (com.google.speech.p5218j.C66940fc) r11     // Catch:{ all -> 0x0012 }
            int r9 = r9.f181990o     // Catch:{ all -> 0x0012 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0012 }
            r11.f181953b = r9     // Catch:{ all -> 0x0012 }
            r9 = 7
            r11.f181952a = r9     // Catch:{ all -> 0x0012 }
            com.google.protobuf.bv r9 = r12.build()     // Catch:{ all -> 0x0012 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r10)     // Catch:{ all -> 0x0012 }
            com.google.speech.j.fc r9 = (com.google.speech.p5218j.C66940fc) r9     // Catch:{ all -> 0x0012 }
            r8.add(r9)     // Catch:{ all -> 0x0012 }
            goto L_0x01c6
        L_0x0206:
            r6.copyOnWrite()     // Catch:{ all -> 0x0012 }
            com.google.protobuf.bv r0 = r6.instance     // Catch:{ all -> 0x0012 }
            com.google.speech.j.fm r0 = (com.google.speech.p5218j.C66950fm) r0     // Catch:{ all -> 0x0012 }
            com.google.protobuf.cq r5 = r0.f181994b     // Catch:{ all -> 0x0012 }
            boolean r7 = r5.mo58948c()     // Catch:{ all -> 0x0012 }
            if (r7 != 0) goto L_0x021b
            com.google.protobuf.cq r5 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r5)     // Catch:{ all -> 0x0012 }
            r0.f181994b = r5     // Catch:{ all -> 0x0012 }
        L_0x021b:
            com.google.protobuf.cq r0 = r0.f181994b     // Catch:{ all -> 0x0012 }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r8, (java.util.List) r0)     // Catch:{ all -> 0x0012 }
            java.lang.String r0 = r2.f92057a     // Catch:{ all -> 0x0012 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r3)     // Catch:{ all -> 0x0012 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r11)     // Catch:{ all -> 0x0012 }
            r6.copyOnWrite()     // Catch:{ all -> 0x0012 }
            com.google.protobuf.bv r2 = r6.instance     // Catch:{ all -> 0x0012 }
            com.google.speech.j.fm r2 = (com.google.speech.p5218j.C66950fm) r2     // Catch:{ all -> 0x0012 }
            r0.getClass()     // Catch:{ all -> 0x0012 }
            int r3 = r2.f181993a     // Catch:{ all -> 0x0012 }
            r5 = 2
            r3 = r3 | r5
            r2.f181993a = r3     // Catch:{ all -> 0x0012 }
            r2.f181995c = r0     // Catch:{ all -> 0x0012 }
            com.google.protobuf.bv r0 = r6.build()     // Catch:{ all -> 0x0012 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r10)     // Catch:{ all -> 0x0012 }
            com.google.speech.j.fm r0 = (com.google.speech.p5218j.C66950fm) r0     // Catch:{ all -> 0x0012 }
            com.google.android.libraries.search.n.f.a.b r2 = new com.google.android.libraries.search.n.f.a.b     // Catch:{ all -> 0x0012 }
            r3 = r14
            com.google.android.libraries.search.n.f.a.d r3 = (com.google.android.libraries.search.p3055n.p3078f.p3079a.C39695d) r3     // Catch:{ all -> 0x0012 }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0012 }
            com.google.android.libraries.search.n.f.a.d r14 = (com.google.android.libraries.search.p3055n.p3078f.p3079a.C39695d) r14     // Catch:{ all -> 0x0012 }
            java.util.concurrent.Executor r14 = r14.f104470b     // Catch:{ all -> 0x0012 }
            com.google.common.util.concurrent.r r0 = com.google.apps.tiktok.tracing.C47810es.m84965e(r2)     // Catch:{ all -> 0x0012 }
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60856cj.m92905n(r0, r14)     // Catch:{ all -> 0x0012 }
            java.lang.String r0 = "getSodaQuickPhraseFronte…          }\n            )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r0)     // Catch:{ all -> 0x0012 }
            r13.f95947a = r5     // Catch:{ all -> 0x0012 }
            java.lang.Object r14 = kotlinx.coroutines.p5578d.C71663i.m104690c(r14, r13)     // Catch:{ all -> 0x0012 }
            if (r14 != r1) goto L_0x0265
            return r1
        L_0x0265:
            com.google.speech.j.fo r14 = (com.google.speech.p5218j.C66952fo) r14     // Catch:{ all -> 0x0012 }
            com.google.android.libraries.search.assistant.x.a.o r0 = r13.f95949c     // Catch:{ all -> 0x0012 }
            kotlinx.coroutines.b.cy r0 = r0.f95925m     // Catch:{ all -> 0x0012 }
            com.google.android.libraries.search.assistant.invocation.o.c.a r1 = r13.f95950d     // Catch:{ all -> 0x0012 }
        L_0x026d:
            java.lang.Object r2 = r0.mo62784e()     // Catch:{ all -> 0x0012 }
            r3 = r2
            h.i r3 = (p5462h.C69685i) r3     // Catch:{ all -> 0x0012 }
            h.i r3 = new h.i     // Catch:{ all -> 0x0012 }
            com.google.android.libraries.search.assistant.invocation.o.a.b r5 = com.google.android.libraries.search.assistant.p2825x.p2826a.C36808o.m65503j(r1)     // Catch:{ all -> 0x0012 }
            r3.<init>(r14, r5)     // Catch:{ all -> 0x0012 }
            boolean r2 = r0.mo62808g(r2, r3)     // Catch:{ all -> 0x0012 }
            if (r2 == 0) goto L_0x026d
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.p2825x.p2826a.C36808o.f95913a     // Catch:{ all -> 0x0012 }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x0012 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0012 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0012 }
            r0.mo56378ag(r1, r4)     // Catch:{ all -> 0x0012 }
            java.lang.String r1 = "Updating SODA QP configuration finished. Successfully configured QuickPhrases%s. %s"
            java.lang.String r2 = "configResponse"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r2)     // Catch:{ all -> 0x0012 }
            java.util.List r2 = com.google.android.libraries.search.assistant.p2825x.p2826a.C36808o.m65505l(r14)     // Catch:{ all -> 0x0012 }
            java.lang.String r2 = com.google.android.libraries.search.assistant.p2825x.p2826a.C36794ah.m65482b(r2)     // Catch:{ all -> 0x0012 }
            java.util.List r3 = com.google.android.libraries.search.assistant.p2825x.p2826a.C36808o.m65504k(r14)     // Catch:{ all -> 0x0012 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0012 }
            if (r3 != 0) goto L_0x02c8
            java.util.List r14 = com.google.android.libraries.search.assistant.p2825x.p2826a.C36808o.m65504k(r14)     // Catch:{ all -> 0x0012 }
            java.lang.String r14 = com.google.android.libraries.search.assistant.p2825x.p2826a.C36794ah.m65481a(r14)     // Catch:{ all -> 0x0012 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0012 }
            r3.<init>()     // Catch:{ all -> 0x0012 }
            java.lang.String r5 = "Failed to configure QuickPhrases"
            r3.append(r5)     // Catch:{ all -> 0x0012 }
            r3.append(r14)     // Catch:{ all -> 0x0012 }
            java.lang.String r14 = "."
            r3.append(r14)     // Catch:{ all -> 0x0012 }
            java.lang.String r14 = r3.toString()     // Catch:{ all -> 0x0012 }
            goto L_0x02ca
        L_0x02c8:
            java.lang.String r14 = ""
        L_0x02ca:
            com.google.common.f.n r3 = new com.google.common.f.n     // Catch:{ all -> 0x0012 }
            r5 = 52352(0xcc80, float:7.3361E-41)
            r3.<init>(r5)     // Catch:{ all -> 0x0012 }
            r0.mo56379ah(r3)     // Catch:{ all -> 0x0012 }
            r0.mo56354G(r1, r2, r14)     // Catch:{ all -> 0x0012 }
            goto L_0x0304
        L_0x02d9:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0012 }
            java.lang.String r0 = "Failed to create SodaQPFrontend."
            r14.<init>(r0)     // Catch:{ all -> 0x0012 }
            throw r14     // Catch:{ all -> 0x0012 }
        L_0x02e1:
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.p2825x.p2826a.C36808o.f95913a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r4)
            com.google.common.f.x r14 = r0.mo56382g(r14)
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 52353(0xcc81, float:7.3362E-41)
            r0.<init>(r1)
            r14.mo56379ah(r0)
            java.lang.String r0 = "Updating SODA QP configuration finished with an error."
            r14.mo56386p(r0)
        L_0x0304:
            h.q r14 = p5462h.C69788q.f186170a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2825x.p2826a.C36816v.mo5193b(java.lang.Object):java.lang.Object");
    }
}
