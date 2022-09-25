package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a;

import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121899ay;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33733c;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5574b.C71521by;
import kotlinx.coroutines.p5574b.C71547cx;
import kotlinx.coroutines.p5574b.C71553dc;
import kotlinx.coroutines.p5574b.C71557dg;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.a.o */
/* compiled from: PG */
public final class C121738o implements C33733c {

    /* renamed from: g */
    private static final C59071e f337801g = C59071e.m91331h();

    /* renamed from: a */
    public final C33514d f337802a;

    /* renamed from: b */
    public final boolean f337803b;

    /* renamed from: c */
    public final boolean f337804c;

    /* renamed from: d */
    public final boolean f337805d;

    /* renamed from: e */
    public final C71547cx f337806e;

    /* renamed from: f */
    public final C71553dc f337807f;

    /* renamed from: h */
    private final C121899ay f337808h;

    /* renamed from: i */
    private final C34053bp f337809i;

    /* renamed from: j */
    private final String f337810j = "AssistDataResource";

    public C121738o(C121899ay ayVar, C34053bp bpVar, C33514d dVar, boolean z, boolean z2, boolean z3) {
        C69664n.m101061g(ayVar, "assistDataInternalProvider");
        C69664n.m101061g(bpVar, "invocationToken");
        this.f337808h = ayVar;
        this.f337809i = bpVar;
        this.f337802a = dVar;
        this.f337803b = z;
        this.f337804c = z2;
        this.f337805d = z3;
        C71547cx e = C71557dg.m104447e(0, 2, (C71387t) null, 5);
        this.f337806e = e;
        this.f337807f = C71521by.m104363a(e);
    }

    /* renamed from: a */
    public final Object mo39054a(C69577g gVar) {
        return C69788q.f186170a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0080 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39055b(p5462h.p5466c.C69577g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a.C121735l
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.platform.j.b.b.a.l r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a.C121735l) r0
            int r1 = r0.f337789d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f337789d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.b.a.l r0 = new com.google.android.apps.search.assistant.platform.j.b.b.a.l
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f337787b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f337789d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0081
        L_0x002a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0032:
            java.lang.Object r2 = r0.f337786a
            p5462h.C69714l.m101134b(r8)
            goto L_0x006f
        L_0x0038:
            p5462h.C69714l.m101134b(r8)
            com.google.common.f.e r8 = f337801g
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "INV.AssistData"
            r8.mo56378ag(r2, r5)
            com.google.android.libraries.search.assistant.invocation.o.a.bp r2 = r7.f337809i
            com.google.frameworks.client.a.a.b r2 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r2)
            com.google.common.f.n r5 = new com.google.common.f.n
            r6 = 35935(0x8c5f, float:5.0356E-41)
            r5.<init>(r6)
            r8.mo56379ah(r5)
            java.lang.String r5 = "Releasing AssistDataResource for token(%s)."
            r8.mo56389s(r5, r2)
            com.google.android.apps.search.assistant.platform.j.b.c.ay r8 = r7.f337808h
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r2 = r7.f337802a
            r0.f337786a = r7
            r0.f337789d = r4
            java.lang.Object r8 = r8.mo105419u(r2, r0)
            if (r8 == r1) goto L_0x0084
            r2 = r7
        L_0x006f:
            com.google.android.apps.search.assistant.platform.j.b.b.a.o r2 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a.C121738o) r2
            kotlinx.coroutines.b.cx r8 = r2.f337806e
            com.google.android.apps.search.assistant.platform.j.b.b.a.g r2 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a.C121730g.f337777a
            r4 = 0
            r0.f337786a = r4
            r0.f337789d = r3
            java.lang.Object r8 = r8.mo20883a(r2, r0)
            if (r8 != r1) goto L_0x0081
            return r1
        L_0x0081:
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x0084:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a.C121738o.mo39055b(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: com.google.android.apps.search.assistant.platform.j.b.b.a.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: h.f.a.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105336c(boolean r17, java.lang.String r18, p5462h.p5473f.p5474a.C69631q r19, p5462h.p5466c.C69577g r20) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            r2 = r20
            boolean r3 = r2 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a.C121736m
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.google.android.apps.search.assistant.platform.j.b.b.a.m r3 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a.C121736m) r3
            int r4 = r3.f337796g
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f337796g = r4
            goto L_0x001e
        L_0x0019:
            com.google.android.apps.search.assistant.platform.j.b.b.a.m r3 = new com.google.android.apps.search.assistant.platform.j.b.b.a.m
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f337794e
            h.c.a.a r4 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r5 = r3.f337796g
            java.lang.String r6 = ")"
            r7 = 5
            r8 = 4
            r9 = 3
            r10 = 2
            r11 = 1
            r12 = 0
            if (r5 == 0) goto L_0x008d
            if (r5 == r11) goto L_0x0085
            if (r5 == r10) goto L_0x0072
            if (r5 == r9) goto L_0x0061
            if (r5 == r8) goto L_0x004d
            if (r5 == r7) goto L_0x0040
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0040:
            java.lang.Object r0 = r3.f337792c
            com.google.android.apps.search.assistant.platform.j.b.c.av r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121896av) r0
            java.lang.Object r4 = r3.f337791b
            java.lang.Object r3 = r3.f337790a
            p5462h.C69714l.m101134b(r2)
            goto L_0x015a
        L_0x004d:
            java.lang.Object r0 = r3.f337793d
            java.lang.Object r5 = r3.f337792c
            h.f.a.p r5 = (p5462h.p5473f.p5474a.C69630p) r5
            java.lang.Object r8 = r3.f337791b
            java.lang.Object r9 = r3.f337790a
            p5462h.C69714l.m101134b(r2)     // Catch:{ av -> 0x005c }
            goto L_0x013f
        L_0x005c:
            r0 = move-exception
            r10 = r9
            r9 = r8
            goto L_0x0144
        L_0x0061:
            java.lang.Object r0 = r3.f337792c
            r5 = r0
            h.f.a.p r5 = (p5462h.p5473f.p5474a.C69630p) r5
            java.lang.Object r9 = r3.f337791b
            java.lang.Object r10 = r3.f337790a
            p5462h.C69714l.m101134b(r2)     // Catch:{ av -> 0x006f }
            goto L_0x012c
        L_0x006f:
            r0 = move-exception
            goto L_0x0144
        L_0x0072:
            java.lang.Object r0 = r3.f337793d
            h.f.a.p r0 = (p5462h.p5473f.p5474a.C69630p) r0
            java.lang.Object r5 = r3.f337792c
            h.f.a.q r5 = (p5462h.p5473f.p5474a.C69631q) r5
            java.lang.Object r10 = r3.f337791b
            java.lang.Object r11 = r3.f337790a
            p5462h.C69714l.m101134b(r2)
            r2 = r11
            r11 = r5
            r5 = r0
            goto L_0x00e7
        L_0x0085:
            java.lang.Object r0 = r3.f337791b
            java.lang.Object r3 = r3.f337790a
            p5462h.C69714l.m101134b(r2)
            goto L_0x00a7
        L_0x008d:
            p5462h.C69714l.m101134b(r2)
            com.google.android.apps.search.assistant.platform.j.b.b.a.n r2 = new com.google.android.apps.search.assistant.platform.j.b.b.a.n
            r2.<init>(r1, r0, r12)
            if (r17 != 0) goto L_0x00d0
            com.google.android.apps.search.assistant.platform.j.b.b.a.h r5 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a.C121731h.ACCESSED_NOT_ACQUIRED
            r3.f337790a = r1
            r3.f337791b = r0
            r3.f337796g = r11
            java.lang.Object r2 = r2.mo5192a(r5, r3)
            if (r2 != r4) goto L_0x00a6
            return r4
        L_0x00a6:
            r3 = r1
        L_0x00a7:
            com.google.android.libraries.search.assistant.invocation.b.g r2 = new com.google.android.libraries.search.assistant.invocation.b.g
            com.google.android.apps.search.assistant.platform.j.b.b.a.o r3 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a.C121738o) r3
            com.google.android.libraries.search.assistant.invocation.o.a.bp r3 = r3.f337809i
            com.google.frameworks.client.a.a.b r3 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Resource ("
            r4.<init>(r5)
            java.lang.String r0 = (java.lang.String) r0
            r4.append(r0)
            java.lang.String r0 = ") is not acquired for token("
            r4.append(r0)
            r4.append(r3)
            r4.append(r6)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0)
            throw r2
        L_0x00d0:
            com.google.android.apps.search.assistant.platform.j.b.b.a.h r5 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a.C121731h.ACCESSED
            r3.f337790a = r1
            r3.f337791b = r0
            r11 = r19
            r3.f337792c = r11
            r3.f337793d = r2
            r3.f337796g = r10
            java.lang.Object r5 = r2.mo5192a(r5, r3)
            if (r5 == r4) goto L_0x0183
            r10 = r0
            r5 = r2
            r2 = r1
        L_0x00e7:
            com.google.common.f.e r0 = f337801g     // Catch:{ av -> 0x0141 }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ av -> 0x0141 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ av -> 0x0141 }
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ av -> 0x0141 }
            java.lang.String r14 = "INV.AssistData"
            r0.mo56378ag(r13, r14)     // Catch:{ av -> 0x0141 }
            java.lang.String r13 = "Accessing %s for token(%s)."
            r14 = r2
            com.google.android.apps.search.assistant.platform.j.b.b.a.o r14 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a.C121738o) r14     // Catch:{ av -> 0x0141 }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r14 = r14.f337809i     // Catch:{ av -> 0x0141 }
            com.google.frameworks.client.a.a.b r14 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r14)     // Catch:{ av -> 0x0141 }
            com.google.common.f.n r15 = new com.google.common.f.n     // Catch:{ av -> 0x0141 }
            r7 = 35936(0x8c60, float:5.0357E-41)
            r15.<init>(r7)     // Catch:{ av -> 0x0141 }
            r0.mo56379ah(r15)     // Catch:{ av -> 0x0141 }
            r0.mo56354G(r13, r10, r14)     // Catch:{ av -> 0x0141 }
            r0 = r2
            com.google.android.apps.search.assistant.platform.j.b.b.a.o r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a.C121738o) r0     // Catch:{ av -> 0x0141 }
            com.google.android.apps.search.assistant.platform.j.b.c.ay r0 = r0.f337808h     // Catch:{ av -> 0x0141 }
            r7 = r2
            com.google.android.apps.search.assistant.platform.j.b.b.a.o r7 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a.C121738o) r7     // Catch:{ av -> 0x0141 }
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r7 = r7.f337802a     // Catch:{ av -> 0x0141 }
            r3.f337790a = r2     // Catch:{ av -> 0x0141 }
            r3.f337791b = r10     // Catch:{ av -> 0x0141 }
            r3.f337792c = r5     // Catch:{ av -> 0x0141 }
            r3.f337793d = r12     // Catch:{ av -> 0x0141 }
            r3.f337796g = r9     // Catch:{ av -> 0x0141 }
            java.lang.Object r0 = r11.mo17419a(r0, r7, r3)     // Catch:{ av -> 0x0141 }
            if (r0 == r4) goto L_0x0140
            r9 = r10
            r10 = r2
            r2 = r0
        L_0x012c:
            com.google.android.apps.search.assistant.platform.j.b.b.a.h r0 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a.C121731h.RETURNED     // Catch:{ av -> 0x006f }
            r3.f337790a = r10     // Catch:{ av -> 0x006f }
            r3.f337791b = r9     // Catch:{ av -> 0x006f }
            r3.f337792c = r5     // Catch:{ av -> 0x006f }
            r3.f337793d = r2     // Catch:{ av -> 0x006f }
            r3.f337796g = r8     // Catch:{ av -> 0x006f }
            java.lang.Object r0 = r5.mo5192a(r0, r3)     // Catch:{ av -> 0x006f }
            if (r0 == r4) goto L_0x0140
            r0 = r2
        L_0x013f:
            return r0
        L_0x0140:
            return r4
        L_0x0141:
            r0 = move-exception
            r9 = r10
            r10 = r2
        L_0x0144:
            com.google.android.apps.search.assistant.platform.j.b.b.a.h r2 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a.C121731h.FAILED_ACCESS
            r3.f337790a = r10
            r3.f337791b = r9
            r3.f337792c = r0
            r3.f337793d = r12
            r7 = 5
            r3.f337796g = r7
            java.lang.Object r2 = r5.mo5192a(r2, r3)
            if (r2 != r4) goto L_0x0158
            return r4
        L_0x0158:
            r4 = r9
            r3 = r10
        L_0x015a:
            com.google.android.libraries.search.assistant.invocation.b.g r2 = new com.google.android.libraries.search.assistant.invocation.b.g
            com.google.android.apps.search.assistant.platform.j.b.b.a.o r3 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a.C121738o) r3
            com.google.android.libraries.search.assistant.invocation.o.a.bp r3 = r3.f337809i
            com.google.frameworks.client.a.a.b r3 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "Failed to access ("
            r5.<init>(r7)
            java.lang.String r4 = (java.lang.String) r4
            r5.append(r4)
            java.lang.String r4 = ") for token("
            r5.append(r4)
            r5.append(r3)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r2.<init>(r3, r0)
            throw r2
        L_0x0183:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a.C121738o.mo105336c(boolean, java.lang.String, h.f.a.q, h.c.g):java.lang.Object");
    }

    /* renamed from: d */
    public final String mo39056d() {
        return this.f337810j;
    }
}
