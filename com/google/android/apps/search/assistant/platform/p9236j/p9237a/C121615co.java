package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.directactions.InternalDirectActionsBackendImpl$requestDirectActions$1", mo61344c = "InternalDirectActionsBackendImpl.kt", mo61345d = "invokeSuspend", mo61346e = {359, 211, 218, 224})
/* renamed from: com.google.android.apps.search.assistant.platform.j.a.co */
/* compiled from: PG */
final class C121615co extends C69572j implements C69630p {

    /* renamed from: a */
    Object f337437a;

    /* renamed from: b */
    Object f337438b;

    /* renamed from: c */
    Object f337439c;

    /* renamed from: d */
    Object f337440d;

    /* renamed from: e */
    int f337441e;

    /* renamed from: f */
    final /* synthetic */ C121616cp f337442f;

    /* renamed from: g */
    final /* synthetic */ String f337443g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121615co(C121616cp cpVar, String str, C69577g gVar) {
        super(2, gVar);
        this.f337442f = cpVar;
        this.f337443g = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121615co) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0090 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e0 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r11) {
        /*
            r10 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r10.f337441e
            java.lang.String r2 = "INV.IntDirectActionsBack"
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L_0x0037
            if (r1 == r5) goto L_0x002b
            if (r1 == r4) goto L_0x0027
            if (r1 == r3) goto L_0x0017
            p5462h.C69714l.m101134b(r11)
            goto L_0x0147
        L_0x0017:
            java.lang.Object r1 = r10.f337440d
            java.lang.Object r3 = r10.f337439c
            java.lang.Object r4 = r10.f337438b
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            java.lang.Object r7 = r10.f337437a
            android.service.voice.VoiceInteractionSession$ActivityId r7 = (android.service.voice.VoiceInteractionSession.ActivityId) r7
            p5462h.C69714l.m101134b(r11)
            goto L_0x0092
        L_0x0027:
            p5462h.C69714l.m101134b(r11)
            goto L_0x0064
        L_0x002b:
            java.lang.Object r1 = r10.f337438b
            com.google.android.apps.search.assistant.platform.j.a.cp r1 = (com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121616cp) r1
            java.lang.Object r7 = r10.f337437a
            kotlinx.coroutines.j.b r7 = (kotlinx.coroutines.p5584j.C71788b) r7
            p5462h.C69714l.m101134b(r11)
            goto L_0x004a
        L_0x0037:
            p5462h.C69714l.m101134b(r11)
            com.google.android.apps.search.assistant.platform.j.a.cp r1 = r10.f337442f
            kotlinx.coroutines.j.b r7 = r1.f337451h
            r10.f337437a = r7
            r10.f337438b = r1
            r10.f337441e = r5
            java.lang.Object r11 = r7.mo63025b(r6, r10)
            if (r11 == r0) goto L_0x0179
        L_0x004a:
            com.google.android.libraries.search.assistant.invocation.f.b.b.b r11 = r1.f337448e     // Catch:{ all -> 0x0174 }
            com.google.common.util.concurrent.cx r11 = r11.mo39049a()     // Catch:{ all -> 0x0174 }
            r7.mo63026c(r6)
            java.lang.String r1 = "sequentialMutex.withLock…dCache.resourceFuture() }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r1)
            r10.f337437a = r6
            r10.f337438b = r6
            r10.f337441e = r4
            java.lang.Object r11 = kotlinx.coroutines.p5578d.C71663i.m104690c(r11, r10)
            if (r11 == r0) goto L_0x0173
        L_0x0064:
            java.lang.String r1 = "sequentialMutex.withLock…esourceFuture() }.await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r1)
            r7 = r11
            android.service.voice.VoiceInteractionSession$ActivityId r7 = (android.service.voice.VoiceInteractionSession.ActivityId) r7
            com.google.common.f.e r11 = com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121616cp.f337444a
            com.google.common.f.x r11 = r11.mo56224b()
            r4 = r11
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r11, r2)
            java.lang.String r1 = r10.f337443g
            com.google.android.apps.search.assistant.platform.j.a.cp r11 = r10.f337442f
            r10.f337437a = r7
            r10.f337438b = r4
            java.lang.String r8 = "DirectActions#requestDirectActions direct actions for activityId=%s cacheActivityId=%s"
            r10.f337439c = r8
            r10.f337440d = r1
            r10.f337441e = r3
            java.lang.Object r11 = r11.mo105270h(r10)
            if (r11 != r0) goto L_0x0091
            return r0
        L_0x0091:
            r3 = r8
        L_0x0092:
            com.google.common.f.n r8 = new com.google.common.f.n
            r9 = 35903(0x8c3f, float:5.0311E-41)
            r8.<init>(r9)
            r4.mo56379ah(r8)
            java.lang.String r3 = (java.lang.String) r3
            r4.mo56354G(r3, r1, r11)
            com.google.android.apps.search.assistant.platform.j.a.cp r11 = r10.f337442f
            java.lang.String r1 = r10.f337443g
            java.util.concurrent.atomic.AtomicReference r3 = r11.f337449f
            java.lang.Object r3 = r3.get()
            com.google.android.apps.search.assistant.platform.j.a.dt r3 = (com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121647dt) r3
            if (r3 == 0) goto L_0x00b9
            kotlinx.coroutines.b.cy r3 = r3.f337507d
            java.lang.Object r3 = r3.mo62784e()
            java.util.Set r3 = (java.util.Set) r3
            goto L_0x00ba
        L_0x00b9:
            r3 = r6
        L_0x00ba:
            if (r3 != 0) goto L_0x00be
            h.a.ao r3 = p5462h.p5463a.C69498ao.f185920a
        L_0x00be:
            java.util.Set r3 = p5462h.p5463a.C69514bd.m100892f(r3, r7)
            java.util.Iterator r3 = r3.iterator()
        L_0x00c6:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00e0
            java.lang.Object r4 = r3.next()
            r7 = r4
            android.service.voice.VoiceInteractionSession$ActivityId r7 = (android.service.voice.VoiceInteractionSession.ActivityId) r7
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.a r8 = r11.f337452i
            java.lang.String r7 = r8.mo38947a(r7)
            boolean r7 = p5462h.p5473f.p5475b.C69664n.m101066l(r7, r1)
            if (r7 == 0) goto L_0x00c6
            goto L_0x00e1
        L_0x00e0:
            r4 = r6
        L_0x00e1:
            android.service.voice.VoiceInteractionSession$ActivityId r4 = (android.service.voice.VoiceInteractionSession.ActivityId) r4
            if (r4 == 0) goto L_0x016d
            com.google.android.apps.search.assistant.platform.j.a.cp r11 = r10.f337442f
            com.google.android.apps.search.assistant.platform.j.a.y r1 = r11.f337453j
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.b r11 = r11.mo105269g()
            r10.f337437a = r6
            r10.f337438b = r6
            r10.f337439c = r6
            r10.f337440d = r6
            r3 = 4
            r10.f337441e = r3
            kotlinx.coroutines.r r3 = new kotlinx.coroutines.r
            h.c.g r6 = p5462h.p5466c.p5467a.C69555b.m100961b(r10)
            r3.<init>(r6, r5)
            r3.mo63041A()
            android.os.CancellationSignal r5 = new android.os.CancellationSignal
            r5.<init>()
            com.google.android.apps.search.assistant.platform.j.a.w r6 = new com.google.android.apps.search.assistant.platform.j.a.w
            r6.<init>(r5)
            r3.mo63035f(r6)
            com.google.common.f.e r6 = com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121668y.f337553a
            com.google.common.f.x r6 = r6.mo56224b()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r8 = "INV.DirectActAdapter"
            r6.mo56378ag(r7, r8)
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.a r7 = r1.f337555c
            java.lang.String r7 = r7.mo38947a(r4)
            com.google.common.f.n r8 = new com.google.common.f.n
            r9 = 35889(0x8c31, float:5.0291E-41)
            r8.<init>(r9)
            r6.mo56379ah(r8)
            java.lang.String r8 = "DirectActionsAdapter#requestDirectActions activityId=%s"
            r6.mo56389s(r8, r7)
            java.util.concurrent.Executor r1 = r1.f337554b
            com.google.android.apps.search.assistant.platform.j.a.x r6 = new com.google.android.apps.search.assistant.platform.j.a.x
            r6.<init>(r3)
            r11.mo38926i(r4, r5, r1, r6)
            java.lang.Object r11 = r3.mo63043n()
            if (r11 != r0) goto L_0x0147
            return r0
        L_0x0147:
            com.google.common.b.gu r11 = (com.google.common.p4522b.C58485gu) r11
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121616cp.f337444a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = r10.f337443g
            int r2 = r11.size()
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 35904(0x8c40, float:5.0312E-41)
            r3.<init>(r4)
            r0.mo56379ah(r3)
            java.lang.String r3 = "DirectActions#requestDirectActions direct actions for activityId=%s received (%s elements)"
            r0.mo56352E(r3, r1, r2)
            return r11
        L_0x016d:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            r11.<init>()
            throw r11
        L_0x0173:
            return r0
        L_0x0174:
            r11 = move-exception
            r7.mo63026c(r6)
            throw r11
        L_0x0179:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121615co.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C121615co(this.f337442f, this.f337443g, gVar);
    }
}
