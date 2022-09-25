package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32785ag;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.SourceService$fetchFreshContextAsync$1", mo61344c = "SourceService.kt", mo61345d = "invokeSuspend", mo61346e = {402})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.es */
/* compiled from: PG */
final class C32731es extends C69572j implements C69630p {

    /* renamed from: a */
    Object f87739a;

    /* renamed from: b */
    int f87740b;

    /* renamed from: c */
    final /* synthetic */ C32785ag f87741c;

    /* renamed from: d */
    final /* synthetic */ List f87742d;

    /* renamed from: e */
    final /* synthetic */ C32750fk f87743e;

    /* renamed from: f */
    private /* synthetic */ Object f87744f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32731es(C32785ag agVar, List list, C32750fk fkVar, C69577g gVar) {
        super(2, gVar);
        this.f87741c = agVar;
        this.f87742d = list;
        this.f87743e = fkVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32731es) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.google.android.libraries.search.assistant.f.a.d.ar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.google.android.libraries.search.assistant.f.a.d.ar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: kotlinx.coroutines.aw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: kotlinx.coroutines.aw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: com.google.android.libraries.search.assistant.f.a.d.ar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: com.google.android.libraries.search.assistant.f.a.d.ar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: com.google.android.libraries.search.assistant.f.a.d.ar} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r16
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r1.f87740b
            r3 = 1
            java.lang.String r4 = "logger\n        .atInfo()"
            java.lang.String r5 = "Context.SourceService"
            if (r2 == 0) goto L_0x001e
            java.lang.Object r2 = r1.f87739a
            java.lang.Object r0 = r1.f87744f
            r6 = r0
            kotlinx.coroutines.aw r6 = (kotlinx.coroutines.C71422aw) r6
            p5462h.C69714l.m101134b(r17)     // Catch:{ all -> 0x001b }
            r7 = r17
            goto L_0x0095
        L_0x001b:
            r0 = move-exception
            goto L_0x0099
        L_0x001e:
            p5462h.C69714l.m101134b(r17)
            java.lang.Object r2 = r1.f87744f
            r6 = r2
            kotlinx.coroutines.aw r6 = (kotlinx.coroutines.C71422aw) r6
            com.google.android.libraries.search.assistant.f.a.d.ag r2 = r1.f87741c
            com.google.android.libraries.search.assistant.f.a.d.y r2 = r2.f87960b
            if (r2 != 0) goto L_0x002e
            com.google.android.libraries.search.assistant.f.a.d.y r2 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32879y.f88112f
        L_0x002e:
            com.google.android.libraries.search.assistant.f.a.d.be r2 = r2.f88115b
            if (r2 != 0) goto L_0x0034
            com.google.android.libraries.search.assistant.f.a.d.be r2 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be.f87993c
        L_0x0034:
            com.google.android.libraries.search.assistant.f.a.d.ar r2 = r2.f87996b
            if (r2 != 0) goto L_0x003a
            com.google.android.libraries.search.assistant.f.a.d.ar r2 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar.f87973c
        L_0x003a:
            java.lang.String r7 = "request.request.fetchContextRequest.contextKey"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r7)
            com.google.common.f.e r7 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32750fk.f87861a
            com.google.common.f.x r7 = r7.mo56224b()
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r8, r5)
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r4)
            java.util.List r8 = r1.f87742d
            com.google.common.f.c r7 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32692dg.m60595a(r7, r8)
            java.lang.String r8 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32602g.m60429b(r2)
            com.google.android.libraries.search.assistant.f.a.d.ag r9 = r1.f87741c
            int r9 = r9.f87961c
            com.google.android.libraries.search.assistant.f.a.d.q r9 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32871q.m60836a(r9)
            if (r9 != 0) goto L_0x0065
            com.google.android.libraries.search.assistant.f.a.d.q r9 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32871q.UNRECOGNIZED
        L_0x0065:
            java.lang.String r9 = r9.name()
            com.google.common.f.n r10 = new com.google.common.f.n
            r11 = 50604(0xc5ac, float:7.0911E-41)
            r10.<init>(r11)
            r7.mo56379ah(r10)
            java.lang.String r10 = "GetContext(%s, %s): Fetching from provider"
            r7.mo56354G(r10, r8, r9)
            com.google.android.libraries.search.assistant.f.a.b.fk r7 = r1.f87743e
            com.google.android.libraries.search.assistant.f.a.d.ag r8 = r1.f87741c
            j$.time.Duration r9 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32750fk.f87862b     // Catch:{ all -> 0x001b }
            com.google.android.libraries.search.assistant.f.a.b.er r10 = new com.google.android.libraries.search.assistant.f.a.b.er     // Catch:{ all -> 0x001b }
            r11 = 0
            r10.<init>(r7, r8, r11)     // Catch:{ all -> 0x001b }
            r1.f87744f = r6     // Catch:{ all -> 0x001b }
            r1.f87739a = r2     // Catch:{ all -> 0x001b }
            r1.f87740b = r3     // Catch:{ all -> 0x001b }
            long r7 = com.google.common.p4580v.p4582b.C60942a.m93083a(r9)     // Catch:{ all -> 0x001b }
            java.lang.Object r7 = kotlinx.coroutines.C71745ea.m104929a(r7, r10, r1)     // Catch:{ all -> 0x001b }
            if (r7 == r0) goto L_0x0098
        L_0x0095:
            com.google.android.libraries.search.assistant.f.a.d.bp r7 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32821bp) r7     // Catch:{ all -> 0x001b }
            goto L_0x009d
        L_0x0098:
            return r0
        L_0x0099:
            java.lang.Object r7 = p5462h.C69714l.m101133a(r0)
        L_0x009d:
            java.lang.Throwable r0 = p5462h.C69702k.m101124a(r7)
            com.google.common.f.e r8 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32750fk.f87861a
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r9, r5)
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r4)
            java.util.List r4 = r1.f87742d
            com.google.common.f.c r4 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32692dg.m60595a(r8, r4)
            com.google.common.f.x r4 = r4.mo56382g(r0)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            r5 = r2
            com.google.android.libraries.search.assistant.f.a.d.ar r5 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar) r5
            java.lang.String r8 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32602g.m60429b(r5)
            com.google.android.libraries.search.assistant.f.a.d.ag r9 = r1.f87741c
            int r9 = r9.f87961c
            com.google.android.libraries.search.assistant.f.a.d.q r9 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32871q.m60836a(r9)
            if (r9 != 0) goto L_0x00d0
            com.google.android.libraries.search.assistant.f.a.d.q r9 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32871q.UNRECOGNIZED
        L_0x00d0:
            java.lang.String r9 = r9.name()
            boolean r6 = kotlinx.coroutines.C71423ax.m104199d(r6)
            r3 = r3 ^ r6
            if (r0 != 0) goto L_0x00de
            com.google.android.libraries.search.assistant.f.a.b.cz r0 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32684cz.SUCCESS
            goto L_0x00f3
        L_0x00de:
            boolean r6 = r0 instanceof kotlinx.coroutines.C71688dx
            if (r6 == 0) goto L_0x00e5
            com.google.android.libraries.search.assistant.f.a.b.cz r0 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32684cz.TIMEOUT
            goto L_0x00f3
        L_0x00e5:
            boolean r0 = r0 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L_0x00f1
            if (r3 == 0) goto L_0x00ee
            com.google.android.libraries.search.assistant.f.a.b.cz r0 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32684cz.CANCELLED_BY_CALLER
            goto L_0x00f3
        L_0x00ee:
            com.google.android.libraries.search.assistant.f.a.b.cz r0 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32684cz.CANCELLED_BY_CALLEE
            goto L_0x00f3
        L_0x00f1:
            com.google.android.libraries.search.assistant.f.a.b.cz r0 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32684cz.FAILURE
        L_0x00f3:
            com.google.common.f.n r3 = new com.google.common.f.n
            r6 = 50605(0xc5ad, float:7.0913E-41)
            r3.<init>(r6)
            r4.mo56379ah(r3)
            java.lang.String r3 = "GetContext(%s, %s): Fetch from provider finished with status: %s"
            r4.mo56359L(r3, r8, r9, r0)
            java.util.List r11 = r1.f87742d
            java.lang.Throwable r15 = p5462h.C69702k.m101124a(r7)
            if (r15 != 0) goto L_0x010c
            return r7
        L_0x010c:
            java.lang.String r0 = "tags"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r0)
            java.lang.String r0 = "key"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r0)
            com.google.android.libraries.search.assistant.f.a.b.ce r0 = new com.google.android.libraries.search.assistant.f.a.b.ce
            io.grpc.Status r12 = p5488io.grpc.Status.f186915m
            java.lang.String r2 = "INTERNAL"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r2)
            com.google.protos.j.a.a.b.a.a.a.a.a.b r13 = com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5114a.p5115a.p5116a.C65570b.ERROR_FETCH_CALLBACK_FAILED
            java.lang.String r2 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32602g.m60429b(r5)
            java.lang.String r3 = r15.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Fetch callback failed for context key: "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = " (cause: "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = ")"
            r4.append(r2)
            java.lang.String r14 = r4.toString()
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32731es.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C32731es esVar = new C32731es(this.f87741c, this.f87742d, this.f87743e, gVar);
        esVar.f87744f = obj;
        return esVar;
    }
}
