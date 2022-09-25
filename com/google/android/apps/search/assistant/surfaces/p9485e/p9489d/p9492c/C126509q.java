package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9492c;

import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69613f;
import p5462h.p5473f.p5475b.C69644aa;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.c.q */
/* compiled from: PG */
final class C126509q implements C71588o {

    /* renamed from: a */
    final /* synthetic */ StringBuilder f348414a;

    /* renamed from: b */
    final /* synthetic */ C69644aa f348415b;

    /* renamed from: c */
    final /* synthetic */ C71588o f348416c;

    /* renamed from: d */
    final /* synthetic */ C69613f f348417d;

    /* renamed from: e */
    final /* synthetic */ C69613f f348418e;

    public C126509q(StringBuilder sb, C69644aa aaVar, C71588o oVar, C69613f fVar, C69613f fVar2) {
        this.f348414a = sb;
        this.f348415b = aaVar;
        this.f348416c = oVar;
        this.f348417d = fVar;
        this.f348418e = fVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: com.google.speech.h.av} */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b7, code lost:
        if (r12 != r1) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c5, code lost:
        if (r8.mo20883a(r12, r0) != r1) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c8, code lost:
        return r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo20883a(com.google.speech.p5208h.C66565av r11, p5462h.p5466c.C69577g r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9492c.C126508p
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.apps.search.assistant.surfaces.e.d.c.p r0 = (com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9492c.C126508p) r0
            int r1 = r0.f348413f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f348413f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.e.d.c.p r0 = new com.google.android.apps.search.assistant.surfaces.e.d.c.p
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f348411d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f348413f
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 4
            r7 = 1
            if (r2 == 0) goto L_0x0058
            if (r2 == r7) goto L_0x0050
            if (r2 == r4) goto L_0x0043
            if (r2 == r3) goto L_0x003a
            if (r2 != r6) goto L_0x0032
            p5462h.C69714l.m101134b(r12)
            goto L_0x00e6
        L_0x0032:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003a:
            java.lang.Object r11 = r0.f348409b
            java.lang.Object r2 = r0.f348408a
            p5462h.C69714l.m101134b(r12)
            goto L_0x00c9
        L_0x0043:
            java.lang.Object r11 = r0.f348410c
            java.lang.Object r2 = r0.f348409b
            java.lang.Object r4 = r0.f348408a
            p5462h.C69714l.m101134b(r12)
            r8 = r11
            r11 = r2
            r2 = r4
            goto L_0x00b9
        L_0x0050:
            java.lang.Object r11 = r0.f348409b
            java.lang.Object r2 = r0.f348408a
            p5462h.C69714l.m101134b(r12)
            goto L_0x008f
        L_0x0058:
            p5462h.C69714l.m101134b(r12)
            int r12 = r11.f181064a
            r12 = r12 & r7
            if (r12 == 0) goto L_0x0067
            java.lang.StringBuilder r12 = r10.f348414a
            java.lang.String r2 = r11.f181065b
            r12.append(r2)
        L_0x0067:
            h.f.b.aa r12 = r10.f348415b
            boolean r2 = r12.f186023a
            if (r2 != 0) goto L_0x008e
            boolean r2 = r11.f181066c
            if (r2 == 0) goto L_0x008e
            r12.f186023a = r7
            kotlinx.coroutines.b.o r12 = r10.f348416c
            com.google.android.apps.search.assistant.surfaces.e.d.c.n r2 = new com.google.android.apps.search.assistant.surfaces.e.d.c.n
            h.f r8 = r10.f348417d
            r2.<init>(r8)
            com.google.android.libraries.assistant.o.bt r2 = com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9493d.C126558c.m206923e(r2)
            r0.f348408a = r10
            r0.f348409b = r11
            r0.f348413f = r7
            java.lang.Object r12 = r12.mo20883a(r2, r0)
            if (r12 == r1) goto L_0x008d
            goto L_0x008e
        L_0x008d:
            return r1
        L_0x008e:
            r2 = r10
        L_0x008f:
            r12 = r11
            com.google.speech.h.av r12 = (com.google.speech.p5208h.C66565av) r12
            int r7 = r12.f181064a
            r7 = r7 & r6
            if (r7 == 0) goto L_0x00c9
            r7 = r2
            com.google.android.apps.search.assistant.surfaces.e.d.c.q r7 = (com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9492c.C126509q) r7
            kotlinx.coroutines.b.o r8 = r7.f348416c
            h.f r7 = r7.f348418e
            java.lang.Object r7 = r7.mo5768a()
            com.google.android.apps.search.assistant.surfaces.e.d.c.m r7 = (com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9492c.C126505m) r7
            com.google.protobuf.z r12 = r12.f181067d
            java.lang.String r9 = "output.gwsBodyFragment"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r9)
            r0.f348408a = r2
            r0.f348409b = r11
            r0.f348410c = r8
            r0.f348413f = r4
            java.lang.Object r12 = r7.mo107623a(r12, r0)
            if (r12 == r1) goto L_0x00c8
        L_0x00b9:
            r0.f348408a = r2
            r0.f348409b = r11
            r0.f348410c = r5
            r0.f348413f = r3
            java.lang.Object r12 = r8.mo20883a(r12, r0)
            if (r12 == r1) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            return r1
        L_0x00c9:
            com.google.speech.h.av r11 = (com.google.speech.p5208h.C66565av) r11
            boolean r11 = r11.f181068e
            if (r11 == 0) goto L_0x00e9
            com.google.android.apps.search.assistant.surfaces.e.d.c.q r2 = (com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9492c.C126509q) r2
            kotlinx.coroutines.b.o r11 = r2.f348416c
            com.google.android.apps.search.assistant.surfaces.e.d.c.o r12 = com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9492c.C126507o.f348407a
            com.google.android.libraries.assistant.o.bt r12 = com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9493d.C126558c.m206923e(r12)
            r0.f348408a = r5
            r0.f348409b = r5
            r0.f348413f = r6
            java.lang.Object r11 = r11.mo20883a(r12, r0)
            if (r11 != r1) goto L_0x00e6
            return r1
        L_0x00e6:
            h.q r11 = p5462h.C69788q.f186170a
            return r11
        L_0x00e9:
            h.q r11 = p5462h.C69788q.f186170a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9492c.C126509q.mo20883a(com.google.speech.h.av, h.c.g):java.lang.Object");
    }
}
