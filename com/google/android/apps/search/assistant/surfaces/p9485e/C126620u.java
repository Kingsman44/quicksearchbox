package com.google.android.apps.search.assistant.surfaces.p9485e;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.VoiceSearchGrpcImpl$Connection$interaction$2", mo61344c = "VoiceSearchGrpcImpl.kt", mo61345d = "invokeSuspend", mo61346e = {193})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.u */
/* compiled from: PG */
final class C126620u extends C69572j implements C69630p {

    /* renamed from: a */
    Object f348691a;

    /* renamed from: b */
    Object f348692b;

    /* renamed from: c */
    int f348693c;

    /* renamed from: d */
    final /* synthetic */ C126621v f348694d;

    /* renamed from: e */
    private /* synthetic */ Object f348695e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126620u(C126621v vVar, C69577g gVar) {
        super(2, gVar);
        this.f348694d = vVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126620u) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: kotlinx.coroutines.a.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlinx.coroutines.be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: kotlinx.coroutines.aw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: kotlinx.coroutines.a.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: kotlinx.coroutines.a.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: kotlinx.coroutines.be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: kotlinx.coroutines.be} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r13) {
        /*
            r12 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r12.f348693c
            java.lang.String r2 = "scope"
            r3 = 3
            r4 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.Object r0 = r12.f348692b
            java.lang.Object r1 = r12.f348691a
            java.lang.Object r5 = r12.f348695e
            kotlinx.coroutines.aw r5 = (kotlinx.coroutines.C71422aw) r5
            p5462h.C69714l.m101134b(r13)
            r8 = r0
            r0 = r5
            goto L_0x0077
        L_0x0018:
            p5462h.C69714l.m101134b(r13)
            java.lang.Object r13 = r12.f348695e
            r5 = r13
            kotlinx.coroutines.aw r5 = (kotlinx.coroutines.C71422aw) r5
            com.google.android.apps.search.assistant.surfaces.e.v r13 = r12.f348694d
            io.grpc.i.aj r13 = r13.f348696a
            com.google.android.apps.search.assistant.surfaces.e.a r1 = com.google.android.apps.search.assistant.surfaces.p9485e.C126624y.f348714a
            com.google.android.apps.search.assistant.surfaces.e.q r1 = new com.google.android.apps.search.assistant.surfaces.e.q
            com.google.android.apps.search.assistant.surfaces.e.v r6 = r12.f348694d
            r1.<init>(r6)
            com.google.android.libraries.assistant.o.bt r6 = com.google.android.libraries.assistant.p1533o.C18484bt.f52419c
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.assistant.o.bs r6 = (com.google.android.libraries.assistant.p1533o.C18483bs) r6
            java.lang.String r7 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            r1.mo5761a(r6)
            com.google.protobuf.bv r1 = r6.build()
            java.lang.String r6 = "newBuilder().apply(block).build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r6)
            com.google.android.libraries.assistant.o.bt r1 = (com.google.android.libraries.assistant.p1533o.C18484bt) r1
            r13.mo20123c(r1)
            com.google.android.apps.search.assistant.surfaces.e.v r13 = r12.f348694d
            com.google.android.apps.search.assistant.surfaces.e.a.j r13 = r13.f348699d
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r2)
            com.google.android.apps.search.assistant.surfaces.e.a.i r1 = new com.google.android.apps.search.assistant.surfaces.e.a.i
            r1.<init>(r13, r5, r4)
            kotlinx.coroutines.be r1 = kotlinx.coroutines.C71803m.m105042c(r5, r4, r4, r1, r3)
            r13 = 0
            r6 = 7
            kotlinx.coroutines.a.v r13 = kotlinx.coroutines.p5573a.C71392y.m104158a(r13, r4, r6)
            com.google.android.apps.search.assistant.surfaces.e.v r6 = r12.f348694d
            kotlinx.coroutines.z r6 = r6.f348705j
            r12.f348695e = r5
            r12.f348691a = r1
            r12.f348692b = r13
            r7 = 1
            r12.f348693c = r7
            java.lang.Object r6 = r6.mo62825a(r12)
            if (r6 == r0) goto L_0x00b9
            r8 = r13
            r0 = r5
            r13 = r6
        L_0x0077:
            r9 = r13
            com.google.android.libraries.assistant.o.aw r9 = (com.google.android.libraries.assistant.p1533o.C18460aw) r9
            com.google.android.apps.search.assistant.surfaces.e.v r13 = r12.f348694d
            com.google.android.apps.search.assistant.surfaces.e.a.w r13 = r13.f348700e
            com.google.android.apps.search.assistant.surfaces.e.a.ae r5 = com.google.android.apps.search.assistant.surfaces.p9485e.C126624y.f348715b
            java.lang.String r6 = "config"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r6)
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r2)
            com.google.android.apps.search.assistant.surfaces.e.a.v r2 = new com.google.android.apps.search.assistant.surfaces.e.a.v
            r2.<init>(r13, r5, r0, r4)
            kotlinx.coroutines.be r7 = kotlinx.coroutines.C71803m.m105042c(r0, r4, r4, r2, r3)
            com.google.android.apps.search.assistant.surfaces.e.r r13 = new com.google.android.apps.search.assistant.surfaces.e.r
            com.google.android.apps.search.assistant.surfaces.e.v r2 = r12.f348694d
            r13.<init>(r2, r7, r8, r4)
            kotlinx.coroutines.C71803m.m105043d(r0, r4, r4, r13, r3)
            com.google.android.apps.search.assistant.surfaces.e.s r13 = new com.google.android.apps.search.assistant.surfaces.e.s
            com.google.android.apps.search.assistant.surfaces.e.v r6 = r12.f348694d
            r11 = 0
            r5 = r13
            r10 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            kotlinx.coroutines.C71803m.m105043d(r0, r4, r4, r13, r3)
            com.google.android.apps.search.assistant.surfaces.e.v r13 = r12.f348694d
            boolean r13 = r13.f348698c
            if (r13 == 0) goto L_0x00b6
            com.google.android.apps.search.assistant.surfaces.e.t r13 = new com.google.android.apps.search.assistant.surfaces.e.t
            r13.<init>(r1, r4)
            kotlinx.coroutines.C71803m.m105043d(r0, r4, r4, r13, r3)
        L_0x00b6:
            h.q r13 = p5462h.C69788q.f186170a
            return r13
        L_0x00b9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.p9485e.C126620u.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C126620u uVar = new C126620u(this.f348694d, gVar);
        uVar.f348695e = obj;
        return uVar;
    }
}
