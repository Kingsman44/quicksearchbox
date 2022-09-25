package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.aiai.AiAiSession$scheduleStartingTimeout$1", mo61344c = "AiAiSession.kt", mo61345d = "invokeSuspend", mo61346e = {438, 710})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.bn */
/* compiled from: PG */
final class C125223bn extends C69572j implements C69630p {

    /* renamed from: a */
    Object f345413a;

    /* renamed from: b */
    Object f345414b;

    /* renamed from: c */
    int f345415c;

    /* renamed from: d */
    final /* synthetic */ C125234by f345416d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125223bn(C125234by byVar, C69577g gVar) {
        super(2, gVar);
        this.f345416d = byVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125223bn) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.by} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.by} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.by} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (com.google.android.libraries.search.assistant.p2511d.C32559v.m60377a(r8, r7) != r0) goto L_0x0025;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040 A[Catch:{ all -> 0x0073 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r7.f345415c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0016
            if (r1 == r2) goto L_0x0012
            java.lang.Object r0 = r7.f345414b
            java.lang.Object r1 = r7.f345413a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0037
        L_0x0012:
            p5462h.C69714l.m101134b(r8)
            goto L_0x0025
        L_0x0016:
            p5462h.C69714l.m101134b(r8)
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r8 = r7.f345416d
            com.google.protobuf.ar r8 = r8.f345459e
            r7.f345415c = r2
            java.lang.Object r8 = com.google.android.libraries.search.assistant.p2511d.C32559v.m60377a(r8, r7)
            if (r8 == r0) goto L_0x0078
        L_0x0025:
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r8 = r7.f345416d
            kotlinx.coroutines.j.b r1 = r8.f345468n
            r7.f345413a = r1
            r7.f345414b = r8
            r2 = 2
            r7.f345415c = r2
            java.lang.Object r2 = r1.mo63025b(r3, r7)
            if (r2 == r0) goto L_0x0078
            r0 = r8
        L_0x0037:
            r8 = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r8 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r8     // Catch:{ all -> 0x0073 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.au r8 = r8.f345469o     // Catch:{ all -> 0x0073 }
            boolean r8 = r8 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125202at     // Catch:{ all -> 0x0073 }
            if (r8 == 0) goto L_0x006d
            com.google.common.f.e r8 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125237ca.f345479a     // Catch:{ all -> 0x0073 }
            r2 = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r2     // Catch:{ all -> 0x0073 }
            java.util.logging.Level r2 = r2.f345465k     // Catch:{ all -> 0x0073 }
            com.google.common.f.c r8 = r8.mo56223a(r2)     // Catch:{ all -> 0x0073 }
            java.lang.String r2 = "Starting SpeechRecognizer in %s timed out. [SD]"
            r4 = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r4 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r4     // Catch:{ all -> 0x0073 }
            java.lang.String r4 = r4.mo106865l()     // Catch:{ all -> 0x0073 }
            com.google.frameworks.client.a.a.b r4 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c.m206496a(r4)     // Catch:{ all -> 0x0073 }
            com.google.common.f.n r5 = new com.google.common.f.n     // Catch:{ all -> 0x0073 }
            r6 = 36454(0x8e66, float:5.1083E-41)
            r5.<init>(r6)     // Catch:{ all -> 0x0073 }
            r8.mo56379ah(r5)     // Catch:{ all -> 0x0073 }
            r8.mo56389s(r2, r4)     // Catch:{ all -> 0x0073 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.aq r8 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125199aq.f345361a     // Catch:{ all -> 0x0073 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r0     // Catch:{ all -> 0x0073 }
            r0.mo106868o(r8)     // Catch:{ all -> 0x0073 }
        L_0x006d:
            r1.mo63026c(r3)
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x0073:
            r8 = move-exception
            r1.mo63026c(r3)
            throw r8
        L_0x0078:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125223bn.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125223bn(this.f345416d, gVar);
    }
}
