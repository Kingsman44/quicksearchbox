package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9490a;

import com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.C126454af;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.connector.Connector$requestFlow$1", mo61344c = "Connector.kt", mo61345d = "invokeSuspend", mo61346e = {114, 113, 118, 119})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.a.g */
/* compiled from: PG */
final class C126447g extends C69572j implements C69630p {

    /* renamed from: a */
    Object f348237a;

    /* renamed from: b */
    int f348238b;

    /* renamed from: c */
    final /* synthetic */ C126441a f348239c;

    /* renamed from: d */
    final /* synthetic */ C126454af f348240d;

    /* renamed from: e */
    private /* synthetic */ Object f348241e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126447g(C126441a aVar, C126454af afVar, C69577g gVar) {
        super(2, gVar);
        this.f348239c = aVar;
        this.f348240d = afVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126447g) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: kotlinx.coroutines.b.o} */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006f, code lost:
        if (kotlinx.coroutines.p5574b.C71594u.m104516c(r1, r9, r8) == r0) goto L_0x00a0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r9) {
        /*
            r8 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r8.f348238b
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x002f
            if (r1 == r5) goto L_0x0025
            if (r1 == r3) goto L_0x001d
            if (r1 == r2) goto L_0x0015
            p5462h.C69714l.m101134b(r9)
            goto L_0x009d
        L_0x0015:
            java.lang.Object r1 = r8.f348241e
            kotlinx.coroutines.b.o r1 = (kotlinx.coroutines.p5574b.C71588o) r1
            p5462h.C69714l.m101134b(r9)
            goto L_0x0071
        L_0x001d:
            java.lang.Object r1 = r8.f348241e
            kotlinx.coroutines.b.o r1 = (kotlinx.coroutines.p5574b.C71588o) r1
            p5462h.C69714l.m101134b(r9)
            goto L_0x005b
        L_0x0025:
            java.lang.Object r1 = r8.f348237a
            java.lang.Object r6 = r8.f348241e
            kotlinx.coroutines.b.o r6 = (kotlinx.coroutines.p5574b.C71588o) r6
            p5462h.C69714l.m101134b(r9)
            goto L_0x0046
        L_0x002f:
            p5462h.C69714l.m101134b(r9)
            java.lang.Object r9 = r8.f348241e
            r1 = r9
            kotlinx.coroutines.b.o r1 = (kotlinx.coroutines.p5574b.C71588o) r1
            com.google.android.apps.search.assistant.surfaces.e.d.a.a r9 = r8.f348239c
            r8.f348241e = r1
            r8.f348237a = r1
            r8.f348238b = r5
            java.lang.Object r9 = r9.mo107616a(r8)
            if (r9 == r0) goto L_0x00a9
            r6 = r1
        L_0x0046:
            r7 = r9
            com.google.speech.h.ce r7 = (com.google.speech.p5208h.C66607ce) r7
            int r7 = r7.f181193a
            r7 = r7 & r5
            if (r7 == 0) goto L_0x00a1
            r8.f348241e = r6
            r8.f348237a = r4
            r8.f348238b = r3
            java.lang.Object r9 = r1.mo20883a(r9, r8)
            if (r9 == r0) goto L_0x00a0
            r1 = r6
        L_0x005b:
            com.google.android.apps.search.assistant.surfaces.e.d.af r9 = r8.f348240d
            com.google.android.apps.search.assistant.surfaces.e.d.ae r3 = new com.google.android.apps.search.assistant.surfaces.e.d.ae
            r3.<init>(r9, r4)
            kotlinx.coroutines.b.db r9 = new kotlinx.coroutines.b.db
            r9.<init>(r3)
            r8.f348241e = r1
            r8.f348238b = r2
            java.lang.Object r9 = kotlinx.coroutines.p5574b.C71594u.m104516c(r1, r9, r8)
            if (r9 == r0) goto L_0x00a0
        L_0x0071:
            com.google.speech.h.ce r9 = com.google.speech.p5208h.C66607ce.f181191f
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.speech.h.cd r9 = (com.google.speech.p5208h.C66606cd) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r2 = r9.instance
            com.google.speech.h.ce r2 = (com.google.speech.p5208h.C66607ce) r2
            int r3 = r2.f181193a
            r3 = r3 | 8
            r2.f181193a = r3
            r2.f181197e = r5
            com.google.protobuf.bv r9 = r9.build()
            java.lang.String r2 = "newBuilder().apply { endOfData = true }.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)
            r8.f348241e = r4
            r2 = 4
            r8.f348238b = r2
            java.lang.Object r9 = r1.mo20883a(r9, r8)
            if (r9 != r0) goto L_0x009d
            return r0
        L_0x009d:
            h.q r9 = p5462h.C69788q.f186170a
            return r9
        L_0x00a0:
            return r0
        L_0x00a1:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "No Service in Initial Request"
            r9.<init>(r0)
            throw r9
        L_0x00a9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9490a.C126447g.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C126447g gVar2 = new C126447g(this.f348239c, this.f348240d, gVar);
        gVar2.f348241e = obj;
        return gVar2;
    }
}
