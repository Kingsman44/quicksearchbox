package com.google.android.apps.search.googleapp.p10338l.p10339a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.feedback.statedump.StateDump$getAllData$2", mo61344c = "StateDump.kt", mo61345d = "invokeSuspend", mo61346e = {95})
/* renamed from: com.google.android.apps.search.googleapp.l.a.t */
/* compiled from: PG */
final class C136401t extends C69572j implements C69630p {

    /* renamed from: a */
    Object f371345a;

    /* renamed from: b */
    Object f371346b;

    /* renamed from: c */
    Object f371347c;

    /* renamed from: d */
    int f371348d;

    /* renamed from: e */
    final /* synthetic */ C136378aa f371349e;

    /* renamed from: f */
    private /* synthetic */ Object f371350f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136401t(C136378aa aaVar, C69577g gVar) {
        super(2, gVar);
        this.f371349e = aaVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C136401t) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.util.LinkedHashMap} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0078  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r10) {
        /*
            r9 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r9.f371348d
            if (r1 == 0) goto L_0x001a
            java.lang.Object r1 = r9.f371347c
            java.lang.Object r2 = r9.f371346b
            java.lang.Object r3 = r9.f371345a
            java.lang.Object r4 = r9.f371350f
            java.util.Map r4 = (java.util.Map) r4
            p5462h.C69714l.m101134b(r10)
            r5 = r3
            r3 = r4
            r4 = r1
            r1 = r0
            r0 = r9
            goto L_0x009f
        L_0x001a:
            p5462h.C69714l.m101134b(r10)
            java.lang.Object r10 = r9.f371350f
            kotlinx.coroutines.aw r10 = (kotlinx.coroutines.C71422aw) r10
            com.google.android.apps.search.googleapp.l.a.aa r1 = r9.f371349e
            java.util.List r2 = r1.f371295e
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r4 = 10
            int r4 = p5462h.p5463a.C69540x.m100804k(r2, r4)
            int r4 = p5462h.p5463a.C69505av.m100860b(r4)
            r5 = 16
            if (r4 >= r5) goto L_0x0037
            r4 = 16
        L_0x0037:
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x003e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x005a
            java.lang.Object r4 = r2.next()
            r5 = r4
            com.google.android.apps.search.googleapp.l.a.r r5 = (com.google.android.apps.search.googleapp.p10338l.p10339a.C136399r) r5
            com.google.android.apps.search.googleapp.l.a.s r6 = new com.google.android.apps.search.googleapp.l.a.s
            r7 = 0
            r6.<init>(r1, r5, r7)
            r5 = 3
            kotlinx.coroutines.be r5 = kotlinx.coroutines.C71803m.m105042c(r10, r7, r7, r6, r5)
            r3.put(r4, r5)
            goto L_0x003e
        L_0x005a:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            int r1 = r3.size()
            int r1 = p5462h.p5463a.C69505av.m100860b(r1)
            r10.<init>(r1)
            java.util.Set r1 = r3.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r2 = r10
            r3 = r1
            r10 = r9
        L_0x0072:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x00b1
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r4 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            kotlinx.coroutines.be r1 = (kotlinx.coroutines.C71604be) r1
            r10.f371350f = r2
            r10.f371345a = r3
            r10.f371346b = r2
            r10.f371347c = r4
            r5 = 1
            r10.f371348d = r5
            java.lang.Object r1 = r1.mo62825a(r10)
            if (r1 == r0) goto L_0x00b0
            r5 = r3
            r3 = r2
            r8 = r0
            r0 = r10
            r10 = r1
            r1 = r8
        L_0x009f:
            h.k r10 = (p5462h.C69702k) r10
            java.lang.Object r10 = r10.f186073a
            h.k r6 = new h.k
            r6.<init>(r10)
            r2.put(r4, r6)
            r10 = r0
            r0 = r1
            r2 = r3
            r3 = r5
            goto L_0x0072
        L_0x00b0:
            return r0
        L_0x00b1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.p10338l.p10339a.C136401t.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C136401t tVar = new C136401t(this.f371349e, gVar);
        tVar.f371350f = obj;
        return tVar;
    }
}
