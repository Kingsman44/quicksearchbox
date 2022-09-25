package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32798at;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32840ch;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32872r;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32873s;
import com.google.common.p4526f.C59071e;
import java.util.List;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.bo */
/* compiled from: PG */
public final class C32646bo {

    /* renamed from: a */
    public static final C32646bo f87505a = new C32646bo();

    /* renamed from: b */
    private static final C59071e f87506b = C59071e.m91331h();

    /* renamed from: c */
    private static final C32796ar f87507c;

    static {
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C32798at a = C69664n.m101061g(ajVar, "builder");
        C32872r rVar = (C32872r) C32873s.f88105a.createBuilder();
        C69664n.m101060f(rVar, "newBuilder()");
        a.mo38299b(C69664n.m101061g(rVar, "builder").mo38330a());
        f87507c = a.mo38298a();
    }

    private C32646bo() {
    }

    /* renamed from: a */
    public final Object mo38204a(List list, C32840ch chVar, boolean z, C69626l lVar, C69630p pVar, C69577g gVar) {
        return mo38205b(list, new C32644bm(lVar, (C69577g) null), new C32645bn(pVar, chVar, z, (C69577g) null), gVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: h.f.a.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: h.f.a.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: h.f.a.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38205b(java.util.List r6, p5462h.p5473f.p5474a.C69626l r7, p5462h.p5473f.p5474a.C69631q r8, p5462h.p5466c.C69577g r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32643bl
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.libraries.search.assistant.f.a.b.bl r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32643bl) r0
            int r1 = r0.f87496e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f87496e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.f.a.b.bl r0 = new com.google.android.libraries.search.assistant.f.a.b.bl
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f87494c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f87496e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r9)
            goto L_0x0090
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            java.lang.Object r8 = r0.f87493b
            java.lang.Object r6 = r0.f87492a
            p5462h.C69714l.m101134b(r9)
            goto L_0x0049
        L_0x003a:
            p5462h.C69714l.m101134b(r9)
            r0.f87492a = r6
            r0.f87493b = r8
            r0.f87496e = r4
            java.lang.Object r9 = r7.mo5761a(r0)
            if (r9 == r1) goto L_0x00d4
        L_0x0049:
            com.google.android.libraries.search.assistant.f.a.b.cv r9 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32680cv) r9
            com.google.android.libraries.search.assistant.f.a.d.ar r7 = f87507c
            boolean r9 = r9.mo38241b(r7)
            if (r9 == 0) goto L_0x00a7
            com.google.android.libraries.search.assistant.f.a.d.y r6 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32879y.f88112f
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.search.assistant.f.a.d.x r6 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32878x) r6
            java.lang.String r9 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r9)
            com.google.android.libraries.search.assistant.f.a.d.aa r6 = p5462h.p5473f.p5475b.C69664n.m101061g(r6, "builder")
            com.google.android.libraries.search.assistant.f.a.d.be r2 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be.f87993c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.search.assistant.f.a.d.bd r2 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32809bd) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r9)
            com.google.android.libraries.search.assistant.f.a.d.bg r9 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            r9.mo38308b(r7)
            com.google.android.libraries.search.assistant.f.a.d.be r7 = r9.mo38307a()
            r6.mo38290b(r7)
            com.google.android.libraries.search.assistant.f.a.d.y r6 = r6.mo38289a()
            com.google.android.libraries.search.assistant.f.a.d.q r7 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32871q.STATIC_CACHE
            r9 = 0
            r0.f87492a = r9
            r0.f87493b = r9
            r0.f87496e = r3
            java.lang.Object r9 = r8.mo17419a(r6, r7, r0)
            if (r9 == r1) goto L_0x00a6
        L_0x0090:
            com.google.android.libraries.search.assistant.f.a.d.aw r9 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw) r9
            int r6 = r9.f87980a
            r7 = 6
            if (r6 != r7) goto L_0x009c
            java.lang.Object r6 = r9.f87981b
            com.google.android.libraries.search.assistant.f.a.d.w r6 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32877w) r6
            goto L_0x009e
        L_0x009c:
            com.google.android.libraries.search.assistant.f.a.d.w r6 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32877w.f88108c
        L_0x009e:
            java.lang.String r6 = r6.f88111b
            java.lang.String r7 = "contextResult.clientIdResult.idOnlyForApprovedUse"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            return r6
        L_0x00a6:
            return r1
        L_0x00a7:
            com.google.common.f.e r8 = f87506b
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "Context.Utils"
            r8.mo56378ag(r9, r0)
            java.lang.String r9 = "logger.atWarning()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)
            com.google.common.f.c r8 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32692dg.m60595a(r8, r6)
            com.google.common.f.n r9 = new com.google.common.f.n
            r0 = 50589(0xc59d, float:7.089E-41)
            r9.<init>(r0)
            r8.mo56379ah(r9)
            java.lang.String r9 = "Surface does not provide ID"
            r8.mo56386p(r9)
            com.google.android.libraries.search.assistant.f.a.b.ce r6 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32662cd.m60554f(r6, r7)
            throw r6
        L_0x00d4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32646bo.mo38205b(java.util.List, h.f.a.l, h.f.a.q, h.c.g):java.lang.Object");
    }
}
