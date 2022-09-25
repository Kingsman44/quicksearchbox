package com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1390c;

import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.assistant.apa.network.apas3client.impl.ApaS3ConnectionImpl$requestFlow$2", mo61344c = "ApaS3ConnectionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {73, 73, 83, 84})
/* renamed from: com.google.android.libraries.assistant.c.e.a.c.i */
/* compiled from: PG */
final class C17244i extends C69572j implements C69630p {

    /* renamed from: a */
    Object f50003a;

    /* renamed from: b */
    int f50004b;

    /* renamed from: c */
    final /* synthetic */ C17249n f50005c;

    /* renamed from: d */
    private /* synthetic */ Object f50006d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17244i(C17249n nVar, C69577g gVar) {
        super(2, gVar);
        this.f50005c = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C17244i) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: kotlinx.coroutines.b.o} */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00aa, code lost:
        if (kotlinx.coroutines.p5574b.C71594u.m104516c(r1, r10, r9) == r0) goto L_0x00eb;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0072 A[LOOP:0: B:16:0x006c->B:18:0x0072, LOOP_END] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r10) {
        /*
            r9 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r9.f50004b
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0030
            if (r1 == r4) goto L_0x0026
            if (r1 == r3) goto L_0x001e
            if (r1 == r2) goto L_0x0015
            p5462h.C69714l.m101134b(r10)
            goto L_0x00de
        L_0x0015:
            java.lang.Object r1 = r9.f50006d
            kotlinx.coroutines.b.o r1 = (kotlinx.coroutines.p5574b.C71588o) r1
            p5462h.C69714l.m101134b(r10)
            goto L_0x00ac
        L_0x001e:
            java.lang.Object r1 = r9.f50006d
            kotlinx.coroutines.b.o r1 = (kotlinx.coroutines.p5574b.C71588o) r1
            p5462h.C69714l.m101134b(r10)
            goto L_0x0059
        L_0x0026:
            java.lang.Object r1 = r9.f50003a
            java.lang.Object r6 = r9.f50006d
            kotlinx.coroutines.b.o r6 = (kotlinx.coroutines.p5574b.C71588o) r6
            p5462h.C69714l.m101134b(r10)
            goto L_0x004c
        L_0x0030:
            p5462h.C69714l.m101134b(r10)
            java.lang.Object r10 = r9.f50006d
            r1 = r10
            kotlinx.coroutines.b.o r1 = (kotlinx.coroutines.p5574b.C71588o) r1
            com.google.android.libraries.assistant.c.e.a.c.n r10 = r9.f50005c
            r9.f50006d = r1
            r9.f50003a = r1
            r9.f50004b = r4
            com.google.android.libraries.assistant.c.e.a.c.e r6 = new com.google.android.libraries.assistant.c.e.a.c.e
            r6.<init>(r10, r5)
            java.lang.Object r10 = kotlinx.coroutines.C71423ax.m104196a(r6, r9)
            if (r10 == r0) goto L_0x00eb
            r6 = r1
        L_0x004c:
            r9.f50006d = r6
            r9.f50003a = r5
            r9.f50004b = r3
            java.lang.Object r10 = r1.mo20883a(r10, r9)
            if (r10 == r0) goto L_0x00eb
            r1 = r6
        L_0x0059:
            com.google.android.libraries.assistant.c.e.a.c.n r10 = r9.f50005c
            java.util.List r10 = r10.f50013b
            java.util.ArrayList r3 = new java.util.ArrayList
            r6 = 10
            int r6 = p5462h.p5463a.C69540x.m100804k(r10, r6)
            r3.<init>(r6)
            java.util.Iterator r10 = r10.iterator()
        L_0x006c:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x0093
            java.lang.Object r6 = r10.next()
            com.google.android.libraries.assistant.c.e.a.e r6 = (com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17266e) r6
            java.lang.String r7 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r7)
            com.google.android.libraries.assistant.c.e.a.c.q r7 = new com.google.android.libraries.assistant.c.e.a.c.q
            r7.<init>(r6, r5)
            kotlinx.coroutines.b.n r6 = kotlinx.coroutines.p5574b.C71590q.m104505b(r7)
            r7 = 2147483647(0x7fffffff, float:NaN)
            kotlinx.coroutines.a.t r8 = kotlinx.coroutines.p5573a.C71387t.SUSPEND
            kotlinx.coroutines.b.n r6 = kotlinx.coroutines.p5574b.C71598y.m104521a(r6, r7, r8)
            r3.add(r6)
            goto L_0x006c
        L_0x0093:
            kotlinx.coroutines.b.n r10 = kotlinx.coroutines.p5574b.C71506bj.m104337c(r3)
            com.google.android.libraries.assistant.c.e.a.c.h r3 = new com.google.android.libraries.assistant.c.e.a.c.h
            com.google.android.libraries.assistant.c.e.a.c.n r6 = r9.f50005c
            r3.<init>(r6, r5)
            kotlinx.coroutines.b.n r10 = kotlinx.coroutines.p5574b.C71486aq.m104308b(r10, r3)
            r9.f50006d = r1
            r9.f50004b = r2
            java.lang.Object r10 = kotlinx.coroutines.p5574b.C71594u.m104516c(r1, r10, r9)
            if (r10 == r0) goto L_0x00eb
        L_0x00ac:
            com.google.speech.h.ce r10 = com.google.speech.p5208h.C66607ce.f181191f
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.speech.h.cd r10 = (com.google.speech.p5208h.C66606cd) r10
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r2)
            com.google.speech.h.df r10 = p5462h.p5473f.p5475b.C69664n.m101061g(r10, "builder")
            com.google.speech.h.cd r2 = r10.f181308a
            r2.copyOnWrite()
            com.google.protobuf.bv r2 = r2.instance
            com.google.speech.h.ce r2 = (com.google.speech.p5208h.C66607ce) r2
            int r3 = r2.f181193a
            r3 = r3 | 8
            r2.f181193a = r3
            r2.f181197e = r4
            com.google.speech.h.ce r10 = r10.mo59697a()
            r9.f50006d = r5
            r2 = 4
            r9.f50004b = r2
            java.lang.Object r10 = r1.mo20883a(r10, r9)
            if (r10 != r0) goto L_0x00de
            return r0
        L_0x00de:
            com.google.android.libraries.assistant.c.e.a.c.n r10 = r9.f50005c
            com.google.android.libraries.assistant.c.e.a.c.f r0 = new com.google.android.libraries.assistant.c.e.a.c.f
            r0.<init>(r10)
            com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1390c.C17249n.m34427b(r0)
            h.q r10 = p5462h.C69788q.f186170a
            return r10
        L_0x00eb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1390c.C17244i.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C17244i iVar = new C17244i(this.f50005c, gVar);
        iVar.f50006d = obj;
        return iVar;
    }
}
