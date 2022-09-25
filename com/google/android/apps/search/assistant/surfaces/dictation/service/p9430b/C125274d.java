package com.google.android.apps.search.assistant.surfaces.dictation.service.p9430b;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.async.AsyncStreamObserver$schedule$1", mo61344c = "AsyncStreamObserver.kt", mo61345d = "invokeSuspend", mo61346e = {62, 48})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.b.d */
/* compiled from: PG */
final class C125274d extends C69572j implements C69630p {

    /* renamed from: a */
    Object f345595a;

    /* renamed from: b */
    Object f345596b;

    /* renamed from: c */
    Object f345597c;

    /* renamed from: d */
    int f345598d;

    /* renamed from: e */
    final /* synthetic */ C125275e f345599e;

    /* renamed from: f */
    final /* synthetic */ C69626l f345600f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125274d(C125275e eVar, C69626l lVar, C69577g gVar) {
        super(2, gVar);
        this.f345599e = eVar;
        this.f345600f = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125274d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r6.f345598d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x002a
            if (r1 == r2) goto L_0x001c
            java.lang.Object r0 = r6.f345597c
            h.f.a.l r0 = (p5462h.p5473f.p5474a.C69626l) r0
            java.lang.Object r1 = r6.f345596b
            com.google.android.apps.search.assistant.surfaces.dictation.service.b.e r1 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9430b.C125275e) r1
            java.lang.Object r2 = r6.f345595a
            p5462h.C69714l.m101134b(r7)     // Catch:{ Exception -> 0x001a }
            goto L_0x0057
        L_0x0018:
            r7 = move-exception
            goto L_0x006c
        L_0x001a:
            r7 = move-exception
            goto L_0x0061
        L_0x001c:
            java.lang.Object r1 = r6.f345597c
            com.google.android.apps.search.assistant.surfaces.dictation.service.b.e r1 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9430b.C125275e) r1
            java.lang.Object r2 = r6.f345596b
            h.f.a.l r2 = (p5462h.p5473f.p5474a.C69626l) r2
            java.lang.Object r4 = r6.f345595a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0044
        L_0x002a:
            p5462h.C69714l.m101134b(r7)
            com.google.android.apps.search.assistant.surfaces.dictation.service.b.e r7 = r6.f345599e
            kotlinx.coroutines.j.b r1 = r7.f345603c
            h.f.a.l r4 = r6.f345600f
            r6.f345595a = r1
            r6.f345596b = r4
            r6.f345597c = r7
            r6.f345598d = r2
            java.lang.Object r2 = r1.mo63025b(r3, r6)
            if (r2 == r0) goto L_0x0070
            r2 = r4
            r4 = r1
            r1 = r7
        L_0x0044:
            kotlinx.coroutines.be r7 = r1.f345601a     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            r6.f345595a = r4     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            r6.f345596b = r1     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            r6.f345597c = r2     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            r5 = 2
            r6.f345598d = r5     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            java.lang.Object r7 = r7.mo62825a(r6)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            if (r7 == r0) goto L_0x005b
            r0 = r2
            r2 = r4
        L_0x0057:
            r0.mo5761a(r7)     // Catch:{ Exception -> 0x001a }
            goto L_0x0066
        L_0x005b:
            return r0
        L_0x005c:
            r7 = move-exception
            r2 = r4
            goto L_0x006c
        L_0x005f:
            r7 = move-exception
            r2 = r4
        L_0x0061:
            j$.util.function.Consumer r0 = r1.f345602b     // Catch:{ all -> 0x0018 }
            r0.accept(r7)     // Catch:{ all -> 0x0018 }
        L_0x0066:
            r2.mo63026c(r3)
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        L_0x006c:
            r2.mo63026c(r3)
            throw r7
        L_0x0070:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9430b.C125274d.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125274d(this.f345599e, this.f345600f, gVar);
    }
}
