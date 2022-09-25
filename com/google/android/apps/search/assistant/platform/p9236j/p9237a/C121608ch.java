package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import android.service.voice.VoiceInteractionSession;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.directactions.InternalDirectActionsBackendImpl$onDirectActionsInvalidated$future$1", mo61344c = "InternalDirectActionsBackendImpl.kt", mo61345d = "invokeSuspend", mo61346e = {359})
/* renamed from: com.google.android.apps.search.assistant.platform.j.a.ch */
/* compiled from: PG */
final class C121608ch extends C69572j implements C69630p {

    /* renamed from: a */
    Object f337410a;

    /* renamed from: b */
    Object f337411b;

    /* renamed from: c */
    Object f337412c;

    /* renamed from: d */
    int f337413d;

    /* renamed from: e */
    final /* synthetic */ C121616cp f337414e;

    /* renamed from: f */
    final /* synthetic */ VoiceInteractionSession.ActivityId f337415f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121608ch(C121616cp cpVar, VoiceInteractionSession.ActivityId activityId, C69577g gVar) {
        super(2, gVar);
        this.f337414e = cpVar;
        this.f337415f = activityId;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121608ch) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.google.android.apps.search.assistant.platform.j.a.cp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.android.apps.search.assistant.platform.j.a.cp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.google.android.apps.search.assistant.platform.j.a.cp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r6) {
        /*
            r5 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r5.f337413d
            r2 = 0
            if (r1 == 0) goto L_0x0011
            java.lang.Object r0 = r5.f337412c
            java.lang.Object r1 = r5.f337411b
            java.lang.Object r3 = r5.f337410a
            p5462h.C69714l.m101134b(r6)
            goto L_0x002a
        L_0x0011:
            p5462h.C69714l.m101134b(r6)
            com.google.android.apps.search.assistant.platform.j.a.cp r6 = r5.f337414e
            kotlinx.coroutines.j.b r3 = r6.f337451h
            android.service.voice.VoiceInteractionSession$ActivityId r1 = r5.f337415f
            r5.f337410a = r3
            r5.f337411b = r1
            r5.f337412c = r6
            r4 = 1
            r5.f337413d = r4
            java.lang.Object r4 = r3.mo63025b(r2, r5)
            if (r4 == r0) goto L_0x005c
            r0 = r6
        L_0x002a:
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0057 }
            r6 = r0
            com.google.android.apps.search.assistant.platform.j.a.cp r6 = (com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121616cp) r6     // Catch:{ all -> 0x0057 }
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.a r6 = r6.f337452i     // Catch:{ all -> 0x0057 }
            android.service.voice.VoiceInteractionSession$ActivityId r1 = (android.service.voice.VoiceInteractionSession.ActivityId) r1     // Catch:{ all -> 0x0057 }
            java.lang.String r6 = r6.mo38947a(r1)     // Catch:{ all -> 0x0057 }
            com.google.android.apps.search.assistant.platform.j.a.cp r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121616cp) r0     // Catch:{ all -> 0x0057 }
            java.util.concurrent.ConcurrentSkipListSet r0 = r0.f337450g     // Catch:{ all -> 0x0057 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0057 }
        L_0x003f:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x0051
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0057 }
            com.google.android.apps.search.assistant.platform.j.a.bz r1 = (com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121599bz) r1     // Catch:{ all -> 0x0057 }
            com.google.android.libraries.search.assistant.invocation.h.a.a r1 = r1.f337384b     // Catch:{ all -> 0x0057 }
            r1.mo39110a(r6)     // Catch:{ all -> 0x0057 }
            goto L_0x003f
        L_0x0051:
            r3.mo63026c(r2)
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x0057:
            r6 = move-exception
            r3.mo63026c(r2)
            throw r6
        L_0x005c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121608ch.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C121608ch(this.f337414e, this.f337415f, gVar);
    }
}
