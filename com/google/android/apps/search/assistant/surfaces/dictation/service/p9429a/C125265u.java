package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import java.util.LinkedList;
import java.util.Queue;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.u */
/* compiled from: PG */
public final class C125265u {

    /* renamed from: a */
    private final C71422aw f345577a;

    /* renamed from: b */
    private final C71788b f345578b = new C71799m();

    /* renamed from: c */
    private C125234by f345579c;

    /* renamed from: d */
    private final Queue f345580d = new LinkedList();

    public C125265u(C71422aw awVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        this.f345577a = awVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.by} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.by} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056 A[Catch:{ all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo106888a(com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125259o
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.o r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125259o) r0
            int r1 = r0.f345555f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f345555f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.o r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.o
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f345553d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f345555f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r6 = r0.f345552c
            java.lang.Object r1 = r0.f345551b
            java.lang.Object r0 = r0.f345550a
            p5462h.C69714l.m101134b(r7)
            r7 = r6
            r6 = r1
            goto L_0x004c
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            p5462h.C69714l.m101134b(r7)
            kotlinx.coroutines.j.b r7 = r5.f345578b
            r0.f345550a = r5
            r0.f345551b = r6
            r0.f345552c = r7
            r0.f345555f = r3
            java.lang.Object r0 = r7.mo63025b(r4, r0)
            if (r0 == r1) goto L_0x0083
            r0 = r5
        L_0x004c:
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.u r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125265u) r0     // Catch:{ all -> 0x007e }
            java.util.Queue r0 = r0.f345580d     // Catch:{ all -> 0x007e }
            boolean r0 = r0.remove(r6)     // Catch:{ all -> 0x007e }
            if (r0 != 0) goto L_0x0078
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125266v.f345581a     // Catch:{ all -> 0x007e }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x007e }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x007e }
            java.lang.String r1 = "Tried to remove session that is not in queue: %s [SD]"
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r6 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r6     // Catch:{ all -> 0x007e }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x007e }
            com.google.frameworks.client.a.a.b r6 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c.m206496a(r6)     // Catch:{ all -> 0x007e }
            com.google.common.f.n r2 = new com.google.common.f.n     // Catch:{ all -> 0x007e }
            r3 = 36436(0x8e54, float:5.1058E-41)
            r2.<init>(r3)     // Catch:{ all -> 0x007e }
            r0.mo56379ah(r2)     // Catch:{ all -> 0x007e }
            r0.mo56389s(r1, r6)     // Catch:{ all -> 0x007e }
        L_0x0078:
            r7.mo63026c(r4)
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x007e:
            r6 = move-exception
            r7.mo63026c(r4)
            throw r6
        L_0x0083:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125265u.mo106888a(com.google.android.apps.search.assistant.surfaces.dictation.service.a.by, h.c.g):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.by} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.by} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.u} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo106889b(com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125260p
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.p r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125260p) r0
            int r1 = r0.f345561f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f345561f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.p r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.p
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f345559d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f345561f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r6 = r0.f345558c
            java.lang.Object r1 = r0.f345557b
            java.lang.Object r0 = r0.f345556a
            p5462h.C69714l.m101134b(r7)
            r7 = r6
            r6 = r1
            goto L_0x004c
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            p5462h.C69714l.m101134b(r7)
            kotlinx.coroutines.j.b r7 = r5.f345578b
            r0.f345556a = r5
            r0.f345557b = r6
            r0.f345558c = r7
            r0.f345561f = r3
            java.lang.Object r0 = r7.mo63025b(r4, r0)
            if (r0 == r1) goto L_0x006c
            r0 = r5
        L_0x004c:
            r1 = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.u r1 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125265u) r1     // Catch:{ all -> 0x0067 }
            java.util.Queue r1 = r1.f345580d     // Catch:{ all -> 0x0067 }
            r1.add(r6)     // Catch:{ all -> 0x0067 }
            r7.mo63026c(r4)
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.u r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125265u) r0
            kotlinx.coroutines.aw r6 = r0.f345577a
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.q r7 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.q
            r7.<init>(r0, r4)
            r0 = 3
            kotlinx.coroutines.C71803m.m105043d(r6, r4, r4, r7, r0)
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x0067:
            r6 = move-exception
            r7.mo63026c(r4)
            throw r6
        L_0x006c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125265u.mo106889b(com.google.android.apps.search.assistant.surfaces.dictation.service.a.by, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.by} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.by} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.u} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057 A[Catch:{ all -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007f A[SYNTHETIC, Splitter:B:22:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo106890c(com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125262r
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.r r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125262r) r0
            int r1 = r0.f345569f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f345569f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.r r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.r
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f345567d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f345569f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r7 = r0.f345566c
            java.lang.Object r1 = r0.f345565b
            java.lang.Object r0 = r0.f345564a
            p5462h.C69714l.m101134b(r8)
            r8 = r7
            r7 = r1
            goto L_0x004c
        L_0x0030:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0038:
            p5462h.C69714l.m101134b(r8)
            kotlinx.coroutines.j.b r8 = r6.f345578b
            r0.f345564a = r6
            r0.f345565b = r7
            r0.f345566c = r8
            r0.f345569f = r3
            java.lang.Object r0 = r8.mo63025b(r4, r0)
            if (r0 == r1) goto L_0x00be
            r0 = r6
        L_0x004c:
            r1 = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.u r1 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125265u) r1     // Catch:{ all -> 0x00b9 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r1 = r1.f345579c     // Catch:{ all -> 0x00b9 }
            boolean r1 = p5462h.p5473f.p5475b.C69664n.m101066l(r1, r7)     // Catch:{ all -> 0x00b9 }
            if (r1 != 0) goto L_0x007f
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125266v.f345581a     // Catch:{ all -> 0x00b9 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x00b9 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x00b9 }
            java.lang.String r1 = "onSessionFinished: session is not the current one: %s[SD]"
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r7 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r7     // Catch:{ all -> 0x00b9 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00b9 }
            com.google.frameworks.client.a.a.b r7 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c.m206496a(r7)     // Catch:{ all -> 0x00b9 }
            com.google.common.f.n r2 = new com.google.common.f.n     // Catch:{ all -> 0x00b9 }
            r3 = 36438(0x8e56, float:5.106E-41)
            r2.<init>(r3)     // Catch:{ all -> 0x00b9 }
            r0.mo56379ah(r2)     // Catch:{ all -> 0x00b9 }
            r0.mo56389s(r1, r7)     // Catch:{ all -> 0x00b9 }
            h.q r7 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x00b9 }
            r8.mo63026c(r4)
            return r7
        L_0x007f:
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125266v.f345581a     // Catch:{ all -> 0x00b9 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x00b9 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00b9 }
            java.lang.String r2 = "onSessionFinished: Remove %s from currentSession. [SD]"
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r7 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r7     // Catch:{ all -> 0x00b9 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00b9 }
            com.google.frameworks.client.a.a.b r7 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c.m206496a(r7)     // Catch:{ all -> 0x00b9 }
            com.google.common.f.n r3 = new com.google.common.f.n     // Catch:{ all -> 0x00b9 }
            r5 = 36437(0x8e55, float:5.1059E-41)
            r3.<init>(r5)     // Catch:{ all -> 0x00b9 }
            r1.mo56379ah(r3)     // Catch:{ all -> 0x00b9 }
            r1.mo56389s(r2, r7)     // Catch:{ all -> 0x00b9 }
            r7 = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.u r7 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125265u) r7     // Catch:{ all -> 0x00b9 }
            r7.f345579c = r4     // Catch:{ all -> 0x00b9 }
            r8.mo63026c(r4)
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.u r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125265u) r0
            kotlinx.coroutines.aw r7 = r0.f345577a
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.s r8 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.s
            r8.<init>(r0, r4)
            r0 = 3
            kotlinx.coroutines.C71803m.m105043d(r7, r4, r4, r8, r0)
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        L_0x00b9:
            r7 = move-exception
            r8.mo63026c(r4)
            throw r7
        L_0x00be:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125265u.mo106890c(com.google.android.apps.search.assistant.surfaces.dictation.service.a.by, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.u} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055 A[Catch:{ all -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo106891d(p5462h.p5466c.C69577g r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125264t
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.t r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125264t) r0
            int r1 = r0.f345576e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f345576e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.t r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.t
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f345574c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f345576e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            p5462h.C69714l.m101134b(r12)
            goto L_0x00da
        L_0x002c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0034:
            java.lang.Object r2 = r0.f345573b
            java.lang.Object r4 = r0.f345572a
            p5462h.C69714l.m101134b(r12)
            goto L_0x004e
        L_0x003c:
            p5462h.C69714l.m101134b(r12)
            kotlinx.coroutines.j.b r2 = r11.f345578b
            r0.f345572a = r11
            r0.f345573b = r2
            r0.f345576e = r4
            java.lang.Object r12 = r2.mo63025b(r5, r0)
            if (r12 == r1) goto L_0x00e2
            r4 = r11
        L_0x004e:
            r12 = r4
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.u r12 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125265u) r12     // Catch:{ all -> 0x00dd }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r12 = r12.f345579c     // Catch:{ all -> 0x00dd }
            if (r12 == 0) goto L_0x007b
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125266v.f345581a     // Catch:{ all -> 0x00dd }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x00dd }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = "Current session exists: %s. Will try again when current session is finished. [SD]"
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x00dd }
            com.google.frameworks.client.a.a.b r12 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c.m206496a(r12)     // Catch:{ all -> 0x00dd }
            com.google.common.f.n r3 = new com.google.common.f.n     // Catch:{ all -> 0x00dd }
            r4 = 36441(0x8e59, float:5.1065E-41)
            r3.<init>(r4)     // Catch:{ all -> 0x00dd }
            r0.mo56379ah(r3)     // Catch:{ all -> 0x00dd }
            r0.mo56389s(r1, r12)     // Catch:{ all -> 0x00dd }
            h.q r12 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x00dd }
            r2.mo63026c(r5)
            return r12
        L_0x007b:
            r12 = r4
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.u r12 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125265u) r12     // Catch:{ all -> 0x00dd }
            java.util.Queue r12 = r12.f345580d     // Catch:{ all -> 0x00dd }
            java.lang.Object r12 = r12.poll()     // Catch:{ all -> 0x00dd }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r12 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r12     // Catch:{ all -> 0x00dd }
            if (r12 != 0) goto L_0x00a6
            com.google.common.f.e r12 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125266v.f345581a     // Catch:{ all -> 0x00dd }
            com.google.common.f.x r12 = r12.mo56224b()     // Catch:{ all -> 0x00dd }
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = "No next session to start. [SD]"
            com.google.common.f.n r1 = new com.google.common.f.n     // Catch:{ all -> 0x00dd }
            r3 = 36440(0x8e58, float:5.1063E-41)
            r1.<init>(r3)     // Catch:{ all -> 0x00dd }
            r12.mo56379ah(r1)     // Catch:{ all -> 0x00dd }
            r12.mo56386p(r0)     // Catch:{ all -> 0x00dd }
            h.q r12 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x00dd }
            r2.mo63026c(r5)
            return r12
        L_0x00a6:
            com.google.common.f.e r6 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125266v.f345581a     // Catch:{ all -> 0x00dd }
            com.google.common.f.x r6 = r6.mo56224b()     // Catch:{ all -> 0x00dd }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x00dd }
            java.lang.String r7 = "Starting %s [SD]"
            java.lang.String r8 = r12.toString()     // Catch:{ all -> 0x00dd }
            com.google.frameworks.client.a.a.b r8 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c.m206496a(r8)     // Catch:{ all -> 0x00dd }
            com.google.common.f.n r9 = new com.google.common.f.n     // Catch:{ all -> 0x00dd }
            r10 = 36439(0x8e57, float:5.1062E-41)
            r9.<init>(r10)     // Catch:{ all -> 0x00dd }
            r6.mo56379ah(r9)     // Catch:{ all -> 0x00dd }
            r6.mo56389s(r7, r8)     // Catch:{ all -> 0x00dd }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.u r4 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125265u) r4     // Catch:{ all -> 0x00dd }
            r4.f345579c = r12     // Catch:{ all -> 0x00dd }
            r2.mo63026c(r5)
            r0.f345572a = r5
            r0.f345573b = r5
            r0.f345576e = r3
            java.lang.Object r12 = r12.mo106864k(r0)
            if (r12 != r1) goto L_0x00da
            return r1
        L_0x00da:
            h.q r12 = p5462h.C69788q.f186170a
            return r12
        L_0x00dd:
            r12 = move-exception
            r2.mo63026c(r5)
            throw r12
        L_0x00e2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125265u.mo106891d(h.c.g):java.lang.Object");
    }
}
