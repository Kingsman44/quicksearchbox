package com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e.C125383ak;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.p9457c.p9459b.C125907a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125912ab;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125937z;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126294ac;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126322bc;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.common.p4526f.C59071e;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.h.g */
/* compiled from: PG */
public final class C125783g {
    @Deprecated

    /* renamed from: a */
    public static final C59071e f346660a = C59071e.m91331h();

    /* renamed from: b */
    public final C126294ac f346661b;

    /* renamed from: c */
    public final C125383ak f346662c;

    /* renamed from: d */
    public final C125774an f346663d;

    /* renamed from: e */
    public final C125912ab f346664e;

    /* renamed from: f */
    public final C125937z f346665f;

    /* renamed from: g */
    public final C125795s f346666g;

    /* renamed from: h */
    public final C71422aw f346667h;

    /* renamed from: i */
    public final C125781e f346668i = new C125781e(this);

    /* renamed from: j */
    public final C61301b f346669j;

    /* renamed from: k */
    public final C125907a f346670k;

    /* renamed from: l */
    private final C126322bc f346671l;

    /* renamed from: m */
    private final C125786j f346672m;

    /* renamed from: n */
    private final long f346673n;

    /* renamed from: o */
    private final AtomicBoolean f346674o = new AtomicBoolean(false);

    public C125783g(C125778b bVar, C126294ac acVar, C125383ak akVar, C125774an anVar, C125912ab abVar, C125937z zVar, C125795s sVar, C125907a aVar, C126322bc bcVar, C71422aw awVar, C125786j jVar) {
        C69664n.m101061g(bVar, "idSequence");
        C69664n.m101061g(acVar, "dictationStarter");
        C69664n.m101061g(akVar, "dictationManager");
        C69664n.m101061g(anVar, "keyboardEventHandler");
        C69664n.m101061g(abVar, "keyboardStateTailNotifier");
        C69664n.m101061g(zVar, "keyboardStateManager");
        C69664n.m101061g(bcVar, "assistantEvents");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(jVar, "interactionManager");
        this.f346661b = acVar;
        this.f346662c = akVar;
        this.f346663d = anVar;
        this.f346664e = abVar;
        this.f346665f = zVar;
        this.f346666g = sVar;
        this.f346670k = aVar;
        this.f346671l = bcVar;
        this.f346667h = awVar;
        this.f346672m = jVar;
        long incrementAndGet = bVar.f346649a.incrementAndGet();
        this.f346673n = incrementAndGet;
        this.f346669j = C126290c.m206496a("Interaction#" + incrementAndGet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107115a(p5462h.p5466c.C69577g r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.C125782f
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.surfaces.dictation.service.h.f r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.C125782f) r0
            int r1 = r0.f346659d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f346659d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.h.f r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.h.f
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f346657b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f346659d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r0 = r0.f346656a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0070
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0031:
            p5462h.C69714l.m101134b(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.f346674o
            r2 = 0
            boolean r7 = r7.compareAndSet(r2, r3)
            if (r7 != 0) goto L_0x0042
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            return r7
        L_0x0042:
            com.google.common.f.e r7 = f346660a
            com.google.common.f.x r7 = r7.mo56224b()
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.frameworks.client.a.a.b r2 = r6.f346669j
            com.google.common.f.n r4 = new com.google.common.f.n
            r5 = 36658(0x8f32, float:5.1369E-41)
            r4.<init>(r5)
            r7.mo56379ah(r4)
            java.lang.String r4 = "Shutting down %s [SD]"
            r7.mo56389s(r4, r2)
            com.google.android.apps.search.assistant.surfaces.dictation.service.e.ak r7 = r6.f346662c
            com.google.android.apps.search.assistant.libraries.dictation.b.s r2 = com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119297s.REQUESTER_CONNECTION_SHUTDOWN
            com.google.common.util.concurrent.cx r7 = r7.mo106950b(r2)
            r0.f346656a = r6
            r0.f346659d = r3
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)
            if (r7 != r1) goto L_0x006f
            return r1
        L_0x006f:
            r0 = r6
        L_0x0070:
            r7 = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.h.g r7 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.C125783g) r7
            com.google.android.apps.search.assistant.surfaces.dictation.service.s.bc r1 = r7.f346671l
            r1.mo107531a()
            com.google.android.apps.search.assistant.surfaces.dictation.service.h.j r1 = r7.f346672m
            java.lang.String r2 = "interaction"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r2)
            kotlinx.coroutines.b.cy r1 = r1.f346685d
            r2 = 0
            boolean r0 = r1.mo62808g(r0, r2)
            if (r0 == 0) goto L_0x00a3
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.C125786j.f346682a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.frameworks.client.a.a.b r1 = r7.f346669j
            com.google.common.f.n r2 = new com.google.common.f.n
            r4 = 36662(0x8f36, float:5.1374E-41)
            r2.<init>(r4)
            r0.mo56379ah(r2)
            java.lang.String r2 = "Forgetting %s [SD]"
            r0.mo56389s(r2, r1)
            goto L_0x00bd
        L_0x00a3:
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.C125786j.f346682a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.frameworks.client.a.a.b r1 = r7.f346669j
            com.google.common.f.n r2 = new com.google.common.f.n
            r4 = 36661(0x8f35, float:5.1373E-41)
            r2.<init>(r4)
            r0.mo56379ah(r2)
            java.lang.String r2 = "Not forgetting %s. Likely it was already forgotten [SD]"
            r0.mo56389s(r2, r1)
        L_0x00bd:
            com.google.android.apps.search.assistant.surfaces.dictation.service.m.ab r7 = r7.f346664e
            com.google.android.apps.search.assistant.surfaces.dictation.service.b.f r7 = r7.f347006c
            kotlinx.coroutines.z r7 = r7.f345605a
            h.q r0 = p5462h.C69788q.f186170a
            r7.mo62909P(r0)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.C125783g.mo107115a(h.c.g):java.lang.Object");
    }

    public final String toString() {
        long j = this.f346673n;
        return "Interaction#" + j;
    }
}
