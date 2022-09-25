package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.directactions.InternalDirectActionsBackendImpl$getForegroundActivityId$1", mo61344c = "InternalDirectActionsBackendImpl.kt", mo61345d = "invokeSuspend", mo61346e = {359, 193})
/* renamed from: com.google.android.apps.search.assistant.platform.j.a.cb */
/* compiled from: PG */
final class C121602cb extends C69572j implements C69630p {

    /* renamed from: a */
    Object f337393a;

    /* renamed from: b */
    Object f337394b;

    /* renamed from: c */
    Object f337395c;

    /* renamed from: d */
    int f337396d;

    /* renamed from: e */
    final /* synthetic */ C121616cp f337397e;

    /* renamed from: f */
    final /* synthetic */ C34037b f337398f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121602cb(C121616cp cpVar, C34037b bVar, C69577g gVar) {
        super(2, gVar);
        this.f337397e = cpVar;
        this.f337398f = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121602cb) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.google.android.apps.search.assistant.platform.j.a.cp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.google.android.apps.search.assistant.platform.j.a.cp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.google.android.apps.search.assistant.platform.j.a.cp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r7.f337396d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0019
            if (r1 == r2) goto L_0x000f
            p5462h.C69714l.m101134b(r8)
            goto L_0x0091
        L_0x000f:
            java.lang.Object r1 = r7.f337395c
            java.lang.Object r2 = r7.f337394b
            java.lang.Object r4 = r7.f337393a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0031
        L_0x0019:
            p5462h.C69714l.m101134b(r8)
            com.google.android.apps.search.assistant.platform.j.a.cp r8 = r7.f337397e
            kotlinx.coroutines.j.b r4 = r8.f337451h
            com.google.android.libraries.search.assistant.invocation.o.a.b r1 = r7.f337398f
            r7.f337393a = r4
            r7.f337394b = r8
            r7.f337395c = r1
            r7.f337396d = r2
            java.lang.Object r2 = r4.mo63025b(r3, r7)
            if (r2 == r0) goto L_0x00a1
            r2 = r8
        L_0x0031:
            r8 = r2
            com.google.android.apps.search.assistant.platform.j.a.cp r8 = (com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121616cp) r8     // Catch:{ all -> 0x009c }
            j$.util.Optional r8 = r8.f337445b     // Catch:{ all -> 0x009c }
            boolean r8 = r8.isPresent()     // Catch:{ all -> 0x009c }
            if (r8 == 0) goto L_0x0071
            r8 = r2
            com.google.android.apps.search.assistant.platform.j.a.cp r8 = (com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121616cp) r8     // Catch:{ all -> 0x009c }
            com.google.android.libraries.search.assistant.invocation.f.b.b.b r8 = r8.f337448e     // Catch:{ all -> 0x009c }
            r8.mo39052d()     // Catch:{ all -> 0x009c }
            r8 = r2
            com.google.android.apps.search.assistant.platform.j.a.cp r8 = (com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121616cp) r8     // Catch:{ all -> 0x009c }
            j$.util.Optional r8 = r8.f337445b     // Catch:{ all -> 0x009c }
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x009c }
            com.google.android.apps.gsa.nga.shared.ap.a.c r8 = (com.google.android.apps.gsa.nga.shared.p6328ap.p6329a.C80974c) r8     // Catch:{ all -> 0x009c }
            java.lang.String r5 = "clientId"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r5)     // Catch:{ all -> 0x009c }
            com.google.android.apps.gsa.nga.shared.b.a r5 = new com.google.android.apps.gsa.nga.shared.b.a     // Catch:{ all -> 0x009c }
            r5.<init>()     // Catch:{ all -> 0x009c }
            java.lang.String r6 = ""
            r5.mo74799g(r6)     // Catch:{ all -> 0x009c }
            r5.mo74795c()     // Catch:{ all -> 0x009c }
            com.google.android.libraries.search.assistant.invocation.o.a.b r6 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b.CLIENT_DICTATION     // Catch:{ all -> 0x009c }
            if (r1 != r6) goto L_0x0068
            r5.mo74796d()     // Catch:{ all -> 0x009c }
        L_0x0068:
            com.google.android.apps.gsa.nga.shared.b.b r8 = r8.f221977a     // Catch:{ all -> 0x009c }
            android.os.Bundle r1 = r5.mo74793a()     // Catch:{ all -> 0x009c }
            r8.mo74800a(r1)     // Catch:{ all -> 0x009c }
        L_0x0071:
            com.google.android.apps.search.assistant.platform.j.a.cp r2 = (com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121616cp) r2     // Catch:{ all -> 0x009c }
            com.google.android.libraries.search.assistant.invocation.f.b.b.b r8 = r2.f337448e     // Catch:{ all -> 0x009c }
            com.google.common.util.concurrent.cx r8 = r8.mo39049a()     // Catch:{ all -> 0x009c }
            java.lang.String r1 = "foregroundActivityIdCache.resourceFuture()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r1)     // Catch:{ all -> 0x009c }
            r4.mo63026c(r3)
            r7.f337393a = r3
            r7.f337394b = r3
            r7.f337395c = r3
            r1 = 2
            r7.f337396d = r1
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r7)
            if (r8 != r0) goto L_0x0091
            return r0
        L_0x0091:
            android.service.voice.VoiceInteractionSession$ActivityId r8 = (android.service.voice.VoiceInteractionSession.ActivityId) r8
            com.google.android.apps.search.assistant.platform.j.a.cp r0 = r7.f337397e
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.a r0 = r0.f337452i
            java.lang.String r8 = r0.mo38947a(r8)
            return r8
        L_0x009c:
            r8 = move-exception
            r4.mo63026c(r3)
            throw r8
        L_0x00a1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121602cb.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C121602cb(this.f337397e, this.f337398f, gVar);
    }
}
