package com.google.android.apps.search.assistant.platform.p9256k;

import com.google.android.libraries.assistant.p1533o.C18469be;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.data.android.server.C61572t;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70334de;

/* renamed from: com.google.android.apps.search.assistant.platform.k.s */
/* compiled from: PG */
public final class C122085s implements C61572t {

    /* renamed from: a */
    final /* synthetic */ C122086t f338716a;

    public C122085s(C122086t tVar) {
        this.f338716a = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo58126a(C70334de deVar, C70256c cVar) {
        C69664n.m101061g(cVar, "callAttributes");
        return C71663i.m104692e(this.f338716a.f338718b, (C71424ay) null, new C122083q(this, deVar, (C69577g) null), 3);
    }

    /* renamed from: b */
    public final /* synthetic */ C70298d mo58127b(Object obj, String str) {
        return (C18469be) obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.util.Iterator} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=com.google.android.libraries.assistant.o.ay, code=java.lang.Object, for r7v0, types: [com.google.android.libraries.assistant.o.ay] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047 A[Catch:{ all -> 0x009a }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008f A[Catch:{ all -> 0x009a }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105526c(java.lang.Object r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.platform.p9256k.C122084r
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.platform.k.r r0 = (com.google.android.apps.search.assistant.platform.p9256k.C122084r) r0
            int r1 = r0.f338715f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338715f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.k.r r0 = new com.google.android.apps.search.assistant.platform.k.r
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f338713d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338715f
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r7 = r0.f338712c
            java.lang.Object r2 = r0.f338711b
            java.lang.Object r4 = r0.f338710a
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x009a }
            goto L_0x0062
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            p5462h.C69714l.m101134b(r8)
            com.google.android.apps.search.assistant.platform.k.t r8 = r6.f338716a     // Catch:{ all -> 0x009a }
            java.util.List r8 = r8.f338719c     // Catch:{ all -> 0x009a }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x009a }
            r2 = r8
        L_0x0041:
            boolean r8 = r2.hasNext()     // Catch:{ all -> 0x009a }
            if (r8 == 0) goto L_0x0092
            java.lang.Object r8 = r2.next()     // Catch:{ all -> 0x009a }
            r4 = r8
            com.google.android.apps.search.assistant.libraries.j.f r4 = (com.google.android.apps.search.assistant.libraries.p8979j.C119439f) r4     // Catch:{ all -> 0x009a }
            h.f.a.p r4 = r4.f332957c     // Catch:{ all -> 0x009a }
            r0.f338710a = r7     // Catch:{ all -> 0x009a }
            r0.f338711b = r2     // Catch:{ all -> 0x009a }
            r0.f338712c = r8     // Catch:{ all -> 0x009a }
            r0.f338715f = r3     // Catch:{ all -> 0x009a }
            java.lang.Object r4 = r4.mo5192a(r7, r0)     // Catch:{ all -> 0x009a }
            if (r4 == r1) goto L_0x0091
            r5 = r4
            r4 = r7
            r7 = r8
            r8 = r5
        L_0x0062:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x009a }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x009a }
            if (r8 == 0) goto L_0x008f
            com.google.android.apps.search.assistant.libraries.j.f r7 = (com.google.android.apps.search.assistant.libraries.p8979j.C119439f) r7     // Catch:{ all -> 0x009a }
            com.google.common.f.e r8 = com.google.android.apps.search.assistant.platform.p9256k.C122086t.f338717a     // Catch:{ all -> 0x009a }
            com.google.common.f.x r8 = r8.mo56224b()     // Catch:{ all -> 0x009a }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x009a }
            java.lang.String r0 = "Selected %s"
            java.lang.String r1 = r7.f332955a     // Catch:{ all -> 0x009a }
            com.google.common.f.n r2 = new com.google.common.f.n     // Catch:{ all -> 0x009a }
            r3 = 36109(0x8d0d, float:5.06E-41)
            r2.<init>(r3)     // Catch:{ all -> 0x009a }
            r8.mo56379ah(r2)     // Catch:{ all -> 0x009a }
            r8.mo56389s(r0, r1)     // Catch:{ all -> 0x009a }
            g.a.a r7 = r7.f332956b     // Catch:{ all -> 0x009a }
            java.lang.Object r7 = r7.mo17428b()     // Catch:{ all -> 0x009a }
            com.google.android.libraries.assistant.o.be r7 = (com.google.android.libraries.assistant.p1533o.C18469be) r7     // Catch:{ all -> 0x009a }
            return r7
        L_0x008f:
            r7 = r4
            goto L_0x0041
        L_0x0091:
            return r1
        L_0x0092:
            java.util.NoSuchElementException r7 = new java.util.NoSuchElementException     // Catch:{ all -> 0x009a }
            java.lang.String r8 = "Collection contains no element matching the predicate."
            r7.<init>(r8)     // Catch:{ all -> 0x009a }
            throw r7     // Catch:{ all -> 0x009a }
        L_0x009a:
            r7 = move-exception
            com.google.common.f.e r8 = com.google.android.apps.search.assistant.platform.p9256k.C122086t.f338717a
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.x r8 = r8.mo56382g(r7)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 36108(0x8d0c, float:5.0598E-41)
            r0.<init>(r1)
            r8.mo56379ah(r0)
            java.lang.String r0 = "Eligibility check failed."
            r8.mo56386p(r0)
            goto L_0x00bb
        L_0x00ba:
            throw r7
        L_0x00bb:
            goto L_0x00ba
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9256k.C122085s.mo105526c(com.google.android.libraries.assistant.o.ay, h.c.g):java.lang.Object");
    }
}
