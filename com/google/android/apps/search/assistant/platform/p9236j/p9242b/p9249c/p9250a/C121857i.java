package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a;

import com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2629d.C33880a;
import com.google.common.p4526f.C59071e;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.a.i */
/* compiled from: PG */
public final class C121857i implements C121851c {

    /* renamed from: b */
    private static final C59071e f338131b = C59071e.m91331h();

    /* renamed from: a */
    public final C69585o f338132a;

    /* renamed from: c */
    private final C33880a f338133c;

    public C121857i(C69585o oVar, C33880a aVar) {
        C69664n.m101061g(oVar, "backgroundContext");
        C69664n.m101061g(aVar, "runningSessionProvider");
        this.f338132a = oVar;
        this.f338133c = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.google.android.apps.search.assistant.platform.j.b.c.a.ab} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.google.android.apps.search.assistant.platform.j.b.c.a.ab} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.google.android.apps.search.assistant.platform.j.b.c.a.ab} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: com.google.android.apps.search.assistant.platform.j.b.c.a.ab} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: com.google.android.apps.search.assistant.platform.j.b.c.a.ab} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: com.google.android.apps.search.assistant.platform.j.b.c.a.ab} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: com.google.android.apps.search.assistant.platform.j.b.c.a.ab} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105401a(java.lang.String r7, com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp r8, com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121819ab r9, p5462h.p5473f.p5474a.C69630p r10, p5462h.p5466c.C69577g r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121856h
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.apps.search.assistant.platform.j.b.c.a.h r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121856h) r0
            int r1 = r0.f338130f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338130f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.a.h r0 = new com.google.android.apps.search.assistant.platform.j.b.c.a.h
            r0.<init>(r6, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f338128d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338130f
            java.lang.String r3 = "INV.ActivityStarter"
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003a
            if (r2 != r4) goto L_0x0032
            java.lang.Object r9 = r0.f338127c
            java.lang.Object r8 = r0.f338126b
            java.lang.Object r7 = r0.f338125a
            p5462h.C69714l.m101134b(r11)     // Catch:{ Exception -> 0x0030 }
            goto L_0x008a
        L_0x0030:
            r10 = move-exception
            goto L_0x0090
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            p5462h.C69714l.m101134b(r11)
            com.google.android.libraries.search.assistant.invocation.f.c.a.d.a r11 = r6.f338133c
            java.util.concurrent.atomic.AtomicReference r11 = r11.f90403a
            java.lang.Object r11 = r11.get()
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.b r11 = (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33504b) r11
            if (r11 != 0) goto L_0x0075
            com.google.common.f.e r10 = f338131b
            com.google.common.f.x r10 = r10.mo56226d()
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r11, r3)
            if (r8 == 0) goto L_0x005d
            com.google.frameworks.client.a.a.b r8 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r8)
            goto L_0x005e
        L_0x005d:
            r8 = r5
        L_0x005e:
            com.google.common.f.n r11 = new com.google.common.f.n
            r0 = 36015(0x8caf, float:5.0468E-41)
            r11.<init>(r0)
            r10.mo56379ah(r11)
            java.lang.String r11 = "%s: No active VIS for token = %s"
            r10.mo56354G(r11, r7, r8)
            com.google.android.apps.search.assistant.platform.j.b.c.a.am r7 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121830am.VIS_NOT_IN_PROGRESS
            java.lang.Object r7 = r9.mo105391a(r7, r5)
            return r7
        L_0x0075:
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ Exception -> 0x0030 }
            if (r8 == 0) goto L_0x007c
            com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r8)     // Catch:{ Exception -> 0x0030 }
        L_0x007c:
            r0.f338125a = r7     // Catch:{ Exception -> 0x0030 }
            r0.f338126b = r8     // Catch:{ Exception -> 0x0030 }
            r0.f338127c = r9     // Catch:{ Exception -> 0x0030 }
            r0.f338130f = r4     // Catch:{ Exception -> 0x0030 }
            java.lang.Object r7 = r10.mo5192a(r11, r0)     // Catch:{ Exception -> 0x0030 }
            if (r7 == r1) goto L_0x008f
        L_0x008a:
            java.lang.Object r7 = r9.mo105392b()
            return r7
        L_0x008f:
            return r1
        L_0x0090:
            com.google.common.f.e r11 = f338131b
            com.google.common.f.x r11 = r11.mo56226d()
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11.mo56378ag(r0, r3)
            com.google.common.f.x r11 = r11.mo56382g(r10)
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            if (r8 == 0) goto L_0x00ab
            com.google.android.libraries.search.assistant.invocation.o.a.bp r8 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp) r8
            com.google.frameworks.client.a.a.b r5 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r8)
        L_0x00ab:
            com.google.common.f.n r8 = new com.google.common.f.n
            r0 = 36014(0x8cae, float:5.0466E-41)
            r8.<init>(r0)
            r11.mo56379ah(r8)
            java.lang.String r8 = "%s: Failed to start activity for token = %s"
            r11.mo56354G(r8, r7, r5)
            boolean r7 = r10 instanceof java.lang.SecurityException
            if (r7 == 0) goto L_0x00c2
            com.google.android.apps.search.assistant.platform.j.b.c.a.am r7 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121830am.ANDROID_SECURITY_EXCEPTION
            goto L_0x00c4
        L_0x00c2:
            com.google.android.apps.search.assistant.platform.j.b.c.a.am r7 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121830am.UNKNOWN
        L_0x00c4:
            java.lang.String r8 = r10.getMessage()
            java.lang.Object r7 = r9.mo105391a(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121857i.mo105401a(java.lang.String, com.google.android.libraries.search.assistant.invocation.o.a.bp, com.google.android.apps.search.assistant.platform.j.b.c.a.ab, h.f.a.p, h.c.g):java.lang.Object");
    }
}
