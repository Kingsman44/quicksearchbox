package com.google.android.apps.search.assistant.surfaces.dictation.service.p9473o;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125185ac;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.C125786j;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.p9455b.C125901h;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126317az;
import com.google.common.util.concurrent.C60888db;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.o.h */
/* compiled from: PG */
public final class C126170h {

    /* renamed from: a */
    public static final Duration f347661a = Duration.ofSeconds(20);

    /* renamed from: d */
    private static final Duration f347662d = Duration.ofSeconds(1);

    /* renamed from: b */
    public final C125901h f347663b;

    /* renamed from: c */
    public final C71422aw f347664c;

    /* renamed from: e */
    private final C125185ac f347665e;

    /* renamed from: f */
    private final C125786j f347666f;

    /* renamed from: g */
    private final C60888db f347667g;

    /* renamed from: h */
    private final C126317az f347668h;

    public C126170h(C125185ac acVar, C125901h hVar, C125786j jVar, C60888db dbVar, C71422aw awVar) {
        C69664n.m101061g(hVar, "globalState");
        C69664n.m101061g(jVar, "interactionManager");
        C69664n.m101061g(dbVar, "lightweightExecutor");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f347665e = acVar;
        this.f347663b = hVar;
        this.f347666f = jVar;
        this.f347667g = dbVar;
        this.f347664c = awVar;
        this.f347668h = new C126317az(f347662d, new C126165c(this), dbVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.util.Set} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107391a(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9473o.C126163a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.assistant.surfaces.dictation.service.o.a r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9473o.C126163a) r0
            int r1 = r0.f347643e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f347643e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.o.a r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.o.a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f347641c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f347643e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r1 = r0.f347640b
            java.lang.Object r0 = r0.f347639a
            p5462h.C69714l.m101134b(r6)
            goto L_0x0075
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0036:
            java.lang.Object r2 = r0.f347639a
            p5462h.C69714l.m101134b(r6)
            goto L_0x004c
        L_0x003c:
            p5462h.C69714l.m101134b(r6)
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.ac r6 = r5.f347665e
            r0.f347639a = r5
            r0.f347643e = r4
            java.lang.Object r6 = r6.mo106823a(r0)
            if (r6 == r1) goto L_0x00a0
            r2 = r5
        L_0x004c:
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.cc r6 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125239cc) r6
            java.util.Set r6 = r6.f345488c
            r4 = r2
            com.google.android.apps.search.assistant.surfaces.dictation.service.o.h r4 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9473o.C126170h) r4
            com.google.android.apps.search.assistant.surfaces.dictation.service.h.j r4 = r4.f347666f
            com.google.android.apps.search.assistant.surfaces.dictation.service.h.g r4 = r4.mo107117a()
            if (r4 == 0) goto L_0x0079
            r0.f347639a = r2
            r0.f347640b = r6
            r0.f347643e = r3
            com.google.android.apps.search.assistant.surfaces.dictation.service.h.s r3 = r4.f346666g
            com.google.common.util.concurrent.cx r3 = r3.mo107118a()
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r3, r0)
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            if (r0 == r3) goto L_0x0071
            h.q r0 = p5462h.C69788q.f186170a
        L_0x0071:
            if (r0 == r1) goto L_0x0078
            r1 = r6
            r0 = r2
        L_0x0075:
            r2 = r0
            r6 = r1
            goto L_0x0079
        L_0x0078:
            return r1
        L_0x0079:
            com.google.android.apps.search.assistant.surfaces.dictation.service.o.h r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9473o.C126170h) r2
            com.google.android.apps.search.assistant.surfaces.dictation.service.l.b.h r0 = r2.f347663b
            java.util.concurrent.atomic.AtomicReference r0 = r0.f346979b
            java.lang.Object r0 = r0.get()
            com.google.android.apps.search.assistant.surfaces.dictation.service.l.b.a r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.p9455b.C125892a) r0
            java.util.Map r0 = r0.f346963d
            java.util.Set r0 = r0.keySet()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0092
            goto L_0x0098
        L_0x0092:
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x009d
        L_0x0098:
            com.google.android.apps.search.assistant.surfaces.dictation.service.s.az r6 = r2.f347668h
            r6.mo107528a()
        L_0x009d:
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x00a0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9473o.C126170h.mo107391a(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107392b(java.lang.String r5, p5462h.p5466c.C69577g r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9473o.C126166d
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.assistant.surfaces.dictation.service.o.d r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9473o.C126166d) r0
            int r1 = r0.f347651e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f347651e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.o.d r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.o.d
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f347649c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f347651e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.f347648b
            java.lang.Object r0 = r0.f347647a
            p5462h.C69714l.m101134b(r6)
            goto L_0x0045
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            p5462h.C69714l.m101134b(r6)
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.ac r6 = r4.f347665e
            r0.f347647a = r4
            r0.f347648b = r5
            r0.f347651e = r3
            java.lang.Object r6 = r6.mo106824b(r5, r0)
            if (r6 == r1) goto L_0x0079
            r0 = r4
        L_0x0045:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            com.google.android.apps.search.assistant.surfaces.dictation.service.o.h r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9473o.C126170h) r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.l.b.h r1 = r0.f347663b
            java.lang.String r2 = "languageTag"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r2)
            com.google.android.apps.search.assistant.surfaces.dictation.service.l.b.b r2 = new com.google.android.apps.search.assistant.surfaces.dictation.service.l.b.b
            java.lang.String r5 = (java.lang.String) r5
            r2.<init>(r5)
            r1.mo107157b(r2)
            kotlinx.coroutines.aw r1 = r0.f347664c
            com.google.android.apps.search.assistant.surfaces.dictation.service.o.e r2 = new com.google.android.apps.search.assistant.surfaces.dictation.service.o.e
            r3 = 0
            r2.<init>(r0, r5, r3)
            r5 = 3
            kotlinx.coroutines.C71803m.m105043d(r1, r3, r3, r2, r5)
            kotlinx.coroutines.aw r1 = r0.f347664c
            com.google.android.apps.search.assistant.surfaces.dictation.service.o.f r2 = new com.google.android.apps.search.assistant.surfaces.dictation.service.o.f
            r2.<init>(r0, r3)
            kotlinx.coroutines.C71803m.m105043d(r1, r3, r3, r2, r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            return r5
        L_0x0079:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9473o.C126170h.mo107392b(java.lang.String, h.c.g):java.lang.Object");
    }
}
