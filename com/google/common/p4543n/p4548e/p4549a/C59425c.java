package com.google.common.p4543n.p4548e.p4549a;

import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p5462h.C69677g;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5474a.C69626l;

/* renamed from: com.google.common.n.e.a.c */
/* compiled from: PG */
public final class C59425c implements C69626l {

    /* renamed from: a */
    private final C71788b f157648a = new C71799m();

    /* renamed from: b */
    private C59427e f157649b;

    public C59425c(C69626l lVar) {
        this.f157649b = new C59426d(lVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C69577g gVar = (C69577g) obj;
        C59427e eVar = this.f157649b;
        if (eVar instanceof C59423a) {
            return ((C59423a) eVar).f157642a;
        }
        if (eVar instanceof C59426d) {
            return mo56930b(gVar);
        }
        throw new C69677g();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d A[Catch:{ all -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062 A[Catch:{ all -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo56930b(p5462h.p5466c.C69577g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.common.p4543n.p4548e.p4549a.C59424b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.common.n.e.a.b r0 = (com.google.common.p4543n.p4548e.p4549a.C59424b) r0
            int r1 = r0.f157647e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f157647e = r1
            goto L_0x0018
        L_0x0013:
            com.google.common.n.e.a.b r0 = new com.google.common.n.e.a.b
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f157645c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f157647e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.f157644b
            java.lang.Object r0 = r0.f157643a
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x002f }
            goto L_0x0079
        L_0x002f:
            r8 = move-exception
            goto L_0x0092
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0039:
            java.lang.Object r2 = r0.f157644b
            java.lang.Object r4 = r0.f157643a
            p5462h.C69714l.m101134b(r8)
            r8 = r2
            goto L_0x0054
        L_0x0042:
            p5462h.C69714l.m101134b(r8)
            kotlinx.coroutines.j.b r8 = r7.f157648a
            r0.f157643a = r7
            r0.f157644b = r8
            r0.f157647e = r4
            java.lang.Object r2 = r8.mo63025b(r5, r0)
            if (r2 == r1) goto L_0x0096
            r4 = r7
        L_0x0054:
            r2 = r4
            com.google.common.n.e.a.c r2 = (com.google.common.p4543n.p4548e.p4549a.C59425c) r2     // Catch:{ all -> 0x008f }
            com.google.common.n.e.a.e r2 = r2.f157649b     // Catch:{ all -> 0x008f }
            boolean r6 = r2 instanceof com.google.common.p4543n.p4548e.p4549a.C59423a     // Catch:{ all -> 0x008f }
            if (r6 == 0) goto L_0x0062
            com.google.common.n.e.a.a r2 = (com.google.common.p4543n.p4548e.p4549a.C59423a) r2     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r2.f157642a     // Catch:{ all -> 0x008f }
            goto L_0x0084
        L_0x0062:
            boolean r6 = r2 instanceof com.google.common.p4543n.p4548e.p4549a.C59426d     // Catch:{ all -> 0x008f }
            if (r6 == 0) goto L_0x0089
            com.google.common.n.e.a.d r2 = (com.google.common.p4543n.p4548e.p4549a.C59426d) r2     // Catch:{ all -> 0x008f }
            h.f.a.l r2 = r2.f157650a     // Catch:{ all -> 0x008f }
            r0.f157643a = r4     // Catch:{ all -> 0x008f }
            r0.f157644b = r8     // Catch:{ all -> 0x008f }
            r0.f157647e = r3     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r2.mo5761a(r0)     // Catch:{ all -> 0x008f }
            if (r0 == r1) goto L_0x0088
            r1 = r8
            r8 = r0
            r0 = r4
        L_0x0079:
            com.google.common.n.e.a.a r2 = new com.google.common.n.e.a.a     // Catch:{ all -> 0x002f }
            r2.<init>(r8)     // Catch:{ all -> 0x002f }
            com.google.common.n.e.a.c r0 = (com.google.common.p4543n.p4548e.p4549a.C59425c) r0     // Catch:{ all -> 0x002f }
            r0.f157649b = r2     // Catch:{ all -> 0x002f }
            r0 = r8
            r8 = r1
        L_0x0084:
            r8.mo63026c(r5)
            return r0
        L_0x0088:
            return r1
        L_0x0089:
            h.g r0 = new h.g     // Catch:{ all -> 0x008f }
            r0.<init>()     // Catch:{ all -> 0x008f }
            throw r0     // Catch:{ all -> 0x008f }
        L_0x008f:
            r0 = move-exception
            r1 = r8
            r8 = r0
        L_0x0092:
            r1.mo63026c(r5)
            throw r8
        L_0x0096:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4543n.p4548e.p4549a.C59425c.mo56930b(h.c.g):java.lang.Object");
    }
}
